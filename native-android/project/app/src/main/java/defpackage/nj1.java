package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nj1 extends h2 {
    public static final Parcelable.Creator<nj1> CREATOR = null;
    public final int n;
    public final int o;
    public final Bundle p;

    static {
        CREATOR = new j84(10);
    }

    public nj1(int r1, int r2, Bundle r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 4);
        r3.writeInt(this.n);
        ud3.T0(r3, 2, 4);
        r3.writeInt(this.o);
        ud3.K0(r3, 3, this.p);
        ud3.S0(r3, r5);
    }
}
