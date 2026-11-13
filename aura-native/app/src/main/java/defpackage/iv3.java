/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.model.RecentSearch;
import defpackage.h61;
import defpackage.if1;
import defpackage.jv3;
import defpackage.q20;
import defpackage.x34;

public final class iv3
implements if1 {
    public final int n;
    public final jv3 o;
    public final RecentSearch p;

    public iv3(jv3 jv32, RecentSearch recentSearch, int n16) {
        this.n = n16;
        this.o = jv32;
        this.p = recentSearch;
    }

    @Override
    public final Object invoke(Object object) {
        int n16 = this.n;
        RecentSearch recentSearch = this.p;
        jv3 jv32 = this.o;
        object = (x34)object;
        switch (n16) {
            default: {
                ((h61)jv32.p).y((x34)object, recentSearch);
                return null;
            }
            case 0: 
        }
        ((q20)jv32.o).I((x34)object, recentSearch);
        return null;
    }
}

