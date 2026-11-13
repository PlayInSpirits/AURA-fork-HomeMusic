/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.View;
import android.view.WindowInsets;
import defpackage.hb5;
import defpackage.jb5;
import defpackage.ob5;
import defpackage.pb5;
import defpackage.vz1;
import defpackage.xq2;

public class kb5
extends jb5 {
    public static final pb5 w = pb5.g(hb5.e(), null);

    public kb5(pb5 pb52, WindowInsets windowInsets) {
        super(pb52, windowInsets);
    }

    @Override
    public vz1 h(int n16) {
        return vz1.c(hb5.c(this.c, ob5.a(n16)));
    }

    @Override
    public vz1 i(int n16) {
        return vz1.c(xq2.g(this.c, ob5.a(n16)));
    }

    @Override
    public void o(View view) {
    }

    @Override
    public boolean t(int n16) {
        return hb5.k(this.c, ob5.a(n16));
    }
}

