package edu.sfsu.app_movie.database;

import static edu.sfsu.app_movie.contract.SQLContract.SQLEntry.DB_NAME;
import static edu.sfsu.app_movie.contract.SQLContract.SQLEntry.DB_VERSION;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

import edu.sfsu.app_movie.contract.SQLContract;

public class SQLHelper extends SQLiteOpenHelper {
    public SQLHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, factory, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLContract.SQLEntry);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
