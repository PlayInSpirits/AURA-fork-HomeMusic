package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg2 extends wr1 {
    public static Object V(Object r2, HashMap r3) {
        r3.getClass();
        Object r0 = r3.get(r2);
        if (r0 == null) goto L5;
    L9:
        return r0;
    L5:
        if (r3.containsKey(r2) == true) goto L9;
        throw new NoSuchElementException("Key " + r2 + " is missing in the map.");
    }

    public static int W(int r1) {
        if (r1 >= 0) goto L5;
        return r1;
    L5:
        if (r1 >= 3) goto L9;
        return r1 + 1;
    L9:
        if (r1 < 1073741824) goto L11;
        return Integer.MAX_VALUE;
    L11:
        return (int) ((r1 / 0.75f) + 1.0f);
    }

    public static Map X(kd3... r2) {
        if (r2.length <= 0) goto L7;
        LinkedHashMap r0 = new LinkedHashMap(W(r2.length));
        Y(r0, r2);
        return r0;
    L7:
        return v01.n;
    }

    public static final void Y(HashMap r4, kd3[] r5) {
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        kd3 r2 = r5[r1];
        r4.put(r2.n, r2.o);
        r1 = r1 + 1;
        goto L3
    }

    public static Map Z(ArrayList r5) {
        int r0 = r5.size();
        if (r0 == 0) goto L13;
        int r1 = 0;
        if (r0 == 1) goto L10;
        LinkedHashMap r2 = new LinkedHashMap(W(r5.size()));
        int r3 = r5.size();
    L7:
        if (r1 >= r3) goto L9;
        Object r4 = r5.get(r1);
        r1 = r1 + 1;
        kd3 r6 = (kd3) r4;
        r2.put(r6.n, r6.o);
        goto L7
    L9:
        return r2;
    L10:
        kd3 r7 = (kd3) r5.get(0);
        r7.getClass();
        Map r8 = Collections.singletonMap(r7.n, r7.o);
        r8.getClass();
        return r8;
    L13:
        return v01.n;
    }

    public static Map a0(Map r2) {
        r2.getClass();
        int r0 = r2.size();
        if (r0 == 0) goto L11;
        if (r0 != 1) goto L7;
        Map.Entry r3 = (Map.Entry) r2.entrySet().iterator().next();
        Map r4 = Collections.singletonMap(r3.getKey(), r3.getValue());
        r4.getClass();
        return r4;
    L7:
        return new LinkedHashMap(r2);
    L11:
        return v01.n;
    }
}
