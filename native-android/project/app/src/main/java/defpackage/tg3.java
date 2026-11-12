package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tg3 {
    public static final Method a = null;
    public static final Method b = null;

    static {
        Method[] r1 = Throwable.class.getMethods();
        r1.getClass();
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        Method r5 = null;
        if (r4 >= r2) goto L15;
        Method r6 = r1[r4];
        if (h12.c(r6.getName(), "addSuppressed") == false) goto L14;
        Class<?>[] r7 = r6.getParameterTypes();
        r7.getClass();
        if (r7.length != 1) goto L10;
        Class<?> r8 = r7[0];
    L12:
        if (h12.c(r8, Throwable.class) == false) goto L14;
    L16:
        a = r6;
        int r0 = r1.length;
    L17:
        if (r3 >= r0) goto L22;
        Method r9 = r1[r3];
        if (h12.c(r9.getName(), "getSuppressed") == true) goto L20;
        r3 = r3 + 1;
        goto L17
    L20:
        r5 = r9;
    L22:
        b = r5;
        return;
    L10:
        r8 = null;
    L14:
        r4 = r4 + 1;
        goto L3
    L15:
        r6 = null;
        goto L16
    }
}
