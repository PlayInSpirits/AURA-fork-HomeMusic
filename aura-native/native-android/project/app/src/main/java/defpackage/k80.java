package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k80 {
    public final rg1 a;
    public w00 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final o02 d = new o02();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public k80(rg1 rg1Var, w00 w00Var) {
        this.a = rg1Var;
        this.b = w00Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            ya3 ya3Var = this.b.n;
            ya3Var.x0(ua3.f);
            ya3Var.f[ya3Var.g - ya3Var.d[ya3Var.e - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        w00 w00Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        w00Var.getClass();
        if (size != 0) {
            ya3 ya3Var2 = w00Var.n;
            ya3Var2.x0(v93.f);
            rr2.R(ya3Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                ya3 ya3Var = this.b.n;
                ya3Var.x0(ka3.f);
                int i3 = ya3Var.g - ya3Var.d[ya3Var.e - 1].b;
                int[] iArr = ya3Var.f;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                ya3 ya3Var2 = this.b.n;
                ya3Var2.x0(ga3.f);
                int i6 = ya3Var2.g - ya3Var2.d[ya3Var2.e - 1].b;
                int[] iArr2 = ya3Var2.f;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        hg4 hg4Var = this.a.G;
        int i = z ? hg4Var.i : hg4Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            l80.a("Tried to seek backward");
        }
        if (i2 > 0) {
            ya3 ya3Var = this.b.n;
            ya3Var.x0(o93.f);
            ya3Var.f[ya3Var.g - ya3Var.d[ya3Var.e - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                l80.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
