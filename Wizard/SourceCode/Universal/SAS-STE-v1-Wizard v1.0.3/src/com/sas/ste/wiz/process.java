package com.sas.ste.wiz;

import com.sas.ste.wiz.encryptionProgram;
import com.sas.ste.wiz.layer0;
import com.sas.ste.wiz.layer1;
import com.sas.ste.wiz.layer2Main;

import java.io.FileNotFoundException;

class process {

    protected static String result = "";
    protected static char[] processChar;
    protected static char[] charSet;
    protected static String processString = "";

    protected static void encrypt() throws FileNotFoundException {
        getProcessChar();
        getProcessString();
        getCharSet();
        encryptProcess();
    }
    protected static void decrypt() throws FileNotFoundException {
        getProcessChar();
        getProcessString();
        getCharSet();
        decryptProcess();
    }

    private static void getProcessChar() {
        processChar = encryptionProgram.processString.toCharArray();
    }

    private static void getProcessString() {
        processString = encryptionProgram.processString;
    }

    private static void getCharSet() {
        charSet = encryptionProgram.charSet;
    }


    protected static String layer0out = "";
    protected static String layer1out = "";
    protected static String layer2out = "";
    protected static String layer3out = "";

    private static void encryptProcess() throws FileNotFoundException {


        layer0.encryptL0();
        layer0out = layer0.layer0out;


        layer1.encryptL1();
        layer1out = layer1.layer1out;

        layer2Main.encryptL2();
        layer2out = layer2Main.layer2out;

        //System.out.println("layer0out: "+layer0out);//test
        //System.out.print("layer1out: "+ layer1out+"\n"); //test
        //System.out.println("layer2out: "+layer2out+"\n\n");//test

        result = layer2out;
    }


    private static void decryptProcess() throws FileNotFoundException {

        layer2Main.decryptL2();
        layer2out = layer2Main.layer2out;

        layer1.decryptL1();
        layer1out = layer1.layer1out;

        layer0.decryptL0();
        layer0out = layer0.layer0out;

        //System.out.println("layer0out: "+layer0out);//test
        // System.out.print("layer1out: "+ layer1out+"\n"); //test
        // System.out.println("layer2out: "+layer2out+"\n\n");//test

        result = layer0out;
    }

}

