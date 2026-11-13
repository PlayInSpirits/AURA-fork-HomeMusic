package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a25 extends wd0 {
    public sf1 n;
    public gf1 o;
    public float p;
    public /* synthetic */ Object q;
    public final /* synthetic */ b25 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a25(b25 b25Var, wd0 wd0Var) {
        super(wd0Var);
        this.r = b25Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, this);
    }
}
