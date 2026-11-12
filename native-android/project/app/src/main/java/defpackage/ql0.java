package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ql0 implements Parcelable {
    public static final Parcelable.Creator<ql0> CREATOR = null;
    public final int n;

    static {
        CREATOR = new w4(21);
    }

    public ql0(int r1) {
        this.n = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof ql0) == true) goto L9;
        return false;
    L9:
        if (this.n == ((ql0) r4).n) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n);
    }

    public final String toString() {
        return b11.j(this.n, "DefaultLazyKey(index=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.n);
    }
}
