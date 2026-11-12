package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts2 implements it2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ts2(Object r1, boolean r2, int r3) {
        this.n = r3;
        this.p = r1;
        this.o = r2;
    }

    @Override // defpackage.wc0
    public void accept(Object r2) {
        al3 r3 = (al3) r2;
        r3.k0((il) this.p, this.o);
    }

    @Override // defpackage.it2
    public Object h(tn2 r13, fr2 r14, int r15) {
        int r16 = this.n;
        long r0 = -9223372036854775807L;
        int r2 = -1;
        boolean r3 = this.o;
        Object r12 = this.p;
        switch(r16) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        List r6 = (List) r12;
        if (r3 == false) goto L7;
    L6:
        int r7 = r2;
        if (r3 == true) goto L12;
        r0 = r13.s.M0();
    L12:
        return r13.x(r14, r6, r7, r0);
    L7:
        r2 = r13.s.o0();
        goto L6
    L13:
        gy3 r17 = yw1.o((gn2) r12);
        if (r3 == true) goto L17;
        r2 = r13.s.o0();
    L17:
        if (r3 == true) goto L21;
        r0 = r13.s.M0();
    L21:
        return r13.x(r14, r17, r2, r0);
    }
}
