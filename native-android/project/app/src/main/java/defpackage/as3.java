package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class as3 extends h2 {
    public static final Parcelable.Creator<as3> CREATOR = null;
    public final String n;
    public final String o;
    public final String p;

    static {
        CREATOR = new ch5(17);
    }

    public as3(String r1, String r2, String r3) {
        ji2.m(r1);
        this.n = r1;
        ji2.m(r2);
        this.o = r2;
        this.p = r3;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof as3) == true) goto L5;
        return false;
    L5:
        as3 r5 = (as3) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L13:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L13;
        if (au0.n(this.p, r5.p) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        String r0 = this.o;
        String r1 = this.p;
        return Arrays.hashCode(new Object[]{this.n, r0, r1});
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        r0.append(this.n);
        r0.append("', \n name='");
        r0.append(this.o);
        r0.append("', \n icon='");
        return b11.q(r0, this.p, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.O0(r3, 2, this.n);
        ud3.O0(r3, 3, this.o);
        ud3.O0(r3, 4, this.p);
        ud3.S0(r3, r5);
    }
}
