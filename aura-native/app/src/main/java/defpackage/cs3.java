package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class cs3 extends h2 {
    public static final Parcelable.Creator<cs3> CREATOR = new ch5(19);
    public final rj5 n;
    public final String o;
    public final String p;
    public final String q;

    public cs3(String str, String str2, String str3, byte[] bArr) {
        ji2.m(bArr);
        this.n = rj5.i(bArr.length, bArr);
        ji2.m(str);
        this.o = str;
        this.p = str2;
        ji2.m(str3);
        this.q = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cs3)) {
            return false;
        }
        cs3 cs3Var = (cs3) obj;
        return au0.n(this.n, cs3Var.n) && au0.n(this.o, cs3Var.o) && au0.n(this.p, cs3Var.p) && au0.n(this.q, cs3Var.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, this.q});
    }

    public final String toString() {
        StringBuilder j = xa3.j("PublicKeyCredentialUserEntity{\n id=", ya4.n(this.n.j()), ", \n name='");
        j.append(this.o);
        j.append("', \n icon='");
        j.append(this.p);
        j.append("', \n displayName='");
        return b11.q(j, this.q, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.L0(parcel, 2, this.n.j());
        ud3.O0(parcel, 3, this.o);
        ud3.O0(parcel, 4, this.p);
        ud3.O0(parcel, 5, this.q);
        ud3.S0(parcel, R0);
    }
}
