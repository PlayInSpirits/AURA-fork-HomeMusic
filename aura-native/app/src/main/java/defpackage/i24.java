/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ks0;
import defpackage.s50;
import defpackage.sw4;

public final class i24
implements ks0 {
    public final int n;
    public final sw4 o;

    public i24(sw4 sw42, int n16) {
        this.n = n16;
        this.o = sw42;
    }

    @Override
    public final double b(double d16) {
        int n16 = this.n;
        sw4 sw42 = this.o;
        switch (n16) {
            default: {
                double d17 = sw42.b;
                double d18 = sw42.c;
                double d19 = sw42.d;
                double d26 = sw42.e;
                double d27 = sw42.f;
                double d28 = sw42.g;
                double d29 = sw42.a;
                d16 = d16 >= d26 * d19 ? (Math.pow(d16 - d27, 1.0 / d29) - d18) / d17 : (d16 - d28) / d19;
                return d16;
            }
            case 6: {
                double d36 = sw42.b;
                double d37 = sw42.c;
                double d38 = sw42.d;
                double d39 = sw42.e;
                double d46 = sw42.a;
                d16 = d16 >= d39 * d38 ? (Math.pow(d16, 1.0 / d46) - d37) / d36 : (d16 /= d38);
                return d16;
            }
            case 5: {
                float[] fArray = s50.a;
                return s50.d(sw42, d16);
            }
            case 4: {
                float[] fArray = s50.a;
                return s50.b(sw42, d16);
            }
            case 3: {
                double d47 = sw42.b;
                double d48 = sw42.c;
                double d49 = sw42.d;
                double d56 = sw42.e;
                double d57 = sw42.f;
                double d58 = sw42.g;
                double d59 = sw42.a;
                d16 = d16 >= d56 ? Math.pow(d47 * d16 + d48, d59) + d57 : d49 * d16 + d58;
                return d16;
            }
            case 2: {
                double d66 = sw42.b;
                double d67 = sw42.c;
                double d68 = sw42.d;
                double d69 = sw42.e;
                double d76 = sw42.a;
                d16 = d16 >= d69 ? Math.pow(d66 * d16 + d67, d76) : d68 * d16;
                return d16;
            }
            case 1: {
                float[] fArray = s50.a;
                return s50.c(sw42, d16);
            }
            case 0: 
        }
        float[] fArray = s50.a;
        return s50.a(sw42, d16);
    }
}

