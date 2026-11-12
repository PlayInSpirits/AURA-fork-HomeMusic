package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vt extends k {
    public static final Parcelable.Creator<vt> CREATOR = null;
    public final int p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    static {
        CREATOR = new qh4(1);
    }

    public vt(Parcel r3, ClassLoader r4) {
        super(r3, r4);
        this.p = r3.readInt();
        this.q = r3.readInt();
        boolean r0 = false;
        if (r3.readInt() != 1) goto L5;
        boolean r5 = true;
    L6:
        this.r = r5;
        if (r3.readInt() != 1) goto L9;
        boolean r6 = true;
    L10:
        this.s = r6;
        if (r3.readInt() != 1) goto L13;
        r0 = true;
    L13:
        this.t = r0;
        return;
    L9:
        r6 = false;
        goto L10
    L5:
        r5 = false;
        goto L6
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.p);
        r1.writeInt(this.q);
        r1.writeInt(this.r ? 1 : 0);
        r1.writeInt(this.s ? 1 : 0);
        r1.writeInt(this.t ? 1 : 0);
    }

    public vt(BottomSheetBehavior r2) {
        super(AbsSavedState.EMPTY_STATE);
        this.p = r2.Y;
        this.q = r2.r;
        this.r = r2.o;
        this.s = r2.V;
        this.t = r2.W;
    }
}
