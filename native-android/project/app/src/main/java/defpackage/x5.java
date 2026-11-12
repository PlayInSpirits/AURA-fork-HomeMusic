package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 {
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
    public static final String w = null;
    public static final String x = null;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final gn2[] e;
    public final int[] f;
    public final long[] g;
    public final String[] h;
    public final y5[] i;
    public final long j;
    public final boolean k;
    public final boolean l;

    static {
        String r0 = f35.a;
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
        w = Integer.toString(10, 36);
        x = Integer.toString(11, 36);
    }

    public x5(long r6, int r8, int r9, int[] r10, gn2[] r11, long[] r12, long r13, boolean r15, String[] r16, y5[] r17, boolean r18) {
        int r3 = 0;
        boolean r4 = true;
        if (r10.length != r11.length) goto L5;
        boolean r1 = true;
    L6:
        rr2.l(r1);
        if (r10.length == r17.length) goto L10;
        r4 = false;
    L10:
        rr2.l(r4);
        this.a = r6;
        this.b = r8;
        this.c = r9;
        this.f = r10;
        this.e = r11;
        this.g = r12;
        this.j = r13;
        this.k = r15;
        this.d = new Uri[r11.length];
    L11:
        Uri[] r7 = this.d;
        if (r3 >= r7.length) goto L18;
        gn2 r14 = r11[r3];
        if (r14 != null) goto L16;
        Uri r19 = null;
    L17:
        r7[r3] = r19;
        r3 = r3 + 1;
        goto L11
    L16:
        bn2 r20 = r14.b;
        r20.getClass();
        r19 = r20.a;
        goto L17
    L18:
        this.h = r16;
        this.i = r17;
        this.l = r18;
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final int a(int r4) {
        int r5 = r4 + 1;
    L3:
        int[] r1 = this.f;
        if (r5 >= r1.length) goto L12;
        if (this.k == true) goto L12;
        int r2 = r1[r5];
        if (r2 == 0) goto L12;
        if (r2 == 1) goto L12;
        r5 = r5 + 1;
    L12:
        return r5;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L33:
        return false;
    L8:
        if (x5.class != r7.getClass()) goto L33;
        x5 r8 = (x5) r7;
        if (this.a != r8.a) goto L33;
        if (this.b != r8.b) goto L33;
        if (this.c != r8.c) goto L33;
        if (Arrays.equals(this.e, r8.e) == false) goto L33;
        if (Arrays.equals(this.f, r8.f) == false) goto L33;
        if (Arrays.equals(this.g, r8.g) == false) goto L33;
        if (this.j != r8.j) goto L33;
        if (this.k != r8.k) goto L33;
        if (Arrays.equals(this.h, r8.h) == false) goto L33;
        if (Arrays.equals(this.i, r8.i) == false) goto L33;
        if (this.l != r8.l) goto L33;
        return true;
    }

    public final int hashCode() {
        int r0 = ((this.b * 31) + this.c) * 31;
        long r1 = this.a;
        int r2 = (r0 + ((int) (r1 ^ (r1 >>> 32)))) * 31;
        int r3 = (Arrays.hashCode(this.e) + r2) * 31;
        int r4 = (Arrays.hashCode(this.f) + r3) * 31;
        int r5 = (Arrays.hashCode(this.g) + r4) * 31;
        long r6 = this.j;
        int r7 = (((((r5 + ((int) ((r6 >>> 32) ^ r6))) * 31) + (this.k ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31;
        return ((Arrays.hashCode(this.i) + r7) * 31) + (this.l ? 1 : 0);
    }
}
