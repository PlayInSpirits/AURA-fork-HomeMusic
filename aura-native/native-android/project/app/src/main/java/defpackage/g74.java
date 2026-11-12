package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g74 {
    public a74 a;
    public tb b;
    public y71 c;
    public hb3 d;
    public boolean e;
    public na4 f;
    public final z64 g;
    public final x64 h;
    public boolean i;
    public int j = 1;
    public q64 k = v64.a;
    public final e74 l = new e74(this);
    public final kl3 m = new kl3(6, this);

    public g74(a74 a74Var, tb tbVar, y71 y71Var, hb3 hb3Var, boolean z, na4 na4Var, z64 z64Var, x64 x64Var) {
        this.a = a74Var;
        this.b = tbVar;
        this.c = y71Var;
        this.d = hb3Var;
        this.e = z;
        this.f = na4Var;
        this.g = z64Var;
        this.h = x64Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, wd0 wd0Var) throws Throwable {
        b74 b74Var;
        g74 g74Var;
        Throwable th;
        ix3 ix3Var;
        if (wd0Var instanceof b74) {
            b74Var = (b74) wd0Var;
            int i = b74Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                b74Var.q = i - Integer.MIN_VALUE;
            } else {
                b74Var = new b74(this, wd0Var);
            }
        } else {
            b74Var = new b74(this, wd0Var);
        }
        Object obj = b74Var.o;
        int i2 = b74Var.q;
        if (i2 != 0) {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix3Var = b74Var.n;
            try {
                kb4.X(obj);
                g74Var = this;
                g74Var.i = false;
                return new k45(ix3Var.n);
            } catch (Throwable th2) {
                th = th2;
                g74Var = this;
                g74Var.i = false;
                throw th;
            }
        }
        kb4.X(obj);
        ix3 ix3Var2 = new ix3();
        ix3Var2.n = j;
        this.i = true;
        try {
            h13 h13Var = h13.n;
            g74Var = this;
            try {
                d74 d74Var = new d74(g74Var, ix3Var2, j, null);
                b74Var.n = ix3Var2;
                b74Var.q = 1;
                Object objG = g74Var.g(h13Var, d74Var, b74Var);
                xe0 xe0Var = xe0.n;
                if (objG == xe0Var) {
                    return xe0Var;
                }
                ix3Var = ix3Var2;
                g74Var.i = false;
                return new k45(ix3Var.n);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                g74Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            g74Var = this;
        }
    }

    public final boolean b() {
        tb tbVar;
        return this.a.c() || this.a.b() || ((tbVar = this.b) != null && tbVar.e());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final Object c(long j, boolean z, ep4 ep4Var) {
        int i;
        long jA;
        f74 f74Var;
        tb tbVar;
        xe0 xe0Var;
        Object objInvokeSuspend;
        j15 j15Var = j15.a;
        if (z) {
            y71 y71Var = this.c;
            t64 t64Var = v64.a;
            if (!(y71Var instanceof uk0)) {
                if (this.d == hb3.o) {
                    i = 1;
                } else {
                    i = 2;
                }
                jA = k45.a(j, 0.0f, 0.0f, i);
                f74Var = new f74(this, null);
                tbVar = this.b;
                xe0Var = xe0.n;
                if (tbVar == null && b()) {
                    Object objB = tbVar.b(jA, f74Var, ep4Var);
                    if (objB == xe0Var) {
                        return objB;
                    }
                } else {
                    f74 f74Var2 = new f74(f74Var.r, ep4Var);
                    f74Var2.q = jA;
                    objInvokeSuspend = f74Var2.invokeSuspend(j15Var);
                    if (objInvokeSuspend == xe0Var) {
                        return objInvokeSuspend;
                    }
                }
            }
        } else {
            if (this.d == hb3.o) {
                i = 1;
            } else {
                i = 2;
            }
            jA = k45.a(j, 0.0f, 0.0f, i);
            f74Var = new f74(this, null);
            tbVar = this.b;
            xe0Var = xe0.n;
            if (tbVar == null) {
                f74 f74Var3 = new f74(f74Var.r, ep4Var);
                f74Var3.q = jA;
                objInvokeSuspend = f74Var3.invokeSuspend(j15Var);
                if (objInvokeSuspend == xe0Var) {
                    return objInvokeSuspend;
                }
            } else {
                f74 f74Var4 = new f74(f74Var.r, ep4Var);
                f74Var4.q = jA;
                objInvokeSuspend = f74Var4.invokeSuspend(j15Var);
                if (objInvokeSuspend == xe0Var) {
                    return objInvokeSuspend;
                }
            }
        }
        return j15Var;
    }

    public final long d(q64 q64Var, long j, int i) {
        e53 e53Var = (e53) this.f.n;
        e53 e53VarR0 = e53Var != null ? e53Var.r0() : null;
        long jX = e53VarR0 != null ? e53VarR0.x(i, j) : 0L;
        long jD = g83.d(j, jX);
        long jF = f(i(q64Var.a(h(f(this.d == hb3.o ? g83.a(1, jD) : g83.a(2, jD))))));
        z64 z64Var = this.g;
        if (z64Var.A) {
            ViewTreeObserver viewTreeObserver = ((ra) j51.P(z64Var)).getViewTreeObserver();
            try {
                if (ra.Z0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ra.Z0 = declaredMethod;
                }
                Method method = ra.Z0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jD2 = g83.d(jD, jF);
        e53 e53Var2 = (e53) this.f.n;
        e53 e53VarR1 = e53Var2 != null ? e53Var2.r0() : null;
        return g83.e(g83.e(jX, jF), e53VarR1 != null ? e53VarR1.R(i, jF, jD2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? g83.f(j, -1.0f) : j;
    }

    public final Object g(h13 h13Var, wf1 wf1Var, wd0 wd0Var) {
        Object objE = this.a.e(h13Var, new r(this, wf1Var, null, 13), wd0Var);
        return objE == xe0.n ? objE : j15.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == hb3.o ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == hb3.o) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        hb3 hb3Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (hb3Var == hb3.n) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (hb3Var == hb3.o) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
