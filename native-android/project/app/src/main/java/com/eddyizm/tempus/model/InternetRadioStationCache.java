package com.eddyizm.tempus.model;

import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import defpackage.a12;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class InternetRadioStationCache {
    public static final int $stable = 8;
    public static final a12 Companion = new a12();
    public static final String SOURCE_LOCAL = "local";
    public static final String SOURCE_SUBSONIC = "subsonic";
    private String coverArtUrl;
    private String homePageUrl;
    private String id;
    private String name;
    private String source;
    private String streamUrl;

    public /* synthetic */ InternetRadioStationCache(String str, String str2, String str3, String str4, String str5, String str6, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? SOURCE_SUBSONIC : str5, (i & 32) != 0 ? null : str6);
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

    public final void setCoverArtUrl(String str) {
        this.coverArtUrl = str;
    }

    public final void setHomePageUrl(String str) {
        this.homePageUrl = str;
    }

    public final void setId(String str) {
        str.getClass();
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSource(String str) {
        str.getClass();
        this.source = str;
    }

    public final void setStreamUrl(String str) {
        this.streamUrl = str;
    }

    public final InternetRadioStation toInternetRadioStation() {
        return new InternetRadioStation(this.id, this.name, this.streamUrl, this.homePageUrl, this.coverArtUrl, this.source);
    }

    public InternetRadioStationCache(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str5.getClass();
        this.id = str;
        this.name = str2;
        this.streamUrl = str3;
        this.homePageUrl = str4;
        this.source = str5;
        this.coverArtUrl = str6;
    }

    public InternetRadioStationCache() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InternetRadioStationCache(InternetRadioStation internetRadioStation) {
        internetRadioStation.getClass();
        String id = internetRadioStation.getId();
        String str = id == null ? "" : id;
        String name = internetRadioStation.getName();
        String streamUrl = internetRadioStation.getStreamUrl();
        String homePageUrl = internetRadioStation.getHomePageUrl();
        String source = internetRadioStation.getSource();
        this(str, name, streamUrl, homePageUrl, source == null ? SOURCE_SUBSONIC : source, internetRadioStation.getCoverArt());
    }
}
