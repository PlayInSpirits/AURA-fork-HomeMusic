package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk4 implements Parcelable {
    public static final Parcelable.Creator<pk4> CREATOR = null;
    public int n;
    public int o;
    public int[] p;
    public boolean q;

    static {
        CREATOR = new j84(5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.n + ", mGapDir=" + this.o + ", mHasUnwantedGapAfter=" + this.q + ", mGapPerSpan=" + Arrays.toString(this.p) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.n);
        r2.writeInt(this.o);
        r2.writeInt(this.q ? 1 : 0);
        int[] r4 = this.p;
        if (r4 != null) goto L5;
    L8:
        r2.writeInt(0);
        return;
    L5:
        if (r4.length <= 0) goto L8;
        r2.writeInt(r4.length);
        r2.writeIntArray(this.p);
    }
}
