package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 implements sz0 {
    public final Context n;
    public final pa1 o;
    public final y41 p;
    public final Object q;
    public Handler r;
    public ThreadPoolExecutor s;
    public ThreadPoolExecutor t;
    public bu u;

    public ra1(Context r2, pa1 r3) {
        this.q = new Object();
        l93.m(r2, "Context cannot be null");
        this.n = r2.getApplicationContext();
        this.o = r3;
        this.p = sa1.d;
    }

    @Override // defpackage.sz0
    public final void a(bu r11) {
        Object r1 = this.q;
        monitor-enter(r1);
        this.u = r11;     // Catch: Throwable -> L22
        monitor-exit(r1);     // Catch: Throwable -> L22
        Object r12 = this.q;
        monitor-enter(r12);
    L12:
        th = move-exception;
        throw th;
    L9:
        if (this.u != null) goto L14;
        monitor-exit(r12);     // Catch: Throwable -> L12
        return;
    L14:
        int r2 = 0;
        if (this.s != null) goto L17;
        n90 r9 = new n90(0, "emojiCompat");     // Catch: Throwable -> L12
        ThreadPoolExecutor r3 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), r9);     // Catch: Throwable -> L12
        r3.allowCoreThreadTimeOut(true);     // Catch: Throwable -> L12
        this.t = r3;     // Catch: Throwable -> L12
        this.s = r3;     // Catch: Throwable -> L12
    L17:
        this.s.execute(new qa1(r2, this));     // Catch: Throwable -> L12
        monitor-exit(r12);     // Catch: Throwable -> L12
        return;
    L22:
        th = move-exception;
        throw th;
    }

    public final void b() {
        Object r0 = this.q;
        monitor-enter(r0);
        this.u = null;     // Catch: Throwable -> L8
        Handler r2 = this.r;     // Catch: Throwable -> L8
        if (r2 == null) goto L10;
        r2.removeCallbacks(null);     // Catch: Throwable -> L8
    L10:
        this.r = null;     // Catch: Throwable -> L8
        ThreadPoolExecutor r3 = this.t;     // Catch: Throwable -> L8
        if (r3 == null) goto L13;
        r3.shutdown();     // Catch: Throwable -> L8
    L13:
        this.s = null;     // Catch: Throwable -> L8
        this.t = null;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final ib1 c() {
        y41 r1 = this.p;     // Catch: PackageManager.NameNotFoundException -> L16
        Context r2 = this.n;     // Catch: PackageManager.NameNotFoundException -> L16
        pa1 r4 = this.o;     // Catch: PackageManager.NameNotFoundException -> L16
        r1.getClass();     // Catch: PackageManager.NameNotFoundException -> L16
        ArrayList r3 = new ArrayList(1);     // Catch: PackageManager.NameNotFoundException -> L16
        Object r5 = new Object[]{r4}[0];     // Catch: PackageManager.NameNotFoundException -> L16
        Objects.requireNonNull(r5);     // Catch: PackageManager.NameNotFoundException -> L16
        r3.add(r5);     // Catch: PackageManager.NameNotFoundException -> L16
        qn0 r6 = oa1.a(r2, Collections.unmodifiableList(r3));     // Catch: PackageManager.NameNotFoundException -> L16
        int r7 = r6.a;
        if (r7 != 0) goto L14;
        ib1[] r8 = (ib1[]) r6.b.get(0);
        if (r8 != null) goto L9;
    L12:
        tb4.e("fetchFonts failed (empty result)");
        return null;
    L9:
        if (r8.length == 0) goto L12;
        return r8[0];
    L14:
        tb4.e(b11.j(r7, "fetchFonts failed (", ")"));
        return null;
    L16:
        e = move-exception;
        nz2.s("provider not found", e);
        return null;
    }
}
