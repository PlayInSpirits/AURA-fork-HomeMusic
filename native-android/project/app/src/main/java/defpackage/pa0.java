package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pa0 extends h2 {
    public static final Parcelable.Creator<pa0> CREATOR = new rh5(11);
    public final e34 n;
    public final boolean o;
    public final boolean p;
    public final int[] q;
    public final int r;
    public final int[] s;

    public pa0(e34 e34Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.n = e34Var;
        this.o = z;
        this.p = z2;
        this.q = iArr;
        this.r = i;
        this.s = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.M0(parcel, 1, this.n, i);
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ud3.T0(parcel, 3, 4);
        parcel.writeInt(this.p ? 1 : 0);
        int[] iArr = this.q;
        if (iArr != null) {
            int iR1 = ud3.R0(parcel, 4);
            parcel.writeIntArray(iArr);
            ud3.S0(parcel, iR1);
        }
        ud3.T0(parcel, 5, 4);
        parcel.writeInt(this.r);
        int[] iArr2 = this.s;
        if (iArr2 != null) {
            int iR2 = ud3.R0(parcel, 6);
            parcel.writeIntArray(iArr2);
            ud3.S0(parcel, iR2);
        }
        ud3.S0(parcel, iR0);
    }
}
