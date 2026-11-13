package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k81 extends l81 {
    public final /* synthetic */ int e;
    public final /* synthetic */ o81 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k81(o81 o81Var, int i) {
        super(o81Var);
        this.e = i;
        this.f = o81Var;
    }

    @Override // defpackage.l81
    public final float a() {
        float f;
        float f2;
        int i = this.e;
        o81 o81Var = this.f;
        switch (i) {
            case 0:
                f = o81Var.h;
                f2 = o81Var.i;
                break;
            case 1:
                f = o81Var.h;
                f2 = o81Var.j;
                break;
            default:
                return o81Var.h;
        }
        return f + f2;
    }
}
