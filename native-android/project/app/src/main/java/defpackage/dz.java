package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dz {
    public static final /* synthetic */ Unsafe a = null;

    static {
        a = a();
    }

    public static /* synthetic */ Unsafe a() {
        Field r1 = Unsafe.class.getDeclaredField("theUnsafe");     // Catch: NoSuchFieldException -> L5
    L17:
        r1.setAccessible(true);
        return (Unsafe) r1.get(null);
    L20:
        e = move-exception;
        er1.m(e);
        return null;
    L5:
        e = move-exception;
        Field[] r2 = Unsafe.class.getDeclaredFields();
        int r3 = r2.length;
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L14;
        Field r5 = r2[r4];
        if (Modifier.isStatic(r5.getModifiers()) == false) goto L13;
        if (Unsafe.class.isAssignableFrom(r5.getType()) == false) goto L13;
    L15:
        if (r5 != null) goto L24;
        r1 = r5;
        goto L17
    L24:
        throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
    L13:
        r4 = r4 + 1;
        goto L7
    L14:
        r5 = null;
        goto L15
    }
}
