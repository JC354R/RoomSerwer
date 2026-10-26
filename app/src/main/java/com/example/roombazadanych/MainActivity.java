package com.example.roombazadanych;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public class MainActivity extends AppCompatActivity {

    SzkolaDataBase szkolaDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        szkolaDataBase = Room.databaseBuilder(
                getApplicationContext(), SzkolaDataBase.class,"szkolaDB")
                .allowMainThreadQueries()
                .build();

        szkolaDataBase.getNauczycielDAO().wstawNauczycielaDoBazy(
                new Nauczyciel( "amelka", "Biologia"));
    }
}