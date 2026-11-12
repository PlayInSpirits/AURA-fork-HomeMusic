package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ri implements cz4 {
    public final /* synthetic */ int n;

    public /* synthetic */ ri(int r1) {
        this.n = r1;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 r4, TypeToken r5) {
        int r0 = 0;
        switch(this.n) {
            case 0: goto L29;
            case 1: goto L26;
            case 2: goto L22;
            case 3: goto L18;
            case 4: goto L14;
            default: goto L4;
        };
    L4:
        Class r3 = r5.getRawType();
        if (Enum.class.isAssignableFrom(r3) == false) goto L41;
        if (r3 != Enum.class) goto L9;
        return null;
    L9:
        if (r3.isEnum() == true) goto L12;
        r3 = r3.getSuperclass();
    L12:
        return new eg2(r3);
    L41:
        return null;
    L29:
        Type r6 = r5.getType();
        boolean r7 = r6 instanceof GenericArrayType;
        if (r7 == false) goto L32;
    L36:
        if (r7 == false) goto L38;
        Type r8 = ((GenericArrayType) r6).getGenericComponentType();
    L40:
        return new si(r4, r4.g(TypeToken.get(r8)), gb.G(r8));
    L38:
        r8 = ((Class) r6).getComponentType();
        goto L40
    L32:
        if ((r6 instanceof Class) == true) goto L34;
        return null;
    L34:
        if (((Class) r6).isArray() == true) goto L36;
        return null;
    L14:
        if (r5.getRawType() == Timestamp.class) goto L16;
        return null;
    L16:
        return new ek4(r4.g(TypeToken.get(Date.class)), r0);
    L18:
        if (r5.getRawType() == Time.class) goto L20;
        return null;
    L20:
        return new dk4(1);
    L22:
        if (r5.getRawType() == java.sql.Date.class) goto L24;
        return null;
    L24:
        return new dk4(0);
    L26:
        if (r5.getRawType() == Date.class) goto L28;
        return null;
    L28:
        return new dk4(2);
    }
}
