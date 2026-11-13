package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class w64 extends wd0 {
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ xk0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w64(xk0 xk0Var, wd0 wd0Var) {
        super(wd0Var);
        this.p = xk0Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b0(0L, 0L, this);
    }
}
