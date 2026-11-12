package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pr2 implements Parcelable {
    public static final Parcelable.Creator<pr2> CREATOR = new hz0(25);
    public final MediaSession.Token o;
    public qu1 p;
    public final Object n = new Object();
    public u45 q = null;

    public pr2(MediaSession.Token token, qu1 qu1Var) {
        this.o = token;
        this.p = qu1Var;
    }

    public final qu1 a() {
        qu1 qu1Var;
        synchronized (this.n) {
            qu1Var = this.p;
        }
        return qu1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pr2) {
            return this.o.equals(((pr2) obj).o);
        }
        return false;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.o, i);
    }
}
