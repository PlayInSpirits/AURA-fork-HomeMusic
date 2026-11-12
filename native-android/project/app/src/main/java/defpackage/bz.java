package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz implements xf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ bz(n13 r1, m13 r2) {
        this.n = 1;
        this.o = r1;
    }

    @Override // defpackage.xf1
    public final Object a(Object r3, Object r4, Object r5) {
        int r0 = this.n;
        j15 r1 = j15.a;
        Object r2 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Throwable r6 = (Throwable) r3;
        j15 r7 = (j15) r4;
        ne0 r8 = (ne0) r5;
        ((u94) r2).c();
        return r1;
    L6:
        n13 r9 = (n13) r2;
        Throwable r10 = (Throwable) r3;
        j15 r11 = (j15) r4;
        ne0 r12 = (ne0) r5;
        n13.w.set(r9, null);
        r9.f(null);
        return r1;
    L8:
        ne0 r13 = (ne0) r5;
        ((x) r2).invoke((Throwable) r3);
        return r1;
    }

    public /* synthetic */ bz(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }
}
