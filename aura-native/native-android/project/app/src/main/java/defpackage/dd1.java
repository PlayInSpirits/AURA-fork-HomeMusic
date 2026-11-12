package defpackage;

import androidx.fragment.app.Fragment$InstantiationException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dd1 {
    public static final yd4 b = new yd4(0);
    public final /* synthetic */ ld1 a;

    public dd1(ld1 ld1Var) {
        this.a = ld1Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        yd4 yd4Var = b;
        yd4 yd4Var2 = (yd4) yd4Var.get(classLoader);
        if (yd4Var2 == null) {
            yd4Var2 = new yd4(0);
            yd4Var.put(classLoader, yd4Var2);
        }
        Class cls = (Class) yd4Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        yd4Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final kc1 a(String str) {
        try {
            return (kc1) c(this.a.v.B.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
