package com.eddyizm.tempus.homemusic;

import defpackage.qm4;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class SmartRec extends WaveTrack {
    public static final int $stable = 8;
    private String after;
    private int slot;

    public final String getAfter() {
        return this.after;
    }

    public final String getQueueId() {
        String songId = getSongId();
        if (songId == null) {
            String ref = getRef();
            songId = null;
            if (ref != null) {
                if (qm4.u0(ref)) {
                    ref = null;
                }
                if (ref != null) {
                    return "hub:".concat(ref);
                }
            }
        }
        return songId;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final void setAfter(String str) {
        this.after = str;
    }

    public final void setSlot(int i) {
        this.slot = i;
    }
}
