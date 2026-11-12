package com.eddyizm.tempus.homemusic;

import defpackage.qm4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SmartRec extends WaveTrack {
    public static final int $stable = 8;
    private String after;
    private int slot;

    public SmartRec() {
    }

    public final String getAfter() {
        return this.after;
    }

    public final String getQueueId() {
        String r0 = getSongId();
        if (r0 != null) goto L13;
        String r2 = getRef();
        r0 = null;
        if (r2 == null) goto L13;
        if (qm4.u0(r2) == false) goto L10;
        r2 = null;
    L10:
        if (r2 == null) goto L13;
        return "hub:".concat(r2);
    L13:
        return r0;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final void setAfter(String r1) {
        this.after = r1;
    }

    public final void setSlot(int r1) {
        this.slot = r1;
    }
}
