package com.sas.ste.v1.wiz;

import com.sas.ste.v1.wiz.keys;
import com.sas.ste.v1.wiz.layer2p1;
import com.sas.ste.v1.wiz.layer2p2;
import com.sas.ste.v1.wiz.layer2p3;


class layer2Main {

private static char[] processChar;
private static String processString;
protected static char[] charSet;

protected static String p1ProcessString = "";
private static char[] p1Out;
protected static String p2ProcessString = "";
private static char[] p2Out;
protected static String p3ProcessString = "";
private static char[] p3Out;

protected static String layer2out = "";


	protected static void encryptL2() {
	  getEncryptProcessChar();
	  getEncryptProcessString();
	  getCharSet();
	  distributeChars(); 
	  encryptProcess();
}

	protected static void decryptL2() {
	  getDecryptProcessChar();
	  getDecryptProcessString();
	  getCharSet();
	  distributeChars();
	  decryptProcess();
}

	private static void getCharSet() {
	  charSet = keys.charSet; 
}

	private static void getEncryptProcessChar() {
	  processChar = keys.layer1out.toCharArray();
}

	private static void getDecryptProcessChar() {
	  processChar = keys.processChar;
}

	private static void getEncryptProcessString() {
	  processString = keys.layer1out;
}

	private static void getDecryptProcessString() {
	  processString = keys.processString;
}


	private static void distributeChars() {
	  int ones = 0;
	  int twos = 1;
	  int threes = 2;
	  int length = processString.length();
	  p1ProcessString = "";
	  p2ProcessString = "";
	  p3ProcessString = "";
	  
	  try{
	  while (ones <= length) {
	   p1ProcessString += processChar[ones];
	   ones += 3;
	  }
	  }catch (Exception e){}
	  
	  try{
	  while (twos <= length) {
	   p2ProcessString += processChar[twos];
	   twos += 3; 
	  }
	  }catch (Exception e){}
	  
	  try{
	  while (threes <= length) {
	   p3ProcessString += processChar[threes];
	   threes += 3; 
	  }
	  }catch (Exception e){}
	 
}

	private static void compile() {
	
	 layer2out = "";
	 int num = 0;
	 int lengthIn = processString.length();
	 int lengthOut = layer2out.length();
	 
	 try{
	 while (lengthIn >= lengthOut) {
	     
	   layer2out += p1Out[num];
	   layer2out += p2Out[num];
	   layer2out += p3Out[num];
	   num++;
	}
	}catch (Exception e){}
}


	private static void encryptProcess() { 
	
	  layer2p1.encryptL2P1();
	  p1Out = layer2p1.layer2p1out.toCharArray() ;
	
	  layer2p2.encryptL2P2();
	  p2Out = layer2p2.layer2p2out.toCharArray() ;
	
	  layer2p3.encryptL2P3();
	  p3Out = layer2p3.layer2p3out.toCharArray();
	
	compile();
	
}

	private static void decryptProcess() {
	  
	  layer2p1.decryptL2P1();
	  p1Out = layer2p1.layer2p1out.toCharArray() ;
	  
	  layer2p2.decryptL2P2();
	  p2Out = layer2p2.layer2p2out.toCharArray() ;
	  
	  layer2p3.decryptL2P3();
	  p3Out = layer2p3.layer2p3out.toCharArray() ;
	  
	 compile();
	 
}

}
