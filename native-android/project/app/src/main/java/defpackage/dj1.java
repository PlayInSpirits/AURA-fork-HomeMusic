package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.internal.a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dj1 {
    public final Context a;
    public final String b;
    public final rf2 c;
    public final le d;
    public final ve e;
    public final Looper f;
    public final int g;
    public final if5 h;
    public final pa i;
    public final ij1 j;

    public dj1(Context context, HiddenActivity hiddenActivity, rf2 rf2Var, le leVar, cj1 cj1Var) {
        ph5 ph5Var;
        ji2.n(context, "Null context is not permitted.");
        ji2.n(rf2Var, "Api must not be null.");
        ji2.n(cj1Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        ji2.n(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = rf2Var;
        this.d = leVar;
        this.f = cj1Var.b;
        ve veVar = new ve(rf2Var, leVar, attributionTag);
        this.e = veVar;
        this.h = new if5(this);
        ij1 ij1VarF = ij1.f(applicationContext);
        this.j = ij1VarF;
        this.g = ij1VarF.u.getAndIncrement();
        this.i = cj1Var.a;
        if (hiddenActivity != null && Looper.myLooper() == Looper.getMainLooper()) {
            WeakHashMap weakHashMap = ph5.q;
            WeakReference weakReference = (WeakReference) weakHashMap.get(hiddenActivity);
            if (weakReference == null || (ph5Var = (ph5) weakReference.get()) == null) {
                try {
                    ph5Var = (ph5) hiddenActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (ph5Var == null || ph5Var.isRemoving()) {
                        ph5Var = new ph5();
                        hiddenActivity.getFragmentManager().beginTransaction().add(ph5Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(hiddenActivity, new WeakReference(ph5Var));
                } catch (ClassCastException e) {
                    mj0.j("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
                    throw null;
                }
            }
            df5 df5Var = (df5) ph5Var.c();
            if (df5Var == null) {
                Object obj = ej1.b;
                df5Var = new df5(ph5Var, ij1VarF);
            }
            df5Var.s.add(veVar);
            ij1VarF.a(df5Var);
        }
        zw2 zw2Var = ij1VarF.A;
        zw2Var.sendMessage(zw2Var.obtainMessage(7, this));
    }

    public final c12 a() {
        c12 c12Var = new c12(3);
        Set set = Collections.EMPTY_SET;
        if (((qi) c12Var.o) == null) {
            c12Var.o = new qi(0);
        }
        ((qi) c12Var.o).addAll(set);
        Context context = this.a;
        c12Var.q = context.getClass().getName();
        c12Var.p = context.getPackageName();
        return c12Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    public final jw b(int i, bk bkVar) {
        nf5 nf5Var;
        cr4 cr4Var = new cr4();
        jw jwVar = cr4Var.a;
        pa paVar = this.i;
        ij1 ij1Var = this.j;
        zw2 zw2Var = ij1Var.A;
        int i2 = bkVar.o;
        if (i2 != 0) {
            ve veVar = this.e;
            if (ij1Var.b()) {
                e34 e34Var = (e34) d34.E().o;
                boolean z = true;
                if (e34Var != null) {
                    if (e34Var.o) {
                        boolean z2 = e34Var.p;
                        gf5 gf5Var = (gf5) ij1Var.w.get(veVar);
                        if (gf5Var != null) {
                            me meVar = gf5Var.f;
                            if (meVar instanceof a) {
                                a aVar = (a) meVar;
                                if (aVar.H == null || aVar.c0()) {
                                    z = z2;
                                } else {
                                    pa0 pa0VarB = nf5.b(gf5Var, aVar, i2);
                                    if (pa0VarB != null) {
                                        gf5Var.p++;
                                        z = pa0VarB.p;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    nf5Var = null;
                }
                nf5Var = new nf5(ij1Var, i2, veVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                nf5Var = null;
            }
            if (nf5Var != null) {
                zw2Var.getClass();
                ok okVar = new ok(zw2Var, 3);
                jwVar.getClass();
                ((mf4) jwVar.p).i(new hk5(okVar, nf5Var));
                jwVar.v();
            }
        }
        zw2Var.sendMessage(zw2Var.obtainMessage(4, new pf5(new xf5(i, bkVar, cr4Var, paVar), ij1Var.v.get(), this)));
        return jwVar;
    }
}
