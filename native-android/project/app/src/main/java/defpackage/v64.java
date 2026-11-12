package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v64 {
    public static final t64 a = null;
    public static final sq0 b = null;
    public static final dd3 c = null;

    static {
        a = new t64();
        b = new sq0(1);
        c = new dd3(1);
    }

    public static final Object a(g74 r10, long r11, wd0 r13) {
        if ((r13 instanceof u64) == false) goto L7;
        u64 r0 = (u64) r13;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r14 = r0.p;
        int r2 = r0.q;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        gx3 r12 = r0.o;
        g74 r15 = r0.n;
        kb4.X(r14);
        gx3 r7 = r12;
        g74 r16 = r15;
    L19:
        return new g83(r16.i(r7.n));
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r14);
        r7 = new gx3();
        s r3 = new s(r10, r11, r7, null, 1);
        r0.n = r10;
        r0.o = r7;
        r0.q = 1;
        Object r17 = r10.g(h13.n, r3, r0);
        xe0 r18 = xe0.n;
        if (r17 != r18) goto L17;
        return r18;
    L17:
        r16 = r10;
    L7:
        r0 = new u64(r13);
        goto L8
    }
}
