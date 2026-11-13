package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class l90 extends qr3 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public l90(if1 if1Var) {
        super(new e90(3));
        this.c = new m90(if1Var);
    }

    @Override // defpackage.qr3
    public final rr3 a(Object obj) {
        switch (this.b) {
            case 0:
                return new rr3(this, obj, obj == null, null, null, true);
            default:
                return new rr3(this, obj, obj == null, (rv2) this.c, null, true);
        }
    }

    @Override // defpackage.qr3
    public j35 b() {
        switch (this.b) {
            case 0:
                return (m90) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(gf1 gf1Var) {
        super(gf1Var);
        rv2 rv2Var = rv2.D;
        this.c = rv2Var;
    }
}
