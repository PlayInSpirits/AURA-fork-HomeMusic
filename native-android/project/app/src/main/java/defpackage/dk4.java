package defpackage;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dk4 extends bz4 {
    public static final ri c = null;
    public static final ri d = null;
    public static final ri e = null;
    public final /* synthetic */ int a;
    public final Object b;

    static {
        c = new ri(2);
        d = new ri(3);
        e = new ri(1);
    }

    public dk4(int r3) {
        this.a = r3;
        switch(r3) {
            case 1: goto L13;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.b = new SimpleDateFormat("MMM d, yyyy");
        return;
    L6:
        ArrayList r4 = new ArrayList();
        this.b = r4;
        Locale r2 = Locale.US;
        r4.add(DateFormat.getDateTimeInstance(2, 2, r2));
        if (Locale.getDefault().equals(r2) == true) goto L10;
        r4.add(DateFormat.getDateTimeInstance(2, 2));
    L10:
        if (o22.a < 9) goto L15;
        r4.add(g12.z(2, 2));
        return;
    L15:
        return;
    L13:
        this.b = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // defpackage.bz4
    public final Object a(l32 r8) {
        switch(this.a) {
            case 0: goto L40;
            case 1: goto L26;
            default: goto L5;
        };
    L5:
        if (r8.e0() != 9) goto L7;
        r8.a0();
        return null;
    L7:
        String r0 = r8.c0();
        ArrayList r3 = (ArrayList) this.b;
        monitor-enter(r3);
        ArrayList r7 = (ArrayList) this.b;     // Catch: Throwable -> L15
        int r1 = r7.size();     // Catch: Throwable -> L15
        int r5 = 0;
    L10:
        if (r5 >= r1) goto L17;
        Object r6 = r7.get(r5);     // Catch: Throwable -> L15
        r5 = r5 + 1;     // Catch: Throwable -> L15
        Date r9 = ((DateFormat) r6).parse(r0);     // Catch: ParseException -> L55 Throwable -> L15
        monitor-exit(r3);     // Catch: Throwable -> L15
    L71:
        return r9;
    L17:
        monitor-exit(r3);     // Catch: Throwable -> L15
        r9 = fv1.b(r0, new ParsePosition(0));     // Catch: ParseException -> L20
    L20:
        e = move-exception;
        oi0.a(xa3.j("Failed parsing '", r0, "' as Date; at path "), r8.H(), e);
        return null;
    L15:
        th = move-exception;
        throw th;
    L26:
        if (r8.e0() != 9) goto L28;
        r8.a0();
        return null;
    L28:
        String r2 = r8.c0();
        monitor-enter(this);     // Catch: ParseException -> L36
        Time r4 = new Time(((SimpleDateFormat) this.b).parse(r2).getTime());     // Catch: Throwable -> L33
        monitor-exit(this);     // Catch: Throwable -> L33
    L73:
        return r4;
    L33:
        th = move-exception;
        throw th;     // Catch: ParseException -> L36
    L36:
        e = move-exception;
        oi0.a(xa3.j("Failed parsing '", r2, "' as SQL Time; at path "), r8.H(), e);
        return null;
    L40:
        if (r8.e0() != 9) goto L42;
        r8.a0();
        return null;
    L42:
        String r10 = r8.c0();
        monitor-enter(this);     // Catch: ParseException -> L48
        Date r11 = ((SimpleDateFormat) this.b).parse(r10);     // Catch: Throwable -> L50
        monitor-exit(this);     // Catch: Throwable -> L50
    L75:
        return new java.sql.Date(r11.getTime());
    L50:
        th = move-exception;
        throw th;     // Catch: ParseException -> L48
    L48:
        e = move-exception;
        oi0.a(xa3.j("Failed parsing '", r10, "' as SQL Date; at path "), r8.H(), e);
        return null;
    }

    @Override // defpackage.bz4
    public final void b(q32 r3, Object r4) {
        switch(this.a) {
            case 0: goto L27;
            case 1: goto L16;
            default: goto L4;
        };
    L4:
        Date r5 = (Date) r4;
        if (r5 != null) goto L7;
        r3.F();
        return;
    L7:
        DateFormat r0 = (DateFormat) ((ArrayList) this.b).get(0);
        ArrayList r1 = (ArrayList) this.b;
        monitor-enter(r1);
        String r2 = r0.format(r5);     // Catch: Throwable -> L13
        monitor-exit(r1);     // Catch: Throwable -> L13
        r3.W(r2);
        return;
    L13:
        th = move-exception;
        throw th;
    L16:
        Time r6 = (Time) r4;
        if (r6 != null) goto L19;
        r3.F();
        return;
    L19:
        monitor-enter(this);
        String r7 = ((SimpleDateFormat) this.b).format(r6);     // Catch: Throwable -> L24
        monitor-exit(this);     // Catch: Throwable -> L24
        r3.W(r7);
        return;
    L24:
        th = move-exception;
        throw th;
    L27:
        java.sql.Date r8 = (java.sql.Date) r4;
        if (r8 != null) goto L30;
        r3.F();
        return;
    L30:
        monitor-enter(this);
        String r9 = ((SimpleDateFormat) this.b).format(r8);     // Catch: Throwable -> L35
        monitor-exit(this);     // Catch: Throwable -> L35
        r3.W(r9);
        return;
    L35:
        th = move-exception;
        throw th;
    }
}
