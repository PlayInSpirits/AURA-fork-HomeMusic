package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wx {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public yj0 e;

    public wx(int i, String str, yj0 yj0Var) {
        this.a = i;
        this.b = str;
        this.e = yj0Var;
    }

    public final long a(long j, long j2) {
        rr2.l(j >= 0);
        rr2.l(j2 >= 0);
        te4 te4VarB = b(j, j2);
        long j3 = te4VarB.p;
        if (!te4VarB.q) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = te4VarB.o + j3;
        if (jMax < j5) {
            for (te4 te4Var : this.c.tailSet(te4VarB, false)) {
                long j6 = te4Var.o;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + te4Var.p);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final te4 b(long j, long j2) {
        long jMin = j2;
        te4 te4Var = new te4(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        te4 te4Var2 = (te4) treeSet.floor(te4Var);
        if (te4Var2 != null && te4Var2.o + te4Var2.p > j) {
            return te4Var2;
        }
        te4 te4Var3 = (te4) treeSet.ceiling(te4Var);
        if (te4Var3 != null) {
            long j3 = te4Var3.o - j;
            jMin = jMin == -1 ? j3 : Math.min(j3, jMin);
        }
        return new te4(this.b, j, jMin, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            vx vxVar = (vx) arrayList.get(i);
            long j3 = vxVar.a;
            long j4 = vxVar.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wx.class == obj.getClass()) {
            wx wxVar = (wx) obj;
            if (this.a == wxVar.a && this.b.equals(wxVar.b) && this.c.equals(wxVar.c) && this.e.equals(wxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + f34.e(this.b, this.a * 31, 31);
    }
}
