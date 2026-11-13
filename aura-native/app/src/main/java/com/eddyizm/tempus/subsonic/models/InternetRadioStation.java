package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hz0;
import defpackage.ka4;
import defpackage.xj0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class InternetRadioStation implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InternetRadioStation> CREATOR = new hz0(11);
    private String coverArt;

    @ka4(alternate = {"homepageUrl"}, value = "homePageUrl")
    private String homePageUrl;
    private String id;
    private String name;
    private String source;
    private String streamUrl;

    public /* synthetic */ InternetRadioStation(String str, String str2, String str3, String str4, String str5, String str6, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
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

    public final void setCoverArt(String str) {
        this.coverArt = str;
    }

    public final void setHomePageUrl(String str) {
        this.homePageUrl = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setStreamUrl(String str) {
        this.streamUrl = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.streamUrl);
        parcel.writeString(this.homePageUrl);
        parcel.writeString(this.coverArt);
        parcel.writeString(this.source);
    }

    public InternetRadioStation(String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = str;
        this.name = str2;
        this.streamUrl = str3;
        this.homePageUrl = str4;
        this.coverArt = str5;
        this.source = str6;
    }

    public InternetRadioStation() {
        this(null, null, null, null, null, null, 63, null);
    }
}
