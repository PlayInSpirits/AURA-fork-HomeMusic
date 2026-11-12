package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i12 extends q14 {
    public int n;
    public final /* synthetic */ wf1 o;
    public final /* synthetic */ vd0 p;

    public i12(vd0 r1, vd0 r2, wf1 r3) {
        this.o = r3;
        this.p = r2;
        super(r1);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r4) {
        int r0 = this.n;
        if (r0 == 0) goto L9;
        if (r0 != 1) goto L7;
        this.n = 2;
        kb4.X(r4);
        return r4;
    L7:
        kf2.o("This coroutine had already completed");
        return null;
    L9:
        this.n = 1;
        kb4.X(r4);
        wf1 r5 = this.o;
        r5.getClass();
        jz4.j(2, r5);
        return r5.invoke(this.p, this);
    }
}
