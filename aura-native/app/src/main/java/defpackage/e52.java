/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.lan.LanReceiverService;
import defpackage.bj2;
import defpackage.gf1;
import defpackage.h12;
import defpackage.j15;
import defpackage.kb4;
import defpackage.kf2;
import defpackage.sk2;
import defpackage.u0;
import defpackage.ud3;
import java.util.ArrayList;

public final class e52
implements gf1 {
    public final LanReceiverService n;
    public final String o;
    public final ArrayList p;
    public final int q;
    public final long r;

    public e52(LanReceiverService lanReceiverService, String string, ArrayList arrayList, int n16, long l16) {
        this.n = lanReceiverService;
        this.o = string;
        this.p = arrayList;
        this.q = n16;
        this.r = l16;
    }

    @Override
    public final Object invoke() {
        LanReceiverService lanReceiverService = this.n;
        Object object = this.o;
        ArrayList arrayList = this.p;
        int n16 = this.q;
        long l16 = this.r;
        if (lanReceiverService.o) {
            boolean bl5 = LanReceiverService.y;
            if (kb4.a0(lanReceiverService).contains(object) && h12.c(ud3.D(), lanReceiverService.w)) {
                object = lanReceiverService.v;
                if (object != null) {
                    object = (bj2)((u0)object).get();
                    ((sk2)object).T(arrayList, n16, l16);
                    ((sk2)object).b();
                    ((sk2)object).m0();
                    return j15.a;
                }
                h12.Q("browserFuture");
                throw null;
            }
        }
        kf2.n("Failed requirement.");
        return null;
    }
}

