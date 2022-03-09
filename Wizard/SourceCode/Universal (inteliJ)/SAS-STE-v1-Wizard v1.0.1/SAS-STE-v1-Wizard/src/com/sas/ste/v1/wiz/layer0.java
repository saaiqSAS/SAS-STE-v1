package com.sas.ste.v1.wiz;

import com.sas.ste.v1.wiz.keys;
import java.util.Random;


class layer0 {

private static char[] charSet;
private static boolean charSetCheck;
private static char[] processChar;
private static String processString = "";
private static String layer0p1out = "";
protected static String layer0out = "";

	protected static void encryptL0() {
	  layer0out = "";
	  layer0p1out = "";
	  getCharSet();
	  getEncryptProcessCharString();
	  encryptKey();
}

	protected static void decryptL0() {
	  layer0out = "";
	  layer0p1out = "";
	  getCharSet();
	  getDecryptProcessCharString();
	  decryptKey();
}


	private static void getCharSet(){
	
	  if (charSetCheck == false) {
	    charSet = keys.charSet;
	    charSetCheck = true;
	  } 
}

	private static void getEncryptProcessCharString() {
	  processChar = keys.processChar;
	  processString = keys.processString;
}

	private static void getDecryptProcessCharString() {
	  processChar = keys.layer1out.toCharArray();
	  processString = keys.layer1out;
}



	private static void encryptKey() {
	
	  Random rand = new Random(); 
	  
	  int pCharLength = (processString.length()*2)-1;
	  
	  int pChar = 0;
	  
while (layer0p1out.length() <= pCharLength)   
{
 
      layer0p1out += charSet[rand.nextInt(96)];
      layer0p1out += processChar[pChar];
      
      pChar++;
      }

      
      char[] layer0p1outChar = layer0p1out.toCharArray();
      int rev = layer0p1out.length()-1;
       
while (layer0out.length() < layer0p1out.length()) {

      layer0out += layer0p1outChar[rev];
      rev -= 1;
      }   
      
}

	private static void decryptKey() {
	  
	  int pCharLength = processString.length();
	  int rev = processString.length() - 1; 
	  
	 while (layer0p1out.length() < pCharLength) {
	   layer0p1out += processChar[rev];
	   rev -= 1;
     }
     
     
     int extrct = 1;
     int outLength = layer0p1out.length()/2;
     char[] layer0p1outChar = layer0p1out.toCharArray();
     
     while (layer0out.length() < outLength){
       
       layer0out += layer0p1outChar[extrct];
       extrct += 2;
     }
}

}
