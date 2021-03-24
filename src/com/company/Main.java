package com.company;

public class Main {

    public static String main(String plaintext)
    {
        return TranslateEnglishToBraille(plaintext);
    }

    private static String TranslateEnglishToBraille(String plaintext) {
        String translation = "";
        translation = Translate(plaintext);
        return translation;
    }

    public static String Translate(String plaintext)
    {
        return "";
    }
}
