/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ai3;
import defpackage.p42;

public final class rh3
implements p42 {
    public final int a;
    public final ai3 b;

    public rh3(ai3 ai32, int n16) {
        this.a = n16;
        this.b = ai32;
    }

    @Override
    public final String a(float f16) {
        int n16 = this.a;
        ai3 ai32 = this.b;
        switch (n16) {
            default: {
                return ai32.t(2131952591, Float.valueOf(ai3.p0(ai3.n0(f16)) * 100.0f));
            }
            case 0: 
        }
        return ai32.t(2131952598, Float.valueOf(ai3.q0(ai3.n0(f16))));
    }
}

