package com.sas.ste;

import com.sas.ste.keys;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

class encryptionProgram {

protected static String processString = "";
private static String staticInputType = "";
private static String staticFunctionType = "";
private static String staticOutputType = "";
private static Scanner scannedFile;
private static String saveFilePath = "";
private static boolean fileHasNextLine;
private static String finalResult;

protected static char[] charSet = {' ','!','\"','#','$','%','&','\'','(',')','*','+',',','-','.','/','0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?','@','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','[','\\',']','^','_','`','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','{','|','}','~','£','€'}; //97chars


	protected static void encryptionProgram() throws FileNotFoundException {
	  askInputType();
}


	private static void askInputType() throws FileNotFoundException {
	  Scanner grab = new Scanner(System.in);
	  
	  System.out.println("Select an input type (select from [1]-[3]) \n [1]text \n [2]txt file \n\n [3]Quit");
	  String inputType = grab.next();
	  //grab.close();
	  
	  switch(inputType) {
	    case "1":
	     staticInputType = "1";
	     getText();
	     break;
	    case "2":
	     staticInputType = "2";
	     getFile();
	     break;
	    case "3":
	     quit();
	     break;
	    default:
	     System.out.println("Error!! Pls select a number from the given range");
	     askInputType();
	  }
	  
}

	private static void askFunctionType() throws FileNotFoundException {
	 Scanner grab = new Scanner(System.in);
	
	  System.out.println("Select a function (select from [1]-[4]) \n [1]Encrypt \n [2]Decrypt \n\n [3]Back \n [4]Quit");
	  String functionType = grab.next();
	  //grab.close();
	  
	  switch(functionType) {
	    case "1":
	     staticFunctionType = "1";
	     keys.encrypt();
	     break;
	    case "2":
	      staticFunctionType = "2";
	     keys.decrypt();
	     break;
	    case "3":
	     back();
	     break;
	    case "4":
	     quit();
	     break;
	    default:
	     System.out.println("Error!! Pls select a number from the given range");
	     askFunctionType();   
	  }
	  
}

	private static void getText() throws FileNotFoundException {
	 Scanner grab = new Scanner(System.in);

		 System.out.println("Enter your text: ");
		 String text = grab.next();
		 text += grab.nextLine();
		 //grab.close();
	  
	  processString = text;
	  askFunctionType(); 
}

	private static void getFile() throws FileNotFoundException {
	 Scanner grab = new Scanner(System.in);
	
	  System.out.println("Give the file path. Start from root directory,(eg:D:\\Test\\file.txt): ");
 try {
	 String strFilePath = grab.next();
	 //grab.close();
	 File file = new File(strFilePath);
	 
	  scannedFile = new Scanner(file);
	  
 } catch (Exception e) {
	   System.out.println("Error!! File not found");
	   getFile();
 }
	  
	  getFileLoop();
	
}

	private static void getFileLoop() throws FileNotFoundException {
	
	 fileHasNextLine = scannedFile.hasNextLine();
	
	 if (fileHasNextLine == true) {
	 
	  processString = scannedFile.nextLine();
	  
	  switch (staticFunctionType) {
	   case "1":
	    keys.encrypt();
	    break;
	   case "2":
	    keys.decrypt();
	    break;
	   default:
	    askFunctionType();
      }
	  
	 } else if (fileHasNextLine == false) {
	    endProgramProcess();
     }
	  
}

	private static void back() throws FileNotFoundException {
	  switch (staticInputType) {
	   case "1":
	    getText();
	    break;
	   case "2":
	    getFile();
	    break;
	   default:
	    //code    
      }
}


	protected static void goToGetFinalResult() throws FileNotFoundException {
	  getFinalResult();
}
	private static void getFinalResult() throws FileNotFoundException {
	  finalResult = keys.result;
	  output();
}

private static void output() throws FileNotFoundException {
  
  switch (staticOutputType) {
    case "1":
     System.out.println(finalResult);
     break;
    case "2":
     saveToFile();
     break;
    default:
    askOutputType();
  }
  endProgramProcess();
}

 private static void askOutputType() throws FileNotFoundException {
   Scanner grab = new Scanner(System.in);
   
   System.out.println("Select an output type (select from [1]-[4]) \n [1]Print output \n [2]Save to file \n\n [3]Back \n [4]Quit");
   
   String outputType = grab.next();
   //grab.close();
   
   switch (outputType) {
     case "1":
      staticOutputType = "1";
      System.out.println(finalResult);
      break;
     case "2":
      staticOutputType = "2";
      saveToFile();
      break;
     case "3":
      askFunctionType();
      break;
     case "4":
     quit();
      break;
     default:
      System.out.println("Error!! Pls select a number from the given range");
      askOutputType();
     
   }
   
 }
 
 
	private static void saveToFile() throws FileNotFoundException {
	
	  if (saveFilePath == "") {
	    askSaveFilePath();
	  }
	try{ 
	  FileWriter wfile = new FileWriter(saveFilePath, true);
	  
	  wfile.write(finalResult + "\n");
	  wfile.close();
	}catch(Exception e){};
	 
}
 
	private static void askSaveFilePath() throws FileNotFoundException {
	
	  Scanner grab = new Scanner(System.in);
	
	  System.out.println("Enter a path to file:");
	  String filePath = grab.next();
	  saveFilePath = filePath;
	  File file = new File(filePath);
	
	  if (file.exists() == false) {
	    System.out.println("file doesn't exist!!\nDo you want to create the file? \n"+filePath+"\n [1]Yes \n [2]No");
	    
	    String createFile = grab.next();
	    switch (createFile) {
	      case "1":
	      System.out.println("Creating File");
	       break;
	      case "2":
	      askSaveFilePath();
	       break;
	      default:
	      System.out.println("Error!! taking \"No\" as your choice!!");
	      askSaveFilePath();       
	    }
	    //grab.close();
	  }   
}

	private static void quit() {
	  System.exit(2);
}

	private static void endProgramProcess() throws FileNotFoundException {
	
	  switch (staticInputType) {
	   case "1":
	    System.out.println("\nFinished!!");
	    break;
	   case "2":
	    
	    fileHasNextLine = scannedFile.hasNextLine();
	    
	    if (fileHasNextLine == true) {
	     getFileLoop(); 
		}else if (fileHasNextLine == false) {
		  System.out.println("\nFinished!!");
		};
	    break;
	   default:
	    //Code
      }
}

/* backup of Charset
protected static char[] charSet = {' ','!','\"','#','$','%','&','\'','(',')','*','+',',','-','.','/','0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?','@','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','[','\\',']','^','_','`','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','{','|','}','~','£','€'}; //97chars

*/

}
