/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ab3;

public final class gu0 {
    public static final gu0 b;
    public static final gu0 c;
    public static final gu0 d;
    public static final gu0 e;
    public static final gu0 f;
    public static final ab3 g;
    public static final boolean h;
    public final int a;

    static {
        gu0 gu02;
        b = new gu0(2);
        c = new gu0(0);
        d = gu02 = new gu0(1);
        e = new gu0(3);
        f = gu02;
        g = ab3.a(gu02, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        h = true;
    }

    public gu0(int n16) {
        this.a = n16;
    }

    public final int a(int n16, int n17, int n18, int n19) {
        int n26;
        int n27 = this.a;
        int n28 = n26 = 2;
        switch (n27) {
            default: {
                return 2;
            }
            case 2: {
                n28 = h ? n26 : 1;
            }
            case 1: {
                return n28;
            }
            case 0: 
        }
        if (this.b(n16, n17, n18, n19) != 1.0f) {
            n26 = b.a(n16, n17, n18, n19);
        }
        return n26;
    }

    public final float b(int n16, int n17, int n18, int n19) {
        int n26 = this.a;
        float f16 = 1.0f;
        switch (n26) {
            default: {
                return 1.0f;
            }
            case 2: {
                if (h) {
                    f16 = Math.min((float)n18 / (float)n16, (float)n19 / (float)n17);
                } else if ((n16 = Math.max(n17 / n19, n16 / n18)) != 0) {
                    f16 = 1.0f / (float)Integer.highestOneBit(n16);
                }
                return f16;
            }
            case 1: {
                return Math.max((float)n18 / (float)n16, (float)n19 / (float)n17);
            }
            case 0: 
        }
        return Math.min(1.0f, b.b(n16, n17, n18, n19));
    }
}

