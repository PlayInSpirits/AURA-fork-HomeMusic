/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.WindowInsets;
import defpackage.eb5;
import defpackage.fb5;
import defpackage.lm4;
import defpackage.pb5;
import defpackage.vz1;

public class gb5
extends eb5 {
    public vz1 s = null;
    public vz1 t = null;
    public vz1 u = null;

    public gb5(pb5 pb52, WindowInsets windowInsets) {
        super(pb52, windowInsets);
    }

    @Override
    public vz1 j() {
        if (this.t == null) {
            this.t = vz1.c(lm4.x(this.c));
        }
        return this.t;
    }

    @Override
    public vz1 l() {
        if (this.s == null) {
            this.s = vz1.c(fb5.b(this.c));
        }
        return this.s;
    }

    @Override
    public vz1 n() {
        if (this.u == null) {
            this.u = vz1.c(lm4.b(this.c));
        }
        return this.u;
    }

    @Override
    public pb5 q(int n16, int n17, int n18, int n19) {
        return pb5.g(lm4.l(this.c, n16, n17, n18, n19), null);
    }

    @Override
    public void x(vz1 vz12) {
    }
}

