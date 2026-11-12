package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nh0 {
    public final LinkedHashMap a;

    public nh0(int r1) {
        switch(r1) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.a = new LinkedHashMap();
        return;
    L5:
        this.a = new LinkedHashMap();
    }

    public void a(HashMap r8) {
        r8.getClass();
        Iterator r9 = r8.entrySet().iterator();
    L4:
        if (r9.hasNext() == false) goto L95;
        Map.Entry r0 = (Map.Entry) r9.next();
        String r1 = (String) r0.getKey();
        Object r2 = r0.getValue();
        r1.getClass();
        if (r2 != null) goto L8;
        r2 = null;
    L81:
        this.a.put(r1, r2);
        goto L4
    L8:
        i30 r3 = kx3.a(r2.getClass());
        boolean r4 = true;
        if (r3.equals(kx3.a(Boolean.TYPE)) == false) goto L11;
        boolean r5 = true;
    L12:
        if (r5 == false) goto L14;
        boolean r6 = true;
    L15:
        if (r6 == false) goto L17;
        boolean r7 = true;
    L18:
        if (r7 == false) goto L20;
        boolean r10 = true;
    L21:
        if (r10 == false) goto L23;
        boolean r11 = true;
    L24:
        if (r11 == false) goto L26;
        boolean r12 = true;
    L27:
        if (r12 == false) goto L29;
        boolean r13 = true;
    L30:
        if (r13 == false) goto L32;
        boolean r14 = true;
    L33:
        if (r14 == false) goto L35;
        boolean r15 = true;
    L36:
        if (r15 == false) goto L38;
        boolean r16 = true;
    L39:
        if (r16 == false) goto L41;
        boolean r17 = true;
    L42:
        if (r17 == false) goto L44;
        boolean r18 = true;
    L45:
        if (r18 == true) goto L48;
        r4 = r3.equals(kx3.a(String[].class));
    L48:
        if (r4 == true) goto L81;
        int r19 = 0;
        if (r3.equals(kx3.a(boolean[].class)) == false) goto L57;
        boolean[] r20 = (boolean[]) r2;
        String r21 = ki0.a;
        int r22 = r20.length;
        Object[] r23 = new Boolean[r22];
    L53:
        if (r19 >= r22) goto L55;
        r23[r19] = Boolean.valueOf(r20[r19]);
        r19 = r19 + 1;
    L55:
        r2 = r23;
        goto L81
    L57:
        if (r3.equals(kx3.a(byte[].class)) == false) goto L62;
        byte[] r24 = (byte[]) r2;
        String r25 = ki0.a;
        int r26 = r24.length;
        r23 = new Byte[r26];
    L59:
        if (r19 >= r26) goto L55;
        r23[r19] = Byte.valueOf(r24[r19]);
        r19 = r19 + 1;
        goto L59
    L62:
        if (r3.equals(kx3.a(int[].class)) == false) goto L67;
        int[] r27 = (int[]) r2;
        String r28 = ki0.a;
        int r29 = r27.length;
        r23 = new Integer[r29];
    L64:
        if (r19 >= r29) goto L55;
        r23[r19] = Integer.valueOf(r27[r19]);
        r19 = r19 + 1;
        goto L64
    L67:
        if (r3.equals(kx3.a(long[].class)) == false) goto L72;
        long[] r30 = (long[]) r2;
        String r31 = ki0.a;
        int r32 = r30.length;
        r23 = new Long[r32];
    L69:
        if (r19 >= r32) goto L55;
        r23[r19] = Long.valueOf(r30[r19]);
        r19 = r19 + 1;
        goto L69
    L72:
        if (r3.equals(kx3.a(float[].class)) == false) goto L77;
        float[] r33 = (float[]) r2;
        String r34 = ki0.a;
        int r35 = r33.length;
        r23 = new Float[r35];
    L74:
        if (r19 >= r35) goto L55;
        r23[r19] = Float.valueOf(r33[r19]);
        r19 = r19 + 1;
        goto L74
    L77:
        if (r3.equals(kx3.a(double[].class)) == false) goto L82;
        double[] r36 = (double[]) r2;
        String r37 = ki0.a;
        int r38 = r36.length;
        r23 = new Double[r38];
    L79:
        if (r19 >= r38) goto L55;
        r23[r19] = Double.valueOf(r36[r19]);
        r19 = r19 + 1;
        goto L79
    L82:
        tb4.h("Key ", r1, " has invalid type ", r3);
        return;
    L44:
        r18 = r3.equals(kx3.a(Double[].class));
        goto L45
    L41:
        r17 = r3.equals(kx3.a(Float[].class));
        goto L42
    L38:
        r16 = r3.equals(kx3.a(Long[].class));
        goto L39
    L35:
        r15 = r3.equals(kx3.a(Integer[].class));
        goto L36
    L32:
        r14 = r3.equals(kx3.a(Byte[].class));
        goto L33
    L29:
        r13 = r3.equals(kx3.a(Boolean[].class));
        goto L30
    L26:
        r12 = r3.equals(kx3.a(String.class));
        goto L27
    L23:
        r11 = r3.equals(kx3.a(Double.TYPE));
        goto L24
    L20:
        r10 = r3.equals(kx3.a(Float.TYPE));
        goto L21
    L17:
        r7 = r3.equals(kx3.a(Long.TYPE));
        goto L18
    L14:
        r6 = r3.equals(kx3.a(Integer.TYPE));
        goto L15
    L11:
        r5 = r3.equals(kx3.a(Byte.TYPE));
        goto L12
    }

    public gl4 b(rc5 r1) {
        r1.getClass();
        return (gl4) this.a.remove(r1);
    }

    public List c(String r5) {
        r5.getClass();
        LinkedHashMap r0 = new LinkedHashMap();
        LinkedHashMap r4 = this.a;
        Iterator r1 = r4.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Map.Entry r2 = (Map.Entry) r1.next();
        if (h12.c(((rc5) r2.getKey()).a, r5) == false) goto L4;
        r0.put(r2.getKey(), r2.getValue());
        goto L4
    L8:
        Iterator r6 = r0.keySet().iterator();
    L10:
        if (r6.hasNext() == false) goto L13;
        r4.remove((rc5) r6.next());
        goto L10
    L13:
        return q40.Q0(r0.values());
    }

    public gl4 d(rc5 r2) {
        LinkedHashMap r1 = this.a;
        Object r0 = r1.get(r2);
        if (r0 != null) goto L6;
        r0 = new gl4(r2);
        r1.put(r2, r0);
    L6:
        return (gl4) r0;
    }
}
