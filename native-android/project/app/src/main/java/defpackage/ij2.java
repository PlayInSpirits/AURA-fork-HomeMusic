package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 implements Parcelable {
    public static final Parcelable.Creator<ij2> CREATOR = null;
    public final int n;
    public final pm2 o;

    static {
        CREATOR = new hz0(17);
    }

    public ij2(pm2 r2, int r3) {
        if (TextUtils.isEmpty(r2.n) == true) goto L6;
        this.n = r3;
        this.o = r2;
        return;
    L6:
        kf2.n("description must have a non-empty media id");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.n + ", mDescription=" + this.o + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.n);
        this.o.writeToParcel(r2, r3);
    }

    public ij2(Parcel r2) {
        this.n = r2.readInt();
        this.o = pm2.CREATOR.createFromParcel(r2);
    }
}
