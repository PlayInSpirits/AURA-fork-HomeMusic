package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r94 {
    public static final Comparator[] a = null;
    public static final m94 b = null;

    static {
        int r0 = 2;
        Comparator[] r1 = new Comparator[2];
        int r2 = 0;
    L3:
        if (r2 >= 2) goto L8;
        if (r2 != 0) goto L6;
        ca1 r3 = ca1.u;
    L7:
        r1[r2] = new hh2(r0, new hh2(1, r3));
        r2 = r2 + 1;
        goto L3
    L6:
        r3 = ca1.p;
        goto L7
    L8:
        a = r1;
        b = new m94(9);
    }

    public static final void a(i94 r3, ArrayList r4, x r5, x r6, i03 r7) {
        e94 r0 = r3.d;
        p94 r1 = n94.m;
        Object r2 = r0.n.g(r1);
        if (r2 != null) goto L5;
        r2 = Boolean.FALSE;
    L5:
        boolean r8 = ((Boolean) r2).booleanValue();
        if (r8 == true) goto L10;
        if (((Boolean) r6.invoke(r3)).booleanValue() == true) goto L10;
    L13:
        if (r8 == false) goto L16;
        r7.i(r3.f, b(r3, r5, r6, i94.j(7, r3)));
        return;
    L16:
        List r9 = i94.j(7, r3);
        int r10 = r9.size();
        int r11 = 0;
    L17:
        if (r11 >= r10) goto L19;
        a((i94) r9.get(r11), r4, r5, r6, r7);
        r11 = r11 + 1;
        goto L17
    L19:
        return;
    L10:
        if (((Boolean) r5.invoke(r3)).booleanValue() == false) goto L13;
        r4.add(r3);
        goto L13
    }

    public static final ArrayList b(i94 r17, x r18, x r19, List r20) {
        i03 r1 = f02.a;
        i03 r2 = new i03();
        ArrayList r3 = new ArrayList();
        int r4 = r20.size();
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L5;
        a((i94) r20.get(r5), r3, r18, r19, r2);
        r5 = r5 + 1;
        goto L3
    L5:
        int r6 = 1;
        if (r17.c.K != r62.o) goto L8;
        char r7 = 1;
    L9:
        ArrayList r8 = new ArrayList(r3.size() / 2);
        int r9 = r3.size() - 1;
        if (r9 < 0) goto L37;
        int r10 = 0;
    L12:
        i94 r11 = (i94) r3.get(r10);
        if (r10 == 0) goto L32;
        float r12 = r11.h().b;
        float r13 = r11.h().d;
        if (r12 < r13) goto L17;
        int r14 = r6;
    L18:
        int r15 = r8.size() - r6;
        if (r15 < 0) goto L32;
        int r16 = 0;
    L21:
        wv3 r110 = (wv3) ((kd3) r8.get(r16)).n;
        float r21 = r110.b;
        int r111 = r6;
        float r22 = r110.d;
        if (r21 < r22) goto L24;
        int r112 = r111;
    L25:
        if (r14 != 0) goto L30;
        if (r112 != 0) goto L30;
        if (Math.max(r12, r21) >= Math.min(r13, r22)) goto L30;
        r8.set(r16, new kd3(new wv3(Math.max(r110.a, 0.0f), Math.max(r110.b, r12), Math.min(r110.c, Float.POSITIVE_INFINITY), Math.min(r22, r13)), ((kd3) r8.get(r16)).o));
        ((List) ((kd3) r8.get(r16)).o).add(r11);
    L34:
        if (r10 == r9) goto L37;
        r10 = r10 + 1;
        r6 = r111;
    L30:
        if (r16 == r15) goto L33;
        r16 = r16 + 1;
        r6 = r111;
    L33:
        r8.add(new kd3(r11.h(), gb.Q(new i94[]{r11})));
        goto L34
    L24:
        r112 = 0;
        goto L25
    L17:
        r14 = 0;
    L32:
        r111 = r6;
    L37:
        u40.m0(r8, ca1.v);
        ArrayList r23 = new ArrayList();
        Comparator r24 = a[r7 ^ 1];
        int r25 = r8.size();
        int r26 = 0;
    L38:
        if (r26 >= r25) goto L40;
        kd3 r27 = (kd3) r8.get(r26);
        u40.m0((List) r27.o, r24);
        r23.addAll((Collection) r27.o);
        r26 = r26 + 1;
        goto L38
    L40:
        u40.m0(r23, new n7(19));
        int r28 = 0;
    L42:
        if (r28 > (r23.size() - 1)) goto L51;
        List r29 = (List) r2.b(((i94) r23.get(r28)).f);
        if (r29 != null) goto L46;
        r28 = r28 + 1;
        goto L42
    L46:
        if (((Boolean) r19.invoke(r23.get(r28))).booleanValue() == true) goto L48;
        r23.remove(r28);
    L49:
        r23.addAll(r28, r29);
        r28 = r28 + r29.size();
        goto L42
    L48:
        r28 = r28 + 1;
        goto L49
    L51:
        return r23;
    L8:
        r7 = 0;
        goto L9
    }
}
