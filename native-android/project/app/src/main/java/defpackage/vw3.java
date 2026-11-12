package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vw3 extends k {
    public static final Parcelable.Creator<vw3> CREATOR = null;
    public Parcelable p;

    static {
        CREATOR = new qh4(6);
    }

    public vw3(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        if (r2 != null) goto L6;
        r2 = mw3.class.getClassLoader();
    L6:
        this.p = r1.readParcelable(r2);
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeParcelable(this.p, 0);
    }
}
