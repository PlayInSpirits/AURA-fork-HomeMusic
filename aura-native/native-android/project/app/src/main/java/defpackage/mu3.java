package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mu3 implements Parcelable {
    public static final Parcelable.Creator<mu3> CREATOR = new b23(21);
    public final int n;
    public final float o;
    public Object p;

    public mu3(int i, float f) {
        this.n = i;
        this.o = f;
    }

    public static mu3 a(Parcelable parcelable) {
        mu3 mu3Var;
        mu3 mu3Var2 = null;
        if (parcelable != null) {
            Rating rating = (Rating) parcelable;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    case 4:
                    case 5:
                    case 6:
                        mu3Var2 = new mu3(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        mu3Var = new mu3(1, rating.hasHeart() ? 1.0f : 0.0f);
                        break;
                    case 2:
                        mu3Var = new mu3(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    case 4:
                    case 5:
                        mu3Var2 = e(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        mu3Var2 = d(rating.getPercentRating());
                        break;
                }
                mu3Var2 = mu3Var;
            }
            mu3Var2.getClass();
            mu3Var2.p = parcelable;
        }
        return mu3Var2;
    }

    public static mu3 d(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new mu3(6, f);
        }
        l93.F("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static mu3 e(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                l93.F("Rating", "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new mu3(i, f);
        }
        l93.F("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float b() {
        int i = this.n;
        if ((i == 3 || i == 4 || i == 5) && c()) {
            return this.o;
        }
        return -1.0f;
    }

    public final boolean c() {
        return this.o >= 0.0f;
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
