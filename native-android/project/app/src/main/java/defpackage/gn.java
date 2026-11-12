package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gn extends h2 {
    public static final Parcelable.Creator<gn> CREATOR = null;
    public final s61 n;
    public final rk5 o;
    public final y25 p;
    public final wk5 q;
    public final gh5 r;
    public final hh5 s;
    public final uk5 t;
    public final kh5 u;
    public final pj1 v;
    public final mh5 w;
    public final nh5 x;
    public final lh5 y;

    static {
        CREATOR = new rh5(3);
    }

    public gn(s61 r1, rk5 r2, y25 r3, wk5 r4, gh5 r5, hh5 r6, uk5 r7, kh5 r8, pj1 r9, mh5 r10, nh5 r11, lh5 r12) {
        this.n = r1;
        this.p = r3;
        this.o = r2;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
        this.v = r9;
        this.w = r10;
        this.x = r11;
        this.y = r12;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof gn) == true) goto L5;
        return false;
    L5:
        gn r5 = (gn) r4;
        if (au0.n(this.n, r5.n) == true) goto L8;
    L31:
        return false;
    L8:
        if (au0.n(this.o, r5.o) == false) goto L31;
        if (au0.n(this.p, r5.p) == false) goto L31;
        if (au0.n(this.q, r5.q) == false) goto L31;
        if (au0.n(this.r, r5.r) == false) goto L31;
        if (au0.n(this.s, r5.s) == false) goto L31;
        if (au0.n(this.t, r5.t) == false) goto L31;
        if (au0.n(this.u, r5.u) == false) goto L31;
        if (au0.n(this.v, r5.v) == false) goto L31;
        if (au0.n(this.w, r5.w) == false) goto L31;
        if (au0.n(this.x, r5.x) == false) goto L31;
        if (au0.n(this.y, r5.y) == false) goto L31;
        return true;
    }

    public final int hashCode() {
        nh5 r10 = this.x;
        lh5 r11 = this.y;
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, r10, r11});
    }

    public final String toString() {
        String r0 = String.valueOf(this.n);
        String r1 = String.valueOf(this.o);
        String r2 = String.valueOf(this.p);
        String r3 = String.valueOf(this.q);
        String r4 = String.valueOf(this.r);
        String r5 = String.valueOf(this.s);
        String r6 = String.valueOf(this.t);
        String r7 = String.valueOf(this.u);
        String r8 = String.valueOf(this.v);
        String r9 = String.valueOf(this.w);
        String r13 = String.valueOf(this.x);
        StringBuilder r10 = b11.u("AuthenticationExtensions{\n fidoAppIdExtension=", r0, ", \n cableAuthenticationExtension=", r1, ", \n userVerificationMethodExtension=");
        f34.n(r10, r2, ", \n googleMultiAssertionExtension=", r3, ", \n googleSessionIdExtension=");
        f34.n(r10, r4, ", \n googleSilentVerificationExtension=", r5, ", \n devicePublicKeyExtension=");
        f34.n(r10, r6, ", \n googleTunnelServerIdExtension=", r7, ", \n googleThirdPartyPaymentExtension=");
        f34.n(r10, r8, ", \n prfExtension=", r9, ", \n simpleTransactionAuthorizationExtension=");
        return b11.q(r10, r13, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r0 = ud3.R0(r4, 20293);
        ud3.M0(r4, 2, this.n, r5);
        ud3.M0(r4, 3, this.o, r5);
        ud3.M0(r4, 4, this.p, r5);
        ud3.M0(r4, 5, this.q, r5);
        ud3.M0(r4, 6, this.r, r5);
        ud3.M0(r4, 7, this.s, r5);
        ud3.M0(r4, 8, this.t, r5);
        ud3.M0(r4, 9, this.u, r5);
        ud3.M0(r4, 10, this.v, r5);
        ud3.M0(r4, 11, this.w, r5);
        ud3.M0(r4, 12, this.x, r5);
        ud3.M0(r4, 13, this.y, r5);
        ud3.S0(r4, r0);
    }
}
