package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v34 {
    public ba5 a;
    public ArrayList b;

    public static long a(yo0 yo0Var, long j) {
        ba5 ba5Var = yo0Var.d;
        ArrayList arrayList = yo0Var.k;
        if (ba5Var instanceof yl1) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            uo0 uo0Var = (uo0) arrayList.get(i);
            if (uo0Var instanceof yo0) {
                yo0 yo0Var2 = (yo0) uo0Var;
                if (yo0Var2.d != ba5Var) {
                    jMin = Math.min(jMin, a(yo0Var2, ((long) yo0Var2.f) + j));
                }
            }
        }
        yo0 yo0Var3 = ba5Var.i;
        yo0 yo0Var4 = ba5Var.h;
        if (yo0Var != yo0Var3) {
            return jMin;
        }
        long j2 = j - ba5Var.j();
        return Math.min(Math.min(jMin, a(yo0Var4, j2)), j2 - ((long) yo0Var4.f));
    }

    public static long b(yo0 yo0Var, long j) {
        ba5 ba5Var = yo0Var.d;
        ArrayList arrayList = yo0Var.k;
        if (ba5Var instanceof yl1) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            uo0 uo0Var = (uo0) arrayList.get(i);
            if (uo0Var instanceof yo0) {
                yo0 yo0Var2 = (yo0) uo0Var;
                if (yo0Var2.d != ba5Var) {
                    jMax = Math.max(jMax, b(yo0Var2, ((long) yo0Var2.f) + j));
                }
            }
        }
        yo0 yo0Var3 = ba5Var.h;
        yo0 yo0Var4 = ba5Var.i;
        if (yo0Var != yo0Var3) {
            return jMax;
        }
        long j2 = ba5Var.j() + j;
        return Math.max(Math.max(jMax, b(yo0Var4, j2)), j2 - ((long) yo0Var4.f));
    }
}
