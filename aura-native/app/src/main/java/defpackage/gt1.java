/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.ft1;
import defpackage.if1;
import defpackage.j15;

public final class gt1
implements if1 {
    public final int n;
    public final ft1 o;

    public gt1(ft1 ft12, int n16) {
        this.n = n16;
        this.o = ft12;
    }

    @Override
    public final Object invoke(Object object) {
        int n16 = this.n;
        j15 j152 = j15.a;
        ft1 ft12 = this.o;
        switch (n16) {
            default: {
                object = (Long)object;
                ft12.run();
                return j152;
            }
            case 0: 
        }
        object = (Child)object;
        ft12.run();
        return j152;
    }
}

