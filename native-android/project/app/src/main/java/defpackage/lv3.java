package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lv3 {
    public z80 a;
    public int b;
    public mg1 c;
    public wf1 d;
    public int e;
    public p03 f;
    public w03 g;

    public lv3(z80 r1) {
        this.a = r1;
    }

    public final boolean a() {
        if (this.a == null) goto L11;
        mg1 r2 = this.c;
        if (r2 == null) goto L7;
        boolean r3 = r2.a();
    L8:
        if (r3 == false) goto L11;
        return true;
    L7:
        r3 = false;
    L11:
        return false;
    }

    public final p12 b(Object r2) {
        z80 r0 = this.a;
        if (r0 == null) goto L9;
        p12 r1 = r0.s(this, r2);
        if (r1 == null) goto L9;
        return r1;
    L9:
        return p12.n;
    }

    public final void c() {
        z80 r0 = this.a;
        if (r0 == null) goto L5;
        r0.B = true;
        r0.G.r();
    L5:
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean r2) {
        int r0 = this.b;
        if (r2 == false) goto L5;
        int r3 = r0 | 32;
    L6:
        this.b = r3;
        return;
    L5:
        r3 = r0 & (-33);
        goto L6
    }
}
