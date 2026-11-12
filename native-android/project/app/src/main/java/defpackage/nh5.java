package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nh5 extends h2 {
    public static final Parcelable.Creator<nh5> CREATOR = new ch5(21);
    public final String n;

    public nh5(String str) {
        this.n = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nh5) {
            return au0.n(this.n, ((nh5) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 1, this.n);
        ud3.S0(parcel, iR0);
    }
}
