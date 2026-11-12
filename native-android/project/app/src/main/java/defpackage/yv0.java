package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yv0 {
    public static final boolean a = false;
    public static final Method b = null;
    public static final Field c = null;
    public static final Field d = null;
    public static final Field e = null;
    public static final Field f = null;

    static {
        Class<?> r3 = Class.forName("android.graphics.Insets");     // Catch: NoSuchFieldException -> L20 ClassNotFoundException -> L21 NoSuchMethodException -> L22
        Method r4 = Drawable.class.getMethod("getOpticalInsets", null);     // Catch: NoSuchFieldException -> L20 ClassNotFoundException -> L21 NoSuchMethodException -> L22
    L37:
        Field r5 = r3.getField("left");     // Catch: NoSuchFieldException -> L14 ClassNotFoundException -> L16 NoSuchMethodException -> L18
        Field r6 = r3.getField("top");     // Catch: NoSuchFieldException -> L10 ClassNotFoundException -> L12 NoSuchMethodException -> L13
        Field r7 = r3.getField("right");     // Catch: Throwable -> L9
        Field r8 = r3.getField("bottom");     // Catch: Throwable -> L28
        boolean r9 = true;
    L24:
        if (r9 == false) goto L26;
        b = r4;
        c = r5;
        d = r6;
        e = r7;
        f = r8;
        a = true;
        return;
    L26:
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        a = false;
        return;
    L23:
        r8 = null;
        r9 = false;
    L9:
        r7 = null;
        goto L23
    L12:
        r6 = null;
    L11:
        r7 = r6;
    L10:
        r6 = null;
    L13:
        r6 = null;
        goto L11
    L16:
        r5 = null;
    L17:
        r6 = r5;
    L14:
        r5 = null;
    L15:
        r6 = r5;
    L18:
        r5 = null;
    L19:
        r6 = r5;
    L21:
        r4 = null;
        r5 = null;
    L20:
        r4 = null;
        r5 = null;
    L22:
        r4 = null;
        r5 = null;
        goto L19
    }
}
