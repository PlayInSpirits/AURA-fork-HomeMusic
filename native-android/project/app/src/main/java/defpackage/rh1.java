package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rh1 extends h2 {
    public static final Parcelable.Creator<rh1> CREATOR = null;
    public final Bundle n;

    static {
        CREATOR = new hz0(9);
    }

    public rh1(Bundle r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.getClass();
        int r4 = ud3.R0(r2, 20293);
        ud3.K0(r2, 1, this.n);
        ud3.S0(r2, r4);
    }
}
