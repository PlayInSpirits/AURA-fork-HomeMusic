package com.eddyizm.tempus.homemusic;

import defpackage.h12;
import defpackage.q40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WaveNextIn {
    public static final int $stable = 8;
    private final List<PlayEvent> played;
    private final List<String> queued;

    public WaveNextIn(List<PlayEvent> r1, List<String> r2) {
        r1.getClass();
        r2.getClass();
        this.played = r1;
        this.queued = r2;
    }

    public static /* synthetic */ WaveNextIn compatible$default(WaveNextIn r0, boolean r1, boolean r2, String r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = r1;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = null;
    L9:
        return r0.compatible(r1, r2, r3);
    }

    public final WaveNextIn compatible(boolean r10, boolean r11, String r12) {
        List<PlayEvent> r0 = this.played;
        ArrayList r1 = new ArrayList();
        Iterator<T> r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L14;
        Object r3 = r2.next();
        PlayEvent r4 = (PlayEvent) r3;
        boolean r5 = r10;
        boolean r6 = r11;
        if (PlayEvent.supported$default(r4, r5, r6, false, 4, null) == false) goto L12;
        if (r4.getAccount() != null) goto L10;
    L11:
        r1.add(r3);
        goto L12
    L10:
        if (h12.c(r4.getAccount(), r12) == true) goto L11;
    L12:
        r10 = r5;
        r11 = r6;
        goto L4
    L14:
        return new WaveNextIn(q40.L0(r1, SmartPlan.MAX_QUEUE), this.queued);
    }

    public final List<PlayEvent> getPlayed() {
        return this.played;
    }

    public final List<String> getQueued() {
        return this.queued;
    }
}
