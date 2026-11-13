package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ro implements Parcelable {
    public static final Parcelable.Creator<ro> CREATOR = new w4(9);
    public final ArrayList n;
    public final ArrayList o;

    public ro(Parcel parcel) {
        this.n = parcel.createStringArrayList();
        this.o = parcel.createTypedArrayList(qo.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.n);
        parcel.writeTypedList(this.o);
    }

    public ro(ArrayList arrayList, ArrayList arrayList2) {
        this.n = arrayList;
        this.o = arrayList2;
    }
}
