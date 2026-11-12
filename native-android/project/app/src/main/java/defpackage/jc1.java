package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jc1 implements Parcelable {
    public static final Parcelable.Creator<jc1> CREATOR = new yd3(4);
    public final Bundle n;

    public jc1(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.n = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.n);
    }

    public jc1(Bundle bundle) {
        this.n = bundle;
    }
}
