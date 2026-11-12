package defpackage;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by0 implements BiFunction {
    public final /* synthetic */ Function a;
    public final /* synthetic */ d64 b;
    public final /* synthetic */ Function c;

    public /* synthetic */ by0(Function function, d64 d64Var, Function function2) {
        this.a = function;
        this.b = d64Var;
        this.c = function2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Double d = (Double) obj;
        Double d2 = (Double) obj2;
        Function function = this.a;
        d64 d64Var = this.b;
        double dDoubleValue = ((Double) function.apply(d64Var)).doubleValue();
        if (d.doubleValue() >= 7.0d) {
            dDoubleValue = gy0.b(d2.doubleValue(), 4.5d);
        } else if (d.doubleValue() >= 3.0d) {
            dDoubleValue = gy0.b(d2.doubleValue(), 3.0d);
        } else {
            Function function2 = this.c;
            if (function2 != null && function2.apply(d64Var) != null && ((gy0) function2.apply(d64Var)).e != null && ((gy0) function2.apply(d64Var)).e.apply(d64Var) != null) {
                dDoubleValue = gy0.b(d2.doubleValue(), d.doubleValue());
            }
        }
        return Double.valueOf(dDoubleValue);
    }
}
