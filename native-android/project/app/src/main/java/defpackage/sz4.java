package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sz4 {
    public final oz4 a;

    public sz4() {
        this.a = new oz4(0);
    }

    public static void a(HashMap r1, Type r2, Type r3) {
        if (r2.equals(r3) == false) goto L5;
        return;
    L5:
        new lz4(r1, r3).o(new Type[]{r2});
    }

    public final Type b(Type r3) {
        r3.getClass();
        if ((r3 instanceof TypeVariable) == false) goto L7;
        TypeVariable r4 = (TypeVariable) r3;
        oz4 r2 = this.a;
        r2.getClass();
        return r2.a(r4, new nz4(r4, r2));
    L7:
        if ((r3 instanceof ParameterizedType) == false) goto L15;
        ParameterizedType r5 = (ParameterizedType) r3;
        Type r0 = r5.getOwnerType();
        if (r0 != null) goto L11;
        Type r1 = null;
    L12:
        Type r6 = b(r5.getRawType());
        Class r7 = (Class) r6;
        return b15.f(r1, r7, c(r5.getActualTypeArguments()));
    L11:
        r1 = b(r0);
        goto L12
    L15:
        if ((r3 instanceof GenericArrayType) == false) goto L19;
        return b15.d(b(((GenericArrayType) r3).getGenericComponentType()));
    L19:
        if ((r3 instanceof WildcardType) == false) goto L22;
        WildcardType r8 = (WildcardType) r3;
        Type[] r9 = r8.getLowerBounds();
        Type[] r10 = r8.getUpperBounds();
        return new c(c(r9), c(r10), 1);
    L22:
        return r3;
    }

    public final Type[] c(Type[] r4) {
        Type[] r0 = new Type[r4.length];
        int r1 = 0;
    L4:
        if (r1 >= r4.length) goto L6;
        r0[r1] = b(r4[r1]);
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    public sz4(oz4 r1) {
        this.a = r1;
    }
}
