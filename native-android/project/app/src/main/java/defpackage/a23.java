package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a23 implements ba2, f75, ml1, j54 {
    public final Context n;
    public r23 o;
    public final Bundle p;
    public r92 q;
    public final j23 r;
    public final String s;
    public final Bundle t;
    public final ea2 u = new ea2(this, true);
    public final gp3 v = new gp3(new xm2(this, new wc(22, this)));
    public boolean w;
    public r92 x;
    public final k54 y;

    public a23(Context context, r23 r23Var, Bundle bundle, r92 r92Var, j23 j23Var, String str, Bundle bundle2) {
        this.n = context;
        this.o = r23Var;
        this.p = bundle;
        this.q = r92Var;
        this.r = j23Var;
        this.s = str;
        this.t = bundle2;
        rp4 rp4Var = new rp4(new zf0(2, this));
        this.x = r92.o;
        this.y = (k54) rp4Var.getValue();
    }

    @Override // defpackage.ml1
    public final b75 a() {
        return this.y;
    }

    @Override // defpackage.ml1
    public final f03 b() {
        f03 f03Var = new f03(0);
        Context applicationContext = this.n.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = f03Var.a;
        if (application != null) {
            linkedHashMap.put(a75.d, application);
        }
        linkedHashMap.put(e54.a, this);
        linkedHashMap.put(e54.b, this);
        Bundle bundleC = c();
        if (bundleC != null) {
            linkedHashMap.put(e54.c, bundleC);
        }
        return f03Var;
    }

    public final Bundle c() {
        Bundle bundle = this.p;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // defpackage.f75
    public final e75 d() {
        if (!this.w) {
            kf2.o("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (this.u.h == r92.n) {
            kf2.o("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        j23 j23Var = this.r;
        if (j23Var == null) {
            kf2.o("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = this.s;
        str.getClass();
        LinkedHashMap linkedHashMap = j23Var.b;
        e75 e75Var = (e75) linkedHashMap.get(str);
        if (e75Var != null) {
            return e75Var;
        }
        e75 e75Var2 = new e75();
        linkedHashMap.put(str, e75Var2);
        return e75Var2;
    }

    public final void e() {
        if (!this.w) {
            gp3 gp3Var = this.v;
            ((xm2) gp3Var.o).a();
            this.w = true;
            if (this.r != null) {
                e54.b(this);
            }
            gp3Var.s(this.t);
        }
        int iOrdinal = this.q.ordinal();
        int iOrdinal2 = this.x.ordinal();
        ea2 ea2Var = this.u;
        if (iOrdinal < iOrdinal2) {
            ea2Var.g(this.q);
        } else {
            ea2Var.g(this.x);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof a23)) {
            a23 a23Var = (a23) obj;
            Bundle bundle = a23Var.p;
            if (h12.c(this.s, a23Var.s) && h12.c(this.o, a23Var.o) && h12.c(this.u, a23Var.u) && h12.c((rm3) this.v.p, (rm3) a23Var.v.p)) {
                Bundle bundle2 = this.p;
                if (h12.c(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!h12.c(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.j54
    public final rm3 f() {
        return (rm3) this.v.p;
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return this.u;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.o.hashCode() + (this.s.hashCode() * 31);
        Bundle bundle = this.p;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((rm3) this.v.p).hashCode() + ((this.u.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a23.class.getSimpleName());
        sb.append("(" + this.s + ')');
        sb.append(" destination=");
        sb.append(this.o);
        return sb.toString();
    }
}
