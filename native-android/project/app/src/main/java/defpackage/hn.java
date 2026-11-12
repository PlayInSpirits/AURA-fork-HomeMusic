package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hn extends h2 {
    public static final Parcelable.Creator<hn> CREATOR = new rh5(1);
    public final g35 n;
    public final zi5 o;
    public final in p;
    public final sj5 q;
    public final String r;

    public hn(g35 g35Var, zi5 zi5Var, in inVar, sj5 sj5Var, String str) {
        this.n = g35Var;
        this.o = zi5Var;
        this.p = inVar;
        this.q = sj5Var;
        this.r = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            in inVar = this.p;
            if (inVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", inVar.n);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            g35 g35Var = this.n;
            if (g35Var != null) {
                jSONObject.put("uvm", g35Var.b());
            }
            sj5 sj5Var = this.q;
            if (sj5Var != null) {
                jSONObject.put("prf", sj5Var.b());
            }
            String str = this.r;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            nz2.s("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) obj;
        return au0.n(this.n, hnVar.n) && au0.n(this.o, hnVar.o) && au0.n(this.p, hnVar.p) && au0.n(this.q, hnVar.q) && au0.n(this.r, hnVar.r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, this.q, this.r});
    }

    public final String toString() {
        return xa3.h("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.M0(parcel, 1, this.n, i);
        ud3.M0(parcel, 2, this.o, i);
        ud3.M0(parcel, 3, this.p, i);
        ud3.M0(parcel, 4, this.q, i);
        ud3.O0(parcel, 5, this.r);
        ud3.S0(parcel, iR0);
    }
}
