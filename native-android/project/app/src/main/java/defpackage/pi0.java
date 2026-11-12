package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pi0 implements Parcelable {
    public static final Parcelable.Creator<pi0> CREATOR = null;
    public final long n;

    static {
        CREATOR = new w4(20);
    }

    public pi0(long r1) {
        this.n = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof pi0) == true) goto L9;
        return false;
    L9:
        if (this.n != ((pi0) r6).n) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeLong(this.n);
    }
}
