package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ao3 implements qu3, yn3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ao3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yn3
    public final Object b(String str, if1 if1Var, wd0 wd0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((go3) obj).b(str, if1Var, wd0Var);
            default:
                return ((uo4) obj).b(str, if1Var, wd0Var);
        }
    }

    @Override // defpackage.qu3
    public final x34 c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((go3) obj).a;
            default:
                return ((uo4) obj).a;
        }
    }
}
