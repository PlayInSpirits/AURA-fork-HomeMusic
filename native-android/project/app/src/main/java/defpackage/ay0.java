package defpackage;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ay0 implements BiFunction {
    public final /* synthetic */ Function a;
    public final /* synthetic */ d64 b;

    public /* synthetic */ ay0(Function r1, d64 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object r6, Object r7) {
        Double r8 = (Double) r6;
        Double r9 = (Double) r7;
        Function r0 = this.a;
        if (r0 == null) goto L13;
        d64 r5 = this.b;
        if (r0.apply(r5) == null) goto L13;
        if (((gy0) r0.apply(r5)).e == null) goto L13;
        if (((gy0) r0.apply(r5)).e.apply(r5) == null) goto L13;
        return Double.valueOf(gy0.b(r9.doubleValue(), 7.0d));
    L13:
        return Double.valueOf(gy0.b(r9.doubleValue(), Math.max(7.0d, r8.doubleValue())));
    }
}
