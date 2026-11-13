package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class he0 extends k {
    public he0(android.os.Parcelable a0) {
        super(a0);
    }

    public static final Parcelable.Creator<he0> CREATOR = new qh4(2);
    public SparseArray p;

    public he0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.p = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.p.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.p;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.p.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.p.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
