package okhttp3.internal.publicsuffix;

import defpackage.ge3;
import defpackage.w10;
import defpackage.xe5;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String a(byte[] r18, byte[][] r19, int r20) {
        ge3 r2 = b.g;
        int r3 = r18.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L42;
        int r5 = (r4 + r3) / 2;
    L6:
        if (r5 <= (-1)) goto L10;
        if (r18[r5] == 10) goto L10;
        r5 = r5 - 1;
    L10:
        int r8 = r5 + 1;
        int r10 = 1;
    L11:
        int r11 = r8 + r10;
        if (r18[r11] == 10) goto L14;
        r10 = r10 + 1;
        goto L11
    L14:
        int r6 = r11 - r8;
        int r12 = r20;
        boolean r13 = false;
        int r14 = 0;
        int r15 = 0;
    L15:
        if (r13 == false) goto L17;
        int r16 = 46;
        boolean r17 = false;
    L18:
        byte r7 = r18[r8 + r15];
        byte[] r110 = xe5.a;
        int r111 = r16 - (r7 & 255);
        if (r111 != 0) goto L29;
        r15 = r15 + 1;
        r14 = r14 + 1;
        if (r15 == r6) goto L29;
        if (r19[r12].length == r14) goto L25;
        r13 = r17;
        goto L15
    L25:
        if (r12 == (r19.length - 1)) goto L29;
        r12 = r12 + 1;
        r14 = -1;
        r13 = true;
    L29:
        if (r111 < 0) goto L30;
        if (r111 > 0) goto L32;
        int r9 = r6 - r15;
        int r21 = r19[r12].length - r14;
        int r112 = r12 + 1;
        int r22 = r19.length;
    L34:
        if (r112 >= r22) goto L36;
        r21 = r21 + r19[r112].length;
        r112 = r112 + 1;
        goto L34
    L36:
        if (r21 < r9) goto L30;
        if (r21 > r9) goto L32;
        return new String(r18, r8, r6, w10.a);
    L32:
        r4 = r11 + 1;
    L30:
        r3 = r5;
        goto L3
    L17:
        byte r113 = r19[r12][r14];
        byte[] r114 = xe5.a;
        int r115 = r113 & 255;
        r17 = r13;
        r16 = r115;
        goto L18
    L42:
        return null;
    }
}
