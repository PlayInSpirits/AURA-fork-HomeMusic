package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ay3 extends nq2 implements yx3 {
    public final String f;
    public final pq2 g;
    public String h;
    public String i;
    public boolean j;
    public int l;
    public xx3 m;
    public final /* synthetic */ cy3 o;
    public int k = -1;
    public int n = -1;

    public ay3(cy3 cy3Var, String str, pq2 pq2Var) {
        this.o = cy3Var;
        this.f = str;
        this.g = pq2Var;
    }

    @Override // defpackage.yx3
    public final int a() {
        return this.n;
    }

    @Override // defpackage.yx3
    public final void b(xx3 xx3Var) {
        zx3 zx3Var = new zx3(this);
        this.m = xx3Var;
        int i = xx3Var.e;
        xx3Var.e = i + 1;
        int i2 = xx3Var.d;
        xx3Var.d = i2 + 1;
        Bundle bundleH = b11.h("memberRouteId", this.f);
        bundleH.putParcelable("routeControllerOptions", this.g.a);
        xx3Var.b(11, i2, i, null, bundleH);
        xx3Var.h.put(i2, zx3Var);
        this.n = i;
        if (this.j) {
            xx3Var.a(i);
            int i3 = this.k;
            if (i3 >= 0) {
                xx3Var.c(this.n, i3);
                this.k = -1;
            }
            int i4 = this.l;
            if (i4 != 0) {
                xx3Var.d(this.n, i4);
                this.l = 0;
            }
        }
    }

    @Override // defpackage.yx3
    public final void c() {
        xx3 xx3Var = this.m;
        if (xx3Var != null) {
            int i = this.n;
            int i2 = xx3Var.d;
            xx3Var.d = i2 + 1;
            xx3Var.b(4, i2, i, null, null);
            this.m = null;
            this.n = 0;
        }
    }

    @Override // defpackage.oq2
    public final void d() {
        cy3 cy3Var = this.o;
        cy3Var.x.remove(this);
        c();
        cy3Var.l();
    }

    @Override // defpackage.oq2
    public final void e() {
        this.j = true;
        xx3 xx3Var = this.m;
        if (xx3Var != null) {
            xx3Var.a(this.n);
        }
    }

    @Override // defpackage.oq2
    public final void f(int i) {
        xx3 xx3Var = this.m;
        if (xx3Var != null) {
            xx3Var.c(this.n, i);
        } else {
            this.k = i;
            this.l = 0;
        }
    }

    @Override // defpackage.oq2
    public final void g() {
        h(0);
    }

    @Override // defpackage.oq2
    public final void h(int i) {
        this.j = false;
        xx3 xx3Var = this.m;
        if (xx3Var != null) {
            int i2 = this.n;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = xx3Var.d;
            xx3Var.d = i3 + 1;
            xx3Var.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.oq2
    public final void i(int i) {
        xx3 xx3Var = this.m;
        if (xx3Var != null) {
            xx3Var.d(this.n, i);
        } else {
            this.l += i;
        }
    }

    @Override // defpackage.nq2
    public final String j() {
        return this.h;
    }

    @Override // defpackage.nq2
    public final String k() {
        return this.i;
    }

    @Override // defpackage.nq2
    public final void m(String str) {
        xx3 xx3Var = this.m;
        if (xx3Var != null) {
            int i = this.n;
            Bundle bundleH = b11.h("memberRouteId", str);
            int i2 = xx3Var.d;
            xx3Var.d = i2 + 1;
            xx3Var.b(12, i2, i, null, bundleH);
        }
    }

    @Override // defpackage.nq2
    public final void n(String str) {
        xx3 xx3Var = this.m;
        if (xx3Var != null) {
            int i = this.n;
            Bundle bundleH = b11.h("memberRouteId", str);
            int i2 = xx3Var.d;
            xx3Var.d = i2 + 1;
            xx3Var.b(13, i2, i, null, bundleH);
        }
    }

    @Override // defpackage.nq2
    public final void o(ArrayList arrayList) {
        xx3 xx3Var = this.m;
        if (xx3Var != null) {
            int i = this.n;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(arrayList));
            int i2 = xx3Var.d;
            xx3Var.d = i2 + 1;
            xx3Var.b(14, i2, i, null, bundle);
        }
    }
}
