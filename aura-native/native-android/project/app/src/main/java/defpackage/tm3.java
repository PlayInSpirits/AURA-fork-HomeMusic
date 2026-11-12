package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tm3 extends cu4 {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final pd4 f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final cu4[] k;
    public final Object[] l;
    public final HashMap m;

    public tm3(cu4[] cu4VarArr, Object[] objArr, pd4 pd4Var) {
        this.f = pd4Var;
        this.e = pd4Var.b.length;
        int length = cu4VarArr.length;
        this.k = cu4VarArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = cu4VarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            cu4 cu4Var = cu4VarArr[i];
            this.k[i2] = cu4Var;
            this.j[i2] = iO;
            this.i[i2] = iH;
            iO += cu4Var.o();
            iH += this.k[i2].h();
            this.m.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.g = iO;
        this.h = iH;
    }

    @Override // defpackage.cu4
    public final int a(boolean z) {
        if (this.e != 0) {
            int iQ = 0;
            if (z) {
                int[] iArr = this.f.b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                cu4[] cu4VarArr = this.k;
                if (!cu4VarArr[iQ].p()) {
                    return cu4VarArr[iQ].a(z) + this.j[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // defpackage.cu4
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.m.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.k[iIntValue].b(obj3)) != -1) {
                return this.i[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // defpackage.cu4
    public final int c(boolean z) {
        int iR;
        int i = this.e;
        if (i != 0) {
            if (z) {
                int[] iArr = this.f.b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                cu4[] cu4VarArr = this.k;
                if (!cu4VarArr[iR].p()) {
                    return cu4VarArr[iR].c(z) + this.j[iR];
                }
                iR = r(iR, z);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // defpackage.cu4
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int iE = f35.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        cu4[] cu4VarArr = this.k;
        int iE2 = cu4VarArr[iE].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE2 != -1) {
            return i3 + iE2;
        }
        int iQ = q(iE, z);
        while (iQ != -1 && cu4VarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return cu4VarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.cu4
    public final zt4 f(int i, zt4 zt4Var, boolean z) {
        int[] iArr = this.i;
        int iE = f35.e(iArr, i + 1, false, false);
        int i2 = this.j[iE];
        this.k[iE].f(i - iArr[iE], zt4Var, z);
        zt4Var.c += i2;
        if (z) {
            Object obj = this.l[iE];
            Object obj2 = zt4Var.b;
            obj2.getClass();
            zt4Var.b = Pair.create(obj, obj2);
        }
        return zt4Var;
    }

    @Override // defpackage.cu4
    public final zt4 g(Object obj, zt4 zt4Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.j[iIntValue];
        this.k[iIntValue].g(obj3, zt4Var);
        zt4Var.c += i;
        zt4Var.b = obj;
        return zt4Var;
    }

    @Override // defpackage.cu4
    public final int h() {
        return this.h;
    }

    @Override // defpackage.cu4
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int iE = f35.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        cu4[] cu4VarArr = this.k;
        int iK = cu4VarArr[iE].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iE, z);
        while (iR != -1 && cu4VarArr[iR].p()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return cu4VarArr[iR].c(z) + iArr[iR];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.cu4
    public final Object l(int i) {
        int[] iArr = this.i;
        int iE = f35.e(iArr, i + 1, false, false);
        return Pair.create(this.l[iE], this.k[iE].l(i - iArr[iE]));
    }

    @Override // defpackage.cu4
    public final bu4 m(int i, bu4 bu4Var, long j) {
        int[] iArr = this.j;
        int iE = f35.e(iArr, i + 1, false, false);
        int i2 = iArr[iE];
        int i3 = this.i[iE];
        this.k[iE].m(i - i2, bu4Var, j);
        Object objCreate = this.l[iE];
        Object obj = bu4.p;
        Object obj2 = bu4Var.a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        bu4Var.a = objCreate;
        bu4Var.m += i3;
        bu4Var.n += i3;
        return bu4Var;
    }

    @Override // defpackage.cu4
    public final int o() {
        return this.g;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.e - 1) {
                return i + 1;
            }
            return -1;
        }
        pd4 pd4Var = this.f;
        int i2 = pd4Var.c[i] + 1;
        int[] iArr = pd4Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        pd4 pd4Var = this.f;
        int i2 = pd4Var.c[i] - 1;
        if (i2 >= 0) {
            return pd4Var.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tm3(ArrayList arrayList, pd4 pd4Var) {
        cu4[] cu4VarArr = new cu4[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            cu4VarArr[i2] = ((tt2) obj).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            objArr[i] = ((tt2) obj2).a();
            i++;
        }
        this(cu4VarArr, objArr, pd4Var);
    }
}
