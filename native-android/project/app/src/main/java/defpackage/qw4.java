package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qw4 extends p80 {
    public final gn2 k;
    public final jr3 l;
    public final long m;
    public kr3 n;
    public int o;

    public qw4(gn2 r3, kx r4, jr3 r5) {
        r3.getClass();
        this.k = r3;
        this.l = r5;
        this.m = -9223372036854775807L;
        this.o = 1;
        Bundle r6 = r3.d.I;
        bn2 r7 = r3.b;
        String r8 = null;
        if (r7 == null) goto L5;
        Uri r9 = r7.a;
    L6:
        if (r9 == null) goto L8;
        String r0 = r9.getScheme();
    L10:
        if (h12.c(r0, "content") == true) goto L23;
        if (r9 == null) goto L14;
        r8 = r9.getScheme();
    L14:
        if (h12.c(r8, "file") == true) goto L27;
        if (r6 != null) goto L18;
        return;
    L18:
        if (r6.containsKey("duration") == false) goto L25;
        int r10 = r6.getInt("duration");
        if (r10 <= 0) goto L26;
        this.m = f35.Q(((long) r10) * 1000);
        return;
    L26:
        return;
    L25:
        return;
    L27:
        return;
    L23:
        return;
    L8:
        r0 = null;
        goto L10
    L5:
        r9 = null;
        goto L6
    }

    @Override // defpackage.bq
    public final no2 b(mt2 r7, n9 r8, long r9) {
        r8.getClass();
        kr3 r3 = this.n;
        if (r3 != null) goto L5;
        kf2.o("Source not ready");
        return null;
    L5:
        return new pw4(this, r3.b(r7, r8, r9), r3, r7, r8);
    }

    @Override // defpackage.bq
    public final gn2 h() {
        return this.k;
    }

    @Override // defpackage.bq
    public final void l(rw4 r2) {
        this.j = r2;
        this.i = f35.p(null);
        kr3 r3 = this.l.f(this.k);
        this.n = r3;
        x(0, r3);
    }

    @Override // defpackage.bq
    public final void n(no2 r2) {
        r2.getClass();
        pw4 r3 = (pw4) r2;
        r3.o.n(r3.n);
        Integer r1 = r3.u;
        if (r1 == null) goto L5;
        r3.y.y(Integer.valueOf(r1.intValue()));
    L5:
        r3.u = null;
    }

    @Override // defpackage.p80, defpackage.bq
    public final void p() {
        super.p();
        this.n = null;
    }

    @Override // defpackage.p80
    public final mt2 t(Object r1, mt2 r2) {
        Integer r3 = (Integer) r1;
        r2.getClass();
        return r2;
    }

    @Override // defpackage.p80
    public final void w(Object r3, bq r4, cu4 r5) {
        Integer r6 = (Integer) r3;
        r5.getClass();
        if (r6 != null) goto L6;
        return;
    L6:
        if (r6.intValue() == 0) goto L8;
        return;
    L8:
        long r0 = this.m;
        if (r0 == (-9223372036854775807L)) goto L11;
        r5 = new sv2(1, r0, r5);
    L11:
        m(r5);
    }
}
