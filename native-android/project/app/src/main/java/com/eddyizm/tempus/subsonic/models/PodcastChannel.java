package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.ka4;
import defpackage.xj0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PodcastChannel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PodcastChannel> CREATOR = new b23(16);

    @ka4("coverArt")
    private String coverArtId;
    private String description;

    @ka4("episode")
    private List<PodcastEpisode> episodes;
    private String errorMessage;
    private String id;
    private String originalImageUrl;
    private String status;
    private String title;
    private String url;

    public /* synthetic */ PodcastChannel(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getCoverArtId() {
        return this.coverArtId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<PodcastEpisode> getEpisodes() {
        return this.episodes;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOriginalImageUrl() {
        return this.originalImageUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setCoverArtId(String str) {
        this.coverArtId = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setEpisodes(List<PodcastEpisode> list) {
        this.episodes = list;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setOriginalImageUrl(String str) {
        this.originalImageUrl = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List<PodcastEpisode> list = this.episodes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PodcastEpisode> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.coverArtId);
        parcel.writeString(this.originalImageUrl);
        parcel.writeString(this.status);
        parcel.writeString(this.errorMessage);
    }

    public PodcastChannel(List<PodcastEpisode> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.episodes = list;
        this.id = str;
        this.url = str2;
        this.title = str3;
        this.description = str4;
        this.coverArtId = str5;
        this.originalImageUrl = str6;
        this.status = str7;
        this.errorMessage = str8;
    }

    public PodcastChannel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
