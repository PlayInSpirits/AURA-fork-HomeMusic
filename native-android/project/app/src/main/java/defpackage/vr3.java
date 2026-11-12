package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vr3 extends h2 {
    public static final Parcelable.Creator<vr3> CREATOR = null;
    public final String n;
    public final String o;
    public final rj5 p;
    public final kn q;
    public final jn r;
    public final ln s;
    public final hn t;
    public final String u;

    static {
        CREATOR = new ch5(14);
    }

    public vr3(String r5, String r6, byte[] r7, kn r8, jn r9, ln r10, hn r11, String r12) {
        if (r7 != null) goto L4;
        rj5 r13 = null;
    L5:
        boolean r0 = false;
        if (r8 == null) goto L11;
        if (r9 != null) goto L11;
        if (r10 != null) goto L11;
    L10:
        boolean r2 = true;
    L19:
        ji2.h("Must provide a response object.", r2);
        if (r10 != null) goto L23;
        if (r5 == null) goto L24;
        if (r13 != null) goto L23;
    L24:
        ji2.h("Must provide id and rawId if not an error response.", r0);
        this.n = r5;
        this.o = r6;
        this.p = r13;
        this.q = r8;
        this.r = r9;
        this.s = r10;
        this.t = r11;
        this.u = r12;
        return;
    L23:
        r0 = true;
    L11:
        if (r8 != null) goto L14;
        if (r9 == null) goto L14;
        if (r10 == null) goto L10;
    L14:
        if (r8 != null) goto L18;
        if (r9 != null) goto L18;
        if (r10 != null) goto L10;
    L18:
        r2 = false;
        goto L19
    L4:
        r13 = rj5.i(r7.length, r7);
        goto L5
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof vr3) == false) goto L32;
        vr3 r4 = (vr3) r3;
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
        if (au0.n(this.r, r4.r) == true) goto L16;
        return false;
    L16:
        if (au0.n(this.s, r4.s) == true) goto L18;
        return false;
    L18:
        if (au0.n(this.t, r4.t) == true) goto L20;
        return false;
    L20:
        if (au0.n(this.u, r4.u) == false) goto L31;
        return true;
    L31:
        return false;
    L32:
        return false;
    }

    public final int hashCode() {
        hn r6 = this.t;
        String r7 = this.u;
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, this.r, this.q, this.s, r6, r7});
    }

    public final String toString() {
        rj5 r0 = this.p;
        if (r0 != null) goto L5;
        byte[] r1 = null;
    L6:
        String r2 = ya4.n(r1);
        String r3 = String.valueOf(this.q);
        String r4 = String.valueOf(this.r);
        String r5 = String.valueOf(this.s);
        String r6 = String.valueOf(this.t);
        StringBuilder r7 = b11.u("PublicKeyCredential{\n id='", this.n, "', \n type='", this.o, "', \n rawId=");
        f34.n(r7, r2, ", \n registerResponse=", r3, ", \n signResponse=");
        f34.n(r7, r4, ", \n errorResponse=", r5, ", \n extensionsClientOutputs=");
        r7.append(r6);
        r7.append(", \n authenticatorAttachment='");
        r7.append(this.u);
        r7.append("'}");
        return r7.toString();
    L5:
        r1 = r0.j();
        goto L6
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        gk5 r0 = (gk5) fk5.b.a.n;
        gk5.a.b();
        throw null;
    }
}
