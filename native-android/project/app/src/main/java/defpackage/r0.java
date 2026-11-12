package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements PrivilegedExceptionAction {
    public static Unsafe a() {
        Field[] r1 = Unsafe.class.getDeclaredFields();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L10;
        Field r4 = r1[r3];
        r4.setAccessible(true);
        Object r5 = r4.get(null);
        if (Unsafe.class.isInstance(r5) == true) goto L7;
        r3 = r3 + 1;
        goto L3
    L7:
        return (Unsafe) Unsafe.class.cast(r5);
    L10:
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        return a();
    }
}
