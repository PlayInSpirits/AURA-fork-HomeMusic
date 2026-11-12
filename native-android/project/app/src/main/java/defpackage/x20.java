package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x20 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public x20(int r1) {
        this.a = r1;
    }

    public void a(sa0 r7) {
        Object[] r0 = (Object[]) this.d;
        int r1 = this.b;
        r0[r1] = r7;
        int r8 = this.c & (r1 + 1);
        this.b = r8;
        int r2 = this.a;
        if (r8 != r2) goto L10;
        int r9 = r0.length;
        int r3 = r9 - r2;
        int r4 = r9 << 1;
        if (r4 < 0) goto L8;
        Object[] r5 = new Object[r4];
        ti.Z(0, r2, r9, r0, r5);
        ti.Z(r3, 0, this.a, (Object[]) this.d, r5);
        this.d = r5;
        this.a = 0;
        this.b = r9;
        this.c = r4 - 1;
        return;
    L8:
        tb4.e("Max array capacity exceeded");
        return;
    }

    public hp0 b() {
        if (this.b > this.c) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        return new hp0(this);
    L5:
        r0 = false;
        goto L6
    }

    public int c(int r2) {
        return ((ya3) this.d).f[this.b + r2];
    }

    public Object d(int r2) {
        return ((ya3) this.d).h[this.c + r2];
    }
}
