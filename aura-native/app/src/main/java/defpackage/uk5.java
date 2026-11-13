package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class uk5 extends h2 {
    public static final Parcelable.Creator<uk5> CREATOR = new rh5(17);

    public final boolean equals(Object obj) {
        return obj instanceof uk5;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(0);
        ud3.S0(parcel, R0);
    }
}
