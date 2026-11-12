package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class RecordLabel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecordLabel> CREATOR = new b23(24);
    private String name;

    public /* synthetic */ RecordLabel(String str, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
    }

    public RecordLabel(String str) {
        this.name = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecordLabel() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
