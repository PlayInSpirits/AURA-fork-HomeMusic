package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yr extends h2 {
    public static final Parcelable.Creator<yr> CREATOR = null;
    public final boolean n;
    public final String o;
    public final String p;
    public final boolean q;
    public final String r;
    public final ArrayList s;
    public final boolean t;

    static {
        CREATOR = new j84(24);
    }

    public yr(boolean r3, String r4, String r5, boolean r6, String r7, ArrayList r8, boolean r9) {
        boolean r0 = true;
        if (r6 == false) goto L7;
        if (r9 == false) goto L7;
        r0 = false;
    L7:
        ji2.h("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", r0);
        this.n = r3;
        if (r3 == false) goto L10;
        ji2.n(r4, "serverClientId must be provided if Google ID tokens are requested");
    L10:
        this.o = r4;
        this.p = r5;
        this.q = r6;
        ArrayList r10 = null;
        if (r8 != null) goto L13;
    L16:
        this.s = r10;
        this.r = r7;
        this.t = r9;
        return;
    L13:
        if (r8.isEmpty() == true) goto L16;
        r10 = new ArrayList(r8);
        Collections.sort(r10);
        goto L16
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof yr) == false) goto L29;
        yr r4 = (yr) r3;
        if (this.n == r4.n) goto L8;
        return false;
    L8:
        if (au0.n(this.o, r4.o) == true) goto L10;
        return false;
    L10:
        if (au0.n(this.p, r4.p) == true) goto L12;
        return false;
    L12:
        if (this.q == r4.q) goto L14;
        return false;
    L14:
        if (au0.n(this.r, r4.r) == true) goto L16;
        return false;
    L16:
        if (au0.n(this.s, r4.s) == true) goto L18;
        return false;
    L18:
        if (this.t != r4.t) goto L28;
        return true;
    L28:
        return false;
    L29:
        return false;
    }

    public final int hashCode() {
        Boolean r1 = Boolean.valueOf(this.n);
        Boolean r4 = Boolean.valueOf(this.q);
        Boolean r7 = Boolean.valueOf(this.t);
        return Arrays.hashCode(new Object[]{r1, this.o, this.p, r4, this.r, this.s, r7});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r6 = ud3.R0(r4, 20293);
        ud3.T0(r4, 1, 4);
        r4.writeInt(this.n ? 1 : 0);
        ud3.O0(r4, 2, this.o);
        ud3.O0(r4, 3, this.p);
        ud3.T0(r4, 4, 4);
        r4.writeInt(this.q ? 1 : 0);
        ud3.O0(r4, 5, this.r);
        ArrayList r0 = this.s;
        if (r0 == null) goto L6;
        int r2 = ud3.R0(r4, 6);
        r4.writeStringList(r0);
        ud3.S0(r4, r2);
    L6:
        ud3.T0(r4, 7, 4);
        r4.writeInt(this.t ? 1 : 0);
        ud3.S0(r4, r6);
    }
}
