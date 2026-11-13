package defpackage;

import java.util.function.Function;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class zx0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ d64 b;

    public /* synthetic */ zx0(d64 d64Var, int i) {
        this.a = i;
        this.b = d64Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        d64 d64Var = this.b;
        gy0 gy0Var = (gy0) obj;
        switch (i) {
            case 0:
                return Double.valueOf(gy0Var.d(d64Var));
            case 1:
                return (Double) gy0Var.f.apply(d64Var);
            default:
                return (Double) gy0Var.g.apply(d64Var);
        }
    }
}
