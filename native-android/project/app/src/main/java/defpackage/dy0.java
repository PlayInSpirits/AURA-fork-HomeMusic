package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;

    public /* synthetic */ dy0(double r1, int r3) {
        this.a = r3;
        this.b = r1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r4) {
        int r0 = this.a;
        double r1 = this.b;
        Double r5 = (Double) r4;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Double.valueOf(r1);
    L7:
        return Double.valueOf(r1);
    }
}
