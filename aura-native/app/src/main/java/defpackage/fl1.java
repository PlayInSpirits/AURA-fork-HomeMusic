package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fl1 extends pe0 implements ao0 {
    public final Handler p;
    public final String q;
    public final boolean r;
    public final fl1 s;

    public fl1(Handler handler, String str, boolean z) {
        this.p = handler;
        this.q = str;
        this.r = z;
        this.s = z ? this : new fl1(handler, str, true);
    }

    @Override // defpackage.ao0
    public final as0 F(long j, final gu4 gu4Var, ne0 ne0Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.p.postDelayed(gu4Var, j)) {
            return new as0() { // from class: el1
                @Override // defpackage.as0
                public final void a() {
                    fl1.this.p.removeCallbacks(gu4Var);
                }
            };
        }
        a0(ne0Var, gu4Var);
        return k63.n;
    }

    @Override // defpackage.ao0
    public final void H(long j, cz czVar) {
        lg1 lg1Var = new lg1(15, czVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.p.postDelayed(lg1Var, j)) {
            czVar.w(new o(9, this, lg1Var));
        } else {
            a0(czVar.r, lg1Var);
        }
    }

    @Override // defpackage.pe0
    public final void W(ne0 ne0Var, Runnable runnable) {
        if (this.p.post(runnable)) {
            return;
        }
        a0(ne0Var, runnable);
    }

    @Override // defpackage.pe0
    public final boolean Y(ne0 ne0Var) {
        return (this.r && h12.c(Looper.myLooper(), this.p.getLooper())) ? false : true;
    }

    public final void a0(ne0 ne0Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        s22 s22Var = (s22) ne0Var.K(fz0.h0);
        if (s22Var != null) {
            s22Var.f(cancellationException);
        }
        rm0 rm0Var = rr0.a;
        il0.p.W(ne0Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fl1)) {
            return false;
        }
        fl1 fl1Var = (fl1) obj;
        return fl1Var.p == this.p && fl1Var.r == this.r;
    }

    public final int hashCode() {
        return (this.r ? 1231 : 1237) ^ System.identityHashCode(this.p);
    }

    @Override // defpackage.pe0
    public final String toString() {
        fl1 fl1Var;
        String str;
        rm0 rm0Var = rr0.a;
        fl1 fl1Var2 = uf2.a;
        if (this == fl1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                fl1Var = fl1Var2.s;
            } catch (UnsupportedOperationException unused) {
                fl1Var = null;
            }
            str = this == fl1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.q;
        if (str2 == null) {
            str2 = this.p.toString();
        }
        if (!this.r) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public fl1(Handler handler) {
        this(handler, null, false);
    }
}
