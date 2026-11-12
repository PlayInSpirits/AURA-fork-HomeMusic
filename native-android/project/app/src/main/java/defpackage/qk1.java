package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 extends ba5 {
    @Override // defpackage.uo0
    public final void a(uo0 r3) {
        yo0 r4 = this.h;
        if (r4.c == true) goto L6;
        return;
    L6:
        if (r4.j == false) goto L8;
        return;
    L8:
        r4.d((int) ((((yo0) r4.l.get(0)).g * ((pk1) this.b).p0) + 0.5f));
    }

    @Override // defpackage.ba5
    public final void d() {
        jc0 r0 = this.b;
        pk1 r1 = (pk1) r0;
        int r2 = r1.q0;
        int r3 = r1.r0;
        int r4 = r1.t0;
        yo0 r5 = this.h;
        if (r4 != 1) goto L11;
        if (r2 == (-1)) goto L6;
        r5.l.add(r0.S.d.h);
        this.b.S.d.h.k.add(r5);
        r5.f = r2;
    L9:
        m(this.b.d.h);
        m(this.b.d.i);
        return;
    L6:
        if (r3 == (-1)) goto L8;
        r5.l.add(r0.S.d.i);
        this.b.S.d.i.k.add(r5);
        r5.f = -r3;
        goto L9
    L8:
        r5.b = true;
        r5.l.add(r0.S.d.i);
        this.b.S.d.i.k.add(r5);
        goto L9
    L11:
        if (r2 == (-1)) goto L13;
        r5.l.add(r0.S.e.h);
        this.b.S.e.h.k.add(r5);
        r5.f = r2;
    L16:
        m(this.b.e.h);
        m(this.b.e.i);
        return;
    L13:
        if (r3 == (-1)) goto L15;
        r5.l.add(r0.S.e.i);
        this.b.S.e.i.k.add(r5);
        r5.f = -r3;
        goto L16
    L15:
        r5.b = true;
        r5.l.add(r0.S.e.i);
        this.b.S.e.i.k.add(r5);
        goto L16
    }

    @Override // defpackage.ba5
    public final void e() {
        jc0 r0 = this.b;
        int r1 = ((pk1) r0).t0;
        yo0 r3 = this.h;
        if (r1 != 1) goto L6;
        r0.X = r3.g;
        return;
    L6:
        r0.Y = r3.g;
    }

    @Override // defpackage.ba5
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.ba5
    public final boolean k() {
        return false;
    }

    public final void m(yo0 r2) {
        yo0 r1 = this.h;
        r1.k.add(r2);
        r2.l.add(r1);
    }
}
