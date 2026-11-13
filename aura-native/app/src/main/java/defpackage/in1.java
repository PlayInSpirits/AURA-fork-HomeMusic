/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ln1;

public final class in1
implements Runnable {
    public final int n;
    public final ln1 o;

    public in1(ln1 ln12, int n16) {
        this.n = n16;
        this.o = ln12;
    }

    @Override
    public final void run() {
        int n16 = this.n;
        ln1 ln12 = this.o;
        switch (n16) {
            default: {
                ln12.P = true;
                ln12.F();
                return;
            }
            case 0: 
        }
        ln12.F();
    }
}

