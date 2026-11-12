package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yb {
    public static final float[] a = null;

    static {
        float[] r1 = new float[101];
        a = r1;
        float[] r0 = new float[101];
        float r2 = 0.0f;
        int r4 = 0;
        float r3 = 0.0f;
    L3:
        float r6 = 1.0f;
        if (r4 >= 100) goto L22;
        float r5 = r4 / 100.0f;
        float r7 = 1.0f;
    L6:
        float r8 = ((r7 - r2) / 2.0f) + r2;
        float r12 = r6 - r8;
        float r11 = (r8 * 3.0f) * r12;
        float r14 = (r8 * r8) * r8;
        float r16 = (((r8 * 0.35000002f) + (r12 * 0.175f)) * r11) + r14;
        float r18 = r6;
        if (Math.abs(r16 - r5) < 1.0E-5d) goto L13;
        if (r16 <= r5) goto L12;
        r7 = r8;
    L11:
        r6 = r18;
        goto L6
    L12:
        r2 = r8;
        goto L11
    L13:
        float r9 = 0.5f;
        r1[r4] = (((r12 * 0.5f) + r8) * r11) + r14;
        float r10 = r18;
    L14:
        float r13 = ((r10 - r3) / 2.0f) + r3;
        float r15 = r18 - r13;
        float r17 = (r13 * 3.0f) * r15;
        float r19 = (r13 * r13) * r13;
        float r110 = (((r15 * r9) + r13) * r17) + r19;
        float r22 = r10;
        if (Math.abs(r110 - r5) < 1.0E-5d) goto L21;
        if (r110 <= r5) goto L20;
        r10 = r13;
    L19:
        r9 = 0.5f;
        goto L14
    L20:
        r3 = r13;
        r10 = r22;
        goto L19
    L21:
        r0[r4] = (((r13 * 0.35000002f) + (r15 * 0.175f)) * r17) + r19;
        r4 = r4 + 1;
        goto L3
    L22:
        r0[100] = 1.0f;
        r1[100] = 1.0f;
    }

    public static xb a(float r5) {
        float r0 = 0.0f;
        float r1 = 1.0f;
        float r6 = gb.l(r5, 0.0f, 1.0f);
        int r3 = (int) (100.0f * r6);
        if (r3 >= 100) goto L6;
        float r2 = r3 / 100.0f;
        int r4 = r3 + 1;
        float[] r7 = a;
        float r8 = r7[r3];
        float r9 = (r7[r4] - r8) / ((r4 / 100.0f) - r2);
        float r10 = xa3.a(r6, r2, r9, r8);
        r0 = r9;
        r1 = r10;
    L6:
        return new xb(r1, r0);
    }
}
