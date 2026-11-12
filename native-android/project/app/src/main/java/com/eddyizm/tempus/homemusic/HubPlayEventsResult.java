package com.eddyizm.tempus.homemusic;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubPlayEventsResult {
    public static final int $stable = 8;
    private int accepted;
    private int duplicates;
    private List<? extends Map<String, ? extends Object>> rejected;

    public HubPlayEventsResult() {
    }

    public final int getAccepted() {
        return this.accepted;
    }

    public final int getDuplicates() {
        return this.duplicates;
    }

    public final List<Map<String, Object>> getRejected() {
        return this.rejected;
    }

    public final void setAccepted(int r1) {
        this.accepted = r1;
    }

    public final void setDuplicates(int r1) {
        this.duplicates = r1;
    }

    public final void setRejected(List<? extends Map<String, ? extends Object>> r1) {
        this.rejected = r1;
    }
}
