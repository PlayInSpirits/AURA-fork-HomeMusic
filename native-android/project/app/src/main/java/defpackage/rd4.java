package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rd4 extends k {
    public static final Parcelable.Creator<rd4> CREATOR = null;
    public final int p;

    static {
        CREATOR = new qh4(8);
    }

    public rd4(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.p = r1.readInt();
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.p);
    }

    public rd4(SideSheetBehavior r2) {
        super(AbsSavedState.EMPTY_STATE);
        this.p = r2.u;
    }
}
