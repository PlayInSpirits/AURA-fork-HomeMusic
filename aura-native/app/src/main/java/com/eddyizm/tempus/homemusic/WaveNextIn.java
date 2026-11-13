package com.eddyizm.tempus.homemusic;

import defpackage.h12;
import defpackage.q40;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class WaveNextIn {
    public static final int $stable = 8;
    private final List<PlayEvent> played;
    private final List<String> queued;

    public WaveNextIn(List<PlayEvent> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.played = list;
        this.queued = list2;
    }

    public static /* synthetic */ WaveNextIn compatible$default(WaveNextIn waveNextIn, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = z;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return waveNextIn.compatible(z, z2, str);
    }

    public final WaveNextIn compatible(boolean z, boolean z2, String str) {
        List<PlayEvent> list = this.played;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PlayEvent playEvent = (PlayEvent) obj;
            boolean z3 = z;
            boolean z4 = z2;
            if (PlayEvent.supported$default(playEvent, z3, z4, false, 4, null) && (playEvent.getAccount() == null || h12.c(playEvent.getAccount(), str))) {
                arrayList.add(obj);
            }
            z = z3;
            z2 = z4;
        }
        return new WaveNextIn(q40.L0(arrayList, SmartPlan.MAX_QUEUE), this.queued);
    }

    public final List<PlayEvent> getPlayed() {
        return this.played;
    }

    public final List<String> getQueued() {
        return this.queued;
    }
}
