package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zc3 extends wd0 {
    public ad3 n;
    public h13 o;
    public ep4 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ad3 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc3(ad3 ad3Var, wd0 wd0Var) {
        super(wd0Var);
        this.r = ad3Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return ad3.s(this.r, null, null, this);
    }
}
