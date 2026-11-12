package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s80 implements da4 {
    public final gy3 n;
    public long o;

    public s80(List list, List list2) {
        uw1 uw1VarJ = yw1.j();
        rr2.l(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            uw1VarJ.c(new r80((da4) list.get(i), (List) list2.get(i)));
        }
        this.n = uw1VarJ.f();
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.da4
    public final long d() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            gy3 gy3Var = this.n;
            if (i >= gy3Var.q) {
                break;
            }
            long jD = ((r80) gy3Var.get(i)).n.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.da4
    public final boolean f() {
        int i = 0;
        while (true) {
            gy3 gy3Var = this.n;
            if (i >= gy3Var.q) {
                return false;
            }
            if (((r80) gy3Var.get(i)).n.f()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        boolean zO;
        boolean z = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zO = false;
            while (true) {
                gy3 gy3Var = this.n;
                if (i >= gy3Var.q) {
                    break;
                }
                long jD2 = ((r80) gy3Var.get(i)).n.d();
                boolean z2 = jD2 != Long.MIN_VALUE && jD2 <= pd2Var.a;
                if (jD2 == jD || z2) {
                    zO |= ((r80) gy3Var.get(i)).n.o(pd2Var);
                }
                i++;
            }
            z |= zO;
        } while (zO);
        return z;
    }

    @Override // defpackage.da4
    public final long q() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            gy3 gy3Var = this.n;
            if (i >= gy3Var.q) {
                break;
            }
            r80 r80Var = (r80) gy3Var.get(i);
            long jQ = r80Var.n.q();
            yw1 yw1Var = r80Var.o;
            if ((yw1Var.contains(1) || yw1Var.contains(2) || yw1Var.contains(4)) && jQ != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jQ);
            }
            if (jQ != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jQ);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.o = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.o;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.da4
    public final void u(long j) {
        int i = 0;
        while (true) {
            gy3 gy3Var = this.n;
            if (i >= gy3Var.q) {
                return;
            }
            ((r80) gy3Var.get(i)).u(j);
            i++;
        }
    }
}
