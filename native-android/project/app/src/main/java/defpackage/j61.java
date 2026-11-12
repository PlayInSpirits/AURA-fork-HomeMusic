package defpackage;

import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j61 implements BiFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
            case 1:
                return (Integer) mt1.n.invoke(obj, obj2);
            default:
                return (Integer) nt1.n.invoke(obj, obj2);
        }
    }
}
