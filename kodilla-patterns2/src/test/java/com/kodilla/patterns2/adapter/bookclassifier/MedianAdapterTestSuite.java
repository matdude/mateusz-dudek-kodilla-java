package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("Author1", "Title1", 1990, "111");
        Book book2 = new Book("Author2", "Title2", 1995, "222");
        Book book3 = new Book("Author3", "Title3", 2000, "333");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int expectedMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(expectedMedian, 1995);
    }
}
