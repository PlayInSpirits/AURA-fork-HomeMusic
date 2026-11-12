package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hz0;
import defpackage.ka4;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class InternetRadioStation implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InternetRadioStation> CREATOR = null;
    private String coverArt;

    @ka4(alternate = {"homepageUrl"}, value = "homePageUrl")
    private String homePageUrl;
    private String id;
    private String name;
    private String source;
    private String streamUrl;

    static {
        CREATOR = new hz0(11);
    }

    public /* synthetic */ InternetRadioStation(String r2, String r3, String r4, String r5, String r6, String r7, int r8, xj0 r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
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
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = null;
    L20:
        this(r2, r3, r4, r5, r6, r7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getCoverArt() {
        return this.coverArt;
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

    public final void setCoverArt(String r1) {
        this.coverArt = r1;
    }

    public final void setHomePageUrl(String r1) {
        this.homePageUrl = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setSource(String r1) {
        this.source = r1;
    }

    public final void setStreamUrl(String r1) {
        this.streamUrl = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.getClass();
        r1.writeString(this.id);
        r1.writeString(this.name);
        r1.writeString(this.streamUrl);
        r1.writeString(this.homePageUrl);
        r1.writeString(this.coverArt);
        r1.writeString(this.source);
    }

    public InternetRadioStation(String r1, String r2, String r3, String r4, String r5, String r6) {
        this.id = r1;
        this.name = r2;
        this.streamUrl = r3;
        this.homePageUrl = r4;
        this.coverArt = r5;
        this.source = r6;
    }

    public InternetRadioStation() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }
}
