package org.todoapp;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    @Test
    void testThatisOverdueWorksAsIntended() {
        TodoItem tdi = new TodoItem();
        tdi.setDeadLine(LocalDate.parse("2002-05-10"));
        assertEquals(true, tdi.isOverdue());
    }

    @Test
    void testThatHashWorks() {
        TodoItem tdi = new TodoItem("Do something", LocalDate.parse("2022-05-02"));
        int hash = tdi.hashCode();
        int actualHash = Objects.hash(tdi.getId(), tdi.getTitle(), tdi.getDeadLine(), tdi.getTaskDescription(), tdi.isDone());
        assertEquals(actualHash, hash);

    }
}