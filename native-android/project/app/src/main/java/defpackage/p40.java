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

    public /* synthetic */ p40(mf4 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    public static bz4 b(mf4 r6, nk1 r7, TypeToken r8, e32 r9) {
        Object r10 = r6.e(TypeToken.get(r9.value())).A();
        boolean r5 = r9.nullSafe();
        if ((r10 instanceof bz4) == false) goto L6;
        bz4 r11 = (bz4) r10;
    L11:
        if (r11 == null) goto L15;
        if (r5 == false) goto L15;
        return new ek4(r11, 3);
    L15:
        return r11;
    L6:
        if ((r10 instanceof cz4) == false) goto L9;
        r11 = ((cz4) r10).a(r7, r8);
        goto L11
    L9:
        if ((r10 instanceof g32) == false) goto L17;
        vx4 r0 = new vx4((g32) r10, r7, r8, null, r5);
        r5 = false;
        r11 = r0;
        goto L11
    L17:
        throw new IllegalArgumentException("Invalid attempt to bind an instance of " + r10.getClass().getName() + " as a @JsonAdapter for " + r8.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 r13, TypeToken r14) {
        int r3 = this.n;
        Type r4 = Object.class;
        mf4 r5 = this.o;
        switch(r3) {
            case 0: goto L31;
            case 1: goto L26;
            default: goto L4;
        };
    L4:
        Type r6 = r14.getType();
        Class r8 = r14.getRawType();
        if (Map.class.isAssignableFrom(r8) == true) goto L8;
        return null;
    L8:
        if (r6 != Properties.class) goto L11;
        Type[] r7 = {String.class, String.class};
    L17:
        Type r9 = r7[0];
        if (r9 != Boolean.TYPE) goto L20;
    L23:
        bz4 r10 = hz4.c;
    L24:
        bz4 r11 = r13.g(TypeToken.get(r7[1]));
        o73 r12 = r5.e(r14);
        Type[] r15 = r7;
        return new eg2(this, r13, r15[0], r10, r15[1], r11, r12);
    L20:
        if (r9 == Boolean.class) goto L23;
        r10 = r13.g(TypeToken.get(r9));
        goto L24
    L11:
        if ((r6 instanceof WildcardType) == false) goto L13;
        r6 = ((WildcardType) r6).getUpperBounds()[0];
    L13:
        vr1.d(Map.class.isAssignableFrom(r8));
        Type r16 = gb.Y(r6, r8, gb.A(r6, r8, Map.class), new HashMap());
        if ((r16 instanceof ParameterizedType) == false) goto L16;
        r7 = ((ParameterizedType) r16).getActualTypeArguments();
        goto L17
    L16:
        r7 = new Type[]{r4, r4};
        goto L17
    L26:
        e32 r1 = (e32) r14.getRawType().getAnnotation(e32.class);
        if (r1 != null) goto L30;
        return null;
    L30:
        return b(r5, r13, r14, r1);
    L31:
        Type r2 = r14.getType();
        Class r17 = r14.getRawType();
        if (Collection.class.isAssignableFrom(r17) == true) goto L35;
        return null;
    L35:
        if ((r2 instanceof WildcardType) == false) goto L37;
        r2 = ((WildcardType) r2).getUpperBounds()[0];
    L37:
        vr1.d(Collection.class.isAssignableFrom(r17));
        Type r18 = gb.Y(r2, r17, gb.A(r2, r17, Collection.class), new HashMap());
        if ((r18 instanceof ParameterizedType) == false) goto L41;
        r4 = ((ParameterizedType) r18).getActualTypeArguments()[0];
    L41:
        return new si(r13, r4, r13.g(TypeToken.get(r4)), r5.e(r14));
    }
}
