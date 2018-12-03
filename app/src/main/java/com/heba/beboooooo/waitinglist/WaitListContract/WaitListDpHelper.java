package com.heba.beboooooo.waitinglist.WaitListContract;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import com.heba.beboooooo.waitinglist.WaitListContract.WaitListSchema.WaitlistEntry;

public class WaitListDpHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "waitlist.db";

    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + WaitlistEntry.TABLE_NAME + " (" +
                    WaitlistEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    WaitlistEntry.COLUMN_GUEST_NAME + " TEXT NOT NULL, " +
                    WaitlistEntry.COLUMN_GUEST_NUMBER + " TEXT NOT NULL, " +
                    WaitlistEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                    "); ";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + WaitlistEntry.TABLE_NAME;

    public WaitListDpHelper(@Nullable Context context) {

        super ( context, DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL ( SQL_CREATE_ENTRIES );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL ( SQL_DELETE_ENTRIES );
        onCreate ( db );

    }
}
