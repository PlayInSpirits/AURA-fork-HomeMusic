/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.fv;
import defpackage.gb;
import defpackage.hb3;
import defpackage.lm0;
import defpackage.n85;
import defpackage.r62;
import defpackage.zd3;

public final class ec3
implements fv {
    public final lm0 b;
    public final fv c;
    public final r62 d;

    public ec3(lm0 lm02, fv fv5, r62 r622) {
        this.b = lm02;
        this.c = fv5;
        this.d = r622;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final float a(float f16, float f17, float f18) {
        int n16;
        float f19;
        zd3 zd32;
        lm0 lm02;
        block15: {
            block16: {
                block14: {
                    lm02 = this.b;
                    zd32 = lm02.E;
                    f19 = this.c.a(f16, f17, f18);
                    n16 = 0;
                    if (!(f16 > 0.0f)) break block14;
                    if (!(f16 + f17 > f18)) break block15;
                    break block16;
                }
                int n17 = n85.a;
                if (!(f16 + f17 <= 1.0f)) break block15;
            }
            n16 = 1;
        }
        f16 = Math.abs(f19);
        r62 r622 = r62.o;
        hb3 hb32 = hb3.o;
        r62 r623 = this.d;
        if (f16 != 0.0f && n16 != 0) {
            if (r623 == r622 && lm02.m().e == hb32) {
                n16 = -lm02.f;
                n16 = lm02.p() + n16;
            } else {
                n16 = lm02.f;
            }
            f16 = (float)n16 * -1.0f;
            while (true) {
                f17 = f16;
                if (!(f19 > 0.0f)) break;
                f17 = f16;
                if (!(f16 < f19)) break;
                f16 += (float)lm02.p();
            }
            while (f19 < 0.0f) {
                if (!(f17 > f19)) return f17;
                f17 -= (float)lm02.p();
            }
            return f17;
        }
        if ((double)Math.abs(lm02.f) < 1.0E-6) {
            return 0.0f;
        }
        if (r623 == r622 && lm02.m().e == hb32) {
            n16 = -lm02.f;
            n16 = lm02.p() + n16;
        } else {
            n16 = lm02.f;
        }
        f17 = (float)n16 * -1.0f;
        if (r623 == r622 && lm02.m().e == hb32) {
            if (((Boolean)zd32.getValue()).booleanValue()) {
                f16 = f17;
                return gb.l(f16, -f18, f18);
            }
            n16 = lm02.p();
        } else {
            f16 = f17;
            if ((Boolean)zd32.getValue() == false) return gb.l(f16, -f18, f18);
            n16 = lm02.p();
        }
        f16 = f17 + (float)n16;
        return gb.l(f16, -f18, f18);
    }
}

