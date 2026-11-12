package defpackage;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mi0 {
    public static final zc a = null;
    public static final String[] b = null;
    public static final DateFormat[] c = null;

    static {
        a = new zc(1);
        String[] r0 = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        b = r0;
        c = new DateFormat[r0.length];
    }

    public static final Date a(String r10) {
        if (r10.length() != 0) goto L5;
        return null;
    L5:
        ParsePosition r0 = new ParsePosition(0);
        Date r3 = ((DateFormat) a.get()).parse(r10, r0);
        if (r0.getIndex() != r10.length()) goto L8;
        return r3;
    L8:
        String[] r4 = b;
        monitor-enter(r4);
        int r5 = r4.length;     // Catch: Throwable -> L15
        int r6 = 0;
    L11:
        if (r6 >= r5) goto L22;
        DateFormat[] r7 = c;     // Catch: Throwable -> L15
        DateFormat r8 = r7[r6];     // Catch: Throwable -> L15
        if (r8 != null) goto L17;
        r8 = new SimpleDateFormat(b[r6], Locale.US);     // Catch: Throwable -> L15
        r8.setTimeZone(ze5.b);     // Catch: Throwable -> L15
        r7[r6] = r8;     // Catch: Throwable -> L15
    L17:
        r0.setIndex(0);     // Catch: Throwable -> L15
        Date r9 = r8.parse(r10, r0);     // Catch: Throwable -> L15
        if (r0.getIndex() != 0) goto L19;
        r6 = r6 + 1;
        goto L11
    L19:
        monitor-exit(r4);
        return r9;
    L22:
        monitor-exit(r4);
        return null;
    L15:
        th = move-exception;
        throw th;
    }
}
