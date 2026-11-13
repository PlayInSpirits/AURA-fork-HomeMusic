/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.gx3;
import defpackage.if1;
import defpackage.j15;

public final class tg4
implements if1 {
    public final int n;
    public final gx3 o;
    public final if1 p;

    public tg4(gx3 gx32, if1 if12, int n16) {
        this.n = n16;
        this.o = gx32;
        this.p = if12;
    }

    @Override
    public final Object invoke(Object object) {
        int n16 = this.n;
        j15 j152 = j15.a;
        if1 if12 = this.p;
        gx3 gx32 = this.o;
        float f16 = ((Float)object).floatValue();
        switch (n16) {
            default: {
                gx32.n = f16 = gx32.n - f16;
                if12.invoke(Float.valueOf(f16));
                return j152;
            }
            case 0: 
        }
        gx32.n = f16 = gx32.n - f16;
        if12.invoke(Float.valueOf(f16));
        return j152;
    }
}

