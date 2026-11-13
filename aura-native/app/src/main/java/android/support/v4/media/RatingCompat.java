package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new b23(22);
    public final int n;
    public final float o;

    public RatingCompat(int i, float f) {
        this.n = i;
        this.o = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.n);
        sb.append(" rating=");
        float f = this.o;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeFloat(this.o);
    }
}
