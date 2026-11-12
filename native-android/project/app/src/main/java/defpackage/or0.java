package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class or0 extends br4 {
    public int p;

    public or0(int r4) {
        super(false, 0);
        this.p = r4;
    }

    public void b(CancellationException r1) {
    }

    public abstract vd0 d();

    public Throwable e(Object r2) {
        if ((r2 instanceof a70) == false) goto L5;
        a70 r3 = (a70) r2;
    L6:
        if (r3 != null) goto L8;
        return null;
    L8:
        return r3.a;
    L5:
        r3 = null;
        goto L6
    }

    public Object f(Object r1) {
        return r1;
    }

    public final void g(Throwable r4) {
        uc5.s(d().getContext(), new cf0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", r4));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        vd0 r0 = d();     // Catch: Throwable -> L6
        r0.getClass();     // Catch: Throwable -> L6
        mr0 r1 = (mr0) r0;     // Catch: Throwable -> L6
        wd0 r2 = r1.r;     // Catch: Throwable -> L6
        Object r3 = r1.t;     // Catch: Throwable -> L6
        ne0 r4 = r2.getContext();     // Catch: Throwable -> L6
        Object r5 = te5.R(r4, r3);     // Catch: Throwable -> L6
        s22 r6 = null;
        if (r5 == te5.b) goto L8;
        f15 r7 = jz4.Q(r2, r4, r5);     // Catch: Throwable -> L6
    L42:
        ne0 r8 = r2.getContext();     // Catch: Throwable -> L19
        Object r9 = h();     // Catch: Throwable -> L19
        Throwable r10 = e(r9);     // Catch: Throwable -> L19
        if (r10 != null) goto L21;
        int r11 = this.p;     // Catch: Throwable -> L19
        boolean r12 = true;
        if (r11 != 1) goto L14;
    L17:
        if (r12 == false) goto L21;
        r6 = (s22) r8.K(fz0.h0);     // Catch: Throwable -> L19
        goto L21
    L14:
        if (r11 == 2) goto L17;
        r12 = false;
    L21:
        if (r6 != null) goto L23;
    L25:
        if (r10 == null) goto L27;
        r2.resumeWith(new s14(r10));     // Catch: Throwable -> L19
    L28:
        if (r7 != null) goto L30;
    L33:
        te5.K(r4, r5);     // Catch: Throwable -> L6
        return;
    L30:
        if (r7.m0() == true) goto L33;
        return;
    L27:
        r2.resumeWith(f(r9));     // Catch: Throwable -> L19
        goto L28
    L23:
        if (r6.b() == true) goto L25;
        CancellationException r13 = r6.q();     // Catch: Throwable -> L19
        b(r13);     // Catch: Throwable -> L19
        r2.resumeWith(kb4.o(r13));     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        if (r7 != null) goto L37;
    L38:
        te5.K(r4, r5);     // Catch: Throwable -> L6
    L39:
        throw th;     // Catch: Throwable -> L6
    L37:
        if (r7.m0() == false) goto L39;
    L8:
        r7 = null;
    L6:
        th = move-exception;
        g(th);
    }
}
