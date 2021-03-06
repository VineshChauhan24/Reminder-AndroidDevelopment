package com.javi.android.reminder.database;

public class TaskDbSchema {

    public static final class TaskTable {

        public static final String NAME = "tasks";

        public static final class Cols {

            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String PRIORITY = "priority";
            public static final String DONE = "done";
        }
    }
}
