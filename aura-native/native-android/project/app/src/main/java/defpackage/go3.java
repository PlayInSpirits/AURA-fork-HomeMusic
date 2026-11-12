package defpackage;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class go3 implements mw4, qu3 {
    public final sa0 a;
    public final boolean b;
    public final ii c;
    public final AtomicBoolean d;

    public go3(sa0 sa0Var, boolean z) {
        sa0Var.getClass();
        this.a = sa0Var;
        this.b = z;
        this.c = new ii();
        this.d = new AtomicBoolean(false);
    }

    @Override // defpackage.mw4
    public final Object a(lw4 lw4Var, wf1 wf1Var, ep4 ep4Var) {
        if (this.d.get()) {
            h12.P(21, "Connection is recycled");
            throw null;
        }
        da0 da0Var = (da0) ep4Var.getContext().K(da0.o);
        if (da0Var != null && da0Var.n == this) {
            return g(lw4Var, wf1Var, ep4Var);
        }
        h12.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yn3
    public final Object b(String str, if1 if1Var, wd0 wd0Var) {
        fo3 fo3Var;
        sa0 sa0Var;
        if (wd0Var instanceof fo3) {
            fo3Var = (fo3) wd0Var;
            int i = fo3Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo3Var.t = i - Integer.MIN_VALUE;
            } else {
                fo3Var = new fo3(this, wd0Var);
            }
        } else {
            fo3Var = new fo3(this, wd0Var);
        }
        Object obj = fo3Var.r;
        int i2 = fo3Var.t;
        if (i2 == 0) {
            kb4.X(obj);
            if (this.d.get()) {
                h12.P(21, "Connection is recycled");
                throw null;
            }
            da0 da0Var = (da0) fo3Var.getContext().K(da0.o);
            if (da0Var == null || da0Var.n != this) {
                h12.P(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            fo3Var.n = this;
            fo3Var.o = str;
            fo3Var.p = if1Var;
            sa0Var = this.a;
            fo3Var.q = sa0Var;
            fo3Var.t = 1;
            Object objB = sa0Var.o.b(fo3Var);
            xe0 xe0Var = xe0.n;
            if (objB == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sa0 sa0Var2 = fo3Var.q;
            if1Var = fo3Var.p;
            str = fo3Var.o;
            go3 go3Var = fo3Var.n;
            kb4.X(obj);
            sa0Var = sa0Var2;
            this = go3Var;
        }
        try {
            zn3 zn3Var = new zn3(this, this.a.U(str));
            try {
                Object objInvoke = if1Var.invoke(zn3Var);
                ud3.e(zn3Var, null);
                sa0Var.f(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ud3.e(zn3Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            sa0Var.f(null);
            throw th3;
        }
    }

    @Override // defpackage.qu3
    public final x34 c() {
        return this.a;
    }

    @Override // defpackage.mw4
    public final Object d(ep4 ep4Var) {
        if (this.d.get()) {
            h12.P(21, "Connection is recycled");
            throw null;
        }
        da0 da0Var = (da0) ep4Var.getContext().K(da0.o);
        if (da0Var != null && da0Var.n == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        h12.P(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(lw4 lw4Var, wd0 wd0Var) {
        co3 co3Var;
        sa0 sa0Var;
        if (wd0Var instanceof co3) {
            co3Var = (co3) wd0Var;
            int i = co3Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                co3Var.s = i - Integer.MIN_VALUE;
            } else {
                co3Var = new co3(this, wd0Var);
            }
        } else {
            co3Var = new co3(this, wd0Var);
        }
        Object obj = co3Var.q;
        int i2 = co3Var.s;
        if (i2 == 0) {
            kb4.X(obj);
            co3Var.n = this;
            co3Var.o = lw4Var;
            sa0Var = this.a;
            co3Var.p = sa0Var;
            co3Var.s = 1;
            Object objB = sa0Var.o.b(co3Var);
            xe0 xe0Var = xe0.n;
            if (objB == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sa0 sa0Var2 = co3Var.p;
            lw4Var = co3Var.o;
            go3 go3Var = co3Var.n;
            kb4.X(obj);
            sa0Var = sa0Var2;
            this = go3Var;
        }
        try {
            ii iiVar = this.c;
            sa0 sa0Var3 = this.a;
            int i3 = iiVar.p;
            if (iiVar.isEmpty()) {
                int iOrdinal = lw4Var.ordinal();
                if (iOrdinal == 0) {
                    h12.n(sa0Var3, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    h12.n(sa0Var3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h12.n(sa0Var3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                h12.n(sa0Var3, "SAVEPOINT '" + i3 + '\'');
            }
            iiVar.addLast(new bo3(i3));
            j15 j15Var = j15.a;
            sa0Var.f(null);
            return j15Var;
        } catch (Throwable th) {
            sa0Var.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(boolean z, wd0 wd0Var) {
        do3 do3Var;
        sa0 sa0Var;
        if (wd0Var instanceof do3) {
            do3Var = (do3) wd0Var;
            int i = do3Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                do3Var.s = i - Integer.MIN_VALUE;
            } else {
                do3Var = new do3(this, wd0Var);
            }
        } else {
            do3Var = new do3(this, wd0Var);
        }
        Object obj = do3Var.q;
        int i2 = do3Var.s;
        if (i2 == 0) {
            kb4.X(obj);
            do3Var.n = this;
            sa0Var = this.a;
            do3Var.o = sa0Var;
            do3Var.p = z;
            do3Var.s = 1;
            Object objB = sa0Var.o.b(do3Var);
            xe0 xe0Var = xe0.n;
            if (objB == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = do3Var.p;
            sa0 sa0Var2 = do3Var.o;
            go3 go3Var = do3Var.n;
            kb4.X(obj);
            sa0Var = sa0Var2;
            this = go3Var;
        }
        try {
            ii iiVar = this.c;
            sa0 sa0Var3 = this.a;
            if (iiVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            bo3 bo3Var = (bo3) v40.q0(iiVar);
            if (z) {
                bo3Var.getClass();
                if (iiVar.isEmpty()) {
                    h12.n(sa0Var3, "END TRANSACTION");
                } else {
                    h12.n(sa0Var3, "RELEASE SAVEPOINT '" + bo3Var.a + '\'');
                }
            } else if (iiVar.isEmpty()) {
                h12.n(sa0Var3, "ROLLBACK TRANSACTION");
            } else {
                h12.n(sa0Var3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + bo3Var.a + '\'');
            }
            j15 j15Var = j15.a;
            sa0Var.f(null);
            return j15Var;
        } catch (Throwable th) {
            sa0Var.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(lw4 lw4Var, wf1 wf1Var, wd0 wd0Var) throws Throwable {
        eo3 eo3Var;
        go3 go3Var;
        int i;
        SQLException e;
        Throwable th;
        boolean z;
        if (wd0Var instanceof eo3) {
            eo3Var = (eo3) wd0Var;
            int i2 = eo3Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eo3Var.s = i2 - Integer.MIN_VALUE;
            } else {
                eo3Var = new eo3(this, wd0Var);
            }
        } else {
            eo3Var = new eo3(this, wd0Var);
        }
        Object objInvoke = eo3Var.q;
        int i3 = eo3Var.s;
        Object[] objArr = 0;
        xe0 xe0Var = xe0.n;
        try {
            if (i3 == 0) {
                kb4.X(objInvoke);
                if (lw4Var == null) {
                    lw4Var = lw4.n;
                }
                eo3Var.n = this;
                eo3Var.o = (Serializable) wf1Var;
                eo3Var.s = 1;
                if (e(lw4Var, eo3Var) != xe0Var) {
                }
                return xe0Var;
            }
            if (i3 == 1) {
                wf1Var = (wf1) eo3Var.o;
                this = (go3) eo3Var.n;
                kb4.X(objInvoke);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj = eo3Var.n;
                        kb4.X(objInvoke);
                        return obj;
                    }
                    if (i3 != 5) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) eo3Var.o;
                    th = (Throwable) eo3Var.n;
                    try {
                        kb4.X(objInvoke);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        j51.d(th, e);
                        throw th;
                    }
                }
                i = eo3Var.p;
                go3Var = (go3) eo3Var.n;
                try {
                    kb4.X(objInvoke);
                    z = i != 0;
                    eo3Var.n = objInvoke;
                    eo3Var.s = 3;
                    if (go3Var.f(z, eo3Var) != xe0Var) {
                        return xe0Var;
                    }
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    this = go3Var;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            eo3Var.n = th;
                            eo3Var.o = th3;
                            eo3Var.s = 5;
                            if (this.f(false, eo3Var) != xe0Var) {
                                throw th3;
                            }
                        } catch (SQLException e3) {
                            e = e3;
                            th = th3;
                            if (th != null) {
                                throw e;
                            }
                            j51.d(th, e);
                            throw th;
                        }
                    }
                }
            }
            ao3 ao3Var = new ao3(objArr == true ? 1 : 0, this);
            eo3Var.n = this;
            eo3Var.o = null;
            eo3Var.p = 1;
            eo3Var.s = 2;
            objInvoke = wf1Var.invoke(ao3Var, eo3Var);
            if (objInvoke != xe0Var) {
                go3Var = this;
                i = 1;
                if (i != 0) {
                }
                eo3Var.n = objInvoke;
                eo3Var.s = 3;
                if (go3Var.f(z, eo3Var) != xe0Var) {
                    return objInvoke;
                }
            }
            return xe0Var;
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }
}
