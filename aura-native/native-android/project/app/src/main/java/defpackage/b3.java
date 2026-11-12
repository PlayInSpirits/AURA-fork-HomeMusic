package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b3 {
    public Object a;
    public Object b;

    public b3(String str, Bundle bundle) {
        bundle.getClass();
        this.a = str;
        this.b = bundle;
    }

    public void c() {
        v9 v9Var = (v9) this.a;
        if (v9Var != null) {
            try {
                ((bg) this.b).x.unregisterReceiver(v9Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void d() {
        pj4 pj4Var = (pj4) this.a;
        gz gzVar = (gz) this.b;
        LinkedHashSet linkedHashSet = pj4Var.e;
        if (linkedHashSet.remove(gzVar) && linkedHashSet.isEmpty()) {
            pj4Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int[] f(int i);

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof oo4)) {
            return menuItem;
        }
        oo4 oo4Var = (oo4) menuItem;
        if (((yd4) this.b) == null) {
            this.b = new yd4(0);
        }
        MenuItem menuItem2 = (MenuItem) ((yd4) this.b).get(oo4Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        xu2 xu2Var = new xu2((Context) this.a, oo4Var);
        ((yd4) this.b).put(oo4Var, xu2Var);
        return xu2Var;
    }

    public int[] i(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String j() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        h12.Q("text");
        throw null;
    }

    public boolean k() {
        pj4 pj4Var = (pj4) this.a;
        View view = pj4Var.c.T;
        view.getClass();
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    kf2.n(f34.f(visibility, "Unknown visibility "));
                    return false;
                }
                i = 3;
            }
        }
        int i2 = pj4Var.a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    public abstract void l();

    public abstract int[] m(int i);

    public void n() {
        c();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((v9) this.a) == null) {
            this.a = new v9(1, this);
        }
        ((bg) this.b).x.registerReceiver((v9) this.a, intentFilterE);
    }

    public b3(Context context) {
        this.a = context;
    }

    public b3() {
        this.b = new int[2];
    }

    public b3(pj4 pj4Var, gz gzVar) {
        this.a = pj4Var;
        this.b = gzVar;
    }

    public b3(bg bgVar) {
        this.b = bgVar;
    }
}
