package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ln extends mn {
    public static final Parcelable.Creator<ln> CREATOR = null;
    public final c21 n;
    public final String o;
    public final int p;

    static {
        CREATOR = new rh5(10);
    }

    public ln(String r1, int r2, int r3) {
        this.n = c21.a(r2);     // Catch: ErrorCode$UnsupportedErrorCodeException -> L6
        this.o = r1;
        this.p = r3;
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof ln) == true) goto L5;
        return false;
    L5:
        ln r5 = (ln) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L13:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L13;
        if (au0.n(Integer.valueOf(this.p), Integer.valueOf(r5.p)) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.p);
        return Arrays.hashCode(new Object[]{this.n, this.o, r0});
    }

    public final String toString() {
        ns3 r1 = new ns3(getClass().getSimpleName());
        String r0 = String.valueOf(this.n.n);
        sh5 r2 = new sh5(11);
        ((c12) r1.q).q = r2;
        r1.q = r2;
        r2.p = r0;
        r2.o = "errorCode";
        String r4 = this.o;
        if (r4 == null) goto L6;
        r1.h(r4, "errorMessage");
    L6:
        return r1.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r6 = ud3.R0(r4, 20293);
        int r0 = this.n.n;
        ud3.T0(r4, 2, 4);
        r4.writeInt(r0);
        ud3.O0(r4, 3, this.o);
        ud3.T0(r4, 4, 4);
        r4.writeInt(this.p);
        ud3.S0(r4, r6);
    }
}
