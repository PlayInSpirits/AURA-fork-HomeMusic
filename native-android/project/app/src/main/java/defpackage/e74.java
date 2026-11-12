package defpackage;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e74 {
    public final /* synthetic */ g74 a;

    public e74(g74 g74Var) {
        this.a = g74Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0205  */
    /* JADX WARN: Code duplicated, block: B:105:0x0214  */
    /* JADX WARN: Code duplicated, block: B:107:0x0219  */
    /* JADX WARN: Code duplicated, block: B:109:0x0221  */
    /* JADX WARN: Code duplicated, block: B:110:0x0225  */
    /* JADX WARN: Code duplicated, block: B:113:0x0231  */
    /* JADX WARN: Code duplicated, block: B:115:0x0236  */
    /* JADX WARN: Code duplicated, block: B:117:0x023e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0242  */
    /* JADX WARN: Code duplicated, block: B:120:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x024b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0253  */
    /* JADX WARN: Code duplicated, block: B:137:0x028e  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:162:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:163:0x0302  */
    /* JADX WARN: Code duplicated, block: B:169:0x0312  */
    /* JADX WARN: Code duplicated, block: B:176:0x032f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0340  */
    /* JADX WARN: Code duplicated, block: B:179:0x0344  */
    /* JADX WARN: Code duplicated, block: B:185:0x0354  */
    /* JADX WARN: Code duplicated, block: B:190:0x035c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0360  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141 A[PHI: r8
  0x0141: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:77:0x016f, B:66:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:81:0x018d  */
    public final long a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fH;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jD;
        long jD2;
        boolean z;
        boolean zF;
        boolean z2;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        aj1 aj1Var;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        aj1 aj1Var2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        aj1 aj1Var3;
        float f3;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        g74 g74Var = this.a;
        g74Var.j = i;
        tb tbVar = g74Var.b;
        if (tbVar == null || !g74Var.b()) {
            return g74Var.d(g74Var.k, j, i);
        }
        int i5 = g74Var.j;
        kl3 kl3Var = g74Var.m;
        vy0 vy0Var = tbVar.c;
        if (qf4.b(tbVar.g)) {
            g74 g74Var2 = (g74) kl3Var.o;
            return new g83(g74Var2.d(g74Var2.k, j, g74Var2.j)).a;
        }
        if (!tbVar.f) {
            if (vy0.g(vy0Var.f)) {
                tbVar.g(0L);
            }
            if (vy0.g(vy0Var.g)) {
                tbVar.h(0L);
            }
            if (vy0.g(vy0Var.d)) {
                tbVar.i(0L);
            }
            if (vy0.g(vy0Var.e)) {
                tbVar.f(0L);
            }
            tbVar.f = true;
        }
        int i6 = fc.a;
        float f4 = i5 == 2 ? 4.0f : 1.0f;
        long jF = g83.f(j, f4);
        int i7 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i7) != 0.0f) {
            if (!vy0.g(vy0Var.d) || Float.intBitsToFloat(i7) >= 0.0f) {
                j2 = 4294967295L;
                if (vy0.g(vy0Var.e) && Float.intBitsToFloat(i7) > 0.0f) {
                    float f5 = tbVar.f(jF);
                    if (!vy0.g(vy0Var.e)) {
                        vy0Var.b().finish();
                    }
                    fIntBitsToFloat = f5 == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i7) : f5 / f4;
                }
            } else {
                float fI = tbVar.i(jF);
                j2 = 4294967295L;
                if (!vy0.g(vy0Var.d)) {
                    vy0Var.e().finish();
                }
                fIntBitsToFloat = fI == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i7) : fI / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!vy0.g(vy0Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fH = tbVar.g(jF);
                if (!vy0.g(vy0Var.f)) {
                    vy0Var.c().finish();
                }
                if (fH == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fH / f4;
                }
            } else if (vy0.g(vy0Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fH = tbVar.h(jF);
                if (!vy0.g(vy0Var.g)) {
                    vy0Var.d().finish();
                }
                if (fH == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fH / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!g83.b(jFloatToRawIntBits, 0L)) {
                tbVar.d();
            }
            jD = g83.d(j, jFloatToRawIntBits);
            g74 g74Var3 = (g74) kl3Var.o;
            long j3 = new g83(g74Var3.d(g74Var3.k, jD, g74Var3.j)).a;
            jD2 = g83.d(jD, j3);
            if ((Float.intBitsToFloat((int) (jD >> 32)) == 0.0f || Float.intBitsToFloat((int) (jD & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (vy0.g(vy0Var.f) || vy0.g(vy0Var.d) || vy0.g(vy0Var.g) || vy0.g(vy0Var.e)))) {
                tbVar.a();
            }
            if (i5 == 1) {
                i3 = (int) (jD2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    tbVar.g(jD2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        tbVar.h(jD2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        tbVar.i(jD2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            tbVar.f(jD2);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    tbVar.i(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        tbVar.f(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!g83.b(jD, 0L)) {
                if (vy0.f(vy0Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = vy0Var.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof aj1) {
                        aj1 aj1Var4 = (aj1) edgeEffectC;
                        float f6 = aj1Var4.b + fIntBitsToFloat6;
                        aj1Var4.b = f6;
                        if (Math.abs(f6) > aj1Var4.a) {
                            aj1Var4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = vy0.f(vy0Var.f);
                }
                if (vy0.f(vy0Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = vy0Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof aj1) {
                        aj1Var3 = (aj1) edgeEffectD;
                        f3 = aj1Var3.b + fIntBitsToFloat5;
                        aj1Var3.b = f3;
                        if (Math.abs(f3) > aj1Var3.a) {
                            aj1Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || vy0.f(vy0Var.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (vy0.f(vy0Var.d) && Float.intBitsToFloat(i7) < 0.0f) {
                    edgeEffectE = vy0Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                    if (edgeEffectE instanceof aj1) {
                        aj1Var2 = (aj1) edgeEffectE;
                        f2 = aj1Var2.b + fIntBitsToFloat4;
                        aj1Var2.b = f2;
                        if (Math.abs(f2) > aj1Var2.a) {
                            aj1Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || vy0.f(vy0Var.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (vy0.f(vy0Var.e) && Float.intBitsToFloat(i7) > 0.0f) {
                    edgeEffectB = vy0Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                    if (edgeEffectB instanceof aj1) {
                        aj1Var = (aj1) edgeEffectB;
                        f = aj1Var.b + fIntBitsToFloat3;
                        aj1Var.b = f;
                        if (Math.abs(f) > aj1Var.a) {
                            aj1Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || vy0.f(vy0Var.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                tbVar.d();
            }
            return g83.e(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!vy0.g(vy0Var.f)) {
            if (vy0.g(vy0Var.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (vy0.g(vy0Var.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!g83.b(jFloatToRawIntBits, 0L)) {
            tbVar.d();
        }
        jD = g83.d(j, jFloatToRawIntBits);
        g74 g74Var4 = (g74) kl3Var.o;
        long j4 = new g83(g74Var4.d(g74Var4.k, jD, g74Var4.j)).a;
        jD2 = g83.d(jD, j4);
        if (Float.intBitsToFloat((int) (jD >> 32)) == 0.0f) {
            tbVar.a();
        } else {
            tbVar.a();
        }
        if (i5 == 1) {
            i3 = (int) (jD2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                tbVar.g(jD2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    tbVar.h(jD2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    tbVar.i(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        tbVar.f(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jD2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                tbVar.i(jD2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    tbVar.f(jD2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!g83.b(jD, 0L)) {
            if (vy0.f(vy0Var.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (vy0.f(vy0Var.g)) {
                edgeEffectD = vy0Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof aj1) {
                    aj1Var3 = (aj1) edgeEffectD;
                    f3 = aj1Var3.b + fIntBitsToFloat5;
                    aj1Var3.b = f3;
                    if (Math.abs(f3) > aj1Var3.a) {
                        aj1Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (vy0.f(vy0Var.d)) {
                edgeEffectE = vy0Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                if (edgeEffectE instanceof aj1) {
                    aj1Var2 = (aj1) edgeEffectE;
                    f2 = aj1Var2.b + fIntBitsToFloat4;
                    aj1Var2.b = f2;
                    if (Math.abs(f2) > aj1Var2.a) {
                        aj1Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (vy0.f(vy0Var.e)) {
                edgeEffectB = vy0Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                if (edgeEffectB instanceof aj1) {
                    aj1Var = (aj1) edgeEffectB;
                    f = aj1Var.b + fIntBitsToFloat3;
                    aj1Var.b = f;
                    if (Math.abs(f) > aj1Var.a) {
                        aj1Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            tbVar.d();
        }
        return g83.e(jFloatToRawIntBits, j4);
    }
}
