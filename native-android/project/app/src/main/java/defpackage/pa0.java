package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pa0 extends h2 {
    public static final Parcelable.Creator<pa0> CREATOR = null;
    public final e34 n;
    public final boolean o;
    public final boolean p;
    public final int[] q;
    public final int r;
    public final int[] s;

    static {
        CREATOR = new rh5(11);
    }

    public pa0(e34 r1, boolean r2, boolean r3, int[] r4, int r5, int[] r6) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r0 = ud3.R0(r4, 20293);
        ud3.M0(r4, 1, this.n, r5);
        ud3.T0(r4, 2, 4);
        r4.writeInt(this.o ? 1 : 0);
        ud3.T0(r4, 3, 4);
        r4.writeInt(this.p ? 1 : 0);
        int[] r6 = this.q;
        if (r6 == null) goto L6;
        int r2 = ud3.R0(r4, 4);
        r4.writeIntArray(r6);
        ud3.S0(r4, r2);
    L6:
        ud3.T0(r4, 5, 4);
        r4.writeInt(this.r);
        int[] r3 = this.s;
        if (r3 == null) goto L10;
        int r7 = ud3.R0(r4, 6);
        r4.writeIntArray(r3);
        ud3.S0(r4, r7);
    L10:
        ud3.S0(r4, r0);
    }
}
