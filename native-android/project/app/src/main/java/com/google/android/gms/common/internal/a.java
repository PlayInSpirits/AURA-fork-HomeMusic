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
    public static final p61[] K = null;
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

    static {
        K = new p61[0];
    }

    public a(Context r5, Looper r6, int r7, ml3 r8, gj1 r9, hj1 r10, int r11) {
        Object r12 = tk5.g;
        monitor-enter(r12);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (tk5.h != null) goto L9;
        tk5.h = new tk5(r5.getApplicationContext(), r5.getMainLooper());     // Catch: Throwable -> L7
    L9:
        monitor-exit(r12);     // Catch: Throwable -> L7
        tk5 r13 = tk5.h;
        Object r0 = ej1.b;
        ji2.m(r9);
        ji2.m(r10);
        oz4 r1 = new oz4(r9);
        c05 r14 = new c05(r10);
        String r15 = (String) r8.d;
        this.n = null;
        this.s = new Object();
        this.t = new Object();
        this.x = new ArrayList();
        this.z = 1;
        this.F = null;
        this.G = false;
        this.H = null;
        this.I = new AtomicInteger(0);
        ji2.n(r5, "Context must not be null");
        this.p = r5;
        ji2.n(r6, "Looper must not be null");
        ji2.n(r13, "Supervisor must not be null");
        this.q = r13;
        this.r = new qh5(this, r6);
        this.C = r7;
        this.A = r1;
        this.B = r14;
        this.D = r15;
        Set r16 = (Set) r8.b;
        Iterator r17 = r16.iterator();
    L12:
        if (r17.hasNext() == false) goto L18;
        if (r16.contains((Scope) r17.next()) == true) goto L12;
        kf2.o("Expanding scopes is not permitted, use implied scopes instead");
        throw null;
    L18:
        this.J = r16;
    }

    public static /* bridge */ /* synthetic */ boolean j(a r2, int r3, int r4, IInterface r5) {
        Object r0 = r2.s;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r2.z == r3) goto L11;
        monitor-exit(r0);     // Catch: Throwable -> L9
        return false;
    L11:
        r2.k(r4, r5);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return true;
    }

    @Override // defpackage.me
    public final boolean Y() {
        Object r0 = this.s;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.z != 4) goto L7;
        boolean r2 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        r2 = false;
        goto L8
    }

    @Override // defpackage.me
    public final Set Z() {
        if (i0() == false) goto L7;
        return this.J;
    L7:
        return Collections.EMPTY_SET;
    }

    public abstract IInterface a(IBinder r1);

    @Override // defpackage.me
    public final void a0(String r1) {
        this.n = r1;
        b();
    }

    public final void b() {
        this.I.incrementAndGet();
        ArrayList r0 = this.x;
        monitor-enter(r0);
        int r1 = this.x.size();     // Catch: Throwable -> L16
        int r2 = 0;
    L6:
        ArrayList r3 = this.x;
        if (r2 >= r1) goto L18;
        fh5 r4 = (fh5) r3.get(r2);     // Catch: Throwable -> L16
        monitor-enter(r4);     // Catch: Throwable -> L16
        r4.a = null;     // Catch: Throwable -> L13
        monitor-exit(r4);     // Catch: Throwable -> L13
        r2 = r2 + 1;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L18:
        r3.clear();     // Catch: Throwable -> L16
        monitor-exit(r0);     // Catch: Throwable -> L16
        Object r5 = this.t;
        monitor-enter(r5);
        this.u = null;     // Catch: Throwable -> L26
        monitor-exit(r5);     // Catch: Throwable -> L26
        k(1, null);
        return;
    L26:
        th = move-exception;
        throw th;
    L16:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.me
    public final void b0(h45 r3) {
        ((gf5) r3.o).q.A.post(new wu4(6, r3));
    }

    public p61[] c() {
        return K;
    }

    @Override // defpackage.me
    public final boolean c0() {
        Object r0 = this.s;
        monitor-enter(r0);
        int r3 = this.z;     // Catch: Throwable -> L12
        boolean r2 = true;
        if (r3 != 2) goto L7;
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L12
        return r2;
    L7:
        if (r3 == 3) goto L10;
        r2 = false;
    L12:
        th = move-exception;
        throw th;
    }

    public Bundle d() {
        return new Bundle();
    }

    @Override // defpackage.me
    public final void d0() {
        if (Y() == true) goto L5;
    L7:
        tb4.e("Failed to connect when checking package");
        return;
    L5:
        if (this.o == null) goto L7;
    }

    public final IInterface e() {
        Object r0 = this.s;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.z == 5) goto L16;
        if (Y() == false) goto L14;
        IInterface r3 = this.w;     // Catch: Throwable -> L11
        ji2.n(r3, "Client is connected but service is null");     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return r3;
    L14:
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");     // Catch: Throwable -> L11
    L16:
        throw new DeadObjectException();     // Catch: Throwable -> L11
    }

    @Override // defpackage.me
    public final void e0(pp r2) {
        this.v = r2;
        k(2, null);
    }

    public abstract String f();

    public abstract String g();

    @Override // defpackage.me
    public final p61[] g0() {
        jk5 r0 = this.H;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.o;
    }

    public boolean h() {
        if (f0() < 211700000) goto L6;
        return true;
    L6:
        return false;
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
    public final void j0(eu1 r19, Set r20) {
        Bundle r2 = d();
        String r4 = this.E;
        int r6 = fj1.a;
        Scope[] r9 = sh1.B;
        Bundle r10 = new Bundle();
        int r5 = this.C;
        p61[] r12 = sh1.C;
        sh1 r3 = new sh1(6, r5, r6, null, null, r9, r10, null, r12, r12, true, 0, false, r4);
        r3.q = this.p.getPackageName();
        r3.t = r2;
        if (r20 == null) goto L6;
        r3.s = (Scope[]) r20.toArray(new Scope[0]);
    L6:
        if (i0() == false) goto L10;
        r3.u = new Account("<<default account>>", "com.google");
        if (r19 == null) goto L10;
        r3.r = ((vk5) r19).e;
    L10:
        r3.v = K;
        r3.w = c();
        if (i() == false) goto L39;
        r3.z = true;
    L39:
        Object r7 = this.t;     // Catch: RuntimeException -> L25 RemoteException -> L27 DeadObjectException -> L29 SecurityException -> L33
        monitor-enter(r7);     // Catch: RuntimeException -> L25 RemoteException -> L27 DeadObjectException -> L29 SecurityException -> L33
        ih5 r0 = this.u;     // Catch: Throwable -> L18
        if (r0 == null) goto L20;
        r0.m(new ui5(this, this.I.get()), r3);     // Catch: Throwable -> L18
    L21:
        monitor-exit(r7);     // Catch: Throwable -> L18
        return;
    L20:
        Log.w("GmsClient", "mServiceBroker is null, client disconnected");     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;     // Catch: RuntimeException -> L25 RemoteException -> L27 DeadObjectException -> L29 SecurityException -> L33
    L29:
        e = move-exception;
        Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
        int r1 = this.I.get();
        qh5 r8 = this.r;
        r8.sendMessage(r8.obtainMessage(6, r1, 3));
        return;
    L27:
        e = e;
    L31:
        Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
        int r11 = this.I.get();
        xi5 r13 = new xi5(this, 8, null, null);
        qh5 r14 = this.r;
        r14.sendMessage(r14.obtainMessage(1, r11, -1, r13));
        return;
    L33:
        e = move-exception;
        throw e;
    L25:
        e = e;
        goto L31
    }

    public final void k(int r10, IInterface r11) {
        boolean r4 = false;
        if (r10 == 4) goto L5;
        boolean r7 = false;
    L6:
        if (r11 != null) goto L8;
        boolean r8 = false;
    L9:
        if (r7 != r8) goto L11;
        r4 = true;
    L11:
        ji2.i(r4);
        Object r5 = this.s;
        monitor-enter(r5);
        this.z = r10;     // Catch: Throwable -> L22
        this.w = r11;     // Catch: Throwable -> L22
        if (r10 != 1) goto L16;
        wi5 r12 = this.y;     // Catch: Throwable -> L22
        if (r12 == null) goto L51;
        tk5 r13 = this.q;     // Catch: Throwable -> L22
        String r0 = this.o.b;     // Catch: Throwable -> L22
        ji2.m(r0);     // Catch: Throwable -> L22
        this.o.getClass();     // Catch: Throwable -> L22
        if (this.D != null) goto L50;
        this.p.getClass();     // Catch: Throwable -> L22
    L50:
        r13.a(r0, r12, this.o.a);     // Catch: Throwable -> L22
        this.y = null;     // Catch: Throwable -> L22
    L51:
        monitor-exit(r5);     // Catch: Throwable -> L22
        return;
    L16:
        if (r10 != 2) goto L18;
    L24:
        wi5 r14 = this.y;     // Catch: Throwable -> L22
        if (r14 == null) goto L32;
        u24 r15 = this.o;     // Catch: Throwable -> L22
        if (r15 == null) goto L32;
        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + r15.b + " on com.google.android.gms");     // Catch: Throwable -> L22
        tk5 r16 = this.q;     // Catch: Throwable -> L22
        String r1 = this.o.b;     // Catch: Throwable -> L22
        ji2.m(r1);     // Catch: Throwable -> L22
        this.o.getClass();     // Catch: Throwable -> L22
        if (this.D != null) goto L31;
        this.p.getClass();     // Catch: Throwable -> L22
    L31:
        r16.a(r1, r14, this.o.a);     // Catch: Throwable -> L22
        this.I.incrementAndGet();     // Catch: Throwable -> L22
    L32:
        wi5 r17 = new wi5(this, this.I.get());     // Catch: Throwable -> L22
        this.y = r17;     // Catch: Throwable -> L22
        String r2 = g();     // Catch: Throwable -> L22
        boolean r3 = h();     // Catch: Throwable -> L22
        this.o = new u24(r2, r3);     // Catch: Throwable -> L22
        if (r3 == true) goto L35;
    L39:
        tk5 r18 = this.q;     // Catch: Throwable -> L22
        String r6 = this.o.b;     // Catch: Throwable -> L22
        ji2.m(r6);     // Catch: Throwable -> L22
        this.o.getClass();     // Catch: Throwable -> L22
        String r9 = this.D;     // Catch: Throwable -> L22
        if (r9 != null) goto L43;
        r9 = this.p.getClass().getName();     // Catch: Throwable -> L22
    L43:
        if (r18.b(new nk5(r6, this.o.a), r17, r9) == true) goto L51;
        Log.w("GmsClient", "unable to connect to service: " + this.o.b + " on com.google.android.gms");     // Catch: Throwable -> L22
        int r19 = this.I.get();     // Catch: Throwable -> L22
        fj5 r110 = new fj5(this, 16);     // Catch: Throwable -> L22
        qh5 r20 = this.r;     // Catch: Throwable -> L22
        r20.sendMessage(r20.obtainMessage(7, r19, -1, r110));     // Catch: Throwable -> L22
        goto L51
    L35:
        if (f0() >= 17895000) goto L39;
        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.o.b)));     // Catch: Throwable -> L22
    L18:
        if (r10 == 3) goto L24;
        if (r10 != 4) goto L51;
        ji2.m(r11);     // Catch: Throwable -> L22
        System.currentTimeMillis();     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        throw th;
    L8:
        r8 = true;
        goto L9
    L5:
        r7 = true;
        goto L6
    }
}
