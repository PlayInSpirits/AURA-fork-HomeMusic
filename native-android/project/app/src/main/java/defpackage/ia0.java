package defpackage;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia0 implements fa0 {
    public final wn3 n;
    public final wn3 o;
    public final ThreadLocal p;
    public final AtomicBoolean q;
    public final long r;

    public ia0(final rf2 rf2Var, final String str, int i) {
        str.getClass();
        this.p = new ThreadLocal();
        final int i2 = 0;
        this.q = new AtomicBoolean(false);
        om0 om0Var = mx0.n;
        this.r = e35.V(30);
        if (i <= 0) {
            kf2.n("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.n = new wn3(i, new gf1() { // from class: ga0
            @Override // defpackage.gf1
            public final Object invoke() {
                int i3 = i2;
                String str2 = str;
                rf2 rf2Var2 = rf2Var;
                switch (i3) {
                    case 0:
                        x34 x34VarB = rf2Var2.b(str2);
                        h12.n(x34VarB, "PRAGMA query_only = 1");
                        return x34VarB;
                    default:
                        return rf2Var2.b(str2);
                }
            }
        });
        final int i3 = 1;
        this.o = new wn3(1, new gf1() { // from class: ga0
            @Override // defpackage.gf1
            public final Object invoke() {
                int i4 = i3;
                String str2 = str;
                rf2 rf2Var2 = rf2Var;
                switch (i4) {
                    case 0:
                        x34 x34VarB = rf2Var2.b(str2);
                        h12.n(x34VarB, "PRAGMA query_only = 1");
                        return x34VarB;
                    default:
                        return rf2Var2.b(str2);
                }
            }
        });
    }

    public final void b(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.o.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.n.c(sb);
        h12.P(5, sb.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.q.compareAndSet(false, true)) {
            this.n.b();
            this.o.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a0 A[Catch: all -> 0x01b8, TRY_LEAVE, TryCatch #4 {all -> 0x01b8, blocks: (B:89:0x019a, B:91:0x01a0, B:93:0x01aa, B:94:0x01af), top: B:128:0x019a }] */
    @Override // defpackage.fa0
    public final Object k(boolean z, wf1 wf1Var, wd0 wd0Var) throws Throwable {
        ha0 ha0Var;
        jx3 jx3Var;
        Throwable th;
        wn3 wn3Var;
        ne0 context;
        jx3 jx3Var2;
        wn3 wn3Var2;
        jx3 jx3Var3;
        ne0 ne0Var;
        ia0 ia0Var;
        boolean z2;
        jx3 jx3Var4;
        ia0 ia0Var2;
        jx3 jx3Var5;
        go3 go3Var;
        go3 go3Var2;
        ia0 ia0Var3 = this;
        boolean z3 = z;
        wf1 wf1Var2 = wf1Var;
        if (wd0Var instanceof ha0) {
            ha0Var = (ha0) wd0Var;
            int i = ha0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ha0Var.w = i - Integer.MIN_VALUE;
            } else {
                ha0Var = new ha0(ia0Var3, wd0Var);
            }
        } else {
            ha0Var = new ha0(ia0Var3, wd0Var);
        }
        Object objP = ha0Var.u;
        int i2 = ha0Var.w;
        int i3 = 3;
        vd0 vd0Var = null;
        xe0 xe0Var = xe0.n;
        try {
            if (i2 == 0) {
                kb4.X(objP);
                if (ia0Var3.q.get()) {
                    h12.P(21, "Connection pool is closed");
                    throw null;
                }
                ThreadLocal threadLocal = ia0Var3.p;
                go3 go3Var3 = (go3) threadLocal.get();
                i80 i80Var = da0.o;
                if (go3Var3 == null) {
                    da0 da0Var = (da0) ha0Var.getContext().K(i80Var);
                    go3Var3 = da0Var != null ? da0Var.n : null;
                }
                if (go3Var3 == null) {
                    wn3 wn3Var3 = z3 ? ia0Var3.n : ia0Var3.o;
                    jx3Var = new jx3();
                    try {
                        context = ha0Var.getContext();
                        jx3Var2 = new jx3();
                        try {
                            long j = ia0Var3.r;
                            r rVar = new r(jx3Var2, wn3Var3, vd0Var, i3);
                            ha0Var.n = ia0Var3;
                            ha0Var.o = (Serializable) wf1Var2;
                            ha0Var.p = wn3Var3;
                            ha0Var.q = jx3Var;
                            ha0Var.r = context;
                            ha0Var.s = jx3Var2;
                            ha0Var.t = z3;
                            ha0Var.w = 3;
                            if (gb.i0(j, rVar, ha0Var) != xe0Var) {
                                wn3Var2 = wn3Var3;
                                jx3Var3 = jx3Var;
                                ne0Var = context;
                                ia0Var = ia0Var3;
                                z2 = z3;
                                jx3Var4 = jx3Var2;
                                jx3Var2 = jx3Var4;
                                z3 = z2;
                                jx3Var5 = jx3Var3;
                                ia0Var2 = ia0Var;
                                context = ne0Var;
                                th = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            wn3Var2 = wn3Var3;
                            jx3Var3 = jx3Var;
                            jx3 jx3Var6 = jx3Var3;
                            ia0Var2 = ia0Var3;
                            jx3Var5 = jx3Var6;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        wn3Var = wn3Var3;
                        throw th;
                    }
                } else {
                    if (!z3 && go3Var3.b) {
                        h12.P(1, "Cannot upgrade connection from reader to writer");
                        throw null;
                    }
                    if (ha0Var.getContext().K(i80Var) == null) {
                        da0 da0Var2 = new da0(go3Var3);
                        threadLocal.getClass();
                        ne0 ne0VarF = ya4.F(da0Var2, new ht4(go3Var3, threadLocal));
                        p pVar = new p(wf1Var2, go3Var3, vd0Var, 7);
                        ha0Var.w = 1;
                        Object objP2 = fu.P(ne0VarF, pVar, ha0Var);
                        if (objP2 != xe0Var) {
                            return objP2;
                        }
                    } else {
                        ha0Var.w = 2;
                        Object objInvoke = wf1Var2.invoke(go3Var3, ha0Var);
                        if (objInvoke != xe0Var) {
                            return objInvoke;
                        }
                    }
                }
                return xe0Var;
            }
            if (i2 == 1) {
                kb4.X(objP);
                return objP;
            }
            if (i2 == 2) {
                kb4.X(objP);
                return objP;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jx3Var5 = (jx3) ha0Var.o;
                wn3Var = (wn3) ha0Var.n;
                try {
                    kb4.X(objP);
                    try {
                        go3Var2 = (go3) jx3Var5.n;
                        if (go3Var2 != null) {
                            if (go3Var2.d.compareAndSet(false, true)) {
                                try {
                                    h12.n(go3Var2.a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused) {
                                }
                            }
                            sa0 sa0Var = go3Var2.a;
                            sa0Var.p = null;
                            sa0Var.q = null;
                            wn3Var.d(sa0Var);
                        }
                    } catch (Throwable unused2) {
                    }
                    return objP;
                } catch (Throwable th4) {
                    th = th4;
                    jx3Var = jx3Var5;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        try {
                            go3 go3Var4 = (go3) jx3Var.n;
                            if (go3Var4 == null) {
                                throw th5;
                            }
                            if (go3Var4.d.compareAndSet(false, true)) {
                                try {
                                    h12.n(go3Var4.a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused3) {
                                }
                            }
                            sa0 sa0Var2 = go3Var4.a;
                            sa0Var2.p = null;
                            sa0Var2.q = null;
                            wn3Var.d(sa0Var2);
                            throw th5;
                        } catch (Throwable th6) {
                            j51.d(th, th6);
                            throw th5;
                        }
                    }
                }
            }
            z2 = ha0Var.t;
            jx3Var4 = ha0Var.s;
            ne0 ne0Var2 = ha0Var.r;
            jx3Var3 = ha0Var.q;
            wn3Var2 = ha0Var.p;
            wf1 wf1Var3 = (wf1) ha0Var.o;
            ia0Var = (ia0) ha0Var.n;
            try {
                kb4.X(objP);
                ne0Var = ne0Var2;
                wf1Var2 = wf1Var3;
                jx3Var2 = jx3Var4;
                z3 = z2;
                jx3Var5 = jx3Var3;
                ia0Var2 = ia0Var;
                context = ne0Var;
                th = null;
            } catch (Throwable th7) {
                th = th7;
                jx3Var2 = jx3Var4;
                z3 = z2;
                ia0Var3 = ia0Var;
                context = ne0Var2;
                wf1Var2 = wf1Var3;
                jx3 jx3Var7 = jx3Var3;
                ia0Var2 = ia0Var3;
                jx3Var5 = jx3Var7;
            }
            sa0 sa0Var3 = (sa0) jx3Var2.n;
            if (sa0Var3 != null) {
                context.getClass();
                sa0Var3.p = context;
                sa0Var3.q = new Throwable();
                go3Var = new go3(sa0Var3, ia0Var2.n != ia0Var2.o && z3);
            } else {
                go3Var = null;
            }
            jx3Var5.n = go3Var;
            if (th instanceof TimeoutCancellationException) {
                ia0Var2.b(z3);
                throw null;
            }
            if (th != null) {
                throw th;
            }
            if (go3Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ia0Var2.getClass();
            da0 da0Var3 = new da0(go3Var);
            ThreadLocal threadLocal2 = ia0Var2.p;
            threadLocal2.getClass();
            ne0 ne0VarF2 = ya4.F(da0Var3, new ht4(go3Var, threadLocal2));
            p pVar2 = new p(wf1Var2, jx3Var5, vd0Var, 8);
            ha0Var.n = wn3Var2;
            ha0Var.o = jx3Var5;
            ha0Var.p = null;
            ha0Var.q = null;
            ha0Var.r = null;
            ha0Var.s = null;
            ha0Var.w = 4;
            objP = fu.P(ne0VarF2, pVar2, ha0Var);
            if (objP != xe0Var) {
                wn3Var = wn3Var2;
                go3Var2 = (go3) jx3Var5.n;
                if (go3Var2 != null) {
                    if (go3Var2.d.compareAndSet(false, true)) {
                        h12.n(go3Var2.a, "ROLLBACK TRANSACTION");
                    }
                    sa0 sa0Var4 = go3Var2.a;
                    sa0Var4.p = null;
                    sa0Var4.q = null;
                    wn3Var.d(sa0Var4);
                }
                return objP;
            }
            return xe0Var;
        } catch (Throwable th8) {
            th = th8;
            jx3Var = jx3Var5;
            wn3Var = wn3Var2;
            th = th;
            throw th;
        }
    }

    public ia0(rf2 rf2Var) {
        this.p = new ThreadLocal();
        this.q = new AtomicBoolean(false);
        om0 om0Var = mx0.n;
        this.r = e35.V(30);
        wn3 wn3Var = new wn3(1, new wc(3, rf2Var));
        this.n = wn3Var;
        this.o = wn3Var;
    }
}
