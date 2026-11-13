/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.WindowInsetsAnimation;
import defpackage.sa5;
import defpackage.xq2;

public final class ra5
extends sa5 {
    public final WindowInsetsAnimation e;

    public ra5(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override
    public final float a() {
        return xq2.a(this.e);
    }

    @Override
    public final long b() {
        return xq2.f(this.e);
    }

    @Override
    public final float c() {
        return xq2.y(this.e);
    }

    @Override
    public final int d() {
        return xq2.e(this.e);
    }

    @Override
    public final void e(float f16) {
        xq2.u(this.e, f16);
    }
}

