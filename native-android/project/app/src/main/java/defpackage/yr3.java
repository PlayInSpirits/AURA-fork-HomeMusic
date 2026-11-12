package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yr3 extends h2 {
    public static final Parcelable.Creator<yr3> CREATOR;
    public final bs3 n;
    public final rj5 o;
    public final List p;

    static {
        gi5.g(2, gi1.i, gi1.j);
        CREATOR = new ch5(15);
    }

    public yr3(String str, byte[] bArr, ArrayList arrayList) {
        rj5 rj5Var = rj5.p;
        rj5 rj5VarI = rj5.i(bArr.length, bArr);
        ji2.m(str);
        try {
            this.n = bs3.a(str);
            this.o = rj5VarI;
            this.p = arrayList;
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yr3)) {
            return false;
        }
        yr3 yr3Var = (yr3) obj;
        List list = yr3Var.p;
        if (!this.n.equals(yr3Var.n) || !au0.n(this.o, yr3Var.o)) {
            return false;
        }
        List list2 = this.p;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.n);
        String strN = ya4.n(this.o.j());
        return b11.q(b11.u("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strN, ", \n transports="), String.valueOf(this.p), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        this.n.getClass();
        ud3.O0(parcel, 2, "public-key");
        ud3.L0(parcel, 3, this.o.j());
        ud3.Q0(parcel, 4, this.p);
        ud3.S0(parcel, iR0);
    }
}
