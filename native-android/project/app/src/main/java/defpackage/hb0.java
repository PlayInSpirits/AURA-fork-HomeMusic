package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hb0 {
    public HashSet a;
    public int b;
    public boolean c;
    public final jc0 d;
    public final int e;
    public hb0 f;
    public int g;
    public int h;
    public ai4 i;

    public hb0(jc0 r2, int r3) {
        this.a = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.d = r2;
        this.e = r3;
    }

    public final void a(hb0 r2, int r3, int r4) {
        if (r2 != null) goto L5;
        g();
        return;
    L5:
        this.f = r2;
        if (r2.a != null) goto L8;
        r2.a = new HashSet();
    L8:
        HashSet r5 = this.f.a;
        if (r5 == null) goto L11;
        r5.add(this);
    L11:
        this.g = r3;
        this.h = r4;
    }

    public final void b(int r2, aa5 r3, ArrayList r4) {
        HashSet r1 = this.a;
        if (r1 == null) goto L8;
        Iterator r5 = r1.iterator();
    L6:
        if (r5.hasNext() == false) goto L10;
        gi1.n(((hb0) r5.next()).d, r2, r4, r3);
        goto L6
    L10:
        return;
    }

    public final int c() {
        if (this.c == true) goto L7;
        return 0;
    L7:
        return this.b;
    }

    public final int d() {
        if (this.d.f0 != 8) goto L6;
        return 0;
    L6:
        int r0 = this.h;
        if (r0 == Integer.MIN_VALUE) goto L14;
        hb0 r2 = this.f;
        if (r2 == null) goto L14;
        if (r2.d.f0 != 8) goto L14;
        return r0;
    L14:
        return this.g;
    }

    public final boolean e() {
        HashSet r3 = this.a;
        if (r3 == null) goto L21;
        Iterator r4 = r3.iterator();
    L7:
        if (r4.hasNext() == false) goto L27;
        hb0 r0 = (hb0) r4.next();
        jc0 r1 = r0.d;
        int r2 = r0.e;
        switch(xa3.w(r2)) {
            case 0: goto L16;
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L13;
            case 4: goto L12;
            case 5: goto L16;
            case 6: goto L16;
            case 7: goto L16;
            case 8: goto L16;
            default: goto L11;
        };
    L12:
        hb0 r5 = r1.I;
    L18:
        if (r5.f() == false) goto L7;
        return true;
    L13:
        r5 = r1.H;
        goto L18
    L14:
        r5 = r1.K;
        goto L18
    L15:
        r5 = r1.J;
        goto L18
    L16:
        r5 = null;
        goto L18
    L11:
        throw new AssertionError(xa3.v(r2));
    L27:
        return false;
    L21:
        return false;
    }

    public final boolean f() {
        if (this.f == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void g() {
        hb0 r0 = this.f;
        if (r0 == null) goto L9;
        HashSet r1 = r0.a;
        if (r1 == null) goto L9;
        r1.remove(this);
        if (this.f.a.size() != 0) goto L9;
        this.f.a = null;
    L9:
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void h() {
        ai4 r0 = this.i;
        if (r0 != null) goto L6;
        this.i = new ai4(1);
        return;
    L6:
        r0.c();
    }

    public final void i(int r1) {
        this.b = r1;
        this.c = true;
    }

    public final String toString() {
        return this.d.g0 + ":" + xa3.v(this.e);
    }
}
