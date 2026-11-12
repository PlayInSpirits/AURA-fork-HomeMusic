package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lp3 extends ap3 {
    public static final Parcelable.Creator<lp3> CREATOR = null;
    public final int n;

    static {
        CREATOR = new b23(19);
    }

    public lp3(Parcel r1) {
        super(r1);
        this.n = r1.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.n);
    }

    public lp3(int r2) {
        super(AbsSavedState.EMPTY_STATE);
        this.n = r2;
    }
}
