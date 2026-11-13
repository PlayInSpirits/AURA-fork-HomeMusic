package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qk5 extends h2 {
    public static final Parcelable.Creator<qk5> CREATOR = new rh5(15);
    public final long n;
    public final rj5 o;
    public final rj5 p;
    public final rj5 q;

    public qk5(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ji2.m(bArr);
        rj5 i = rj5.i(bArr.length, bArr);
        ji2.m(bArr2);
        rj5 i2 = rj5.i(bArr2.length, bArr2);
        ji2.m(bArr3);
        rj5 i3 = rj5.i(bArr3.length, bArr3);
        this.n = j;
        this.o = i;
        this.p = i2;
        this.q = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qk5)) {
            return false;
        }
        qk5 qk5Var = (qk5) obj;
        return this.n == qk5Var.n && au0.n(this.o, qk5Var.o) && au0.n(this.p, qk5Var.p) && au0.n(this.q, qk5Var.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.n), this.o, this.p, this.q});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 8);
        parcel.writeLong(this.n);
        ud3.L0(parcel, 2, this.o.j());
        ud3.L0(parcel, 3, this.p.j());
        ud3.L0(parcel, 4, this.q.j());
        ud3.S0(parcel, R0);
    }
}
