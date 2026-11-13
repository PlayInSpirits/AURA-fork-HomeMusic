/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.WindowInsetsController;
import defpackage.hb5;
import defpackage.sb5;

public final class tb5
extends sb5 {
    public tb5(android.view.Window a0, defpackage.om1 a1) {
        super(a0, a1);
    }

    public tb5(android.view.WindowInsetsController a0, defpackage.om1 a1) {
        super(a0, a1);
    }

    @Override
    public final void C(boolean bl5) {
        WindowInsetsController windowInsetsController = this.g;
        int n16 = bl5 ? 16 : 0;
        hb5.s(windowInsetsController, n16);
    }

    @Override
    public final void D(boolean bl5) {
        WindowInsetsController windowInsetsController = this.g;
        int n16 = bl5 ? 8 : 0;
        hb5.u(windowInsetsController, n16);
    }

    @Override
    public final void E(int n16) {
        hb5.i(this.g, n16);
    }

    @Override
    public final boolean y() {
        return (hb5.b(this.g) & 8) != 0;
    }
}

