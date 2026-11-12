package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k82 extends or3 implements c42, gf1 {
    public final /* synthetic */ int o;

    public /* synthetic */ k82(int r1, int r2, Class r3, Object r4, String r5, String r6) {
        this.o = r2;
        super(r4, r3, r5, r6, r1);
    }

    @Override // defpackage.jy
    public final u32 computeReflected() {
        kx3.a.getClass();
        return this;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch(this.o) {
            case 0: goto L6;
            default: goto L7;
        };
    L7:
        return this.receiver.getClass().getSimpleName();
    L6:
        return ((kl4) this.receiver).getValue();
    }
}
