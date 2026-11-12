package com.eddyizm.tempus.model;

import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import defpackage.a12;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class InternetRadioStationCache {
    public static final int $stable = 8;
    public static final a12 Companion = null;
    public static final String SOURCE_LOCAL = "local";
    public static final String SOURCE_SUBSONIC = "subsonic";
    private String coverArtUrl;
    private String homePageUrl;
    private String id;
    private String name;
    private String source;
    private String streamUrl;

    static {
        Companion = new a12();
    }

    public /* synthetic */ InternetRadioStationCache(String r2, String r3, String r4, String r5, String r6, String r7, int r8, xj0 r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = SOURCE_SUBSONIC;
    L18:
        if ((r8 & 32) == 0) goto L20;
        String r10 = null;
    L21:
        this(r2, r3, r4, r5, r6, r10);
        return;
    L20:
        r10 = r7;
        goto L21
    }

    public final String getCoverArtUrl() {
        return this.coverArtUrl;
    }

    public final String getHomePageUrl() {
        return this.homePageUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getStreamUrl() {
        return this.streamUrl;
    }

    public final void setCoverArtUrl(String r1) {
        this.coverArtUrl = r1;
    }

    public final void setHomePageUrl(String r1) {
        this.homePageUrl = r1;
    }

    public final void setId(String r1) {
        r1.getClass();
        this.id = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setSource(String r1) {
        r1.getClass();
        this.source = r1;
    }

    public final void setStreamUrl(String r1) {
        this.streamUrl = r1;
    }

    public final InternetRadioStation toInternetRadioStation() {
        return new InternetRadioStation(this.id, this.name, this.streamUrl, this.homePageUrl, this.coverArtUrl, this.source);
    }

    public InternetRadioStationCache(String r1, String r2, String r3, String r4, String r5, String r6) {
        r1.getClass();
        r5.getClass();
        this.id = r1;
        this.name = r2;
        this.streamUrl = r3;
        this.homePageUrl = r4;
        this.source = r5;
        this.coverArtUrl = r6;
    }

    public InternetRadioStationCache() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public InternetRadioStationCache(InternetRadioStation r9) {
        r9.getClass();
        String r0 = r9.getId();
        if (r0 != null) goto L5;
        r0 = "";
    L5:
        String r2 = r0;
        String r3 = r9.getName();
        String r4 = r9.getStreamUrl();
        String r5 = r9.getHomePageUrl();
        String r1 = r9.getSource();
        if (r1 != null) goto L8;
        r1 = SOURCE_SUBSONIC;
    L8:
        this(r2, r3, r4, r5, r1, r9.getCoverArt());
    }
}
