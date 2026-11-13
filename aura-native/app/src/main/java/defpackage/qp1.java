/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ig3;
import defpackage.rp1;
import defpackage.wf1;
import defpackage.zz1;

public final class qp1
implements wf1 {
    public final int n;
    public final rp1[] o;

    public qp1(rp1[] rp1Array, int n16) {
        this.n = n16;
        this.o = rp1Array;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object invoke(Object object, Object object2) {
        int n16 = this.n;
        rp1[] rp1Array = this.o;
        object = (ig3)object;
        float f16 = ((Float)object2).floatValue();
        switch (n16) {
            default: {
                f16 = zz1.d((ig3)object, true, rp1Array, f16);
                return Float.valueOf(f16);
            }
            case 0: 
        }
        f16 = zz1.d((ig3)object, false, rp1Array, f16);
        return Float.valueOf(f16);
    }
}

