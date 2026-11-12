package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y44 implements x44 {
    public final if1 n;
    public final w03 o;
    public w03 p;

    public y44(Map r3, if1 r4) {
        this.n = r4;
        if (r3 != null) goto L5;
    L11:
        w03 r5 = null;
    L12:
        this.o = r5;
        return;
    L5:
        if (r3.isEmpty() == true) goto L11;
        r5 = new w03(r3.size());
        Iterator r6 = r3.entrySet().iterator();
    L9:
        if (r6.hasNext() == false) goto L12;
        Map.Entry r0 = (Map.Entry) r6.next();
        r5.l(r0.getKey(), r0.getValue());
        goto L9
    }

    @Override // defpackage.x44
    public final c12 a(String r4, gf1 r5) {
        int r0 = r4.length();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L15;
        if (ya4.y(r4.charAt(r1)) == false) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        w03 r2 = this.p;
        if (r2 != null) goto L9;
        long[] r3 = v54.a;
        r2 = new w03();
        this.p = r2;
    L9:
        Object r6 = r2.g(r4);
        if (r6 != null) goto L12;
        r6 = new ArrayList();
        r2.l(r4, r6);
    L12:
        ((List) r6).add(r5);
        return new c12(r2, r4, r5, 9);
    L15:
        kf2.n("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.x44
    public final boolean b(Object r1) {
        return ((Boolean) this.n.invoke(r1)).booleanValue();
    }

    @Override // defpackage.x44
    public final Map c() {
        w03 r1 = this.o;
        if (r1 == null) goto L5;
    L8:
        int r2 = 0;
        if (r1 == null) goto L11;
        int r3 = r1.e;
    L12:
        w03 r4 = this.p;
        if (r4 == null) goto L15;
        int r5 = r4.e;
    L16:
        HashMap r6 = new HashMap(r3 + r5);
        char r7 = 7;
        long r9 = -9187201950435737472L;
        int r11 = 8;
        if (r1 == null) goto L36;
        Object[] r12 = r1.b;
        Object[] r13 = r1.c;
        long[] r8 = r1.a;
        int r14 = r8.length - 2;
        if (r14 < 0) goto L36;
        int r15 = 0;
        long r16 = 128;
    L21:
        long r10 = r8[r15];
        long r18 = 255;
        if (((((~r10) << r7) & r10) & r9) == r9) goto L33;
        int r17 = 8 - ((~(r15 - r14)) >>> 31);
        int r19 = 0;
    L24:
        if (r19 >= r17) goto L30;
        if ((r10 & 255) >= 128) goto L29;
        int r20 = (r15 << 3) + r19;
        r6.put((String) r12[r20], (List) r13[r20]);
    L29:
        r10 = r10 >> 8;
        r19 = r19 + 1;
        r7 = r7;
        r9 = r9;
        goto L24
    L30:
        char r22 = r7;
        long r23 = r9;
        if (r17 != 8) goto L37;
    L34:
        if (r15 == r14) goto L37;
        r15 = r15 + 1;
        r7 = r22;
        r9 = r23;
    L37:
        w03 r21 = this.p;
        if (r21 == null) goto L77;
        Object[] r24 = r21.b;
        Object[] r25 = r21.c;
        long[] r26 = r21.a;
        int r27 = r26.length - 2;
        if (r27 < 0) goto L77;
        int r28 = 0;
    L42:
        long r29 = r26[r28];
        if (((((~r29) << r22) & r29) & r23) == r23) goto L74;
        int r110 = 8 - ((~(r28 - r27)) >>> 31);
        int r111 = r2;
    L45:
        if (r111 >= r110) goto L71;
        if ((r29 & r18) >= r16) goto L69;
        int r112 = (r28 << 3) + r111;
        Object r113 = r24[r112];
        List r114 = (List) r25[r112];
        String r115 = (String) r113;
        int r210 = r11;
        if (r114.size() != 1) goto L58;
        Object r116 = ((gf1) r114.get(r2)).invoke();
        if (r116 != null) goto L53;
    L55:
        long[] r211 = r26;
    L70:
        r29 = r29 >> r210;
        r111 = r111 + 1;
        r11 = r210;
        r26 = r211;
        r2 = 0;
        goto L45
    L53:
        if (b(r116) == false) goto L56;
        r6.put(r115, gb.d(new Object[]{r116}));
        goto L55
    L56:
        nz2.f(gh0.o(r116));
        return null;
    L58:
        int r117 = r114.size();
        ArrayList r118 = new ArrayList(r117);
    L59:
        if (r2 >= r117) goto L68;
        long[] r212 = r26;
        Object r30 = ((gf1) r114.get(r2)).invoke();
        if (r30 == null) goto L67;
        if (b(r30) == true) goto L67;
        nz2.f(gh0.o(r30));
        return null;
    L67:
        r118.add(r30);
        r2 = r2 + 1;
        r26 = r212;
        goto L59
    L68:
        r211 = r26;
        r6.put(r115, r118);
        goto L70
    L69:
        r211 = r26;
        r210 = r11;
        goto L70
    L71:
        long[] r213 = r26;
        int r31 = r11;
        if (r110 != r31) goto L77;
    L75:
        if (r28 == r27) goto L77;
        r28 = r28 + 1;
        r11 = r31;
        r26 = r213;
        r2 = 0;
        goto L42
    L74:
        r213 = r26;
        r31 = r11;
    L77:
        return r6;
    L33:
        r22 = r7;
        r23 = r9;
    L36:
        r22 = 7;
        r23 = -9187201950435737472L;
        r16 = 128;
        r18 = 255;
        goto L37
    L15:
        r5 = 0;
        goto L16
    L11:
        r3 = 0;
        goto L12
    L5:
        if (this.p != null) goto L8;
        return v01.n;
    }

    @Override // defpackage.x44
    public final Object d(String r6) {
        w03 r5 = this.o;
        if (r5 == null) goto L5;
        List r1 = (List) r5.j(r6);
    L6:
        if (r1 != null) goto L8;
    L19:
        return null;
    L8:
        if (r1.isEmpty() == true) goto L19;
        if (r1.size() <= 1) goto L18;
        if (r5 == null) goto L18;
        List r0 = r1.subList(1, r1.size());
        int r2 = r5.f(r6);
        if (r2 >= 0) goto L16;
        r2 = ~r2;
    L16:
        Object[] r3 = r5.c;
        Object r4 = r3[r2];
        r5.b[r2] = r6;
        r3[r2] = r0;
        List r7 = (List) r4;
    L18:
        return r1.get(0);
    L5:
        r1 = null;
        goto L6
    }
}
