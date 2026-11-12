package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bu4 {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final Object p = null;
    public static final Object q = null;
    public static final gn2 r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    public Object a;
    public gn2 b;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public an2 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        p = new Object();
        q = new Object();
        um2 r0 = new um2();
        xm2 r1 = new xm2();
        List r7 = Collections.EMPTY_LIST;
        gy3 r9 = gy3.r;
        zm2 r12 = new zm2();
        cn2 r19 = cn2.d;
        Uri r3 = Uri.EMPTY;
        if (((Uri) r1.e) != null) goto L5;
    L8:
        boolean r2 = true;
    L9:
        rr2.w(r2);
        ym2 r4 = null;
        if (r3 != null) goto L12;
        bn2 r16 = null;
    L17:
        r = new gn2("androidx.media3.common.Timeline", new wm2(r0), r16, new an2(r12), do2.K, r19);
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(7, 36);
        z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        return;
    L12:
        if (((UUID) r1.d) == null) goto L14;
        r4 = new ym2(r1);
    L14:
        r16 = new bn2(r3, null, r4, null, r7, null, r9, -9223372036854775807L);
        goto L17
    L5:
        if (((UUID) r1.d) != null) goto L8;
        r2 = false;
        goto L9
    }

    public bu4() {
        this.a = p;
        this.b = r;
    }

    public final boolean a() {
        if (this.i == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void b(Object r1, gn2 r2, Object r3, long r4, long r6, long r8, boolean r10, boolean r11, an2 r12, long r13, long r15, int r17, int r18, long r19) {
        this.a = r1;
        if (r2 == null) goto L5;
        gn2 r5 = r2;
    L6:
        this.b = r5;
        if (r2 == null) goto L9;
        bn2 r7 = r2.b;
    L9:
        this.c = r3;
        this.d = r4;
        this.e = r6;
        this.f = r8;
        this.g = r10;
        this.h = r11;
        this.i = r12;
        this.k = r13;
        this.l = r15;
        this.m = r17;
        this.n = r18;
        this.o = r19;
        this.j = false;
        return;
    L5:
        r5 = r;
        goto L6
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L41:
        return false;
    L8:
        if (bu4.class.equals(r7.getClass()) == false) goto L41;
        bu4 r8 = (bu4) r7;
        if (Objects.equals(this.a, r8.a) == false) goto L41;
        if (Objects.equals(this.b, r8.b) == false) goto L41;
        if (Objects.equals(this.c, r8.c) == false) goto L41;
        if (Objects.equals(this.i, r8.i) == false) goto L41;
        if (this.d != r8.d) goto L41;
        if (this.e != r8.e) goto L41;
        if (this.f != r8.f) goto L41;
        if (this.g != r8.g) goto L41;
        if (this.h != r8.h) goto L41;
        if (this.j != r8.j) goto L41;
        if (this.k != r8.k) goto L41;
        if (this.l != r8.l) goto L41;
        if (this.m != r8.m) goto L41;
        if (this.n != r8.n) goto L41;
        if (this.o != r8.o) goto L41;
        return true;
    }

    public final int hashCode() {
        int r1 = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object r0 = this.c;
        int r2 = 0;
        if (r0 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r1 + r3) * 31;
        an2 r5 = this.i;
        if (r5 == null) goto L10;
        r2 = r5.hashCode();
    L10:
        int r6 = (r4 + r2) * 31;
        long r7 = this.d;
        int r8 = (r6 + ((int) (r7 ^ (r7 >>> 32)))) * 31;
        long r9 = this.e;
        int r10 = (r8 + ((int) (r9 ^ (r9 >>> 32)))) * 31;
        long r11 = this.f;
        int r12 = (((((((r10 + ((int) (r11 ^ (r11 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long r13 = this.k;
        int r14 = (r12 + ((int) (r13 ^ (r13 >>> 32)))) * 31;
        long r15 = this.l;
        int r16 = (((((r14 + ((int) (r15 ^ (r15 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long r17 = this.o;
        return r16 + ((int) (r17 ^ (r17 >>> 32)));
    L5:
        r3 = r0.hashCode();
        goto L6
    }
}
