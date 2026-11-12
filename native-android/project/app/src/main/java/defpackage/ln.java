package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ln extends mn {
    public static final Parcelable.Creator<ln> CREATOR = new rh5(10);
    public final c21 n;
    public final String o;
    public final int p;

    public ln(String str, int i, int i2) {
        try {
            this.n = c21.a(i);
            this.o = str;
            this.p = i2;
        } catch (ErrorCode$UnsupportedErrorCodeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ln)) {
            return false;
        }
        ln lnVar = (ln) obj;
        return au0.n(this.n, lnVar.n) && au0.n(this.o, lnVar.o) && au0.n(Integer.valueOf(this.p), Integer.valueOf(lnVar.p));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, Integer.valueOf(this.p)});
    }

    public final String toString() {
        ns3 ns3Var = new ns3(getClass().getSimpleName());
        String strValueOf = String.valueOf(this.n.n);
        sh5 sh5Var = new sh5(11);
        ((c12) ns3Var.q).q = sh5Var;
        ns3Var.q = sh5Var;
        sh5Var.p = strValueOf;
        sh5Var.o = "errorCode";
        String str = this.o;
        if (str != null) {
            ns3Var.h(str, "errorMessage");
        }
        return ns3Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        int i2 = this.n.n;
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(i2);
        ud3.O0(parcel, 3, this.o);
        ud3.T0(parcel, 4, 4);
        parcel.writeInt(this.p);
        ud3.S0(parcel, iR0);
    }
}
