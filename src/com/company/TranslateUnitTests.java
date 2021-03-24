package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TranslateUnitTests {
    @Test
    void GivenWordShouldTranslateThenReturnAtLeastOneCharacter()
    {
        String plaintext = "code";
        Assertions.assertTrue(Main.Translate(plaintext).length() > 0);
    }
    @Test
    void GivenTheSentenceShouldTranslateToBinaryBraille()
    {
        String plaintext = "The quick brown fox jumps over the lazy dog";
        String result = Main.Translate(plaintext);
        Assertions.assertEquals("000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110"
                , result);
    }
    @Test
    void GivenAStringWithNumberShouldThrowExceptionWhenTranslating()
    {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Main.Translate("12223245");
        });
    }
    @Test
    void GivenAStringTooLongShouldThrowExceptionWhenTranslating()
    {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Main.Translate("12223245555555555555555555555555555511011001010001000000011111010100101010010010010100000000011000011101010101001011110111000110110010100010000000111110101001010100100100101000000000110000111010101010010111101110001101100101000100000001111101010010101001001001010000000001100001110101010100101111011100011011001010001000000011111010100101010010010010100000000011000011101010101001011110111000110110010100010000000111110101001010100100100101000000000110000111010101010010111101110001101100101000100000001111101010010101001001001010000000001100001110101010100101111011100011011001010001000000011111010100101010010010010100000000011000011101010101001011110111000");
        });
    }
    @Test
    void GivenTwoAPlainStringAndABrailleStringShouldFormAlphabetOf28Chars()
    {
        Alphabet alphabet = new Alphabet("The quick brown fox jumps over the lazy dog","000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110");
        final int SIZE_OF_DICTIONARY = 28;
        Assertions.assertEquals(SIZE_OF_DICTIONARY, alphabet.englishToBrailleDictionary.size());
    }

}
