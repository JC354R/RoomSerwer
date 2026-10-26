package com.example.roombazadanych;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NauczycielDAO {

    @Insert
    void wstawListeNauczycieli(Nauczyciel ... nauczyciele);
    @Insert
    void wstawNauczycielaDoBazy(Nauczyciel nauczyciel);

    @Delete
    void usunNauczycielaSposrodBazy(Nauczyciel nauczyciel);

    @Update
    void zaktualicujDaneNauczyciela(Nauczyciel nauczyciel);

    @Query("SELECT * from nauczyciele")
    List<Nauczyciel> zwrocWszystkichNauczycieli();

    @Query("SELECT imie from nauczyciele where przedmiot = :przedmiotArgument")
    List<String> zwrocImionaNauczycieliSposrodPrzedmiotu(String przedmiotArgument);

}
