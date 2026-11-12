package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qe5 extends q42 implements wf1 {
    public final /* synthetic */ fx3 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ ix3 p;
    public final /* synthetic */ xu3 q;
    public final /* synthetic */ ix3 r;
    public final /* synthetic */ ix3 s;
    public final /* synthetic */ jx3 t;
    public final /* synthetic */ jx3 u;
    public final /* synthetic */ jx3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe5(fx3 fx3Var, long j, ix3 ix3Var, xu3 xu3Var, ix3 ix3Var2, ix3 ix3Var3, jx3 jx3Var, jx3 jx3Var2, jx3 jx3Var3) {
        super(2);
        this.n = fx3Var;
        this.o = j;
        this.p = ix3Var;
        this.q = xu3Var;
        this.r = ix3Var2;
        this.s = ix3Var3;
        this.t = jx3Var;
        this.u = jx3Var2;
        this.v = jx3Var3;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        xu3 xu3Var = this.q;
        if (iIntValue == 1) {
            fx3 fx3Var = this.n;
            if (fx3Var.n) {
                mj0.i("bad zip: zip64 extra repeated");
                return null;
            }
            fx3Var.n = true;
            if (jLongValue < this.o) {
                mj0.i("bad zip: zip64 extra too short");
                return null;
            }
            ix3 ix3Var = this.p;
            long j = ix3Var.n;
            if (j == 4294967295L) {
                j = xu3Var.j();
            }
            ix3Var.n = j;
            ix3 ix3Var2 = this.r;
            ix3Var2.n = ix3Var2.n == 4294967295L ? xu3Var.j() : 0L;
            ix3 ix3Var3 = this.s;
            ix3Var3.n = ix3Var3.n == 4294967295L ? xu3Var.j() : 0L;
        } else if (iIntValue == 10) {
            if (jLongValue < 4) {
                mj0.i("bad zip: NTFS extra too short");
                return null;
            }
            xu3Var.skip(4L);
            gb.W(xu3Var, (int) (jLongValue - 4), new pe5(this.t, xu3Var, this.u, this.v));
        }
        return j15.a;
    }
}
