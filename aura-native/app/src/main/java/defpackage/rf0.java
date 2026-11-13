package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rf0 extends h2 {
    public static final Parcelable.Creator<rf0> CREATOR = new w4(17);
    public final Bundle n;

    public rf0(Bundle bundle) {
        bundle.getClass();
        this.n = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int R0 = ud3.R0(parcel, 20293);
        ud3.K0(parcel, 1, this.n);
        ud3.S0(parcel, R0);
    }
}
