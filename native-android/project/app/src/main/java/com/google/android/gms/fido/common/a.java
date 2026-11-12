package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.er1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
        return Transport.a(r1.readString());
    L5:
        e = move-exception;
        er1.m(e);
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new Transport[r1];
    }
}
