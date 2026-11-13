/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.gp3;
import defpackage.tn0;

public final class sn0
implements Runnable {
    public final int n;
    public final gp3 o;

    public sn0(gp3 gp32, int n16) {
        this.n = n16;
        this.o = gp32;
    }

    @Override
    public final void run() {
        int n16 = this.n;
        gp3 gp32 = this.o;
        switch (n16) {
            default: {
                ((tn0)gp32.p).h.c();
                return;
            }
            case 0: 
        }
        ((tn0)gp32.p).h.b();
    }
}

