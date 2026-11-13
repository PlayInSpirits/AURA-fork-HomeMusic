/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.aa0;
import defpackage.fr2;
import defpackage.ic2;
import defpackage.mi3;
import defpackage.mw1;
import defpackage.na4;
import defpackage.tn2;
import java.lang.ref.WeakReference;

public final class z90
implements aa0 {
    public final na4 a;
    public final fr2 b;
    public final mi3 c;

    public z90(na4 na42, fr2 fr22, mi3 mi32) {
        this.a = na42;
        this.b = fr22;
        this.c = mi32;
    }

    @Override
    public final ic2 run() {
        tn2 tn22 = (tn2)((WeakReference)this.a.q).get();
        if (tn22 != null) {
            tn22.v(this.b, this.c);
        }
        return mw1.o;
    }
}

