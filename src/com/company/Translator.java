package com.company;

public class Translator
{
    Alphabet myAlphabet;
    public Translator(Alphabet alphabet)
    {
        myAlphabet = alphabet;
    }
    public String TranslateEnglishToBraille(String plaintext)
    {
        StringBuilder translation = new StringBuilder();
        for(int i = 0; i<plaintext.length();i++)
        {
            if(Character.isUpperCase(plaintext.charAt(i)))
            {
                translation.append(myAlphabet.upperCaseBraille);
                translation.append(myAlphabet.englishToBrailleDictionary.get(plaintext.substring(i, i + 1).toLowerCase()));
            }
            else
                translation.append(myAlphabet.englishToBrailleDictionary.get(plaintext.substring(i, i + 1)));
        }
        return translation.toString();
    }
}
