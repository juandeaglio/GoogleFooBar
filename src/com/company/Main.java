package com.company;

import java.util.Dictionary;

public class Main
{
    public static class Alphabet
    {
        final int SIZE_OF_LETTER = 6;
        Dictionary<String,String> englishToBrailleDictionary;
        String plainAlphabet = "The quick brown fox jumps over the lazy dog";
        String binaryAlphabet = "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";
        public Alphabet()
        {
            mapDictionaryFromPlainToBinary(plainAlphabet, binaryAlphabet);
        }
        void mapDictionaryFromPlainToBinary(String plain, String binary)
        {
            String pText = plain;
            String bText = binary;
            while(binaryAlphabet.length() > 0 && plainAlphabet.length() > 0)
            {

                if (Character.isUpperCase(pText.charAt(0)))
                {
                    String binaryLetter = bText.substring(0,6);
                    englishToBrailleDictionary.put(" ", binaryLetter);
                    bText = bText.substring(6);
                }
            }
        }
    }
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

