package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class by3 extends oq2 implements yx3 {
    public final String a;
    public final String b;
    public final pq2 c;
    public boolean d;
    public int e;
    public int f;
    public xx3 g;
    public int h;
    public final /* synthetic */ cy3 i;

    public by3(cy3 r1, String r2, String r3, pq2 r4) {
        this.i = r1;
        this.e = -1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
    }

    @Override // defpackage.yx3
    public final int a() {
        return this.h;
    }

    @Override // defpackage.yx3
    public final void b(xx3 r7) {
        this.g = r7;
        int r3 = r7.e;
        r7.e = r3 + 1;
        Bundle r5 = new Bundle();
        r5.putString("routeId", this.a);
        r5.putString("routeGroupId", this.b);
        r5.putParcelable("routeControllerOptions", this.c.a);
        int r2 = r7.d;
        r7.d = r2 + 1;
        r7.b(3, r2, r3, null, r5);
        this.h = r3;
        if (this.d == false) goto L11;
        r7.a(r3);
        int r8 = this.e;
        if (r8 < 0) goto L7;
        r7.c(this.h, r8);
        this.e = -1;
    L7:
        int r9 = this.f;
        if (r9 == 0) goto L12;
        r7.d(this.h, r9);
        this.f = 0;
        return;
    L12:
        return;
    }

    @Override // defpackage.yx3
    public final void c() {
        xx3 r0 = this.g;
        if (r0 == null) goto L6;
        int r3 = this.h;
        int r2 = r0.d;
        r0.d = r2 + 1;
        r0.b(4, r2, r3, null, null);
        this.g = null;
        this.h = 0;
        return;
    }

    @Override // defpackage.oq2
    public final void d() {
        cy3 r0 = this.i;
        r0.x.remove(this);
        c();
        r0.l();
    }

    @Override // defpackage.oq2
    public final void e() {
        this.d = true;
        xx3 r0 = this.g;
        if (r0 == null) goto L6;
        r0.a(this.h);
        return;
    }

    @Override // defpackage.oq2
    public final void f(int r2) {
        xx3 r0 = this.g;
        if (r0 == null) goto L6;
        r0.c(this.h, r2);
        return;
    L6:
        this.e = r2;
        this.f = 0;
    }

    @Override // defpackage.oq2
    public final void g() {
        h(0);
    }

    @Override // defpackage.oq2
    public final void h(int r8) {
        this.d = false;
        xx3 r1 = this.g;
        if (r1 == null) goto L6;
        int r4 = this.h;
        Bundle r6 = new Bundle();
        r6.putInt("unselectReason", r8);
        int r3 = r1.d;
        r1.d = r3 + 1;
        r1.b(6, r3, r4, null, r6);
        return;
    }

    @Override // defpackage.oq2
    public final void i(int r2) {
        xx3 r0 = this.g;
        if (r0 == null) goto L6;
        r0.d(this.h, r2);
        return;
    L6:
        this.f += r2;
    }
}
