package com.sas.ste.wiz;

import com.sas.ste.wiz.process;



class layer1 {

private static char[] processChar;
private static char[] charSet;
protected static String layer1out = "";

	protected static void encryptL1() {
	  layer1out  = "";
	  getEncryptProcessChar();
	  getCharSet();
	  encryptKey();
}

	protected static void decryptL1() {
	  layer1out = "";
	  getDecryptProcessChar();
	  getCharSet();
	  decryptKey();
}

	private static void getEncryptProcessChar() {
	  processChar = process.layer0out.toCharArray();
}

	private static void getDecryptProcessChar() {
	  processChar = process.layer2out.toCharArray();
}

	private static void getCharSet() {
	  charSet = process.charSet;
}

	private static void encryptKey() {
  
	  for(char layer1: processChar) {
	
	         if (layer1 == charSet[0]){
	    layer1out += charSet[86];
	   }else if (layer1 == charSet[1]){
	    layer1out += charSet[14];
	   }else if (layer1 == charSet[2]){
	    layer1out += charSet[56];
	   }else if (layer1 == charSet[3]){
	    layer1out += charSet[79];
	   }else if (layer1 == charSet[4]){
	    layer1out += charSet[8];
	   }else if (layer1 == charSet[5]){
	    layer1out += charSet[87];
	   }else if (layer1 == charSet[6]){
	    layer1out += charSet[27];
	   }else if (layer1 == charSet[7]){
	    layer1out += charSet[15];
	   }else if (layer1 == charSet[8]){
	    layer1out += charSet[96];
	   }else if (layer1 == charSet[9]){
	    layer1out += charSet[59];
	   }else if (layer1 == charSet[10]){
	    layer1out += charSet[76];
	   }else if (layer1 == charSet[11]){
	    layer1out += charSet[12];
	   }else if (layer1 == charSet[12]){
	    layer1out += charSet[94];
	   }else if (layer1 == charSet[13]){
	    layer1out += charSet[33];
	   }else if (layer1 == charSet[14]){
	    layer1out += charSet[50];
	   }else if (layer1 == charSet[15]){
	    layer1out += charSet[9];
	   }else if (layer1 == charSet[16]){
	    layer1out += charSet[95];
	   }else if (layer1 == charSet[17]){
	    layer1out += charSet[48];
	   }else if (layer1 == charSet[18]){
	    layer1out += charSet[71];
	   }else if (layer1 == charSet[19]){
	    layer1out += charSet[84];
	   }else if (layer1 == charSet[20]){
	    layer1out += charSet[34];
	   }else if (layer1 == charSet[21]){
	    layer1out += charSet[85];
	   }else if (layer1 == charSet[22]){
	    layer1out += charSet[90];
	   }else if (layer1 == charSet[23]){
	    layer1out += charSet[26];
	   }else if (layer1 == charSet[24]){
	    layer1out += charSet[92];
	   }else if (layer1 == charSet[25]){
	    layer1out += charSet[4];
	   }else if (layer1 == charSet[26]){
	    layer1out += charSet[64];
	   }else if (layer1 == charSet[27]){
	    layer1out += charSet[23];
	   }else if (layer1 == charSet[28]){
	    layer1out += charSet[55];
	   }else if (layer1 == charSet[29]){
	    layer1out += charSet[82];
	   }else if (layer1 == charSet[30]){
	    layer1out += charSet[28];
	   }else if (layer1 == charSet[31]){
	    layer1out += charSet[66];
	   }else if (layer1 == charSet[32]){
	    layer1out += charSet[1];
	   }else if (layer1 == charSet[33]){
	    layer1out += charSet[38];
	   }else if (layer1 == charSet[34]){
	    layer1out += charSet[47];
	   }else if (layer1 == charSet[35]){
	    layer1out += charSet[22];
	   }else if (layer1 == charSet[36]){
	    layer1out += charSet[78];
	   }else if (layer1 == charSet[37]){
	    layer1out += charSet[45];
	   }else if (layer1 == charSet[38]){
	    layer1out += charSet[29];
	   }else if (layer1 == charSet[39]){
	    layer1out += charSet[52];
	   }else if (layer1 == charSet[40]){
	    layer1out += charSet[74];
	   }else if (layer1 == charSet[41]){
	    layer1out += charSet[89];
	   }else if (layer1 == charSet[42]){
	    layer1out += charSet[20];
	   }else if (layer1 == charSet[43]){
	    layer1out += charSet[70];
	   }else if (layer1 == charSet[44]){
	    layer1out += charSet[91];
	   }else if (layer1 == charSet[45]){
	    layer1out += charSet[62];
	   }else if (layer1 == charSet[46]){
	    layer1out += charSet[5];
	   }else if (layer1 == charSet[47]){
	    layer1out += charSet[37];
	   }else if (layer1 == charSet[48]){
	    layer1out += charSet[88];
	   }else if (layer1 == charSet[49]){
	    layer1out += charSet[2];
	   }else if (layer1 == charSet[50]){
	    layer1out += charSet[65];
	   }else if (layer1 == charSet[51]){
	    layer1out += charSet[39];
	   }else if (layer1 == charSet[52]){
	    layer1out += charSet[16];
	   }else if (layer1 == charSet[53]){
	    layer1out += charSet[57];
	   }else if (layer1 == charSet[54]){
	    layer1out += charSet[6];
	   }else if (layer1 == charSet[55]){
	    layer1out += charSet[53];
	   }else if (layer1 == charSet[56]){
	    layer1out += charSet[19];
	   }else if (layer1 == charSet[57]){
	    layer1out += charSet[67];
	   }else if (layer1 == charSet[58]){
	    layer1out += charSet[10];
	   }else if (layer1 == charSet[59]){
	    layer1out += charSet[73];
	   }else if (layer1 == charSet[60]){
	    layer1out += charSet[17];
	   }else if (layer1 == charSet[61]){
	    layer1out += charSet[43];
	   }else if (layer1 == charSet[62]){
	    layer1out += charSet[30];
	   }else if (layer1 == charSet[63]){
	    layer1out += charSet[77];
	   }else if (layer1 == charSet[64]){
	    layer1out += charSet[31];
	   }else if (layer1 == charSet[65]){
	    layer1out += charSet[93];
	   }else if (layer1 == charSet[66]){
	    layer1out += charSet[72];
	   }else if (layer1 == charSet[67]){
	    layer1out += charSet[63];
	   }else if (layer1 == charSet[68]){
	    layer1out += charSet[24];
	   }else if (layer1 == charSet[69]){
	    layer1out += charSet[35];
	   }else if (layer1 == charSet[70]){
	    layer1out += charSet[7];
	   }else if (layer1 == charSet[71]){
	    layer1out += charSet[40];
	   }else if (layer1 == charSet[72]){
	    layer1out += charSet[80];
	   }else if (layer1 == charSet[73]){
	    layer1out += charSet[3];
	   }else if (layer1 == charSet[74]){
	    layer1out += charSet[58];
	   }else if (layer1 == charSet[75]){
	    layer1out += charSet[32];
	   }else if (layer1 == charSet[76]){
	    layer1out += charSet[60];
	   }else if (layer1 == charSet[77]){
	    layer1out += charSet[11];
	   }else if (layer1 == charSet[78]){
	    layer1out += charSet[69];
	   }else if (layer1 == charSet[79]){
	    layer1out += charSet[42];
	   }else if (layer1 == charSet[80]){
	    layer1out += charSet[68];
	   }else if (layer1 == charSet[81]){
	    layer1out += charSet[46];
	   }else if (layer1 == charSet[82]){
	    layer1out += charSet[18];
	   }else if (layer1 == charSet[83]){
	    layer1out += charSet[75];
	   }else if (layer1 == charSet[84]){
	    layer1out += charSet[44];
	   }else if (layer1 == charSet[85]){
	    layer1out += charSet[51];
	   }else if (layer1 == charSet[86]){
	    layer1out += charSet[54];
	   }else if (layer1 == charSet[87]){
	    layer1out += charSet[49];
	   }else if (layer1 == charSet[88]){
	    layer1out += charSet[83];
	   }else if (layer1 == charSet[89]){
	    layer1out += charSet[25];
	   }else if (layer1 == charSet[90]){
	    layer1out += charSet[36];
	   }else if (layer1 == charSet[91]){
	    layer1out += charSet[61];
	   }else if (layer1 == charSet[92]){
	    layer1out += charSet[13];
	   }else if (layer1 == charSet[93]){
	    layer1out += charSet[41];
	   }else if (layer1 == charSet[94]){
	    layer1out += charSet[21];
	   }else if (layer1 == charSet[95]){
	    layer1out += charSet[81];
	   }else if (layer1 == charSet[96]){
	    layer1out += charSet[0];
	   }
	   
     }
  
}

