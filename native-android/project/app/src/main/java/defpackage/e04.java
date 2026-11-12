package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.a;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e04 implements Handler.Callback {
    public static final hh3 r = new hh3(15);
    public volatile c04 n;
    public final d04 o;
    public final pe1 p;
    public final rf2 q;

    public e04(d04 d04Var) {
        d04Var = d04Var == null ? r : d04Var;
        this.o = d04Var;
        rf2 rf2Var = new rf2();
        rf2Var.n = new HashMap();
        rf2Var.o = d04Var;
        this.q = rf2Var;
        this.p = (ll1.f && ll1.e) ? new j71() : new om0(7);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final c04 b(Context context) {
        if (context == null) {
            kf2.n("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof nc1) {
                nc1 nc1Var = (nc1) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(nc1Var.getApplicationContext());
                }
                if (nc1Var.isDestroyed()) {
                    kf2.n("You cannot start a load for a destroyed activity");
                    return null;
                }
                this.p.i(nc1Var);
                Activity activityA = a(nc1Var);
                boolean z = activityA == null || !activityA.isFinishing();
                a aVarA = a.a(nc1Var.getApplicationContext());
                rf2 rf2Var = this.q;
                ea2 ea2Var = nc1Var.n;
                nc1Var.k();
                rf2Var.getClass();
                e35.m();
                e35.m();
                c04 c04Var = (c04) ((HashMap) rf2Var.n).get(ea2Var);
                if (c04Var != null) {
                    return c04Var;
                }
                y92 y92Var = new y92(ea2Var);
                c04 c04VarA = ((d04) rf2Var.o).a(aVarA, y92Var, new tv1(), nc1Var);
                ((HashMap) rf2Var.n).put(ea2Var, c04VarA);
                y92Var.f(new fa2(rf2Var, ea2Var));
                if (z) {
                    c04VarA.n();
                }
                return c04VarA;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.n == null) {
            synchronized (this) {
                try {
                    if (this.n == null) {
                        this.n = this.o.a(a.a(context.getApplicationContext()), new pa(8), new om0(23), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.n;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
