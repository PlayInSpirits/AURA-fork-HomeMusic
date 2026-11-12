package defpackage;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by0 implements BiFunction {
    public final /* synthetic */ Function a;
    public final /* synthetic */ d64 b;
    public final /* synthetic */ Function c;

    public /* synthetic */ by0(Function r1, d64 r2, Function r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object r9, Object r10) {
        Double r11 = (Double) r9;
        Double r12 = (Double) r10;
        Function r0 = this.a;
        d64 r1 = this.b;
        double r2 = ((Double) r0.apply(r1)).doubleValue();
        if (r11.doubleValue() < 7.0d) goto L6;
        r2 = gy0.b(r12.doubleValue(), 4.5d);
    L18:
        return Double.valueOf(r2);
    L6:
        if (r11.doubleValue() < 3.0d) goto L8;
        r2 = gy0.b(r12.doubleValue(), 3.0d);
        goto L18
    L8:
        Function r8 = this.c;
        if (r8 == null) goto L18;
        if (r8.apply(r1) == null) goto L18;
        if (((gy0) r8.apply(r1)).e == null) goto L18;
        if (((gy0) r8.apply(r1)).e.apply(r1) == null) goto L18;
        r2 = gy0.b(r12.doubleValue(), r11.doubleValue());
        goto L18
    }
}
