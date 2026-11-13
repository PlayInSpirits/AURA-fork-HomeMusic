/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.hn4;
import defpackage.kf2;
import defpackage.o72;
import defpackage.wo0;

public final class kn4 {
    public final wo0 a;
    public o72 b;
    public final hn4 c;
    public final hn4 d;
    public final hn4 e;

    public kn4(wo0 wo02) {
        this.a = wo02;
        this.c = new hn4(this, 0);
        this.d = new hn4(this, 1);
        this.e = new hn4(this, 2);
    }

    public final o72 a() {
        o72 o722 = this.b;
        if (o722 != null) {
            return o722;
        }
        kf2.n("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}

