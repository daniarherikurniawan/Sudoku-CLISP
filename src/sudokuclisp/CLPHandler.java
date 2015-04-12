package sudokuclisp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JOptionPane;

import jess.Fact;
import jess.JessException;
import jess.Rete;

public class CLPHandler {
	
	public static int RandomRow;
	public static int RandomColumn;
	public static String RandomValue;
    public Rete Motor = new Rete();
    String NamaFile = new String("Grid2x3.clp");
    Boolean[][] Contained = new Boolean[7][7];
	public CLPHandler(){
		
	}
	
	public void start(){
		InitializeBoolean();
		try {
			GenerateFileCLP();
			Motor.batch("sudoku.clp");
			Motor.batch("solve.clp");
			//Motor.batch("output.clp");
			Motor.batch(NamaFile);
			Motor.reset();
			Motor.run();
			ExtractFactSolution();
			if(NumberOfEmpty()!=0){
	        	SearchEmpty();
	        	int i , j ;
	        }
			
		} catch (JessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void InitializeBoolean(){
		for (int i = 0 ; i < 7; i ++){
			for(int j = 0 ; j < 7 ; j++){
				Contained[i][j] = false;
			}
		}
	}
	
	public int NumberOfFacts(){
		Fact 	fact;
		Iterator it = Motor.listFacts();
		int jumlah = 0;
		while(it.hasNext()){
			fact = (Fact) it.next();
			jumlah ++;
		}
		return jumlah;
		
	}
	
	public void ExtractFactSolution(){
		Fact 	fact;
		Iterator it = Motor.listFacts();
		while(it.hasNext()){
			fact = (Fact) it.next();
			if(fact.getName().compareTo("MAIN::possible")==0){
				try {
					//System.out.println(fact.getName()+" "+fact.toString()+" "+ fact.getSlotValue("row").toString());
					int row = Integer.parseInt(fact.getSlotValue("row").toString());
					int column = Integer.parseInt(fact.getSlotValue("column").toString());
					
					if (!Contained[row][column] ){
						SudokuPanel.Value[row][column]=fact.getSlotValue("value").toString();
					}else{
						SudokuPanel.Value[row][column]="";
					}
					Contained[row][column] = true;
				} catch (JessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}	
			//System.out.println(fact.toString());
		}
		
	}
	
	public void PrintFacts(){
		Fact 	fact;
		Iterator it = Motor.listFacts();
		System.out.println("Fakta yang di simpan :");
		while(it.hasNext()){
			fact = (Fact) it.next();
			System.out.print(fact.getFactId()+" ");
			System.out.println(fact.toString());
		}
	}
	
	public void AssertColumnFacts(){
		try{
			for (int i = 1 ; i <=6 ; i ++){
				for(int j = 1 ; j <= 6 ; j++){
					if (!SudokuPanel.Value[i][j].isEmpty()){
						Motor.assertString(" (index (baris "+i+") (kolom "+j+") (value "+SudokuPanel.Value[i][j]+") (number 1) (sum "+(i+j)+") (valid TRUE))");
					}else{
						Motor.assertString(" (index (baris "+i+") (kolom "+j+") (value 1) (sum "+(i+j)+") (number 6) (valid FALSE))");
						Motor.assertString(" (index (baris "+i+") (kolom "+j+") (value 2) (sum "+(i+j)+") (number 6) (valid FALSE))");
						Motor.assertString(" (index (baris "+i+") (kolom "+j+") (value 3) (sum "+(i+j)+") (number 6)(valid FALSE))");
						Motor.assertString(" (index (baris "+i+") (kolom "+j+") (value 4) (sum "+(i+j)+") (number 6) (valid FALSE))");
						Motor.assertString(" (index (baris "+i+") (kolom "+j+") (value 5) (sum "+(i+j)+") (number 6) (valid FALSE))");
						Motor.assertString(" (index (baris "+i+") (kolom "+j+") (value 6) (sum "+(i+j)+") (number 6) (valid FALSE))");
					}
					Fact ff;
					
				}
			}
		} catch (JessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void SearchEmpty(){
		boolean found = false;
		int i = 1, j = 1;
		//SudokuPanel.PrintValue();
		while (i < 7 && !found){
			j = 1;
			while(j<7 && !found){
				if(SudokuPanel.Value[i][j].compareTo("")==0){
					RandomRow = i;
					RandomColumn = j ;
					found = true;
				}else{
					j++;
				}
			}
			if(!found)
				i++;
		}	
		
		// memasukkan value possible
		
		found = false;
		Fact 	fact;
		Iterator it = Motor.listFacts();
		while(it.hasNext()&& !found){
			fact = (Fact) it.next();
			if(fact.getName().compareTo("MAIN::possible")==0){
				try {
					//System.out.println(fact.getName()+" "+fact.toString()+" "+ fact.getSlotValue("row").toString());
					int row = Integer.parseInt(fact.getSlotValue("row").toString());
					int column = Integer.parseInt(fact.getSlotValue("column").toString());
					
					if (row==RandomRow && column==RandomColumn ){
						SudokuPanel.Value[row][column]=fact.getSlotValue("value").toString();
						found = true;
					}
				} catch (JessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}	
			//System.out.println(fact.toString());
		}
	}
	
	public static int NumberOfEmpty(){
		int Number = 0;
		for (int i = 1 ; i < 7; i ++){
			for(int j = 1 ; j < 7 ; j++){
				if(SudokuPanel.Value[i][j].compareTo("")==0){
					Number++;
				}
			}
		}
		return Number;
	}
	
    private void GenerateFileCLP(){
        try {
            File file= new File(NamaFile);
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            // header
            bw.write("(defrule grid-values\n" +
                        "\n" +
                        "   ?f <- (phase grid-values)\n" +
                        "\n" +
                        "   =>\n" +
                        "   \n" +
                        "   (retract ?f)\n" +
                        "   \n" +
                        "   (assert (phase expand-any))"+
                        "   (assert (size 3))\n\n");
            
            //content
            int grup = 1;
            int id  = 1;
            for(int a = 1 ; a <= 6 ; a ++){
                int i1,i2;
                if(grup<=2){
                    i1=1; i2=2;
                }else if (grup <=4){
                    i1=3; i2=4;
                }else{
                    i1=5; i2=6;
                }
                
                for (int i = i1 ; i <= i2 ;  i ++){
                    int j1,j2;
                    if(grup%2==1){
                        j1=1; j2=3;
                    }else{
                        j1=4; j2=6;
                    }
                    
                    for (int j = j1 ; j<=j2; j++){
                        String value;
                        if(SudokuPanel.Value[i][j].isEmpty())
                            value = "any";
                        else
                            value = SudokuPanel.Value[i][j];
                        if((i + j) == 7)
                        	bw.write("   (assert (possible (row "+i+") (column "+j+") (value "+value+") (group "+grup+") (id "+id+") (diagonal 2)))\n");
                        else if(i == j)
                        	bw.write("   (assert (possible (row "+i+") (column "+j+") (value "+value+") (group "+grup+") (id "+id+") (diagonal 1)))\n");
                        else
                        	bw.write("   (assert (possible (row "+i+") (column "+j+") (value "+value+") (group "+grup+") (id "+id+") (diagonal 0)))\n");
                        
                        id++;
                    }
                }
                grup++;
                bw.write("\n");
            }
               bw.write(")");
            
            bw.close();
        } catch (IOException ex) {
            System.out.println("Maaf! Generator file clp gagal");
        }
    }
    
	
}
