package edu.sfsu.app_movie.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import edu.sfsu.app_movie.R;

public class SQLHelper extends SQLiteOpenHelper {
    public SQLHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, SQLContract.SQLEntry.DB_NAME, factory, SQLContract.SQLEntry.DB_VERSION);
    }

    // onCreate() gets called when the database gets created on the device.
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLContract.SQLEntry.SQL_CREATE_ENTRIES);
        insert_record(sqLiteDatabase, "Paige", "Turner", "Drama", 30, R.drawable.profile_woman_01);
    }

    // onUpgrade() gets called when the database needs to be upgraded.
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private static void insert_record(SQLiteDatabase db, String first, String last, String gender, int age, int image_id) {

        ContentValues values = new ContentValues();

        values.put("FIRST", first);
        values.put("LAST", last);
        values.put("GENDER", gender);
        values.put("AGE", age);
        values.put("ID", image_id);

        db.insert(SQLContract.SQLEntry.TABLE_NAME, null, values);
    }
}