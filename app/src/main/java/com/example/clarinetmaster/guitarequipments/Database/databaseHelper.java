package com.example.clarinetmaster.guitarequipments.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "CONTENTS";
    public static final int DATABASE_VERSION = 1;
    public static final String BODY_TABLE_NAME = "BODY";
    public static final String PICKUPS_TABLE_NAME = "PICKUPS";
    public static final String EFFECTS_TABLE_NAME = "EFFECTS";
    public static final String COL_ID = "_ID";
    public static final String COL_NAME = "NAME";
    public static final String COL_PICTURE_1 = "PICTURE1";
    public static final String COL_PICTURE_2 = "PICTURE2";
    public static final String COL_PICTURE_3 = "PICTURE3";

    private static final String SQL_CREATE_TABLE_BODY = "CREATE TABLE " + BODY_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COL_NAME + " TEXT," +
            COL_PICTURE_1 + " TEXT," +
            COL_PICTURE_2 + " TEXT," +
            COL_PICTURE_3 + " TEXT" +
            ")";
    private static final String SQL_CREATE_TABLE_PICKUPS = "CREATE TABLE " + PICKUPS_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COL_NAME + " TEXT," +
            COL_PICTURE_1 + " TEXT," +
            COL_PICTURE_2 + " TEXT," +
            COL_PICTURE_3 + " TEXT" +
            ")";
    private static final String SQL_CREATE_TABLE_EFFECTS = "CREATE TABLE " + EFFECTS_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COL_NAME + " TEXT," +
            COL_PICTURE_1 + " TEXT," +
            COL_PICTURE_2 + " TEXT," +
            COL_PICTURE_3 + " TEXT" +
            ")";

    public databaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_BODY);
        db.execSQL(SQL_CREATE_TABLE_EFFECTS);
        db.execSQL(SQL_CREATE_TABLE_PICKUPS);
        //insertBodyData(db);
        //insertEffectsData(db);
        //insertPickupsData(db);
    }
/*
    private void insertPickupsData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_NAME, "Single Coil");
        cv.put(COL_PICTURE, );
        db.insert(PICKUPS_TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Humbuckers");
        cv.put(COL_PICTURE, );
        db.insert(PICKUPS_TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Active Pickups");
        cv.put(COL_PICTURE, );
        db.insert(PICKUPS_TABLE_NAME, null, cv);
    }

    private void insertEffectsData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
    }

    private void insertBodyData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
    }

    */

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
