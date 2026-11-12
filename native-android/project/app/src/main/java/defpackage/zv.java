package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zv extends wd0 {
    public /* synthetic */ Object n;
    public final /* synthetic */ aw o;
    public int p;

    public zv(aw r1, wd0 r2) {
        this.o = r1;
        super(r2);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r7) {
        this.n = r7;
        this.p |= Integer.MIN_VALUE;
        Object r6 = this.o.J(null, 0, 0, this);
        if (r6 != xe0.n) goto L6;
        return r6;
    L6:
        return new j10(r6);
    }
}
