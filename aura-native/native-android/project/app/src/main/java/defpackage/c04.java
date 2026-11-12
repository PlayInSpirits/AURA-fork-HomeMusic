package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class c04 implements ComponentCallbacks2, z92 {
    public static final g04 x = (g04) ((g04) new g04().d(Bitmap.class)).k();
    public final a n;
    public final Context o;
    public final s92 p;
    public final mf4 q;
    public final f04 r;
    public final zq4 s;
    public final g5 t;
    public final ua0 u;
    public final CopyOnWriteArrayList v;
    public g04 w;

    static {
    }

    public c04(a aVar, s92 s92Var, f04 f04Var, Context context) {
        g04 g04Var;
        mf4 mf4Var = new mf4(6);
        i80 i80Var = aVar.s;
        this.s = new zq4();
        g5 g5Var = new g5(27, this);
        this.t = g5Var;
        this.n = aVar;
        this.p = s92Var;
        this.r = f04Var;
        this.q = mf4Var;
        this.o = context;
        Context applicationContext = context.getApplicationContext();
        b04 b04Var = new b04(this, mf4Var);
        i80Var.getClass();
        boolean z = ud3.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        ua0 wj0Var = z ? new wj0(applicationContext, b04Var) : new k73();
        this.u = wj0Var;
        synchronized (aVar.t) {
            if (aVar.t.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.t.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            s92Var.f(this);
        } else {
            e35.C().post(g5Var);
        }
        s92Var.f(wj0Var);
        this.v = new CopyOnWriteArrayList(aVar.p.e);
        ii1 ii1Var = aVar.p;
        synchronized (ii1Var) {
            try {
                if (ii1Var.j == null) {
                    ii1Var.j = (g04) ii1Var.d.build().k();
                }
                g04Var = ii1Var.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        w(g04Var);
    }

    public synchronized void a(g04 g04Var) {
        synchronized (this) {
            this.w = (g04) this.w.a(g04Var);
        }
    }

    public vz3 f(Class cls) {
        return new vz3(this.n, this, cls, this.o);
    }

    public vz3 g() {
        return f(Bitmap.class).a(x);
    }

    @Override // defpackage.z92
    public final synchronized void h() {
        int i;
        this.s.h();
        synchronized (this) {
            try {
                ArrayList arrayListB = e35.B(this.s.n);
                int size = arrayListB.size();
                i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListB.get(i2);
                    i2++;
                    q((wq4) obj);
                }
                this.s.n.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        mf4 mf4Var = this.q;
        ArrayList arrayListB2 = e35.B((Set) mf4Var.p);
        int size2 = arrayListB2.size();
        while (i < size2) {
            Object obj2 = arrayListB2.get(i);
            i++;
            mf4Var.c((pz3) obj2);
        }
        ((HashSet) mf4Var.q).clear();
        this.p.a(this);
        this.p.a(this.u);
        e35.C().removeCallbacks(this.t);
        a aVar = this.n;
        synchronized (aVar.t) {
            if (!aVar.t.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            aVar.t.remove(this);
        }
    }

    @Override // defpackage.z92
    public final synchronized void j() {
        this.s.j();
        u();
    }

    @Override // defpackage.z92
    public final synchronized void n() {
        v();
        this.s.n();
    }

    public vz3 o() {
        return f(Drawable.class);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public vz3 p() {
        vz3 vz3VarF = f(File.class);
        if (g04.I == null) {
            g04.I = (g04) ((g04) new g04().y(true)).b();
        }
        return vz3VarF.a(g04.I);
    }

    public final void q(wq4 wq4Var) {
        if (wq4Var == null) {
            return;
        }
        boolean zX = x(wq4Var);
        pz3 pz3VarL = wq4Var.l();
        if (zX) {
            return;
        }
        a aVar = this.n;
        synchronized (aVar.t) {
            try {
                ArrayList arrayList = aVar.t;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((c04) obj).x(wq4Var)) {
                        return;
                    }
                }
                if (pz3VarL != null) {
                    wq4Var.e(null);
                    pz3VarL.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public vz3 r(Uri uri) {
        return o().N(uri);
    }

    public vz3 s(File file) {
        return o().O(file);
    }

    public vz3 t(String str) {
        return o().P(str);
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.q + ", treeNode=" + this.r + "}";
    }

    public final synchronized void u() {
        mf4 mf4Var = this.q;
        mf4Var.o = true;
        ArrayList arrayListB = e35.B((Set) mf4Var.p);
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            pz3 pz3Var = (pz3) obj;
            if (pz3Var.isRunning()) {
                pz3Var.c();
                ((HashSet) mf4Var.q).add(pz3Var);
            }
        }
    }

    public final synchronized void v() {
        mf4 mf4Var = this.q;
        int i = 0;
        mf4Var.o = false;
        ArrayList arrayListB = e35.B((Set) mf4Var.p);
        int size = arrayListB.size();
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            pz3 pz3Var = (pz3) obj;
            if (!pz3Var.d() && !pz3Var.isRunning()) {
                pz3Var.k();
            }
        }
        ((HashSet) mf4Var.q).clear();
    }

    public synchronized void w(g04 g04Var) {
        this.w = (g04) ((g04) g04Var.clone()).b();
    }

    public final synchronized boolean x(wq4 wq4Var) {
        pz3 pz3VarL = wq4Var.l();
        if (pz3VarL == null) {
            return true;
        }
        if (!this.q.c(pz3VarL)) {
            return false;
        }
        this.s.n.remove(wq4Var);
        wq4Var.e(null);
        return true;
    }
}
