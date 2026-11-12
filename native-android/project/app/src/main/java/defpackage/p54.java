package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p54 implements wf1 {
    public static final p54 o = null;
    public static final p54 p = null;
    public final /* synthetic */ int n;

    static {
        o = new p54(0);
        p = new p54(1);
    }

    public /* synthetic */ p54(int r1) {
        this.n = r1;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        switch(this.n) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        w2 r5 = (w2) r3;
        w2 r6 = (w2) r4;
        if (r5 == null) goto L8;
        String r0 = r5.a;
        if (r0 == null) goto L8;
    L9:
        if (r5 == null) goto L12;
        sf1 r7 = r5.b;
        if (r7 == null) goto L12;
    L14:
        return new w2(r0, r7);
    L12:
        r7 = r6.b;
    L8:
        r0 = r6.a;
        goto L9
    L15:
        t44 r8 = (t44) r3;
        long r2 = ((x40) r4).a;
        if (r2 != 16) goto L19;
        return Boolean.FALSE;
    L19:
        return Integer.valueOf(e35.U(r2));
    }
}
