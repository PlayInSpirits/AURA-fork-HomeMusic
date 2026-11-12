package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lh5 extends h2 {
    public static final Parcelable.Creator<lh5> CREATOR = null;
    public final rj5 n;
    public final rj5 o;
    public final rj5 p;
    public final int q;

    static {
        CREATOR = new ch5(10);
    }

    public lh5(rj5 r1, rj5 r2, rj5 r3, int r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof lh5) == true) goto L5;
        return false;
    L5:
        lh5 r5 = (lh5) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L15:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L15;
        if (au0.n(this.p, r5.p) == false) goto L15;
        if (this.q != r5.q) goto L15;
        return true;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.q);
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, r0});
    }

    public final String toString() {
        byte[] r0 = null;
        rj5 r1 = this.n;
        if (r1 != null) goto L5;
        byte[] r2 = null;
    L6:
        String r3 = ya4.n(r2);
        rj5 r4 = this.o;
        if (r4 != null) goto L9;
        byte[] r5 = null;
    L10:
        String r6 = ya4.n(r5);
        rj5 r7 = this.p;
        if (r7 == null) goto L14;
        r0 = r7.j();
    L14:
        String r8 = ya4.n(r0);
        StringBuilder r9 = b11.u("HmacSecretExtension{coseKeyAgreement=", r3, ", saltEnc=", r6, ", saltAuth=");
        r9.append(r8);
        r9.append(", getPinUvAuthProtocol=");
        return f34.i(r9, this.q, "}");
    L9:
        r5 = r4.j();
        goto L10
    L5:
        r2 = r1.j();
        goto L6
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r6 = ud3.R0(r4, 20293);
        byte[] r0 = null;
        rj5 r1 = this.n;
        if (r1 != null) goto L5;
        byte[] r2 = null;
    L6:
        ud3.L0(r4, 1, r2);
        rj5 r3 = this.o;
        if (r3 != null) goto L9;
        byte[] r7 = null;
    L10:
        ud3.L0(r4, 2, r7);
        rj5 r8 = this.p;
        if (r8 == null) goto L14;
        r0 = r8.j();
    L14:
        ud3.L0(r4, 3, r0);
        ud3.T0(r4, 4, 4);
        r4.writeInt(this.q);
        ud3.S0(r4, r6);
        return;
    L9:
        r7 = r3.j();
        goto L10
    L5:
        r2 = r1.j();
        goto L6
    }
}
