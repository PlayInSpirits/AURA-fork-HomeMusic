package com.eddyizm.tempus.homemusic;

import defpackage.h12;
import defpackage.q40;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class SmartNextIn {
    public static final int $stable = 8;
    private final String at;
    private final List<PlayEvent> played;

    public SmartNextIn(List<PlayEvent> list, String str) {
        list.getClass();
        this.played = list;
        this.at = str;
    }

    public static /* synthetic */ SmartNextIn compatible$default(SmartNextIn smartNextIn, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = z;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return smartNextIn.compatible(z, z2, str);
    }

    public final SmartNextIn compatible(boolean z, boolean z2, String str) {
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
        return new SmartNextIn(q40.L0(arrayList, SmartPlan.MAX_QUEUE), this.at);
    }

    public final String getAt() {
        return this.at;
    }

    public final List<PlayEvent> getPlayed() {
        return this.played;
    }
}
