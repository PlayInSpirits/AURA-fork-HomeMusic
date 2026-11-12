package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hn extends h2 {
    public static final Parcelable.Creator<hn> CREATOR = null;
    public final g35 n;
    public final zi5 o;
    public final in p;
    public final sj5 q;
    public final String r;

    static {
        CREATOR = new rh5(1);
    }

    public hn(g35 r1, zi5 r2, in r3, sj5 r4, String r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    public final JSONObject b() {
        JSONObject r0 = new JSONObject();     // Catch: JSONException -> L20
        in r1 = this.p;     // Catch: JSONException -> L20
        if (r1 != null) goto L24;
    L10:
        g35 r2 = this.n;     // Catch: JSONException -> L20
        if (r2 == null) goto L13;
        r0.put("uvm", r2.b());     // Catch: JSONException -> L20
    L13:
        sj5 r3 = this.q;     // Catch: JSONException -> L20
        if (r3 == null) goto L16;
        r0.put("prf", r3.b());     // Catch: JSONException -> L20
    L16:
        String r5 = this.r;     // Catch: JSONException -> L20
        if (r5 == null) goto L19;
        r0.put("txAuthSimple", r5);     // Catch: JSONException -> L20
    L19:
        return r0;
    L24:
        JSONObject r4 = new JSONObject();     // Catch: JSONException -> L7
        r4.put("rk", r1.n);     // Catch: JSONException -> L7
        r0.put("credProps", r4);     // Catch: JSONException -> L20
        goto L10
    L7:
        e = move-exception;
        throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);     // Catch: JSONException -> L20
    L20:
        e = move-exception;
        nz2.s("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e);
        return null;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof hn) == true) goto L5;
        return false;
    L5:
        hn r5 = (hn) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L17:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L17;
        if (au0.n(this.p, r5.p) == false) goto L17;
        if (au0.n(this.q, r5.q) == false) goto L17;
        if (au0.n(this.r, r5.r) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        sj5 r0 = this.q;
        String r1 = this.r;
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, r0, r1});
    }

    public final String toString() {
        return xa3.h("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r0 = ud3.R0(r4, 20293);
        ud3.M0(r4, 1, this.n, r5);
        ud3.M0(r4, 2, this.o, r5);
        ud3.M0(r4, 3, this.p, r5);
        ud3.M0(r4, 4, this.q, r5);
        ud3.O0(r4, 5, this.r);
        ud3.S0(r4, r0);
    }
}
