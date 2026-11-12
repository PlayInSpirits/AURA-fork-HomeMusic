package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ca3 extends e22 {
    public static final ca3 g = null;
    public static final ca3 h = null;
    public static final ca3 i = null;
    public static final ca3 j = null;
    public final /* synthetic */ int f;

    static {
        int r3 = 1;
        g = new ca3(r3, 2, 0);
        int r1 = 1;
        h = new ca3(r1, r1, 1);
        i = new ca3(r3, 2, 2);
        int r2 = 1;
        j = new ca3(r2, r2, 3);
    }

    public /* synthetic */ ca3(int r1, int r2, int r3) {
        this.f = r3;
        super(r1, r2);
    }

    @Override // defpackage.e22
    public final void d(x20 r2, bi r3, lg4 r4, uy3 r5, wa3 r6) {
        switch(this.f) {
            case 0: goto L26;
            case 1: goto L24;
            case 2: goto L14;
            default: goto L4;
        };
    L4:
        Object r1 = r2.d(0);
        int r7 = r2.c(0);
        if ((r1 instanceof wg1) == false) goto L7;
        wg1 r8 = (wg1) r1;
        r5.e.b(r8);
        r5.d.a(r8);
    L7:
        Object r9 = r4.K(r4.t, r7, r1);
        if ((r9 instanceof wg1) == false) goto L11;
        r5.e((wg1) r9);
        return;
    L11:
        if ((r9 instanceof lv3) == false) goto L29;
        ((lv3) r9).c();
        return;
    L29:
        return;
    L14:
        Object r10 = r2.d(0);
        mg1 r11 = (mg1) r2.d(1);
        int r12 = r2.c(0);
        if ((r10 instanceof wg1) == false) goto L17;
        wg1 r13 = (wg1) r10;
        r5.e.b(r13);
        r5.d.a(r13);
    L17:
        Object r14 = r4.K(r4.c(r11), r12, r10);
        if ((r14 instanceof wg1) == false) goto L21;
        r5.e((wg1) r14);
        return;
    L21:
        if ((r14 instanceof lv3) == false) goto L31;
        ((lv3) r14).c();
        return;
    L31:
        return;
    L24:
        mg1 r15 = (mg1) r2.d(0);
        int r16 = r2.c(0);
        r3.g();
        r15.getClass();
        r3.a(r16, r4.D(r4.c(r15)));
        return;
    L26:
        Object r17 = ((gf1) r2.d(0)).invoke();
        mg1 r18 = (mg1) r2.d(1);
        int r19 = r2.c(0);
        r18.getClass();
        r4.U(r4.c(r18), r17);
        r3.h(r19, r17);
        r3.b(r17);
    }

    @Override // defpackage.e22
    public mg1 e(x20 r2) {
        switch(this.f) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.e(r2);
    L7:
        return (mg1) r2.d(0);
    L9:
        return (mg1) r2.d(1);
    }
}
