package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ai4 implements Comparable {
    public boolean n;
    public int o;
    public int p;
    public int q;
    public float r;
    public boolean s;
    public final float[] t;
    public final float[] u;
    public pi[] v;
    public int w;
    public int x;
    public int y;

    public ai4(int r4) {
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.s = false;
        this.t = new float[9];
        this.u = new float[9];
        this.v = new pi[16];
        this.w = 0;
        this.x = 0;
        this.y = r4;
    }

    public final void a(pi r4) {
        int r0 = 0;
    L3:
        int r1 = this.w;
        pi[] r2 = this.v;
        if (r0 >= r1) goto L10;
        if (r2[r0] == r4) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return;
    L10:
        if (r1 < r2.length) goto L12;
        this.v = (pi[]) Arrays.copyOf(r2, r2.length * 2);
    L12:
        pi[] r3 = this.v;
        int r5 = this.w;
        r3[r5] = r4;
        this.w = r5 + 1;
    }

    public final void b(pi r5) {
        int r0 = this.w;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L12;
        if (this.v[r1] == r5) goto L7;
        r1 = r1 + 1;
    L7:
        if (r1 >= (r0 - 1)) goto L9;
        pi[] r6 = this.v;
        int r2 = r1 + 1;
        r6[r1] = r6[r2];
        r1 = r2;
        goto L7
    L9:
        this.w--;
        return;
    }

    public final void c() {
        this.y = 5;
        this.q = 0;
        this.o = -1;
        this.p = -1;
        this.r = 0.0f;
        this.s = false;
        int r2 = this.w;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        this.v[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.w = 0;
        this.x = 0;
        this.n = false;
        Arrays.fill(this.u, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r1) {
        return this.o - ((ai4) r1).o;
    }

    public final void d(eb2 r4, float r5) {
        this.r = r5;
        this.s = true;
        int r6 = this.w;
        this.p = -1;
        int r1 = 0;
    L3:
        if (r1 >= r6) goto L5;
        this.v[r1].h(r4, this, false);
        r1 = r1 + 1;
        goto L3
    L5:
        this.w = 0;
    }

    public final void e(eb2 r5, pi r6) {
        int r0 = this.w;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        this.v[r2].i(r5, r6, false);
        r2 = r2 + 1;
        goto L3
    L5:
        this.w = 0;
    }

    public final String toString() {
        return "" + this.o;
    }
}
