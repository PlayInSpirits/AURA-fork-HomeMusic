package defpackage;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cx2 implements eo0 {
    public boolean A;
    public cx2 n;
    public we0 o;
    public int p;
    public int q;
    public cx2 r;
    public cx2 s;
    public c83 t;
    public f63 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public fa z;

    public cx2() {
        this.n = this;
        this.q = -1;
    }

    public final we0 e0() {
        we0 r0 = this.o;
        if (r0 != null) goto L6;
        td0 r1 = te5.a(((ra) j51.P(this)).getCoroutineContext().J(new t22((s22) ((ra) j51.P(this)).getCoroutineContext().K(fz0.h0))));
        this.o = r1;
        return r1;
    L6:
        return r0;
    }

    public boolean f0() {
        return !(this instanceof vo);
    }

    public void g0() {
        if (this.A == false) goto L6;
        cz1.b("node attached multiple times");
    L6:
        if (this.u != null) goto L9;
        cz1.b("attach invoked on a node without a coordinator");
    L9:
        this.A = true;
        this.x = true;
    }

    public void h0() {
        if (this.A == true) goto L6;
        cz1.b("Cannot detach a node that is not attached");
    L6:
        if (this.x == false) goto L9;
        cz1.b("Must run runAttachLifecycle() before markAsDetached()");
    L9:
        if (this.y == false) goto L11;
        cz1.b("Must run runDetachLifecycle() before markAsDetached()");
    L11:
        this.A = false;
        we0 r0 = this.o;
        if (r0 == null) goto L15;
        te5.g(r0, new ModifierNodeDetachedCancellationException());
        this.o = null;
        return;
    }

    public void i0() {
    }

    public void j0() {
    }

    public void k0() {
    }

    public void l0() {
        if (this.A == true) goto L5;
        cz1.b("reset() called on an unattached node");
    L5:
        k0();
    }

    public void m0() {
        if (this.A == true) goto L6;
        cz1.b("Must run markAsAttached() prior to runAttachLifecycle");
    L6:
        if (this.x == true) goto L8;
        cz1.b("Must run runAttachLifecycle() only once after markAsAttached()");
    L8:
        this.x = false;
        i0();
        this.y = true;
    }

    public void n0() {
        if (this.A == true) goto L6;
        cz1.b("node detached multiple times");
    L6:
        if (this.u != null) goto L10;
        cz1.b("detach invoked on a node without a coordinator");
    L10:
        if (this.y == true) goto L12;
        cz1.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
    L12:
        this.y = false;
        fa r0 = this.z;
        if (r0 == null) goto L15;
        r0.invoke();
    L15:
        j0();
    }

    public void o0(cx2 r1) {
        this.n = r1;
    }

    public void p0(f63 r1) {
        this.u = r1;
    }
}
