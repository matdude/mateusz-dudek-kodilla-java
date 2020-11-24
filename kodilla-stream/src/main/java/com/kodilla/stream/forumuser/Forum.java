package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "User1", 'M', LocalDate.of(1990, Month.JANUARY, 1),10));
        forumUserList.add(new ForumUser(2, "User2", 'F', LocalDate.of(1991, Month.FEBRUARY, 2),20));
        forumUserList.add(new ForumUser(3, "User3", 'M', LocalDate.of(1980, Month.MARCH, 3),30));
        forumUserList.add(new ForumUser(4, "User4", 'F', LocalDate.of(1970, Month.APRIL, 4),0));
        forumUserList.add(new ForumUser(5, "User5", 'M', LocalDate.of(2005, Month.MAY, 5),50));
        forumUserList.add(new ForumUser(6, "User6", 'F', LocalDate.of(1999, Month.JUNE, 6),60));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
