package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yr3 extends h2 {
    public static final Parcelable.Creator<yr3> CREATOR = null;
    public final bs3 n;
    public final rj5 o;
    public final List p;

    static {
        gi5.g(2, new Object[]{gi1.i, gi1.j});
        CREATOR = new ch5(15);
    }

    public yr3(String r2, byte[] r3, ArrayList r4) {
        rj5 r0 = rj5.p;
        rj5 r5 = rj5.i(r3.length, r3);
        ji2.m(r2);
        this.n = bs3.a(r2);     // Catch: PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException -> L6
        this.o = r5;
        this.p = r4;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof yr3) == false) goto L28;
        yr3 r5 = (yr3) r4;
        List r0 = r5.p;
        if (this.n.equals(r5.n) == true) goto L9;
        return false;
    L9:
        if (au0.n(this.o, r5.o) == false) goto L30;
        List r3 = this.p;
        if (r3 != null) goto L14;
        if (r0 != null) goto L14;
        return true;
    L14:
        if (r3 == null) goto L23;
        if (r0 != null) goto L18;
        return false;
    L18:
        if (r3.containsAll(r0) == true) goto L20;
        return false;
    L20:
        if (r0.containsAll(r3) == false) goto L27;
        return true;
    L27:
        return false;
    L23:
        return false;
    L30:
        return false;
    L28:
        return false;
    }

    public final int hashCode() {
        rj5 r0 = this.o;
        List r1 = this.p;
        return Arrays.hashCode(new Object[]{this.n, r0, r1});
    }

    public final String toString() {
        String r0 = String.valueOf(this.n);
        String r1 = ya4.n(this.o.j());
        String r5 = String.valueOf(this.p);
        return b11.q(b11.u("PublicKeyCredentialDescriptor{\n type=", r0, ", \n id=", r1, ", \n transports="), r5, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        this.n.getClass();
        ud3.O0(r3, 2, "public-key");
        ud3.L0(r3, 3, this.o.j());
        ud3.Q0(r3, 4, this.p);
        ud3.S0(r3, r5);
    }
}
