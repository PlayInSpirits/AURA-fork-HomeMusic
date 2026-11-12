package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pf {
    public static final ia4 n = new ia4(new of(0));
    public static int o = -100;
    public static wd2 p = null;
    public static wd2 q = null;
    public static Boolean r = null;
    public static boolean s = false;
    public static final qi t = new qi(0);
    public static final Object u = new Object();
    public static final Object v = new Object();

    public static void a() {
        wd2 wd2Var;
        qi qiVar = t;
        qiVar.getClass();
        ki kiVar = new ki(qiVar);
        while (kiVar.hasNext()) {
            pf pfVar = (pf) ((WeakReference) kiVar.next()).get();
            if (pfVar != null) {
                bg bgVar = (bg) pfVar;
                Context context = bgVar.x;
                int i = 1;
                if (e(context) && (wd2Var = p) != null && !wd2Var.equals(q)) {
                    n.execute(new lf(context, i));
                }
                bgVar.r(true, true);
            }
        }
    }

    public static Object b() {
        Context context;
        qi qiVar = t;
        qiVar.getClass();
        ki kiVar = new ki(qiVar);
        while (kiVar.hasNext()) {
            pf pfVar = (pf) ((WeakReference) kiVar.next()).get();
            if (pfVar != null && (context = ((bg) pfVar).x) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean e(Context context) {
        if (r == null) {
            try {
                int i = AppLocalesMetadataHolderService.n;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), xh.a() | 128).metaData;
                if (bundle != null) {
                    r = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                r = Boolean.FALSE;
            }
        }
        return r.booleanValue();
    }

    public static void h(bg bgVar) {
        synchronized (u) {
            try {
                qi qiVar = t;
                qiVar.getClass();
                ki kiVar = new ki(qiVar);
                while (kiVar.hasNext()) {
                    pf pfVar = (pf) ((WeakReference) kiVar.next()).get();
                    if (pfVar == bgVar || pfVar == null) {
                        kiVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void j(wd2 wd2Var) {
        Objects.requireNonNull(wd2Var);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objB = b();
            if (objB != null) {
                nf.b(objB, mf.a(wd2Var.a.a.toLanguageTags()));
                return;
            }
            return;
        }
        if (wd2Var.equals(p)) {
            return;
        }
        synchronized (u) {
            p = wd2Var;
            a();
        }
    }

    public static void o(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (o != i) {
            o = i;
            synchronized (u) {
                try {
                    qi qiVar = t;
                    qiVar.getClass();
                    ki kiVar = new ki(qiVar);
                    while (kiVar.hasNext()) {
                        pf pfVar = (pf) ((WeakReference) kiVar.next()).get();
                        if (pfVar != null) {
                            ((bg) pfVar).r(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void q(Context context) {
        if (e(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (s) {
                    return;
                }
                n.execute(new lf(context, 0));
                return;
            }
            synchronized (v) {
                try {
                    wd2 wd2Var = p;
                    if (wd2Var == null) {
                        if (q == null) {
                            q = wd2.a(si0.I(context));
                        }
                        if (q.a.a.isEmpty()) {
                        } else {
                            p = q;
                        }
                    } else if (!wd2Var.equals(q)) {
                        wd2 wd2Var2 = p;
                        q = wd2Var2;
                        si0.F(context, wd2Var2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int i);

    public abstract void k(int i);

    public abstract void l(View view);

    public abstract void n(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void p(CharSequence charSequence);
}
