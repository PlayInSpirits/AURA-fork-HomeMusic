/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.model.Queue;
import defpackage.ls3;
import defpackage.ns3;
import defpackage.s24;
import defpackage.vs3;
import defpackage.xl;
import java.util.List;

public final class us3
implements Runnable {
    public final vs3 n;
    public final int o;
    public final int p;

    public us3(vs3 vs32, int n16, int n17) {
        this.n = vs32;
        this.o = n16;
        this.p = n17;
    }

    @Override
    public final void run() {
        int n16;
        int n17;
        ns3 ns32 = this.n.a;
        List list = ns32.c();
        int n18 = this.o;
        if (n18 >= 0 && (n17 = this.p) <= (n16 = list.size()) && n18 < n17) {
            list.subList(n18, n17).clear();
            for (n16 = 0; n16 < list.size(); ++n16) {
                ((Queue)list.get(n16)).setTrackOrder(n16);
            }
            xl.E((s24)ns32.o, false, true, new ls3(ns32, list, 0));
        }
    }
}

