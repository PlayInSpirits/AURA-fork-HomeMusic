package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class su4 extends h2 {
    public static final Parcelable.Creator<su4> CREATOR = new ch5(23);
    public final ru4 n;
    public final String o;

    static {
        new su4("supported", null);
        new su4("not-supported", null);
    }

    public su4(String str, String str2) {
        ji2.m(str);
        try {
            this.n = ru4.a(str);
            this.o = str2;
        } catch (TokenBinding$UnsupportedTokenBindingStatusException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof su4)) {
            return false;
        }
        su4 su4Var = (su4) obj;
        return bu.H(this.n, su4Var.n) && bu.H(this.o, su4Var.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 2, this.n.n);
        ud3.O0(parcel, 3, this.o);
        ud3.S0(parcel, iR0);
    }
}
