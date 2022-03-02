package com.sas.ste;

import com.sas.ste.layer2Main;


class layer2p3 {

private static char[] processChar;
private static char[] charSet;
protected static String layer2p3out = "";

	protected static void encryptL2P3() {
	  layer2p3out = "";
	  getProcessChar();
	  getCharSet();
	  encryptKey();
}

	protected static void decryptL2P3() {
	  layer2p3out = "";
	  getProcessChar();
	  getCharSet();
	  decryptKey();
}
	
	  
	private static void getProcessChar() {
	 processChar = layer2Main.p3ProcessString.toCharArray();
}
	private static void getCharSet() {
	  charSet = layer2Main.charSet;
}


	private static void encryptKey() {
	  
	  for(char layer2p3: processChar) {
	
	         if (layer2p3 == charSet[0]){
	    layer2p3out += charSet[68];
	   }else if (layer2p3 == charSet[1]){
	    layer2p3out += charSet[26];
	   }else if (layer2p3 == charSet[2]){
	    layer2p3out += charSet[35];
	   }else if (layer2p3 == charSet[3]){
	    layer2p3out += charSet[53];
	   }else if (layer2p3 == charSet[4]){
	    layer2p3out += charSet[14];
	   }else if (layer2p3 == charSet[5]){
	    layer2p3out += charSet[49];
	   }else if (layer2p3 == charSet[6]){
	    layer2p3out += charSet[63];
	   }else if (layer2p3 == charSet[7]){
	    layer2p3out += charSet[24];
	   }else if (layer2p3 == charSet[8]){
	    layer2p3out += charSet[66];
	   }else if (layer2p3 == charSet[9]){
	    layer2p3out += charSet[31];
	   }else if (layer2p3 == charSet[10]){
	    layer2p3out += charSet[74];
	   }else if (layer2p3 == charSet[11]){
	    layer2p3out += charSet[56];
	   }else if (layer2p3 == charSet[12]){
	    layer2p3out += charSet[18];
	   }else if (layer2p3 == charSet[13]){
	    layer2p3out += charSet[70];
	   }else if (layer2p3 == charSet[14]){
	    layer2p3out += charSet[39];
	   }else if (layer2p3 == charSet[15]){
	    layer2p3out += charSet[81];
	   }else if (layer2p3 == charSet[16]){
	    layer2p3out += charSet[47];
	   }else if (layer2p3 == charSet[17]){
	    layer2p3out += charSet[2];
	   }else if (layer2p3 == charSet[18]){
	    layer2p3out += charSet[54];
	   }else if (layer2p3 == charSet[19]){
	    layer2p3out += charSet[84];
	   }else if (layer2p3 == charSet[20]){
	    layer2p3out += charSet[25];
	   }else if (layer2p3 == charSet[21]){
	    layer2p3out += charSet[13];
	   }else if (layer2p3 == charSet[22]){
	    layer2p3out += charSet[6];
	   }else if (layer2p3 == charSet[23]){
	    layer2p3out += charSet[17];
	   }else if (layer2p3 == charSet[24]){
	    layer2p3out += charSet[28];
	   }else if (layer2p3 == charSet[25]){
	    layer2p3out += charSet[8];
	   }else if (layer2p3 == charSet[26]){
	    layer2p3out += charSet[42];
	   }else if (layer2p3 == charSet[27]){
	    layer2p3out += charSet[38];
	   }else if (layer2p3 == charSet[28]){
	    layer2p3out += charSet[67];
	   }else if (layer2p3 == charSet[29]){
	    layer2p3out += charSet[10];
	   }else if (layer2p3 == charSet[30]){
	    layer2p3out += charSet[60];
	   }else if (layer2p3 == charSet[31]){
	    layer2p3out += charSet[50];
	   }else if (layer2p3 == charSet[32]){
	    layer2p3out += charSet[30];
	   }else if (layer2p3 == charSet[33]){
	    layer2p3out += charSet[88];
	   }else if (layer2p3 == charSet[34]){
	    layer2p3out += charSet[15];
	   }else if (layer2p3 == charSet[35]){
	    layer2p3out += charSet[86];
	   }else if (layer2p3 == charSet[36]){
	    layer2p3out += charSet[22];
	   }else if (layer2p3 == charSet[37]){
	    layer2p3out += charSet[79];
	   }else if (layer2p3 == charSet[38]){
	    layer2p3out += charSet[36];
	   }else if (layer2p3 == charSet[39]){
	    layer2p3out += charSet[93];
	   }else if (layer2p3 == charSet[40]){
	    layer2p3out += charSet[65];
	   }else if (layer2p3 == charSet[41]){
	    layer2p3out += charSet[4];
	   }else if (layer2p3 == charSet[42]){
	    layer2p3out += charSet[75];
	   }else if (layer2p3 == charSet[43]){
	    layer2p3out += charSet[44];
	   }else if (layer2p3 == charSet[44]){
	    layer2p3out += charSet[21];
	   }else if (layer2p3 == charSet[45]){
	    layer2p3out += charSet[87];
	   }else if (layer2p3 == charSet[46]){
	    layer2p3out += charSet[3];
	   }else if (layer2p3 == charSet[47]){
	    layer2p3out += charSet[46];
	   }else if (layer2p3 == charSet[48]){
	    layer2p3out += charSet[71];
	   }else if (layer2p3 == charSet[49]){
	    layer2p3out += charSet[32];
	   }else if (layer2p3 == charSet[50]){
	    layer2p3out += charSet[78];
	   }else if (layer2p3 == charSet[51]){
	    layer2p3out += charSet[41];
	   }else if (layer2p3 == charSet[52]){
	    layer2p3out += charSet[45];
	   }else if (layer2p3 == charSet[53]){
	    layer2p3out += charSet[69];
	   }else if (layer2p3 == charSet[54]){
	    layer2p3out += charSet[1];
	   }else if (layer2p3 == charSet[55]){
	    layer2p3out += charSet[91];
	   }else if (layer2p3 == charSet[56]){
	    layer2p3out += charSet[23];
	   }else if (layer2p3 == charSet[57]){
	    layer2p3out += charSet[82];
	   }else if (layer2p3 == charSet[58]){
	    layer2p3out += charSet[85];
	   }else if (layer2p3 == charSet[59]){
	    layer2p3out += charSet[7];
	   }else if (layer2p3 == charSet[60]){
	    layer2p3out += charSet[40];
	   }else if (layer2p3 == charSet[61]){
	    layer2p3out += charSet[55];
	   }else if (layer2p3 == charSet[62]){
	    layer2p3out += charSet[19];
	   }else if (layer2p3 == charSet[63]){
	    layer2p3out += charSet[92];
	   }else if (layer2p3 == charSet[64]){
	    layer2p3out += charSet[76];
	   }else if (layer2p3 == charSet[65]){
	    layer2p3out += charSet[80];
	   }else if (layer2p3 == charSet[66]){
	    layer2p3out += charSet[29];
	   }else if (layer2p3 == charSet[67]){
	    layer2p3out += charSet[72];
	   }else if (layer2p3 == charSet[68]){
	    layer2p3out += charSet[33];
	   }else if (layer2p3 == charSet[69]){
	    layer2p3out += charSet[89];
	   }else if (layer2p3 == charSet[70]){
	    layer2p3out += charSet[12];
	   }else if (layer2p3 == charSet[71]){
	    layer2p3out += charSet[62];
	   }else if (layer2p3 == charSet[72]){
	    layer2p3out += charSet[51];
	   }else if (layer2p3 == charSet[73]){
	    layer2p3out += charSet[20];
	   }else if (layer2p3 == charSet[74]){
	    layer2p3out += charSet[27];
	   }else if (layer2p3 == charSet[75]){
	    layer2p3out += charSet[16];
	   }else if (layer2p3 == charSet[76]){
	    layer2p3out += charSet[59];
	   }else if (layer2p3 == charSet[77]){
	    layer2p3out += charSet[57];
	   }else if (layer2p3 == charSet[78]){
	    layer2p3out += charSet[48];
	   }else if (layer2p3 == charSet[79]){
	    layer2p3out += charSet[64];
	   }else if (layer2p3 == charSet[80]){
	    layer2p3out += charSet[90];
	   }else if (layer2p3 == charSet[81]){
	    layer2p3out += charSet[34];
	   }else if (layer2p3 == charSet[82]){
	    layer2p3out += charSet[77];
	   }else if (layer2p3 == charSet[83]){
	    layer2p3out += charSet[61];
	   }else if (layer2p3 == charSet[84]){
	    layer2p3out += charSet[11];
	   }else if (layer2p3 == charSet[85]){
	    layer2p3out += charSet[95];
	   }else if (layer2p3 == charSet[86]){
	    layer2p3out += charSet[83];
	   }else if (layer2p3 == charSet[87]){
	    layer2p3out += charSet[58];
	   }else if (layer2p3 == charSet[88]){
	    layer2p3out += charSet[43];
	   }else if (layer2p3 == charSet[89]){
	    layer2p3out += charSet[0];
	   }else if (layer2p3 == charSet[90]){
	    layer2p3out += charSet[52];
	   }else if (layer2p3 == charSet[91]){
	    layer2p3out += charSet[9];
	   }else if (layer2p3 == charSet[92]){
	    layer2p3out += charSet[37];
	   }else if (layer2p3 == charSet[93]){
	    layer2p3out += charSet[73];
	   }else if (layer2p3 == charSet[94]){
	    layer2p3out += charSet[5];
	   }else if (layer2p3 == charSet[95]){
	    layer2p3out += charSet[96];
	   }else if (layer2p3 == charSet[96]){
	    layer2p3out += charSet[94];
	   }
	   
     }
}
	private static void decryptKey() {
	  
	  for(char layer2p3: processChar) {
	
	         if (layer2p3 == charSet[68]){
	    layer2p3out += charSet[0];
	   }else if (layer2p3 == charSet[26]){
	    layer2p3out += charSet[1];
	   }else if (layer2p3 == charSet[35]){
	    layer2p3out += charSet[2];
	   }else if (layer2p3 == charSet[53]){
	    layer2p3out += charSet[3];
	   }else if (layer2p3 == charSet[14]){
	    layer2p3out += charSet[4];
	   }else if (layer2p3 == charSet[49]){
	    layer2p3out += charSet[5];
	   }else if (layer2p3 == charSet[63]){
	    layer2p3out += charSet[6];
	   }else if (layer2p3 == charSet[24]){
	    layer2p3out += charSet[7];
	   }else if (layer2p3 == charSet[66]){
	    layer2p3out += charSet[8];
	   }else if (layer2p3 == charSet[31]){
	    layer2p3out += charSet[9];
	   }else if (layer2p3 == charSet[74]){
	    layer2p3out += charSet[10];
	   }else if (layer2p3 == charSet[56]){
	    layer2p3out += charSet[11];
	   }else if (layer2p3 == charSet[18]){
	    layer2p3out += charSet[12];
	   }else if (layer2p3 == charSet[70]){
	    layer2p3out += charSet[1];
	   }else if (layer2p3 == charSet[39]){
	    layer2p3out += charSet[14];
	   }else if (layer2p3 == charSet[81]){
	    layer2p3out += charSet[15];
	   }else if (layer2p3 == charSet[47]){
	    layer2p3out += charSet[16];
	   }else if (layer2p3 == charSet[2]){
	    layer2p3out += charSet[17];
	   }else if (layer2p3 == charSet[54]){
	    layer2p3out += charSet[18];
	   }else if (layer2p3 == charSet[84]){
	    layer2p3out += charSet[19];
	   }else if (layer2p3 == charSet[25]){
	    layer2p3out += charSet[20];
	   }else if (layer2p3 == charSet[13]){
	    layer2p3out += charSet[21];
	   }else if (layer2p3 == charSet[6]){
	    layer2p3out += charSet[22];
	   }else if (layer2p3 == charSet[17]){
	    layer2p3out += charSet[23];
	   }else if (layer2p3 == charSet[28]){
	    layer2p3out += charSet[24];
	   }else if (layer2p3 == charSet[8]){
	    layer2p3out += charSet[25];
	   }else if (layer2p3 == charSet[42]){
	    layer2p3out += charSet[26];
	   }else if (layer2p3 == charSet[38]){
	    layer2p3out += charSet[27];
	   }else if (layer2p3 == charSet[67]){
	    layer2p3out += charSet[28];
	   }else if (layer2p3 == charSet[10]){
	    layer2p3out += charSet[29];
	   }else if (layer2p3 == charSet[60]){
	    layer2p3out += charSet[30];
	   }else if (layer2p3 == charSet[50]){
	    layer2p3out += charSet[31];
	   }else if (layer2p3 == charSet[30]){
	    layer2p3out += charSet[32];
	   }else if (layer2p3 == charSet[88]){
	    layer2p3out += charSet[33];
	   }else if (layer2p3 == charSet[15]){
	    layer2p3out += charSet[34];
	   }else if (layer2p3 == charSet[86]){
	    layer2p3out += charSet[35];
	   }else if (layer2p3 == charSet[22]){
	    layer2p3out += charSet[36];
	   }else if (layer2p3 == charSet[79]){
	    layer2p3out += charSet[37];
	   }else if (layer2p3 == charSet[36]){
	    layer2p3out += charSet[38];
	   }else if (layer2p3 == charSet[93]){
	    layer2p3out += charSet[39];
	   }else if (layer2p3 == charSet[65]){
	    layer2p3out += charSet[40];
	   }else if (layer2p3 == charSet[4]){
	    layer2p3out += charSet[41];
	   }else if (layer2p3 == charSet[75]){
	    layer2p3out += charSet[42];
	   }else if (layer2p3 == charSet[44]){
	    layer2p3out += charSet[43];
	   }else if (layer2p3 == charSet[21]){
	    layer2p3out += charSet[44];
	   }else if (layer2p3 == charSet[87]){
	    layer2p3out += charSet[45];
	   }else if (layer2p3 == charSet[3]){
	    layer2p3out += charSet[46];
	   }else if (layer2p3 == charSet[46]){
	    layer2p3out += charSet[47];
	   }else if (layer2p3 == charSet[71]){
	    layer2p3out += charSet[48];
	   }else if (layer2p3 == charSet[32]){
	    layer2p3out += charSet[49];
	   }else if (layer2p3 == charSet[78]){
	    layer2p3out += charSet[50];
	   }else if (layer2p3 == charSet[41]){
	    layer2p3out += charSet[51];
	   }else if (layer2p3 == charSet[45]){
	    layer2p3out += charSet[52];
	   }else if (layer2p3 == charSet[69]){
	    layer2p3out += charSet[53];
	   }else if (layer2p3 == charSet[1]){
	    layer2p3out += charSet[54];
	   }else if (layer2p3 == charSet[91]){
	    layer2p3out += charSet[55];
	   }else if (layer2p3 == charSet[23]){
	    layer2p3out += charSet[56];
	   }else if (layer2p3 == charSet[82]){
	    layer2p3out += charSet[57];
	   }else if (layer2p3 == charSet[85]){
	    layer2p3out += charSet[58];
	   }else if (layer2p3 == charSet[7]){
	    layer2p3out += charSet[59];
	   }else if (layer2p3 == charSet[40]){
	    layer2p3out += charSet[60];
	   }else if (layer2p3 == charSet[55]){
	    layer2p3out += charSet[61];
	   }else if (layer2p3 == charSet[19]){
	    layer2p3out += charSet[62];
	   }else if (layer2p3 == charSet[92]){
	    layer2p3out += charSet[63];
	   }else if (layer2p3 == charSet[76]){
	    layer2p3out += charSet[64];
	   }else if (layer2p3 == charSet[80]){
	    layer2p3out += charSet[65];
	   }else if (layer2p3 == charSet[29]){
	    layer2p3out += charSet[66];
	   }else if (layer2p3 == charSet[72]){
	    layer2p3out += charSet[67];
	   }else if (layer2p3 == charSet[33]){
	    layer2p3out += charSet[68];
	   }else if (layer2p3 == charSet[89]){
	    layer2p3out += charSet[69];
	   }else if (layer2p3 == charSet[12]){
	    layer2p3out += charSet[70];
	   }else if (layer2p3 == charSet[62]){
	    layer2p3out += charSet[71];
	   }else if (layer2p3 == charSet[51]){
	    layer2p3out += charSet[72];
	   }else if (layer2p3 == charSet[20]){
	    layer2p3out += charSet[73];
	   }else if (layer2p3 == charSet[27]){
	    layer2p3out += charSet[74];
	   }else if (layer2p3 == charSet[16]){
	    layer2p3out += charSet[75];
	   }else if (layer2p3 == charSet[59]){
	    layer2p3out += charSet[76];
	   }else if (layer2p3 == charSet[57]){
	    layer2p3out += charSet[77];
	   }else if (layer2p3 == charSet[48]){
	    layer2p3out += charSet[78];
	   }else if (layer2p3 == charSet[64]){
	    layer2p3out += charSet[79];
	   }else if (layer2p3 == charSet[90]){
	    layer2p3out += charSet[80];
	   }else if (layer2p3 == charSet[34]){
	    layer2p3out += charSet[81];
	   }else if (layer2p3 == charSet[77]){
	    layer2p3out += charSet[82];
	   }else if (layer2p3 == charSet[61]){
	    layer2p3out += charSet[83];
	   }else if (layer2p3 == charSet[11]){
	    layer2p3out += charSet[84];
	   }else if (layer2p3 == charSet[95]){
	    layer2p3out += charSet[85];
	   }else if (layer2p3 == charSet[83]){
	    layer2p3out += charSet[86];
	   }else if (layer2p3 == charSet[58]){
	    layer2p3out += charSet[87];
	   }else if (layer2p3 == charSet[43]){
	    layer2p3out += charSet[88];
	   }else if (layer2p3 == charSet[0]){
	    layer2p3out += charSet[89];
	   }else if (layer2p3 == charSet[52]){
	    layer2p3out += charSet[90];
	   }else if (layer2p3 == charSet[9]){
	    layer2p3out += charSet[91];
	   }else if (layer2p3 == charSet[37]){
	    layer2p3out += charSet[92];
	   }else if (layer2p3 == charSet[73]){
	    layer2p3out += charSet[93];
	   }else if (layer2p3 == charSet[5]){
	    layer2p3out += charSet[94];
	   }else if (layer2p3 == charSet[96]){
	    layer2p3out += charSet[95];
	   }else if (layer2p3 == charSet[94]){
	    layer2p3out += charSet[96];
	   }
	   
     }
}


}
