package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xv1 implements kg0 {
    public final ArrayList a;

    public xv1(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    @Override // defpackage.kg0
    public long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((lg0) arrayList.get(0)).b) {
            return ((lg0) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            lg0 lg0Var = (lg0) arrayList.get(i);
            long j2 = lg0Var.b;
            long j3 = lg0Var.b;
            if (j < j2) {
                long j4 = ((lg0) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((lg0) te5.w(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // defpackage.kg0
    public boolean b(lg0 lg0Var, long j) {
        boolean z;
        long j2 = lg0Var.b;
        rr2.l(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = lg0Var.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((lg0) arrayList.get(size)).b) {
                arrayList.add(size + 1, lg0Var);
                return z;
            }
            if (((lg0) arrayList.get(size)).b <= j) {
                z = false;
            }
        }
        arrayList.add(0, lg0Var);
        return z;
    }

    @Override // defpackage.kg0
    public yw1 c(long j) {
        int iF = f(j);
        if (iF == 0) {
            vw1 vw1Var = yw1.o;
            return gy3.r;
        }
        lg0 lg0Var = (lg0) this.a.get(iF - 1);
        long j2 = lg0Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return lg0Var.a;
        }
        vw1 vw1Var2 = yw1.o;
        return gy3.r;
    }

    @Override // defpackage.kg0
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.kg0
    public long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((lg0) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((lg0) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                lg0 lg0Var = (lg0) arrayList.get(i - 1);
                long j3 = lg0Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? lg0Var.b : j3;
            }
        }
        lg0 lg0Var2 = (lg0) te5.w(arrayList);
        long j4 = lg0Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? lg0Var2.b : j4;
    }

    @Override // defpackage.kg0
    public void e(long j) {
        int iF = f(j);
        if (iF == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        long j2 = ((lg0) arrayList.get(iF - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iF--;
        }
        arrayList.subList(0, iF).clear();
    }

    public int f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((lg0) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }
}
