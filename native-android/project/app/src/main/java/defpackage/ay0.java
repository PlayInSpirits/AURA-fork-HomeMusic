package defpackage;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ay0 implements BiFunction {
    public final /* synthetic */ Function a;
    public final /* synthetic */ d64 b;

    public /* synthetic */ ay0(Function function, d64 d64Var) {
        this.a = function;
        this.b = d64Var;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Double d = (Double) obj;
        Double d2 = (Double) obj2;
        Function function = this.a;
        if (function != null) {
            d64 d64Var = this.b;
            if (function.apply(d64Var) != null && ((gy0) function.apply(d64Var)).e != null && ((gy0) function.apply(d64Var)).e.apply(d64Var) != null) {
                return Double.valueOf(gy0.b(d2.doubleValue(), 7.0d));
            }
        }
        return Double.valueOf(gy0.b(d2.doubleValue(), Math.max(7.0d, d.doubleValue())));
    }
}
