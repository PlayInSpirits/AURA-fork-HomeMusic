package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w74 extends k {
    public static final Parcelable.Creator<w74> CREATOR = null;
    public String p;
    public int q;

    static {
        CREATOR = new qh4(7);
    }

    public w74(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.p = r1.readString();
        this.q = r1.readInt();
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeString(this.p);
        r1.writeInt(this.q);
    }
}
