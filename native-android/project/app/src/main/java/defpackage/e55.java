package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e55 {
    public final ok2 a;
    public final k55 b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public vp4 l = vp4.a;

    public e55(Context context, ok2 ok2Var, long j) {
        this.a = ok2Var;
        this.c = j;
        this.b = new k55(context);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:101:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01de  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:110:0x0200  */
    /* JADX WARN: Code duplicated, block: B:111:0x0204  */
    /* JADX WARN: Code duplicated, block: B:114:0x0216  */
    /* JADX WARN: Code duplicated, block: B:115:0x021a  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:152:0x02af  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:86:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:94:0x019b  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, pu puVar) {
        long j5;
        long j6;
        long j7;
        int i;
        int i2;
        boolean z3;
        long jNanoTime;
        k55 k55Var;
        long j8;
        int i3;
        int i4;
        g55 g55Var;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z4;
        long j14;
        float f;
        float f2;
        long j15;
        n71 n71Var;
        long j16;
        m71 m71Var;
        long j17;
        puVar.a = -9223372036854775807L;
        puVar.b = -9223372036854775807L;
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        if (this.h != j) {
            k55 k55Var2 = this.b;
            j5 = -9223372036854775807L;
            long j18 = k55Var2.n;
            if (j18 != -1) {
                k55Var2.q = j18;
                k55Var2.r = k55Var2.o;
                k55Var2.s = k55Var2.p;
                k55Var2.k = k55Var2.l;
            }
            k55Var2.m++;
            n71 n71Var2 = k55Var2.a;
            j6 = 1000;
            long j19 = j * 1000;
            n71Var2.a.b(j19);
            if (n71Var2.a.a()) {
                n71Var2.c = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (n71Var2.d != -9223372036854775807L) {
                    if (n71Var2.c) {
                        m71 m71Var2 = n71Var2.b;
                        long j20 = m71Var2.d;
                        if (j20 == 0 ? false : m71Var2.g[(int) ((j20 - 1) % 15)]) {
                            n71Var2.b.c();
                            n71Var2.b.b(n71Var2.d);
                        }
                    } else {
                        n71Var2.b.c();
                        n71Var2.b.b(n71Var2.d);
                    }
                    n71Var2.c = true;
                    n71Var2.b.b(j19);
                }
            }
            if (n71Var2.c && n71Var2.b.a()) {
                m71 m71Var3 = n71Var2.a;
                n71Var2.a = n71Var2.b;
                n71Var2.b = m71Var3;
                n71Var2.c = false;
            }
            n71Var2.d = j19;
            n71Var2.e = n71Var2.a.a() ? 0 : n71Var2.e + 1;
            k55Var2.c();
            this.h = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = 1000;
            j7 = 0;
        }
        long jQ = (long) ((j - j2) / ((double) this.k));
        if (this.d) {
            this.l.getClass();
            jQ -= f35.Q(SystemClock.elapsedRealtime()) - j3;
        }
        puVar.a = jQ;
        if (!z || z2) {
            if (this.m) {
                long j21 = -30000;
                if (this.i == j5 || this.j) {
                    int i5 = this.e;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            i = 3;
                            i2 = 5;
                        } else if (i5 == 2) {
                            i = 3;
                            i2 = 5;
                            if (j2 >= j4) {
                            }
                        } else {
                            if (i5 != 3) {
                                tb4.a();
                                return 0;
                            }
                            this.l.getClass();
                            i = 3;
                            i2 = 5;
                            long jQ2 = f35.Q(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j22 = this.f;
                                if (j22 == j5 || j22 == j2 || jQ >= -30000 || jQ2 <= 100000) {
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        i = 3;
                        i2 = 5;
                        z3 = this.d;
                    }
                    if (z3) {
                        return 0;
                    }
                    if (this.d && j2 != this.f) {
                        this.l.getClass();
                        jNanoTime = System.nanoTime();
                        k55Var = this.b;
                        j8 = (puVar.a * j6) + jNanoTime;
                        if (k55Var.q != -1) {
                            if (k55Var.a.a.a()) {
                                n71Var = k55Var.a;
                                if (n71Var.a.a()) {
                                    m71Var = n71Var.a;
                                    i4 = 2;
                                    j17 = m71Var.e;
                                    i3 = 1;
                                    if (j17 == j7) {
                                        j16 = j7;
                                    } else {
                                        j16 = m71Var.f / j17;
                                    }
                                } else {
                                    i3 = 1;
                                    i4 = 2;
                                    j16 = j5;
                                }
                                f = (k55Var.m - k55Var.q) * j16;
                                f2 = k55Var.i;
                            } else {
                                i3 = 1;
                                i4 = 2;
                                f = (j - k55Var.s) * j6;
                                f2 = k55Var.i;
                            }
                            j15 = k55Var.r + ((long) (f / f2));
                            if (Math.abs(j8 - j15) <= 20000000) {
                                j8 = j15;
                            } else {
                                k55Var.b();
                            }
                        } else {
                            i3 = 1;
                            i4 = 2;
                            j21 = -30000;
                        }
                        k55Var.n = k55Var.m;
                        k55Var.o = j8;
                        k55Var.p = j;
                        g55Var = k55Var.c;
                        if (g55Var == null) {
                            j12 = jNanoTime;
                        } else {
                            j9 = g55Var.p;
                            long j23 = k55Var.c.q;
                            if (j9 != j5 || j23 == j5) {
                                j12 = jNanoTime;
                            } else {
                                long j24 = (((j8 - j9) / j23) * j23) + j9;
                                if (j8 <= j24) {
                                    j10 = j24 - j23;
                                } else {
                                    j24 += j23;
                                    j10 = j24;
                                }
                                long j25 = j24 - j8;
                                long j26 = j8 - j10;
                                long jAbs = Math.abs(j25 - j26);
                                if (jAbs < j23 / 2) {
                                    j11 = j10;
                                    long j27 = j23 / 4;
                                    if (jAbs < j27) {
                                        j12 = jNanoTime;
                                        long j28 = k55Var.k;
                                        if (j28 != j7) {
                                            k55Var.l = j28;
                                        } else {
                                            if (j25 < j26) {
                                                j27 = -j27;
                                            }
                                            k55Var.l = j27;
                                        }
                                    } else {
                                        j12 = jNanoTime;
                                        k55Var.l = j7;
                                    }
                                } else {
                                    j11 = j10;
                                    j12 = jNanoTime;
                                    k55Var.l = k55Var.k;
                                }
                                if (j25 + k55Var.l >= j26) {
                                    j24 = j11;
                                }
                                j8 = j24 - ((j23 * 80) / 100);
                            }
                        }
                        puVar.b = j8;
                        j13 = (j8 - j12) / j6;
                        puVar.a = j13;
                        if (this.i != j5 || this.j) {
                            z4 = 0;
                        } else {
                            z4 = i3;
                        }
                        if (this.a.P0(j13, j2, z2, z4)) {
                            return 4;
                        }
                        j14 = puVar.a;
                        if (j14 >= j21 && !z2) {
                            return z4 != 0 ? i : i4;
                        }
                        if (j14 > 50000) {
                            return i3;
                        }
                    }
                    return i2;
                }
                i = 3;
                i2 = 5;
                z3 = false;
                if (z3) {
                    return 0;
                }
                if (this.d) {
                    this.l.getClass();
                    jNanoTime = System.nanoTime();
                    k55Var = this.b;
                    j8 = (puVar.a * j6) + jNanoTime;
                    if (k55Var.q != -1) {
                        if (k55Var.a.a.a()) {
                            n71Var = k55Var.a;
                            if (n71Var.a.a()) {
                                m71Var = n71Var.a;
                                i4 = 2;
                                j17 = m71Var.e;
                                i3 = 1;
                                if (j17 == j7) {
                                    j16 = j7;
                                } else {
                                    j16 = m71Var.f / j17;
                                }
                            } else {
                                i3 = 1;
                                i4 = 2;
                                j16 = j5;
                            }
                            f = (k55Var.m - k55Var.q) * j16;
                            f2 = k55Var.i;
                        } else {
                            i3 = 1;
                            i4 = 2;
                            f = (j - k55Var.s) * j6;
                            f2 = k55Var.i;
                        }
                        j15 = k55Var.r + ((long) (f / f2));
                        if (Math.abs(j8 - j15) <= 20000000) {
                            j8 = j15;
                        } else {
                            k55Var.b();
                        }
                    } else {
                        i3 = 1;
                        i4 = 2;
                        j21 = -30000;
                    }
                    k55Var.n = k55Var.m;
                    k55Var.o = j8;
                    k55Var.p = j;
                    g55Var = k55Var.c;
                    if (g55Var == null) {
                        j12 = jNanoTime;
                    } else {
                        j9 = g55Var.p;
                        long j29 = k55Var.c.q;
                        if (j9 != j5) {
                            j12 = jNanoTime;
                        } else {
                            j12 = jNanoTime;
                        }
                    }
                    puVar.b = j8;
                    j13 = (j8 - j12) / j6;
                    puVar.a = j13;
                    if (this.i != j5) {
                        z4 = 0;
                    } else {
                        z4 = 0;
                    }
                    if (this.a.P0(j13, j2, z2, z4)) {
                        return 4;
                    }
                    j14 = puVar.a;
                    if (j14 >= j21) {
                    }
                    if (j14 > 50000) {
                        return i3;
                    }
                }
                return i2;
            }
            if (this.a.P0(jQ, j2, z2, true)) {
                return 4;
            }
            if (!this.d || puVar.a >= 30000) {
                this.n = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.j = z;
        long j = this.c;
        if (j > 0) {
            this.l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = f35.Q(SystemClock.elapsedRealtime());
        k55 k55Var = this.b;
        k55Var.d = true;
        k55Var.b();
        DisplayManager displayManager = (DisplayManager) k55Var.b.getSystemService("display");
        g55 j55Var = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                j55Var = Build.VERSION.SDK_INT >= 33 ? new j55(choreographer, displayManager) : new h55(choreographer, displayManager);
            } catch (RuntimeException e) {
                l93.r0("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        k55Var.c = j55Var;
        if (j55Var != null) {
            j55Var.a();
        }
        k55Var.d(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                tb4.a();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f) {
        k55 k55Var = this.b;
        k55Var.f = f;
        n71 n71Var = k55Var.a;
        n71Var.a.c();
        n71Var.b.c();
        n71Var.c = false;
        n71Var.d = -9223372036854775807L;
        n71Var.e = 0;
        k55Var.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        k55 k55Var = this.b;
        if (k55Var.e != surface) {
            k55Var.a();
            k55Var.e = surface;
            k55Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f) {
        rr2.l(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        k55 k55Var = this.b;
        k55Var.i = f;
        k55Var.d(false);
    }
}
