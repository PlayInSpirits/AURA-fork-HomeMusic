package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 implements er2 {
    public final ju1 n;
    public final int o;

    public ft2(ju1 r1, int r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.er2
    public final void A(int r6, lk3 r7, mi3 r8, boolean r9, boolean r10) {
        boolean r0 = false;
        int r2 = this.o;
        if (r2 == 0) goto L5;
        boolean r3 = true;
    L6:
        rr2.w(r3);
        if (r9 == false) goto L9;
    L12:
        boolean r4 = true;
    L13:
        if (r10 == false) goto L15;
    L16:
        r0 = true;
    L17:
        ju1 r5 = this.n;
        if (r2 < 2) goto L25;
        lk3 r11 = r7.q(r8, r9, r10);
        if ((r5 instanceof mm2) == false) goto L22;
        Bundle r12 = new Bundle();
        r12.putBinder(lk3.o0, new kk3(r11));
    L23:
        Bundle r13 = new Bundle();
        r13.putBoolean(jk3.d, r4);
        r13.putBoolean(jk3.e, r0);
        r5.I(r6, r12, r13);
        return;
    L22:
        r12 = r11.t(r2);
        goto L23
    L25:
        r5.u0(r6, r7.q(r8, r9, true).t(r2), r4);
        return;
    L15:
        if (r8.a(30) == true) goto L17;
    L9:
        if (r8.a(17) == false) goto L12;
        r4 = false;
        goto L13
    L5:
        r3 = false;
        goto L6
    }

    @Override // defpackage.er2
    public final void B(int r1, za4 r2, boolean r3, boolean r4, int r5) {
        Bundle r6 = r2.a(r3, r4).c(r5);
        this.n.C(r1, r6);
    }

    @Override // defpackage.er2
    public final void c() {
        au0.k(this.n);
    }

    @Override // defpackage.er2
    public final void e(int r1) {
        this.n.e(r1);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (r3.getClass() == ft2.class) goto L10;
        return false;
    L10:
        return Objects.equals(this.n.asBinder(), ((ft2) r3).n.asBinder());
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.n.asBinder()});
    }

    @Override // defpackage.er2
    public final void i(int r1, int r2, int r3) {
        this.n.i(r1, r2, r3);
    }

    @Override // defpackage.er2
    public final void k(List r4, int r5) {
        int r0 = this.o;
        int r2 = 0;
        ju1 r3 = this.n;
        if (r0 < 7) goto L10;
        uw1 r1 = yw1.j();
    L6:
        if (r2 >= r4.size()) goto L8;
        r1.c(((j60) r4.get(r2)).o());
        r2 = r2 + 1;
        goto L6
    L8:
        r3.n(r1.f(), r5);
        return;
    L10:
        gy3 r6 = j60.j(r4, true, true);
        uw1 r7 = yw1.j();
    L12:
        if (r2 >= r6.q) goto L14;
        r7.c(((j60) r6.get(r2)).o());
        r2 = r2 + 1;
        goto L12
    L14:
        r3.s0(r7.f(), r5);
    }

    @Override // defpackage.er2
    public final void l(int r2, va4 r3) {
        Bundle r0 = Bundle.EMPTY;
        this.n.E(r2, r3.b(), r0);
    }

    @Override // defpackage.er2
    public final void r(int r8, m92 r9) {
        String r0 = m92.j;
        Object r1 = r9.c;
        int r2 = r9.d;
        Bundle r3 = new Bundle();
        r3.putInt(m92.g, r9.a);
        r3.putLong(m92.h, r9.b);
        jn2 r4 = r9.e;
        if (r4 == null) goto L5;
        r3.putBundle(m92.i, r4.b());
    L5:
        xa4 r10 = r9.f;
        if (r10 == null) goto L8;
        r3.putBundle(m92.l, r10.b());
    L8:
        r3.putInt(m92.k, r2);
        if (r1 != null) goto L12;
    L26:
        this.n.O(r8, r3);
        return;
    L12:
        if (r2 != 1) goto L14;
    L28:
        tb4.a();
        return;
    L14:
        if (r2 != 2) goto L16;
        r3.putBundle(r0, ((gn2) r1).c(false));
        goto L26
    L16:
        if (r2 != 3) goto L18;
        yw1 r5 = (yw1) r1;
        uw1 r6 = yw1.j();
        int r7 = 0;
    L22:
        if (r7 >= r5.size()) goto L24;
        r6.c(((gn2) r5.get(r7)).c(false));
        r7 = r7 + 1;
        goto L22
    L24:
        r3.putBinder(r0, new iw(r6.f()));
        goto L26
    L18:
        if (r2 == 4) goto L28;
        goto L28
    }

    @Override // defpackage.er2
    public final void t(int r1, mi3 r2) {
        this.n.z(r1, r2.c());
    }

    @Override // defpackage.er2
    public final void v(int r1, ab4 r2) {
        this.n.I0(r1, r2.b());
    }

    @Override // defpackage.er2
    public final void z(int r2, String r3, jn2 r4) {
        if (r4 != null) goto L4;
        Bundle r5 = null;
    L5:
        this.n.w0(r2, r3, Integer.MAX_VALUE, r5);
        return;
    L4:
        r5 = r4.b();
        goto L5
    }
}
