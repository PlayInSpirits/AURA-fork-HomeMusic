package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class le4 extends cu4 {
    public final yw1 e;
    public final int[] f;
    public final int[] g;
    public final HashMap h;

    public le4(List list) {
        int size = list.size();
        this.e = yw1.k(list);
        this.f = new int[size];
        int i = 0;
        int i2 = 0;
        while (true) {
            int size2 = 1;
            if (i >= size) {
                break;
            }
            he4 he4Var = (he4) list.get(i);
            this.f[i] = i2;
            if (!he4Var.p.isEmpty()) {
                size2 = he4Var.p.size();
            }
            i2 += size2;
            i++;
        }
        this.g = new int[i2];
        this.h = new HashMap();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            he4 he4Var2 = (he4) list.get(i4);
            int i5 = 0;
            while (true) {
                if (i5 < (he4Var2.p.isEmpty() ? 1 : he4Var2.p.size())) {
                    this.h.put(he4.a(he4Var2, i5), Integer.valueOf(i3));
                    this.g[i3] = i4;
                    i3++;
                    i5++;
                }
            }
        }
    }

    @Override // defpackage.cu4
    public final int b(Object obj) {
        Integer num = (Integer) this.h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.cu4
    public final zt4 f(int i, zt4 zt4Var, boolean z) {
        int i2 = this.g[i];
        int i3 = i - this.f[i2];
        he4 he4Var = (he4) this.e.get(i2);
        yw1 yw1Var = he4Var.p;
        if (yw1Var.isEmpty()) {
            Object obj = he4Var.a;
            long j = he4Var.n;
            zt4Var.i(obj, obj, i2, he4Var.m + j, -j, z5.f, he4Var.o);
            return zt4Var;
        }
        je4 je4Var = (je4) yw1Var.get(i3);
        Object obj2 = je4Var.a;
        zt4Var.i(obj2, Pair.create(he4Var.a, obj2), i2, je4Var.b, he4Var.q[i3], je4Var.c, je4Var.d);
        return zt4Var;
    }

    @Override // defpackage.cu4
    public final zt4 g(Object obj, zt4 zt4Var) {
        Integer num = (Integer) this.h.get(obj);
        num.getClass();
        f(num.intValue(), zt4Var, true);
        return zt4Var;
    }

    @Override // defpackage.cu4
    public final int h() {
        return this.g.length;
    }

    @Override // defpackage.cu4
    public final Object l(int i) {
        int i2 = this.g[i];
        return he4.a((he4) this.e.get(i2), i - this.f[i2]);
    }

    @Override // defpackage.cu4
    public final bu4 m(int i, bu4 bu4Var, long j) {
        he4 he4Var = (he4) this.e.get(i);
        int i2 = this.f[i];
        yw1 yw1Var = he4Var.p;
        bu4Var.b(he4Var.a, he4Var.c, he4Var.e, he4Var.g, he4Var.h, he4Var.i, he4Var.j, he4Var.k, he4Var.f, he4Var.l, he4Var.m, i2, (i2 + (yw1Var.isEmpty() ? 1 : yw1Var.size())) - 1, he4Var.n);
        bu4Var.j = he4Var.o;
        return bu4Var;
    }

    @Override // defpackage.cu4
    public final int o() {
        return this.e.size();
    }
}
