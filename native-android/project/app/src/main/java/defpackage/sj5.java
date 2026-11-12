package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sj5 extends h2 {
    public static final Parcelable.Creator<sj5> CREATOR = null;
    public final boolean n;
    public final rj5 o;

    static {
        CREATOR = new rh5(6);
    }

    public sj5(boolean r1, rj5 r2) {
        this.n = r1;
        this.o = r2;
    }

    public final JSONObject b() {
        JSONObject r1 = new JSONObject();     // Catch: JSONException -> L6
        if (this.n == false) goto L8;
        r1.put("enabled", true);     // Catch: JSONException -> L6
    L8:
        rj5 r7 = this.o;     // Catch: JSONException -> L6
        if (r7 != null) goto L11;
        byte[] r8 = null;
    L12:
        if (r8 == null) goto L17;
        JSONObject r2 = new JSONObject();     // Catch: JSONException -> L6
        r2.put("first", Base64.encodeToString(Arrays.copyOf(r8, 32), 11));     // Catch: JSONException -> L6
        if (r8.length != 64) goto L16;
        r2.put("second", Base64.encodeToString(Arrays.copyOfRange(r8, 32, 64), 11));     // Catch: JSONException -> L6
    L16:
        r1.put("results", r2);     // Catch: JSONException -> L6
    L17:
        return r1;
    L11:
        r8 = r7.j();     // Catch: JSONException -> L6
    L6:
        e = move-exception;
        nz2.s("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        return null;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof sj5) == true) goto L5;
        return false;
    L5:
        sj5 r5 = (sj5) r4;
        if (this.n == r5.n) goto L8;
    L11:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.n), this.o});
    }

    public final String toString() {
        return xa3.h("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 4);
        r3.writeInt(this.n ? 1 : 0);
        rj5 r2 = this.o;
        if (r2 != null) goto L5;
        byte[] r6 = null;
    L6:
        ud3.L0(r3, 2, r6);
        ud3.S0(r3, r5);
        return;
    L5:
        r6 = r2.j();
        goto L6
    }
}
