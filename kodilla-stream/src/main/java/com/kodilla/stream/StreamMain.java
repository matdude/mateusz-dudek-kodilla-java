package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

//        People.getList().stream().forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

//        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser-> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getPostsNumber()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
