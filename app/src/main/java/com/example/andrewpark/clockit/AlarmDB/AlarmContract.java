package com.example.andrewpark.clockit.AlarmDB;

import android.provider.BaseColumns;

/**
 * Created by andrewpark on 9/8/15.
 */
public class AlarmContract {

    public AlarmContract() {}

    public static abstract class Alarm implements BaseColumns {
        public static final String TABLE_NAME = "alarm";
        public static final String COLUMN_NAME_ALARM_NAME = "name";
        public static final String COLUMN_NAME_ALARM_TIME_HOUR = "hour";
        public static final String COLUMN_NAME_ALARM_TIME_MINUTE = "minute";
        public static final String COLUMN_NAME_ALARM_REPEAT_DAYS = "days";
        public static final String COLUMN_NAME_ALARM_REPEAT_WEEKLY = "weekly";
        public static final String COLUMN_NAME_ALARM_TONE = "tone";
        public static final String COLUMN_NAME_ALARM_ENABLED = "enabled";
        public static final String COLUMN_NAME_ALARM_VIBRATE = "vibrate";
        public static final String COLUMN_NAME_ALARM_FADING = "fading";
        public static final String COLUMN_NAME_ALARM_SNOOZE = "snooze";
    }

}