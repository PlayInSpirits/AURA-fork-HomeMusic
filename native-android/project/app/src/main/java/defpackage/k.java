package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = null;
    public static final j o = null;
    public final Parcelable n;

    static {
        o = new j();
        CREATOR = new yd3(1);
    }

    public k(Parcelable r3) {
        if (r3 != null) goto L5;
        kf2.n("superState must not be null");
        throw null;
    L5:
        if (r3 != o) goto L8;
        r3 = null;
    L8:
        this.n = r3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeParcelable(this.n, r2);
    }

    public k() {
        this.n = null;
    }

    public k(Parcel r1, ClassLoader r2) {
        Parcelable r3 = r1.readParcelable(r2);
        if (r3 != null) goto L6;
        r3 = o;
    L6:
        this.n = r3;
    }
}
