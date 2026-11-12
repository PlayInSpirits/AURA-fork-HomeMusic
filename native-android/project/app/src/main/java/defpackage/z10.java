package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z10 extends k {
    public static final Parcelable.Creator<z10> CREATOR = null;
    public boolean p;

    static {
        CREATOR = new yd3(2);
    }

    public z10(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        boolean r3 = true;
        if (r1.readInt() == 1) goto L6;
        r3 = false;
    L6:
        this.p = r3;
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.p ? 1 : 0);
    }
}
