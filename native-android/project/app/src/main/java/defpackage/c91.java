package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c91 extends wd0 {
    public lv0 n;
    public /* synthetic */ Object o;
    public int p;
    public final /* synthetic */ lv0 q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c91(lv0 lv0Var, vd0 vd0Var) {
        super(vd0Var);
        this.q = lv0Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.p |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
