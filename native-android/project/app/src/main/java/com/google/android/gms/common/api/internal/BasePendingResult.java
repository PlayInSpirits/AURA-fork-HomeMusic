package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import defpackage.cf5;
import defpackage.eq;
import defpackage.if5;
import defpackage.ji2;
import defpackage.t14;
import defpackage.zc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends t14> {
    public static final zc j = null;
    public final Object a;
    public final CountDownLatch b;
    public final ArrayList c;
    public final AtomicReference d;
    public t14 e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public boolean i;

    static {
        j = new zc(3);
    }

    public BasePendingResult(if5 r3) {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        if (r3 == null) goto L5;
        Looper r2 = r3.a.f;
    L6:
        new eq(r2, 2);
        new WeakReference(r3);
        return;
    L5:
        r2 = Looper.getMainLooper();
        goto L6
    }

    public final void a(cf5 r3) {
        Object r0 = this.a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (d() == false) goto L9;
        r3.a(this.f);     // Catch: Throwable -> L7
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L9:
        this.c.add(r3);     // Catch: Throwable -> L7
        goto L10
    }

    public abstract t14 b(Status r1);

    public final void c(Status r3) {
        Object r0 = this.a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (d() == true) goto L9;
        e(b(r3));     // Catch: Throwable -> L7
        this.h = true;     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    public final boolean d() {
        if (this.b.getCount() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void e(t14 r6) {
        Object r0 = this.a;
        monitor-enter(r0);
    L12:
        th = move-exception;
        throw th;
    L5:
        if (this.h == true) goto L14;
        d();     // Catch: Throwable -> L12
        ji2.o("Results have already been set", !d());     // Catch: Throwable -> L12
        ji2.o("Result has already been consumed", !this.g);     // Catch: Throwable -> L12
        this.e = r6;     // Catch: Throwable -> L12
        this.f = r6.a();     // Catch: Throwable -> L12
        this.b.countDown();     // Catch: Throwable -> L12
        ArrayList r7 = this.c;     // Catch: Throwable -> L12
        int r1 = r7.size();     // Catch: Throwable -> L12
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L9;
        ((cf5) r7.get(r2)).a(this.f);     // Catch: Throwable -> L12
        r2 = r2 + 1;     // Catch: Throwable -> L12
        goto L7
    L9:
        r7.clear();     // Catch: Throwable -> L12
        monitor-exit(r0);     // Catch: Throwable -> L12
        return;
    L14:
        monitor-exit(r0);     // Catch: Throwable -> L12
    }
}
