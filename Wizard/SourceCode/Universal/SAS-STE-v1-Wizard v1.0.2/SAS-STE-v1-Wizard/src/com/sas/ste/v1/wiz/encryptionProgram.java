package com.sas.ste.v1.wiz;

import com.sas.ste.v1.wiz.keys;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

class encryptionProgram {

protected static String processString = "";
private static String staticInputType = "";
private static String staticFunctionType = "";
private static String staticOutputType = "";
private static String inputFilePath = "";
private static Scanner scannedFile;
private static String saveFilePath = "";
private static boolean fileHasNextLine;
private static String finalResult;

protected static char[] charSet = {' ','!','\"','#','$','%','&','\'','(',')','*','+',',','-','.','/','0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?','@','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','[','\\',']','^','_','`','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','{','|','}','~','£','€'}; //97chars


	protected static void start() throws FileNotFoundException {
	  masterControl();
	}

	private static void masterControl() throws FileNotFoundException {

		encryptionProgram();

		switch (staticInputType) {
			case "1":
				//code
				break;
			case "2":

				fileHasNextLine = scannedFile.hasNextLine();

				while (fileHasNextLine == true) {
					encryptionProgram();
					fileHasNextLine = scannedFile.hasNextLine();
				}
				break;
			default:
				System.out.println("Error at MC");
		}
		System.out.println("\n[+]Finished");
	}

	private static void encryptionProgram() throws FileNotFoundException {

		if (staticInputType == "") {
			askInputType();
		}
		switch (staticInputType) {
			case "1":
				getText();
				break;
			case "2":
				if (inputFilePath == "") {
					getFile();
				}
				getNextLine();
				break;
			default:
				System.out.println("Error at EP-AIT");
		}


		if (staticFunctionType == "") {
			askFunctionType();
		}
		switch (staticFunctionType) {
			case "1":
				keys.encrypt();
				break;
			case "2":
				keys.decrypt();
				break;
			case "3":
				backFromFunction();
				break;
			case "4":
				quit();
				break;
			default:
				System.out.println("Error at EP-AFT");
		}

		getFinalResult();

		if (staticOutputType == "") {
			askOutputType();
		}
		switch (staticOutputType) {
			case "1":
				System.out.println(finalResult);
				break;
			case "2":
				saveToFile();
				break;
			case "3":
				askFunctionType();
				askOutputType();
				break;
			case "4":
				quit();
				break;
			default:
				System.out.println("Error at EP-AOT");
		}



	}


	private static void askInputType() throws FileNotFoundException {
	  Scanner grab = new Scanner(System.in);
	  
	  System.out.println("Select an input method (select from [1]-[3]) \n [1]text \n [2]txt file \n\n [3]Quit");
	  String inputType = grab.next();
	  System.out.println("");
	  
	  switch(inputType) {
	    case "1":
	     staticInputType = "1";
	     break;
	    case "2":
	     staticInputType = "2";
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
	  System.out.println("");
	  
	  switch(functionType) {
	    case "1":
			staticFunctionType = "1";
	     break;
	    case "2":
			staticFunctionType = "2";
	     break;
	    case "3":
			staticFunctionType = "3";
	     break;
	    case "4":
			staticFunctionType = "4";
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
		 System.out.println("");
	  
	  processString = text;
	}

	private static void getFile() throws FileNotFoundException {
		 Scanner grab = new Scanner(System.in);

		  System.out.println("Give the input file path. Start from root directory,(eg:D:\\\\Test\\\\file.txt): ");
	 try {
		 inputFilePath = grab.next();
		 System.out.println("");

		 File file = new File(inputFilePath);

		  scannedFile = new Scanner(file);

	 } catch (Exception e) {
		   System.out.println("Error!! File not found");
		   getFile();
	 }
	}

	private static void getNextLine() throws FileNotFoundException {
	
	 fileHasNextLine = scannedFile.hasNextLine();
	
	 if (fileHasNextLine == true) {
	  processString = scannedFile.nextLine();
	 }
	}


	private static void getFinalResult() throws FileNotFoundException {
	  finalResult = keys.result;
	}


	private static void askOutputType() throws FileNotFoundException {
	   Scanner grab = new Scanner(System.in);

	   System.out.println("Select an output method (select from [1]-[4]) \n [1]Print output \n [2]Save to file \n\n [3]Back \n [4]Quit");

	   String outputType = grab.next();
		System.out.println("");

	   switch (outputType) {
		 case "1":
		  staticOutputType = "1";
		  break;
		 case "2":
		  staticOutputType = "2";
		  break;
		 case "3":
		  staticOutputType = "3";
		  break;
		 case "4":
		  staticOutputType = "4";
		  break;
		 default:
		  System.out.println("\nError!! Pls select a number from the given range");
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
	
	  System.out.println("Enter a path to saving file. Start from root directory,(eg:D:\\\\Test\\\\file.txt):");
	  String filePath = grab.next();
	  System.out.println("");
	  saveFilePath = filePath;
	  File file = new File(filePath);
	
	  if (file.exists() == false) {
	    System.out.println("File doesn't exist!!\nDo you want to create the file \n"+filePath+"?"+"\n [1]Yes \n [2]No");
	    
	    String createFile = grab.next();
		  System.out.println("");

	    switch (createFile) {
	      case "1":
	      System.out.println("[+]Creating File " + filePath);
		  System.out.println("[+]Processing");
	       break;
	      case "2":
	      askSaveFilePath();
	       break;
	      default:
	      System.out.println("Error!! taking \"No\" as your choice!!");
	      askSaveFilePath();       
	    }
	  } else if (file.exists() == true) {
		  System.out.println("Are you sure you want to save to  \n" + filePath + "? (File will not be overridden)" + "\n [1]Yes \n [2]No");

		  String reAsk = grab.next();
		  System.out.println("");

		  switch (reAsk) {
			  case "1":
				  System.out.println("[+]Output will be saved to " + filePath);
				  System.out.println("[+]Processing");
				  break;
			  case "2":
				  askSaveFilePath();
				  break;
			  default:
				  System.out.println("Error!! taking \"No\" as your choice!!");
				  askSaveFilePath();
		  }
	  }
	}

	private static void backFromFunction() throws FileNotFoundException {
		switch (staticInputType) {
			case "1":
				getText();
				askFunctionType();
				break;
			case "2":
				getFile();
				askFunctionType();
				break;
			default:
				//code
		}
	}

	private static void quit() {
	  System.exit(2);
	}


/* backup of Charset
protected static char[] charSet = {' ','!','\"','#','$','%','&','\'','(',')','*','+',',','-','.','/','0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?','@','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','[','\\',']','^','_','`','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','{','|','}','~','£','€'}; //97chars

*/

}
