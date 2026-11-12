package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kr4 extends h2 {
    public static final Parcelable.Creator<kr4> CREATOR = null;
    public final int n;
    public List o;

    static {
        CREATOR = new j84(11);
    }

    public kr4(List r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r5 = ud3.R0(r3, 20293);
        ud3.T0(r3, 1, 4);
        r3.writeInt(this.n);
        ud3.Q0(r3, 2, this.o);
        ud3.S0(r3, r5);
    }
}