	private static void decryptKey() {
  
	  for(char layer1: processChar) {
	
	         if (layer1 == charSet[86]){
	    layer1out += charSet[0];
	   }else if (layer1 == charSet[14]){
	    layer1out += charSet[1];
	   }else if (layer1 == charSet[56]){
	    layer1out += charSet[2];
	   }else if (layer1 == charSet[79]){
	    layer1out += charSet[3];
	   }else if (layer1 == charSet[8]){
	    layer1out += charSet[4];
	   }else if (layer1 == charSet[87]){
	    layer1out += charSet[5];
	   }else if (layer1 == charSet[27]){
	    layer1out += charSet[6];
	   }else if (layer1 == charSet[15]){
	    layer1out += charSet[7];
	   }else if (layer1 == charSet[96]){
	    layer1out += charSet[8];
	   }else if (layer1 == charSet[59]){
	    layer1out += charSet[9];
	   }else if (layer1 == charSet[76]){
	    layer1out += charSet[10];
	   }else if (layer1 == charSet[12]){
	    layer1out += charSet[11];
	   }else if (layer1 == charSet[94]){
	    layer1out += charSet[12];
	   }else if (layer1 == charSet[33]){
	    layer1out += charSet[13];
	   }else if (layer1 == charSet[50]){
	    layer1out += charSet[14];
	   }else if (layer1 == charSet[9]){
	    layer1out += charSet[15];
	   }else if (layer1 == charSet[95]){
	    layer1out += charSet[16];
	   }else if (layer1 == charSet[48]){
	    layer1out += charSet[17];
	   }else if (layer1 == charSet[71]){
	    layer1out += charSet[18];
	   }else if (layer1 == charSet[84]){
	    layer1out += charSet[19];
	   }else if (layer1 == charSet[34]){
	    layer1out += charSet[20];
	   }else if (layer1 == charSet[85]){
	    layer1out += charSet[21];
	   }else if (layer1 == charSet[90]){
	    layer1out += charSet[22];
	   }else if (layer1 == charSet[26]){
	    layer1out += charSet[23];
	   }else if (layer1 == charSet[92]){
	    layer1out += charSet[24];
	   }else if (layer1 == charSet[4]){
	    layer1out += charSet[25];
	   }else if (layer1 == charSet[64]){
	    layer1out += charSet[26];
	   }else if (layer1 == charSet[23]){
	    layer1out += charSet[27];
	   }else if (layer1 == charSet[55]){
	    layer1out += charSet[28];
	   }else if (layer1 == charSet[82]){
	    layer1out += charSet[29];
	   }else if (layer1 == charSet[28]){
	    layer1out += charSet[30];
	   }else if (layer1 == charSet[66]){
	    layer1out += charSet[31];
	   }else if (layer1 == charSet[1]){
	    layer1out += charSet[32];
	   }else if (layer1 == charSet[38]){
	    layer1out += charSet[33];
	   }else if (layer1 == charSet[47]){
	    layer1out += charSet[34];
	   }else if (layer1 == charSet[22]){
	    layer1out += charSet[35];
	   }else if (layer1 == charSet[78]){
	    layer1out += charSet[36];
	   }else if (layer1 == charSet[45]){
	    layer1out += charSet[37];
	   }else if (layer1 == charSet[29]){
	    layer1out += charSet[38];
	   }else if (layer1 == charSet[52]){
	    layer1out += charSet[39];
	   }else if (layer1 == charSet[74]){
	    layer1out += charSet[40];
	   }else if (layer1 == charSet[89]){
	    layer1out += charSet[41];
	   }else if (layer1 == charSet[20]){
	    layer1out += charSet[42];
	   }else if (layer1 == charSet[70]){
	    layer1out += charSet[43];
	   }else if (layer1 == charSet[91]){
	    layer1out += charSet[44];
	   }else if (layer1 == charSet[62]){
	    layer1out += charSet[45];
	   }else if (layer1 == charSet[5]){
	    layer1out += charSet[46];
	   }else if (layer1 == charSet[37]){
	    layer1out += charSet[47];
	   }else if (layer1 == charSet[88]){
	    layer1out += charSet[48];
	   }else if (layer1 == charSet[2]){
	    layer1out += charSet[49];
	   }else if (layer1 == charSet[65]){
	    layer1out += charSet[50];
	   }else if (layer1 == charSet[39]){
	    layer1out += charSet[51];
	   }else if (layer1 == charSet[16]){
	    layer1out += charSet[52];
	   }else if (layer1 == charSet[57]){
	    layer1out += charSet[53];
	   }else if (layer1 == charSet[6]){
	    layer1out += charSet[54];
	   }else if (layer1 == charSet[53]){
	    layer1out += charSet[55];
	   }else if (layer1 == charSet[19]){
	    layer1out += charSet[56];
	   }else if (layer1 == charSet[67]){
	    layer1out += charSet[57];
	   }else if (layer1 == charSet[10]){
	    layer1out += charSet[58];
	   }else if (layer1 == charSet[73]){
	    layer1out += charSet[59];
	   }else if (layer1 == charSet[17]){
	    layer1out += charSet[60];
	   }else if (layer1 == charSet[43]){
	    layer1out += charSet[61];
	   }else if (layer1 == charSet[30]){
	    layer1out += charSet[62];
	   }else if (layer1 == charSet[77]){
	    layer1out += charSet[63];
	   }else if (layer1 == charSet[31]){
	    layer1out += charSet[64];
	   }else if (layer1 == charSet[93]){
	    layer1out += charSet[65];
	   }else if (layer1 == charSet[72]){
	    layer1out += charSet[66];
	   }else if (layer1 == charSet[63]){
	    layer1out += charSet[67];
	   }else if (layer1 == charSet[24]){
	    layer1out += charSet[68];
	   }else if (layer1 == charSet[35]){
	    layer1out += charSet[69];
	   }else if (layer1 == charSet[7]){
	    layer1out += charSet[70];
	   }else if (layer1 == charSet[40]){
	    layer1out += charSet[71];
	   }else if (layer1 == charSet[80]){
	    layer1out += charSet[72];
	   }else if (layer1 == charSet[3]){
	    layer1out += charSet[73];
	   }else if (layer1 == charSet[58]){
	    layer1out += charSet[74];
	   }else if (layer1 == charSet[32]){
	    layer1out += charSet[75];
	   }else if (layer1 == charSet[60]){
	    layer1out += charSet[76];
	   }else if (layer1 == charSet[11]){
	    layer1out += charSet[77];
	   }else if (layer1 == charSet[69]){
	    layer1out += charSet[78];
	   }else if (layer1 == charSet[42]){
	    layer1out += charSet[79];
	   }else if (layer1 == charSet[68]){
	    layer1out += charSet[80];
	   }else if (layer1 == charSet[46]){
	    layer1out += charSet[81];
	   }else if (layer1 == charSet[18]){
	    layer1out += charSet[82];
	   }else if (layer1 == charSet[75]){
	    layer1out += charSet[83];
	   }else if (layer1 == charSet[44]){
	    layer1out += charSet[84];
	   }else if (layer1 == charSet[51]){
	    layer1out += charSet[85];
	   }else if (layer1 == charSet[54]){
	    layer1out += charSet[86];
	   }else if (layer1 == charSet[49]){
	    layer1out += charSet[87];
	   }else if (layer1 == charSet[83]){
	    layer1out += charSet[88];
	   }else if (layer1 == charSet[25]){
	    layer1out += charSet[89];
	   }else if (layer1 == charSet[36]){
	    layer1out += charSet[90];
	   }else if (layer1 == charSet[61]){
	    layer1out += charSet[91];
	   }else if (layer1 == charSet[13]){
	    layer1out += charSet[92];
	   }else if (layer1 == charSet[41]){
	    layer1out += charSet[93];
	   }else if (layer1 == charSet[21]){
	    layer1out += charSet[94];
	   }else if (layer1 == charSet[81]){
	    layer1out += charSet[95];
	   }else if (layer1 == charSet[0]){
	    layer1out += charSet[96];
	   }
	   
     }
     
}

}
