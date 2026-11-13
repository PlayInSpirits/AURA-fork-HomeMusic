package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ri implements cz4 {
    public final /* synthetic */ int n;

    public /* synthetic */ ri(int i) {
        this.n = i;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 nk1Var, TypeToken typeToken) {
        int i = 0;
        switch (this.n) {
            case 0:
                Type type = typeToken.getType();
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new si(nk1Var, nk1Var.g(TypeToken.get(genericComponentType)), gb.G(genericComponentType));
            case 1:
                if (typeToken.getRawType() == Date.class) {
                    return new dk4(2);
                }
                return null;
            case 2:
                if (typeToken.getRawType() == java.sql.Date.class) {
                    return new dk4(0);
                }
                return null;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (typeToken.getRawType() == Time.class) {
                    return new dk4(1);
                }
                return null;
            case 4:
                if (typeToken.getRawType() == Timestamp.class) {
                    return new ek4(nk1Var.g(TypeToken.get(Date.class)), i);
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new eg2(rawType);
        }
    }
}
