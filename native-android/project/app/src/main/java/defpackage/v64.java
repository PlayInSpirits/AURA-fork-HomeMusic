package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v64 {
    public static final t64 a = new t64();
    public static final sq0 b = new sq0(1);
    public static final dd3 c = new dd3(1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(g74 g74Var, long j, wd0 wd0Var) {
        u64 u64Var;
        gx3 gx3Var;
        g74 g74Var2;
        if (wd0Var instanceof u64) {
            u64Var = (u64) wd0Var;
            int i = u64Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                u64Var.q = i - Integer.MIN_VALUE;
            } else {
                u64Var = new u64(wd0Var);
            }
        } else {
            u64Var = new u64(wd0Var);
        }
        Object obj = u64Var.p;
        int i2 = u64Var.q;
        if (i2 == 0) {
            kb4.X(obj);
            gx3Var = new gx3();
            s sVar = new s(g74Var, j, gx3Var, null, 1);
            u64Var.n = g74Var;
            u64Var.o = gx3Var;
            u64Var.q = 1;
            Object objG = g74Var.g(h13.n, sVar, u64Var);
            xe0 xe0Var = xe0.n;
            if (objG == xe0Var) {
                return xe0Var;
            }
            g74Var2 = g74Var;
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gx3 gx3Var2 = u64Var.o;
            g74 g74Var3 = u64Var.n;
            kb4.X(obj);
            gx3Var = gx3Var2;
            g74Var2 = g74Var3;
        }
        return new g83(g74Var2.i(gx3Var.n));
    }
}
