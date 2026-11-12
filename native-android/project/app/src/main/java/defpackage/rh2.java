package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rh2 extends View.BaseSavedState {
    public static final Parcelable.Creator<rh2> CREATOR = null;
    public int n;

    static {
        CREATOR = new hz0(16);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("MaterialCheckBox.SavedState{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" CheckedState=");
        int r2 = this.n;
        if (r2 != 1) goto L5;
        String r3 = "checked";
    L10:
        return b11.q(r0, r3, "}");
    L5:
        if (r2 == 2) goto L7;
        r3 = "unchecked";
        goto L10
    L7:
        r3 = "indeterminate";
        goto L10
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeValue(Integer.valueOf(this.n));
    }
}
