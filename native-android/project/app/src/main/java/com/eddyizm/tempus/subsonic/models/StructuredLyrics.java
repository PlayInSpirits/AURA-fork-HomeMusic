package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class StructuredLyrics {
    public static final int $stable = 8;
    private String displayArtist;
    private String displayTitle;
    private String lang;
    private List<Line> line;
    private int offset;
    private boolean synced;

    public final String getDisplayArtist() {
        return this.displayArtist;
    }

    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final String getLang() {
        return this.lang;
    }

    public final List<Line> getLine() {
        return this.line;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final boolean getSynced() {
        return this.synced;
    }

    public final void setDisplayArtist(String str) {
        this.displayArtist = str;
    }

    public final void setDisplayTitle(String str) {
        this.displayTitle = str;
    }

    public final void setLang(String str) {
        this.lang = str;
    }

    public final void setLine(List<Line> list) {
        this.line = list;
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    public final void setSynced(boolean z) {
        this.synced = z;
    }
}
