package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k84 extends ap3 {
    public static final Parcelable.Creator<k84> CREATOR = new j84(0);
    public int n;
    public int o;
    public int p;

    public k84(Parcel parcel) {
        super(parcel);
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
    }

    public k84() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
