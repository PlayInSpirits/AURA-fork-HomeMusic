package defpackage;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tf {
    public static boolean a(PowerManager r0) {
        return r0.isPowerSaveMode();
    }

    public static String b(Locale r0) {
        return r0.toLanguageTag();
    }
}
