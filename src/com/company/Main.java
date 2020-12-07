package com.company;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("text.txt");

        Word word = new Word();
        Count count = new Count();



        word.getWordCount(file);
        count.getCountSigns(file);
        count.getLowercaseUppercaseLetters(file);
        word.getWordCountMax(file);
        word.getNumber100(file);
        word.getMaxUppercase(file);
        word.getCountPalindrome(file);

        FileClass fileClass = new FileClass("text.txt");
        PatternClass patternClass = new PatternClass(fileClass.getText());

        count.printOo0(file);
        count.printReplacement(file);

        patternClass.printOo0();
        patternClass.printReplacement();
        patternClass.deleteVowelMoreOne();
        patternClass.replacingConsonantMoreOneWithUpperCase();
        fileClass.writeFile(patternClass.getText().toString());

    }


}
