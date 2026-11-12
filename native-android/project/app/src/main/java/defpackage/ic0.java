package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic0 {
    public static final String a = null;

    static {
        a = cx.i("ConstraintTrkngWrkr");
    }

    public static final Object a(c52 r4, dd5 r5, wd0 r6) {
        if ((r6 instanceof hc0) == false) goto L7;
        hc0 r0 = (hc0) r6;
        int r1 = r0.o;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.o = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.n;
        int r2 = r0.o;
        vd0 r3 = null;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        kb4.X(r7);
    L18:
        return new Integer(((sc0) r7).a);
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r7);
        x81 r8 = new x81(r4.f(r5), new w(r5, r3, 2), 2);
        gc0 r9 = new gc0(0, r8);
        r0.o = 1;
        r7 = ya4.p(r9, r0);
        xe0 r10 = xe0.n;
        if (r7 != r10) goto L18;
        return r10;
    L7:
        r0 = new hc0(r6);
        goto L8
    }
}
