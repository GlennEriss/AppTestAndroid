package com.example.apptest.entities

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
@RequiresApi(Build.VERSION_CODES.O)
class Task(var id: Int, var title:String, var description:String, var dateEnd:LocalDate) {
    val dateCreate:LocalDate = LocalDate.now();
    fun isEndOfTask(): Boolean{
        return this.dateEnd == LocalDate.now();
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true;
        if (other == null || javaClass != other.javaClass) return false;
        val otherObject = other as Task;
        return id == otherObject.id;
    }
}