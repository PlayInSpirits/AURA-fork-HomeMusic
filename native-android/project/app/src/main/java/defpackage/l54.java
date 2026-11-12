package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l54 {
    public static final List a = null;
    public static final List b = null;

    static {
        a = gb.P(new Class[]{Application.class, b54.class});
        b = gb.O(b54.class);
    }

    public static final Constructor a(Class r6, List r7) {
        r7.getClass();
        Constructor<?>[] r0 = r6.getConstructors();
        r0.getClass();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L15;
        Constructor<?> r3 = r0[r2];
        Class<?>[] r4 = r3.getParameterTypes();
        r4.getClass();
        List r5 = ti.r0(r4);
        if (r7.equals(r5) == true) goto L6;
        if (r7.size() != r5.size()) goto L14;
        if (r5.containsAll(r7) == false) goto L14;
        throw new UnsupportedOperationException("Class " + r6.getSimpleName() + " must have parameters in the proper order: " + r7);
    L14:
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L15:
        return null;
    }

    public static final x65 b(Class r2, Constructor r3, Object... r4) {
        return (x65) r3.newInstance(Arrays.copyOf(r4, r4.length));
    L9:
        e = move-exception;
        nz2.r("Failed to access ", r2, e);
        return null;
    L7:
        e = move-exception;
        throw new RuntimeException("A " + r2 + " cannot be instantiated.", e);
    L5:
        e = move-exception;
        nz2.s("An exception happened in constructor of " + r2, e.getCause());
        return null;
    }
}
