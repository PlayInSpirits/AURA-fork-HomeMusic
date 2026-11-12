package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends b3 {
    public static d3 e;
    public static final o04 f = o04.o;
    public static final o04 g = o04.n;
    public ms4 c;
    public i94 d;

    @Override // defpackage.b3
    public final int[] f(int i) {
        int iB;
        if (j().length() > 0 && i < j().length()) {
            try {
                i94 i94Var = this.d;
                if (i94Var == null) {
                    h12.Q("node");
                    throw null;
                }
                wv3 wv3VarG = i94Var.g();
                int iRound = Math.round(wv3VarG.d - wv3VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                ms4 ms4Var = this.c;
                if (ms4Var == null) {
                    h12.Q("layoutResult");
                    throw null;
                }
                int iA = ms4Var.a(i);
                ms4 ms4Var2 = this.c;
                if (ms4Var2 == null) {
                    h12.Q("layoutResult");
                    throw null;
                }
                float fD = ms4Var2.d(iA) + iRound;
                ms4 ms4Var3 = this.c;
                if (ms4Var3 == null) {
                    h12.Q("layoutResult");
                    throw null;
                }
                float fD2 = ms4Var3.d(ms4Var3.b.b - 1);
                ms4 ms4Var4 = this.c;
                if (fD < fD2) {
                    if (ms4Var4 == null) {
                        h12.Q("layoutResult");
                        throw null;
                    }
                    iB = ms4Var4.b(fD);
                } else {
                    if (ms4Var4 == null) {
                        h12.Q("layoutResult");
                        throw null;
                    }
                    iB = ms4Var4.b.b;
                }
                return i(i, o(iB - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.b3
    public final int[] m(int i) {
        int iB;
        if (j().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            i94 i94Var = this.d;
            if (i94Var == null) {
                h12.Q("node");
                throw null;
            }
            wv3 wv3VarG = i94Var.g();
            int iRound = Math.round(wv3VarG.d - wv3VarG.b);
            int length = j().length();
            if (length <= i) {
                i = length;
            }
            ms4 ms4Var = this.c;
            if (ms4Var == null) {
                h12.Q("layoutResult");
                throw null;
            }
            int iA = ms4Var.a(i);
            ms4 ms4Var2 = this.c;
            if (ms4Var2 == null) {
                h12.Q("layoutResult");
                throw null;
            }
            float fD = ms4Var2.d(iA) - iRound;
            if (fD > 0.0f) {
                ms4 ms4Var3 = this.c;
                if (ms4Var3 == null) {
                    h12.Q("layoutResult");
                    throw null;
                }
                iB = ms4Var3.b(fD);
            } else {
                iB = 0;
            }
            if (i == j().length() && iB < iA) {
                iB++;
            }
            return i(o(iB, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int o(int i, o04 o04Var) {
        ms4 ms4Var = this.c;
        if (ms4Var == null) {
            h12.Q("layoutResult");
            throw null;
        }
        int iC = ms4Var.c(i);
        ms4 ms4Var2 = this.c;
        if (ms4Var2 == null) {
            h12.Q("layoutResult");
            throw null;
        }
        o04 o04VarE = ms4Var2.e(iC);
        ms4 ms4Var3 = this.c;
        if (o04Var != o04VarE) {
            if (ms4Var3 != null) {
                return ms4Var3.c(i);
            }
            h12.Q("layoutResult");
            throw null;
        }
        if (ms4Var3 == null) {
            h12.Q("layoutResult");
            throw null;
        }
        fd fdVar = ms4Var3.b;
        fdVar.c(i);
        ArrayList arrayList = (ArrayList) fdVar.e;
        od3 od3Var = (od3) arrayList.get(rr2.D(arrayList, i));
        return (od3Var.a.d.e(i - od3Var.d) + od3Var.b) - 1;
    }
}
