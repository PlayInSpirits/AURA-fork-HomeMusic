package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d64 {
    public final ol1 a;
    public final int b;
    public final boolean c;
    public final double d;
    public final tu4 e;
    public final tu4 f;
    public final tu4 g;
    public final tu4 h;
    public final tu4 i;
    public final tu4 j;

    public d64(ol1 r21, boolean r22, double r23) {
        tu4 r2 = tu4.a(r21.a, r21.b);
        double r3 = r21.a;
        double r5 = r21.b;
        tu4 r4 = tu4.a(r3, Math.max(r5 - 32.0d, r5 * 0.5d));
        ss0 r6 = new ss0(r21);
        int r7 = (int) Math.round(r21.a);
        ol1 r8 = (ol1) r6.y().get(r7);
        double r9 = r6.A(r8);
        ArrayList r10 = new ArrayList();
        r10.add(r8);
        int r13 = 0;
        double r14 = 0.0d;
    L4:
        if (r13 >= 360) goto L9;
        int r11 = (r7 + r13) % 360;
        if (r11 >= 0) goto L8;
        r11 = r11 + 360;
    L8:
        double r12 = r6.A((ol1) r6.y().get(r11));
        r14 = r14 + Math.abs(r12 - r9);
        r13 = r13 + 1;
        r9 = r12;
        goto L4
    L9:
        double r15 = r14 / 6.0d;
        double r16 = r6.A(r8);
        int r17 = 1;
        double r18 = 0.0d;
    L10:
        int r19 = 6;
        if (r10.size() >= 6) goto L34;
        int r110 = (r7 + r17) % 360;
        if (r110 >= 0) goto L15;
        r110 = r110 + 360;
    L15:
        ol1 r111 = (ol1) r6.y().get(r110);
        double r112 = r6.A(r111);
        r18 = Math.abs(r112 - r16) + r18;
        if (r18 < (((double) r10.size()) * r15)) goto L18;
        boolean r20 = true;
    L19:
        int r24 = 1;
    L20:
        if (r20 == false) goto L28;
        if (r10.size() >= r19) goto L28;
        r10.add(r111);
        ArrayList r113 = r10;
        if (r18 < (((double) (r10.size() + r24)) * r15)) goto L26;
        r20 = true;
    L27:
        r24 = r24 + 1;
        r10 = r113;
        r19 = 6;
        goto L20
    L26:
        r20 = false;
    L28:
        ArrayList r114 = r10;
        r17 = r17 + 1;
        if (r17 > 360) goto L31;
        r10 = r114;
        r16 = r112;
    L31:
        if (r114.size() >= 6) goto L35;
        r114.add(r111);
    L35:
        ArrayList r25 = new ArrayList();
        r25.add(r21);
        int r26 = (int) Math.floor(1.0d);
        int r27 = 1;
    L37:
        if (r27 >= (r26 + 1)) goto L45;
        int r28 = 0 - r27;
    L39:
        if (r28 >= 0) goto L42;
        r28 = r28 + r114.size();
        goto L39
    L42:
        if (r28 < r114.size()) goto L44;
        r28 = r28 % r114.size();
    L44:
        r25.add(0, (ol1) r114.get(r28));
        r27 = r27 + 1;
        goto L37
    L45:
        int r29 = 3 - r26;
        int r30 = 1;
    L46:
        if (r30 >= r29) goto L54;
        int r31 = r30;
    L48:
        if (r31 >= 0) goto L51;
        r31 = r31 + r114.size();
        goto L48
    L51:
        if (r31 < r114.size()) goto L53;
        r31 = r31 % r114.size();
    L53:
        r25.add((ol1) r114.get(r31));
        r30 = r30 + 1;
        goto L46
    L54:
        ol1 r32 = vr1.q((ol1) r25.get(2));
        tu4 r33 = new tu4(r32.a, r32.b);
        tu4 r34 = tu4.a(r21.a, r21.b / 8.0d);
        tu4 r35 = tu4.a(r21.a, (r21.b / 8.0d) + 4.0d);
        this.a = r21;
        this.b = 7;
        this.c = r22;
        this.d = r23;
        this.e = r2;
        this.f = r4;
        this.g = r33;
        this.h = r34;
        this.i = r35;
        this.j = tu4.a(25.0d, 84.0d);
        return;
    L18:
        r20 = false;
        goto L19
    L34:
        r114 = r10;
        goto L35
    }
}
