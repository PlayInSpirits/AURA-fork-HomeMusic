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
    public final pz1 o;
    public final oj2 p;
    public final ArrayList q;
    public final oi r;
    public oj2 s;
    public final zk t;
    public pr2 u;
    public final hg3 v;
    public final tn2 w;
    public final na4 x;
    public final si1 y;
    public final tn2 z;

    public pn2(tn2 r9) {
        this.o = new pz1(5, this);
        this.p = new oj2(this, "android.media.session.MediaController", -1, -1, null);
        this.q = new ArrayList();
        this.r = new oi(0);
        Looper r0 = Looper.myLooper();
        r0.getClass();
        zk r8 = new zk(r0);
        r8.b = this;
        this.t = r8;
        this.v = hg3.E(r9.f);
        this.w = r9;
        this.x = new na4(r9);
        this.z = r9;
        this.y = new si1(9, this);
    }

    public static lb4 a(pn2 r8, m92 r9) {
        rr2.s(r9, "LibraryResult must not be null");
        lb4 r6 = new lb4();
        if (r9.a != 0) goto L20;
        Object r10 = r9.c;
        if (r10 == null) goto L20;
        yw1 r4 = (yw1) r10;
        if (r4.isEmpty() == false) goto L11;
        r6.l(new ArrayList());
        return r6;
    L11:
        ArrayList r5 = new ArrayList();
        ws1 r11 = new ws1(16, r6, r5);
        gq0 r0 = gq0.n;
        r6.f(r11, r0);
        int r12 = 0;
        t6 r1 = new t6(r8, new AtomicInteger(0), r4, r5, r6);
    L13:
        if (r12 >= r4.size()) goto L19;
        byte[] r13 = ((gn2) r4.get(r12)).d.k;
        if (r13 != null) goto L17;
        r5.add(null);
        r1.run();
    L18:
        r12 = r12 + 1;
        goto L13
    L17:
        ic2 r14 = r8.z.m.j(r13);
        r5.add(r14);
        ((k91) r14).f(r1, r0);
        goto L18
    L19:
        return r6;
    L20:
        r6.l(null);
        return r6;
    }

    public final fr2 b() {
        bq4 r0 = this.n;
        r0.getClass();
        ms2 r1 = r0.j();
        return this.x.w(r1);
    }

    public final void c(pr2 r5) {
        attachBaseContext(this.w.f);
        onCreate();
        if (r5 != null) goto L5;
        kf2.n("Session token may not be null");
        return;
    L5:
        if (this.u != null) goto L8;
        this.u = r5;
        bq4 r4 = this.n;
        r4.getClass();
        boolean r3 = false;
        ((pn2) r4.q).t.b(new lg1(r4, r5, r3, 19));
        return;
    L8:
        kf2.o("The session token has already been set");
    }

    public final void d(String r8, uj2 r9, Bundle r10) {
        fr2 r2 = b();
        if (r2 != null) goto L7;
        r9.f(null);
        return;
    L7:
        if (TextUtils.isEmpty(r8) == false) goto L10;
        l93.q0("MLSLegacyStub", "onLoadChildren(): Ignoring empty parentId from " + r2);
        r9.f(null);
        return;
    L10:
        r9.a();
        f35.W(this.z.l, new mr(this, r2, r9, r10, r8));
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor r1, PrintWriter r2, String[] r3) {
    }

    public final void e(String r4, uj2 r5) {
        fr2 r0 = b();
        if (r0 != null) goto L7;
        r5.f(null);
        return;
    L7:
        if (TextUtils.isEmpty(r4) == false) goto L10;
        l93.q0("MLSLegacyStub", "Ignoring empty itemId from " + r0);
        r5.f(null);
        return;
    L10:
        r5.a();
        f35.W(this.z.l, new v6(this, r0, r5, r4));
    }

    public final void f(String r5) {
        fr2 r0 = b();
        if (r0 != null) goto L6;
        return;
    L6:
        if (TextUtils.isEmpty(r5) == false) goto L9;
        l93.q0("MLSLegacyStub", "onUnsubscribe(): Ignoring empty id from " + r0);
        return;
    L9:
        f35.W(this.z.l, new v6(this, r0, r5, 27));
    }

    public final void g(String r8, oj2 r9, Bundle r10, Bundle r11) {
        mj2 r0 = new mj2(this, r8, r9, r8, r10, r11);
        this.s = r9;
        if (r10 != null) goto L5;
        d(r8, r0, null);
    L6:
        this.s = null;
        if (r0.b() == false) goto L9;
        return;
    L9:
        nz2.y("onLoadChildren must call detach() or sendResult() before returning for package=", r9.a, " id=", r8);
        return;
    L5:
        d(r8, r0, r10);
        goto L6
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent r1) {
        bq4 r0 = this.n;
        r0.getClass();
        qj2 r2 = (qj2) r0.o;
        r2.getClass();
        return r2.onBind(r1);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 28) goto L6;
        this.n = new tj2(this);
    L9:
        this.n.r();
        return;
    L6:
        if (r0 < 26) goto L8;
        this.n = new sj2(this);
        goto L9
    L8:
        this.n = new bq4(this);
        goto L9
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.t.b = null;
    }
}
