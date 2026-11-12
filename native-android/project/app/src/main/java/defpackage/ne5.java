package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ne5 {
    public final ge3 a;
    public final boolean b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;
    public final Long k;
    public final Long l;
    public final Long m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final ArrayList q;

    public /* synthetic */ ne5(ge3 r24, boolean r25, String r26, long r27, long r29, long r31, int r33, long r34, int r36, int r37, Long r38, Long r39, Long r40, int r41) {
        if ((r41 & 4) == 0) goto L5;
        String r5 = "";
    L7:
        if ((r41 & 8) == 0) goto L9;
        long r6 = -1;
    L11:
        if ((r41 & 16) == 0) goto L13;
        long r8 = -1;
    L15:
        if ((r41 & 32) == 0) goto L17;
        long r10 = -1;
    L19:
        if ((r41 & 64) == 0) goto L21;
        int r12 = -1;
    L23:
        if ((r41 & 128) == 0) goto L25;
        long r13 = -1;
    L27:
        if ((r41 & 256) == 0) goto L29;
        int r15 = -1;
    L31:
        if ((r41 & 512) == 0) goto L33;
        int r16 = -1;
    L35:
        if ((r41 & 1024) == 0) goto L37;
        Long r17 = null;
    L39:
        if ((r41 & 2048) == 0) goto L41;
        Long r18 = null;
    L43:
        if ((r41 & 4096) == 0) goto L45;
        Long r19 = null;
    L46:
        this(r24, r25, r5, r6, r8, r10, r12, r13, r15, r16, r17, r18, r19, null, null, null);
        return;
    L45:
        r19 = r40;
        goto L46
    L41:
        r18 = r39;
        goto L43
    L37:
        r17 = r38;
        goto L39
    L33:
        r16 = r37;
        goto L35
    L29:
        r15 = r36;
        goto L31
    L25:
        r13 = r34;
        goto L27
    L21:
        r12 = r33;
        goto L23
    L17:
        r10 = r31;
        goto L19
    L13:
        r8 = r29;
        goto L15
    L9:
        r6 = r27;
        goto L11
    L5:
        r5 = r26;
        goto L7
    }

    public ne5(ge3 r1, boolean r2, String r3, long r4, long r6, long r8, int r10, long r11, int r13, int r14, Long r15, Long r16, Long r17, Integer r18, Integer r19, Integer r20) {
        r1.getClass();
        r3.getClass();
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r6;
        this.f = r8;
        this.g = r10;
        this.h = r11;
        this.i = r13;
        this.j = r14;
        this.k = r15;
        this.l = r16;
        this.m = r17;
        this.n = r18;
        this.o = r19;
        this.p = r20;
        this.q = new ArrayList();
    }
}
