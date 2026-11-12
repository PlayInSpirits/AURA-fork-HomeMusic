package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m92 {
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public final int a;
    public final long b;
    public final Object c;
    public final int d;
    public final jn2 e;
    public final xa4 f;

    static {
        String r0 = f35.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public m92(int r1, long r2, jn2 r4, xa4 r5, Object r6, int r7) {
        this.a = r1;
        this.b = r2;
        this.e = r4;
        this.f = r5;
        this.c = r6;
        this.d = r7;
    }

    public static m92 a(Bundle r10) {
        int r1 = 0;
        int r3 = r10.getInt(g, 0);
        long r4 = r10.getLong(h, SystemClock.elapsedRealtime());
        Bundle r0 = r10.getBundle(i);
        Object r2 = null;
        if (r0 != null) goto L5;
        jn2 r6 = null;
    L6:
        Bundle r5 = r10.getBundle(l);
        if (r5 == null) goto L10;
        xa4 r7 = xa4.a(r5);
    L9:
        xa4 r8 = r7;
    L13:
        int r9 = r10.getInt(k);
        if (r9 == 1) goto L38;
        String r11 = j;
        if (r9 != 2) goto L18;
        Bundle r12 = r10.getBundle(r11);
        if (r12 == null) goto L38;
        r2 = gn2.b(r12);
        goto L38
    L18:
        if (r9 != 3) goto L20;
        IBinder r13 = r10.getBinder(r11);
        if (r13 == null) goto L38;
        yw1 r14 = iw.a(r13);
        uw1 r15 = yw1.j();
    L29:
        if (r1 >= r14.size()) goto L31;
        Bundle r16 = (Bundle) r14.get(r1);
        r16.getClass();
        r15.c(gn2.b(r16));
        r1 = r1 + 1;
        goto L29
    L31:
        r2 = r15.f();
        goto L38
    L20:
        if (r9 == 4) goto L38;
        tb4.a();
        return null;
    L38:
        return new m92(r3, r4, r6, r8, r2, r9);
    L10:
        if (r3 == 0) goto L12;
        r7 = new xa4(r3, "no error message provided");
        goto L9
    L12:
        r8 = null;
        goto L13
    L5:
        r6 = jn2.a(r0);
        goto L6
    }

    public static m92 b(int r8) {
        xa4 r5 = new xa4("no error message provided", r8, Bundle.EMPTY);
        long r2 = SystemClock.elapsedRealtime();
        return new m92(r5.a, r2, null, r5, null, 4);
    }

    public static m92 c(gy3 r10, jn2 r11) {
        vw1 r0 = r10.m(0);
    L4:
        if (r0.hasNext() == false) goto L7;
        d((gn2) r0.next());
        goto L4
    L7:
        return new m92(0, SystemClock.elapsedRealtime(), r11, null, yw1.k(r10), 3);
    }

    public static void d(gn2 r4) {
        boolean r1 = true;
        rr2.k("mediaId must not be empty", !TextUtils.isEmpty(r4.a));
        do2 r5 = r4.d;
        if (r5.q == null) goto L5;
        boolean r0 = true;
    L6:
        rr2.k("mediaMetadata must specify isBrowsable", r0);
        if (r5.r != null) goto L10;
        r1 = false;
    L10:
        rr2.k("mediaMetadata must specify isPlayable", r1);
        return;
    L5:
        r0 = false;
        goto L6
    }
}
