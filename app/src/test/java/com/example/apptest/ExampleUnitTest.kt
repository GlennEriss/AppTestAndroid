package com.example.apptest

import com.example.apptest.entities.Task
import org.junit.Test

import org.junit.Assert.*
import java.time.LocalDate

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun createTask(){
        val task = Task(1, "Test", "Test", LocalDate.now().plusDays(1));
        println("date de fin ${task.dateCreate}");
    }
}