package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wf0 extends h2 {
    public static final Parcelable.Creator<wf0> CREATOR = new w4(19);
    public final String n;
    public final Bundle o;
    public final Bundle p;
    public final String q;
    public final String r;
    public final String s;

    public wf0(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.n = str;
        this.o = bundle;
        this.p = bundle2;
        this.q = str2;
        this.r = str3;
        this.s = str4;
        boolean z = (qm4.u0(str3) || qm4.u0(str4)) ? false : true;
        boolean z2 = !qm4.u0(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        kf2.n(b11.q(b11.u("Either type: ", str, ", or requestType: ", str3, " and protocolType: "), str4, " must be specified, but at least one contains an invalid blank value."));
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iR0 = ud3.R0(parcel, 20293);
        ud3.O0(parcel, 1, this.n);
        ud3.K0(parcel, 2, this.o);
        ud3.K0(parcel, 3, this.p);
        ud3.O0(parcel, 4, this.q);
        ud3.O0(parcel, 5, this.r);
        ud3.O0(parcel, 6, this.s);
        ud3.S0(parcel, iR0);
    }
}
