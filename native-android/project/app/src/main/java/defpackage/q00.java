package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q00 extends ba5 {
    public final ArrayList k;
    public int l;

    public q00(jc0 jc0Var, int i) {
        jc0 jc0Var2;
        super(jc0Var);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        jc0 jc0Var3 = this.b;
        jc0 jc0VarK = jc0Var3.k(i);
        while (true) {
            jc0Var2 = jc0Var3;
            jc0Var3 = jc0VarK;
            if (jc0Var3 == null) {
                break;
            } else {
                jc0VarK = jc0Var3.k(this.f);
            }
        }
        this.b = jc0Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? jc0Var2.d : i2 == 1 ? jc0Var2.e : null);
        jc0 jc0VarJ = jc0Var2.j(this.f);
        while (jc0VarJ != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? jc0VarJ.d : i3 == 1 ? jc0VarJ.e : null);
            jc0VarJ = jc0VarJ.j(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ba5 ba5Var = (ba5) obj;
            int i5 = this.f;
            if (i5 == 0) {
                ba5Var.b.b = this;
            } else if (i5 == 1) {
                ba5Var.b.c = this;
            }
        }
        if (this.f == 0 && ((kc0) this.b.S).u0 && arrayList.size() > 1) {
            this.b = ((ba5) arrayList.get(arrayList.size() - 1)).b;
        }
        int i6 = this.f;
        jc0 jc0Var4 = this.b;
        this.l = i6 == 0 ? jc0Var4.h0 : jc0Var4.i0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // defpackage.uo0
    public final void a(uo0 uo0Var) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        yo0 yo0Var = this.h;
        if (yo0Var.j) {
            yo0 yo0Var2 = this.i;
            if (yo0Var2.j) {
                jc0 jc0Var = this.b.S;
                boolean z2 = jc0Var instanceof kc0 ? ((kc0) jc0Var).u0 : false;
                int i13 = yo0Var2.g - yo0Var.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((ba5) arrayList.get(i14)).b.f0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((ba5) arrayList.get(i16)).b.f0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        ba5 ba5Var = (ba5) arrayList.get(i18);
                        jc0 jc0Var2 = ba5Var.b;
                        boolean z3 = z2;
                        if (jc0Var2.f0 == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += ba5Var.h.f;
                            }
                            eq0 eq0Var = ba5Var.e;
                            int i21 = eq0Var.g;
                            i11 = i17;
                            boolean z4 = ba5Var.d != 3;
                            if (z4) {
                                int i22 = this.f;
                                if (i22 == 0 && !jc0Var2.d.e.j) {
                                    return;
                                }
                                if (i22 == 1 && !jc0Var2.e.e.j) {
                                    return;
                                }
                            } else {
                                if (ba5Var.a == 1 && i11 == 0) {
                                    i12 = eq0Var.m;
                                    i19++;
                                } else {
                                    if (eq0Var.j) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = jc0Var2.j0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -ba5Var.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = jc0Var2.j0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = jc0Var2.j0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = yo0Var.g;
                if (z) {
                    i24 = yo0Var2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        ba5 ba5Var2 = (ba5) arrayList.get(i26);
                        int i28 = i24;
                        jc0 jc0Var3 = ba5Var2.b;
                        int i29 = i3;
                        eq0 eq0Var2 = ba5Var2.e;
                        float f7 = f5;
                        int i30 = i25;
                        if (jc0Var3.f0 != 8 && ba5Var2.d == 3 && !eq0Var2.j) {
                            int i31 = f > 0.0f ? (int) (((jc0Var3.j0[this.f] * f7) / f) + f6) : i30;
                            if (this.f == 0) {
                                i9 = jc0Var3.v;
                                i10 = jc0Var3.u;
                            } else {
                                i9 = jc0Var3.y;
                                i10 = jc0Var3.x;
                            }
                            int iMax = Math.max(i10, ba5Var2.a == 1 ? Math.min(i31, eq0Var2.m) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            eq0Var2.d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            ba5 ba5Var3 = (ba5) arrayList.get(i33);
                            if (ba5Var3.b.f0 != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += ba5Var3.h.f;
                                }
                                i5 += ba5Var3.e.g;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -ba5Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.l == 2 && i27 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i34 = this.l;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        ba5 ba5Var4 = (ba5) arrayList.get(z ? size - (i37 + 1) : i37);
                        jc0 jc0Var4 = ba5Var4.b;
                        yo0 yo0Var3 = ba5Var4.i;
                        yo0 yo0Var4 = ba5Var4.h;
                        if (jc0Var4.f0 == 8) {
                            yo0Var4.d(i36);
                            yo0Var3.d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - yo0Var4.f : i36 + yo0Var4.f;
                            }
                            if (z) {
                                yo0Var3.d(i36);
                            } else {
                                yo0Var4.d(i36);
                            }
                            eq0 eq0Var3 = ba5Var4.e;
                            int i38 = eq0Var3.g;
                            if (ba5Var4.d == 3 && ba5Var4.a == 1) {
                                i38 = eq0Var3.m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                yo0Var4.d(i36);
                            } else {
                                yo0Var3.d(i36);
                            }
                            ba5Var4.g = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-yo0Var3.f) : i36 + (-yo0Var3.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        ba5 ba5Var5 = (ba5) arrayList.get(z ? size - (i41 + 1) : i41);
                        jc0 jc0Var5 = ba5Var5.b;
                        yo0 yo0Var5 = ba5Var5.i;
                        yo0 yo0Var6 = ba5Var5.h;
                        if (jc0Var5.f0 == 8) {
                            yo0Var6.d(i40);
                            yo0Var5.d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - yo0Var6.f : i42 + yo0Var6.f;
                            }
                            if (z) {
                                yo0Var5.d(i42);
                            } else {
                                yo0Var6.d(i42);
                            }
                            eq0 eq0Var4 = ba5Var5.e;
                            int iMin = eq0Var4.g;
                            if (ba5Var5.d == 3 && ba5Var5.a == 1) {
                                iMin = Math.min(iMin, eq0Var4.m);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                yo0Var6.d(i40);
                            } else {
                                yo0Var5.d(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-yo0Var5.f) : i40 + (-yo0Var5.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.f;
                    jc0 jc0Var6 = this.b;
                    float f8 = i43 == 0 ? jc0Var6.c0 : jc0Var6.d0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        ba5 ba5Var6 = (ba5) arrayList.get(z ? size - (i46 + 1) : i46);
                        jc0 jc0Var7 = ba5Var6.b;
                        yo0 yo0Var7 = ba5Var6.i;
                        yo0 yo0Var8 = ba5Var6.h;
                        if (jc0Var7.f0 == 8) {
                            yo0Var8.d(i45);
                            yo0Var7.d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - yo0Var8.f : i45 + yo0Var8.f;
                            }
                            if (z) {
                                yo0Var7.d(i45);
                            } else {
                                yo0Var8.d(i45);
                            }
                            eq0 eq0Var5 = ba5Var6.e;
                            int i47 = eq0Var5.g;
                            if (ba5Var6.d == 3 && ba5Var6.a == 1) {
                                i47 = eq0Var5.m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                yo0Var8.d(i45);
                            } else {
                                yo0Var7.d(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-yo0Var7.f) : i45 + (-yo0Var7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ba5
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ba5) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        jc0 jc0Var = ((ba5) arrayList.get(0)).b;
        jc0 jc0Var2 = ((ba5) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        yo0 yo0Var = this.i;
        yo0 yo0Var2 = this.h;
        if (i2 == 0) {
            hb0 hb0Var = jc0Var.H;
            hb0 hb0Var2 = jc0Var2.J;
            yo0 yo0VarI = ba5.i(hb0Var, 0);
            int iD = hb0Var.d();
            jc0 jc0VarM = m();
            if (jc0VarM != null) {
                iD = jc0VarM.H.d();
            }
            if (yo0VarI != null) {
                ba5.b(yo0Var2, yo0VarI, iD);
            }
            yo0 yo0VarI2 = ba5.i(hb0Var2, 0);
            int iD2 = hb0Var2.d();
            jc0 jc0VarN = n();
            if (jc0VarN != null) {
                iD2 = jc0VarN.J.d();
            }
            if (yo0VarI2 != null) {
                ba5.b(yo0Var, yo0VarI2, -iD2);
            }
        } else {
            hb0 hb0Var3 = jc0Var.I;
            hb0 hb0Var4 = jc0Var2.K;
            yo0 yo0VarI3 = ba5.i(hb0Var3, 1);
            int iD3 = hb0Var3.d();
            jc0 jc0VarM2 = m();
            if (jc0VarM2 != null) {
                iD3 = jc0VarM2.I.d();
            }
            if (yo0VarI3 != null) {
                ba5.b(yo0Var2, yo0VarI3, iD3);
            }
            yo0 yo0VarI4 = ba5.i(hb0Var4, 1);
            int iD4 = hb0Var4.d();
            jc0 jc0VarN2 = n();
            if (jc0VarN2 != null) {
                iD4 = jc0VarN2.K.d();
            }
            if (yo0VarI4 != null) {
                ba5.b(yo0Var, yo0VarI4, -iD4);
            }
        }
        yo0Var2.a = this;
        yo0Var.a = this;
    }

    @Override // defpackage.ba5
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((ba5) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.ba5
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ba5) obj).f();
        }
    }

    @Override // defpackage.ba5
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            ba5 ba5Var = (ba5) arrayList.get(i);
            j = ((long) ba5Var.i.f) + ba5Var.j() + j + ((long) ba5Var.h.f);
        }
        return j;
    }

    @Override // defpackage.ba5
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((ba5) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final jc0 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            jc0 jc0Var = ((ba5) arrayList.get(i)).b;
            if (jc0Var.f0 != 8) {
                return jc0Var;
            }
            i++;
        }
    }

    public final jc0 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jc0 jc0Var = ((ba5) arrayList.get(size)).b;
            if (jc0Var.f0 != 8) {
                return jc0Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((ba5) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
