/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ni4;
import defpackage.ud3;

public final class ji4
implements Runnable {
    public final int n;
    public final ni4 o;

    public ji4(ni4 ni42, int n16) {
        this.n = n16;
        this.o = ni42;
    }

    @Override
    public final void run() {
        int n16 = this.n;
        ni4 ni42 = this.o;
        switch (n16) {
            default: {
                ni42.d();
                return;
            }
            case 0: 
        }
        if (ud3.o() != null) {
            ni42.d();
        }
    }
}

