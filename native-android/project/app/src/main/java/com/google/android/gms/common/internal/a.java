package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.c05;
import defpackage.ej1;
import defpackage.eu1;
import defpackage.fh5;
import defpackage.fj1;
import defpackage.fj5;
import defpackage.gf5;
import defpackage.gj1;
import defpackage.h45;
import defpackage.hj1;
import defpackage.ih5;
import defpackage.ji2;
import defpackage.jk5;
import defpackage.ka0;
import defpackage.kf2;
import defpackage.me;
import defpackage.ml3;
import defpackage.nk5;
import defpackage.oz4;
import defpackage.p14;
import defpackage.p61;
import defpackage.pp;
import defpackage.qh5;
import defpackage.sh1;
import defpackage.tb4;
import defpackage.tk5;
import defpackage.u24;
import defpackage.ui5;
import defpackage.vk5;
import defpackage.wi5;
import defpackage.wu4;
import defpackage.xi5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements me {
    public static final p61[] K = new p61[0];
    public final oz4 A;
    public final c05 B;
    public final int C;
    public final String D;
    public volatile String E;
    public ka0 F;
    public boolean G;
    public volatile jk5 H;
    public final AtomicInteger I;
    public final Set J;
    public volatile String n;
    public u24 o;
    public final Context p;
    public final tk5 q;
    public final qh5 r;
    public final Object s;
    public final Object t;
    public ih5 u;
    public pp v;
    public IInterface w;
    public final ArrayList x;
    public wi5 y;
    public int z;

    public a(Context context, Looper looper, int i, ml3 ml3Var, gj1 gj1Var, hj1 hj1Var, int i2) {
        synchronized (tk5.g) {
            try {
                if (tk5.h == null) {
                    tk5.h = new tk5(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        tk5 tk5Var = tk5.h;
        Object obj = ej1.b;
        ji2.m(gj1Var);
        ji2.m(hj1Var);
        oz4 oz4Var = new oz4(gj1Var);
        c05 c05Var = new c05(hj1Var);
        String str = (String) ml3Var.d;
        this.n = null;
        this.s = new Object();
        this.t = new Object();
        this.x = new ArrayList();
        this.z = 1;
        this.F = null;
        this.G = false;
        this.H = null;
        this.I = new AtomicInteger(0);
        ji2.n(context, "Context must not be null");
        this.p = context;
        ji2.n(looper, "Looper must not be null");
        ji2.n(tk5Var, "Supervisor must not be null");
        this.q = tk5Var;
        this.r = new qh5(this, looper);
        this.C = i;
        this.A = oz4Var;
        this.B = c05Var;
        this.D = str;
        Set set = (Set) ml3Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                kf2.o("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.J = set;
    }

    public static /* bridge */ /* synthetic */ boolean j(a aVar, int i, int i2, IInterface iInterface) {
        synchronized (aVar.s) {
            try {
                if (aVar.z != i) {
                    return false;
                }
                aVar.k(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.me
    public final boolean Y() {
        boolean z;
        synchronized (this.s) {
            z = this.z == 4;
        }
        return z;
    }

    @Override // defpackage.me
    public final Set Z() {
        return i0() ? this.J : Collections.EMPTY_SET;
    }

    public abstract IInterface a(IBinder iBinder);

    @Override // defpackage.me
    public final void a0(String str) {
        this.n = str;
        b();
    }

    public final void b() {
        this.I.incrementAndGet();
        synchronized (this.x) {
            try {
                int size = this.x.size();
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.x;
                    if (i < size) {
                        fh5 fh5Var = (fh5) arrayList.get(i);
                        synchronized (fh5Var) {
                            fh5Var.a = null;
                        }
                        i++;
                    } else {
                        arrayList.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.t) {
            this.u = null;
        }
        k(1, null);
    }

    @Override // defpackage.me
    public final void b0(h45 h45Var) {
        ((gf5) h45Var.o).q.A.post(new wu4(6, h45Var));
    }

    public p61[] c() {
        return K;
    }

    @Override // defpackage.me
    public final boolean c0() {
        boolean z;
        synchronized (this.s) {
            int i = this.z;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public Bundle d() {
        return new Bundle();
    }

    @Override // defpackage.me
    public final void d0() {
        if (!Y() || this.o == null) {
            tb4.e("Failed to connect when checking package");
        }
    }

    public final IInterface e() {
        IInterface iInterface;
        synchronized (this.s) {
            try {
                if (this.z == 5) {
                    throw new DeadObjectException();
                }
                if (!Y()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.w;
                ji2.n(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    @Override // defpackage.me
    public final void e0(pp ppVar) {
        this.v = ppVar;
        k(2, null);
    }

    public abstract String f();

    public abstract String g();

    @Override // defpackage.me
    public final p61[] g0() {
        jk5 jk5Var = this.H;
        if (jk5Var == null) {
            return null;
        }
        return jk5Var.o;
    }

    public boolean h() {
        return f0() >= 211700000;
    }

    @Override // defpackage.me
    public final String h0() {
        return this.n;
    }

    public boolean i() {
        return this instanceof p14;
    }

    @Override // defpackage.me
    public boolean i0() {
        return false;
    }

    @Override // defpackage.me
    public final void j0(eu1 eu1Var, Set set) {
        Bundle bundleD = d();
        String str = this.E;
        int i = fj1.a;
        Scope[] scopeArr = sh1.B;
        Bundle bundle = new Bundle();
        int i2 = this.C;
        p61[] p61VarArr = sh1.C;
        sh1 sh1Var = new sh1(6, i2, i, null, null, scopeArr, bundle, null, p61VarArr, p61VarArr, true, 0, false, str);
        sh1Var.q = this.p.getPackageName();
        sh1Var.t = bundleD;
        if (set != null) {
            sh1Var.s = (Scope[]) set.toArray(new Scope[0]);
        }
        if (i0()) {
            sh1Var.u = new Account("<<default account>>", "com.google");
            if (eu1Var != null) {
                sh1Var.r = ((vk5) eu1Var).e;
            }
        }
        sh1Var.v = K;
        sh1Var.w = c();
        if (i()) {
            sh1Var.z = true;
        }
        try {
            synchronized (this.t) {
                try {
                    ih5 ih5Var = this.u;
                    if (ih5Var != null) {
                        ih5Var.m(new ui5(this, this.I.get()), sh1Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.I.get();
            qh5 qh5Var = this.r;
            qh5Var.sendMessage(qh5Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.I.get();
            xi5 xi5Var = new xi5(this, 8, null, null);
            qh5 qh5Var2 = this.r;
            qh5Var2.sendMessage(qh5Var2.obtainMessage(1, i4, -1, xi5Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.I.get();
            xi5 xi5Var2 = new xi5(this, 8, null, null);
            qh5 qh5Var3 = this.r;
            qh5Var3.sendMessage(qh5Var3.obtainMessage(1, i5, -1, xi5Var2));
        }
    }

    public final void k(int i, IInterface iInterface) {
        u24 u24Var;
        ji2.i((i == 4) == (iInterface != null));
        synchronized (this.s) {
            try {
                this.z = i;
                this.w = iInterface;
                if (i == 1) {
                    wi5 wi5Var = this.y;
                    if (wi5Var != null) {
                        tk5 tk5Var = this.q;
                        String str = this.o.b;
                        ji2.m(str);
                        this.o.getClass();
                        if (this.D == null) {
                            this.p.getClass();
                        }
                        tk5Var.a(str, wi5Var, this.o.a);
                        this.y = null;
                    }
                } else if (i == 2 || i == 3) {
                    wi5 wi5Var2 = this.y;
                    if (wi5Var2 != null && (u24Var = this.o) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + u24Var.b + " on com.google.android.gms");
                        tk5 tk5Var2 = this.q;
                        String str2 = this.o.b;
                        ji2.m(str2);
                        this.o.getClass();
                        if (this.D == null) {
                            this.p.getClass();
                        }
                        tk5Var2.a(str2, wi5Var2, this.o.a);
                        this.I.incrementAndGet();
                    }
                    wi5 wi5Var3 = new wi5(this, this.I.get());
                    this.y = wi5Var3;
                    String strG = g();
                    boolean zH = h();
                    this.o = new u24(strG, zH);
                    if (zH && f0() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.o.b)));
                    }
                    tk5 tk5Var3 = this.q;
                    String str3 = this.o.b;
                    ji2.m(str3);
                    this.o.getClass();
                    String name = this.D;
                    if (name == null) {
                        name = this.p.getClass().getName();
                    }
                    if (!tk5Var3.b(new nk5(str3, this.o.a), wi5Var3, name)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.o.b + " on com.google.android.gms");
                        int i2 = this.I.get();
                        fj5 fj5Var = new fj5(this, 16);
                        qh5 qh5Var = this.r;
                        qh5Var.sendMessage(qh5Var.obtainMessage(7, i2, -1, fj5Var));
                    }
                } else if (i == 4) {
                    ji2.m(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
