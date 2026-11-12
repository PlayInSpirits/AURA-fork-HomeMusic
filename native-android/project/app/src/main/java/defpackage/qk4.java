package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qk4 implements Parcelable {
    public static final Parcelable.Creator<qk4> CREATOR = null;
    public int n;
    public int o;
    public int p;
    public int[] q;
    public int r;
    public int[] s;
    public ArrayList t;
    public boolean u;
    public boolean v;
    public boolean w;

    static {
        CREATOR = new j84(6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.n);
        r1.writeInt(this.o);
        r1.writeInt(this.p);
        if (this.p <= 0) goto L5;
        r1.writeIntArray(this.q);
    L5:
        r1.writeInt(this.r);
        if (this.r <= 0) goto L8;
        r1.writeIntArray(this.s);
    L8:
        r1.writeInt(this.u ? 1 : 0);
        r1.writeInt(this.v ? 1 : 0);
        r1.writeInt(this.w ? 1 : 0);
        r1.writeList(this.t);
    }
}
