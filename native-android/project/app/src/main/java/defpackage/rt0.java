package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rt0 implements Parcelable {
    public static final Parcelable.Creator<rt0> CREATOR = new w4(26);
    public final long n;
    public final long o;

    public rt0(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        rr2.l(j >= 0);
        rr2.l(j2 >= 0 || j2 == -1);
        this.n = j;
        this.o = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rt0)) {
            return false;
        }
        rt0 rt0Var = (rt0) obj;
        return this.n == rt0Var.n && this.o == rt0Var.o;
    }

    public final int hashCode() {
        return (((int) this.n) * 961) + ((int) this.o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.n);
        parcel.writeLong(this.o);
    }
}
