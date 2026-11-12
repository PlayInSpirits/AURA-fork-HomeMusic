package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iw2 extends h2 {
    public static final Parcelable.Creator<iw2> CREATOR = null;
    public final int n;
    public final int o;
    public final int p;
    public final long q;
    public final long r;
    public final String s;
    public final String t;
    public final int u;
    public final int v;

    static {
        CREATOR = new j84(17);
    }

    public iw2(int r1, int r2, int r3, long r4, long r6, String r8, String r9, int r10, int r11) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r6;
        this.s = r8;
        this.t = r9;
        this.u = r10;
        this.v = r11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r7 = ud3.R0(r5, 20293);
        ud3.T0(r5, 1, 4);
        r5.writeInt(this.n);
        ud3.T0(r5, 2, 4);
        r5.writeInt(this.o);
        ud3.T0(r5, 3, 4);
        r5.writeInt(this.p);
        ud3.T0(r5, 4, 8);
        r5.writeLong(this.q);
        ud3.T0(r5, 5, 8);
        r5.writeLong(this.r);
        ud3.O0(r5, 6, this.s);
        ud3.O0(r5, 7, this.t);
        ud3.T0(r5, 8, 4);
        r5.writeInt(this.u);
        ud3.T0(r5, 9, 4);
        r5.writeInt(this.v);
        ud3.S0(r5, r7);
    }
}
