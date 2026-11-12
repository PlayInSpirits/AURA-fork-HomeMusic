package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sm1 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final yw1 l;
    public final yw1 m;
    public final gy3 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public sm1(String r2, Uri r3, Uri r4, long r5, long r7, long r9, long r11, ArrayList r13, boolean r14, long r15, long r17, ArrayList r19, ArrayList r20, ArrayList r21, boolean r22, String r23, String r24, long r25, long r27, String r29) {
        if (r3 == null) goto L5;
        if (r4 == null) goto L5;
    L8:
        boolean r0 = false;
    L10:
        rr2.l(r0);
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r7;
        this.f = r9;
        this.g = r11;
        this.h = r13;
        this.i = r14;
        this.j = r15;
        this.k = r17;
        this.l = yw1.k(r19);
        this.m = yw1.k(r20);
        this.n = yw1.q(new n7(14), r21);
        this.o = r22;
        this.p = r23;
        this.q = r24;
        this.r = r25;
        this.s = r27;
        this.t = r29;
        return;
    L5:
        if (r3 != null) goto L9;
        if (r4 == null) goto L8;
    L9:
        r0 = true;
        goto L10
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof sm1) == false) goto L71;
        sm1 r6 = (sm1) r5;
        if (this.d == r6.d) goto L10;
        return false;
    L10:
        if (this.e == r6.e) goto L12;
        return false;
    L12:
        if (this.f == r6.f) goto L14;
        return false;
    L14:
        if (this.g == r6.g) goto L16;
        return false;
    L16:
        if (this.i == r6.i) goto L18;
        return false;
    L18:
        if (this.j == r6.j) goto L20;
        return false;
    L20:
        if (this.k == r6.k) goto L22;
        return false;
    L22:
        if (this.o == r6.o) goto L24;
        return false;
    L24:
        if (this.r == r6.r) goto L26;
        return false;
    L26:
        if (this.s == r6.s) goto L28;
        return false;
    L28:
        if (Objects.equals(this.a, r6.a) == true) goto L30;
        return false;
    L30:
        if (Objects.equals(this.b, r6.b) == true) goto L32;
        return false;
    L32:
        if (Objects.equals(this.c, r6.c) == true) goto L34;
        return false;
    L34:
        if (Objects.equals(this.h, r6.h) == true) goto L36;
        return false;
    L36:
        if (Objects.equals(this.l, r6.l) == true) goto L38;
        return false;
    L38:
        if (Objects.equals(this.m, r6.m) == true) goto L40;
        return false;
    L40:
        if (Objects.equals(this.n, r6.n) == true) goto L42;
        return false;
    L42:
        if (Objects.equals(this.p, r6.p) == true) goto L44;
        return false;
    L44:
        if (Objects.equals(this.q, r6.q) == true) goto L46;
        return false;
    L46:
        if (Objects.equals(this.t, r6.t) == false) goto L70;
        return true;
    L70:
        return false;
    L71:
        return false;
    }

    public final int hashCode() {
        Long r6 = Long.valueOf(this.d);
        Long r7 = Long.valueOf(this.e);
        Long r8 = Long.valueOf(this.f);
        Long r9 = Long.valueOf(this.g);
        Boolean r11 = Boolean.valueOf(this.i);
        Long r12 = Long.valueOf(this.j);
        Long r13 = Long.valueOf(this.k);
        Boolean r17 = Boolean.valueOf(this.o);
        Long r20 = Long.valueOf(this.r);
        Long r21 = Long.valueOf(this.s);
        String r1 = this.t;
        return Objects.hash(new Object[]{this.a, this.b, this.c, r6, r7, r8, r9, this.h, r11, r12, r13, this.l, this.m, this.n, r17, this.p, this.q, r20, r21, r1});
    }
}
