package defpackage;

/* loaded from: classes.dex */
public final class g91 extends wd0 {
    public /* synthetic */ Object n;
    public int o;
    public final /* synthetic */ lv0 p;
    public Object q;
    public q81 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g91(lv0 lv0Var, vd0 vd0Var) {
        super(vd0Var);
        this.p = lv0Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.o |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}
