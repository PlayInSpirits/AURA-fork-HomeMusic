package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gn extends h2 {
    public static final Parcelable.Creator<gn> CREATOR = new rh5(3);
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

    public gn(s61 s61Var, rk5 rk5Var, y25 y25Var, wk5 wk5Var, gh5 gh5Var, hh5 hh5Var, uk5 uk5Var, kh5 kh5Var, pj1 pj1Var, mh5 mh5Var, nh5 nh5Var, lh5 lh5Var) {
        this.n = s61Var;
        this.p = y25Var;
        this.o = rk5Var;
        this.q = wk5Var;
        this.r = gh5Var;
        this.s = hh5Var;
        this.t = uk5Var;
        this.u = kh5Var;
        this.v = pj1Var;
        this.w = mh5Var;
        this.x = nh5Var;
        this.y = lh5Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gn)) {
            return false;
        }
        gn gnVar = (gn) obj;
        return au0.n(this.n, gnVar.n) && au0.n(this.o, gnVar.o) && au0.n(this.p, gnVar.p) && au0.n(this.q, gnVar.q) && au0.n(this.r, gnVar.r) && au0.n(this.s, gnVar.s) && au0.n(this.t, gnVar.t) && au0.n(this.u, gnVar.u) && au0.n(this.v, gnVar.v) && au0.n(this.w, gnVar.w) && au0.n(this.x, gnVar.x) && au0.n(this.y, gnVar.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.n);
        String strValueOf2 = String.valueOf(this.o);
        String strValueOf3 = String.valueOf(this.p);
        String strValueOf4 = String.valueOf(this.q);
        String strValueOf5 = String.valueOf(this.r);
        String strValueOf6 = String.valueOf(this.s);
        String strValueOf7 = String.valueOf(this.t);
        String strValueOf8 = String.valueOf(this.u);
        String strValueOf9 = String.valueOf(this.v);
        String strValueOf10 = String.valueOf(this.w);
        String strValueOf11 = String.valueOf(this.x);
        StringBuilder sbU = b11.u("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        f34.n(sbU, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        f34.n(sbU, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        f34.n(sbU, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        f34.n(sbU, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return b11.q(sbU, strValueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.M0(parcel, 2, this.n, i);
        ud3.M0(parcel, 3, this.o, i);
        ud3.M0(parcel, 4, this.p, i);
        ud3.M0(parcel, 5, this.q, i);
        ud3.M0(parcel, 6, this.r, i);
        ud3.M0(parcel, 7, this.s, i);
        ud3.M0(parcel, 8, this.t, i);
        ud3.M0(parcel, 9, this.u, i);
        ud3.M0(parcel, 10, this.v, i);
        ud3.M0(parcel, 11, this.w, i);
        ud3.M0(parcel, 12, this.x, i);
        ud3.M0(parcel, 13, this.y, i);
        ud3.S0(parcel, iR0);
    }
}
