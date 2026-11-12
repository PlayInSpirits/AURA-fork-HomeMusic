package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zy4 extends ap3 {
    public static final Parcelable.Creator<zy4> CREATOR = null;
    public boolean n;

    static {
        CREATOR = new j84(9);
    }

    public zy4(Parcel r2) {
        super(r2);
        boolean r0 = true;
        if (r2.readInt() == 1) goto L6;
        r0 = false;
    L6:
        this.n = r0;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.n ? 1 : 0);
    }

    public zy4() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
