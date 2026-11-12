package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a63 extends i63 {
    public final cx2 c;
    public final te2 d;
    public final xe2 e;
    public f63 f;
    public kn3 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public a63(cx2 cx2Var) {
        this.c = cx2Var;
        te2 te2Var = new te2();
        te2Var.c = new long[2];
        this.d = te2Var;
        this.e = new xe2(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // defpackage.i63
    public final boolean a(xe2 xe2Var, q62 q62Var, gp3 gp3Var, boolean z) {
        te2 te2Var;
        xe2 xe2Var2;
        Object obj;
        boolean z2;
        boolean z3;
        kn3 kn3Var;
        int i;
        int i2;
        boolean z4;
        boolean zA = super.a(xe2Var, q62Var, gp3Var, z);
        ?? C = this.c;
        boolean z5 = true;
        if (C.A) {
            ?? f13Var = 0;
            while (C != 0) {
                if (C instanceof rn3) {
                    this.f = j51.M((rn3) C, 16);
                } else if ((C.p & 16) != 0 && (C instanceof fo0)) {
                    cx2 cx2Var = ((fo0) C).C;
                    int i3 = 0;
                    while (cx2Var != null) {
                        if ((cx2Var.p & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                C = C;
                                f13Var = f13Var;
                                f13Var = f13Var;
                                C = cx2Var;
                            } else {
                                if (f13Var == 0) {
                                    f13Var = new f13(new cx2[16]);
                                }
                                if (C != 0) {
                                    f13Var.b(C);
                                    C = 0;
                                }
                                f13Var.b(cx2Var);
                            }
                        } else {
                            C = C;
                            f13Var = f13Var;
                        }
                        cx2Var = cx2Var.s;
                        C = C;
                        f13Var = f13Var;
                    }
                    if (i3 == 1) {
                        C = C;
                        f13Var = f13Var;
                    } else {
                        C = C;
                        f13Var = f13Var;
                    }
                }
                C = j51.c(f13Var);
            }
            if (this.f != null) {
                int iH = xe2Var.h();
                int i4 = 0;
                while (true) {
                    te2Var = this.d;
                    xe2Var2 = this.e;
                    if (i4 >= iH) {
                        break;
                    }
                    long jE = xe2Var.e(i4);
                    on3 on3Var = (on3) xe2Var.i(i4);
                    if (te2Var.c(jE)) {
                        boolean z6 = z5;
                        long j = on3Var.g;
                        long j2 = on3Var.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z4 = z6;
                            ArrayList arrayList = new ArrayList(on3Var.b().size());
                            List listB = on3Var.b();
                            int size = listB.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List list = listB;
                                bm1 bm1Var = (bm1) listB.get(i5);
                                xe2 xe2Var3 = xe2Var2;
                                long j3 = jE;
                                long j4 = bm1Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = bm1Var.a;
                                    f63 f63Var = this.f;
                                    f63Var.getClass();
                                    arrayList.add(new bm1(j5, f63Var.A(q62Var, j4), bm1Var.c, bm1Var.d, bm1Var.e));
                                }
                                i5++;
                                size = size;
                                listB = list;
                                xe2Var2 = xe2Var3;
                                jE = j3;
                                on3Var = on3Var;
                            }
                            xe2 xe2Var4 = xe2Var2;
                            long j6 = jE;
                            f63 f63Var2 = this.f;
                            f63Var2.getClass();
                            long jA = f63Var2.A(q62Var, j);
                            f63 f63Var3 = this.f;
                            f63Var3.getClass();
                            on3 on3Var2 = new on3(on3Var.a, on3Var.b, f63Var3.A(q62Var, j2), on3Var.d, on3Var.e, on3Var.f, jA, on3Var.h, on3Var.i, arrayList, on3Var.j, on3Var.k, on3Var.l, on3Var.n);
                            on3 on3Var3 = on3Var.q;
                            if (on3Var3 == null) {
                                on3Var3 = on3Var;
                            }
                            on3Var2.q = on3Var3;
                            on3 on3Var4 = on3Var.q;
                            if (on3Var4 != null) {
                                on3Var = on3Var4;
                            }
                            on3Var2.q = on3Var;
                            xe2Var4.f(j6, on3Var2);
                        } else {
                            z4 = z6;
                        }
                    } else {
                        z4 = z5;
                    }
                    i4++;
                    z5 = z4;
                    iH = iH;
                    zA = zA;
                }
                boolean z7 = zA;
                boolean z8 = z5;
                if (xe2Var2.d()) {
                    te2Var.b = 0;
                    this.a.g();
                    return z8;
                }
                int i6 = te2Var.b;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    if (xe2Var.c(te2Var.c[i6]) < 0 && i6 < (i2 = te2Var.b)) {
                        int i7 = i2 - 1;
                        int i8 = i6;
                        while (i8 < i7) {
                            long[] jArr = te2Var.c;
                            int i9 = i8 + 1;
                            jArr[i8] = jArr[i9];
                            i8 = i9;
                        }
                        te2Var.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(xe2Var2.h());
                int iH2 = xe2Var2.h();
                for (int i10 = 0; i10 < iH2; i10++) {
                    arrayList2.add(xe2Var2.i(i10));
                }
                kn3 kn3Var2 = new kn3(arrayList2, gp3Var);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i11);
                    if (gp3Var.c(((on3) obj).a)) {
                        break;
                    }
                    i11++;
                }
                on3 on3Var5 = (on3) obj;
                if (on3Var5 != null) {
                    boolean z9 = on3Var5.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z9 || on3Var5.h)) {
                            f63 f63Var4 = this.f;
                            f63Var4.getClass();
                            long j7 = f63Var4.p;
                            long j8 = on3Var5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i12 = (int) (j7 >> 32);
                            this.i = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z8 : false) | (fIntBitsToFloat > ((float) i12) ? z8 : false) | (fIntBitsToFloat < 0.0f ? z8 : false) | (fIntBitsToFloat2 < 0.0f ? z8 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z10 = this.i;
                    boolean z11 = this.h;
                    if (z10 == z11 || !((i = kn3Var2.c) == 3 || i == 4 || i == 5)) {
                        int i13 = kn3Var2.c;
                        if (i13 == 4 && z11 && !this.j) {
                            kn3Var2.c = 3;
                        } else if (i13 == 5 && z10 && z9) {
                            kn3Var2.c = 3;
                        }
                    } else {
                        kn3Var2.c = z10 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z7 && kn3Var2.c == 3 && (kn3Var = this.g) != null) {
                    ?? r1 = kn3Var.a;
                    int size3 = r1.size();
                    ?? r5 = kn3Var2.a;
                    if (size3 != r5.size()) {
                        z3 = z8;
                        break;
                    }
                    int size4 = r5.size();
                    ?? r6 = z2;
                    while (true) {
                        if (r6 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!g83.b(((on3) r1.get(r6)).c, ((on3) r5.get(r6)).c)) {
                            z3 = z8;
                            break;
                        }
                        r6++;
                    }
                } else {
                    z3 = z8;
                    break;
                }
                this.g = kn3Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.i63
    public final void b(gp3 gp3Var) {
        super.b(gp3Var);
        kn3 kn3Var = this.g;
        if (kn3Var == null) {
            return;
        }
        this.h = this.i;
        List list = kn3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            on3 on3Var = (on3) list.get(i);
            boolean z = on3Var.d;
            long j = on3Var.a;
            boolean zC = gp3Var.c(j);
            boolean z2 = this.i;
            if ((!z && !zC) || (!z && !z2)) {
                this.d.e(j);
            }
        }
        this.i = false;
        this.j = kn3Var.c == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [f13] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [f13] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        f13 f13Var = this.a;
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        for (int i2 = 0; i2 < i; i2++) {
            ((a63) objArr[i2]).c();
        }
        ?? C = this.c;
        ?? f13Var2 = 0;
        while (C != 0) {
            if (C instanceof rn3) {
                ((rn3) C).t();
            } else if ((C.p & 16) != 0 && (C instanceof fo0)) {
                cx2 cx2Var = ((fo0) C).C;
                int i3 = 0;
                f13Var2 = f13Var2;
                C = C;
                while (cx2Var != null) {
                    if ((cx2Var.p & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            f13Var2 = f13Var2;
                            C = cx2Var;
                        } else {
                            if (f13Var2 == 0) {
                                f13Var2 = new f13(new cx2[16]);
                            }
                            if (C != 0) {
                                f13Var2.b(C);
                                C = 0;
                            }
                            f13Var2.b(cx2Var);
                        }
                    }
                    cx2Var = cx2Var.s;
                    f13Var2 = f13Var2;
                    C = C;
                }
                if (i3 == 1) {
                }
            }
            C = j51.c(f13Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(gp3 gp3Var) {
        c72 c72Var;
        xe2 xe2Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (!xe2Var.d()) {
            cx2 cx2Var = this.c;
            if (cx2Var.A) {
                f63 f63Var = cx2Var.u;
                if ((f63Var == null || (c72Var = f63Var.H) == null) ? false : c72Var.H()) {
                    kn3 kn3Var = this.g;
                    kn3Var.getClass();
                    f63 f63Var2 = this.f;
                    f63Var2.getClass();
                    long j = f63Var2.p;
                    ?? C = cx2Var;
                    ?? f13Var = 0;
                    while (C != 0) {
                        if (C instanceof rn3) {
                            ((rn3) C).n(kn3Var, ln3.p, j);
                        } else if ((C.p & 16) != 0 && (C instanceof fo0)) {
                            cx2 cx2Var2 = ((fo0) C).C;
                            int i = 0;
                            while (cx2Var2 != null) {
                                if ((cx2Var2.p & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        C = C;
                                        f13Var = f13Var;
                                        f13Var = f13Var;
                                        C = cx2Var2;
                                    } else {
                                        if (f13Var == 0) {
                                            f13Var = new f13(new cx2[16]);
                                        }
                                        if (C != 0) {
                                            f13Var.b(C);
                                            C = 0;
                                        }
                                        f13Var.b(cx2Var2);
                                    }
                                } else {
                                    C = C;
                                    f13Var = f13Var;
                                }
                                cx2Var2 = cx2Var2.s;
                                C = C;
                                f13Var = f13Var;
                            }
                            if (i == 1) {
                                C = C;
                                f13Var = f13Var;
                            } else {
                                C = C;
                                f13Var = f13Var;
                            }
                        }
                        C = j51.c(f13Var);
                    }
                    if (cx2Var.A) {
                        f13 f13Var2 = this.a;
                        Object[] objArr = f13Var2.n;
                        int i2 = f13Var2.p;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((a63) objArr[i3]).d(gp3Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(gp3Var);
        xe2Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [f13] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [f13] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r6v10, types: [cx2] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(gp3 gp3Var, boolean z) {
        c72 c72Var;
        if (!this.e.d()) {
            ?? C = this.c;
            if (C.A) {
                f63 f63Var = C.u;
                if ((f63Var == null || (c72Var = f63Var.H) == null) ? false : c72Var.H()) {
                    kn3 kn3Var = this.g;
                    kn3Var.getClass();
                    f63 f63Var2 = this.f;
                    f63Var2.getClass();
                    long j = f63Var2.p;
                    ?? C2 = C;
                    ?? f13Var = 0;
                    while (C2 != 0) {
                        if (C2 instanceof rn3) {
                            ((rn3) C2).n(kn3Var, ln3.n, j);
                        } else if ((C2.p & 16) != 0 && (C2 instanceof fo0)) {
                            cx2 cx2Var = ((fo0) C2).C;
                            int i = 0;
                            while (cx2Var != null) {
                                if ((cx2Var.p & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        C2 = C2;
                                        f13Var = f13Var;
                                        f13Var = f13Var;
                                        C2 = cx2Var;
                                    } else {
                                        if (f13Var == 0) {
                                            f13Var = new f13(new cx2[16]);
                                        }
                                        if (C2 != 0) {
                                            f13Var.b(C2);
                                            C2 = 0;
                                        }
                                        f13Var.b(cx2Var);
                                    }
                                } else {
                                    C2 = C2;
                                    f13Var = f13Var;
                                }
                                cx2Var = cx2Var.s;
                                C2 = C2;
                                f13Var = f13Var;
                            }
                            if (i == 1) {
                                C2 = C2;
                                f13Var = f13Var;
                            } else {
                                C2 = C2;
                                f13Var = f13Var;
                            }
                        }
                        C2 = j51.c(f13Var);
                    }
                    if (C.A) {
                        f13 f13Var2 = this.a;
                        Object[] objArr = f13Var2.n;
                        int i2 = f13Var2.p;
                        for (int i3 = 0; i3 < i2; i3++) {
                            a63 a63Var = (a63) objArr[i3];
                            this.f.getClass();
                            a63Var.e(gp3Var, z);
                        }
                    }
                    if (C.A) {
                        ?? f13Var3 = 0;
                        while (C != 0) {
                            if (C instanceof rn3) {
                                ((rn3) C).n(kn3Var, ln3.o, j);
                            } else if ((C.p & 16) != 0 && (C instanceof fo0)) {
                                cx2 cx2Var2 = ((fo0) C).C;
                                int i4 = 0;
                                while (cx2Var2 != null) {
                                    if ((cx2Var2.p & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            C = C;
                                            f13Var3 = f13Var3;
                                            f13Var3 = f13Var3;
                                            C = cx2Var2;
                                        } else {
                                            if (f13Var3 == 0) {
                                                f13Var3 = new f13(new cx2[16]);
                                            }
                                            if (C != 0) {
                                                f13Var3.b(C);
                                                C = 0;
                                            }
                                            f13Var3.b(cx2Var2);
                                        }
                                    } else {
                                        C = C;
                                        f13Var3 = f13Var3;
                                    }
                                    cx2Var2 = cx2Var2.s;
                                    C = C;
                                    f13Var3 = f13Var3;
                                }
                                if (i4 == 1) {
                                    C = C;
                                    f13Var3 = f13Var3;
                                } else {
                                    C = C;
                                    f13Var3 = f13Var3;
                                }
                            }
                            C = j51.c(f13Var3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, q03 q03Var) {
        te2 te2Var = this.d;
        if (te2Var.c(j) && q03Var.g(this) < 0) {
            te2Var.e(j);
            this.e.g(j);
        }
        f13 f13Var = this.a;
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        for (int i2 = 0; i2 < i; i2++) {
            ((a63) objArr[i2]).f(j, q03Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
