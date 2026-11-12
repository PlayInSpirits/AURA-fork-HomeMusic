package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u15 extends w15 {
    public final /* synthetic */ Method b;

    public u15(Method r1) {
        this.b = r1;
    }

    @Override // defpackage.w15
    public final Object a(Class r2) {
        String r0 = mf4.b(r2);
        if (r0 != null) goto L7;
        Method r1 = this.b;
        return r1.invoke(null, new Object[]{r2, Object.class});
    L7:
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(r0));
    }
}
