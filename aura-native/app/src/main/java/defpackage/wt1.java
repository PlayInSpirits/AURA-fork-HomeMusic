/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.xt1;
import defpackage.zr1;

public final class wt1
implements Runnable {
    public final boolean n;

    public wt1(boolean bl5) {
        this.n = bl5;
    }

    @Override
    public final void run() {
        boolean bl5;
        xt1.h = bl5 = this.n;
        zr1 zr12 = xt1.g;
        if (zr12 != null) {
            zr12.invoke(bl5);
        }
    }
}

