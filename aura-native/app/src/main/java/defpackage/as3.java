package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class as3 extends h2 {
    public static final Parcelable.Creator<as3> CREATOR = new ch5(17);
    public final String n;
    public final String o;
    public final String p;

    public as3(String str, String str2, String str3) {
        ji2.m(str);
        this.n = str;
        ji2.m(str2);
        this.o = str2;
        this.p = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof as3)) {
            return false;
        }
        as3 as3Var = (as3) obj;
        return au0.n(this.n, as3Var.n) && au0.n(this.o, as3Var.o) && au0.n(this.p, as3Var.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.n);
        sb.append("', \n name='");
        sb.append(this.o);
        sb.append("', \n icon='");
        return b11.q(sb, this.p, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 2, this.n);
        ud3.O0(parcel, 3, this.o);
        ud3.O0(parcel, 4, this.p);
        ud3.S0(parcel, R0);
    }
}
