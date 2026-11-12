package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nd1 implements Parcelable {
    public static final Parcelable.Creator<nd1> CREATOR = null;
    public ArrayList n;
    public ArrayList o;
    public qo[] p;
    public int q;
    public String r;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;

    static {
        CREATOR = new hz0(3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeStringList(this.n);
        r2.writeStringList(this.o);
        r2.writeTypedArray(this.p, r3);
        r2.writeInt(this.q);
        r2.writeString(this.r);
        r2.writeStringList(this.s);
        r2.writeTypedList(this.t);
        r2.writeTypedList(this.u);
    }
}
