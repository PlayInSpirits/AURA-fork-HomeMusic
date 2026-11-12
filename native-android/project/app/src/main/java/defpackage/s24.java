package defpackage;

import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s24 {
    public td0 a;
    public Executor b;
    public ia4 c;
    public p24 d;
    public s12 e;
    public final qr2 f;
    public boolean g;
    public final ThreadLocal h;
    public final LinkedHashMap i;
    public boolean j;

    public s24() {
        int r2 = 0;
        Class<s24> r4 = s24.class;
        String r5 = "onClosed";
        String r6 = "onClosed()V";
        this.f = new qr2(new na(r2, this, r4, r5, r6, 0, 8));
        this.h = new ThreadLocal();
        this.i = new LinkedHashMap();
        this.j = true;
    }

    public final void a() {
        if (this.g == false) goto L6;
        return;
    L6:
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == true) goto L11;
        return;
    L11:
        kf2.o("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        return;
    L8:
        r1 = false;
        goto L9
    }

    public final void b() {
        if (m() == true) goto L5;
        return;
    L5:
        if (n() == false) goto L7;
        return;
    L7:
        if (this.h.get() == null) goto L13;
        kf2.o("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        return;
    }

    public final void c() {
        a();
        a();
        we1 r0 = j().z();
        if (r0.v() == true) goto L6;
        g12.Q(new r12(i(), null, 2));
    L6:
        if (r0.n.isWriteAheadLoggingEnabled() == false) goto L8;
        r0.f();
        return;
    L8:
        r0.b();
    }

    public abstract s12 d();

    public qz0 e() {
        throw new p63(0);
    }

    public so4 f(li0 r1) {
        r1.getClass();
        throw new p63(0);
    }

    public List g(LinkedHashMap r1) {
        return u01.n;
    }

    public final we0 h() {
        td0 r0 = this.a;
        if (r0 == null) goto L5;
        return r0;
    L5:
        h12.Q("coroutineScope");
        throw null;
    }

    public final s12 i() {
        s12 r0 = this.e;
        if (r0 == null) goto L5;
        return r0;
    L5:
        h12.Q("internalTracker");
        throw null;
    }

    public final so4 j() {
        p24 r1 = this.d;
        if (r1 == null) goto L9;
        so4 r2 = r1.c();
        if (r2 == null) goto L7;
        return r2;
    L7:
        kf2.o("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    L9:
        h12.Q("connectionManager");
        throw null;
    }

    public Set k() {
        return z01.n;
    }

    public Map l() {
        return v01.n;
    }

    public final boolean m() {
        p24 r0 = this.d;
        if (r0 != null) goto L5;
        h12.Q("connectionManager");
        throw null;
    L5:
        if (r0.c() == null) goto L8;
        return true;
    L8:
        return false;
    }

    public final boolean n() {
        if (q() == true) goto L5;
        return false;
    L5:
        if (j().z().v() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void o() {
        j().z().n();
        if (n() == true) goto L6;
        s12 r2 = i();
        r2.b.e(r2.e, r2.f);
        return;
    }

    public final void p(x34 r8) {
        r8.getClass();
        s12 r7 = i();
        jy4 r0 = r7.b;
        r0.getClass();
        z34 r1 = r8.U("PRAGMA query_only");
        r1.O();     // Catch: Throwable -> L23
        boolean r2 = false;
        if (r1.getLong(0) == 0) goto L7;
        r2 = true;
    L7:
        ud3.e(r1, null);
        if (r2 == true) goto L19;
        h12.n(r8, "PRAGMA temp_store = MEMORY");
        h12.n(r8, "PRAGMA recursive_triggers = 1");
        h12.n(r8, "DROP TABLE IF EXISTS room_table_modification_log");
        if (r0.d == false) goto L12;
        h12.n(r8, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
    L13:
        ll r9 = r0.h;
        ReentrantLock r3 = (ReentrantLock) r9.p;
        r3.lock();
        r9.o = true;     // Catch: Throwable -> L16
        r3.unlock();
    L16:
        th = move-exception;
        r3.unlock();
        throw th;
    L12:
        h12.n(r8, xm4.i0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
    L19:
        Object r10 = r7.h;
        monitor-enter(r10);
        monitor-exit(r10);
        return;
    L23:
        th = move-exception;
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        ud3.e(r1, th);
        throw th;
    }

    public final boolean q() {
        p24 r0 = this.d;
        if (r0 == null) goto L10;
        we1 r1 = r0.g;
        if (r1 != null) goto L7;
        return false;
    L7:
        return r1.n.isOpen();
    L10:
        h12.Q("connectionManager");
        throw null;
    }

    public final Object r(Callable r1) {
        c();
        Object r2 = r1.call();     // Catch: Throwable -> L6
        t();     // Catch: Throwable -> L6
        o();
        return r2;
    L6:
        th = move-exception;
        o();
        throw th;
    }

    public final void s(Runnable r1) {
        c();
        r1.run();     // Catch: Throwable -> L6
        t();     // Catch: Throwable -> L6
        o();
        return;
    L6:
        th = move-exception;
        o();
        throw th;
    }

    public final void t() {
        j().z().H();
    }

    public final Object u(boolean r1, wf1 r2, wd0 r3) {
        p24 r0 = this.d;
        if (r0 != null) goto L5;
        h12.Q("connectionManager");
        throw null;
    L5:
        return r0.f.k(r1, r2, r3);
    }
}
