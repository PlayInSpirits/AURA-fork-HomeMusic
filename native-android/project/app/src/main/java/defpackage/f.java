package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final yw a;
    public static final yw b;
    public static final yw c;
    public static final yw d;
    public static final yw e;

    static {
        yw ywVar = yw.q;
        a = pa.t("/");
        b = pa.t("\\");
        c = pa.t("/\\");
        d = pa.t(".");
        e = pa.t("..");
    }

    public static final int a(ge3 ge3Var) {
        yw ywVar = ge3Var.n;
        if (ywVar.d() != 0) {
            if (ywVar.i(0) != 47) {
                if (ywVar.i(0) == 92) {
                    if (ywVar.d() > 2 && ywVar.i(1) == 92) {
                        yw ywVar2 = b;
                        ywVar2.getClass();
                        int iF = ywVar.f(2, ywVar2.h());
                        return iF == -1 ? ywVar.d() : iF;
                    }
                } else if (ywVar.d() > 2 && ywVar.i(1) == 58 && ywVar.i(2) == 92) {
                    char cI = (char) ywVar.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final ge3 b(ge3 ge3Var, ge3 ge3Var2, boolean z) {
        ge3Var2.getClass();
        if (a(ge3Var2) != -1 || ge3Var2.e() != null) {
            return ge3Var2;
        }
        yw ywVarC = c(ge3Var);
        if (ywVarC == null && (ywVarC = c(ge3Var2)) == null) {
            ywVarC = f(ge3.o);
        }
        tv tvVar = new tv();
        tvVar.X(ge3Var.n);
        if (tvVar.o > 0) {
            tvVar.X(ywVarC);
        }
        tvVar.X(ge3Var2.n);
        return d(tvVar, z);
    }

    public static final yw c(ge3 ge3Var) {
        yw ywVar = ge3Var.n;
        yw ywVar2 = a;
        if (yw.g(ywVar, ywVar2) != -1) {
            return ywVar2;
        }
        yw ywVar3 = ge3Var.n;
        yw ywVar4 = b;
        if (yw.g(ywVar3, ywVar4) != -1) {
            return ywVar4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00fe A[SYNTHETIC] */
    public static final ge3 d(tv tvVar, boolean z) {
        yw ywVar;
        long j;
        char cQ;
        boolean z2;
        ArrayList arrayList;
        boolean zL;
        yw ywVar2;
        int size;
        int i;
        long jU;
        yw ywVarG;
        yw ywVar3;
        tv tvVar2 = new tv();
        yw ywVarE = null;
        int i2 = 0;
        while (true) {
            if (!tvVar.v(a)) {
                ywVar = b;
                if (!tvVar.v(ywVar)) {
                    break;
                }
            }
            byte b2 = tvVar.readByte();
            if (ywVarE == null) {
                ywVarE = e(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && h12.c(ywVarE, ywVar);
        yw ywVar4 = c;
        if (z3) {
            ywVarE.getClass();
            tvVar2.X(ywVarE);
            tvVar2.X(ywVarE);
        } else {
            if (i2 <= 0) {
                long jU2 = tvVar.u(ywVar4);
                if (ywVarE == null) {
                    ywVarE = jU2 == -1 ? f(ge3.o) : e(tvVar.q(jU2));
                }
                if (h12.c(ywVarE, ywVar) && tvVar.o >= 2) {
                    j = -1;
                    if (tvVar.q(1L) == 58 && (('a' <= (cQ = (char) tvVar.q(0L)) && cQ < '{') || ('A' <= cQ && cQ < '['))) {
                        if (jU2 == 2) {
                            tvVar2.L(tvVar, 3L);
                        } else {
                            tvVar2.L(tvVar, 2L);
                        }
                    }
                }
                if (tvVar2.o > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zL = tvVar.l();
                    ywVar2 = d;
                    if (!zL) {
                        break;
                    }
                    jU = tvVar.u(ywVar4);
                    if (jU == j) {
                        ywVarG = tvVar.g(tvVar.o);
                    } else {
                        ywVarG = tvVar.g(jU);
                        tvVar.readByte();
                    }
                    ywVar3 = e;
                    if (h12.c(ywVarG, ywVar3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || h12.c(q40.C0(arrayList), ywVar3)))) {
                                arrayList.add(ywVarG);
                            } else if (!z3 || arrayList.size() != 1) {
                                v40.r0(arrayList);
                            }
                        }
                    } else if (h12.c(ywVarG, ywVar2) && !h12.c(ywVarG, yw.q)) {
                        arrayList.add(ywVarG);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        tvVar2.X(ywVarE);
                    }
                    tvVar2.X((yw) arrayList.get(i));
                }
                if (tvVar2.o == 0) {
                    tvVar2.X(ywVar2);
                }
                return new ge3(tvVar2.g(tvVar2.o));
            }
            ywVarE.getClass();
            tvVar2.X(ywVarE);
        }
        j = -1;
        if (tvVar2.o > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zL = tvVar.l();
            ywVar2 = d;
            if (!zL) {
                break;
                break;
            }
            jU = tvVar.u(ywVar4);
            if (jU == j) {
                ywVarG = tvVar.g(tvVar.o);
            } else {
                ywVarG = tvVar.g(jU);
                tvVar.readByte();
            }
            ywVar3 = e;
            if (h12.c(ywVarG, ywVar3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(ywVarG);
            } else if (h12.c(ywVarG, ywVar2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                tvVar2.X(ywVarE);
            }
            tvVar2.X((yw) arrayList.get(i));
        }
        if (tvVar2.o == 0) {
            tvVar2.X(ywVar2);
        }
        return new ge3(tvVar2.g(tvVar2.o));
    }

    public static final yw e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        kf2.n(f34.f(b2, "not a directory separator: "));
        return null;
    }

    public static final yw f(String str) {
        if (h12.c(str, "/")) {
            return a;
        }
        if (h12.c(str, "\\")) {
            return b;
        }
        kf2.n(xa3.g("not a directory separator: ", str));
        return null;
    }
}
