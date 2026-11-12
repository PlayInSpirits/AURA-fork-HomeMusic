package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class by4 extends wd0 {
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ jy4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by4(jy4 jy4Var, wd0 wd0Var) {
        super(wd0Var);
        this.p = jy4Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return jy4.a(this.p, null, this);
    }
}
