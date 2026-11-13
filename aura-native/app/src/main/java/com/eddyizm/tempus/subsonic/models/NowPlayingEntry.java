package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.ka4;
import defpackage.xj0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class NowPlayingEntry extends Child {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NowPlayingEntry> CREATOR = new b23(3);

    @ka4("_id")
    private final String id;
    private int minutesAgo;
    private int playerId;
    private String playerName;
    private String username;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NowPlayingEntry(String str, String str2, int i, int i2, String str3) {
        super(str, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        str.getClass();
        this.id = str;
        this.username = str2;
        this.minutesAgo = i;
        this.playerId = i2;
        this.playerName = str3;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child
    public String getId() {
        return this.id;
    }

    public final int getMinutesAgo() {
        return this.minutesAgo;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setMinutesAgo(int i) {
        this.minutesAgo = i;
    }

    public final void setPlayerId(int i) {
        this.playerId = i;
    }

    public final void setPlayerName(String str) {
        this.playerName = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Child, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.username);
        parcel.writeInt(this.minutesAgo);
        parcel.writeInt(this.playerId);
        parcel.writeString(this.playerName);
    }

    public /* synthetic */ NowPlayingEntry(String str, String str2, int i, int i2, String str3, int i3, xj0 xj0Var) {
        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str3);
    }
}
