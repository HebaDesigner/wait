package com.heba.beboooooo.waitinglist.WaitListContract;

import android.provider.BaseColumns;

public final class WaitListSchema {

    private WaitListSchema() {}

    public  static class  WaitlistEntry implements BaseColumns{

        public static final String TABLE_NAME = "WAITLIST";
        public static final String COLUMN_GUEST_NAME = "guestName";
        public static final String COLUMN_GUEST_NUMBER = "partySize";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}
