package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v82 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ x82 o;

    public /* synthetic */ v82(x82 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        x82 r4 = this.o;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L11;
            default: goto L4;
        };
    L4:
        lm0 r1 = r4.C.a;
        if (r1.m().e != hb3.n) goto L8;
        long r2 = r1.m().i() & 4294967295L;
    L7:
        int r3 = (int) r2;
        lm0 r5 = r4.C.a;
        return Float.valueOf(r3 - ((-r5.m().f) + r5.m().d));
    L8:
        r2 = r1.m().i() >> 32;
        goto L7
    L11:
        lm0 r6 = r4.C.a;
        return Float.valueOf(ed3.a(r6.m(), r6.n()));
    L14:
        return Float.valueOf(e35.t(r4.C.a));
    }
}
