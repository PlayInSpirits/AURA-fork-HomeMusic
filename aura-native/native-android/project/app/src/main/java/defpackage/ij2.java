package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 implements Parcelable {
    public static final Parcelable.Creator<ij2> CREATOR = new hz0(17);
    public final int n;
    public final pm2 o;

    public ij2(pm2 pm2Var, int i) {
        if (TextUtils.isEmpty(pm2Var.n)) {
            kf2.n("description must have a non-empty media id");
            throw null;
        }
        this.n = i;
        this.o = pm2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.n + ", mDescription=" + this.o + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        this.o.writeToParcel(parcel, i);
    }

    public ij2(Parcel parcel) {
        this.n = parcel.readInt();
        this.o = pm2.CREATOR.createFromParcel(parcel);
    }
}
