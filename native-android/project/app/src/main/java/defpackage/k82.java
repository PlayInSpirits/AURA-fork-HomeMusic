package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k82 extends or3 implements c42, gf1 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k82(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.o = i2;
    }

    @Override // defpackage.jy
    public final u32 computeReflected() {
        kx3.a.getClass();
        return this;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch (this.o) {
            case 0:
                return ((kl4) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }
}
