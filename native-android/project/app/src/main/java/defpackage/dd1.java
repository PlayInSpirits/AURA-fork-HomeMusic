package defpackage;

import androidx.fragment.app.Fragment$InstantiationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dd1 {
    public static final yd4 b = null;
    public final /* synthetic */ ld1 a;

    static {
        b = new yd4(0);
    }

    public dd1(ld1 r1) {
        this.a = r1;
    }

    public static Class b(ClassLoader r3, String r4) {
        yd4 r0 = b;
        yd4 r1 = (yd4) r0.get(r3);
        if (r1 != null) goto L5;
        r1 = new yd4(0);
        r0.put(r3, r1);
    L5:
        Class r2 = (Class) r1.get(r4);
        if (r2 != null) goto L9;
        Class<?> r5 = Class.forName(r4, false, r3);
        r1.put(r4, r5);
        return r5;
    L9:
        return r2;
    }

    public static Class c(ClassLoader r3, String r4) {
        return b(r3, r4);
    L5:
        e = move-exception;
        throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", r4, ": make sure class is a valid subclass of Fragment"), e);
    L8:
        e = move-exception;
        throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", r4, ": make sure class name exists"), e);
    }

    public final kc1 a(String r4) {
        return (kc1) c(this.a.v.B.getClassLoader(), r4).getConstructor(null).newInstance(null);
    L9:
        e = move-exception;
        throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", r4, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
    L11:
        e = move-exception;
        throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", r4, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
    L7:
        e = move-exception;
        throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", r4, ": could not find Fragment constructor"), e);
    L5:
        e = move-exception;
        throw new Fragment$InstantiationException(xa3.h("Unable to instantiate fragment ", r4, ": calling Fragment constructor caused an exception"), e);
    }
}
