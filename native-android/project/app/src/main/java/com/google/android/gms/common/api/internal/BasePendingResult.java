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
    public static final zc j = new zc(3);
    public t14 e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(if5 if5Var) {
        new eq(if5Var != null ? if5Var.a.f : Looper.getMainLooper(), 2);
        new WeakReference(if5Var);
    }

    public final void a(cf5 cf5Var) {
        synchronized (this.a) {
            try {
                if (d()) {
                    cf5Var.a(this.f);
                } else {
                    this.c.add(cf5Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract t14 b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        return this.b.getCount() == 0;
    }

    public final void e(t14 t14Var) {
        synchronized (this.a) {
            try {
                if (this.h) {
                    return;
                }
                d();
                ji2.o("Results have already been set", !d());
                ji2.o("Result has already been consumed", !this.g);
                this.e = t14Var;
                this.f = t14Var.a();
                this.b.countDown();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((cf5) arrayList.get(i)).a(this.f);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
