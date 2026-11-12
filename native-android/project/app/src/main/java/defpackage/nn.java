package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nn extends h2 {
    public static final Parcelable.Creator<nn> CREATOR = null;
    public final gl n;
    public final Boolean o;
    public final z25 p;
    public final l04 q;

    static {
        CREATOR = new rh5(12);
    }

    public nn(String r2, Boolean r3, String r4, String r5) {
        l04 r0 = null;
        if (r2 != null) goto L19;
        gl r6 = null;
    L6:
        this.n = r6;     // Catch: Throwable -> L16
        this.o = r3;     // Catch: Throwable -> L16
        if (r4 != null) goto L9;
        z25 r7 = null;
    L10:
        this.p = r7;     // Catch: Throwable -> L16
        if (r5 == null) goto L14;
        r0 = l04.a(r5);     // Catch: Throwable -> L16
    L14:
        this.q = r0;     // Catch: Throwable -> L16
        return;
    L16:
        e = move-exception;
        throw new IllegalArgumentException(e);
    L9:
        r7 = z25.a(r4);     // Catch: Throwable -> L16
        goto L10
    L19:
        r6 = gl.a(r2);     // Catch: Throwable -> L16
        goto L6
    }

    public final l04 b() {
        l04 r0 = this.q;
        if (r0 != null) goto L11;
        r0 = null;
        Boolean r1 = this.o;
        if (r1 == null) goto L11;
        if (r1.booleanValue() == true) goto L10;
        return null;
    L10:
        return l04.o;
    L11:
        return r0;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof nn) == true) goto L5;
        return false;
    L5:
        nn r5 = (nn) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L15:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L15;
        if (au0.n(this.p, r5.p) == false) goto L15;
        if (au0.n(b(), r5.b()) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        z25 r0 = this.p;
        l04 r1 = b();
        return Arrays.hashCode(new Object[]{this.n, this.o, r0, r1});
    }

    public final String toString() {
        String r0 = String.valueOf(this.n);
        String r1 = String.valueOf(this.p);
        String r2 = String.valueOf(this.q);
        StringBuilder r3 = xa3.j("AuthenticatorSelectionCriteria{\n attachment=", r0, ", \n requireResidentKey=");
        r3.append(this.o);
        r3.append(", \n requireUserVerification=");
        r3.append(r1);
        r3.append(", \n residentKeyRequirement=");
        return b11.q(r3, r2, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r7 = ud3.R0(r5, 20293);
        String r0 = null;
        gl r1 = this.n;
        if (r1 != null) goto L5;
        String r2 = null;
    L6:
        ud3.O0(r5, 2, r2);
        Boolean r3 = this.o;
        if (r3 == null) goto L10;
        ud3.T0(r5, 3, 4);
        r5.writeInt(r3.booleanValue() ? 1 : 0);
    L10:
        z25 r4 = this.p;
        if (r4 != null) goto L13;
        String r8 = null;
    L14:
        ud3.O0(r5, 4, r8);
        l04 r9 = b();
        if (r9 == null) goto L18;
        r0 = r9.n;
    L18:
        ud3.O0(r5, 5, r0);
        ud3.S0(r5, r7);
        return;
    L13:
        r8 = r4.n;
        goto L14
    L5:
        r2 = r1.n;
        goto L6
    }
}
