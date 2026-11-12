package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jj4 {
    public static final long a = 0;
    public static final long b = 0;
    public static final long c = 0;
    public static final as4 d = null;

    static {
        a = su3.v(14);
        b = su3.v(0);
        c = x40.f;
        long r0 = x40.b;
        if (r0 == 16) goto L5;
        as4 r2 = new u50(r0);
    L6:
        d = r2;
        return;
    L5:
        r2 = rv2.F;
        goto L6
    }

    public static final ij4 a(ij4 r24, long r25, uo r27, float r28, long r29, gb1 r31, eb1 r32, fb1 r33, vk0 r34, String r35, long r36, hr r38, bs4 r39, vd2 r40, long r41, sr4 r43, xb4 r44, q05 r45) {
        eb1 r8 = r32;
        fb1 r9 = r33;
        vk0 r10 = r34;
        String r11 = r35;
        long r12 = r36;
        rv2 r15 = rv2.F;
        ct4[] r16 = bt4.b;
        long r18 = r29 & 1095216660480L;
        if (r18 != 0) goto L5;
        rv2 r19 = r15;
    L7:
        if (r27 == null) goto L9;
    L17:
        if (r8 != null) goto L19;
    L20:
        if (r31 != null) goto L22;
    L23:
        if (r10 == null) goto L27;
        if (r10 == r24.f) goto L27;
    L13:
        hr r17 = r38;
    L14:
        long r4 = r41;
    L15:
        xb4 r6 = r44;
    L16:
        q05 r7 = r45;
    L74:
        if (r27 == null) goto L87;
        if ((r27 instanceof zh4) == false) goto L82;
        long r1 = rr2.M(((zh4) r27).u, r28);
        if (r1 == 16) goto L80;
        as4 r3 = new u50(r1);
    L89:
        as4 r2 = r24.a;
        r2.getClass();
        boolean r5 = r3 instanceof qv;
        if (r5 == true) goto L92;
    L97:
        if (r5 == true) goto L99;
    L101:
        if (r5 == true) goto L106;
        if ((r2 instanceof qv) == false) goto L106;
    L104:
        r3 = r2;
    L107:
        if (r10 != null) goto L109;
        r10 = r24.f;
    L109:
        if (r18 != 0) goto L111;
        long r13 = r24.b;
    L112:
        if (r31 != null) goto L114;
        gb1 r14 = r24.c;
    L115:
        if (r8 != null) goto L117;
        r8 = r24.d;
    L117:
        if (r9 != null) goto L119;
        r9 = r24.e;
    L119:
        if (r11 != null) goto L122;
        r11 = r24.g;
    L122:
        if ((r12 & 1095216660480L) != 0) goto L124;
        r12 = r24.h;
    L124:
        if (r17 != null) goto L126;
        r17 = r24.i;
    L126:
        long r26 = r13;
        if (r39 != null) goto L129;
        bs4 r20 = r24.j;
    L130:
        if (r40 != null) goto L132;
        vd2 r21 = r24.k;
    L134:
        if (r4 != 16) goto L137;
        r4 = r24.l;
    L137:
        bs4 r37 = r20;
        if (r43 != null) goto L140;
        sr4 r22 = r24.m;
    L141:
        if (r6 != null) goto L143;
        r6 = r24.n;
    L143:
        if (r7 != null) goto L145;
        q05 r0 = r24.o;
    L146:
        sr4 r42 = r22;
        vd2 r310 = r21;
        as4 r210 = r3;
        long r311 = r4;
        xb4 r46 = r6;
        eb1 r211 = r8;
        fb1 r30 = r9;
        vk0 r312 = r10;
        String r313 = r11;
        long r314 = r12;
        gb1 r212 = r14;
        hr r315 = r17;
        return new ij4(r210, r26, r212, r211, r30, r312, r313, r314, r315, r37, r310, r311, r42, r46, r0);
    L145:
        r0 = r7;
        goto L146
    L140:
        r22 = r43;
        goto L141
    L132:
        r21 = r40;
        goto L134
    L129:
        r20 = r39;
        goto L130
    L114:
        r14 = r31;
        goto L115
    L111:
        r13 = r29;
    L106:
        if (r3.equals(r19) == true) goto L104;
    L99:
        if ((r2 instanceof qv) == true) goto L101;
    L92:
        if ((r2 instanceof qv) == false) goto L97;
        qv r23 = (qv) r3;
        pv r110 = r23.n;
        float r47 = r23.o;
        if (Float.isNaN(r47) == false) goto L96;
        r47 = ((qv) r2).o;
    L96:
        r3 = new qv(r110, r47);
    L80:
        r3 = r19;
        goto L89
    L82:
        if ((r27 instanceof pv) == false) goto L84;
        r3 = new qv((pv) r27, r28);
        goto L89
    L84:
        er1.n();
        return null;
    L87:
        if (r25 == 16) goto L80;
        r3 = new u50(r25);
    L27:
        if ((r12 & 1095216660480L) != 0) goto L30;
    L31:
        if (r43 == null) goto L35;
        if (r43.equals(r24.m) == false) goto L13;
    L35:
        if (h12.c(r27, r24.a.f()) == false) goto L13;
        if (r27 != null) goto L38;
    L39:
        if (r9 != null) goto L41;
    L42:
        if (r11 != null) goto L44;
    L45:
        if (r38 == null) goto L49;
        r17 = r38;
        if (r17.equals(r24.i) == false) goto L14;
    L50:
        if (r39 == null) goto L55;
        if (r39.equals(r24.j) == false) goto L14;
    L55:
        if (r40 == null) goto L58;
        if (r40.equals(r24.k) == false) goto L14;
    L58:
        r4 = r41;
        if (r4 != 16) goto L63;
    L64:
        r6 = r44;
        if (r6 != null) goto L67;
    L68:
        r7 = r45;
        if (r7 != null) goto L71;
    L73:
        return r24;
    L71:
        if (r7.equals(r24.o) == true) goto L73;
    L67:
        if (r6.equals(r24.n) == false) goto L16;
    L63:
        if (x40.c(r4, r24.l) == false) goto L15;
    L49:
        r17 = r38;
        goto L50
    L44:
        if (r11.equals(r24.g) == false) goto L13;
    L41:
        if (r9.equals(r24.e) == false) goto L13;
    L38:
        if (r28 != r24.a.b()) goto L13;
    L30:
        if (bt4.a(r12, r24.h) == false) goto L13;
    L22:
        if (r31.equals(r24.c) == false) goto L13;
    L19:
        if (r8.equals(r24.d) == false) goto L13;
    L9:
        if (r25 == 16) goto L17;
        if (x40.c(r25, r24.a.c()) == false) goto L13;
    L5:
        r19 = r15;
        if (bt4.a(r29, r24.b) == false) goto L13;
        goto L7
    }
}
