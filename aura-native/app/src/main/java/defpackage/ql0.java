package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ql0 implements Parcelable {
    public static final Parcelable.Creator<ql0> CREATOR = new w4(21);
    public final int n;

    public ql0(int i) {
        this.n = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql0) && this.n == ((ql0) obj).n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n);
    }

    public final String toString() {
        return b11.j(this.n, "DefaultLazyKey(index=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
    }
}
