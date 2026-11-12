package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lh1 extends h2 {
    public static final Parcelable.Creator<lh1> CREATOR = null;
    public final uf0 n;

    static {
        CREATOR = new hz0(7);
    }

    public lh1(uf0 r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        int r0 = ud3.R0(r3, 20293);
        ud3.M0(r3, 1, this.n, r4);
        ud3.S0(r3, r0);
    }
}
