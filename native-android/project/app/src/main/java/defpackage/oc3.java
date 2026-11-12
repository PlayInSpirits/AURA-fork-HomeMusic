package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ArrayList o;

    public /* synthetic */ oc3(int i, ArrayList arrayList) {
        this.n = i;
        this.o = arrayList;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        j15 j15Var = j15.a;
        ArrayList arrayList = this.o;
        switch (i) {
            case 0:
                ig3 ig3Var = (ig3) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    xi2 xi2Var = (xi2) arrayList.get(i2);
                    List list = xi2Var.b;
                    boolean z = xi2Var.i;
                    if (xi2Var.m == Integer.MIN_VALUE) {
                        fz1.a("position() should be called first");
                    }
                    int size2 = list.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        jg3 jg3Var = (jg3) list.get(i3);
                        int[] iArr = xi2Var.k;
                        int i4 = i3 * 2;
                        int i5 = size;
                        long j = (((long) iArr[i4 + 1]) & 4294967295L) | (((long) iArr[i4]) << 32);
                        if (xi2Var.h) {
                            int i6 = z ? (int) (j >> 32) : (xi2Var.m - ((int) (j >> 32))) - (z ? jg3Var.o : jg3Var.n);
                            j = (((long) (z ? (xi2Var.m - ((int) (j & 4294967295L))) - (z ? jg3Var.o : jg3Var.n) : (int) (j & 4294967295L))) & 4294967295L) | (((long) i6) << 32);
                        }
                        long jC = g02.c(j, xi2Var.c);
                        if (z) {
                            k52 k52Var = kg3.a;
                            ig3Var.getClass();
                            ig3.a(ig3Var, jg3Var);
                            jg3Var.N(g02.c(jC, jg3Var.r), 0.0f, k52Var);
                        } else {
                            k52 k52Var2 = kg3.a;
                            if (ig3Var.c() == r62.n || ig3Var.e() == 0) {
                                ig3.a(ig3Var, jg3Var);
                                jg3Var.N(g02.c(jC, jg3Var.r), 0.0f, k52Var2);
                            } else {
                                int iE = (ig3Var.e() - jg3Var.n) - ((int) (jC >> 32));
                                ig3.a(ig3Var, jg3Var);
                                jg3Var.N(g02.c((((long) ((int) (jC & 4294967295L))) & 4294967295L) | (((long) iE) << 32), jg3Var.r), 0.0f, k52Var2);
                            }
                        }
                        i3++;
                        size = i5;
                    }
                }
                break;
            default:
                ig3 ig3Var2 = (ig3) obj;
                int size3 = arrayList.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    ig3.n(ig3Var2, (jg3) arrayList.get(i7));
                }
                break;
        }
        return j15Var;
    }
}
