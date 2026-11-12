package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mz4 extends rp {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz4() {
        super(6);
        this.b = 0;
        this.c = new HashMap();
    }

    @Override // defpackage.rp
    public void p(Class cls) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                o(cls.getGenericSuperclass());
                o(cls.getGenericInterfaces());
                break;
            case 2:
                ((ix1) obj).c(cls);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((AtomicReference) obj).set(cls.getComponentType());
                break;
        }
    }

    @Override // defpackage.rp
    public void q(GenericArrayType genericArrayType) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 1:
                o(genericArrayType.getGenericComponentType());
                break;
            case 2:
                Class<? super Object> rawType = TypeToken.of(genericArrayType.getGenericComponentType()).getRawType();
                c32 c32Var = b15.a;
                ((ix1) obj).c(Array.newInstance(rawType, 0).getClass());
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((AtomicReference) obj).set(genericArrayType.getGenericComponentType());
                break;
        }
    }

    @Override // defpackage.rp
    public void r(ParameterizedType parameterizedType) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                rr2.w(typeParameters.length == actualTypeArguments.length);
                for (int i2 = 0; i2 < typeParameters.length; i2++) {
                    pz4 pz4Var = new pz4(typeParameters[i2]);
                    Type type = actualTypeArguments[i2];
                    HashMap map = (HashMap) obj;
                    if (!map.containsKey(pz4Var)) {
                        Type type2 = type;
                        while (true) {
                            if (type2 == null) {
                                map.put(pz4Var, type);
                            }
                            boolean z = type2 instanceof TypeVariable;
                            pz4 pz4Var2 = null;
                            if (z ? pz4Var.a((TypeVariable) type2) : false) {
                                while (type != null) {
                                    type = (Type) map.remove(type instanceof TypeVariable ? new pz4((TypeVariable) type) : null);
                                }
                            } else {
                                if (z) {
                                    pz4Var2 = new pz4((TypeVariable) type2);
                                }
                                type2 = (Type) map.get(pz4Var2);
                            }
                            break;
                            break;
                        }
                    }
                }
                o(cls);
                o(parameterizedType.getOwnerType());
                break;
            case 1:
                o(parameterizedType.getActualTypeArguments());
                o(parameterizedType.getOwnerType());
                break;
            case 2:
                ((ix1) obj).f((Class) parameterizedType.getRawType());
                break;
        }
    }

    @Override // defpackage.rp
    public final void s(TypeVariable typeVariable) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                o(typeVariable.getBounds());
                return;
            case 1:
                throw new IllegalArgumentException(((TypeToken) obj).runtimeType + "contains a type variable and is not safe for the operation");
            case 2:
                o(typeVariable.getBounds());
                return;
            default:
                ((AtomicReference) obj).set(b15.a(typeVariable.getBounds()));
                return;
        }
    }

    @Override // defpackage.rp
    public final void t(WildcardType wildcardType) {
        switch (this.b) {
            case 0:
                o(wildcardType.getUpperBounds());
                break;
            case 1:
                o(wildcardType.getLowerBounds());
                o(wildcardType.getUpperBounds());
                break;
            case 2:
                o(wildcardType.getUpperBounds());
                break;
            default:
                ((AtomicReference) this.c).set(b15.a(wildcardType.getUpperBounds()));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz4(int i, Object obj) {
        super(6);
        this.b = i;
        this.c = obj;
    }
}
