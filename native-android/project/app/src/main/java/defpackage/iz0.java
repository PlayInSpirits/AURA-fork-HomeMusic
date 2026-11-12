package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iz0 extends ap3 {
    public static final Parcelable.Creator<iz0> CREATOR = new hz0(0);
    public String n;

    public iz0(Parcel parcel) {
        super(parcel);
        this.n = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.n);
    }

    public iz0() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
