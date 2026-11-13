package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ze4 implements Parcelable {
    public ze4() {
        super();
    }

    public static final Parcelable.Creator<ze4> CREATOR = new j84(4);
    public Long n;

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Long l = this.n;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.n);
    }
}
