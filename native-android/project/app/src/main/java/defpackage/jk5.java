package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jk5 extends h2 {
    public static final Parcelable.Creator<jk5> CREATOR = null;
    public Bundle n;
    public p61[] o;
    public int p;
    public pa0 q;

    static {
        CREATOR = new rh5(9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r0 = ud3.R0(r5, 20293);
        ud3.K0(r5, 1, this.n);
        ud3.P0(r5, 2, this.o, r6);
        int r1 = this.p;
        ud3.T0(r5, 3, 4);
        r5.writeInt(r1);
        ud3.M0(r5, 4, this.q, r6);
        ud3.S0(r5, r0);
    }
}
