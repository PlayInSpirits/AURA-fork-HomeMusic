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

    public static long versionCode(Context context) {
        return versionCodeInt(context);
    }

    public static int versionCodeInt(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static String versionName(Context context) {
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        return str != null ? str : "unknown";
    }
}
