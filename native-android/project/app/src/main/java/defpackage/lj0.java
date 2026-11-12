package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj0 implements qc2, xl2, gt2, it2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;

    public /* synthetic */ lj0(long r1, Object r3, int r4) {
        this.p = r3;
        this.n = r4;
        this.o = r1;
    }

    @Override // defpackage.wc0
    public void accept(Object r18) {
        ao4 r1 = (ao4) this.p;
        lg0 r2 = (lg0) r18;
        r1.h.getClass();
        byte[] r3 = i80.y(r2.a, r2.c);
        be3 r4 = r1.c;
        r4.getClass();
        r4.L(r3.length, r3);
        r1.a.e(r3.length, r4);
        long r5 = r2.b;
        tb1 r6 = r1.h;
        long r7 = this.o;
        if (r5 == (-9223372036854775807L)) goto L5;
        long r12 = r6.s;
        if (r12 != Long.MAX_VALUE) goto L13;
        r7 = r7 + r5;
    L14:
        r1.a.a(r7, this.n | 1, r3.length, 0, null);
        return;
    L13:
        r7 = r5 + r12;
        goto L14
    L5:
        if (r6.s != Long.MAX_VALUE) goto L7;
        boolean r8 = true;
    L8:
        rr2.w(r8);
        goto L14
    L7:
        r8 = false;
        goto L8
    }

    @Override // defpackage.xl2
    public void d(pu1 r8, int r9) {
        bm2 r0 = (bm2) this.p;
        long r5 = this.o;
        r8.S(r0.c, r9, this.n, r5);
    }

    @Override // defpackage.gt2
    public void e(al3 r4, fr2 r5) {
        kt2 r0 = (kt2) this.p;
        long r1 = this.o;
        r4.n(r0.L0(r5, r4, this.n), r1);
    }

    @Override // defpackage.it2
    public Object h(tn2 r7, fr2 r8, int r9) {
        List r2 = (List) this.p;
        int r10 = this.n;
        if (r10 != (-1)) goto L5;
        int r3 = r7.s.o0();
    L6:
        if (r10 != (-1)) goto L9;
        long r0 = r7.s.M0();
    L11:
        return r7.x(r8, r2, r3, r0);
    L9:
        r0 = this.o;
        goto L11
    L5:
        r3 = r10;
        goto L6
    }

    @Override // defpackage.qc2
    public void invoke(Object r11) {
        q9 r0 = (q9) this.p;
        ho2 r12 = (ho2) r11;
        HashMap r1 = r12.h;
        HashMap r2 = r12.i;
        mt2 r3 = r0.d;
        if (r3 == null) goto L14;
        String r13 = r12.c.c(r0.b, r3);
        Long r4 = (Long) r2.get(r13);
        Long r5 = (Long) r1.get(r13);
        long r6 = 0;
        if (r4 != null) goto L7;
        long r7 = 0;
    L8:
        r2.put(r13, Long.valueOf(r7 + this.o));
        if (r5 == null) goto L12;
        r6 = r5.longValue();
    L12:
        r1.put(r13, Long.valueOf(r6 + ((long) this.n)));
        return;
    L7:
        r7 = r4.longValue();
        goto L8
    }

    public /* synthetic */ lj0(q9 r1, int r2, long r3, long r5) {
        this.p = r1;
        this.n = r2;
        this.o = r3;
    }

    public /* synthetic */ lj0(ao4 r1, long r2, int r4) {
        this.p = r1;
        this.o = r2;
        this.n = r4;
    }
}
