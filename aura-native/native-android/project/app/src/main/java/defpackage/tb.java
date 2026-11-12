package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tb {
    public final oo0 a;
    public long b = 9205357640488583168L;
    public final vy0 c;
    public final zd3 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final fo0 i;

    public tb(Context context, oo0 oo0Var, long j, ac3 ac3Var) {
        this.a = oo0Var;
        vy0 vy0Var = new vy0(context, e35.U(j));
        this.c = vy0Var;
        this.d = new zd3(j15.a, rv2.s);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        hg3 hg3Var = new hg3(5, this);
        kn3 kn3Var = gp4.a;
        ip4 ip4Var = new ip4(null, null, hg3Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new bj1(ip4Var, this, vy0Var) : new bj1(ip4Var, this, vy0Var, ac3Var);
    }

    public final void a() {
        boolean z;
        vy0 vy0Var = this.c;
        EdgeEffect edgeEffect = vy0Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = vy0Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = vy0Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = vy0Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, f74 f74Var, wd0 wd0Var) {
        rb rbVar;
        float fA;
        float fA2;
        long jD;
        if (wd0Var instanceof rb) {
            rbVar = (rb) wd0Var;
            int i = rbVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbVar.q = i - Integer.MIN_VALUE;
            } else {
                rbVar = new rb(this, wd0Var);
            }
        } else {
            rbVar = new rb(this, wd0Var);
        }
        Object objInvokeSuspend = rbVar.o;
        int i2 = rbVar.q;
        j15 j15Var = j15.a;
        vy0 vy0Var = this.c;
        if (i2 == 0) {
            kb4.X(objInvokeSuspend);
            boolean zB = qf4.b(this.g);
            xe0 xe0Var = xe0.n;
            if (zB) {
                rbVar.q = 1;
                f74Var.getClass();
                f74 f74Var2 = new f74(f74Var.r, rbVar);
                f74Var2.q = j;
                if (f74Var2.invokeSuspend(j15Var) != xe0Var) {
                    return j15Var;
                }
            } else {
                boolean zG = vy0.g(vy0Var.f);
                oo0 oo0Var = this.a;
                if (!zG || k45.b(j) >= 0.0f) {
                    fA = (!vy0.g(vy0Var.g) || k45.b(j) <= 0.0f) ? 0.0f : -uo.a(vy0Var.d(), -k45.b(j), Float.intBitsToFloat((int) (this.g >> 32)), oo0Var);
                } else {
                    fA = uo.a(vy0Var.c(), k45.b(j), Float.intBitsToFloat((int) (this.g >> 32)), oo0Var);
                }
                if (!vy0.g(vy0Var.d) || k45.c(j) >= 0.0f) {
                    fA2 = (!vy0.g(vy0Var.e) || k45.c(j) <= 0.0f) ? 0.0f : -uo.a(vy0Var.b(), -k45.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), oo0Var);
                } else {
                    fA2 = uo.a(vy0Var.e(), k45.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), oo0Var);
                }
                long jH = e35.h(fA, fA2);
                if (jH != 0) {
                    d();
                }
                jD = k45.d(j, jH);
                rbVar.n = jD;
                rbVar.q = 2;
                f74Var.getClass();
                f74 f74Var3 = new f74(f74Var.r, rbVar);
                f74Var3.q = jD;
                objInvokeSuspend = f74Var3.invokeSuspend(j15Var);
            }
            return xe0Var;
        }
        if (i2 == 1) {
            kb4.X(objInvokeSuspend);
            return j15Var;
        }
        if (i2 != 2) {
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jD = rbVar.n;
        kb4.X(objInvokeSuspend);
        long jD2 = k45.d(jD, ((k45) objInvokeSuspend).a);
        this.f = false;
        if (k45.b(jD2) > 0.0f) {
            EdgeEffect edgeEffectC = vy0Var.c();
            int iL = ji2.L(k45.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectC.isFinished()) {
                edgeEffectC.onAbsorb(iL);
            }
        } else if (k45.b(jD2) < 0.0f) {
            EdgeEffect edgeEffectD = vy0Var.d();
            int i3 = -ji2.L(k45.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectD.isFinished()) {
                edgeEffectD.onAbsorb(i3);
            }
        }
        if (k45.c(jD2) > 0.0f) {
            EdgeEffect edgeEffectE = vy0Var.e();
            int iL2 = ji2.L(k45.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectE.isFinished()) {
                edgeEffectE.onAbsorb(iL2);
            }
        } else if (k45.c(jD2) < 0.0f) {
            EdgeEffect edgeEffectB = vy0Var.b();
            int i4 = -ji2.L(k45.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectB.isFinished()) {
                edgeEffectB.onAbsorb(i4);
            }
        }
        a();
        return j15Var;
    }

    public final long c() {
        long jQ = this.b;
        if ((9223372034707292159L & jQ) == 9205357640488583168L) {
            jQ = h12.q(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jQ & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(j15.a);
        }
    }

    public final boolean e() {
        vy0 vy0Var = this.c;
        EdgeEffect edgeEffect = vy0Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? qe.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = vy0Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? qe.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = vy0Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? qe.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = vy0Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? qe.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fD = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = qe.d(edgeEffectB, fD, f);
        } else {
            edgeEffectB.onPull(fD, f);
        }
        return (i2 >= 31 ? qe.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fD) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = qe.d(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? qe.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fD = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = qe.d(edgeEffectD, fD, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fD, fIntBitsToFloat);
        }
        return (i2 >= 31 ? qe.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fD) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = qe.d(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? qe.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean zA = qf4.a(this.g, 0L);
        boolean zA2 = qf4.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iL = ji2.L(Float.intBitsToFloat((int) (j >> 32)));
            long jL = (((long) ji2.L(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iL) << 32);
            vy0 vy0Var = this.c;
            vy0Var.c = jL;
            EdgeEffect edgeEffect = vy0Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect2 = vy0Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect3 = vy0Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jL & 4294967295L), (int) (jL >> 32));
            }
            EdgeEffect edgeEffect4 = vy0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jL & 4294967295L), (int) (jL >> 32));
            }
            EdgeEffect edgeEffect5 = vy0Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect6 = vy0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect7 = vy0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jL & 4294967295L), (int) (jL >> 32));
            }
            EdgeEffect edgeEffect8 = vy0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jL), (int) (jL >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
