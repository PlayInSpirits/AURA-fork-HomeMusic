package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qk4 implements Parcelable {
    public qk4() {
        super();
    }

    public static final Parcelable.Creator<qk4> CREATOR = new j84(6);
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        if (this.p > 0) {
            parcel.writeIntArray(this.q);
        }
        parcel.writeInt(this.r);
        if (this.r > 0) {
            parcel.writeIntArray(this.s);
        }
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeList(this.t);
    }
}
