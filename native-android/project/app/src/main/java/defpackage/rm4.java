package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rm4 extends si0 {
    public static String b0(String r3) {
        return fa4.d0(new tq4(new w40(2, r3), new rs0(19, "    "), 1), "\n", null, 62);
    }

    public static String c0(String r11) {
        List r0 = qm4.w0(r11);
        ArrayList r1 = new ArrayList();
        Iterator r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        Object r3 = r2.next();
        if (qm4.u0((String) r3) == true) goto L4;
        r1.add(r3);
        goto L4
    L8:
        ArrayList r4 = new ArrayList(r40.k0(r1, 10));
        int r5 = r1.size();
        int r6 = 0;
        int r7 = 0;
    L9:
        if (r7 >= r5) goto L21;
        Object r8 = r1.get(r7);
        r7 = r7 + 1;
        String r9 = (String) r8;
        int r10 = r9.length();
        int r12 = 0;
    L12:
        if (r12 >= r10) goto L17;
        if (ya4.y(r9.charAt(r12)) == false) goto L18;
        r12 = r12 + 1;
    L18:
        if (r12 != (-1)) goto L20;
        r12 = r9.length();
    L20:
        r4.add(Integer.valueOf(r12));
        goto L9
    L17:
        r12 = -1;
        goto L18
    L21:
        Iterator r13 = r4.iterator();
        if (r13.hasNext() == true) goto L24;
        Comparable r14 = null;
    L30:
        Integer r15 = (Integer) r14;
        if (r15 == null) goto L33;
        int r16 = r15.intValue();
    L34:
        int r17 = r11.length();
        r0.size();
        int r18 = r0.size() - 1;
        ArrayList r19 = new ArrayList();
        Iterator r20 = r0.iterator();
    L36:
        if (r20.hasNext() == false) goto L59;
        Object r21 = r20.next();
        int r22 = r6 + 1;
        if (r6 < 0) goto L57;
        String r23 = (String) r21;
        if (r6 == 0) goto L43;
        if (r6 == r18) goto L43;
    L45:
        r23.getClass();
        if (r16 < 0) goto L55;
        int r24 = r23.length();
        if (r16 > r24) goto L51;
        r24 = r16;
    L51:
        String r25 = r23.substring(r24);
    L52:
        if (r25 == null) goto L54;
        r19.add(r25);
    L54:
        r6 = r22;
        goto L36
    L55:
        kf2.e(b11.j(r16, "Requested character count ", " is less than zero."));
        return null;
    L43:
        if (qm4.u0(r23) == false) goto L45;
        r25 = null;
        goto L52
    L57:
        gb.c0();
        throw null;
    L59:
        StringBuilder r26 = new StringBuilder(r17);
        q40.A0(r19, r26);
        return r26.toString();
    L33:
        r16 = 0;
        goto L34
    L24:
        r14 = (Comparable) r13.next();
    L26:
        if (r13.hasNext() == false) goto L30;
        Comparable r27 = (Comparable) r13.next();
        if (r14.compareTo(r27) <= 0) goto L26;
        r14 = r27;
        goto L26
    }

    public static String d0(String r12) {
        if (qm4.u0("|") == true) goto L37;
        List r1 = qm4.w0(r12);
        int r13 = r12.length();
        r1.size();
        int r3 = r1.size() - 1;
        ArrayList r4 = new ArrayList();
        Iterator r2 = r1.iterator();
        int r6 = 0;
    L6:
        if (r2.hasNext() == false) goto L35;
        Object r7 = r2.next();
        int r8 = r6 + 1;
        if (r6 < 0) goto L33;
        String r9 = (String) r7;
        if (r6 == 0) goto L13;
        if (r6 == r3) goto L13;
    L15:
        int r10 = r9.length();
        int r11 = 0;
    L17:
        if (r11 >= r10) goto L22;
        if (ya4.y(r9.charAt(r11)) == false) goto L23;
        r11 = r11 + 1;
    L23:
        if (r11 != (-1)) goto L26;
    L24:
        String r14 = null;
    L28:
        if (r14 == null) goto L30;
        r9 = r14;
    L30:
        if (r9 == null) goto L32;
        r4.add(r9);
    L32:
        r6 = r8;
        goto L6
    L26:
        if (xm4.j0(r9, r11, "|", false) == false) goto L24;
        r14 = r9.substring("|".length() + r11);
        goto L28
    L22:
        r11 = -1;
    L13:
        if (qm4.u0(r9) == false) goto L15;
        r9 = null;
        goto L30
    L33:
        gb.c0();
        throw null;
    L35:
        StringBuilder r0 = new StringBuilder(r13);
        q40.A0(r4, r0);
        return r0.toString();
    L37:
        kf2.n("marginPrefix must be non-blank string.");
        return null;
    }
}
