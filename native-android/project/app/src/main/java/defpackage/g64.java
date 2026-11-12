package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g64 extends rp {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable u(int r4, be3 r5) {
        if (r4 == 0) goto L43;
        boolean r0 = false;
        int r1 = 0;
        if (r4 == 1) goto L38;
        if (r4 == 2) goto L36;
        if (r4 != 3) goto L10;
        HashMap r6 = new HashMap();
    L29:
        String r2 = w(r5);
        int r3 = r5.A();
        if (r3 == 9) goto L31;
        Serializable r7 = u(r3, r5);
        if (r7 == null) goto L29;
        r6.put(r2, r7);
        goto L29
    L31:
        return r6;
    L10:
        if (r4 == 8) goto L27;
        if (r4 != 10) goto L14;
        int r8 = r5.E();
        ArrayList r9 = new ArrayList(r8);
    L20:
        if (r1 >= r8) goto L25;
        Serializable r10 = u(r5.A(), r5);
        if (r10 == null) goto L24;
        r9.add(r10);
    L24:
        r1 = r1 + 1;
        goto L20
    L25:
        return r9;
    L14:
        if (r4 == 11) goto L17;
        return null;
    L17:
        Date r11 = new Date((long) Double.longBitsToDouble(r5.u()));
        r5.O(2);
        return r11;
    L27:
        return v(r5);
    L36:
        return w(r5);
    L38:
        if (r5.A() != 1) goto L41;
        r0 = true;
    L41:
        return Boolean.valueOf(r0);
    L43:
        return Double.valueOf(Double.longBitsToDouble(r5.u()));
    }

    public static HashMap v(be3 r5) {
        int r0 = r5.E();
        HashMap r1 = new HashMap(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        String r3 = w(r5);
        Serializable r4 = u(r5.A(), r5);
        if (r4 == null) goto L7;
        r1.put(r3, r4);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r1;
    }

    public static String w(be3 r3) {
        int r0 = r3.H();
        int r1 = r3.b;
        r3.O(r0);
        return new String(r3.a, r1, r0);
    }
}
