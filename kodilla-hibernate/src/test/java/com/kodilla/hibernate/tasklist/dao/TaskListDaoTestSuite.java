package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.takslist.TaskList;
import com.kodilla.hibernate.takslist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String NAME = "List 1";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
//        //Given
//        TaskList taskList = new TaskList(NAME, DESCRIPTION);
//        taskListDao.save(taskList);
//        String listName = taskList.getListName();
//
//        //When
//        List<TaskList> readTaskList = taskListDao.findByListName(listName);
//
//        //Then
//        assertEquals(1, readTaskList.size());
//
//        //CleanUp
//        int id = readTaskList.get(0).getId();
//        taskListDao.deleteById(id);
    }
}
