package com.company;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static String main(String plaintext)
    {
        String plainAlphabet = "The quick brown fox jumps over the lazy dog";
        String binaryAlphabet = "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";
        Alphabet alphabet = new Alphabet(plainAlphabet, binaryAlphabet);
        Translator translator = new Translator(alphabet);
        return "";
    }



}
