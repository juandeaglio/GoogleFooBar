package com.company;

import java.util.HashMap;

public class Alphabet
{
    final int SIZE_OF_LETTER = 6;
    public HashMap<String, String> englishToBrailleDictionary;

    public Alphabet(String plainAlphabet, String binaryAlphabet)
    {
        englishToBrailleDictionary = new HashMap<>();
        mapDictionaryFromPlainToBinary(plainAlphabet, binaryAlphabet);
    }
    void mapDictionaryFromPlainToBinary(String plain, String binary)
    {
        String pText = plain;
        String bText = binary;
        while (plain.length() > 0 && binary.length() * SIZE_OF_LETTER == plain.length() && binary.length() % 6 == 0)
        {
            if (Character.isUpperCase(pText.charAt(0)))
            {
                String binaryLetter = bText.substring(0, 6);
                englishToBrailleDictionary.put(" ", binaryLetter);
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
