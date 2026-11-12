package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dq3 {
    public static final Map a = null;
    public static final Map b = null;

    static {
        LinkedHashMap r0 = new LinkedHashMap(16);
        LinkedHashMap r2 = new LinkedHashMap(16);
        Class r1 = Boolean.TYPE;
        r0.put(r1, Boolean.class);
        r2.put(Boolean.class, r1);
        Class r3 = Byte.TYPE;
        r0.put(r3, Byte.class);
        r2.put(Byte.class, r3);
        Class r4 = Character.TYPE;
        r0.put(r4, Character.class);
        r2.put(Character.class, r4);
        Class r5 = Double.TYPE;
        r0.put(r5, Double.class);
        r2.put(Double.class, r5);
        Class r6 = Float.TYPE;
        r0.put(r6, Float.class);
        r2.put(Float.class, r6);
        Class r7 = Integer.TYPE;
        r0.put(r7, Integer.class);
        r2.put(Integer.class, r7);
        Class r8 = Long.TYPE;
        r0.put(r8, Long.class);
        r2.put(Long.class, r8);
        Class r9 = Short.TYPE;
        r0.put(r9, Short.class);
        r2.put(Short.class, r9);
        Class r10 = Void.TYPE;
        r0.put(r10, Void.class);
        r2.put(Void.class, r10);
        a = Collections.unmodifiableMap(r0);
        b = Collections.unmodifiableMap(r2);
    }
}
