package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vd4 extends h2 {
    public static final Parcelable.Creator<vd4> CREATOR = new ch5(2);
    public final String n;
    public final String o;

    public vd4(String str, String str2) {
        ji2.n(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        ji2.l(strTrim, "Account identifier cannot be empty");
        this.n = strTrim;
        ji2.k(str2);
        this.o = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vd4)) {
            return false;
        }
        vd4 vd4Var = (vd4) obj;
        return au0.n(this.n, vd4Var.n) && au0.n(this.o, vd4Var.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 1, this.n);
        ud3.O0(parcel, 2, this.o);
        ud3.S0(parcel, iR0);
    }
}
