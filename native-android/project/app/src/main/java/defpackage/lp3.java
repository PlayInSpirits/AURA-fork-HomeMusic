package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lp3 extends ap3 {
    public static final Parcelable.Creator<lp3> CREATOR = new b23(19);
    public final int n;

    public lp3(Parcel parcel) {
        super(parcel);
        this.n = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.n);
    }

    public lp3(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.n = i;
    }
}
