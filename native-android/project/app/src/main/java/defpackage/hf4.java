package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hf4 extends bq {
    public final ii0 h;
    public final bi0 i;
    public final tb1 j;
    public final long k;
    public final i80 l;
    public final boolean m;
    public final bf4 n;
    public final gn2 o;
    public rw4 p;

    public hf4(fn2 r29, bi0 r30, i80 r31) {
        this.i = r30;
        this.k = -9223372036854775807L;
        this.l = r31;
        boolean r2 = true;
        this.m = true;
        um2 r3 = new um2();
        xm2 r4 = new xm2();
        List r13 = Collections.EMPTY_LIST;
        gy3 r5 = gy3.r;
        zm2 r6 = new zm2();
        cn2 r20 = cn2.d;
        Uri r9 = Uri.EMPTY;
        String r18 = r29.a.toString();
        r18.getClass();
        yw1 r15 = yw1.k(yw1.o(r29));
        if (((Uri) r4.e) != null) goto L5;
    L8:
        rr2.w(r2);
        String r7 = null;
        if (r9 != null) goto L11;
        bn2 r17 = null;
    L16:
        gn2 r14 = new gn2(r18, new wm2(r3), r17, new an2(r6), do2.K, r20);
        this.o = r14;
        sb1 r8 = new sb1();
        String r10 = r29.b;
        if (r10 != null) goto L20;
        r10 = "text/x-unknown";
    L20:
        r8.m = lw2.m(r10);
        r8.d = r29.c;
        r8.e = r29.d;
        r8.f = r29.e;
        r8.b = r29.f;
        String r11 = r29.g;
        if (r11 == null) goto L23;
        r7 = r11;
    L23:
        r8.a = r7;
        this.j = new tb1(r8);
        Map r21 = Collections.EMPTY_MAP;
        Uri r1 = r29.a;
        rr2.s(r1, "The uri must be set.");
        this.h = new ii0(r1, 0, 1, null, r21, 0, -1, null, 1);
        this.n = new bf4(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0, 0, true, false, false, null, r14, null);
        return;
    L11:
        if (((UUID) r4.d) == null) goto L13;
        ym2 r12 = new ym2(r4);
    L14:
        r17 = new bn2(r9, null, r12, null, r13, null, r15, -9223372036854775807L);
        goto L16
    L13:
        r12 = null;
        goto L14
    L5:
        if (((UUID) r4.d) != null) goto L8;
        r2 = false;
        goto L8
    }

    @Override // defpackage.bq
    public final no2 b(mt2 r12, n9 r13, long r14) {
        rw4 r3 = this.p;
        ue1 r8 = new ue1((CopyOnWriteArrayList) this.c.q, 0, r12, 8);
        boolean r9 = this.m;
        return new gf4(this.h, this.i, r3, this.j, this.k, this.l, r8, r9, null);
    }

    @Override // defpackage.bq
    public final gn2 h() {
        return this.o;
    }

    @Override // defpackage.bq
    public final void j() {
    }

    @Override // defpackage.bq
    public final void l(rw4 r1) {
        this.p = r1;
        m(this.n);
    }

    @Override // defpackage.bq
    public final void n(no2 r1) {
        ((gf4) r1).v.p(null);
    }

    @Override // defpackage.bq
    public final void p() {
    }
}
