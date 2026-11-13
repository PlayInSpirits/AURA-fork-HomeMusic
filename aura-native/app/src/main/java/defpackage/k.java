package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class k implements Parcelable {
    public final Parcelable n;
    public static final j o = new j();
    public static final Parcelable.Creator<k> CREATOR = new yd3(1);

    public k(Parcelable parcelable) {
        if (parcelable != null) {
            this.n = parcelable == o ? null : parcelable;
        } else {
            kf2.n("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.n, i);
    }

    public k() {
        this.n = null;
    }

    public k(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.n = readParcelable == null ? o : readParcelable;
    }
}
