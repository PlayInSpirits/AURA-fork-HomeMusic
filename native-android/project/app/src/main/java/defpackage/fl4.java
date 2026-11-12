package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fl4 extends xb1 {
    public final /* synthetic */ m84 b;
    public final /* synthetic */ e20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl4(e20 e20Var, m84 m84Var, m84 m84Var2) {
        super(m84Var);
        this.c = e20Var;
        this.b = m84Var2;
    }

    @Override // defpackage.xb1, defpackage.m84
    public final l84 e(long j) {
        l84 l84VarE = this.b.e(j);
        o84 o84Var = l84VarE.a;
        long j2 = o84Var.a;
        long j3 = o84Var.b;
        long j4 = this.c.o;
        o84 o84Var2 = new o84(j2, j3 + j4);
        o84 o84Var3 = l84VarE.b;
        return new l84(o84Var2, new o84(o84Var3.a, o84Var3.b + j4));
    }
}
