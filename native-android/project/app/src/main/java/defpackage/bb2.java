package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bb2 implements Parcelable {
    public static final Parcelable.Creator<bb2> CREATOR = null;
    public int n;
    public int o;
    public boolean p;

    static {
        CREATOR = new hz0(14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.n);
        r1.writeInt(this.o);
        r1.writeInt(this.p ? 1 : 0);
    }
}
