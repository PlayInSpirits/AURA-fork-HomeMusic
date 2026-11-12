package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pn2 extends Service {
    public bq4 n;
    public final pz1 o = new pz1(5, this);
    public final oj2 p = new oj2(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList q = new ArrayList();
    public final oi r = new oi(0);
    public oj2 s;
    public final zk t;
    public pr2 u;
    public final hg3 v;
    public final tn2 w;
    public final na4 x;
    public final si1 y;
    public final tn2 z;

    public pn2(tn2 tn2Var) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        zk zkVar = new zk(looperMyLooper);
        zkVar.b = this;
        this.t = zkVar;
        this.v = hg3.E(tn2Var.f);
        this.w = tn2Var;
        this.x = new na4(tn2Var);
        this.z = tn2Var;
        this.y = new si1(9, this);
    }

    public static lb4 a(pn2 pn2Var, m92 m92Var) {
        Object obj;
        rr2.s(m92Var, "LibraryResult must not be null");
        lb4 lb4Var = new lb4();
        if (m92Var.a != 0 || (obj = m92Var.c) == null) {
            lb4Var.l(null);
            return lb4Var;
        }
        yw1 yw1Var = (yw1) obj;
        if (yw1Var.isEmpty()) {
            lb4Var.l(new ArrayList());
            return lb4Var;
        }
        ArrayList arrayList = new ArrayList();
        ws1 ws1Var = new ws1(16, lb4Var, arrayList);
        gq0 gq0Var = gq0.n;
        lb4Var.f(ws1Var, gq0Var);
        t6 t6Var = new t6(pn2Var, new AtomicInteger(0), yw1Var, arrayList, lb4Var);
        for (int i = 0; i < yw1Var.size(); i++) {
            byte[] bArr = ((gn2) yw1Var.get(i)).d.k;
            if (bArr == null) {
                arrayList.add(null);
                t6Var.run();
            } else {
                ic2 ic2VarJ = pn2Var.z.m.j(bArr);
                arrayList.add(ic2VarJ);
                ((k91) ic2VarJ).f(t6Var, gq0Var);
            }
        }
        return lb4Var;
    }

    public final fr2 b() {
        bq4 bq4Var = this.n;
        bq4Var.getClass();
        return this.x.w(bq4Var.j());
    }

    public final void c(pr2 pr2Var) {
        attachBaseContext(this.w.f);
        onCreate();
        if (pr2Var == null) {
            kf2.n("Session token may not be null");
            return;
        }
        if (this.u != null) {
            kf2.o("The session token has already been set");
            return;
        }
        this.u = pr2Var;
        bq4 bq4Var = this.n;
        bq4Var.getClass();
        ((pn2) bq4Var.q).t.b(new lg1(bq4Var, pr2Var, false, 19));
    }

    public final void d(String str, uj2 uj2Var, Bundle bundle) {
        fr2 fr2VarB = b();
        if (fr2VarB == null) {
            uj2Var.f(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            uj2Var.a();
            f35.W(this.z.l, new mr(this, fr2VarB, uj2Var, bundle, str));
        } else {
            l93.q0("MLSLegacyStub", "onLoadChildren(): Ignoring empty parentId from " + fr2VarB);
            uj2Var.f(null);
        }
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final void e(String str, uj2 uj2Var) {
        fr2 fr2VarB = b();
        if (fr2VarB == null) {
            uj2Var.f(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            uj2Var.a();
            f35.W(this.z.l, new v6(this, fr2VarB, uj2Var, str));
        } else {
            l93.q0("MLSLegacyStub", "Ignoring empty itemId from " + fr2VarB);
            uj2Var.f(null);
        }
    }

    public final void f(String str) {
        fr2 fr2VarB = b();
        if (fr2VarB == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            f35.W(this.z.l, new v6(this, fr2VarB, str, 27));
            return;
        }
        l93.q0("MLSLegacyStub", "onUnsubscribe(): Ignoring empty id from " + fr2VarB);
    }

    public final void g(String str, oj2 oj2Var, Bundle bundle, Bundle bundle2) {
        mj2 mj2Var = new mj2(this, str, oj2Var, str, bundle, bundle2);
        this.s = oj2Var;
        if (bundle == null) {
            d(str, mj2Var, null);
        } else {
            d(str, mj2Var, bundle);
        }
        this.s = null;
        if (mj2Var.b()) {
            return;
        }
        nz2.y("onLoadChildren must call detach() or sendResult() before returning for package=", oj2Var.a, " id=", str);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        bq4 bq4Var = this.n;
        bq4Var.getClass();
        qj2 qj2Var = (qj2) bq4Var.o;
        qj2Var.getClass();
        return qj2Var.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.n = new tj2(this);
        } else if (i >= 26) {
            this.n = new sj2(this);
        } else {
            this.n = new bq4(this);
        }
        this.n.r();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.t.b = null;
    }
}
