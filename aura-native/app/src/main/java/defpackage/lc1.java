/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import defpackage.nc1;
import defpackage.xc0;

public final class lc1
implements xc0 {
    public final int a;
    public final nc1 b;

    public lc1(nc1 nc12, int n16) {
        this.a = n16;
        this.b = nc12;
    }

    @Override
    public final void accept(Object object) {
        int n16 = this.a;
        nc1 nc12 = this.b;
        switch (n16) {
            default: {
                object = (Intent)object;
                nc12.H.F();
                return;
            }
            case 0: 
        }
        object = (Configuration)object;
        nc12.H.F();
    }
}

