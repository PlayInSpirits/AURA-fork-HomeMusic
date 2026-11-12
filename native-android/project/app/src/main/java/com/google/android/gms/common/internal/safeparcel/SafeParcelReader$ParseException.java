package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SafeParcelReader$ParseException extends RuntimeException {
    public SafeParcelReader$ParseException(String r3, Parcel r4) {
        super(r3 + " Parcel: pos=" + r4.dataPosition() + " size=" + r4.dataSize());
    }
}
