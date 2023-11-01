package edu.sfsu.app_movie.database;

import android.provider.BaseColumns;

/*
    Android Docs - Define a schema and contract
    A contract class is a container for constants that define names for URI's, tables, and columns.

    The contract class allows you to use the same constants across all the other classes in the same
    package.

    This lets you change a column name in one place and have it propagate throughout you code.
*/
public class SQLContract {

    // to prevent someone from accidentally instantiating the contract class, make the constructor private.
    private SQLContract(){};

    public static class SQLEntry implements BaseColumns {
        public static final int DB_VERSION = 1;
        public static final int COLUMN_AGE = 0;
        public static final String DB_NAME = "Movie";
        public static final String TABLE_NAME = "Actor";
        public static final String COLUMN_NAME_FIRST = "firstname";
        public static final String COLUMN_NAME_LAST = "lastname";
        public static final String COLUMN_GENDER= "gender";
        public static final String COLUMN_IMAGE_ID = "photo";
        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUMN_NAME_FIRST + " TEXT," +
                        COLUMN_NAME_LAST  + " TEXT," +
                        COLUMN_GENDER     + " TEXT," +
                        COLUMN_AGE        + " INTEGER," +
                        COLUMN_IMAGE_ID   + " INTEGER)";
        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
