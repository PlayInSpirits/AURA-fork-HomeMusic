package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uf0 extends h2 {
    public static final Parcelable.Creator<uf0> CREATOR = null;
    public final String n;
    public final Bundle o;

    static {
        CREATOR = new w4(18);
    }

    public uf0(String r1, Bundle r2) {
        r1.getClass();
        r2.getClass();
        this.n = r1;
        this.o = r2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        int r5 = ud3.R0(r3, 20293);
        ud3.O0(r3, 1, this.n);
        ud3.K0(r3, 2, this.o);
        ud3.S0(r3, r5);
    }
}
