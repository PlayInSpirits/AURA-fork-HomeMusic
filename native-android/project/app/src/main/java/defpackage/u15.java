package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u15 extends w15 {
    public final /* synthetic */ Method b;

    public u15(Method method) {
        this.b = method;
    }

    @Override // defpackage.w15
    public final Object a(Class cls) {
        String strB = mf4.b(cls);
        if (strB != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
        }
        return this.b.invoke(null, cls, Object.class);
    }
}
