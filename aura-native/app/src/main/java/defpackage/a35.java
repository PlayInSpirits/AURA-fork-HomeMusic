package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class a35 {
    public static final AtomicReference a = new AtomicReference();

    public static long a(long j) {
        Calendar e = e(null);
        e.setTimeInMillis(j);
        return c(e).getTimeInMillis();
    }

    public static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static Calendar c(Calendar calendar) {
        Calendar e = e(calendar);
        Calendar e2 = e(null);
        e2.set(e.get(1), e.get(2), e.get(5));
        return e2;
    }

    public static Calendar d() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar e(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
