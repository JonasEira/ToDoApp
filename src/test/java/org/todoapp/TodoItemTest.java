package org.todoapp;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    @Test
    void isOverdue() {
        TodoItem tdi = new TodoItem();
        tdi.setDeadLine(LocalDate.parse("2002-05-10"));
        assertEquals(true, tdi.isOverdue());
    }
}