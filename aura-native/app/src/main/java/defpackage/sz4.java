package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sz4 {
    public final oz4 a;

    public sz4() {
        this.a = new oz4(0);
    }

    public static void a(HashMap hashMap, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new lz4(hashMap, type2).o(type);
    }

    public final Type b(Type type) {
        type.getClass();
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            oz4 oz4Var = this.a;
            oz4Var.getClass();
            return oz4Var.a(typeVariable, new nz4(typeVariable, oz4Var));
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            return b15.f(ownerType == null ? null : b(ownerType), (Class) b(parameterizedType.getRawType()), c(parameterizedType.getActualTypeArguments()));
        }
        if (type instanceof GenericArrayType) {
            return b15.d(b(((GenericArrayType) type).getGenericComponentType()));
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(c(wildcardType.getLowerBounds()), c(wildcardType.getUpperBounds()), 1);
    }

    public final Type[] c(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = b(typeArr[i]);
        }
        return typeArr2;
    }

    public sz4(oz4 oz4Var) {
        this.a = oz4Var;
    }
}
