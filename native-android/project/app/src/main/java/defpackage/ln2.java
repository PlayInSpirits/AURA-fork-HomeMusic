package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln2 implements mk {
    public final /* synthetic */ int n;
    public final /* synthetic */ pn2 o;

    public /* synthetic */ ln2(pn2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.mk
    public final ic2 apply(Object r5) {
        int r0 = this.n;
        pn2 r4 = this.o;
        m92 r6 = (m92) r5;
        switch(r0) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        rr2.s(r6, "LibraryResult must not be null");
        lb4 r1 = new lb4();
        if (r6.a != 0) goto L15;
        Object r7 = r6.c;
        if (r7 == null) goto L15;
        gn2 r8 = (gn2) r7;
        byte[] r2 = r8.d.k;
        if (r2 != null) goto L14;
        r1.l(f92.a(r8, null));
    L16:
        return r1;
    L14:
        ic2 r9 = r4.z.m.j(r2);
        mn2 r3 = new mn2(r1, r9, 0);
        gq0 r10 = gq0.n;
        r1.f(r3, r10);
        v6 r11 = new v6(r9, r1, r8, 25);
        ((k91) r9).f(r11, r10);
    L15:
        r1.l(null);
        goto L16
    L5:
        return pn2.a(r4, r6);
    }
}
