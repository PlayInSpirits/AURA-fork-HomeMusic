/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import defpackage.bl2;
import defpackage.gq0;
import defpackage.u52;
import defpackage.xj3;

public final class vj3 {
    public final PlayerControllerFragment a;

    public vj3(PlayerControllerFragment playerControllerFragment) {
        this.a = playerControllerFragment;
    }

    public void a(float f16) {
        PlayerControllerFragment playerControllerFragment = this.a;
        playerControllerFragment.v0.setText(playerControllerFragment.t(2131952598, Float.valueOf(f16)));
        if (u52.c().a) {
            u52.j(f16, PlayerControllerFragment.l0((float)f16).b);
            return;
        }
        bl2 bl22 = playerControllerFragment.M0;
        if (bl22 == null) {
            return;
        }
        bl22.f(new xj3(playerControllerFragment, f16), gq0.n);
    }
}

