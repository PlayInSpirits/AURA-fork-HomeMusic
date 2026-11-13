/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.Activity;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.service.MediaService;
import defpackage.f35;
import defpackage.qi3;
import defpackage.qm;
import defpackage.rs3;
import defpackage.xc5;

public final class pm
implements Runnable {
    public final int n;
    public final boolean o;
    public final Object p;

    public pm(Object object, boolean bl5, int n16) {
        this.n = n16;
        this.p = object;
        this.o = bl5;
    }

    @Override
    public final void run() {
        switch (this.n) {
            default: {
                HubUpdater.j((Activity)this.p, this.o);
                return;
            }
            case 1: {
                MediaService mediaService = (MediaService)this.p;
                boolean bl5 = this.o;
                if (!mediaService.D) {
                    qi3 qi32;
                    if (bl5) {
                        qi32 = mediaService.p().a();
                        qi32.getClass();
                        mediaService.v(qi32);
                    }
                    rs3 rs32 = rs3.a;
                    qi32 = mediaService.p().a();
                    qi32.getClass();
                    rs32.c(mediaService, qi32);
                }
                return;
            }
            case 0: 
        }
        Object object = (xc5)this.p;
        boolean bl6 = this.o;
        qm qm5 = (qm)((xc5)object).p;
        object = f35.a;
        qm5.d(bl6);
    }
}

