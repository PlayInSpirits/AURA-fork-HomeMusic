/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.as0;
import defpackage.fl1;
import defpackage.gu4;

public final class el1
implements as0 {
    public final fl1 n;
    public final gu4 o;

    public el1(fl1 fl12, gu4 gu42) {
        this.n = fl12;
        this.o = gu42;
    }

    @Override
    public final void a() {
        gu4 gu42 = this.o;
        this.n.p.removeCallbacks(gu42);
    }
}

