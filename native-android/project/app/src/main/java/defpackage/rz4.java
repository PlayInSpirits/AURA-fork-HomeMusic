package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class rz4 {
    public static final rz4 b = null;
    public final AtomicInteger a;

    static {
        b = new rz4(new AtomicInteger());
    }

    public rz4(AtomicInteger r1) {
        this.a = r1;
    }

    public final Type a(Type r7) {
        r7.getClass();
        if ((r7 instanceof Class) == false) goto L6;
        return r7;
    L6:
        if ((r7 instanceof TypeVariable) == false) goto L8;
        return r7;
    L8:
        boolean r0 = r7 instanceof GenericArrayType;
        AtomicInteger r1 = this.a;
        if (r0 == false) goto L13;
        return b15.d(new rz4(r1).a(((GenericArrayType) r7).getGenericComponentType()));
    L13:
        if ((r7 instanceof ParameterizedType) == false) goto L25;
        ParameterizedType r8 = (ParameterizedType) r7;
        Class r6 = (Class) r8.getRawType();
        TypeVariable[] r2 = r6.getTypeParameters();
        Type[] r3 = r8.getActualTypeArguments();
        int r4 = 0;
    L16:
        if (r4 >= r3.length) goto L18;
        r3[r4] = new qz4(r1, r2[r4]).a(r3[r4]);
        r4 = r4 + 1;
        goto L16
    L18:
        rz4 r5 = new rz4(r1);
        Type r9 = r8.getOwnerType();
        if (r9 != null) goto L21;
        Type r10 = null;
    L23:
        return b15.f(r10, r6, r3);
    L21:
        r10 = r5.a(r9);
        goto L23
    L25:
        if ((r7 instanceof WildcardType) == false) goto L32;
        WildcardType r11 = (WildcardType) r7;
        if (r11.getLowerBounds().length == 0) goto L29;
        return r7;
    L29:
        return b(r11.getUpperBounds());
    L32:
        throw new AssertionError("must have been one of the known types");
    }

    public TypeVariable b(Type[] r3) {
        return b15.e(rz4.class, "capture#" + this.a.incrementAndGet() + "-of ? extends " + new uc0(String.valueOf('&')).b(Arrays.asList(r3)), r3);
    }
}
