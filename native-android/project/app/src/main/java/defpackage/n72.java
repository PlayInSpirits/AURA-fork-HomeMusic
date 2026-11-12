package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n72 implements jn4 {
    public final j03 a;
    public final /* synthetic */ o72 b;
    public final /* synthetic */ Object c;

    public n72(o72 o72Var, Object obj) {
        this.b = o72Var;
        this.c = obj;
        int[] iArr = m02.a;
        this.a = new j03();
    }

    @Override // defpackage.jn4
    public final void a() {
        o72.c(this.b, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ea] */
    /* JADX WARN: Type inference failed for: r5v10, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // defpackage.jn4
    public final void b(ea eaVar) {
        qx4 qx4Var;
        w12 w12Var;
        c72 c72Var = (c72) this.b.w.g(this.c);
        cx2 cx2Var = (c72Var == null || (w12Var = c72Var.Q) == null) ? null : (cx2) w12Var.g;
        if (cx2Var == null || !cx2Var.A) {
            return;
        }
        if (!cx2Var.n.A) {
            cz1.b("visitSubtreeIf called on an unattached node");
        }
        f13 f13Var = new f13(new cx2[16]);
        cx2 cx2Var2 = cx2Var.n;
        cx2 cx2Var3 = cx2Var2.s;
        if (cx2Var3 == null) {
            j51.b(f13Var, cx2Var2);
        } else {
            f13Var.b(cx2Var3);
        }
        while (true) {
            int i = f13Var.p;
            if (i == 0) {
                return;
            }
            cx2 cx2Var4 = (cx2) f13Var.k(i - 1);
            if ((cx2Var4.q & 262144) != 0) {
                cx2 cx2Var5 = cx2Var4;
                while (true) {
                    if (cx2Var5 != null && cx2Var5.A) {
                        if ((cx2Var5.p & 262144) != 0) {
                            ?? f13Var2 = 0;
                            ?? C = cx2Var5;
                            while (C != 0) {
                                if (C instanceof rx4) {
                                    rx4 rx4Var = (rx4) C;
                                    boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(rx4Var.f());
                                    qx4 qx4Var2 = qx4.o;
                                    if (zEquals) {
                                        eaVar.invoke(rx4Var);
                                        qx4Var = qx4Var2;
                                    } else {
                                        qx4Var = qx4.n;
                                    }
                                    if (qx4Var != qx4.p) {
                                        if (qx4Var == qx4Var2) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((C.p & 262144) != 0 && (C instanceof fo0)) {
                                    cx2 cx2Var6 = ((fo0) C).C;
                                    int i2 = 0;
                                    C = C;
                                    f13Var2 = f13Var2;
                                    while (cx2Var6 != null) {
                                        if ((cx2Var6.p & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                f13Var2 = f13Var2;
                                                C = cx2Var6;
                                            } else {
                                                if (f13Var2 == 0) {
                                                    f13Var2 = new f13(new cx2[16]);
                                                }
                                                if (C != 0) {
                                                    f13Var2.b(C);
                                                    C = 0;
                                                }
                                                f13Var2.b(cx2Var6);
                                            }
                                        }
                                        cx2Var6 = cx2Var6.s;
                                        C = C;
                                        f13Var2 = f13Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                C = j51.c(f13Var2);
                            }
                        }
                        cx2Var5 = cx2Var5.s;
                    }
                }
            }
            j51.b(f13Var, cx2Var4);
        }
    }

    @Override // defpackage.jn4
    public final int c() {
        c72 c72Var = (c72) this.b.w.g(this.c);
        if (c72Var != null) {
            return ((c13) c72Var.n()).n.p;
        }
        return 0;
    }

    @Override // defpackage.jn4
    public final void d(int i, long j) {
        o72 o72Var = this.b;
        c72 c72Var = (c72) o72Var.w.g(this.c);
        if (c72Var == null || !c72Var.G()) {
            return;
        }
        int i2 = ((c13) c72Var.n()).n.p;
        if (i < 0 || i >= i2) {
            cz1.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (c72Var.H()) {
            cz1.a("Pre-measure called on node that is not placed");
        }
        c72 c72Var2 = o72Var.n;
        c72Var2.C = true;
        ((ra) h12.L(c72Var)).r((c72) ((c13) c72Var.n()).get(i), j);
        c72Var2.C = false;
        this.a.a(i);
    }
}
