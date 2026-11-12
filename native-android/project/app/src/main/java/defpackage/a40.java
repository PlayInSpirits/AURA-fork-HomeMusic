package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a40 implements q44 {
    public final q44 n;
    public boolean o;
    public final /* synthetic */ b40 p;

    public a40(b40 r1, q44 r2) {
        this.p = r1;
        this.n = r2;
    }

    @Override // defpackage.q44
    public final boolean c() {
        if (this.p.a() == false) goto L5;
        return false;
    L5:
        if (this.n.c() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.q44
    public final void s() {
        this.n.s();
    }

    @Override // defpackage.q44
    public final int t(gp3 r12, cj0 r13, int r14) {
        b40 r0 = this.p;
        if (r0.a() == false) goto L6;
        return -3;
    L6:
        if (this.o == false) goto L9;
        r13.o = 4;
        return -4;
    L9:
        long r5 = r0.q();
        int r15 = this.n.t(r12, r13, r14);
        if (r15 != (-5)) goto L24;
        tb1 r11 = (tb1) r12.p;
        r11.getClass();
        int r16 = r11.J;
        int r17 = r11.I;
        if (r17 != 0) goto L17;
        if (r16 != 0) goto L17;
        return -5;
    L17:
        if (r0.s == 0) goto L20;
        r17 = 0;
    L20:
        if (r0.t == Long.MIN_VALUE) goto L22;
        r16 = 0;
    L22:
        sb1 r18 = r11.a();
        r18.H = r17;
        r18.I = r16;
        r12.p = new tb1(r18);
        return -5;
    L24:
        long r1 = r0.t;
        if (r1 == Long.MIN_VALUE) goto L36;
        if (r15 == (-4)) goto L28;
    L29:
        if (r15 != (-3)) goto L36;
        if (r5 != Long.MIN_VALUE) goto L36;
        if (r13.s == true) goto L36;
    L34:
        r13.r();
        r13.o = 4;
        this.o = true;
        return -4;
    L28:
        if (r13.t >= r1) goto L34;
    L36:
        return r15;
    }

    @Override // defpackage.q44
    public final int u(long r2) {
        if (this.p.a() == false) goto L7;
        return -3;
    L7:
        return this.n.u(r2);
    }
}
