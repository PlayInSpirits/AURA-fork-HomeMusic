package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zx0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ d64 b;

    public /* synthetic */ zx0(d64 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r2) {
        int r0 = this.a;
        d64 r1 = this.b;
        gy0 r3 = (gy0) r2;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return (Double) r3.g.apply(r1);
    L7:
        return (Double) r3.f.apply(r1);
    L9:
        return Double.valueOf(r3.d(r1));
    }
}
