package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lz4 extends rp {
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ Type c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz4(HashMap map, Type type) {
        super(6);
        this.b = map;
        this.c = type;
    }

    @Override // defpackage.rp
    public final void p(Class cls) {
        Type type = this.c;
        if (type instanceof WildcardType) {
            return;
        }
        tb4.h("No type mapping from ", cls, " to ", type);
    }

    @Override // defpackage.rp
    public final void q(GenericArrayType genericArrayType) {
        Type type = this.c;
        if (type instanceof WildcardType) {
            return;
        }
        Type typeC = b15.c(type);
        rr2.o(typeC != null, "%s is not an array type.", type);
        sz4.a(this.b, genericArrayType.getGenericComponentType(), typeC);
    }

    @Override // defpackage.rp
    public final void r(ParameterizedType parameterizedType) {
        Type type = this.c;
        if (type instanceof WildcardType) {
            return;
        }
        try {
            ParameterizedType parameterizedType2 = (ParameterizedType) ParameterizedType.class.cast(type);
            Type ownerType = parameterizedType.getOwnerType();
            HashMap map = this.b;
            if (ownerType != null && parameterizedType2.getOwnerType() != null) {
                sz4.a(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            rr2.p(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            rr2.p(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                sz4.a(map, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(type + " is not a ParameterizedType");
        }
    }

    @Override // defpackage.rp
    public final void s(TypeVariable typeVariable) {
        this.b.put(new pz4(typeVariable), this.c);
    }

    @Override // defpackage.rp
    public final void t(WildcardType wildcardType) {
        HashMap map;
        Type type = this.c;
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType) type;
            Type[] upperBounds = wildcardType.getUpperBounds();
            Type[] upperBounds2 = wildcardType2.getUpperBounds();
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] lowerBounds2 = wildcardType2.getLowerBounds();
            rr2.p(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, type);
            int i = 0;
            while (true) {
                int length = upperBounds.length;
                map = this.b;
                if (i >= length) {
                    break;
                }
                sz4.a(map, upperBounds[i], upperBounds2[i]);
                i++;
            }
            for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                sz4.a(map, lowerBounds[i2], lowerBounds2[i2]);
            }
        }
    }
}
