package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mj4 implements Cloneable {
    public /* synthetic */ boolean n;
    public /* synthetic */ int[] o;
    public /* synthetic */ Object[] p;
    public /* synthetic */ int q;

    public mj4(int r4) {
        int r0 = 4;
    L3:
        int r2 = 40;
        if (r0 >= 32) goto L9;
        int r1 = (1 << r0) - 12;
        if (40 <= r1) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        r2 = r1;
    L9:
        int r3 = r2 / 4;
        this.o = new int[r3];
        this.p = new Object[r3];
    }

    public final mj4 a() {
        Object r0 = super.clone();
        r0.getClass();
        mj4 r1 = (mj4) r0;
        r1.o = (int[]) this.o.clone();
        r1.p = (Object[]) this.p.clone();
        return r1;
    }

    public final Object b(int r3) {
        int[] r0 = this.o;
        int r4 = su3.h(this.q, r3, r0);
        if (r4 < 0) goto L8;
        Object r2 = this.p[r4];
        if (r2 == su3.f) goto L10;
        return r2;
    L10:
        return null;
    L8:
        return null;
    }

    public final int c(int r2) {
        if (this.n == false) goto L6;
        su3.f(this);
    L6:
        return this.o[r2];
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public final void d(int r7, Object r8) {
        int r0 = su3.h(this.q, r7, this.o);
        if (r0 < 0) goto L6;
        this.p[r0] = r8;
        return;
    L6:
        int r1 = ~r0;
        int r2 = this.q;
        if (r1 >= r2) goto L13;
        Object[] r3 = this.p;
        if (r3[r1] != su3.f) goto L13;
        this.o[r1] = r7;
        r3[r1] = r8;
        return;
    L13:
        if (this.n == true) goto L15;
    L17:
        int r4 = this.q;
        if (r4 < this.o.length) goto L27;
        int r5 = (r4 + 1) * 4;
        int r6 = 4;
    L21:
        if (r6 >= 32) goto L26;
        int r9 = (1 << r6) - 12;
        if (r5 <= r9) goto L24;
        r6 = r6 + 1;
        goto L21
    L24:
        r5 = r9;
    L26:
        int r10 = r5 / 4;
        this.o = Arrays.copyOf(this.o, r10);
        this.p = Arrays.copyOf(this.p, r10);
    L27:
        int r11 = this.q;
        if ((r11 - r1) == 0) goto L30;
        int[] r12 = this.o;
        int r13 = r1 + 1;
        ti.Y(r13, r1, r11, r12, r12);
        Object[] r14 = this.p;
        ti.Z(r13, r1, this.q, r14, r14);
    L30:
        this.o[r1] = r7;
        this.p[r1] = r8;
        this.q++;
        return;
    L15:
        if (r2 < this.o.length) goto L17;
        su3.f(this);
        r1 = ~su3.h(this.q, r7, this.o);
        goto L17
    }

    public final int e() {
        if (this.n == false) goto L6;
        su3.f(this);
    L6:
        return this.q;
    }

    public final Object f(int r2) {
        if (this.n == false) goto L5;
        su3.f(this);
    L5:
        Object[] r1 = this.p;
        if (r2 >= r1.length) goto L10;
        return r1[r2];
    L10:
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (e() > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r0 = new StringBuilder(this.q * 28);
        r0.append('{');
        int r1 = this.q;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L15;
        if (r2 <= 0) goto L10;
        r0.append(", ");
    L10:
        r0.append(c(r2));
        r0.append('=');
        Object r3 = f(r2);
        if (r3 == this) goto L13;
        r0.append(r3);
    L14:
        r2 = r2 + 1;
        goto L7
    L13:
        r0.append("(this Map)");
        goto L14
    L15:
        r0.append('}');
        return r0.toString();
    }
}
