package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ab4 {
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public final int a;
    public final Bundle b;
    public final long c;
    public final xa4 d;

    static {
        String r0 = f35.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public ab4(int r2, Bundle r3, long r4, xa4 r6) {
        if (r6 == null) goto L7;
        if (r2 < 0) goto L7;
        boolean r0 = false;
    L8:
        rr2.l(r0);
        this.a = r2;
        this.b = new Bundle(r3);
        this.c = r4;
        if (r6 != null) goto L12;
        if (r2 >= 0) goto L12;
        r6 = new xa4(r2, "no error message provided");
    L12:
        this.d = r6;
        return;
    L7:
        r0 = true;
        goto L8
    }

    public static ab4 a(Bundle r8) {
        int r3 = r8.getInt(e, -1);
        Bundle r0 = f35.n(r8.getBundle(f));
        long r5 = r8.getLong(g, SystemClock.elapsedRealtime());
        Bundle r9 = r8.getBundle(h);
        if (r9 == null) goto L6;
        xa4 r10 = xa4.a(r9);
    L5:
        xa4 r7 = r10;
        if (r0 != null) goto L13;
        r0 = Bundle.EMPTY;
    L13:
        return new ab4(r3, r0, r5, r7);
    L6:
        if (r3 == 0) goto L8;
        r10 = new xa4(r3, "no error message provided");
        goto L5
    L8:
        r10 = null;
        goto L5
    }

    public final Bundle b() {
        Bundle r0 = new Bundle();
        r0.putInt(e, this.a);
        r0.putBundle(f, this.b);
        r0.putLong(g, this.c);
        xa4 r4 = this.d;
        if (r4 == null) goto L5;
        r0.putBundle(h, r4.b());
    L5:
        return r0;
    }

    public ab4(int r7, Bundle r8) {
        this(r7, r8, SystemClock.elapsedRealtime(), null);
    }

    public ab4(xa4 r7) {
        this(r7.a, Bundle.EMPTY, SystemClock.elapsedRealtime(), r7);
    }

    public ab4(int r2) {
        this(r2, Bundle.EMPTY);
    }
}
