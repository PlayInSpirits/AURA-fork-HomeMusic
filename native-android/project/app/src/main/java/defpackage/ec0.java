package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ec0 extends wd0 {
    public /* synthetic */ Object n;
    public int o;
    public final /* synthetic */ fc0 p;

    public ec0(fc0 r1, vd0 r2) {
        this.p = r1;
        super(r2);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r2) {
        this.n = r2;
        this.o |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}
