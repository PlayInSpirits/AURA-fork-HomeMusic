package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vt extends k {
    public static final Parcelable.Creator<vt> CREATOR = new qh4(1);
    public final int p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    public vt(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt() == 1;
        this.s = parcel.readInt() == 1;
        this.t = parcel.readInt() == 1;
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
    }

    public vt(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.p = bottomSheetBehavior.Y;
        this.q = bottomSheetBehavior.r;
        this.r = bottomSheetBehavior.o;
        this.s = bottomSheetBehavior.V;
        this.t = bottomSheetBehavior.W;
    }
}
