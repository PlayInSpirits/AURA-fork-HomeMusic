/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.gb;
import defpackage.xa3;
import defpackage.xb;

public abstract class yb {
    public static final float[] a;

    static {
        float[] fArray = new float[101];
        a = fArray;
        float[] fArray2 = new float[101];
        float f16 = 0.0f;
        int n16 = 0;
        float f17 = 0.0f;
        while (true) {
            float f18;
            float f19;
            float f26;
            float f27;
            float f28;
            float f29 = 1.0f;
            if (n16 >= 100) break;
            float f36 = (float)n16 / 100.0f;
            float f37 = 1.0f;
            while (!((double)Math.abs((f28 = ((f27 = (f37 - f16) / 2.0f + f16) * 0.35000002f + (f26 = f29 - f27) * 0.175f) * (f19 = f27 * 3.0f * f26) + (f18 = f27 * f27 * f27)) - f36) < 1.0E-5)) {
                if (f28 > f36) {
                    f37 = f27;
                    continue;
                }
                f16 = f27;
            }
            fArray[n16] = (f26 * 0.5f + f27) * f19 + f18;
            f37 = f29;
            while (!((double)Math.abs((f26 = ((f19 = f29 - (f27 = (f37 - f17) / 2.0f + f17)) * 0.5f + f27) * (f18 = f27 * 3.0f * f19) + (f28 = f27 * f27 * f27)) - f36) < 1.0E-5)) {
                if (f26 > f36) {
                    f37 = f27;
                    continue;
                }
                f17 = f27;
            }
            fArray2[n16] = (f27 * 0.35000002f + f19 * 0.175f) * f18 + f28;
            ++n16;
        }
        fArray2[100] = 1.0f;
        fArray[100] = 1.0f;
    }

    public static xb a(float f16) {
        float f17 = 0.0f;
        float f18 = 1.0f;
        float f19 = gb.l(f16, 0.0f, 1.0f);
        int n16 = (int)(100.0f * f19);
        f16 = f17;
        if (n16 < 100) {
            f18 = (float)n16 / 100.0f;
            int n17 = n16 + 1;
            f16 = (float)n17 / 100.0f;
            float[] fArray = a;
            f17 = fArray[n16];
            f16 = (fArray[n17] - f17) / (f16 - f18);
            f18 = xa3.a(f19, f18, f16, f17);
        }
        return new xb(f18, f16);
    }
}

