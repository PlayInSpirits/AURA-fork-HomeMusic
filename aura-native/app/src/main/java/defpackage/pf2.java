package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pf2 extends sj0 {
    public pf2(long a0) {
        super(a0);
    }

    public i11 d;

    @Override // defpackage.sj0
    public final int b(Object obj) {
        q04 q04Var = (q04) obj;
        if (q04Var == null) {
            return 1;
        }
        return q04Var.d();
    }

    @Override // defpackage.sj0
    public final void c(Object obj, Object obj2) {
        q04 q04Var = (q04) obj2;
        i11 i11Var = this.d;
        if (i11Var == null || q04Var == null) {
            return;
        }
        i11Var.e.k(q04Var, true);
    }
}
