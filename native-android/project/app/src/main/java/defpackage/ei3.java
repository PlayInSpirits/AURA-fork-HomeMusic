package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ei3 implements Parcelable {
    public static final Parcelable.Creator<ei3> CREATOR = null;
    public final int n;
    public final long o;
    public final long p;
    public final float q;
    public final long r;
    public final int s;
    public final CharSequence t;
    public final long u;
    public final List v;
    public final long w;
    public final Bundle x;
    public PlaybackState y;

    static {
        CREATOR = new b23(11);
    }

    public ei3(Parcel r3) {
        this.n = r3.readInt();
        this.o = r3.readLong();
        this.q = r3.readFloat();
        this.u = r3.readLong();
        this.p = r3.readLong();
        this.r = r3.readLong();
        this.t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r3);
        List r0 = r3.createTypedArrayList(di3.CREATOR);
        if (r0 != null) goto L5;
        vw1 r1 = yw1.o;
        r0 = gy3.r;
    L5:
        this.v = r0;
        this.w = r3.readLong();
        this.x = r3.readBundle(qr2.class.getClassLoader());
        this.s = r3.readInt();
    }

    public static ei3 a(PlaybackState r26) {
        ArrayList r1 = null;
        if (r26 == null) goto L15;
        List<PlaybackState.CustomAction> r2 = r26.getCustomActions();
        if (r2 == null) goto L13;
        r1 = new ArrayList(r2.size());
        Iterator<PlaybackState.CustomAction> r3 = r2.iterator();
    L8:
        if (r3.hasNext() == false) goto L13;
        PlaybackState.CustomAction r4 = r3.next();
        if (r4 == null) goto L8;
        Bundle r5 = f35.n(r4.getExtras());
        di3 r6 = new di3(r4.getAction(), r4.getName(), r4.getIcon(), r5);
        r6.r = r4;
        r1.add(r6);
    L13:
        ArrayList r22 = r1;
        Bundle r25 = f35.n(r26.getExtras());
        ei3 r9 = new ei3(r26.getState(), r26.getPosition(), r26.getBufferedPosition(), r26.getPlaybackSpeed(), r26.getActions(), 0, r26.getErrorMessage(), r26.getLastPositionUpdateTime(), r22, r26.getActiveQueueItemId(), r25);
        r9.y = r26;
        return r9;
    L15:
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("PlaybackState {state=");
        r0.append(this.n);
        r0.append(", position=");
        r0.append(this.o);
        r0.append(", buffered position=");
        r0.append(this.p);
        r0.append(", speed=");
        r0.append(this.q);
        r0.append(", updated=");
        r0.append(this.u);
        r0.append(", actions=");
        r0.append(this.r);
        r0.append(", error code=");
        r0.append(this.s);
        r0.append(", error message=");
        r0.append(this.t);
        r0.append(", custom actions=");
        r0.append(this.v);
        r0.append(", active item id=");
        return b11.p(r0, this.w, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeInt(this.n);
        r3.writeLong(this.o);
        r3.writeFloat(this.q);
        r3.writeLong(this.u);
        r3.writeLong(this.p);
        r3.writeLong(this.r);
        TextUtils.writeToParcel(this.t, r3, r4);
        r3.writeTypedList(this.v);
        r3.writeLong(this.w);
        r3.writeBundle(this.x);
        r3.writeInt(this.s);
    }

    public ei3(int r1, long r2, long r4, float r6, long r7, int r9, CharSequence r10, long r11, ArrayList r13, long r14, Bundle r16) {
        this.n = r1;
        this.o = r2;
        this.p = r4;
        this.q = r6;
        this.r = r7;
        this.s = r9;
        this.t = r10;
        this.u = r11;
        if (r13 != null) goto L5;
        vw1 r3 = yw1.o;
        List r5 = gy3.r;
    L6:
        this.v = r5;
        this.w = r14;
        this.x = r16;
        return;
    L5:
        r5 = new ArrayList(r13);
        goto L6
    }
}
