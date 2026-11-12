package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Serializable f;
    public Serializable g;
    public Object h;
    public Object i;

    public xo0(boolean z, boolean z2, ge3 ge3Var, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = ge3Var;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = lg2.a0(map);
    }

    public void a(yo0 yo0Var, int i, ArrayList arrayList, v34 v34Var) {
        ba5 ba5Var = yo0Var.d;
        v34 v34Var2 = ba5Var.c;
        yo0 yo0Var2 = ba5Var.i;
        yo0 yo0Var3 = ba5Var.h;
        if (v34Var2 == null) {
            kc0 kc0Var = (kc0) this.d;
            if (ba5Var == kc0Var.d || ba5Var == kc0Var.e) {
                return;
            }
            if (v34Var == null) {
                v34Var = new v34();
                v34Var.a = null;
                v34Var.b = new ArrayList();
                v34Var.a = ba5Var;
                arrayList.add(v34Var);
            }
            ba5Var.c = v34Var;
            v34Var.b.add(ba5Var);
            ArrayList arrayList2 = yo0Var3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                uo0 uo0Var = (uo0) obj;
                if (uo0Var instanceof yo0) {
                    a((yo0) uo0Var, i, arrayList, v34Var);
                }
            }
            ArrayList arrayList3 = yo0Var2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                uo0 uo0Var2 = (uo0) obj2;
                if (uo0Var2 instanceof yo0) {
                    a((yo0) uo0Var2, i, arrayList, v34Var);
                }
            }
            if (i == 1 && (ba5Var instanceof w45)) {
                ArrayList arrayList4 = ((w45) ba5Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    uo0 uo0Var3 = (uo0) obj3;
                    if (uo0Var3 instanceof yo0) {
                        a((yo0) uo0Var3, i, arrayList, v34Var);
                    }
                }
            }
            ArrayList arrayList5 = yo0Var3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((yo0) obj4, i, arrayList, v34Var);
            }
            ArrayList arrayList6 = yo0Var2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((yo0) obj5, i, arrayList, v34Var);
            }
            if (i == 1 && (ba5Var instanceof w45)) {
                ArrayList arrayList7 = ((w45) ba5Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((yo0) obj6, i, arrayList, v34Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x0207  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:117:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:126:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0269  */
    /* JADX WARN: Code duplicated, block: B:134:0x029a  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0306  */
    /* JADX WARN: Code duplicated, block: B:152:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:156:0x0337  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[PHI: r0
  0x00d1: PHI (r0v22 int) = (r0v20 int), (r0v99 int) binds: [B:68:0x00c9, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    public void b(kc0 kc0Var) {
        int i;
        int i2;
        int iO;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f;
        int i18;
        int i19;
        ArrayList arrayList = kc0Var.p0;
        int[] iArr = kc0Var.o0;
        int size = arrayList.size();
        char c = 0;
        int i20 = 0;
        while (i20 < size) {
            Object obj = arrayList.get(i20);
            i20++;
            jc0 jc0Var = (jc0) obj;
            int[] iArr2 = jc0Var.o0;
            hb0[] hb0VarArr = jc0Var.P;
            hb0 hb0Var = jc0Var.K;
            hb0 hb0Var2 = jc0Var.I;
            hb0 hb0Var3 = jc0Var.J;
            hb0 hb0Var4 = jc0Var.H;
            int i21 = iArr2[c];
            int i22 = iArr2[1];
            c = c;
            if (jc0Var.f0 == 8) {
                jc0Var.a = true;
            } else {
                float f2 = jc0Var.w;
                if (f2 < 1.0f && i21 == 3) {
                    jc0Var.r = 2;
                }
                float f3 = jc0Var.z;
                if (f3 < 1.0f && i22 == 3) {
                    jc0Var.s = 2;
                }
                if (jc0Var.V > 0.0f) {
                    if (i21 == 3) {
                        i19 = 2;
                        if (i22 == 2 || i22 == 1) {
                            i = 3;
                            jc0Var.r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i19 = 2;
                    }
                    if (i22 == i && (i21 == i19 || i21 == 1)) {
                        jc0Var.s = i;
                    } else if (i21 == i && i22 == i) {
                        if (jc0Var.r == 0) {
                            jc0Var.r = i;
                        }
                        if (jc0Var.s == 0) {
                            jc0Var.s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i21 == i && jc0Var.r == 1 && (hb0Var4.f == null || hb0Var3.f == null)) {
                    i21 = 2;
                }
                if (i22 == 3 && jc0Var.s == 1 && (hb0Var2.f == null || hb0Var.f == null)) {
                    i22 = 2;
                }
                up1 up1Var = jc0Var.d;
                up1Var.d = i21;
                int i23 = jc0Var.r;
                up1Var.a = i23;
                w45 w45Var = jc0Var.e;
                w45Var.d = i22;
                ArrayList arrayList2 = arrayList;
                int i24 = jc0Var.s;
                w45Var.a = i24;
                if (i21 == 4 || i21 == 1) {
                    if (i22 == 4) {
                        i2 = 1;
                    } else if (i22 != 1) {
                        i6 = 2;
                        if (i22 == 2) {
                            i2 = 1;
                        } else {
                            if (i21 != 3) {
                                i7 = i6;
                                i8 = i22;
                                i9 = 1;
                            } else if (i22 == i6 && i22 != 1) {
                                i7 = i6;
                                i10 = 3;
                                i8 = i22;
                                i9 = 1;
                                if (i8 != i10) {
                                    if (i21 == i7 && i21 != i9) {
                                        i14 = i10;
                                        i11 = i21;
                                        i12 = i7;
                                    } else if (i24 == i10) {
                                        if (i21 == i7) {
                                            f(i7, 0, i7, 0, jc0Var);
                                        }
                                        int iO2 = jc0Var.o();
                                        f = jc0Var.V;
                                        if (jc0Var.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(i9, iO2, i9, (int) ((iO2 * f) + 0.5f), jc0Var);
                                        jc0Var.d.e.d(jc0Var.o());
                                        jc0Var.e.e.d(jc0Var.i());
                                        jc0Var.a = true;
                                    } else if (i24 == 1) {
                                        f(i21, 0, i7, 0, jc0Var);
                                        jc0Var.e.e.m = jc0Var.i();
                                    } else {
                                        i15 = i7;
                                        i16 = i21;
                                        if (i24 == 2) {
                                            i17 = iArr[1];
                                            if (i17 != i9 || i17 == 4) {
                                                f(i16, jc0Var.o(), i9, (int) ((f3 * kc0Var.i()) + 0.5f), jc0Var);
                                                jc0Var.d.e.d(jc0Var.o());
                                                jc0Var.e.e.d(jc0Var.i());
                                                jc0Var.a = true;
                                            } else {
                                                i11 = i16;
                                                i12 = i15;
                                                i14 = 3;
                                            }
                                        } else {
                                            i11 = i16;
                                            if (hb0VarArr[2].f != null || hb0VarArr[3].f == null) {
                                                f(i15, 0, i8, 0, jc0Var);
                                                jc0Var.d.e.d(jc0Var.o());
                                                jc0Var.e.e.d(jc0Var.i());
                                                jc0Var.a = true;
                                            } else {
                                                i12 = i15;
                                            }
                                        }
                                    }
                                    i9 = i9;
                                    i13 = 1;
                                    if (i11 == i14 && i8 == i14) {
                                        if (i23 != i13 || i24 == i13) {
                                            f(i12, 0, i12, 0, jc0Var);
                                            jc0Var.d.e.m = jc0Var.o();
                                            jc0Var.e.e.m = jc0Var.i();
                                        } else if (i24 == 2 && i23 == 2 && iArr[c] == i9 && iArr[i13] == i9) {
                                            f(i9, (int) ((f2 * kc0Var.o()) + 0.5f), i9, (int) ((f3 * kc0Var.i()) + 0.5f), jc0Var);
                                            jc0Var.d.e.d(jc0Var.o());
                                            jc0Var.e.e.d(jc0Var.i());
                                            jc0Var.a = true;
                                        }
                                    }
                                } else {
                                    i11 = i21;
                                    i12 = i7;
                                }
                                i13 = 1;
                                i14 = 3;
                                if (i11 == i14) {
                                    if (i23 != i13) {
                                        f(i12, 0, i12, 0, jc0Var);
                                        jc0Var.d.e.m = jc0Var.o();
                                        jc0Var.e.e.m = jc0Var.i();
                                    } else {
                                        f(i12, 0, i12, 0, jc0Var);
                                        jc0Var.d.e.m = jc0Var.o();
                                        jc0Var.e.e.m = jc0Var.i();
                                    }
                                }
                            } else if (i23 == 3) {
                                if (i22 == i6) {
                                    f(i6, 0, i6, 0, jc0Var);
                                }
                                int i25 = jc0Var.i();
                                f(1, (int) ((i25 * jc0Var.V) + 0.5f), 1, i25, jc0Var);
                                jc0Var.d.e.d(jc0Var.o());
                                jc0Var.e.e.d(jc0Var.i());
                                jc0Var.a = true;
                            } else {
                                i7 = i6;
                                if (i23 == 1) {
                                    f(i7, 0, i22, 0, jc0Var);
                                    jc0Var.d.e.m = jc0Var.o();
                                } else if (i23 == 2) {
                                    i18 = iArr[c];
                                    if (i18 != 1 || i18 == 4) {
                                        f(1, (int) ((f2 * kc0Var.o()) + 0.5f), i22, jc0Var.i(), jc0Var);
                                        jc0Var.d.e.d(jc0Var.o());
                                        jc0Var.e.e.d(jc0Var.i());
                                        jc0Var.a = true;
                                    } else {
                                        i8 = i22;
                                        i9 = 1;
                                    }
                                } else {
                                    i8 = i22;
                                    i9 = 1;
                                    if (hb0VarArr[c].f != null || hb0VarArr[1].f == null) {
                                        f(i7, 0, i8, 0, jc0Var);
                                        jc0Var.d.e.d(jc0Var.o());
                                        jc0Var.e.e.d(jc0Var.i());
                                        jc0Var.a = true;
                                    }
                                }
                            }
                            i10 = 3;
                            if (i8 != i10) {
                                i11 = i21;
                                i12 = i7;
                            } else if (i21 == i7) {
                                if (i24 == i10) {
                                    if (i21 == i7) {
                                        f(i7, 0, i7, 0, jc0Var);
                                    }
                                    int iO3 = jc0Var.o();
                                    f = jc0Var.V;
                                    if (jc0Var.W == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(i9, iO3, i9, (int) ((iO3 * f) + 0.5f), jc0Var);
                                    jc0Var.d.e.d(jc0Var.o());
                                    jc0Var.e.e.d(jc0Var.i());
                                    jc0Var.a = true;
                                } else if (i24 == 1) {
                                    f(i21, 0, i7, 0, jc0Var);
                                    jc0Var.e.e.m = jc0Var.i();
                                } else {
                                    i15 = i7;
                                    i16 = i21;
                                    if (i24 == 2) {
                                        i17 = iArr[1];
                                        if (i17 != i9) {
                                        }
                                        f(i16, jc0Var.o(), i9, (int) ((f3 * kc0Var.i()) + 0.5f), jc0Var);
                                        jc0Var.d.e.d(jc0Var.o());
                                        jc0Var.e.e.d(jc0Var.i());
                                        jc0Var.a = true;
                                    } else {
                                        i11 = i16;
                                        if (hb0VarArr[2].f != null) {
                                        }
                                        f(i15, 0, i8, 0, jc0Var);
                                        jc0Var.d.e.d(jc0Var.o());
                                        jc0Var.e.e.d(jc0Var.i());
                                        jc0Var.a = true;
                                    }
                                }
                            } else if (i24 == i10) {
                                if (i21 == i7) {
                                    f(i7, 0, i7, 0, jc0Var);
                                }
                                int iO4 = jc0Var.o();
                                f = jc0Var.V;
                                if (jc0Var.W == -1) {
                                    f = 1.0f / f;
                                }
                                f(i9, iO4, i9, (int) ((iO4 * f) + 0.5f), jc0Var);
                                jc0Var.d.e.d(jc0Var.o());
                                jc0Var.e.e.d(jc0Var.i());
                                jc0Var.a = true;
                            } else if (i24 == 1) {
                                f(i21, 0, i7, 0, jc0Var);
                                jc0Var.e.e.m = jc0Var.i();
                            } else {
                                i15 = i7;
                                i16 = i21;
                                if (i24 == 2) {
                                    i17 = iArr[1];
                                    if (i17 != i9) {
                                    }
                                    f(i16, jc0Var.o(), i9, (int) ((f3 * kc0Var.i()) + 0.5f), jc0Var);
                                    jc0Var.d.e.d(jc0Var.o());
                                    jc0Var.e.e.d(jc0Var.i());
                                    jc0Var.a = true;
                                } else {
                                    i11 = i16;
                                    if (hb0VarArr[2].f != null) {
                                    }
                                    f(i15, 0, i8, 0, jc0Var);
                                    jc0Var.d.e.d(jc0Var.o());
                                    jc0Var.e.e.d(jc0Var.i());
                                    jc0Var.a = true;
                                }
                            }
                            i13 = 1;
                            i14 = 3;
                            if (i11 == i14) {
                                if (i23 != i13) {
                                    f(i12, 0, i12, 0, jc0Var);
                                    jc0Var.d.e.m = jc0Var.o();
                                    jc0Var.e.e.m = jc0Var.i();
                                } else {
                                    f(i12, 0, i12, 0, jc0Var);
                                    jc0Var.d.e.m = jc0Var.o();
                                    jc0Var.e.e.m = jc0Var.i();
                                }
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                    iO = jc0Var.o();
                    if (i21 == 4) {
                        iO = (kc0Var.o() - hb0Var4.g) - hb0Var3.g;
                        i21 = i2;
                    }
                    i3 = jc0Var.i();
                    if (i22 == 4) {
                        i4 = i2;
                        i5 = (kc0Var.i() - hb0Var2.g) - hb0Var.g;
                    } else {
                        i4 = i22;
                        i5 = i3;
                    }
                    f(i21, iO, i4, i5, jc0Var);
                    jc0Var.d.e.d(jc0Var.o());
                    jc0Var.e.e.d(jc0Var.i());
                    jc0Var.a = true;
                } else {
                    i6 = 2;
                    if (i21 == 2) {
                        if (i22 == 4) {
                            i2 = 1;
                        } else if (i22 != 1) {
                            i6 = 2;
                            if (i22 == 2) {
                                i2 = 1;
                            } else {
                                if (i21 != 3) {
                                    if (i22 == i6) {
                                    }
                                    if (i23 == 3) {
                                        if (i22 == i6) {
                                            f(i6, 0, i6, 0, jc0Var);
                                        }
                                        int i26 = jc0Var.i();
                                        f(1, (int) ((i26 * jc0Var.V) + 0.5f), 1, i26, jc0Var);
                                        jc0Var.d.e.d(jc0Var.o());
                                        jc0Var.e.e.d(jc0Var.i());
                                        jc0Var.a = true;
                                    } else {
                                        i7 = i6;
                                        if (i23 == 1) {
                                            f(i7, 0, i22, 0, jc0Var);
                                            jc0Var.d.e.m = jc0Var.o();
                                        } else if (i23 == 2) {
                                            i18 = iArr[c];
                                            if (i18 != 1) {
                                            }
                                            f(1, (int) ((f2 * kc0Var.o()) + 0.5f), i22, jc0Var.i(), jc0Var);
                                            jc0Var.d.e.d(jc0Var.o());
                                            jc0Var.e.e.d(jc0Var.i());
                                            jc0Var.a = true;
                                        } else {
                                            i8 = i22;
                                            i9 = 1;
                                            if (hb0VarArr[c].f != null) {
                                            }
                                            f(i7, 0, i8, 0, jc0Var);
                                            jc0Var.d.e.d(jc0Var.o());
                                            jc0Var.e.e.d(jc0Var.i());
                                            jc0Var.a = true;
                                        }
                                    }
                                } else {
                                    i7 = i6;
                                    i8 = i22;
                                    i9 = 1;
                                }
                                i10 = 3;
                                if (i8 != i10) {
                                    i11 = i21;
                                    i12 = i7;
                                } else if (i21 == i7) {
                                    if (i24 == i10) {
                                        if (i21 == i7) {
                                            f(i7, 0, i7, 0, jc0Var);
                                        }
                                        int iO5 = jc0Var.o();
                                        f = jc0Var.V;
                                        if (jc0Var.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        f(i9, iO5, i9, (int) ((iO5 * f) + 0.5f), jc0Var);
                                        jc0Var.d.e.d(jc0Var.o());
                                        jc0Var.e.e.d(jc0Var.i());
                                        jc0Var.a = true;
                                    } else if (i24 == 1) {
                                        f(i21, 0, i7, 0, jc0Var);
                                        jc0Var.e.e.m = jc0Var.i();
                                    } else {
                                        i15 = i7;
                                        i16 = i21;
                                        if (i24 == 2) {
                                            i17 = iArr[1];
                                            if (i17 != i9) {
                                            }
                                            f(i16, jc0Var.o(), i9, (int) ((f3 * kc0Var.i()) + 0.5f), jc0Var);
                                            jc0Var.d.e.d(jc0Var.o());
                                            jc0Var.e.e.d(jc0Var.i());
                                            jc0Var.a = true;
                                        } else {
                                            i11 = i16;
                                            if (hb0VarArr[2].f != null) {
                                            }
                                            f(i15, 0, i8, 0, jc0Var);
                                            jc0Var.d.e.d(jc0Var.o());
                                            jc0Var.e.e.d(jc0Var.i());
                                            jc0Var.a = true;
                                        }
                                    }
                                } else if (i24 == i10) {
                                    if (i21 == i7) {
                                        f(i7, 0, i7, 0, jc0Var);
                                    }
                                    int iO6 = jc0Var.o();
                                    f = jc0Var.V;
                                    if (jc0Var.W == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(i9, iO6, i9, (int) ((iO6 * f) + 0.5f), jc0Var);
                                    jc0Var.d.e.d(jc0Var.o());
                                    jc0Var.e.e.d(jc0Var.i());
                                    jc0Var.a = true;
                                } else if (i24 == 1) {
                                    f(i21, 0, i7, 0, jc0Var);
                                    jc0Var.e.e.m = jc0Var.i();
                                } else {
                                    i15 = i7;
                                    i16 = i21;
                                    if (i24 == 2) {
                                        i17 = iArr[1];
                                        if (i17 != i9) {
                                        }
                                        f(i16, jc0Var.o(), i9, (int) ((f3 * kc0Var.i()) + 0.5f), jc0Var);
                                        jc0Var.d.e.d(jc0Var.o());
                                        jc0Var.e.e.d(jc0Var.i());
                                        jc0Var.a = true;
                                    } else {
                                        i11 = i16;
                                        if (hb0VarArr[2].f != null) {
                                        }
                                        f(i15, 0, i8, 0, jc0Var);
                                        jc0Var.d.e.d(jc0Var.o());
                                        jc0Var.e.e.d(jc0Var.i());
                                        jc0Var.a = true;
                                    }
                                }
                                i13 = 1;
                                i14 = 3;
                                if (i11 == i14) {
                                    if (i23 != i13) {
                                        f(i12, 0, i12, 0, jc0Var);
                                        jc0Var.d.e.m = jc0Var.o();
                                        jc0Var.e.e.m = jc0Var.i();
                                    } else {
                                        f(i12, 0, i12, 0, jc0Var);
                                        jc0Var.d.e.m = jc0Var.o();
                                        jc0Var.e.e.m = jc0Var.i();
                                    }
                                }
                            }
                        } else {
                            i2 = 1;
                        }
                        iO = jc0Var.o();
                        if (i21 == 4) {
                            iO = (kc0Var.o() - hb0Var4.g) - hb0Var3.g;
                            i21 = i2;
                        }
                        i3 = jc0Var.i();
                        if (i22 == 4) {
                            i4 = i2;
                            i5 = (kc0Var.i() - hb0Var2.g) - hb0Var.g;
                        } else {
                            i4 = i22;
                            i5 = i3;
                        }
                        f(i21, iO, i4, i5, jc0Var);
                        jc0Var.d.e.d(jc0Var.o());
                        jc0Var.e.e.d(jc0Var.i());
                        jc0Var.a = true;
                    } else {
                        if (i21 != 3) {
                            if (i22 == i6) {
                            }
                            if (i23 == 3) {
                                if (i22 == i6) {
                                    f(i6, 0, i6, 0, jc0Var);
                                }
                                int i27 = jc0Var.i();
                                f(1, (int) ((i27 * jc0Var.V) + 0.5f), 1, i27, jc0Var);
                                jc0Var.d.e.d(jc0Var.o());
                                jc0Var.e.e.d(jc0Var.i());
                                jc0Var.a = true;
                            } else {
                                i7 = i6;
                                if (i23 == 1) {
                                    f(i7, 0, i22, 0, jc0Var);
                                    jc0Var.d.e.m = jc0Var.o();
                                } else if (i23 == 2) {
                                    i18 = iArr[c];
                                    if (i18 != 1) {
                                    }
                                    f(1, (int) ((f2 * kc0Var.o()) + 0.5f), i22, jc0Var.i(), jc0Var);
                                    jc0Var.d.e.d(jc0Var.o());
                                    jc0Var.e.e.d(jc0Var.i());
                                    jc0Var.a = true;
                                } else {
                                    i8 = i22;
                                    i9 = 1;
                                    if (hb0VarArr[c].f != null) {
                                    }
                                    f(i7, 0, i8, 0, jc0Var);
                                    jc0Var.d.e.d(jc0Var.o());
                                    jc0Var.e.e.d(jc0Var.i());
                                    jc0Var.a = true;
                                }
                            }
                        } else {
                            i7 = i6;
                            i8 = i22;
                            i9 = 1;
                        }
                        i10 = 3;
                        if (i8 != i10) {
                            i11 = i21;
                            i12 = i7;
                        } else if (i21 == i7) {
                            if (i24 == i10) {
                                if (i21 == i7) {
                                    f(i7, 0, i7, 0, jc0Var);
                                }
                                int iO7 = jc0Var.o();
                                f = jc0Var.V;
                                if (jc0Var.W == -1) {
                                    f = 1.0f / f;
                                }
                                f(i9, iO7, i9, (int) ((iO7 * f) + 0.5f), jc0Var);
                                jc0Var.d.e.d(jc0Var.o());
                                jc0Var.e.e.d(jc0Var.i());
                                jc0Var.a = true;
                            } else if (i24 == 1) {
                                f(i21, 0, i7, 0, jc0Var);
                                jc0Var.e.e.m = jc0Var.i();
                            } else {
                                i15 = i7;
                                i16 = i21;
                                if (i24 == 2) {
                                    i17 = iArr[1];
                                    if (i17 != i9) {
                                    }
                                    f(i16, jc0Var.o(), i9, (int) ((f3 * kc0Var.i()) + 0.5f), jc0Var);
                                    jc0Var.d.e.d(jc0Var.o());
                                    jc0Var.e.e.d(jc0Var.i());
                                    jc0Var.a = true;
                                } else {
                                    i11 = i16;
                                    if (hb0VarArr[2].f != null) {
                                    }
                                    f(i15, 0, i8, 0, jc0Var);
                                    jc0Var.d.e.d(jc0Var.o());
                                    jc0Var.e.e.d(jc0Var.i());
                                    jc0Var.a = true;
                                }
                            }
                        } else if (i24 == i10) {
                            if (i21 == i7) {
                                f(i7, 0, i7, 0, jc0Var);
                            }
                            int iO8 = jc0Var.o();
                            f = jc0Var.V;
                            if (jc0Var.W == -1) {
                                f = 1.0f / f;
                            }
                            f(i9, iO8, i9, (int) ((iO8 * f) + 0.5f), jc0Var);
                            jc0Var.d.e.d(jc0Var.o());
                            jc0Var.e.e.d(jc0Var.i());
                            jc0Var.a = true;
                        } else if (i24 == 1) {
                            f(i21, 0, i7, 0, jc0Var);
                            jc0Var.e.e.m = jc0Var.i();
                        } else {
                            i15 = i7;
                            i16 = i21;
                            if (i24 == 2) {
                                i17 = iArr[1];
                                if (i17 != i9) {
                                }
                                f(i16, jc0Var.o(), i9, (int) ((f3 * kc0Var.i()) + 0.5f), jc0Var);
                                jc0Var.d.e.d(jc0Var.o());
                                jc0Var.e.e.d(jc0Var.i());
                                jc0Var.a = true;
                            } else {
                                i11 = i16;
                                if (hb0VarArr[2].f != null) {
                                }
                                f(i15, 0, i8, 0, jc0Var);
                                jc0Var.d.e.d(jc0Var.o());
                                jc0Var.e.e.d(jc0Var.i());
                                jc0Var.a = true;
                            }
                        }
                        i13 = 1;
                        i14 = 3;
                        if (i11 == i14) {
                            if (i23 != i13) {
                                f(i12, 0, i12, 0, jc0Var);
                                jc0Var.d.e.m = jc0Var.o();
                                jc0Var.e.e.m = jc0Var.i();
                            } else {
                                f(i12, 0, i12, 0, jc0Var);
                                jc0Var.d.e.m = jc0Var.o();
                                jc0Var.e.e.m = jc0Var.i();
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
        }
    }

    public void c() {
        kc0 kc0Var = (kc0) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        kc0 kc0Var2 = (kc0) this.e;
        kc0Var2.d.f();
        kc0Var2.e.f();
        arrayList2.add(kc0Var2.d);
        arrayList2.add(kc0Var2.e);
        ArrayList arrayList3 = kc0Var2.p0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            jc0 jc0Var = (jc0) obj;
            if (jc0Var instanceof pk1) {
                qk1 qk1Var = new qk1(jc0Var);
                jc0Var.d.f();
                jc0Var.e.f();
                qk1Var.f = ((pk1) jc0Var).t0;
                arrayList2.add(qk1Var);
            } else {
                if (jc0Var.v()) {
                    if (jc0Var.b == null) {
                        jc0Var.b = new q00(jc0Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(jc0Var.b);
                } else {
                    arrayList2.add(jc0Var.d);
                }
                if (jc0Var.w()) {
                    if (jc0Var.c == null) {
                        jc0Var.c = new q00(jc0Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(jc0Var.c);
                } else {
                    arrayList2.add(jc0Var.e);
                }
                if (jc0Var instanceof ep) {
                    arrayList2.add(new yl1(jc0Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((ba5) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            ba5 ba5Var = (ba5) obj3;
            if (ba5Var.b != kc0Var2) {
                ba5Var.d();
            }
        }
        arrayList.clear();
        e(kc0Var.d, 0, arrayList);
        e(kc0Var.e, 1, arrayList);
        this.b = false;
    }

    public int d(kc0 kc0Var, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            ba5 ba5Var = ((v34) arrayList2.get(i3)).a;
            if (!(ba5Var instanceof q00) ? !(i != 0 ? (ba5Var instanceof w45) : (ba5Var instanceof up1)) : ((q00) ba5Var).f != i) {
                yo0 yo0Var = (i == 0 ? kc0Var.d : kc0Var.e).h;
                yo0 yo0Var2 = (i == 0 ? kc0Var.d : kc0Var.e).i;
                yo0 yo0Var3 = ba5Var.h;
                yo0 yo0Var4 = ba5Var.i;
                boolean zContains = yo0Var3.l.contains(yo0Var);
                boolean zContains2 = yo0Var4.l.contains(yo0Var2);
                long j4 = ba5Var.j();
                if (zContains && zContains2) {
                    long jB = v34.b(yo0Var3, j3);
                    arrayList = arrayList2;
                    long jA = v34.a(yo0Var4, j3);
                    long j5 = jB - j4;
                    int i4 = yo0Var4.f;
                    i2 = i3;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = yo0Var3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    jc0 jc0Var = ba5Var.b;
                    if (i == 0) {
                        f = jc0Var.c0;
                    } else if (i == 1) {
                        f = jc0Var.d0;
                    } else {
                        jc0Var.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) yo0Var3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) xa3.a(1.0f, f, f2, 0.5f)))) - ((long) yo0Var4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        j = Math.max(v34.b(yo0Var3, yo0Var3.f), ((long) yo0Var3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-v34.a(yo0Var4, yo0Var4.f), ((long) (-yo0Var4.f)) + j4);
                    } else {
                        j = (ba5Var.j() + ((long) yo0Var3.f)) - ((long) yo0Var4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            }
            jMax = Math.max(jMax, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j3 = 0;
        }
        return (int) jMax;
    }

    public void e(ba5 ba5Var, int i, ArrayList arrayList) {
        yo0 yo0Var = ba5Var.h;
        yo0 yo0Var2 = ba5Var.i;
        ArrayList arrayList2 = yo0Var.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            uo0 uo0Var = (uo0) obj;
            if (uo0Var instanceof yo0) {
                a((yo0) uo0Var, i, arrayList, null);
            } else if (uo0Var instanceof ba5) {
                a(((ba5) uo0Var).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = yo0Var2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            uo0 uo0Var2 = (uo0) obj2;
            if (uo0Var2 instanceof yo0) {
                a((yo0) uo0Var2, i, arrayList, null);
            } else if (uo0Var2 instanceof ba5) {
                a(((ba5) uo0Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((w45) ba5Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                uo0 uo0Var3 = (uo0) obj3;
                if (uo0Var3 instanceof yo0) {
                    a((yo0) uo0Var3, i, arrayList, null);
                }
            }
        }
    }

    public void f(int i, int i2, int i3, int i4, jc0 jc0Var) {
        kr krVar = (kr) this.i;
        krVar.a = i;
        krVar.b = i3;
        krVar.c = i2;
        krVar.d = i4;
        ((nr3) this.h).d(jc0Var, krVar);
        jc0Var.K(krVar.e);
        jc0Var.H(krVar.f);
        jc0Var.E = krVar.h;
        int i5 = krVar.g;
        jc0Var.Z = i5;
        jc0Var.E = i5 > 0;
    }

    public void g() {
        gr grVar;
        xo0 xo0Var = this;
        ArrayList arrayList = ((kc0) xo0Var.d).p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            jc0 jc0Var = (jc0) arrayList.get(i);
            if (!jc0Var.a) {
                int[] iArr = jc0Var.o0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = jc0Var.r;
                int i6 = jc0Var.s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                eq0 eq0Var = jc0Var.d.e;
                boolean z3 = eq0Var.j;
                eq0 eq0Var2 = jc0Var.e.e;
                boolean z4 = eq0Var2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    xo0Var.f(1, eq0Var.g, 1, eq0Var2.g, jc0Var);
                    jc0Var.a = true;
                } else if (z3 && z2) {
                    f(1, eq0Var.g, 2, eq0Var2.g, jc0Var);
                    w45 w45Var = jc0Var.e;
                    if (i4 == 3) {
                        w45Var.e.m = jc0Var.i();
                    } else {
                        w45Var.e.d(jc0Var.i());
                        jc0Var.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, eq0Var.g, 1, eq0Var2.g, jc0Var);
                    up1 up1Var = jc0Var.d;
                    if (i3 == 3) {
                        up1Var.e.m = jc0Var.o();
                    } else {
                        up1Var.e.d(jc0Var.o());
                        jc0Var.a = true;
                    }
                }
                if (jc0Var.a && (grVar = jc0Var.e.l) != null) {
                    grVar.d(jc0Var.Z);
                }
                xo0Var = this;
            }
            i = i2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4);
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3);
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2);
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return q40.B0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xo0() {
    }

    public /* synthetic */ xo0(boolean z, boolean z2, ge3 ge3Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, ge3Var, l, l2, l3, l4, v01.n);
    }
}
