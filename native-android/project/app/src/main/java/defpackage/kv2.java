package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kv2 implements kg0 {
    public static final h90 b = new h90(new kw(new zr2(23), x13.o), new kw(new zr2(24), x13.p));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.kg0
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((lg0) arrayList.get(i)).b;
            long j3 = ((lg0) arrayList.get(i)).d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
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
                gy3 gy3VarQ = yw1.q(b, arrayList2);
                uw1 uw1VarJ = yw1.j();
                for (int i2 = 0; i2 < gy3VarQ.q; i2++) {
                    uw1VarJ.d(((lg0) gy3VarQ.get(i2)).a);
                }
                return uw1VarJ.f();
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
        long jMax = ((lg0) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((lg0) arrayList.get(i)).b;
            long j3 = ((lg0) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
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
