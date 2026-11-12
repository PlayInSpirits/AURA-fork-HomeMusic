package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d63 implements e63 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.e63
    public final boolean a(cx2 cx2Var) {
        ?? f13Var = 0;
        while (true) {
            int i = 0;
            if (cx2Var == 0) {
                return false;
            }
            if (cx2Var instanceof rn3) {
                if (((rn3) cx2Var).z()) {
                    return true;
                }
            } else if ((cx2Var.p & 16) != 0 && (cx2Var instanceof fo0)) {
                cx2 cx2Var2 = ((fo0) cx2Var).C;
                while (cx2Var2 != null) {
                    if ((cx2Var2.p & 16) != 0) {
                        i++;
                        if (i == 1) {
                            f13Var = f13Var;
                            cx2Var = cx2Var;
                            f13Var = f13Var;
                            cx2Var = cx2Var2;
                        } else {
                            if (f13Var == 0) {
                                f13Var = new f13(new cx2[16]);
                            }
                            if (cx2Var != 0) {
                                f13Var.b(cx2Var);
                                cx2Var = 0;
                            }
                            f13Var.b(cx2Var2);
                        }
                    } else {
                        f13Var = f13Var;
                        cx2Var = cx2Var;
                    }
                    cx2Var2 = cx2Var2.s;
                    f13Var = f13Var;
                    cx2Var = cx2Var;
                }
                if (i == 1) {
                    f13Var = f13Var;
                    cx2Var = cx2Var;
                } else {
                    f13Var = f13Var;
                    cx2Var = cx2Var;
                }
            }
            cx2Var = j51.c(f13Var);
        }
    }

    @Override // defpackage.e63
    public final int d() {
        return 16;
    }

    @Override // defpackage.e63
    public final void i(c72 c72Var, long j, fm1 fm1Var, int i, boolean z) {
        c72Var.z(j, fm1Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.e63
    public final boolean k(fm1 fm1Var, c72 c72Var) {
        f63 f63Var = (f63) c72Var.Q.e;
        f63Var.getClass();
        cx2 cx2VarD0 = f63Var.D0(g63.f(16));
        if (cx2VarD0 != null && cx2VarD0.A) {
            if (!cx2VarD0.n.A) {
                cz1.b("visitLocalDescendants called on an unattached node");
            }
            cx2 cx2Var = cx2VarD0.n;
            if ((cx2Var.q & 16) != 0) {
                while (cx2Var != null) {
                    if ((cx2Var.p & 16) != 0) {
                        ?? C = cx2Var;
                        ?? f13Var = 0;
                        while (C != 0) {
                            if (C instanceof rn3) {
                                if (((rn3) C).X()) {
                                    fm1Var.p = fm1Var.n.b - 1;
                                    return true;
                                }
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
                    }
                    cx2Var = cx2Var.s;
                }
            }
        }
        return false;
    }

    @Override // defpackage.e63
    public final boolean m(c72 c72Var) {
        return true;
    }
}
