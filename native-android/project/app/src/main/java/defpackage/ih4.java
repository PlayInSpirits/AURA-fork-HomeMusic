package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih4 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ if1 o;

    public /* synthetic */ ih4(if1 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r4) {
        int r0 = this.n;
        if1 r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Long r5 = (Long) r4;
        r5.getClass();
        return r3.invoke(r5);
    L6:
        ch4 r6 = (ch4) r3.invoke((gh4) r4);
        Object r7 = jh4.c;
        monitor-enter(r7);
        jh4.d = jh4.d.f(r6.g());     // Catch: Throwable -> L11
        monitor-exit(r7);
        return r6;
    L11:
        th = move-exception;
        throw th;
    }
}
