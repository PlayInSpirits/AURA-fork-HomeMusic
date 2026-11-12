package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = null;
    public final int n;
    public final float o;

    static {
        CREATOR = new b23(22);
    }

    public RatingCompat(int r1, float r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.n;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Rating:style=");
        r0.append(this.n);
        r0.append(" rating=");
        float r2 = this.o;
        if (r2 >= 0.0f) goto L5;
        String r3 = "unrated";
    L6:
        r0.append(r3);
        return r0.toString();
    L5:
        r3 = String.valueOf(r2);
        goto L6
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.n);
        r1.writeFloat(this.o);
    }
}
