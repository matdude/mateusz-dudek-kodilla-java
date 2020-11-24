package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
      //  PoemBeautifier poemBeautifier = new PoemBeautifier();
      //  String beautifiedText = poemBeautifier.beautify("Text to beautify", (text -> "ABC" + text + "ABC"));
      //  System.out.println(beautifiedText);

      //  String beautifiedText2 = poemBeautifier.beautify("Text to beautify", (text -> text.toUpperCase()));
      //  System.out.println(beautifiedText2);

      //  String beautifiedText3 = poemBeautifier.beautify("Text to beautify", (text -> text.format("|%20s|", text)));
      //  System.out.println(beautifiedText3);

       // String beautifiedText4 = poemBeautifier.beautify("Text to beautify", (text -> "***" + text + "***"));
       // System.out.println(beautifiedText4);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
