package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jn extends mn {
    public static final Parcelable.Creator<jn> CREATOR = new rh5(7);
    public final rj5 n;
    public final rj5 o;
    public final rj5 p;
    public final rj5 q;
    public final rj5 r;

    public jn(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ji2.m(bArr);
        rj5 i = rj5.i(bArr.length, bArr);
        ji2.m(bArr2);
        rj5 i2 = rj5.i(bArr2.length, bArr2);
        ji2.m(bArr3);
        rj5 i3 = rj5.i(bArr3.length, bArr3);
        ji2.m(bArr4);
        rj5 i4 = rj5.i(bArr4.length, bArr4);
        rj5 i5 = bArr5 == null ? null : rj5.i(bArr5.length, bArr5);
        this.n = i;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", ya4.n(this.o.j()));
            jSONObject.put("authenticatorData", ya4.n(this.p.j()));
            jSONObject.put("signature", ya4.n(this.q.j()));
            rj5 rj5Var = this.r;
            if (rj5Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", ya4.n(rj5Var == null ? null : rj5Var.j()));
            return jSONObject;
        } catch (JSONException e) {
            nz2.s("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jn)) {
            return false;
        }
        jn jnVar = (jn) obj;
        return au0.n(this.n, jnVar.n) && au0.n(this.o, jnVar.o) && au0.n(this.p, jnVar.p) && au0.n(this.q, jnVar.q) && au0.n(this.r, jnVar.r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.n})), Integer.valueOf(Arrays.hashCode(new Object[]{this.o})), Integer.valueOf(Arrays.hashCode(new Object[]{this.p})), Integer.valueOf(Arrays.hashCode(new Object[]{this.q})), Integer.valueOf(Arrays.hashCode(new Object[]{this.r}))});
    }

    public final String toString() {
        ns3 ns3Var = new ns3(getClass().getSimpleName());
        ij5 ij5Var = kj5.d;
        byte[] j = this.n.j();
        ns3Var.h(ij5Var.c(j.length, j), "keyHandle");
        byte[] j2 = this.o.j();
        ns3Var.h(ij5Var.c(j2.length, j2), "clientDataJSON");
        byte[] j3 = this.p.j();
        ns3Var.h(ij5Var.c(j3.length, j3), "authenticatorData");
        byte[] j4 = this.q.j();
        ns3Var.h(ij5Var.c(j4.length, j4), "signature");
        rj5 rj5Var = this.r;
        byte[] j5 = rj5Var == null ? null : rj5Var.j();
        if (j5 != null) {
            ns3Var.h(ij5Var.c(j5.length, j5), "userHandle");
        }
        return ns3Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.L0(parcel, 2, this.n.j());
        ud3.L0(parcel, 3, this.o.j());
        ud3.L0(parcel, 4, this.p.j());
        ud3.L0(parcel, 5, this.q.j());
        rj5 rj5Var = this.r;
        ud3.L0(parcel, 6, rj5Var == null ? null : rj5Var.j());
        ud3.S0(parcel, R0);
    }
}
