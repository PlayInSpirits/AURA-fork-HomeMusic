package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ka2 {
    public static final HashMap a = null;
    public static final HashMap b = null;

    static {
        a = new HashMap();
        b = new HashMap();
    }

    public static void a(Constructor r0, aa2 r1) {
        r0.newInstance(new Object[]{r1}).getClass();     // Catch: InvocationTargetException -> L4 InstantiationException -> L7 IllegalAccessException -> L10
        throw new ClassCastException();     // Catch: InvocationTargetException -> L4 InstantiationException -> L7 IllegalAccessException -> L10
    L10:
        e = move-exception;
        throw new RuntimeException(e);
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public static int b(Class r13) {
        HashMap r1 = a;
        Integer r2 = (Integer) r1.get(r13);
        if (r2 != null) goto L5;
        int r3 = 1;
        if (r13.getCanonicalName() == null) goto L71;
        int r4 = 0;
        ArrayList r5 = null;
        Package r6 = r13.getPackage();     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        String r7 = r13.getCanonicalName();     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        if (r6 == null) goto L15;
        String r8 = r6.getName();     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
    L16:
        r8.getClass();     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        if (r8.length() == 0) goto L20;
        r7.getClass();     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        r7 = r7.substring(r8.length() + 1);     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
    L20:
        r7.getClass();     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        String r9 = xm4.i0(r7, ".", "_").concat("_LifecycleAdapter");     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        if (r8.length() == 0) goto L24;
        r9 = r8 + "." + r9;     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
    L24:
        Constructor<?> r0 = Class.forName(r9).getDeclaredConstructor(new Class[]{r13});     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        if (r0.isAccessible() == true) goto L31;
        r0.setAccessible(true);     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
    L31:
        HashMap r10 = b;
        if (r0 == null) goto L35;
        r10.put(r13, gb.O(r0));
    L34:
        r3 = 2;
        goto L71
    L35:
        l30 r11 = l30.c;
        HashMap r12 = r11.b;
        Boolean r14 = (Boolean) r12.get(r13);
        if (r14 == null) goto L76;
        boolean r15 = r14.booleanValue();
    L46:
        if (r15 == true) goto L71;
        Class r16 = r13.getSuperclass();
        if (r16 != null) goto L51;
    L56:
        Class<?>[] r17 = r13.getInterfaces();
        r17.getClass();
        int r18 = r17.length;
    L57:
        if (r4 >= r18) goto L69;
        Class<?> r19 = r17[r4];
        if (r19 == null) goto L68;
        if (aa2.class.isAssignableFrom(r19) == false) goto L68;
        r19.getClass();
        if (b(r19) == 1) goto L71;
        if (r5 != null) goto L67;
        r5 = new ArrayList();
    L67:
        Object r20 = r10.get(r19);
        r20.getClass();
        r5.addAll((Collection) r20);
    L68:
        r4 = r4 + 1;
        goto L57
    L69:
        if (r5 == null) goto L71;
        r10.put(r13, r5);
        goto L34
    L51:
        if (aa2.class.isAssignableFrom(r16) == false) goto L56;
        r16.getClass();
        if (b(r16) == 1) goto L71;
        Object r21 = r10.get(r16);
        r21.getClass();
        r5 = new ArrayList((Collection) r21);
        goto L56
    L76:
        Method[] r22 = r13.getDeclaredMethods();     // Catch: NoClassDefFoundError -> L73
        int r23 = r22.length;
        int r110 = 0;
    L40:
        if (r110 >= r23) goto L45;
        if (((f93) r22[r110].getAnnotation(f93.class)) != null) goto L43;
        r110 = r110 + 1;
        goto L40
    L43:
        r11.a(r13, r22);
        r15 = true;
        goto L46
    L45:
        r12.put(r13, Boolean.FALSE);
        r15 = false;
    L73:
        e = move-exception;
        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
    L15:
        r8 = "";
    L30:
        r0 = null;
    L13:
        e = move-exception;
        er1.m(e);
        return 0;
    L71:
        r1.put(r13, Integer.valueOf(r3));
        return r3;
    L5:
        return r2.intValue();
    }
}
