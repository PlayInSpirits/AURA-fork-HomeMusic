package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fa3 extends e22 {
    public static final fa3 f = new fa3(1, 0, 2);

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        int[] iArr;
        mg1 mg1Var;
        int iC;
        int iC2 = x20Var.c(0);
        if (lg4Var.n != 0) {
            l80.a("Cannot move a group while inserting");
        }
        if (iC2 < 0) {
            l80.a("Parameter offset is out of bounds");
        }
        if (iC2 == 0) {
            return;
        }
        int i = lg4Var.t;
        int i2 = lg4Var.v;
        int i3 = lg4Var.u;
        int i4 = i;
        while (true) {
            iArr = lg4Var.b;
            if (iC2 <= 0) {
                break;
            }
            i4 += iArr[(lg4Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                l80.a("Parameter offset is out of bounds");
            }
            iC2--;
        }
        int i5 = iArr[(lg4Var.r(i4) * 5) + 3];
        int iG = lg4Var.g(lg4Var.b, lg4Var.r(lg4Var.t));
        int iG2 = lg4Var.g(lg4Var.b, lg4Var.r(i4));
        int i6 = i4 + i5;
        int iG3 = lg4Var.g(lg4Var.b, lg4Var.r(i6));
        int i7 = iG3 - iG2;
        lg4Var.x(i7, Math.max(lg4Var.t - 1, 0));
        lg4Var.w(i5);
        int[] iArr2 = lg4Var.b;
        int iR = lg4Var.r(i6) * 5;
        ti.Y(lg4Var.r(i) * 5, iR, (i5 * 5) + iR, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = lg4Var.c;
            int iH = lg4Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, lg4Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = lg4Var.k;
        int i11 = lg4Var.l;
        int length = lg4Var.c.length;
        int i12 = lg4Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = lg4Var.r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iR2 * 5) + 4] = lg4.i(lg4.i(lg4Var.g(iArr2, iR2) - i15, i12 < iR2 ? 0 : i10, i11, length), lg4Var.k, lg4Var.l, lg4Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = lg4Var.p();
        int iA = kg4.a(lg4Var.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < lg4Var.d.size() && (iC = lg4Var.c((mg1Var = (mg1) lg4Var.d.get(iA)))) >= i6 && iC < i16) {
                arrayList.add(mg1Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            mg1 mg1Var2 = (mg1) arrayList.get(i18);
            int iC3 = lg4Var.c(mg1Var2) + i17;
            if (iC3 >= lg4Var.g) {
                mg1Var2.a = -(iP - iC3);
            } else {
                mg1Var2.a = iC3;
            }
            lg4Var.d.add(kg4.a(lg4Var.d, iC3, iP), mg1Var2);
        }
        if (lg4Var.I(i6, i5)) {
            l80.a("Unexpectedly removed anchors");
        }
        lg4Var.m(i2, lg4Var.u, i);
        if (i7 > 0) {
            lg4Var.J(i8, i7, i6 - 1);
        }
    }
}
