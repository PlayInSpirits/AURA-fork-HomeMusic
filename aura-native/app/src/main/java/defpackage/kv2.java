package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kv2 implements kg0 {
    public static final h90 b = new h90(new kw(new zr2(23), x13.o), new kw(new zr2(24), x13.p));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.kg0
    public final long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((lg0) arrayList.get(i)).b;
            long j4 = ((lg0) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.kg0
    public final boolean b(lg0 lg0Var, long j) {
        long j2 = lg0Var.b;
        rr2.l(j2 != -9223372036854775807L);
        rr2.l(lg0Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < lg0Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((lg0) arrayList.get(size)).b) {
                arrayList.add(size + 1, lg0Var);
                return z;
            }
        }
        arrayList.add(0, lg0Var);
        return z;
    }

    @Override // defpackage.kg0
    public final yw1 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((lg0) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    lg0 lg0Var = (lg0) arrayList.get(i);
                    if (j >= lg0Var.b && j < lg0Var.d) {
                        arrayList2.add(lg0Var);
                    }
                    if (j < lg0Var.b) {
                        break;
                    }
                }
                gy3 q = yw1.q(b, arrayList2);
                uw1 j2 = yw1.j();
                for (int i2 = 0; i2 < q.q; i2++) {
                    j2.d(((lg0) q.get(i2)).a);
                }
                return j2.f();
            }
        }
        vw1 vw1Var = yw1.o;
        return gy3.r;
    }

    @Override // defpackage.kg0
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.kg0
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((lg0) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j2 = ((lg0) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((lg0) arrayList.get(i)).b;
            long j4 = ((lg0) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    @Override // defpackage.kg0
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((lg0) arrayList.get(i)).b;
            if (j > j2 && j > ((lg0) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
