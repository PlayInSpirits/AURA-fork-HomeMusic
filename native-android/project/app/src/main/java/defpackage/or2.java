package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class or2 implements Parcelable {
    public static final Parcelable.Creator<or2> CREATOR = null;
    public final pm2 n;
    public final long o;
    public MediaSession.QueueItem p;

    static {
        CREATOR = new hz0(23);
    }

    public or2(MediaSession.QueueItem r3, pm2 r4, long r5) {
        if (r5 == (-1)) goto L6;
        this.n = r4;
        this.o = r5;
        this.p = r3;
        return;
    L6:
        kf2.n("Id cannot be QueueItem.UNKNOWN_ID");
        throw null;
    }

    public static ArrayList a(List r6) {
        if (r6 != null) goto L5;
        return null;
    L5:
        ArrayList r0 = new ArrayList(r6.size());
        Iterator r7 = r6.iterator();
    L7:
        if (r7.hasNext() == false) goto L9;
        MediaSession.QueueItem r1 = (MediaSession.QueueItem) r7.next();
        r0.add(new or2(r1, pm2.a(r1.getDescription()), r1.getQueueId()));
        goto L7
    L9:
        return r0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("MediaSession.QueueItem { Description=");
        r0.append(this.n);
        r0.append(", Id=");
        return b11.p(r0, this.o, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        this.n.writeToParcel(r3, r4);
        r3.writeLong(this.o);
    }

    public or2(Parcel r3) {
        this.n = pm2.CREATOR.createFromParcel(r3);
        this.o = r3.readLong();
    }
}
