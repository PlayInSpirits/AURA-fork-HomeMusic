package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.t45;
import defpackage.u45;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b23(4);
    public final u45 n;

    public ParcelImpl(Parcel parcel) {
        this.n = new t45(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new t45(parcel).l(this.n);
    }

    public ParcelImpl(u45 u45Var) {
        this.n = u45Var;
    }
}
