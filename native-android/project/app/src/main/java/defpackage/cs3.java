package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cs3 extends h2 {
    public static final Parcelable.Creator<cs3> CREATOR = null;
    public final rj5 n;
    public final String o;
    public final String p;
    public final String q;

    static {
        CREATOR = new ch5(19);
    }

    public cs3(String r2, String r3, String r4, byte[] r5) {
        ji2.m(r5);
        this.n = rj5.i(r5.length, r5);
        ji2.m(r2);
        this.o = r2;
        this.p = r3;
        ji2.m(r4);
        this.q = r4;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof cs3) == false) goto L20;
        cs3 r4 = (cs3) r3;
        if (au0.n(this.n, r4.n) == true) goto L8;
        return false;
    L8:
        if (au0.n(this.o, r4.o) == true) goto L10;
        return false;
    L10:
        if (au0.n(this.p, r4.p) == true) goto L12;
        return false;
    L12:
        if (au0.n(this.q, r4.q) == false) goto L19;
        return true;
    L19:
        return false;
    L20:
        return false;
    }

    public final int hashCode() {
        String r0 = this.p;
        String r1 = this.q;
        return Arrays.hashCode(new Object[]{this.n, this.o, r0, r1});
    }

    public final String toString() {
        StringBuilder r0 = xa3.j("PublicKeyCredentialUserEntity{\n id=", ya4.n(this.n.j()), ", \n name='");
        r0.append(this.o);
        r0.append("', \n icon='");
        r0.append(this.p);
        r0.append("', \n displayName='");
        return b11.q(r0, this.q, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.L0(r3, 2, this.n.j());
        ud3.O0(r3, 3, this.o);
        ud3.O0(r3, 4, this.p);
        ud3.O0(r3, 5, this.q);
        ud3.S0(r3, r5);
    }
}
