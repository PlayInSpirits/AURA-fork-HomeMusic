package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class su4 extends h2 {
    public static final Parcelable.Creator<su4> CREATOR = null;
    public final ru4 n;
    public final String o;

    static {
        CREATOR = new ch5(23);
        new su4("supported", null);
        new su4("not-supported", null);
    }

    public su4(String r1, String r2) {
        ji2.m(r1);
        this.n = ru4.a(r1);     // Catch: TokenBinding$UnsupportedTokenBindingStatusException -> L6
        this.o = r2;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof su4) == true) goto L5;
        return false;
    L5:
        su4 r5 = (su4) r4;
        if (bu.H(this.n, r5.n) == true) goto L8;
    L11:
        return false;
    L8:
        if (bu.H(this.o, r5.o) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.O0(r3, 2, this.n.n);
        ud3.O0(r3, 3, this.o);
        ud3.S0(r3, r5);
    }
}
