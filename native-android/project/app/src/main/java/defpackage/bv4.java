package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bv4 extends k {
    public static final Parcelable.Creator<bv4> CREATOR = new qh4(9);
    public int p;
    public boolean q;

    public bv4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.p = parcel.readInt();
        this.q = parcel.readInt() != 0;
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q ? 1 : 0);
    }
}
