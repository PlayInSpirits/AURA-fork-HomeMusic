package com.eddyizm.tempus.homemusic;

import defpackage.ka4;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class HubTrackSource {
    public static final int $stable = 8;
    private String kind;

    @ka4("page_url")
    private String pageUrl;
    private String provider;
    private String source;

    @ka4("source_url")
    private String sourceUrl;

    public final String getKind() {
        return this.kind;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final void setKind(String str) {
        this.kind = str;
    }

    public final void setPageUrl(String str) {
        this.pageUrl = str;
    }

    public final void setProvider(String str) {
        this.provider = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setSourceUrl(String str) {
        this.sourceUrl = str;
    }
}
