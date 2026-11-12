package defpackage;

import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sx3 extends qx3 {
    public static final HashMap e = null;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap r0 = new HashMap();
        r0.put(Byte.TYPE, (byte) 0);
        r0.put(Short.TYPE, (short) 0);
        r0.put(Integer.TYPE, 0);
        r0.put(Long.TYPE, 0L);
        Float r2 = Float.valueOf(0.0f);
        r0.put(Float.TYPE, r2);
        Double r3 = Double.valueOf(0.0d);
        r0.put(Double.TYPE, r3);
        r0.put(Character.TYPE, (char) 0);
        r0.put(Boolean.TYPE, Boolean.FALSE);
        e = r0;
    }

    public sx3(Class r5, LinkedHashMap r6) {
        super(r6);
        this.d = new HashMap();
        hw r7 = ox3.a;
        Constructor r0 = r7.i(r5);
        this.b = r0;
        ox3.e(r0);
        String[] r8 = r7.m(r5);
        int r9 = 0;
        int r1 = 0;
    L4:
        if (r1 >= r8.length) goto L6;
        this.d.put(r8[r1], Integer.valueOf(r1));
        r1 = r1 + 1;
        goto L4
    L6:
        Class<?>[] r10 = this.b.getParameterTypes();
        this.c = new Object[r10.length];
    L8:
        if (r9 >= r10.length) goto L10;
        this.c[r9] = e.get(r10[r9]);
        r9 = r9 + 1;
        goto L8
    }

    @Override // defpackage.qx3
    public final Object c() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.qx3
    public final Object d(Object r6) {
        Object[] r7 = (Object[]) r6;
        Constructor r5 = this.b;
        return r5.newInstance(r7);
    L13:
        e = move-exception;
        hw r8 = ox3.a;
        nz2.s("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        return null;
    L8:
        e = e;
    L12:
        throw new RuntimeException("Failed to invoke constructor '" + ox3.b(r5) + "' with args " + Arrays.toString(r7), e);
    L10:
        e = e;
    L5:
        e = move-exception;
        nz2.s("Failed to invoke constructor '" + ox3.b(r5) + "' with args " + Arrays.toString(r7), e.getCause());
        return null;
    }

    @Override // defpackage.qx3
    public final void e(Object r3, l32 r4, px3 r5) {
        Object[] r6 = (Object[]) r3;
        String r0 = r5.c;
        Integer r1 = (Integer) this.d.get(r0);
        if (r1 == null) goto L13;
        int r2 = r1.intValue();
        Object r7 = r5.h.a(r4);
        if (r7 == null) goto L7;
    L11:
        r6[r2] = r7;
        return;
    L7:
        if (r5.k == false) goto L11;
        StringBuilder r8 = xa3.j("null is not allowed as value for record component '", r0, "' of primitive type; at path ");
        r8.append(r4.v());
        throw new JsonParseException(r8.toString());
    L13:
        tb4.j("Could not find the index in the constructor '", ox3.b(this.b), "' for field with name '", r0, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
