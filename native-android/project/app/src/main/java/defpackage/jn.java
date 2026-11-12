package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jn extends mn {
    public static final Parcelable.Creator<jn> CREATOR = null;
    public final rj5 n;
    public final rj5 o;
    public final rj5 p;
    public final rj5 q;
    public final rj5 r;

    static {
        CREATOR = new rh5(7);
    }

    public jn(byte[] r2, byte[] r3, byte[] r4, byte[] r5, byte[] r6) {
        ji2.m(r2);
        rj5 r7 = rj5.i(r2.length, r2);
        ji2.m(r3);
        rj5 r8 = rj5.i(r3.length, r3);
        ji2.m(r4);
        rj5 r9 = rj5.i(r4.length, r4);
        ji2.m(r5);
        rj5 r10 = rj5.i(r5.length, r5);
        if (r6 != null) goto L5;
        rj5 r11 = null;
    L6:
        this.n = r7;
        this.o = r8;
        this.p = r9;
        this.q = r10;
        this.r = r11;
        return;
    L5:
        r11 = rj5.i(r6.length, r6);
        goto L6
    }

    public final JSONObject b() {
        JSONObject r1 = new JSONObject();     // Catch: JSONException -> L11
        r1.put("clientDataJSON", ya4.n(this.o.j()));     // Catch: JSONException -> L11
        r1.put("authenticatorData", ya4.n(this.p.j()));     // Catch: JSONException -> L11
        r1.put("signature", ya4.n(this.q.j()));     // Catch: JSONException -> L11
        rj5 r4 = this.r;     // Catch: JSONException -> L11
        if (r4 != null) goto L6;
        return r1;
    L6:
        if (r4 != null) goto L8;
        byte[] r5 = null;
    L9:
        r1.put("userHandle", ya4.n(r5));     // Catch: JSONException -> L11
        return r1;
    L8:
        r5 = r4.j();     // Catch: JSONException -> L11
    L11:
        e = move-exception;
        nz2.s("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        return null;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof jn) == false) goto L23;
        jn r4 = (jn) r3;
        if (au0.n(this.n, r4.n) == true) goto L8;
        return false;
    L8:
        if (au0.n(this.o, r4.o) == true) goto L10;
        return false;
    L10:
        if (au0.n(this.p, r4.p) == true) goto L12;
        return false;
    L12:
        if (au0.n(this.q, r4.q) == true) goto L14;
        return false;
    L14:
        if (au0.n(this.r, r4.r) == false) goto L22;
        return true;
    L22:
        return false;
    L23:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.n})), Integer.valueOf(Arrays.hashCode(new Object[]{this.o})), Integer.valueOf(Arrays.hashCode(new Object[]{this.p})), Integer.valueOf(Arrays.hashCode(new Object[]{this.q})), Integer.valueOf(Arrays.hashCode(new Object[]{this.r}))});
    }

    public final String toString() {
        ns3 r1 = new ns3(getClass().getSimpleName());
        ij5 r0 = kj5.d;
        byte[] r2 = this.n.j();
        r1.h(r0.c(r2.length, r2), "keyHandle");
        byte[] r3 = this.o.j();
        r1.h(r0.c(r3.length, r3), "clientDataJSON");
        byte[] r4 = this.p.j();
        r1.h(r0.c(r4.length, r4), "authenticatorData");
        byte[] r5 = this.q.j();
        r1.h(r0.c(r5.length, r5), "signature");
        rj5 r6 = this.r;
        if (r6 != null) goto L5;
        byte[] r7 = null;
    L6:
        if (r7 == null) goto L9;
        r1.h(r0.c(r7.length, r7), "userHandle");
    L9:
        return r1.toString();
    L5:
        r7 = r6.j();
        goto L6
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.L0(r3, 2, this.n.j());
        ud3.L0(r3, 3, this.o.j());
        ud3.L0(r3, 4, this.p.j());
        ud3.L0(r3, 5, this.q.j());
        rj5 r2 = this.r;
        if (r2 != null) goto L5;
        byte[] r6 = null;
    L6:
        ud3.L0(r3, 6, r6);
        ud3.S0(r3, r5);
        return;
    L5:
        r6 = r2.j();
        goto L6
    }
}
