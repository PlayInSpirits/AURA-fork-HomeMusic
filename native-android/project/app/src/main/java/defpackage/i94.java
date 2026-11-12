package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i94 {
    public final cx2 a;
    public final boolean b;
    public final c72 c;
    public final e94 d;
    public i94 e;
    public final int f;

    public i94(cx2 cx2Var, boolean z, c72 c72Var, e94 e94Var) {
        this.a = cx2Var;
        this.b = z;
        this.c = c72Var;
        this.d = e94Var;
        this.f = c72Var.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final wv3 a(f63 f63Var) {
        ?? C;
        i94 i94VarL = l();
        if (i94VarL == null) {
            return wv3.e;
        }
        cx2 cx2Var = (cx2) i94VarL.c.Q.g;
        if ((cx2Var.q & 8) == 0) {
            C = 0;
            break;
        }
        loop0: while (true) {
            if (cx2Var != null) {
                if ((cx2Var.p & 8) != 0) {
                    C = cx2Var;
                    ?? f13Var = 0;
                    while (C != 0) {
                        if (C instanceof g94) {
                            if (((g94) C).c()) {
                                break loop0;
                            }
                        } else if ((C.p & 8) != 0 && (C instanceof fo0)) {
                            cx2 cx2Var2 = ((fo0) C).C;
                            int i = 0;
                            while (cx2Var2 != null) {
                                if ((cx2Var2.p & 8) != 0) {
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
                }
                if ((cx2Var.q & 8) != 0) {
                    cx2Var = cx2Var.s;
                }
            }
            C = 0;
            break;
        }
        g94 g94Var = (g94) C;
        f63 f63VarM = g94Var != null ? j51.M(g94Var, 8) : null;
        return f63VarM == null ? i94VarL.a(f63Var) : f63VarM.C(f63Var, true);
    }

    public final i94 b(m24 m24Var, if1 if1Var) {
        e94 e94Var = new e94();
        e94Var.p = false;
        e94Var.q = false;
        if1Var.invoke(e94Var);
        i94 i94Var = new i94(new h94(if1Var), false, new c72(this.f + (m24Var != null ? 1000000000 : 2000000000), true), e94Var);
        i94Var.e = this;
        return i94Var;
    }

    public final void c(c72 c72Var, ArrayList arrayList) {
        f13 f13VarX = c72Var.x();
        Object[] objArr = f13VarX.n;
        int i = f13VarX.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var2 = (c72) objArr[i2];
            if (c72Var2.G() && !c72Var2.Z) {
                if (c72Var2.Q.d(8)) {
                    arrayList.add(hw.a(c72Var2, this.b));
                } else {
                    c(c72Var2, arrayList);
                }
            }
        }
    }

    public final f63 d() {
        if (!o()) {
            g94 g94VarF = f();
            return g94VarF != null ? j51.M(g94VarF, 8) : (iz1) this.c.Q.d;
        }
        i94 i94VarL = l();
        if (i94VarL != null) {
            return i94VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            i94 i94Var = (i94) arrayList.get(size2);
            if (i94Var.p()) {
                arrayList2.add(i94Var);
            } else if (!i94Var.d.q) {
                i94Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [cx2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final g94 f() {
        ?? C;
        boolean z;
        ?? r0;
        boolean z2 = this.d.p;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        c72 c72Var = this.c;
        if (!z2) {
            cx2 cx2Var = (cx2) c72Var.Q.g;
            if ((cx2Var.q & 8) != 0) {
                loop3: while (cx2Var != null) {
                    if ((cx2Var.p & 8) != 0) {
                        C = cx2Var;
                        ?? f13Var = 0;
                        while (true) {
                            if (C != 0) {
                                if (C instanceof g94) {
                                    if (((g94) C).c()) {
                                        r4 = C;
                                    }
                                } else if ((C.p & 8) != 0 && (C instanceof fo0)) {
                                    cx2 cx2Var2 = ((fo0) C).C;
                                    int i = 0;
                                    while (cx2Var2 != null) {
                                        if ((cx2Var2.p & 8) != 0) {
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
                        }
                    }
                    if ((cx2Var.q & 8) == 0) {
                        break;
                    }
                    cx2Var = cx2Var.s;
                }
            }
        } else {
            cx2 cx2Var3 = (cx2) c72Var.Q.g;
            if ((cx2Var3.q & 8) != 0) {
                C = 0;
                while (cx2Var3 != null) {
                    if ((cx2Var3.p & 8) != 0) {
                        cx2 cx2VarC = cx2Var3;
                        f13 f13Var2 = null;
                        while (cx2VarC != null) {
                            if (cx2VarC instanceof g94) {
                                g94 g94Var = (g94) cx2VarC;
                                if (g94Var.c()) {
                                    if (g94Var.d0()) {
                                        r0 = C;
                                        r0 = C;
                                        return g94Var;
                                    }
                                    if (C == 0) {
                                        r0 = g94Var;
                                    }
                                }
                                r0 = C;
                                z = false;
                                C = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                C = C;
                                if ((cx2VarC.p & 8) != 0 && (cx2VarC instanceof fo0)) {
                                    int i2 = 0;
                                    for (cx2 cx2Var4 = ((fo0) cx2VarC).C; cx2Var4 != null; cx2Var4 = cx2Var4.s) {
                                        if ((cx2Var4.p & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cx2VarC = cx2Var4;
                                            } else {
                                                if (f13Var2 == null) {
                                                    f13Var2 = new f13(new cx2[16]);
                                                }
                                                if (cx2VarC != null) {
                                                    f13Var2.b(cx2VarC);
                                                    cx2VarC = null;
                                                }
                                                f13Var2.b(cx2Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                C = C;
                            }
                            cx2VarC = j51.c(f13Var2);
                        }
                    }
                    if ((cx2Var3.q & 8) == 0) {
                        break;
                    }
                    cx2Var3 = cx2Var3.s;
                    C = C;
                }
                r4 = C;
            }
        }
        return (g94) r4;
    }

    public final wv3 g() {
        f63 f63VarD = d();
        if (f63VarD != null) {
            if (!f63VarD.A0().A) {
                f63VarD = null;
            }
            if (f63VarD != null) {
                return wr1.n(f63VarD).C(f63VarD, true);
            }
        }
        return wv3.e;
    }

    public final wv3 h() {
        f63 f63VarD = d();
        if (f63VarD != null) {
            if (!f63VarD.A0().A) {
                f63VarD = null;
            }
            if (f63VarD != null) {
                return wr1.d(f63VarD, true);
            }
        }
        return wv3.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.q) {
            return u01.n;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return r(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final e94 k() {
        boolean zP = p();
        e94 e94Var = this.d;
        if (!zP) {
            return e94Var;
        }
        e94 e94VarB = e94Var.b();
        q(new ArrayList(), e94VarB);
        return e94VarB;
    }

    public final i94 l() {
        c72 c72VarT;
        i94 i94Var = this.e;
        if (i94Var != null) {
            return i94Var;
        }
        c72 c72Var = this.c;
        boolean z = this.b;
        if (!z) {
            c72VarT = null;
            break;
        }
        c72VarT = c72Var.t();
        while (true) {
            if (c72VarT == null) {
                c72VarT = null;
                break;
            }
            e94 e94VarV = c72VarT.v();
            if (e94VarV != null && e94VarV.p) {
                break;
            }
            c72VarT = c72VarT.t();
        }
        if (c72VarT == null) {
            for (c72 c72VarT2 = c72Var.t(); c72VarT2 != null; c72VarT2 = c72VarT2.t()) {
                if (c72VarT2.Q.d(8)) {
                    c72VarT = c72VarT2;
                }
            }
            c72VarT = null;
        }
        if (c72VarT == null) {
            return null;
        }
        return hw.a(c72VarT, z);
    }

    public final wv3 m() {
        eo0 eo0VarF = f();
        if (eo0VarF == null) {
            return ((iz1) this.c.Q.d).X0();
        }
        cx2 cx2Var = ((cx2) eo0VarF).n;
        Object objG = this.d.n.g(d94.b);
        if (objG == null) {
            objG = null;
        }
        return fu.s(cx2Var, objG != null, true);
    }

    public final e94 n() {
        return this.d;
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.p;
    }

    public final void q(ArrayList arrayList, e94 e94Var) {
        if (this.d.q) {
            return;
        }
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            i94 i94Var = (i94) arrayList.get(size2);
            if (!i94Var.p()) {
                e94Var.e(i94Var.d);
                i94Var.q(arrayList, e94Var);
            }
        }
    }

    public final List r(ArrayList arrayList, boolean z) {
        if (o()) {
            return u01.n;
        }
        c(this.c, arrayList);
        if (z) {
            e94 e94Var = this.d;
            w03 w03Var = e94Var.n;
            Object objG = w03Var.g(n94.w);
            if (objG == null) {
                objG = null;
            }
            m24 m24Var = (m24) objG;
            if (m24Var != null && e94Var.p && !arrayList.isEmpty()) {
                arrayList.add(b(m24Var, new o54(m24Var)));
            }
            p94 p94Var = n94.a;
            if (w03Var.c(p94Var) && !arrayList.isEmpty() && e94Var.p) {
                Object objG2 = w03Var.g(p94Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) q40.x0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new rs0(18, str)));
                }
            }
        }
        return arrayList;
    }
}
