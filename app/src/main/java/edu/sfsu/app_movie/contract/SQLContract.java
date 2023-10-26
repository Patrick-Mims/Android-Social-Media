package edu.sfsu.app_movie.contract;

import android.provider.BaseColumns;

public class SQLContract {

    // to prevent someone from accidentally instantiating the contract class, make the constructor private.
    private SQLContract(){};

    public static class SQLEntry implements BaseColumns {
        public static final String DB_NAME = "Entertainment";
        public static final int DB_VERSION = 1;
        public static final String TABLE_NAME = "Candidate";
        public static final String COLUMN_NAME_FIRST = "firstname";
        public static final String COLUMN_NAME_LAST = "lastname";
        public static final String COLUMN_DEPARTMENT = "description";
        public static final String COLUMN_IMAGE_ID = "photo";
        public static final int COLUMN_AGE = 0;
        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + SQLEntry.TABLE_NAME + " (" +
                        SQLEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        SQLEntry.COLUMN_NAME_FIRST + " TEXT," +
                        SQLEntry.COLUMN_NAME_LAST + " TEXT" +
                        SQLEntry.COLUMN_DEPARTMENT + " TEXT" +
                        SQLEntry.COLUMN_IMAGE_ID + " INTEGER)";
        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + SQLEntry.TABLE_NAME;
    }
}
