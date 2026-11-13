package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pi0 implements Parcelable {
    public static final Parcelable.Creator<pi0> CREATOR = new w4(20);
    public final long n;

    public pi0(long j) {
        this.n = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pi0) && this.n == ((pi0) obj).n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.n);
    }
}
