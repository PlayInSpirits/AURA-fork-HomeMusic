package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ev0 extends wd0 {
    public /* synthetic */ Object n;
    public final /* synthetic */ z64 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(z64 z64Var, wd0 wd0Var) {
        super(wd0Var);
        this.o = z64Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return z64.t0(this.o, this);
    }
}
