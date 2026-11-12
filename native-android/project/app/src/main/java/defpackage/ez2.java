package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ez2 extends ap3 {
    public static final Parcelable.Creator<ez2> CREATOR = null;
    public HashSet n;

    static {
        CREATOR = new hz0(28);
    }

    public ez2(Parcel r3) {
        super(r3);
        int r0 = r3.readInt();
        this.n = new HashSet();
        String[] r1 = new String[r0];
        r3.readStringArray(r1);
        Collections.addAll(this.n, r1);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.n.size());
        HashSet r0 = this.n;
        r1.writeStringArray((String[]) r0.toArray(new String[r0.size()]));
    }

    public ez2() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
