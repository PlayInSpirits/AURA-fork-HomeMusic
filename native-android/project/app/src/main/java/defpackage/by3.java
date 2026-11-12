package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class by3 extends oq2 implements yx3 {
    public final String a;
    public final String b;
    public final pq2 c;
    public boolean d;
    public int e = -1;
    public int f;
    public xx3 g;
    public int h;
    public final /* synthetic */ cy3 i;

    public by3(cy3 cy3Var, String str, String str2, pq2 pq2Var) {
        this.i = cy3Var;
        this.a = str;
        this.b = str2;
        this.c = pq2Var;
    }

    @Override // defpackage.yx3
    public final int a() {
        return this.h;
    }

    @Override // defpackage.yx3
    public final void b(xx3 xx3Var) {
        this.g = xx3Var;
        int i = xx3Var.e;
        xx3Var.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        bundle.putParcelable("routeControllerOptions", this.c.a);
        int i2 = xx3Var.d;
        xx3Var.d = i2 + 1;
        xx3Var.b(3, i2, i, null, bundle);
        this.h = i;
        if (this.d) {
            xx3Var.a(i);
            int i3 = this.e;
            if (i3 >= 0) {
                xx3Var.c(this.h, i3);
                this.e = -1;
            }
            int i4 = this.f;
            if (i4 != 0) {
                xx3Var.d(this.h, i4);
                this.f = 0;
            }
        }
    }

    @Override // defpackage.yx3
    public final void c() {
        xx3 xx3Var = this.g;
        if (xx3Var != null) {
            int i = this.h;
            int i2 = xx3Var.d;
            xx3Var.d = i2 + 1;
            xx3Var.b(4, i2, i, null, null);
            this.g = null;
            this.h = 0;
        }
    }

    @Override // defpackage.oq2
    public final void d() {
        cy3 cy3Var = this.i;
        cy3Var.x.remove(this);
        c();
        cy3Var.l();
    }

    @Override // defpackage.oq2
    public final void e() {
        this.d = true;
        xx3 xx3Var = this.g;
        if (xx3Var != null) {
            xx3Var.a(this.h);
        }
    }

    @Override // defpackage.oq2
    public final void f(int i) {
        xx3 xx3Var = this.g;
        if (xx3Var != null) {
            xx3Var.c(this.h, i);
        } else {
            this.e = i;
            this.f = 0;
        }
    }

    @Override // defpackage.oq2
    public final void g() {
        h(0);
    }

    @Override // defpackage.oq2
    public final void h(int i) {
        this.d = false;
        xx3 xx3Var = this.g;
        if (xx3Var != null) {
            int i2 = this.h;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i);
            int i3 = xx3Var.d;
            xx3Var.d = i3 + 1;
            xx3Var.b(6, i3, i2, null, bundle);
        }
    }

    @Override // defpackage.oq2
    public final void i(int i) {
        xx3 xx3Var = this.g;
        if (xx3Var != null) {
            xx3Var.d(this.h, i);
        } else {
            this.f += i;
        }
    }
}
