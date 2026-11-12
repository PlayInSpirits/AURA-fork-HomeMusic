package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p40 implements cz4 {
    public final /* synthetic */ int n;
    public final mf4 o;

    public /* synthetic */ p40(mf4 mf4Var, int i) {
        this.n = i;
        this.o = mf4Var;
    }

    public static bz4 b(mf4 mf4Var, nk1 nk1Var, TypeToken typeToken, e32 e32Var) {
        bz4 bz4VarA;
        Object objA = mf4Var.e(TypeToken.get(e32Var.value())).A();
        boolean zNullSafe = e32Var.nullSafe();
        if (objA instanceof bz4) {
            bz4VarA = (bz4) objA;
        } else if (objA instanceof cz4) {
            bz4VarA = ((cz4) objA).a(nk1Var, typeToken);
        } else {
            if (!(objA instanceof g32)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            vx4 vx4Var = new vx4((g32) objA, nk1Var, typeToken, null, zNullSafe);
            zNullSafe = false;
            bz4VarA = vx4Var;
        }
        return (bz4VarA == null || !zNullSafe) ? bz4VarA : new ek4(bz4VarA, 3);
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 nk1Var, TypeToken typeToken) {
        Type[] actualTypeArguments;
        int i = this.n;
        Type type = Object.class;
        mf4 mf4Var = this.o;
        switch (i) {
            case 0:
                Type type2 = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                vr1.d(Collection.class.isAssignableFrom(rawType));
                Type typeY = gb.Y(type2, rawType, gb.A(type2, rawType, Collection.class), new HashMap());
                type = typeY instanceof ParameterizedType ? ((ParameterizedType) typeY).getActualTypeArguments()[0] : Object.class;
                return new si(nk1Var, type, nk1Var.g(TypeToken.get(type)), mf4Var.e(typeToken));
            case 1:
                e32 e32Var = (e32) typeToken.getRawType().getAnnotation(e32.class);
                if (e32Var == null) {
                    return null;
                }
                return b(mf4Var, nk1Var, typeToken, e32Var);
            default:
                Type type3 = typeToken.getType();
                Class rawType2 = typeToken.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    vr1.d(Map.class.isAssignableFrom(rawType2));
                    Type typeY2 = gb.Y(type3, rawType2, gb.A(type3, rawType2, Map.class), new HashMap());
                    actualTypeArguments = typeY2 instanceof ParameterizedType ? ((ParameterizedType) typeY2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                bz4 bz4VarG = (type4 == Boolean.TYPE || type4 == Boolean.class) ? hz4.c : nk1Var.g(TypeToken.get(type4));
                bz4 bz4VarG2 = nk1Var.g(TypeToken.get(actualTypeArguments[1]));
                o73 o73VarE = mf4Var.e(typeToken);
                Type[] typeArr = actualTypeArguments;
                return new eg2(this, nk1Var, typeArr[0], bz4VarG, typeArr[1], bz4VarG2, o73VarE);
        }
    }
}
