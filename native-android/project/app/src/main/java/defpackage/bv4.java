package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bv4 extends k {
    public static final Parcelable.Creator<bv4> CREATOR = null;
    public int p;
    public boolean q;

    static {
        CREATOR = new qh4(9);
    }

    public bv4(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.p = r1.readInt();
        if (r1.readInt() == 0) goto L5;
        boolean r3 = true;
    L6:
        this.q = r3;
        return;
    L5:
        r3 = false;
        goto L6
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.p);
        r1.writeInt(this.q ? 1 : 0);
    }
}
