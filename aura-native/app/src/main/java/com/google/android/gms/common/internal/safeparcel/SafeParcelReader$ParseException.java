package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class SafeParcelReader$ParseException extends RuntimeException {
    public SafeParcelReader$ParseException(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
