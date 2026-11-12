package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a35 {
    public static final AtomicReference a = null;

    static {
        a = new AtomicReference();
    }

    public static long a(long r1) {
        Calendar r0 = e(null);
        r0.setTimeInMillis(r1);
        return c(r0).getTimeInMillis();
    }

    public static DateFormat b(String r0, Locale r1) {
        DateFormat r2 = DateFormat.getInstanceForSkeleton(r0, r1);
        r2.setTimeZone(TimeZone.getTimeZone("UTC"));
        r2.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return r2;
    }

    public static Calendar c(Calendar r4) {
        Calendar r5 = e(r4);
        Calendar r0 = e(null);
        r0.set(r5.get(1), r5.get(2), r5.get(5));
        return r0;
    }

    public static Calendar d() {
        xt4 r0 = (xt4) a.get();
        Calendar r1 = Calendar.getInstance();
        r1.set(11, 0);
        r1.set(12, 0);
        r1.set(13, 0);
        r1.set(14, 0);
        r1.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return r1;
    }

    public static Calendar e(Calendar r3) {
        Calendar r0 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (r3 != null) goto L6;
        r0.clear();
        return r0;
    L6:
        r0.setTimeInMillis(r3.getTimeInMillis());
        return r0;
    }
}
