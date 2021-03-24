package com.company;

import java.util.HashMap;

public class Alphabet
{
    final int SIZE_OF_LETTER = 6;
    public HashMap<String, String> englishToBrailleDictionary;
    public String upperCaseBraille;

    public Alphabet(String plainAlphabet, String binaryAlphabet)
    {
        englishToBrailleDictionary = new HashMap<>();
        mapDictionaryFromPlainToBinary(plainAlphabet, binaryAlphabet);
    }
    void mapDictionaryFromPlainToBinary(String plain, String binary)
    {
        String pText = plain;
        String bText = binary;
        while (pText.length() > 0 && bText.length() > 0 && bText.length() % 6 == 0)
        {
            if (Character.isUpperCase(pText.charAt(0)))
            {
                upperCaseBraille = bText.substring(0, 6);;
                pText = pText.toLowerCase();
                bText = bText.substring(6);
            }
            else
            {
                String binaryLetter = bText.substring(0, 6);
                String plainLetter = pText.substring(0,1);
                englishToBrailleDictionary.put(plainLetter, binaryLetter);
                pText = pText.substring(1);
                bText = bText.substring(6);
            }
        }
    }
}
