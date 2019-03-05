package org.apache.lucene.demo.my_app;
import java.io.*;
import java.nio.CharBuffer;
public class qry {
	public static void main(String [] args) throws IOException {
		String fileName = "cran/cran.qry";
	    String currentline = null;
	    FileWriter fileWriter = new FileWriter("cran/cran_sep.qry");
	    BufferedWriter output =  new BufferedWriter(fileWriter); 
	    int init = 1;
	    try {
	    	FileReader fileReader = new FileReader(fileName);//reading
	    	BufferedReader bufferedReader = new BufferedReader(fileReader);//reading
	    	
	    	while((currentline = bufferedReader.readLine()) != null) {
	    		   if ( currentline.contains(".I") ) 
	    		   {  if (init ==1 ) {
	    			   init = init +1;
	    			   continue;
	    			   }
	    		   		output.newLine();
	    		   }
	    		   else if ( currentline.equals(".W")){
	    			   //output.newLine();
	    			   continue;
	    		   }
	    		   else if (currentline.contains("?")||currentline.contains("*")||currentline.contains("(")||currentline.contains(")")) {
	    			   String str = currentline;
	    			   str = str.replaceAll("\\*", " ");
	    			   str = str.replaceAll("\\?", " ");
	    			   str = str.replaceAll("\\(", " ");
	    			   str = str.replaceAll("\\)", " ");
	    			   output.write(str);
	    			   
	    		   }
	    		   else {
	    			   
	    			   output.write(currentline);
	    			   output.write(" ");
	    			   continue;
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


