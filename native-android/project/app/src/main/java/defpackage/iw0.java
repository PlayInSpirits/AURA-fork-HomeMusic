package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iw0 extends k {
    public static final Parcelable.Creator<iw0> CREATOR = null;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;

    static {
        CREATOR = new yd3(3);
    }

    public iw0(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.p = 0;
        this.p = r1.readInt();
        this.q = r1.readInt();
        this.r = r1.readInt();
        this.s = r1.readInt();
        this.t = r1.readInt();
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.p);
        r1.writeInt(this.q);
        r1.writeInt(this.r);
        r1.writeInt(this.s);
        r1.writeInt(this.t);
    }
}
