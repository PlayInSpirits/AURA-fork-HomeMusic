package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final byte[] a = null;

    static {
        byte[] r0 = "0123456789abcdef".getBytes(w10.a);
        r0.getClass();
        a = r0;
    }

    public static final String a(tv r6, long r7) {
        if (r7 <= 0) goto L8;
        long r3 = r7 - 1;
        if (r6.q(r3) != 13) goto L8;
        String r8 = r6.K(r3, w10.a);
        r6.skip(2);
        return r8;
    L8:
        String r9 = r6.K(r7, w10.a);
        r6.skip(1);
        return r9;
    }

    public static final int b(tv r16, cb3 r17, boolean r18) {
        r17.getClass();
        t84 r0 = r16.n;
        if (r0 != null) goto L7;
        if (r18 == true) goto L58;
        return -1;
    L58:
        return -2;
    L7:
        byte[] r2 = r0.a;
        int r3 = r0.b;
        int r4 = r0.c;
        int[] r5 = r17.o;
        t84 r8 = r0;
        int r9 = -1;
        int r7 = 0;
    L8:
        int r10 = r7 + 1;
        int r11 = r5[r7];
        int r12 = r7 + 2;
        int r13 = r5[r10];
        if (r13 == (-1)) goto L11;
        r9 = r13;
    L11:
        if (r8 == null) goto L27;
        if (r11 >= 0) goto L35;
        int r14 = (r11 * (-1)) + r12;
    L16:
        int r15 = r3 + 1;
        int r19 = r12 + 1;
        if ((r2[r3] & 255) != r5[r12]) goto L37;
        if (r19 != r14) goto L21;
        boolean r6 = true;
    L22:
        if (r15 != r4) goto L31;
        r8.getClass();
        t84 r20 = r8.f;
        r20.getClass();
        int r21 = r20.b;
        byte[] r22 = r20.a;
        int r23 = r20.c;
        if (r20 != r0) goto L30;
        if (r6 == false) goto L27;
        r2 = r22;
        t84 r24 = null;
    L32:
        if (r6 == true) goto L33;
        r3 = r21;
        r4 = r23;
        r8 = r24;
        r12 = r19;
        goto L16
    L33:
        int r25 = r5[r19];
        int r110 = r23;
        r8 = r24;
        int r26 = r110;
    L47:
        if (r25 >= 0) goto L48;
        int r111 = r26;
        r7 = -r25;
        r3 = r21;
        r4 = r111;
        goto L8
    L48:
        return r25;
    L30:
        r24 = r20;
        r2 = r22;
        goto L32
    L31:
        r24 = r8;
        r23 = r4;
        r21 = r15;
        goto L32
    L21:
        r6 = false;
    L37:
        return r9;
    L35:
        int r112 = r3 + 1;
        int r27 = r2[r3] & 255;
        int r113 = r12 + r11;
    L36:
        if (r12 == r113) goto L37;
        if (r27 == r5[r12]) goto L40;
        r12 = r12 + 1;
        goto L36
    L40:
        r25 = r5[r12 + r11];
        if (r112 != r4) goto L46;
        r8 = r8.f;
        r8.getClass();
        int r28 = r8.b;
        byte[] r29 = r8.a;
        r26 = r8.c;
        if (r8 != r0) goto L45;
        r21 = r28;
        r2 = r29;
        r8 = null;
        goto L47
    L45:
        r21 = r28;
        r2 = r29;
        goto L47
    L46:
        r26 = r4;
        r21 = r112;
    L27:
        if (r18 == false) goto L37;
        return -2;
    }
}
