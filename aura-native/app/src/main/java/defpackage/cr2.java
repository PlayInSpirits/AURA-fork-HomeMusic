/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.gr2;
import defpackage.ic2;
import defpackage.mk;
import defpackage.mw1;
import java.util.List;

public final class cr2
implements mk {
    public final int n;
    public final long o;

    public cr2(int n16, long l16) {
        this.n = n16;
        this.o = l16;
    }

    @Override
    public final ic2 apply(Object object) {
        return new mw1(new gr2((List)object, this.n, this.o));
    }
}

