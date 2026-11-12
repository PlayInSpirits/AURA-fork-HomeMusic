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
    public static final c32 a;

    static {
        uc0 uc0Var = new uc0(", ");
        a = new c32(uc0Var, uc0Var);
    }

    public static Type a(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeC = c(type);
            if (typeC != null) {
                if (typeC instanceof Class) {
                    Class cls = (Class) typeC;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return new c(new Type[0], new Type[]{typeC}, 1);
            }
        }
        return null;
    }

    public static void b(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                rr2.p(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    public static Type c(Type type) {
        type.getClass();
        AtomicReference atomicReference = new AtomicReference();
        new mz4(3, atomicReference).o(type);
        return (Type) atomicReference.get();
    }

    public static Type d(Type type) {
        if (!(type instanceof WildcardType)) {
            return x05.p.a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        rr2.k("Wildcard cannot have more than one lower bounds.", lowerBounds.length <= 1);
        if (lowerBounds.length == 1) {
            return new c(new Type[]{d(lowerBounds[0])}, new Type[]{Object.class}, 1);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        rr2.k("Wildcard should have only one upper bound.", upperBounds.length == 1);
        return new c(new Type[0], new Type[]{d(upperBounds[0])}, 1);
    }

    public static TypeVariable e(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        a15 a15Var = new a15(new z05(genericDeclaration, str, typeArr));
        rr2.o(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, a15Var));
    }

    public static b f(Type type, Class cls, Type... typeArr) {
        if (type == null) {
            return new b((Type) r05.n.a(cls), cls, typeArr);
        }
        typeArr.getClass();
        rr2.o(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new b(type, cls, typeArr);
    }
}
