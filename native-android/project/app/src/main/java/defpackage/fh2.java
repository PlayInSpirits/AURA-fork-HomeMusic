package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fh2 extends k {
    public static final Parcelable.Creator<fh2> CREATOR = null;
    public boolean p;

    static {
        CREATOR = new qh4(4);
    }

    public fh2(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        if (r2 != null) goto L5;
        fh2.class.getClassLoader();
    L5:
        boolean r3 = true;
        if (r1.readInt() == 1) goto L9;
        r3 = false;
    L9:
        this.p = r3;
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.p ? 1 : 0);
    }
}
