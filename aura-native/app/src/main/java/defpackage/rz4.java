package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class rz4 {
    public static final rz4 b = new rz4(new AtomicInteger());
    public final AtomicInteger a;

    public rz4(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    public final Type a(Type type) {
        type.getClass();
        if (type instanceof Class) {
            return type;
        }
        if (type instanceof TypeVariable) {
            return type;
        }
        boolean z = type instanceof GenericArrayType;
        AtomicInteger atomicInteger = this.a;
        if (z) {
            return b15.d(new rz4(atomicInteger).a(((GenericArrayType) type).getGenericComponentType()));
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof WildcardType)) {
                throw new AssertionError("must have been one of the known types");
            }
            WildcardType wildcardType = (WildcardType) type;
            return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = new qz4(atomicInteger, typeParameters[i]).a(actualTypeArguments[i]);
        }
        rz4 rz4Var = new rz4(atomicInteger);
        Type ownerType = parameterizedType.getOwnerType();
        return b15.f(ownerType == null ? null : rz4Var.a(ownerType), cls, actualTypeArguments);
    }

    public TypeVariable b(Type[] typeArr) {
        return b15.e(rz4.class, "capture#" + this.a.incrementAndGet() + "-of ? extends " + new uc0(String.valueOf('&')).b(Arrays.asList(typeArr)), typeArr);
    }
}
