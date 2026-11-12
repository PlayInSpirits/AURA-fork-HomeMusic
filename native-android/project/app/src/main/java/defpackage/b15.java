package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b15 {
    public static final c32 a = null;

    static {
        uc0 r0 = new uc0(", ");
        a = new c32(r0, r0);
    }

    public static Type a(Type[] r5) {
        int r0 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L14;
        Type r3 = c(r5[r2]);
        if (r3 != null) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        if ((r3 instanceof Class) == false) goto L12;
        Class r6 = (Class) r3;
        if (r6.isPrimitive() == false) goto L12;
        return r6;
    L12:
        return new c(new Type[0], new Type[]{r3}, 1);
    L14:
        return null;
    }

    public static void b(Type[] r5, String r6) {
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        Type r2 = r5[r1];
        if ((r2 instanceof Class) == false) goto L7;
        Class r3 = (Class) r2;
        rr2.p(!r3.isPrimitive(), "Primitive type '%s' used as %s", r3, r6);
    L7:
        r1 = r1 + 1;
        goto L3
    }

    public static Type c(Type r4) {
        r4.getClass();
        AtomicReference r0 = new AtomicReference();
        new mz4(3, r0).o(new Type[]{r4});
        return (Type) r0.get();
    }

    public static Type d(Type r5) {
        if ((r5 instanceof WildcardType) == false) goto L19;
        WildcardType r6 = (WildcardType) r5;
        Type[] r0 = r6.getLowerBounds();
        if (r0.length > 1) goto L7;
        boolean r1 = true;
    L8:
        rr2.k("Wildcard cannot have more than one lower bounds.", r1);
        if (r0.length == 1) goto L11;
        Type[] r7 = r6.getUpperBounds();
        if (r7.length != 1) goto L15;
        boolean r2 = true;
    L16:
        rr2.k("Wildcard should have only one upper bound.", r2);
        return new c(new Type[0], new Type[]{d(r7[0])}, 1);
    L15:
        r2 = false;
        goto L16
    L11:
        return new c(new Type[]{d(r0[0])}, new Type[]{Object.class}, 1);
    L7:
        r1 = false;
        goto L8
    L19:
        return x05.p.a(r5);
    }

    public static TypeVariable e(GenericDeclaration r2, String r3, Type... r4) {
        if (r4.length != 0) goto L5;
        r4 = new Type[]{Object.class};
    L5:
        a15 r5 = new a15(new z05(r2, r3, r4));
        rr2.o(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, r5));
    }

    public static b f(Type r2, Class r3, Type... r4) {
        if (r2 == null) goto L4;
        r4.getClass();
        if (r3.getEnclosingClass() == null) goto L8;
        boolean r0 = true;
    L9:
        rr2.o(r0, "Owner type for unenclosed %s", r3);
        return new b(r2, r3, r4);
    L8:
        r0 = false;
        goto L9
    L4:
        return new b(r05.n.a(r3), r3, r4);
    }
}
