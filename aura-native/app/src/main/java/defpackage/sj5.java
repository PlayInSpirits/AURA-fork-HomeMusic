package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sj5 extends h2 {
    public static final Parcelable.Creator<sj5> CREATOR = new rh5(6);
    public final boolean n;
    public final rj5 o;

    public sj5(boolean z, rj5 rj5Var) {
        this.n = z;
        this.o = rj5Var;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.n) {
                jSONObject.put("enabled", true);
            }
            rj5 rj5Var = this.o;
            byte[] j = rj5Var == null ? null : rj5Var.j();
            if (j != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(j, 32), 11));
                if (j.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(j, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            nz2.s("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sj5)) {
            return false;
        }
        sj5 sj5Var = (sj5) obj;
        return this.n == sj5Var.n && au0.n(this.o, sj5Var.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.n), this.o});
    }

    public final String toString() {
        return xa3.h("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n ? 1 : 0);
        rj5 rj5Var = this.o;
        ud3.L0(parcel, 2, rj5Var == null ? null : rj5Var.j());
        ud3.S0(parcel, R0);
    }
}
