package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class or2 implements Parcelable {
    public static final Parcelable.Creator<or2> CREATOR = new hz0(23);
    public final pm2 n;
    public final long o;
    public MediaSession.QueueItem p;

    public or2(MediaSession.QueueItem queueItem, pm2 pm2Var, long j) {
        if (j == -1) {
            kf2.n("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.n = pm2Var;
        this.o = j;
        this.p = queueItem;
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new or2(queueItem, pm2.a(queueItem.getDescription()), queueItem.getQueueId()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.n);
        sb.append(", Id=");
        return b11.p(sb, this.o, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.n.writeToParcel(parcel, i);
        parcel.writeLong(this.o);
    }

    public or2(Parcel parcel) {
        this.n = pm2.CREATOR.createFromParcel(parcel);
        this.o = parcel.readLong();
    }
}
