package defpackage;

import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends a32 implements vd0, we0 {
    public final ne0 r;

    public c0(ne0 r1, boolean r2) {
        super(r2);
        N((s22) r1.K(fz0.h0));
        this.r = r1.J(this);
    }

    @Override // defpackage.a32
    public final void L(CompletionHandlerException r1) {
        uc5.s(this.r, r1);
    }

    @Override // defpackage.a32
    public final void X(Object r3) {
        if ((r3 instanceof a70) == false) goto L10;
        a70 r4 = (a70) r3;
        Throwable r0 = r4.a;
        if (a70.b.get(r4) == 0) goto L7;
        boolean r5 = true;
    L8:
        j0(r0, r5);
        return;
    L7:
        r5 = false;
        goto L8
    L10:
        k0(r3);
    }

    @Override // defpackage.we0
    public final ne0 e() {
        return this.r;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.r;
    }

    public void j0(Throwable r1, boolean r2) {
    }

    public void k0(Object r1) {
    }

    public final void l0(ze0 r4, c0 r5, wf1 r6) {
        int r7 = r4.ordinal();
        j15 r0 = j15.a;
        if (r7 != 0) goto L5;
        uc5.T(ya4.x(ya4.i(r5, this, r6)), r0);     // Catch: Throwable -> L34
        return;
    L34:
        th = move-exception;
        resumeWith(new s14(th));
        throw th;
    L5:
        if (r7 != 1) goto L7;
        return;
    L7:
        if (r7 != 2) goto L9;
        r6.getClass();
        ya4.x(ya4.i(r5, this, r6)).resumeWith(r0);
        return;
    L9:
        if (r7 == 3) goto L40;
        er1.n();
        return;
    L40:
        ne0 r8 = this.r;     // Catch: Throwable -> L22
        Object r1 = te5.R(r8, null);     // Catch: Throwable -> L22
    L14:
        th = move-exception;
        te5.K(r8, r1);     // Catch: Throwable -> L22
        throw th;     // Catch: Throwable -> L22
    L12:
        if ((r6 instanceof jp) == true) goto L16;
        Object r9 = ya4.Q(r6, r5, this);     // Catch: Throwable -> L14
    L17:
        te5.K(r8, r1);     // Catch: Throwable -> L22
        if (r9 == xe0.n) goto L42;
        resumeWith(r9);
        return;
    L42:
        return;
    L16:
        jz4.j(2, r6);     // Catch: Throwable -> L14
        r9 = r6.invoke(r5, this);     // Catch: Throwable -> L14
    L22:
        th = move-exception;
        resumeWith(new s14(th));
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object r3) {
        Throwable r0 = bb3.a(r3);
        if (r0 == null) goto L6;
        r3 = new a70(r0, false);
    L6:
        Object r4 = S(r3);
        if (r4 != zz1.e) goto L9;
        return;
    L9:
        m(r4);
    }

    @Override // defpackage.a32
    public final String x() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
