/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.c81;
import defpackage.ry0;

public final class e81
implements c81 {
    public final int a;
    public final ry0 b;
    public final long c;
    public final long d;

    public e81(int n16, ry0 ry02) {
        this.a = n16;
        this.b = ry02;
        this.c = (long)n16 * 1000000L;
        this.d = 0L;
    }

    @Override
    public final float b(long l16, float f16, float f17, float f18) {
        long l17;
        l16 = l17 = l16 - this.d;
        if (l17 < 0L) {
            l16 = 0L;
        }
        if (l16 > (l17 = this.c)) {
            l16 = l17;
        }
        if (l16 == 0L) {
            return f18;
        }
        float f19 = this.e(l16 - 1000000L, f16, f17, f18);
        return (this.e(l16, f16, f17, f18) - f19) * 1000.0f;
    }

    @Override
    public final long c(float f16, float f17, float f18) {
        return this.d + this.c;
    }

    @Override
    public final float e(long l16, float f16, float f17, float f18) {
        long l17;
        l16 = l17 = l16 - this.d;
        if (l17 < 0L) {
            l16 = 0L;
        }
        long l18 = this.c;
        l17 = l16;
        if (l16 > l18) {
            l17 = l18;
        }
        f18 = this.a == 0 ? 1.0f : (float)l17 / (float)l18;
        f18 = this.b.b(f18);
        return f17 * f18 + (1.0f - f18) * f16;
    }
}

