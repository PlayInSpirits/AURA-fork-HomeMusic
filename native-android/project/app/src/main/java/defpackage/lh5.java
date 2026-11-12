package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lh5 extends h2 {
    public static final Parcelable.Creator<lh5> CREATOR = new ch5(10);
    public final rj5 n;
    public final rj5 o;
    public final rj5 p;
    public final int q;

    public lh5(rj5 rj5Var, rj5 rj5Var2, rj5 rj5Var3, int i) {
        this.n = rj5Var;
        this.o = rj5Var2;
        this.p = rj5Var3;
        this.q = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lh5)) {
            return false;
        }
        lh5 lh5Var = (lh5) obj;
        return au0.n(this.n, lh5Var.n) && au0.n(this.o, lh5Var.o) && au0.n(this.p, lh5Var.p) && this.q == lh5Var.q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, Integer.valueOf(this.q)});
    }

    public final String toString() {
        rj5 rj5Var = this.n;
        String strN = ya4.n(rj5Var == null ? null : rj5Var.j());
        rj5 rj5Var2 = this.o;
        String strN2 = ya4.n(rj5Var2 == null ? null : rj5Var2.j());
        rj5 rj5Var3 = this.p;
        String strN3 = ya4.n(rj5Var3 != null ? rj5Var3.j() : null);
        StringBuilder sbU = b11.u("HmacSecretExtension{coseKeyAgreement=", strN, ", saltEnc=", strN2, ", saltAuth=");
        sbU.append(strN3);
        sbU.append(", getPinUvAuthProtocol=");
        return f34.i(sbU, this.q, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        rj5 rj5Var = this.n;
        ud3.L0(parcel, 1, rj5Var == null ? null : rj5Var.j());
        rj5 rj5Var2 = this.o;
        ud3.L0(parcel, 2, rj5Var2 == null ? null : rj5Var2.j());
        rj5 rj5Var3 = this.p;
        ud3.L0(parcel, 3, rj5Var3 != null ? rj5Var3.j() : null);
        ud3.T0(parcel, 4, 4);
        parcel.writeInt(this.q);
        ud3.S0(parcel, iR0);
    }
}
