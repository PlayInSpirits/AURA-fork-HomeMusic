/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import defpackage.lx0;
import defpackage.rs1;

public final class os1
implements Runnable {
    public final int n;
    public final PlayEvent o;

    public os1(PlayEvent playEvent, int n16) {
        this.n = n16;
        this.o = playEvent;
    }

    @Override
    public final void run() {
        int n16 = this.n;
        PlayEvent playEvent = this.o;
        switch (n16) {
            default: {
                WaveSession waveSession = b.b;
                if (waveSession != null && waveSession.onEvent(playEvent)) {
                    b.c();
                }
                return;
            }
            case 1: {
                SmartSession smartSession = a.b;
                if (smartSession != null && smartSession.onEvent(playEvent)) {
                    a.b();
                }
                return;
            }
            case 0: 
        }
        Object object = rs1.a;
        object = (lx0)rs1.g.getValue();
        object.getClass();
        ((lx0)object).b.addLast(playEvent);
        rs1.h();
    }
}

