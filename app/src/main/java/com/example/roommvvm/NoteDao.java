package com.example.roommvvm;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    void InsertData(Note note);

    @Update
    void UpdateData(Note note);

    @Delete
    void DeleteData(Note note);

    @Query("DELETE FROM note_table ")
    void DeleteAllData();

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>>getAllData();
}
