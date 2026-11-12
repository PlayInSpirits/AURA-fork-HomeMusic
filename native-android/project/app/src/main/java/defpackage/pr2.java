package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pr2 implements Parcelable {
    public static final Parcelable.Creator<pr2> CREATOR = null;
    public final Object n;
    public final MediaSession.Token o;
    public qu1 p;
    public u45 q;

    static {
        CREATOR = new hz0(25);
    }

    public pr2(MediaSession.Token r2, qu1 r3) {
        this.n = new Object();
        this.o = r2;
        this.p = r3;
        this.q = null;
    }

    public final qu1 a() {
        Object r0 = this.n;
        monitor-enter(r0);
        qu1 r1 = this.p;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof pr2) == true) goto L10;
        return false;
    L10:
        return this.o.equals(((pr2) r2).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeParcelable(this.o, r2);
    }
}
