package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zi5 extends h2 {
    public static final Parcelable.Creator<zi5> CREATOR = new rh5(5);
    public final rj5 n;
    public final rj5 o;

    public zi5(rj5 rj5Var, rj5 rj5Var2) {
        this.n = rj5Var;
        this.o = rj5Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zi5)) {
            return false;
        }
        zi5 zi5Var = (zi5) obj;
        return au0.n(this.n, zi5Var.n) && au0.n(this.o, zi5Var.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        rj5 rj5Var = this.n;
        ud3.L0(parcel, 1, rj5Var == null ? null : rj5Var.j());
        rj5 rj5Var2 = this.o;
        ud3.L0(parcel, 2, rj5Var2 != null ? rj5Var2.j() : null);
        ud3.S0(parcel, iR0);
    }
}
