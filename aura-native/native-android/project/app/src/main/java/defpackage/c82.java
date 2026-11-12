package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c82 {
    public final u44 a;
    public final wc b;
    public final w03 c;

    public c82(u44 u44Var, wc wcVar) {
        this.a = u44Var;
        this.b = wcVar;
        long[] jArr = v54.a;
        this.c = new w03();
    }

    public final wf1 a(int i, Object obj) {
        w03 w03Var = this.c;
        b82 b82Var = (b82) w03Var.g(obj);
        int i2 = 3;
        if (b82Var != null && b82Var.b == i) {
            r70 r70Var = b82Var.c;
            if (r70Var != null) {
                return r70Var;
            }
            r70 r70Var2 = new r70(818252804, true, new ib(i2, b82Var.d, b82Var));
            b82Var.c = r70Var2;
            return r70Var2;
        }
        b82 b82Var2 = new b82(this, i, obj);
        w03Var.l(obj, b82Var2);
        r70 r70Var3 = b82Var2.c;
        if (r70Var3 != null) {
            return r70Var3;
        }
        r70 r70Var4 = new r70(818252804, true, new ib(i2, this, b82Var2));
        b82Var2.c = r70Var4;
        return r70Var4;
    }

    public final Object b(Object obj) {
        p03 p03Var;
        int iD;
        if (obj != null && ((b82) this.c.g(obj)) == null && (iD = (p03Var = (p03) ((nc3) this.b.invoke()).c.p).d(obj)) >= 0) {
            int i = p03Var.c[iD];
        }
        return null;
    }
}
