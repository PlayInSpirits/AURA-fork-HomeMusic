package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rd4 extends k {
    public static final Parcelable.Creator<rd4> CREATOR = new qh4(8);
    public final int p;

    public rd4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.p = parcel.readInt();
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.p);
    }

    public rd4(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.p = sideSheetBehavior.u;
    }
}
