package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class td3 {
    public static final long a = 0;
    public static final /* synthetic */ int b = 0;

    static {
        ct4[] r0 = bt4.b;
        a = bt4.c;
    }

    public static final sd3 a(sd3 r17, int r18, int r19, long r20, cs4 r22, zg3 r23, ra2 r24, int r25, int r26, qs4 r27) {
        int r1 = r18;
        int r2 = r19;
        long r3 = r20;
        cs4 r5 = r22;
        zg3 r6 = r23;
        ra2 r7 = r24;
        int r8 = r25;
        int r9 = r26;
        qs4 r10 = r27;
        if (r1 != 0) goto L6;
    L7:
        ct4[] r15 = bt4.b;
        if ((r3 & 1095216660480L) != 0) goto L10;
        long r16 = 0;
    L12:
        if (r5 != null) goto L14;
    L15:
        if (r2 != 0) goto L18;
    L19:
        if (r6 != null) goto L21;
    L22:
        if (r7 != null) goto L24;
    L25:
        if (r8 != 0) goto L28;
    L29:
        if (r9 != 0) goto L32;
    L33:
        if (r10 != null) goto L35;
    L37:
        return r17;
    L35:
        if (r10.equals(r17.i) == true) goto L37;
    L39:
        ct4[] r11 = bt4.b;
        if ((r3 & 1095216660480L) != r16) goto L42;
        r3 = r17.c;
    L42:
        if (r5 != null) goto L44;
        r5 = r17.d;
    L44:
        if (r1 != 0) goto L46;
        r1 = r17.a;
    L46:
        if (r2 != 0) goto L48;
        r2 = r17.b;
    L48:
        zg3 r12 = r17.e;
        if (r12 == null) goto L53;
        if (r6 != null) goto L53;
        r6 = r12;
    L53:
        if (r7 != null) goto L55;
        r7 = r17.f;
    L55:
        if (r8 != 0) goto L57;
        r8 = r17.g;
    L57:
        if (r9 != 0) goto L59;
        r9 = r17.h;
    L59:
        if (r10 != null) goto L62;
        r10 = r17.i;
    L62:
        return new sd3(r1, r2, r3, r5, r6, r7, r8, r9, r10);
    L32:
        if (r9 != r17.h) goto L39;
    L28:
        if (r8 != r17.g) goto L39;
    L24:
        if (r7.equals(r17.f) == false) goto L39;
    L21:
        if (r6.equals(r17.e) == false) goto L39;
    L18:
        if (r2 != r17.b) goto L39;
    L14:
        if (r5.equals(r17.d) == false) goto L39;
    L10:
        r16 = 0;
        if (bt4.a(r3, r17.c) == false) goto L39;
    L6:
        if (r1 == r17.a) goto L7;
        r16 = 0;
        goto L39
    }
}
