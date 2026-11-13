package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pk4 implements Parcelable {
    public pk4() {
        super();
    }

    public static final Parcelable.Creator<pk4> CREATOR = new j84(5);
    public int n;
    public int o;
    public int[] p;
    public boolean q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.n + ", mGapDir=" + this.o + ", mHasUnwantedGapAfter=" + this.q + ", mGapPerSpan=" + Arrays.toString(this.p) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.q ? 1 : 0);
        int[] iArr = this.p;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.p);
        }
    }
}
