/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.homemusic.PlayEvent;
import defpackage.h12;
import defpackage.if1;

public final class jh3
implements if1 {
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;

    public jh3(boolean bl5, boolean bl6, boolean bl7, String string) {
        this.n = bl5;
        this.o = bl6;
        this.p = bl7;
        this.q = string;
    }

    @Override
    public final Object invoke(Object object) {
        object = (PlayEvent)object;
        object.getClass();
        boolean bl5 = ((PlayEvent)object).getRejected() == null && ((PlayEvent)object).supported(this.n, this.o, this.p) && (((PlayEvent)object).getAccount() == null || h12.c(((PlayEvent)object).getAccount(), this.q));
        return bl5;
    }
}

