package com.example.user.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {

    public MyDBHelper(Context context, String name, CursorFactory factory,
                      int version) {
        super(context, name, factory, version);
        // 안재성
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 안재성

        db.execSQL("CREATE TABLE today(_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "title TEXT, " + "date TEXT , " + "time TEXT, "
                + "memo TEXT );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // 안재성
        db.execSQL("DROP TABLE IF EXIST today;");
        onCreate(db);
    }
}