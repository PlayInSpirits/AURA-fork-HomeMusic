package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w15 {
    public static final w15 a = null;

    static {
        Class<?> r5 = Class.forName("sun.misc.Unsafe");     // Catch: Exception -> L5
        Field r6 = r5.getDeclaredField("theUnsafe");     // Catch: Exception -> L5
        r6.setAccessible(true);     // Catch: Exception -> L5
        Object r7 = r6.get(null);     // Catch: Exception -> L5
        w15 r8 = new s15(r5.getMethod("allocateInstance", new Class[]{Class.class}), r7);     // Catch: Exception -> L5
    L10:
        a = r8;
        return;
    L5:
        Method r9 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});     // Catch: Exception -> L7
        r9.setAccessible(true);     // Catch: Exception -> L7
        int r3 = ((Integer) r9.invoke(null, new Object[]{Object.class})).intValue();     // Catch: Exception -> L7
        Method r1 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});     // Catch: Exception -> L7
        r1.setAccessible(true);     // Catch: Exception -> L7
        r8 = new t15(r1, r3);     // Catch: Exception -> L7
    L7:
        Method r0 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});     // Catch: Exception -> L9
        r0.setAccessible(true);     // Catch: Exception -> L9
        r8 = new u15(r0);     // Catch: Exception -> L9
    L9:
        r8 = new v15();
        goto L10
    }

    public abstract Object a(Class r1);
}
