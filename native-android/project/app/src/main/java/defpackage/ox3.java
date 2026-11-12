package defpackage;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ox3 {
    public static final hw a = null;

    static {
        hw r0 = new nx3();     // Catch: NoSuchMethodException -> L4
    L5:
        a = r0;
        return;
    L4:
        r0 = new mx3();
        goto L5
    }

    public static void a(AccessibleObject r2, StringBuilder r3) {
        r3.append('(');
        if ((r2 instanceof Method) == false) goto L5;
        Class<?>[] r4 = ((Method) r2).getParameterTypes();
    L6:
        int r0 = 0;
    L8:
        if (r0 >= r4.length) goto L12;
        if (r0 <= 0) goto L11;
        r3.append(", ");
    L11:
        r3.append(r4[r0].getSimpleName());
        r0 = r0 + 1;
        goto L8
    L12:
        r3.append(')');
        return;
    L5:
        r4 = ((Constructor) r2).getParameterTypes();
        goto L6
    }

    public static String b(Constructor r2) {
        StringBuilder r0 = new StringBuilder(r2.getDeclaringClass().getName());
        a(r2, r0);
        return r0.toString();
    }

    public static String c(Field r2) {
        return r2.getDeclaringClass().getName() + "#" + r2.getName();
    }

    public static String d(AccessibleObject r4, boolean r5) {
        if ((r4 instanceof Field) == false) goto L6;
        String r6 = "field '" + c((Field) r4) + "'";
    L12:
        if (r5 == true) goto L14;
        return r6;
    L14:
        if (Character.isLowerCase(r6.charAt(0)) == true) goto L16;
        return r6;
    L16:
        return Character.toUpperCase(r6.charAt(0)) + r6.substring(1);
    L6:
        if ((r4 instanceof Method) == false) goto L9;
        Method r7 = (Method) r4;
        StringBuilder r0 = new StringBuilder(r7.getName());
        a(r7, r0);
        r6 = "method '" + r7.getDeclaringClass().getName() + "#" + r0.toString() + "'";
        goto L12
    L9:
        if ((r4 instanceof Constructor) == false) goto L11;
        r6 = "constructor '" + b((Constructor) r4) + "'";
        goto L12
    L11:
        r6 = "<unknown AccessibleObject> " + r4.toString();
        goto L12
    }

    public static void e(AccessibleObject r4) {
        r4.setAccessible(true);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        throw new JsonIOException(xa3.h("Failed making ", d(r4, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e);
    }
}
