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
    public int k;
    public int l;
    public xx3 m;
    public int n;
    public final /* synthetic */ cy3 o;

    public ay3(cy3 r1, String r2, pq2 r3) {
        this.o = r1;
        this.k = -1;
        this.n = -1;
        this.f = r2;
        this.g = r3;
    }

    @Override // defpackage.yx3
    public final int a() {
        return this.n;
    }

    @Override // defpackage.yx3
    public final void b(xx3 r8) {
        zx3 r0 = new zx3(this);
        this.m = r8;
        int r4 = r8.e;
        r8.e = r4 + 1;
        int r3 = r8.d;
        r8.d = r3 + 1;
        Bundle r6 = b11.h("memberRouteId", this.f);
        r6.putParcelable("routeControllerOptions", this.g.a);
        r8.b(11, r3, r4, null, r6);
        r8.h.put(r3, r0);
        this.n = r4;
        if (this.j == false) goto L11;
        r8.a(r4);
        int r9 = this.k;
        if (r9 < 0) goto L7;
        r8.c(this.n, r9);
        this.k = -1;
    L7:
        int r10 = this.l;
        if (r10 == 0) goto L12;
        r8.d(this.n, r10);
        this.l = 0;
        return;
    L12:
        return;
    }

    @Override // defpackage.yx3
    public final void c() {
        xx3 r0 = this.m;
        if (r0 == null) goto L6;
        int r3 = this.n;
        int r2 = r0.d;
        r0.d = r2 + 1;
        r0.b(4, r2, r3, null, null);
        this.m = null;
        this.n = 0;
        return;
    }

    @Override // defpackage.oq2
    public final void d() {
        cy3 r0 = this.o;
        r0.x.remove(this);
        c();
        r0.l();
    }

    @Override // defpackage.oq2
    public final void e() {
        this.j = true;
        xx3 r0 = this.m;
        if (r0 == null) goto L6;
        r0.a(this.n);
        return;
    }

    @Override // defpackage.oq2
    public final void f(int r2) {
        xx3 r0 = this.m;
        if (r0 == null) goto L6;
        r0.c(this.n, r2);
        return;
    L6:
        this.k = r2;
        this.l = 0;
    }

    @Override // defpackage.oq2
    public final void g() {
        h(0);
    }

    @Override // defpackage.oq2
    public final void h(int r8) {
        this.j = false;
        xx3 r1 = this.m;
        if (r1 == null) goto L6;
        int r4 = this.n;
        Bundle r6 = new Bundle();
        r6.putInt("unselectReason", r8);
        int r3 = r1.d;
        r1.d = r3 + 1;
        r1.b(6, r3, r4, null, r6);
        return;
    }

    @Override // defpackage.oq2
    public final void i(int r2) {
        xx3 r0 = this.m;
        if (r0 == null) goto L6;
        r0.d(this.n, r2);
        return;
    L6:
        this.l += r2;
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
    public final void m(String r7) {
        xx3 r0 = this.m;
        if (r0 == null) goto L6;
        int r3 = this.n;
        Bundle r5 = b11.h("memberRouteId", r7);
        int r2 = r0.d;
        r0.d = r2 + 1;
        r0.b(12, r2, r3, null, r5);
        return;
    }

    @Override // defpackage.nq2
    public final void n(String r7) {
        xx3 r0 = this.m;
        if (r0 == null) goto L6;
        int r3 = this.n;
        Bundle r5 = b11.h("memberRouteId", r7);
        int r2 = r0.d;
        r0.d = r2 + 1;
        r0.b(13, r2, r3, null, r5);
        return;
    }

    @Override // defpackage.nq2
    public final void o(ArrayList r7) {
        xx3 r0 = this.m;
        if (r0 == null) goto L6;
        int r3 = this.n;
        Bundle r5 = new Bundle();
        r5.putStringArrayList("memberRouteIds", new ArrayList(r7));
        int r2 = r0.d;
        r0.d = r2 + 1;
        r0.b(14, r2, r3, null, r5);
        return;
    }
}
