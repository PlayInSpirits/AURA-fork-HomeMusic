package defpackage;

import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j61 implements BiFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ j61(int r1) {
        this.a = r1;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object r1, Object r2) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L5;
        };
    L8:
        Boolean r3 = (Boolean) r2;
        if (((Boolean) r1).booleanValue() == false) goto L11;
    L14:
        boolean r0 = true;
    L16:
        return Boolean.valueOf(r0);
    L11:
        if (r3.booleanValue() == true) goto L14;
        r0 = false;
        goto L16
    L5:
        return (Integer) nt1.n.invoke(r1, r2);
    L7:
        return (Integer) mt1.n.invoke(r1, r2);
    }
}
