package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mg0 implements qn4 {
    public static final kw p = new kw(new kf2(27), x13.o);
    public final yw1 n;
    public final long[] o;

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public mg0(gy3 gy3Var) {
        int i = gy3Var.q;
        long j = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            vw1 vw1VarListIterator = gy3Var.listIterator(0);
            Object next = vw1VarListIterator.next();
            if (vw1VarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && vw1VarListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(vw1VarListIterator.next());
                    i2++;
                }
                if (vw1VarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            lg0 lg0Var = (lg0) next;
            long j2 = lg0Var.b;
            long j3 = lg0Var.c;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            yw1 yw1Var = lg0Var.a;
            if (j3 == -9223372036854775807L) {
                this.n = yw1.o(yw1Var);
                this.o = new long[]{j4};
                return;
            } else {
                vw1 vw1Var = yw1.o;
                this.n = yw1.p(yw1Var, gy3.r);
                this.o = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.o = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        gy3 gy3VarQ = yw1.q(p, gy3Var);
        int i3 = 0;
        while (i2 < gy3VarQ.q) {
            lg0 lg0Var2 = (lg0) gy3VarQ.get(i2);
            long j5 = lg0Var2.b;
            long j6 = lg0Var2.c;
            yw1 yw1Var2 = lg0Var2.a;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j8 = this.o[i4];
                if (j8 < j5) {
                    this.o[i3] = j5;
                    arrayList.add(yw1Var2);
                    i3++;
                } else if (j8 == j5 && ((yw1) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, yw1Var2);
                } else {
                    l93.q0("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.o[i4] = j5;
                    arrayList.set(i4, yw1Var2);
                }
            } else {
                this.o[i3] = j5;
                arrayList.add(yw1Var2);
                i3++;
            }
            if (j6 != j) {
                this.o[i3] = j7;
                arrayList.add(gy3.r);
                i3++;
            }
            i2++;
            j = j;
        }
        this.n = yw1.k(arrayList);
    }

    @Override // defpackage.qn4
    public final int e(long j) {
        int iB = f35.b(this.o, j, false);
        if (iB < this.n.size()) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.qn4
    public final long k(int i) {
        rr2.l(i < this.n.size());
        return this.o[i];
    }

    @Override // defpackage.qn4
    public final List m(long j) {
        int iF = f35.f(this.o, j, false);
        if (iF != -1) {
            return (yw1) this.n.get(iF);
        }
        vw1 vw1Var = yw1.o;
        return gy3.r;
    }

    @Override // defpackage.qn4
    public final int n() {
        return this.n.size();
    }
}
