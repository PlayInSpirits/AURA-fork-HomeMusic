package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vr3 extends h2 {
    public static final Parcelable.Creator<vr3> CREATOR = new ch5(14);
    public final String n;
    public final String o;
    public final rj5 p;
    public final kn q;
    public final jn r;
    public final ln s;
    public final hn t;
    public final String u;

    public vr3(String str, String str2, byte[] bArr, kn knVar, jn jnVar, ln lnVar, hn hnVar, String str3) {
        rj5 rj5VarI = bArr == null ? null : rj5.i(bArr.length, bArr);
        boolean z = false;
        ji2.h("Must provide a response object.", (knVar != null && jnVar == null && lnVar == null) || (knVar == null && jnVar != null && lnVar == null) || (knVar == null && jnVar == null && lnVar != null));
        if (lnVar != null || (str != null && rj5VarI != null)) {
            z = true;
        }
        ji2.h("Must provide id and rawId if not an error response.", z);
        this.n = str;
        this.o = str2;
        this.p = rj5VarI;
        this.q = knVar;
        this.r = jnVar;
        this.s = lnVar;
        this.t = hnVar;
        this.u = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vr3)) {
            return false;
        }
        vr3 vr3Var = (vr3) obj;
        return au0.n(this.n, vr3Var.n) && au0.n(this.o, vr3Var.o) && au0.n(this.p, vr3Var.p) && au0.n(this.q, vr3Var.q) && au0.n(this.r, vr3Var.r) && au0.n(this.s, vr3Var.s) && au0.n(this.t, vr3Var.t) && au0.n(this.u, vr3Var.u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, this.r, this.q, this.s, this.t, this.u});
    }

    public final String toString() {
        rj5 rj5Var = this.p;
        String strN = ya4.n(rj5Var == null ? null : rj5Var.j());
        String strValueOf = String.valueOf(this.q);
        String strValueOf2 = String.valueOf(this.r);
        String strValueOf3 = String.valueOf(this.s);
        String strValueOf4 = String.valueOf(this.t);
        StringBuilder sbU = b11.u("PublicKeyCredential{\n id='", this.n, "', \n type='", this.o, "', \n rawId=");
        f34.n(sbU, strN, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        f34.n(sbU, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        sbU.append(strValueOf4);
        sbU.append(", \n authenticatorAttachment='");
        sbU.append(this.u);
        sbU.append("'}");
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        gk5.a.b();
        throw null;
    }
}
