package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class op4 extends View.BaseSavedState {
    public static final Parcelable.Creator<op4> CREATOR = new j84(8);
    public final boolean n;

    public op4(Parcel parcel) {
        super(parcel);
        this.n = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
    }

    public op4(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.n = z;
    }
}
