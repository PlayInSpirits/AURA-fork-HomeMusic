package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class JukeboxPlaylist extends JukeboxStatus {
    public static final int $stable = 8;
    private List<Child> entries;

    public final List<Child> getEntries() {
        return this.entries;
    }

    public final void setEntries(List<Child> list) {
        this.entries = list;
    }
}
