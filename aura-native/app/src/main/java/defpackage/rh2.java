package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rh2 extends View.BaseSavedState {
    public rh2(android.os.Parcel a0) {
        super(a0);
    }

    public rh2(android.os.Parcelable a0) {
        super(a0);
    }

    public static final Parcelable.Creator<rh2> CREATOR = new hz0(16);
    public int n;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.n;
        return b11.q(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.n));
    }
}
