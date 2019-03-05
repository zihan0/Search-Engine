package org.apache.lucene.demo.my_app;
import java.io.*;
public class docsCran {
	public static void main(String [] args) throws IOException {
		String fileName = "cran/cran.all.1400";
	    String currentline = null;
	    //String bookName =  "book/"+ bookId + ".txt";
	    FileWriter fileWriter = new FileWriter("book/1.txt");
	    BufferedWriter output =  new BufferedWriter(fileWriter); 
	    String flag = null;
	    try {
	    	FileReader fileReader = new FileReader(fileName);//reading
	    	BufferedReader bufferedReader = new BufferedReader(fileReader);//reading
	    	int bookId = 1;
	    	while((currentline = bufferedReader.readLine()) != null) {
	    		   if ( currentline.contains(".I") ) 
	    		   {   
	    			  if(bookId != 1) {
	    				  output.close();
	    				  fileWriter = new FileWriter("book/"+bookId+".txt");
	    				  output =  new BufferedWriter(fileWriter); 
	    			  }
	    			  flag = "book"+bookId;
	    			 
	    			  bookId = bookId +1;
	    			  
	    			  continue;
	    		   }
	    		   else if ( currentline.equals(".T"))
	    		   {
	    			  
	    			   flag = "title";
	    			   
	    			   continue;
	    		   }
	    		   else if ( currentline.equals(".A")){
	    			   
	    			   flag = "author";
	    			   
	    			   //output.write(flag + ":");

	    			   continue;
	    		   }
	    		   else if ( currentline.equals(".B")){
	    			   flag = "Bibliographic";
	    			   continue;
	    		   }
	    		   else if ( currentline.equals(".W")){
	    			   flag = "words";
	    			   output.newLine();
	    			   continue;
	    		   }
	    		   else {
	    			   //if(flag.equals("title")||flag.equals("words")) {
	    			   
	    			   output.write(currentline);
	    			   continue;
	    			 //  }
	    		   }
	    		  
	    		
	    	}
	    	bufferedReader.close();
	    	output.close();
	    }
	    catch(FileNotFoundException es) {
	    	System.out.println("Unable to open file"+fileName+"'");
	    }
	}
	
	}


