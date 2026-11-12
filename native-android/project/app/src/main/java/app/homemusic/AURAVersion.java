package app.homemusic;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class AURAVersion {
    public static boolean pendingSearch;
    public static View waveButton;
    public static boolean wavePending;
    public static boolean wavePlaying;
    public static boolean waveStarted;

    public static long versionCode(Context r2) {
        return versionCodeInt(r2);
    }

    public static int versionCodeInt(Context r3) {
        return r3.getPackageManager().getPackageInfo(r3.getPackageName(), 0).versionCode;
    }

    public static String versionName(Context r3) {
        String r0 = r3.getPackageManager().getPackageInfo(r3.getPackageName(), 0).versionName;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return "unknown";
    }
}
