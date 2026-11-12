package defpackage;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v50 {
    public static final ThreadLocal a = null;

    static {
        a = new ThreadLocal();
    }

    public static void a(int r7, int r8, int r9, float[] r10) {
        float r11 = r7 / 255.0f;
        float r12 = r8 / 255.0f;
        float r13 = r9 / 255.0f;
        float r0 = Math.max(r11, Math.max(r12, r13));
        float r1 = Math.min(r11, Math.min(r12, r13));
        float r2 = r0 - r1;
        float r3 = (r0 + r1) / 2.0f;
        float r6 = 0.0f;
        if (r0 != r1) goto L6;
        float r14 = 0.0f;
        float r4 = 0.0f;
    L13:
        float r15 = (r14 * 60.0f) % 360.0f;
        if (r15 >= 0.0f) goto L17;
        r15 = r15 + 360.0f;
    L17:
        if (r15 >= 0.0f) goto L19;
        float r16 = 0.0f;
    L20:
        r10[0] = r16;
        if (r4 >= 0.0f) goto L23;
        float r17 = 0.0f;
    L24:
        r10[1] = r17;
        if (r3 < 0.0f) goto L28;
        r6 = Math.min(r3, 1.0f);
    L28:
        r10[2] = r6;
        return;
    L23:
        r17 = Math.min(r4, 1.0f);
        goto L24
    L19:
        r16 = Math.min(r15, 360.0f);
        goto L20
    L6:
        if (r0 != r11) goto L9;
        r14 = ((r12 - r13) / r2) % 6.0f;
    L12:
        r4 = r2 / (1.0f - Math.abs((2.0f * r3) - 1.0f));
        goto L13
    L9:
        if (r0 != r12) goto L11;
        r14 = ((r13 - r11) / r2) + 2.0f;
        goto L12
    L11:
        r14 = 4.0f + ((r11 - r12) / r2);
        goto L12
    }

    public static int b(double r17, double r19, double r21) {
        double r0 = (((-0.4986d) * r21) + (((-1.5372d) * r19) + (3.2406d * r17))) / 100.0d;
        double r4 = ((0.0415d * r21) + ((1.8758d * r19) + ((-0.9689d) * r17))) / 100.0d;
        double r6 = ((1.057d * r21) + (((-0.204d) * r19) + (0.0557d * r17))) / 100.0d;
        if (r0 <= 0.0031308d) goto L5;
        double r1 = (Math.pow(r0, 0.4166666666666667d) * 1.055d) - 0.055d;
    L7:
        if (r4 <= 0.0031308d) goto L9;
        double r5 = (Math.pow(r4, 0.4166666666666667d) * 1.055d) - 0.055d;
    L11:
        if (r6 <= 0.0031308d) goto L13;
        double r2 = (Math.pow(r6, 0.4166666666666667d) * 1.055d) - 0.055d;
    L14:
        int r3 = (int) Math.round(r1 * 255.0d);
        int r8 = 0;
        if (r3 >= 0) goto L17;
        int r7 = 0;
    L18:
        int r9 = (int) Math.round(r5 * 255.0d);
        if (r9 >= 0) goto L21;
        int r10 = 0;
    L22:
        int r11 = (int) Math.round(r2 * 255.0d);
        if (r11 < 0) goto L27;
        r8 = Math.min(r11, 255);
    L27:
        return Color.rgb(r7, r10, r8);
    L21:
        r10 = Math.min(r9, 255);
        goto L22
    L17:
        r7 = Math.min(r3, 255);
        goto L18
    L13:
        r2 = r6 * 12.92d;
        goto L14
    L9:
        r5 = r4 * 12.92d;
        goto L11
    L5:
        r1 = r0 * 12.92d;
        goto L7
    }

    public static int c(int r5, float r6, int r7) {
        float r0 = 1.0f - r6;
        return Color.argb((int) ((Color.alpha(r7) * r6) + (Color.alpha(r5) * r0)), (int) ((Color.red(r7) * r6) + (Color.red(r5) * r0)), (int) ((Color.green(r7) * r6) + (Color.green(r5) * r0)), (int) ((Color.blue(r7) * r6) + (Color.blue(r5) * r0)));
    }

    public static double d(int r4, int r5) {
        if (Color.alpha(r5) == 255) goto L5;
        kf2.l(Integer.toHexString(r5), "background can not be translucent: #");
        return 0.0d;
    L5:
        if (Color.alpha(r4) >= 255) goto L7;
        r4 = g(r4, r5);
    L7:
        double r0 = e(r4) + 0.05d;
        double r6 = e(r5) + 0.05d;
        return Math.max(r0, r6) / Math.min(r0, r6);
    }

    public static double e(int r21) {
        ThreadLocal r0 = a;
        double[] r1 = (double[]) r0.get();
        if (r1 != null) goto L5;
        r1 = new double[3];
        r0.set(r1);
    L5:
        int r2 = Color.red(r21);
        int r3 = Color.green(r21);
        int r4 = Color.blue(r21);
        if (r1.length != 3) goto L22;
        double r5 = ((double) r2) / 255.0d;
        if (r5 >= 0.04045d) goto L10;
        double r6 = r5 / 12.92d;
    L11:
        double r7 = ((double) r3) / 255.0d;
        if (r7 >= 0.04045d) goto L15;
        double r8 = r7 / 12.92d;
    L16:
        double r9 = ((double) r4) / 255.0d;
        if (r9 >= 0.04045d) goto L19;
        double r10 = r9 / 12.92d;
    L20:
        double r11 = 0.3576d * r8;
        double r12 = r11 + (0.4124d * r6);
        r1[0] = ((0.1805d * r10) + r12) * 100.0d;
        double r13 = 0.7152d * r8;
        double r14 = r13 + (0.2126d * r6);
        double r15 = ((0.0722d * r10) + r14) * 100.0d;
        r1[1] = r15;
        double r16 = r8 * 0.1192d;
        double r17 = r10 * 0.9505d;
        r1[2] = (r17 + (r16 + (r6 * 0.0193d))) * 100.0d;
        return r15 / 100.0d;
    L19:
        r10 = Math.pow((r9 + 0.055d) / 1.055d, 2.4d);
        goto L20
    L15:
        r8 = Math.pow((r7 + 0.055d) / 1.055d, 2.4d);
        goto L16
    L10:
        r6 = Math.pow((r5 + 0.055d) / 1.055d, 2.4d);
        goto L11
    L22:
        kf2.n("outXyz must have a length of 3.");
        return 0.0d;
    }

    public static int f(int r8, float r9, int r10) {
        int r1 = 255;
        if (Color.alpha(r10) != 255) goto L19;
        double r4 = r9;
        if (d(i(r8, 255), r10) >= r4) goto L8;
        return -1;
    L8:
        int r11 = 0;
        int r0 = 0;
    L10:
        if (r11 > 10) goto L18;
        if ((r1 - r0) <= 1) goto L18;
        int r2 = (r0 + r1) / 2;
        if (d(i(r8, r2), r10) >= r4) goto L16;
        r0 = r2;
    L17:
        r11 = r11 + 1;
        goto L10
    L16:
        r1 = r2;
    L18:
        return r1;
    L19:
        kf2.l(Integer.toHexString(r10), "background can not be translucent: #");
        return 0;
    }

    public static int g(int r6, int r7) {
        int r0 = Color.alpha(r7);
        int r1 = Color.alpha(r6);
        int r3 = 255 - r1;
        int r2 = 255 - ((r3 * (255 - r0)) / 255);
        return Color.argb(r2, h(Color.red(r6), r1, Color.red(r7), r0, r2), h(Color.green(r6), r1, Color.green(r7), r0, r2), h(Color.blue(r6), r1, Color.blue(r7), r0, r2));
    }

    public static int h(int r0, int r1, int r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        return 0;
    L5:
        int r5 = (r0 * 255) * r1;
        int r6 = 255 - r1;
        return ((r6 * (r2 * r3)) + r5) / (r4 * 255);
    }

    public static int i(int r1, int r2) {
        if (r2 >= 0) goto L4;
    L7:
        kf2.n("alpha must be between 0 and 255.");
        return 0;
    L4:
        if (r2 > 255) goto L7;
        return (r1 & 16777215) | (r2 << 24);
    }
}
