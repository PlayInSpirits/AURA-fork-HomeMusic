package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class za4 {
    public static final pi3 k = null;
    public static final za4 l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public final pi3 a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        pi3 r0 = new pi3(null, 0, null, null, 0, 0, 0, -1, -1);
        k = r0;
        l = new za4(r0, false, -9223372036854775807L, -9223372036854775807L, 0, 0, 0, -9223372036854775807L, -9223372036854775807L, 0);
        String r1 = f35.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public za4(pi3 r5, boolean r6, long r7, long r9, long r11, int r13, long r14, long r16, long r18, long r20) {
        boolean r2 = false;
        if (r5.h == (-1)) goto L5;
        boolean r0 = true;
    L6:
        if (r6 != r0) goto L8;
        r2 = true;
    L8:
        rr2.l(r2);
        this.a = r5;
        this.b = r6;
        this.c = r7;
        this.d = r9;
        this.e = r11;
        this.f = r13;
        this.g = r14;
        this.h = r16;
        this.i = r18;
        this.j = r20;
        return;
    L5:
        r0 = false;
        goto L6
    }

    public static za4 b(Bundle r24) {
        Bundle r1 = r24.getBundle(m);
        if (r1 != null) goto L6;
        pi3 r2 = k;
    L5:
        pi3 r3 = r2;
        return new za4(r3, r24.getBoolean(n, false), r24.getLong(o, -9223372036854775807L), r24.getLong(p, -9223372036854775807L), r24.getLong(q, 0), r24.getInt(r, 0), r24.getLong(s, 0), r24.getLong(t, -9223372036854775807L), r24.getLong(u, -9223372036854775807L), r24.getLong(v, 0));
    L6:
        r2 = pi3.c(r1);
        goto L5
    }

    public final za4 a(boolean r23, boolean r24) {
        if (r23 == false) goto L6;
        if (r24 == false) goto L6;
        return this;
    L6:
        pi3 r2 = this.a.b(r23, r24);
        int r4 = 0;
        if (r23 == true) goto L9;
    L11:
        boolean r5 = false;
    L12:
        if (r23 == false) goto L14;
        long r8 = this.d;
    L15:
        if (r23 == false) goto L17;
        long r12 = this.e;
    L18:
        if (r23 == false) goto L20;
        r4 = this.f;
    L20:
        if (r23 == false) goto L22;
        long r14 = this.g;
    L23:
        if (r23 == false) goto L25;
        long r6 = this.h;
    L26:
        if (r23 == false) goto L28;
        long r16 = this.i;
    L29:
        if (r23 == false) goto L31;
        long r10 = this.j;
    L33:
        return new za4(r2, r5, this.c, r8, r12, r4, r14, r6, r16, r10);
    L31:
        r10 = 0;
        goto L33
    L28:
        r16 = -9223372036854775807L;
        goto L29
    L25:
        r6 = -9223372036854775807L;
        goto L26
    L22:
        r14 = 0;
        goto L23
    L17:
        r12 = 0;
        goto L18
    L14:
        r8 = -9223372036854775807L;
        goto L15
    L9:
        if (this.b == false) goto L11;
        r5 = true;
        goto L12
    }

    public final Bundle c(int r10) {
        Bundle r0 = new Bundle();
        pi3 r1 = this.a;
        if (r10 >= 3) goto L5;
    L6:
        r0.putBundle(m, r1.d(r10));
    L7:
        boolean r2 = this.b;
        if (r2 == false) goto L10;
        r0.putBoolean(n, r2);
    L10:
        long r3 = this.c;
        if (r3 == (-9223372036854775807L)) goto L13;
        r0.putLong(o, r3);
    L13:
        long r4 = this.d;
        if (r4 == (-9223372036854775807L)) goto L16;
        r0.putLong(p, r4);
    L16:
        long r5 = this.e;
        if (r10 >= 3) goto L19;
    L20:
        r0.putLong(q, r5);
    L21:
        int r6 = this.f;
        if (r6 == 0) goto L24;
        r0.putInt(r, r6);
    L24:
        long r7 = this.g;
        if (r7 == 0) goto L27;
        r0.putLong(s, r7);
    L27:
        long r8 = this.h;
        if (r8 == (-9223372036854775807L)) goto L30;
        r0.putLong(t, r8);
    L30:
        long r9 = this.i;
        if (r9 == (-9223372036854775807L)) goto L33;
        r0.putLong(u, r9);
    L33:
        long r11 = this.j;
        if (r10 >= 3) goto L36;
    L39:
        r0.putLong(v, r11);
        return r0;
    L36:
        if (r11 != 0) goto L39;
        return r0;
    L19:
        if (r5 == 0) goto L21;
    L5:
        if (k.a(r1) == true) goto L7;
        goto L6
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L31:
        return false;
    L8:
        if (za4.class != r7.getClass()) goto L31;
        za4 r8 = (za4) r7;
        if (this.c != r8.c) goto L31;
        if (this.a.equals(r8.a) == false) goto L31;
        if (this.b != r8.b) goto L31;
        if (this.d != r8.d) goto L31;
        if (this.e != r8.e) goto L31;
        if (this.f != r8.f) goto L31;
        if (this.g != r8.g) goto L31;
        if (this.h != r8.h) goto L31;
        if (this.i != r8.i) goto L31;
        if (this.j != r8.j) goto L31;
        return true;
    }

    public final int hashCode() {
        Boolean r0 = Boolean.valueOf(this.b);
        return Objects.hash(new Object[]{this.a, r0});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        pi3 r1 = this.a;
        r0.append(r1.b);
        r0.append(", periodIndex=");
        r0.append(r1.e);
        r0.append(", positionMs=");
        r0.append(r1.f);
        r0.append(", contentPositionMs=");
        r0.append(r1.g);
        r0.append(", adGroupIndex=");
        r0.append(r1.h);
        r0.append(", adIndexInAdGroup=");
        r0.append(r1.i);
        r0.append("}, isPlayingAd=");
        r0.append(this.b);
        r0.append(", eventTimeMs=");
        r0.append(this.c);
        r0.append(", durationMs=");
        r0.append(this.d);
        r0.append(", bufferedPositionMs=");
        r0.append(this.e);
        r0.append(", bufferedPercentage=");
        r0.append(this.f);
        r0.append(", totalBufferedDurationMs=");
        r0.append(this.g);
        r0.append(", currentLiveOffsetMs=");
        r0.append(this.h);
        r0.append(", contentDurationMs=");
        r0.append(this.i);
        r0.append(", contentBufferedPositionMs=");
        return b11.p(r0, this.j, "}");
    }
}
