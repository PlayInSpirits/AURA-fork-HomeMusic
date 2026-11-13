package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class td1 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td1(int i, String str) {
        super(1);
        this.n = i;
        this.o = str;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        String str = this.o;
        switch (i) {
            case 0:
                kd3 kd3Var = (kd3) obj;
                kd3Var.getClass();
                return Boolean.valueOf(h12.c(kd3Var.n, str));
            default:
                return Boolean.valueOf(h12.c((String) obj, str));
        }
    }
}
