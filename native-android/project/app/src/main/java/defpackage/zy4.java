package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zy4 extends ap3 {
    public static final Parcelable.Creator<zy4> CREATOR = new j84(9);
    public boolean n;

    public zy4(Parcel parcel) {
        super(parcel);
        this.n = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public zy4() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
