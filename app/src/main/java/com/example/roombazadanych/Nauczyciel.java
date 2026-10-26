package com.example.roombazadanych;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "nauczyciele")
public class Nauczyciel {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String Imie;
    public String przedmiot;

    //constructor
    public Nauczyciel(String imie, String przedmiot) {
        Imie = imie;
        this.przedmiot = przedmiot;
    }
}
