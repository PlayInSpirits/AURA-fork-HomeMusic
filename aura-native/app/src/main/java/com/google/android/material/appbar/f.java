package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f extends k {
    public f(android.os.Parcelable a0) {
        super(a0);
    }

    public static final Parcelable.Creator<f> CREATOR = new e();
    public boolean p;
    public boolean q;
    public int r;
    public float s;
    public boolean t;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.p = parcel.readByte() != 0;
        this.q = parcel.readByte() != 0;
        this.r = parcel.readInt();
        this.s = parcel.readFloat();
        this.t = parcel.readByte() != 0;
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.r);
        parcel.writeFloat(this.s);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
    }
}
