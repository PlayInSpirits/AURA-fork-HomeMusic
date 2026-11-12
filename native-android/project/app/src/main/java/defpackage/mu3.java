package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mu3 implements Parcelable {
    public static final Parcelable.Creator<mu3> CREATOR = null;
    public final int n;
    public final float o;
    public Object p;

    static {
        CREATOR = new b23(21);
    }

    public mu3(int r1, float r2) {
        this.n = r1;
        this.o = r2;
    }

    public static mu3 a(Parcelable r5) {
        mu3 r0 = null;
        if (r5 == null) goto L24;
        Rating r1 = (Rating) r5;
        int r2 = r1.getRatingStyle();
        if (r1.isRated() == false) goto L20;
        float r3 = 0.0f;
        switch(r2) {
            case 1: goto L17;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L10;
            case 5: goto L10;
            case 6: goto L9;
            default: goto L24;
        };
    L9:
        r0 = d(r1.getPercentRating());
    L23:
        r0.getClass();
        r0.p = r5;
        goto L24
    L10:
        r0 = e(r2, r1.getStarRating());
        goto L23
    L12:
        if (r1.isThumbUp() == false) goto L14;
        r3 = 1.0f;
    L14:
        mu3 r4 = new mu3(2, r3);
    L15:
        r0 = r4;
        goto L23
    L17:
        if (r1.hasHeart() == false) goto L19;
        r3 = 1.0f;
    L19:
        r4 = new mu3(1, r3);
        goto L15
    L20:
        switch(r2) {
            case 1: goto L22;
            case 2: goto L22;
            case 3: goto L22;
            case 4: goto L22;
            case 5: goto L22;
            case 6: goto L22;
            default: goto L23;
        };
    L22:
        r0 = new mu3(r2, -1.0f);
    L24:
        return r0;
    }

    public static mu3 d(float r2) {
        if (r2 >= 0.0f) goto L5;
    L9:
        l93.F("Rating", "Invalid percentage-based rating value");
        return null;
    L5:
        if (r2 > 100.0f) goto L9;
        return new mu3(6, r2);
    }

    public static mu3 e(int r4, float r5) {
        if (r4 != 3) goto L5;
        float r0 = 3.0f;
    L14:
        if (r5 >= 0.0f) goto L16;
    L20:
        l93.F("Rating", "Trying to set out of range star-based rating");
        return null;
    L16:
        if (r5 > r0) goto L20;
        return new mu3(r4, r5);
    L5:
        if (r4 != 4) goto L7;
        r0 = 4.0f;
        goto L14
    L7:
        if (r4 == 5) goto L10;
        l93.F("Rating", "Invalid rating style (" + r4 + ") for a star rating");
        return null;
    L10:
        r0 = 5.0f;
        goto L14
    }

    public final float b() {
        int r1 = this.n;
        if (r1 == 3) goto L10;
        if (r1 == 4) goto L10;
        if (r1 == 5) goto L10;
        return -1.0f;
    L10:
        if (c() == true) goto L12;
        return -1.0f;
    L12:
        return this.o;
    }

    public final boolean c() {
        if (this.o < 0.0f) goto L6;
        return true;
    L6:
        return false;
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
