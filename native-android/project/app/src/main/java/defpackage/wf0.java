package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wf0 extends h2 {
    public static final Parcelable.Creator<wf0> CREATOR = null;
    public final String n;
    public final Bundle o;
    public final Bundle p;
    public final String q;
    public final String r;
    public final String s;

    static {
        CREATOR = new w4(19);
    }

    public wf0(String r1, Bundle r2, Bundle r3, String r4, String r5, String r6) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r4.getClass();
        r5.getClass();
        r6.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        boolean r7 = true;
        if (qm4.u0(r5) == false) goto L5;
    L7:
        boolean r0 = false;
    L9:
        if (qm4.u0(r1) == false) goto L11;
    L15:
        r7 = false;
    L16:
        if (r0 == true) goto L21;
        if (r7 == true) goto L22;
        kf2.n(b11.q(b11.u("Either type: ", r1, ", or requestType: ", r5, " and protocolType: "), r6, " must be specified, but at least one contains an invalid blank value."));
        throw null;
    L22:
        return;
    L21:
        return;
    L11:
        if (r5.length() != 0) goto L15;
        if (r6.length() != 0) goto L15;
    L5:
        if (qm4.u0(r6) == true) goto L7;
        r0 = true;
        goto L9
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        int r5 = ud3.R0(r3, 20293);
        ud3.O0(r3, 1, this.n);
        ud3.K0(r3, 2, this.o);
        ud3.K0(r3, 3, this.p);
        ud3.O0(r3, 4, this.q);
        ud3.O0(r3, 5, this.r);
        ud3.O0(r3, 6, this.s);
        ud3.S0(r3, r5);
    }
}
