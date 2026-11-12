package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jl3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ String p;

    public /* synthetic */ jl3(int i, long j, String str) {
        this.n = i;
        this.o = j;
        this.p = str;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        int i = this.n;
        String str = this.p;
        long j = this.o;
        x34 x34Var = (x34) obj;
        switch (i) {
            case 0:
                z34 z34VarU = x34Var.U("UPDATE playlist SET lastPlayed = ? WHERE id = ?");
                try {
                    z34VarU.c(1, j);
                    if (str == null) {
                        z34VarU.e(2);
                    } else {
                        z34VarU.r(2, str);
                    }
                    z34VarU.O();
                    return null;
                } finally {
                    z34VarU.close();
                }
            default:
                z34 z34VarU2 = x34Var.U("UPDATE queue SET last_play=? WHERE id=?");
                try {
                    z34VarU2.c(1, j);
                    if (str == null) {
                        z34VarU2.e(2);
                    } else {
                        z34VarU2.r(2, str);
                    }
                    z34VarU2.O();
                    return null;
                } finally {
                    z34VarU2.close();
                }
        }
    }
}
