package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class op4 extends View.BaseSavedState {
    public static final Parcelable.Creator<op4> CREATOR = null;
    public final boolean n;

    static {
        CREATOR = new j84(8);
    }

    public op4(Parcel r1) {
        super(r1);
        if (r1.readByte() == 0) goto L5;
        boolean r2 = true;
    L6:
        this.n = r2;
        return;
    L5:
        r2 = false;
        goto L6
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeByte(this.n ? 1 : 0);
    }

    public op4(Parcelable r1, boolean r2) {
        super(r1);
        this.n = r2;
    }
}
