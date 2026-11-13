package defpackage;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class cx2 implements eo0 {
    public boolean A;
    public we0 o;
    public int p;
    public cx2 r;
    public cx2 s;
    public c83 t;
    public f63 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public fa z;
    public cx2 n = this;
    public int q = -1;

    public final we0 e0() {
        we0 we0Var = this.o;
        if (we0Var != null) {
            return we0Var;
        }
        td0 a = te5.a(((ra) j51.P(this)).getCoroutineContext().J(new t22((s22) ((ra) j51.P(this)).getCoroutineContext().K(fz0.h0))));
        this.o = a;
        return a;
    }

    public boolean f0() {
        return !(this instanceof vo);
    }

    public void g0() {
        if (this.A) {
            cz1.b("node attached multiple times");
        }
        if (this.u == null) {
            cz1.b("attach invoked on a node without a coordinator");
        }
        this.A = true;
        this.x = true;
    }

    public void h0() {
        if (!this.A) {
            cz1.b("Cannot detach a node that is not attached");
        }
        if (this.x) {
            cz1.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.y) {
            cz1.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.A = false;
        we0 we0Var = this.o;
        if (we0Var != null) {
            te5.g(we0Var, new ModifierNodeDetachedCancellationException());
            this.o = null;
        }
    }

    public void l0() {
        if (!this.A) {
            cz1.b("reset() called on an unattached node");
        }
        k0();
    }

    public void m0() {
        if (!this.A) {
            cz1.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.x) {
            cz1.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.x = false;
        i0();
        this.y = true;
    }

    public void n0() {
        if (!this.A) {
            cz1.b("node detached multiple times");
        }
        if (this.u == null) {
            cz1.b("detach invoked on a node without a coordinator");
        }
        if (!this.y) {
            cz1.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.y = false;
        fa faVar = this.z;
        if (faVar != null) {
            faVar.invoke();
        }
        j0();
    }

    public void o0(cx2 cx2Var) {
        this.n = cx2Var;
    }

    public void p0(f63 f63Var) {
        this.u = f63Var;
    }

    public void i0() {
    }

    public void j0() {
    }

    public void k0() {
    }
}
