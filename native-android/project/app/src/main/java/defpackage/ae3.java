package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ae3 extends SparseArray implements Parcelable {
    public static final Parcelable.Creator<ae3> CREATOR = null;

    static {
        CREATOR = new yd3(6);
    }

    public ae3(Parcel r5, ClassLoader r6) {
        int r0 = r5.readInt();
        int[] r1 = new int[r0];
        r5.readIntArray(r1);
        Parcelable[] r7 = r5.readParcelableArray(r6);
        int r8 = 0;
    L3:
        if (r8 >= r0) goto L5;
        put(r1[r8], r7[r8]);
        r8 = r8 + 1;
        goto L3
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        int r0 = size();
        int[] r1 = new int[r0];
        Parcelable[] r2 = new Parcelable[r0];
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        r1[r3] = keyAt(r3);
        r2[r3] = (Parcelable) valueAt(r3);
        r3 = r3 + 1;
        goto L3
    L5:
        r6.writeInt(r0);
        r6.writeIntArray(r1);
        r6.writeParcelableArray(r2, r7);
    }
}
