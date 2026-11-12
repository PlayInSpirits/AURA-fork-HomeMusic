package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h53 extends View.BaseSavedState {
    public static final Parcelable.Creator<h53> CREATOR = null;
    public int n;

    static {
        CREATOR = new b23(2);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("HorizontalScrollView.SavedState{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" scrollPosition=");
        return f34.i(r0, this.n, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.n);
    }
}
