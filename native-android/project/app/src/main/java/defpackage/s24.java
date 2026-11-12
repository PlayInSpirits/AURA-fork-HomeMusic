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
    public boolean g;
    public final qr2 f = new qr2(new na(0, this, s24.class, "onClosed", "onClosed()V", 0, 8));
    public final ThreadLocal h = new ThreadLocal();
    public final LinkedHashMap i = new LinkedHashMap();
    public boolean j = true;

    public final void a() {
        if (this.g) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kf2.o("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!m() || n() || this.h.get() == null) {
            return;
        }
        kf2.o("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public final void c() {
        a();
        a();
        we1 we1VarZ = j().z();
        if (!we1VarZ.v()) {
            g12.Q(new r12(i(), null, 2));
        }
        if (we1VarZ.n.isWriteAheadLoggingEnabled()) {
            we1VarZ.f();
        } else {
            we1VarZ.b();
        }
    }

    public abstract s12 d();

    public qz0 e() {
        throw new p63(0);
    }

    public so4 f(li0 li0Var) {
        li0Var.getClass();
        throw new p63(0);
    }

    public List g(LinkedHashMap linkedHashMap) {
        return u01.n;
    }

    public final we0 h() {
        td0 td0Var = this.a;
        if (td0Var != null) {
            return td0Var;
        }
        h12.Q("coroutineScope");
        throw null;
    }

    public final s12 i() {
        s12 s12Var = this.e;
        if (s12Var != null) {
            return s12Var;
        }
        h12.Q("internalTracker");
        throw null;
    }

    public final so4 j() {
        p24 p24Var = this.d;
        if (p24Var == null) {
            h12.Q("connectionManager");
            throw null;
        }
        so4 so4VarC = p24Var.c();
        if (so4VarC != null) {
            return so4VarC;
        }
        kf2.o("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set k() {
        return z01.n;
    }

    public Map l() {
        return v01.n;
    }

    public final boolean m() {
        p24 p24Var = this.d;
        if (p24Var != null) {
            return p24Var.c() != null;
        }
        h12.Q("connectionManager");
        throw null;
    }

    public final boolean n() {
        return q() && j().z().v();
    }

    public final void o() {
        j().z().n();
        if (n()) {
            return;
        }
        s12 s12VarI = i();
        s12VarI.b.e(s12VarI.e, s12VarI.f);
    }

    public final void p(x34 x34Var) {
        x34Var.getClass();
        s12 s12VarI = i();
        jy4 jy4Var = s12VarI.b;
        jy4Var.getClass();
        z34 z34VarU = x34Var.U("PRAGMA query_only");
        try {
            z34VarU.O();
            boolean z = z34VarU.getLong(0) != 0;
            ud3.e(z34VarU, null);
            if (!z) {
                h12.n(x34Var, "PRAGMA temp_store = MEMORY");
                h12.n(x34Var, "PRAGMA recursive_triggers = 1");
                h12.n(x34Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (jy4Var.d) {
                    h12.n(x34Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    h12.n(x34Var, xm4.i0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                ll llVar = jy4Var.h;
                ReentrantLock reentrantLock = (ReentrantLock) llVar.p;
                reentrantLock.lock();
                try {
                    llVar.o = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (s12VarI.h) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ud3.e(z34VarU, th2);
                throw th3;
            }
        }
    }

    public final boolean q() {
        p24 p24Var = this.d;
        if (p24Var == null) {
            h12.Q("connectionManager");
            throw null;
        }
        we1 we1Var = p24Var.g;
        if (we1Var != null) {
            return we1Var.n.isOpen();
        }
        return false;
    }

    public final Object r(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            t();
            return objCall;
        } finally {
            o();
        }
    }

    public final void s(Runnable runnable) {
        c();
        try {
            runnable.run();
            t();
        } finally {
            o();
        }
    }

    public final void t() {
        j().z().H();
    }

    public final Object u(boolean z, wf1 wf1Var, wd0 wd0Var) {
        p24 p24Var = this.d;
        if (p24Var != null) {
            return p24Var.f.k(z, wf1Var, wd0Var);
        }
        h12.Q("connectionManager");
        throw null;
    }
}
