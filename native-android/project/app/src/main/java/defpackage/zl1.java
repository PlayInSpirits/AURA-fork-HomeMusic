package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zl1 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final ss0 o;

    public zl1(List r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, float r12, int r13, String r14, ss0 r15) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
        this.l = r12;
        this.m = r13;
        this.n = r14;
        this.o = r15;
    }

    public static zl1 a(be3 r35, boolean r36, ss0 r37) {
        int r1 = 4;
        if (r36 == false) goto L7;
        r35.O(4);     // Catch: ArrayIndexOutOfBoundsException -> L5
    L8:
        int r2 = r35.A() & 3;     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r3 = r35.A();     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r4 = r35.b;     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
    L9:
        boolean r8 = true;
        if (r6 >= r3) goto L15;
        r35.O(1);     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r9 = r35.H();     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r10 = 0;
    L12:
        if (r10 >= r9) goto L14;
        int r11 = r35.H();     // Catch: ArrayIndexOutOfBoundsException -> L5
        r7 = r7 + (r11 + 4);     // Catch: ArrayIndexOutOfBoundsException -> L5
        r35.O(r11);     // Catch: ArrayIndexOutOfBoundsException -> L5
        r10 = r10 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L5
        goto L12
    L14:
        r6 = r6 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L5
        goto L9
    L15:
        r35.N(r4);     // Catch: ArrayIndexOutOfBoundsException -> L5
        byte[] r12 = new byte[r7];     // Catch: ArrayIndexOutOfBoundsException -> L5
        ss0 r26 = r37;
        int r14 = -1;
        int r15 = -1;
        int r16 = -1;
        int r17 = -1;
        int r18 = -1;
        int r19 = -1;
        int r20 = -1;
        int r21 = -1;
        int r22 = -1;
        int r24 = -1;
        float r23 = 1.0f;
        String r25 = null;
        int r13 = 0;
        int r27 = 0;
    L16:
        if (r13 >= r3) goto L44;
        int r110 = r35.A() & 63;     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r111 = r35.H();     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r112 = r5;
        ss0 r113 = r26;
    L18:
        if (r112 >= r111) goto L43;
        boolean r28 = r8;
        int r29 = r35.H();     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r210 = r2;
        System.arraycopy(uc5.c, r5, r12, r27, r1);     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r30 = r27 + 4;     // Catch: ArrayIndexOutOfBoundsException -> L5
        System.arraycopy(r35.a, r35.b, r12, r30, r29);     // Catch: ArrayIndexOutOfBoundsException -> L5
        if (r110 != 32) goto L24;
        if (r112 != 0) goto L24;
        r113 = uc5.J(r12, r30, r30 + r29);     // Catch: ArrayIndexOutOfBoundsException -> L5
    L42:
        r27 = r30 + r29;     // Catch: ArrayIndexOutOfBoundsException -> L5
        r35.O(r29);     // Catch: ArrayIndexOutOfBoundsException -> L5
        r112 = r112 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L5
        r8 = r28;
        r2 = r210;
        r1 = 4;
    L24:
        if (r110 != 33) goto L33;
        if (r112 != 0) goto L33;
        r13 r31 = uc5.I(r12, r30, r30 + r29, r113);     // Catch: ArrayIndexOutOfBoundsException -> L5
        r14 = r31.a + 1;     // Catch: ArrayIndexOutOfBoundsException -> L5
        r15 = r31.g;     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r32 = r31.h;     // Catch: ArrayIndexOutOfBoundsException -> L5
        r17 = r31.c + 8;     // Catch: ArrayIndexOutOfBoundsException -> L5
        r18 = r31.d + 8;     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r33 = r31.k;     // Catch: ArrayIndexOutOfBoundsException -> L5
        r16 = r32;
        int r34 = r31.l;     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r38 = r31.m;     // Catch: ArrayIndexOutOfBoundsException -> L5
        float r39 = r31.i;     // Catch: ArrayIndexOutOfBoundsException -> L5
        int r40 = r31.j;     // Catch: ArrayIndexOutOfBoundsException -> L5
        p13 r41 = r31.b;     // Catch: ArrayIndexOutOfBoundsException -> L5
        if (r41 == null) goto L30;
        r25 = i40.a(r41.a, r41.b, r41.c, r41.d, r41.e, r41.f);     // Catch: ArrayIndexOutOfBoundsException -> L5
    L30:
        r24 = r40;
        r23 = r39;
        r21 = r38;
        r20 = r34;
        r19 = r33;
    L31:
        r5 = 0;
    L33:
        if (r110 != 39) goto L31;
        if (r112 != 0) goto L31;
        cx r42 = uc5.H(r12, r30, r30 + r29);     // Catch: ArrayIndexOutOfBoundsException -> L5
        if (r42 == null) goto L31;
        if (r113 == null) goto L31;
        r5 = 0;
        if (r42.a != ((o13) ((yw1) r113.n).get(0)).b) goto L41;
        r22 = 4;
        goto L42
    L41:
        r22 = 5;
        goto L42
    L43:
        r13 = r13 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L5
        r26 = r113;
        r1 = 4;
        goto L16
    L44:
        int r211 = r2;
        if (r7 != 0) goto L48;
        List r0 = Collections.EMPTY_LIST;     // Catch: ArrayIndexOutOfBoundsException -> L5
    L49:
        return new zl1(r0, r211 + 1, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    L48:
        r0 = Collections.singletonList(r12);     // Catch: ArrayIndexOutOfBoundsException -> L5
        goto L49
    L7:
        r35.O(21);     // Catch: ArrayIndexOutOfBoundsException -> L5
    L5:
        e = move-exception;
        if (r36 == false) goto L53;
        String r43 = "L-HEVC config";
    L55:
        throw ParserException.a(e, "Error parsing".concat(r43));
    L53:
        r43 = "HEVC config";
        goto L55
    }
}
