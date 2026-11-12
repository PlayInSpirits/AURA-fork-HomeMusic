package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nv0 extends ep4 implements xf1 {
    public final /* synthetic */ int o;

    public /* synthetic */ nv0(int r1, vd0 r2, int r3) {
        this.o = r3;
        super(r1, r2);
    }

    @Override // defpackage.xf1
    public final Object a(Object r3, Object r4, Object r5) {
        int r2 = this.o;
        j15 r0 = j15.a;
        int r1 = 3;
        switch(r2) {
            case 0: goto L10;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        if (r3 != null) goto L6;
        long r6 = ((g83) r4).a;
        new nv0(r1, (vd0) r5, 2).invokeSuspend(r0);
        return r0;
    L6:
        kf2.k();
        return null;
    L8:
        we0 r7 = (we0) r3;
        ((Number) r4).floatValue();
        new nv0(r1, (vd0) r5, 1).invokeSuspend(r0);
        return r0;
    L10:
        we0 r8 = (we0) r3;
        long r9 = ((g83) r4).a;
        new nv0(r1, (vd0) r5, 0).invokeSuspend(r0);
        return r0;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r2) {
        int r1 = this.o;
        j15 r0 = j15.a;
        switch(r1) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        kb4.X(r2);
        return r0;
    L6:
        kb4.X(r2);
        return r0;
    L8:
        kb4.X(r2);
        return r0;
    }
}
