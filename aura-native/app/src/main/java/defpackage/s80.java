package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s80 implements da4 {
    public final gy3 n;
    public long o;

    public s80(List list, List list2) {
        uw1 j = yw1.j();
        rr2.l(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            j.c(new r80((da4) list.get(i), (List) list2.get(i)));
        }
        this.n = j.f();
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.da4
    public final long d() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            gy3 gy3Var = this.n;
            if (i >= gy3Var.q) {
                break;
            }
            long d = ((r80) gy3Var.get(i)).n.d();
            if (d != Long.MIN_VALUE) {
                j = Math.min(j, d);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
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
        boolean z;
        boolean z2 = false;
        do {
            long d = d();
            if (d == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            z = false;
            while (true) {
                gy3 gy3Var = this.n;
                if (i >= gy3Var.q) {
                    break;
                }
                long d2 = ((r80) gy3Var.get(i)).n.d();
                boolean z3 = d2 != Long.MIN_VALUE && d2 <= pd2Var.a;
                if (d2 == d || z3) {
                    z |= ((r80) gy3Var.get(i)).n.o(pd2Var);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.da4
    public final long q() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            gy3 gy3Var = this.n;
            if (i >= gy3Var.q) {
                break;
            }
            r80 r80Var = (r80) gy3Var.get(i);
            long q = r80Var.n.q();
            yw1 yw1Var = r80Var.o;
            if ((yw1Var.contains(1) || yw1Var.contains(2) || yw1Var.contains(4)) && q != Long.MIN_VALUE) {
                j = Math.min(j, q);
            }
            if (q != Long.MIN_VALUE) {
                j2 = Math.min(j2, q);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.o = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.o;
        return j3 != -9223372036854775807L ? j3 : j2;
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
