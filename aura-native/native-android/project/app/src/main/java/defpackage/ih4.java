package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih4 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ if1 o;

    public /* synthetic */ ih4(if1 if1Var, int i) {
        this.n = i;
        this.o = if1Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        if1 if1Var = this.o;
        switch (i) {
            case 0:
                ch4 ch4Var = (ch4) if1Var.invoke((gh4) obj);
                synchronized (jh4.c) {
                    jh4.d = jh4.d.f(ch4Var.g());
                }
                return ch4Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return if1Var.invoke(l);
        }
    }
}
