package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i45 {
    public static final /* synthetic */ int a = 0;

    static {
        float[][] r2 = {new float[2], new float[2]};
        int r1 = new int[2][0];
        char r6 = 3;
        int r7 = 1;
        if (r1 == 0) goto L13;
        if (r1 == 1) goto L9;
        if (r1 == 2) goto L12;
        if (r1 == 3) goto L12;
        if (r1 == 4) goto L11;
        if (r1 != 5) goto L9;
        char r3 = 5;
    L14:
        float[] r8 = r2[0];
        float[] r4 = r2[1];
        int r10 = (r8.length % 2) + (r8.length / 2);
        pa[] r0 = new pa[r10];
        int r9 = 0;
    L15:
        if (r9 >= r10) goto L45;
        int r11 = r9 * 2;
        float r13 = r8[r11];
        int r14 = r11 + 1;
        float r15 = r8[r14];
        float r12 = r4[r11];
        float r16 = r4[r14];
        pa r17 = new pa(9);
        float r18 = r12 - r13;
        float r5 = r16 - r15;
        float[] r19 = new float[101];
        if (r3 != r6) goto L20;
    L18:
        pa[] r23 = r0;
        char r110 = r3;
        int r20 = r7;
        boolean r21 = false;
        Math.hypot(r5, r18);
    L44:
        r23[r9] = r17;
        r9 = r9 + 1;
        r3 = r110;
        r7 = r20;
        r0 = r23;
        r6 = 3;
        goto L15
    L20:
        if (Math.abs(r18) < 0.001f) goto L18;
        if (Math.abs(r5) < 0.001f) goto L18;
        float r111 = r15 - r16;
        float[] r22 = au0.v;
        int r24 = r7;
        r20 = r24;
        float r112 = r111;
        float r113 = 0.0f;
        float r114 = 0.0f;
    L25:
        double r25 = (float) (((((double) r24) * 90.0d) / 90.0d) * 0.017453292519943295d);
        float r26 = r111;
        float r115 = ((float) Math.sin(r25)) * r18;
        float r116 = r26 * ((float) Math.cos(r25));
        float r117 = r116 - r112;
        r23 = r0;
        r110 = r3;
        r113 = r113 + ((float) Math.hypot(r115 - r114, r117));
        r22[r24] = r113;
        if (r24 == 90) goto L28;
        r24 = r24 + 1;
        r114 = r115;
        r3 = r110;
        r0 = r23;
        r112 = r116;
        r111 = r26;
        goto L25
    L28:
        int r27 = r20;
    L29:
        r22[r27] = r22[r27] / r113;
        if (r27 == 90) goto L32;
        r27 = r27 + 1;
        goto L29
    L32:
        int r28 = 0;
    L33:
        if (r28 >= 101) goto L42;
        float r29 = r28 / 100.0f;
        int r30 = Arrays.binarySearch(r22, 0, 91, r29);
        if (r30 < 0) goto L38;
        r19[r28] = r30 / 90.0f;
    L41:
        r28 = r28 + 1;
        goto L33
    L38:
        if (r30 != (-1)) goto L40;
        r19[r28] = 0.0f;
        goto L41
    L40:
        int r31 = -r30;
        int r118 = r31 - 2;
        float r119 = r118;
        float r120 = r22[r118];
        r19[r28] = (((r29 - r120) / (r22[r31 - 1] - r120)) + r119) / 90.0f;
        goto L41
    L42:
        r21 = false;
        goto L44
    L45:
        return;
    L11:
        r3 = 4;
    L12:
        r3 = 2;
    L9:
        r3 = 1;
        goto L14
    L13:
        r3 = 3;
        goto L14
    }
}
