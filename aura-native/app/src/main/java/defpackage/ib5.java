/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.View;
import android.view.WindowInsets;
import defpackage.gb5;
import defpackage.hb5;
import defpackage.nb5;
import defpackage.pb5;
import defpackage.vz1;
import defpackage.xq2;

public class ib5
extends gb5 {
    public static final pb5 v = pb5.g(hb5.e(), null);

    public ib5(pb5 pb52, WindowInsets windowInsets) {
        super(pb52, windowInsets);
    }

    @Override
    public final void d(View view) {
    }

    @Override
    public vz1 h(int n16) {
        return vz1.c(hb5.c(this.c, nb5.a(n16)));
    }

    @Override
    public vz1 i(int n16) {
        return vz1.c(xq2.g(this.c, nb5.a(n16)));
    }

    @Override
    public boolean t(int n16) {
        return hb5.k(this.c, nb5.a(n16));
    }
}

