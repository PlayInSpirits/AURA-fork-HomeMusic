package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gh5 extends h2 {
    public static final Parcelable.Creator<gh5> CREATOR = new ch5(6);
    public final long n;

    public gh5(long j) {
        this.n = Long.valueOf(j).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gh5) && this.n == ((gh5) obj).n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 8);
        parcel.writeLong(this.n);
        ud3.S0(parcel, iR0);
    }
}
