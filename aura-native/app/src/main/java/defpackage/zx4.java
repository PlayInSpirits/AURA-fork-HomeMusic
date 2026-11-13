/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.dg2;
import defpackage.yx4;

public final class zx4
extends yx4 {
    public final int q;

    public zx4(int n16) {
        this.q = n16;
    }

    public final Object next() {
        switch (this.q) {
            default: {
                int n16 = this.p;
                this.p = n16 + 2;
                return this.n[n16 + 1];
            }
            case 1: {
                int n17 = this.p;
                this.p = n17 + 2;
                return this.n[n17];
            }
            case 0: 
        }
        int n18 = this.p;
        this.p = n18 + 2;
        Object[] objectArray = this.n;
        return new dg2(0, objectArray[n18], objectArray[n18 + 1]);
    }
}

