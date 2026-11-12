package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w81 extends wd0 {
    public /* synthetic */ Object n;
    public int o;
    public final /* synthetic */ x81 p;
    public x81 q;
    public q81 r;
    public Throwable s;
    public long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w81(x81 x81Var, vd0 vd0Var) {
        super(vd0Var);
        this.p = x81Var;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.o |= Integer.MIN_VALUE;
        return this.p.a(null, this);
    }
}
