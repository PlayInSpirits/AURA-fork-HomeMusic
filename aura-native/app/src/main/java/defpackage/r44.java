package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r44 extends h2 {
    public static final Parcelable.Creator<r44> CREATOR = new j84(28);
    public final vd4 n;
    public final String o;
    public final int p;

    public r44(vd4 vd4Var, String str, int i) {
        ji2.m(vd4Var);
        this.n = vd4Var;
        this.o = str;
        this.p = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r44)) {
            return false;
        }
        r44 r44Var = (r44) obj;
        return au0.n(this.n, r44Var.n) && au0.n(this.o, r44Var.o) && this.p == r44Var.p;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.M0(parcel, 1, this.n, i);
        ud3.O0(parcel, 2, this.o);
        ud3.T0(parcel, 3, 4);
        parcel.writeInt(this.p);
        ud3.S0(parcel, R0);
    }
}
