package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.dk5;
import defpackage.ek5;
import defpackage.xa3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum Transport extends Enum<Transport> implements ReflectedParcelable {
    public static final Parcelable.Creator<Transport> CREATOR = null;
    public static final /* synthetic */ Transport[] o = null;
    public final String n;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class UnsupportedTransportException extends Exception {
    }

    static {
        o = new Transport[]{new Transport(0, "BLUETOOTH_CLASSIC", "bt"), new Transport(1, "BLUETOOTH_LOW_ENERGY", "ble"), new Transport(2, "NFC", "nfc"), new Transport(3, "USB", "usb"), new Transport(4, "INTERNAL", "internal"), new Transport(5, "HYBRID", "cable"), new Transport(6, "HYBRID_V2", "hybrid")};
        CREATOR = new a();
    }

    public Transport(int r1, String r2, String r3) {
        super(r2, r1);
        this.n = r3;
    }

    public static Transport a(String r5) {
        if (r5.equals("hybrid") == true) goto L12;
        Transport[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L11;
        Transport r3 = r0[r2];
        if (r5.equals(r3.n) == true) goto L8;
        r2 = r2 + 1;
        goto L5
    L8:
        return r3;
    L11:
        throw new UnsupportedTransportException(xa3.h("Transport ", r5, " not supported"));
    L12:
        ek5 r6 = (ek5) dk5.b.a.n;
        ek5.a.b();
        throw null;
    }

    public static Transport valueOf(String r1) {
        return (Transport) Enum.valueOf(Transport.class, r1);
    }

    public static Transport[] values() {
        return (Transport[]) o.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.n);
    }
}
