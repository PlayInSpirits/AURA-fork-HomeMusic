package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class he0 extends k {
    public static final Parcelable.Creator<he0> CREATOR = null;
    public SparseArray p;

    static {
        CREATOR = new qh4(2);
    }

    public he0(Parcel r6, ClassLoader r7) {
        super(r6, r7);
        int r0 = r6.readInt();
        int[] r1 = new int[r0];
        r6.readIntArray(r1);
        Parcelable[] r8 = r6.readParcelableArray(r7);
        this.p = new SparseArray(r0);
        int r9 = 0;
    L3:
        if (r9 >= r0) goto L5;
        this.p.append(r1[r9], r8[r9]);
        r9 = r9 + 1;
        goto L3
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        super.writeToParcel(r6, r7);
        SparseArray r0 = this.p;
        int r1 = 0;
        if (r0 == null) goto L5;
        int r2 = r0.size();
    L6:
        r6.writeInt(r2);
        int[] r3 = new int[r2];
        Parcelable[] r4 = new Parcelable[r2];
    L7:
        if (r1 >= r2) goto L9;
        r3[r1] = this.p.keyAt(r1);
        r4[r1] = (Parcelable) this.p.valueAt(r1);
        r1 = r1 + 1;
        goto L7
    L9:
        r6.writeIntArray(r3);
        r6.writeParcelableArray(r4, r7);
        return;
    L5:
        r2 = 0;
        goto L6
    }
}
