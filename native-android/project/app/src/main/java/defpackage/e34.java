package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e34 extends h2 {
    public static final Parcelable.Creator<e34> CREATOR = null;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final int r;

    static {
        CREATOR = new ch5(11);
    }

    public e34(int r1, boolean r2, boolean r3, int r4, int r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 4);
        r3.writeInt(this.n);
        ud3.T0(r3, 2, 4);
        r3.writeInt(this.o ? 1 : 0);
        ud3.T0(r3, 3, 4);
        r3.writeInt(this.p ? 1 : 0);
        ud3.T0(r3, 4, 4);
        r3.writeInt(this.q);
        ud3.T0(r3, 5, 4);
        r3.writeInt(this.r);
        ud3.S0(r3, r5);
    }
}
