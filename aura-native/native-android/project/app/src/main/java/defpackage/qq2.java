package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qq2 {
    public final Context n;
    public final om1 o;
    public final zk p = new zk(8, this);
    public si1 q;
    public up2 r;
    public boolean s;
    public xk0 t;
    public boolean u;

    public qq2(Context context, om1 om1Var) {
        if (context == null) {
            kf2.n("context must not be null");
            throw null;
        }
        this.n = context;
        if (om1Var != null) {
            this.o = om1Var;
        } else {
            this.o = new om1(10, new ComponentName(context, getClass()));
        }
    }

    public nq2 a(String str, pq2 pq2Var) {
        if (str != null) {
            return null;
        }
        kf2.n("initialMemberRouteId cannot be null.");
        return null;
    }

    public oq2 b(String str) {
        if (str != null) {
            return null;
        }
        kf2.n("routeId cannot be null");
        return null;
    }

    public oq2 c(String str, pq2 pq2Var) {
        return b(str);
    }

    public oq2 d(String str, String str2) {
        if (str == null) {
            kf2.n("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return c(str, pq2.b);
        }
        kf2.n("routeGroupId cannot be null");
        return null;
    }

    public abstract void e(up2 up2Var);

    public final void f(xk0 xk0Var) {
        yq2.b();
        if (this.t != xk0Var) {
            this.t = xk0Var;
            if (this.u) {
                return;
            }
            this.u = true;
            this.p.sendEmptyMessage(1);
        }
    }

    public final void g(up2 up2Var) {
        yq2.b();
        if (Objects.equals(this.r, up2Var)) {
            return;
        }
        this.r = up2Var;
        if (this.s) {
            return;
        }
        this.s = true;
        this.p.sendEmptyMessage(2);
    }
}
