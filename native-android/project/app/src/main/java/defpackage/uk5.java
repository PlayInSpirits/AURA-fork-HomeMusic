package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uk5 extends h2 {
    public static final Parcelable.Creator<uk5> CREATOR = null;

    static {
        CREATOR = new rh5(17);
    }

    public final boolean equals(Object r1) {
        if ((r1 instanceof uk5) == true) goto L6;
        return false;
    L6:
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        int r1 = ud3.R0(r2, 20293);
        ud3.T0(r2, 1, 4);
        r2.writeInt(0);
        ud3.S0(r2, r1);
    }
}
