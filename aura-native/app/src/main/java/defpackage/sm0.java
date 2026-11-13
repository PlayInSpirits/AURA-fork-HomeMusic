package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sm0 implements q64 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public sm0(q64 q64Var, ad3 ad3Var) {
        this.b = q64Var;
    }

    @Override // defpackage.q64
    public final float a(float f) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ml3 ml3Var = (ml3) obj;
                if (Float.isNaN(f)) {
                    return 0.0f;
                }
                float floatValue = ((Number) ((uc3) ml3Var.a).invoke(Float.valueOf(f))).floatValue();
                ((zd3) ml3Var.e).setValue(Boolean.valueOf(floatValue > 0.0f));
                ((zd3) ml3Var.f).setValue(Boolean.valueOf(floatValue < 0.0f));
                return floatValue;
            default:
                return ((q64) obj).a(f);
        }
    }

    public sm0(ml3 ml3Var) {
        this.b = ml3Var;
    }
}
