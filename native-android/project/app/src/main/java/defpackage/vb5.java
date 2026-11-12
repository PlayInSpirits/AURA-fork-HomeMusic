package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vb5 {
    public static final /* synthetic */ vb5 a = null;
    public static final xb5 b = null;
    public static final xb5 c = null;
    public static final xb5 d = null;
    public static final xb5 e = null;
    public static final xb5 f = null;
    public static final xb5 g = null;
    public static final xb5 h = null;
    public static final xb5 i = null;
    public static final xb5 j = null;

    static {
        a = new vb5();
        xb5 r0 = new xb5("caption bar");
        b = r0;
        xb5 r1 = new xb5("display cutout");
        c = r1;
        xb5 r2 = new xb5("ime");
        d = r2;
        xb5 r3 = new xb5("mandatory system gestures");
        e = r3;
        xb5 r4 = new xb5("navigation bars");
        f = r4;
        xb5 r5 = new xb5("status bars");
        g = r5;
        char r10 = 2;
        wb5[] r7 = {r5, r4, r0};
        ArrayList r11 = new ArrayList(3);
        int r12 = 0;
    L3:
        if (r12 >= 3) goto L5;
        r11.add(((xb5) r7[r12]).c);
        r12 = r12 + 1;
        goto L3
    L5:
        jz1[] r13 = (jz1[]) r11.toArray(new jz1[0]);
        new jz1((jz1[]) Arrays.copyOf(r13, r13.length));
        ArrayList r14 = new ArrayList(3);
        int r15 = 0;
    L6:
        if (r15 >= 3) goto L8;
        r14.add(((xb5) r7[r15]).d);
        r15 = r15 + 1;
        goto L6
    L8:
        jz1[] r8 = (jz1[]) r14.toArray(new jz1[0]);
        new jz1((jz1[]) Arrays.copyOf(r8, r8.length));
        xb5 r9 = new xb5("system gestures");
        h = r9;
        xb5 r16 = new xb5("tappable element");
        i = r16;
        xb5 r17 = new xb5("waterfall");
        j = r17;
        wb5[] r18 = {r5, r4, r0, r1, r2, r16};
        ArrayList r6 = new ArrayList(6);
        int r19 = 0;
    L9:
        if (r19 >= 6) goto L11;
        r6.add(((xb5) r18[r19]).c);
        r19 = r19 + 1;
        r10 = r10;
        goto L9
    L11:
        char r20 = r10;
        jz1[] r21 = (jz1[]) r6.toArray(new jz1[0]);
        new jz1((jz1[]) Arrays.copyOf(r21, r21.length));
        ArrayList r22 = new ArrayList(6);
        int r23 = 0;
    L12:
        if (r23 >= 6) goto L14;
        r22.add(((xb5) r18[r23]).d);
        r23 = r23 + 1;
        goto L12
    L14:
        jz1[] r24 = (jz1[]) r22.toArray(new jz1[0]);
        new jz1((jz1[]) Arrays.copyOf(r24, r24.length));
        wb5[] r25 = new wb5[4];
        r25[0] = r3;
        r25[1] = r9;
        r25[r20] = r16;
        r25[3] = r17;
        ArrayList r26 = new ArrayList(4);
        int r110 = 0;
    L15:
        if (r110 >= 4) goto L17;
        r26.add(((xb5) r25[r110]).c);
        r110 = r110 + 1;
        goto L15
    L17:
        jz1[] r27 = (jz1[]) r26.toArray(new jz1[0]);
        new jz1((jz1[]) Arrays.copyOf(r27, r27.length));
        ArrayList r28 = new ArrayList(4);
        int r111 = 0;
    L18:
        if (r111 >= 4) goto L20;
        r28.add(((xb5) r25[r111]).d);
        r111 = r111 + 1;
        goto L18
    L20:
        jz1[] r29 = (jz1[]) r28.toArray(new jz1[0]);
        new jz1((jz1[]) Arrays.copyOf(r29, r29.length));
        wb5[] r30 = new wb5[9];
        r30[0] = r5;
        r30[1] = r4;
        r30[r20] = r0;
        r30[3] = r2;
        r30[4] = r9;
        r30[5] = r3;
        r30[6] = r16;
        r30[7] = r1;
        r30[8] = r17;
        ArrayList r31 = new ArrayList(9);
        int r32 = 0;
    L21:
        if (r32 >= 9) goto L23;
        r31.add(((xb5) r30[r32]).c);
        r32 = r32 + 1;
        goto L21
    L23:
        jz1[] r33 = (jz1[]) r31.toArray(new jz1[0]);
        new jz1((jz1[]) Arrays.copyOf(r33, r33.length));
        ArrayList r34 = new ArrayList(9);
        int r35 = 0;
    L24:
        if (r35 >= 9) goto L26;
        r34.add(((xb5) r30[r35]).d);
        r35 = r35 + 1;
        goto L24
    L26:
        jz1[] r36 = (jz1[]) r34.toArray(new jz1[0]);
        new jz1((jz1[]) Arrays.copyOf(r36, r36.length));
    }
}
