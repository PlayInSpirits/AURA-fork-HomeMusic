/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.fu;
import defpackage.gf1;
import defpackage.kc3;
import defpackage.lm0;
import defpackage.we0;

public final class jc3
implements gf1 {
    public final int n;
    public final lm0 o;
    public final we0 p;

    public jc3(lm0 lm02, we0 we02, int n16) {
        this.n = n16;
        this.o = lm02;
        this.p = we02;
    }

    @Override
    public final Object invoke() {
        int n16 = this.n;
        we0 we02 = this.p;
        lm0 lm02 = this.o;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        switch (n16) {
            default: {
                bl5 = bl8;
                if (lm02.c()) {
                    fu.G(we02, null, null, new kc3(lm02, null, 1), 3);
                    bl5 = true;
                }
                return bl5;
            }
            case 2: {
                if (lm02.b()) {
                    fu.G(we02, null, null, new kc3(lm02, null, 0), 3);
                    bl5 = true;
                }
                return bl5;
            }
            case 1: {
                bl5 = bl6;
                if (lm02.c()) {
                    fu.G(we02, null, null, new kc3(lm02, null, 1), 3);
                    bl5 = true;
                }
                return bl5;
            }
            case 0: 
        }
        bl5 = bl7;
        if (lm02.b()) {
            fu.G(we02, null, null, new kc3(lm02, null, 0), 3);
            bl5 = true;
        }
        return bl5;
    }
}

