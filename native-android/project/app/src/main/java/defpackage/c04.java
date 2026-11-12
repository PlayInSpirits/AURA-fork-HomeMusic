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
    public static final g04 x = null;
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
        x = (g04) ((g04) new g04().d(Bitmap.class)).k();
        g04 r0 = (g04) ((g04) new g04().d(vh1.class)).k();
        g04 r1 = (g04) ((g04) ((g04) new g04().e(xq0.d)).s()).y(true);
    }

    public c04(a r7, s92 r8, f04 r9, Context r10) {
        mf4 r0 = new mf4(6);
        i80 r1 = r7.s;
        this.s = new zq4();
        g5 r2 = new g5(27, this);
        this.t = r2;
        this.n = r7;
        this.p = r8;
        this.r = r9;
        this.q = r0;
        this.o = r10;
        Context r11 = r10.getApplicationContext();
        b04 r12 = new b04(this, r0);
        r1.getClass();
        boolean r3 = false;
        if (ud3.c(r11, "android.permission.ACCESS_NETWORK_STATE") != 0) goto L5;
        boolean r4 = true;
    L7:
        if (Log.isLoggable("ConnectivityMonitor", 3) == false) goto L12;
        if (r4 == false) goto L10;
        String r5 = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
    L11:
        Log.d("ConnectivityMonitor", r5);
        goto L12
    L10:
        r5 = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
    L12:
        if (r4 == false) goto L14;
        ua0 r6 = new wj0(r11, r12);
    L15:
        this.u = r6;
        ArrayList r13 = r7.t;
        monitor-enter(r13);
    L40:
        th = move-exception;
        throw th;
    L18:
        if (r7.t.contains(this) == true) goto L43;
        r7.t.add(this);     // Catch: Throwable -> L40
        monitor-exit(r13);     // Catch: Throwable -> L40
        if (Looper.myLooper() != Looper.getMainLooper()) goto L24;
        r3 = true;
    L24:
        if (r3 == true) goto L26;
        e35.C().post(r2);
    L27:
        r8.f(r6);
        this.v = new CopyOnWriteArrayList(r7.p.e);
        ii1 r14 = r7.p;
        monitor-enter(r14);
    L32:
        th = move-exception;
        throw th;
    L30:
        if (r14.j != null) goto L34;
        r14.j = (g04) r14.d.build().k();     // Catch: Throwable -> L32
    L34:
        g04 r15 = r14.j;     // Catch: Throwable -> L32
        monitor-exit(r14);
        w(r15);
        return;
    L26:
        r8.f(this);
        goto L27
    L43:
        throw new IllegalStateException("Cannot register already registered manager");     // Catch: Throwable -> L40
    L14:
        r6 = new k73();
        goto L15
    L5:
        r4 = false;
        goto L7
    }

    public synchronized void a(g04 r2) {
        monitor-enter(this);
        monitor-enter(this);     // Catch: Throwable -> L13
        this.w = (g04) this.w.a(r2);     // Catch: Throwable -> L8
        monitor-exit(this);     // Catch: Throwable -> L13
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;
    }

    public vz3 f(Class r4) {
        return new vz3(this.n, this, r4, this.o);
    }

    public vz3 g() {
        return f(Bitmap.class).G(x);
    }

    @Override // defpackage.z92
    public final synchronized void h() {
        monitor-enter(this);
        this.s.h();     // Catch: Throwable -> L29
        monitor-enter(this);     // Catch: Throwable -> L29
        ArrayList r0 = e35.B(this.s.n);     // Catch: Throwable -> L8
        int r1 = r0.size();     // Catch: Throwable -> L8
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L10;
        Object r4 = r0.get(r3);     // Catch: Throwable -> L8
        r3 = r3 + 1;     // Catch: Throwable -> L8
        q((wq4) r4);     // Catch: Throwable -> L8
        goto L6
    L10:
        this.s.n.clear();     // Catch: Throwable -> L8
        monitor-exit(this);     // Catch: Throwable -> L29
        mf4 r5 = this.q;     // Catch: Throwable -> L29
        ArrayList r6 = e35.B((Set) r5.p);     // Catch: Throwable -> L29
        int r7 = r6.size();     // Catch: Throwable -> L29
    L13:
        if (r2 >= r7) goto L15;
        Object r8 = r6.get(r2);     // Catch: Throwable -> L29
        r2 = r2 + 1;     // Catch: Throwable -> L29
        r5.c((pz3) r8);     // Catch: Throwable -> L29
        goto L13
    L15:
        ((HashSet) r5.q).clear();     // Catch: Throwable -> L29
        this.p.a(this);     // Catch: Throwable -> L29
        this.p.a(this.u);     // Catch: Throwable -> L29
        e35.C().removeCallbacks(this.t);     // Catch: Throwable -> L29
        a r9 = this.n;     // Catch: Throwable -> L29
        ArrayList r10 = r9.t;     // Catch: Throwable -> L29
        monitor-enter(r10);     // Catch: Throwable -> L29
    L23:
        th = move-exception;
        throw th;     // Catch: Throwable -> L29
    L18:
        if (r9.t.contains(this) == false) goto L26;
        r9.t.remove(this);     // Catch: Throwable -> L23
        monitor-exit(r10);     // Catch: Throwable -> L23
        monitor-exit(this);
        return;
    L26:
        throw new IllegalStateException("Cannot unregister not yet registered manager");     // Catch: Throwable -> L23
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.z92
    public final synchronized void j() {
        monitor-enter(this);
        this.s.j();     // Catch: Throwable -> L6
        u();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.z92
    public final synchronized void n() {
        monitor-enter(this);
        v();     // Catch: Throwable -> L6
        this.s.n();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public vz3 o() {
        return f(Drawable.class);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r1) {
    }

    public vz3 p() {
        vz3 r2 = f(File.class);
        if (g04.I != null) goto L6;
        g04.I = (g04) ((g04) new g04().y(true)).b();
    L6:
        return r2.G(g04.I);
    }

    public final void q(wq4 r6) {
        if (r6 == null) goto L28;
        boolean r0 = x(r6);
        pz3 r1 = r6.l();
        if (r0 == true) goto L22;
        a r5 = this.n;
        ArrayList r2 = r5.t;
        monitor-enter(r2);
        ArrayList r7 = r5.t;     // Catch: Throwable -> L14
        int r3 = r7.size();     // Catch: Throwable -> L14
        int r4 = 0;
    L9:
        if (r4 >= r3) goto L16;
        Object r8 = r7.get(r4);     // Catch: Throwable -> L14
        r4 = r4 + 1;     // Catch: Throwable -> L14
        if (((c04) r8).x(r6) == false) goto L9;
        monitor-exit(r2);     // Catch: Throwable -> L14
        return;
    L16:
        monitor-exit(r2);     // Catch: Throwable -> L14
        if (r1 == null) goto L27;
        r6.e(null);
        r1.clear();
        return;
    L27:
        return;
    L14:
        th = move-exception;
        throw th;
    L22:
        return;
    }

    public vz3 r(Uri r1) {
        return o().N(r1);
    }

    public vz3 s(File r1) {
        return o().O(r1);
    }

    public vz3 t(String r1) {
        return o().P(r1);
    }

    public final synchronized String toString() {
        monitor-enter(this);
        String r0 = super.toString() + "{tracker=" + this.q + ", treeNode=" + this.r + "}";     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized void u() {
        monitor-enter(this);
        mf4 r0 = this.q;     // Catch: Throwable -> L11
        r0.o = true;     // Catch: Throwable -> L11
        ArrayList r1 = e35.B((Set) r0.p);     // Catch: Throwable -> L11
        int r2 = r1.size();     // Catch: Throwable -> L11
        int r3 = 0;
    L4:
        if (r3 >= r2) goto L9;
        Object r4 = r1.get(r3);     // Catch: Throwable -> L11
        r3 = r3 + 1;     // Catch: Throwable -> L11
        pz3 r5 = (pz3) r4;     // Catch: Throwable -> L11
        if (r5.isRunning() == false) goto L4;
        r5.c();     // Catch: Throwable -> L11
        ((HashSet) r0.q).add(r5);     // Catch: Throwable -> L11
        goto L4
    L9:
        monitor-exit(this);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public final synchronized void v() {
        monitor-enter(this);
        mf4 r0 = this.q;     // Catch: Throwable -> L13
        int r1 = 0;
        r0.o = false;     // Catch: Throwable -> L13
        ArrayList r2 = e35.B((Set) r0.p);     // Catch: Throwable -> L13
        int r3 = r2.size();     // Catch: Throwable -> L13
    L4:
        if (r1 >= r3) goto L10;
        Object r4 = r2.get(r1);     // Catch: Throwable -> L13
        r1 = r1 + 1;     // Catch: Throwable -> L13
        pz3 r5 = (pz3) r4;     // Catch: Throwable -> L13
        if (r5.d() == true) goto L4;
        if (r5.isRunning() == true) goto L4;
        r5.k();     // Catch: Throwable -> L13
        goto L4
    L10:
        ((HashSet) r0.q).clear();     // Catch: Throwable -> L13
        monitor-exit(this);
        return;
    L13:
        th = move-exception;
        throw th;
    }

    public synchronized void w(g04 r1) {
        monitor-enter(this);
        this.w = (g04) ((g04) r1.c()).b();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized boolean x(wq4 r4) {
        monitor-enter(this);
        pz3 r0 = r4.l();     // Catch: Throwable -> L13
        if (r0 != null) goto L9;
        monitor-exit(this);
        return true;
    L9:
        if (this.q.c(r0) == false) goto L15;
        this.s.n.remove(r4);     // Catch: Throwable -> L13
        r4.e(null);     // Catch: Throwable -> L13
        monitor-exit(this);
        return true;
    L15:
        monitor-exit(this);
        return false;
    L13:
        th = move-exception;
        throw th;
    }
}
