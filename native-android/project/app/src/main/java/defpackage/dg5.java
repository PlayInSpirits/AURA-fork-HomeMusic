package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dg5 extends h2 {
    public static final Parcelable.Creator<dg5> CREATOR = null;
    public final int n;
    public final ka0 o;
    public final ig5 p;

    static {
        CREATOR = new j84(16);
    }

    public dg5(int r1, ka0 r2, ig5 r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r0 = ud3.R0(r4, 20293);
        ud3.T0(r4, 1, 4);
        r4.writeInt(this.n);
        ud3.M0(r4, 2, this.o, r5);
        ud3.M0(r4, 3, this.p, r5);
        ud3.S0(r4, r0);
    }
}
