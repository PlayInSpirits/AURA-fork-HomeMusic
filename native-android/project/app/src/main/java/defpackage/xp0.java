package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xp0 {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final zg5 d;
    public final int e;
    public final int f;
    public final boolean g;

    public xp0(zg5 r11, ArrayList r12, int[] r13, int[] r14) {
        this.a = r12;
        this.b = r13;
        this.c = r14;
        Arrays.fill(r13, 0);
        Arrays.fill(r14, 0);
        this.d = r11;
        int r1 = r11.u();
        this.e = r1;
        int r2 = r11.t();
        this.f = r2;
        this.g = true;
        if (r12.isEmpty() == false) goto L5;
        wp0 r4 = null;
    L6:
        if (r4 != null) goto L8;
    L11:
        r12.add(0, new wp0(0, 0, 0));
    L12:
        r12.add(new wp0(r1, r2, 0));
        int r3 = r12.size();
        int r5 = 0;
    L13:
        if (r5 >= r3) goto L23;
        Object r6 = r12.get(r5);
        r5 = r5 + 1;
        wp0 r7 = (wp0) r6;
        int r8 = 0;
    L16:
        if (r8 >= r7.c) goto L13;
        int r9 = r7.a + r8;
        int r10 = r7.b + r8;
        if (r11.l(r9, r10) == false) goto L20;
        int r15 = 1;
    L21:
        r13[r9] = (r10 << 4) | r15;
        r14[r10] = (r9 << 4) | r15;
        r8 = r8 + 1;
        goto L16
    L20:
        r15 = 2;
        goto L21
    L23:
        if (this.g == false) goto L49;
        int r16 = r12.size();
        int r17 = 0;
        int r18 = 0;
    L25:
        if (r18 >= r16) goto L63;
        Object r19 = r12.get(r18);
        r18 = r18 + 1;
        wp0 r20 = (wp0) r19;
    L27:
        int r21 = r20.a;
        if (r17 >= r21) goto L48;
        if (r13[r17] != 0) goto L47;
        int r22 = r12.size();
        int r23 = 0;
        int r24 = 0;
    L32:
        if (r23 >= r22) goto L47;
        wp0 r25 = (wp0) r12.get(r23);
    L34:
        int r26 = r25.b;
        if (r24 >= r26) goto L46;
        if (r14[r24] != 0) goto L45;
        if (r11.m(r17, r24) == false) goto L45;
        if (r11.l(r17, r24) == false) goto L43;
        int r27 = 8;
    L44:
        r13[r17] = (r24 << 4) | r27;
        r14[r24] = r27 | (r17 << 4);
        goto L47
    L43:
        r27 = 4;
    L45:
        r24 = r24 + 1;
        goto L34
    L46:
        r24 = r25.c + r26;
        r23 = r23 + 1;
    L47:
        r17 = r17 + 1;
        goto L27
    L48:
        r17 = r20.c + r21;
        goto L25
    L63:
        return;
    L49:
        return;
    L8:
        if (r4.a != 0) goto L11;
        if (r4.b == 0) goto L12;
    L5:
        r4 = (wp0) r12.get(0);
        goto L6
    }

    public static yp0 a(ArrayDeque r2, int r3, boolean r4) {
        Iterator r5 = r2.iterator();
    L4:
        if (r5.hasNext() == false) goto L10;
        yp0 r0 = (yp0) r5.next();
        if (r0.a != r3) goto L4;
        if (r0.c != r4) goto L4;
        r5.remove();
    L12:
        if (r5.hasNext() == false) goto L17;
        yp0 r6 = (yp0) r5.next();
        if (r4 == true) goto L15;
        r6.b++;
        goto L12
    L15:
        r6.b--;
        goto L12
    L17:
        return r0;
    L10:
        r0 = null;
        goto L12
    }
}
