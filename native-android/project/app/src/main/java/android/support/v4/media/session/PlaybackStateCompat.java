package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.b11;
import defpackage.b23;
import defpackage.rr2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = null;
    public final int n;
    public final long o;
    public final long p;
    public final float q;
    public final long r;
    public final int s;
    public final CharSequence t;
    public final long u;
    public final ArrayList v;
    public final long w;
    public final Bundle x;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = null;
        public final String n;
        public final CharSequence o;
        public final int p;
        public final Bundle q;

        static {
            CREATOR = new d();
        }

        public CustomAction(Parcel r2) {
            this.n = r2.readString();
            this.o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r2);
            this.p = r2.readInt();
            this.q = r2.readBundle(rr2.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.o + ", mIcon=" + this.p + ", mExtras=" + this.q;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r2, int r3) {
            r2.writeString(this.n);
            TextUtils.writeToParcel(this.o, r2, r3);
            r2.writeInt(this.p);
            r2.writeBundle(this.q);
        }

        public CustomAction(String r1, CharSequence r2, int r3, Bundle r4) {
            this.n = r1;
            this.o = r2;
            this.p = r3;
            this.q = r4;
        }
    }

    static {
        CREATOR = new b23(12);
    }

    public PlaybackStateCompat(Parcel r3) {
        this.n = r3.readInt();
        this.o = r3.readLong();
        this.q = r3.readFloat();
        this.u = r3.readLong();
        this.p = r3.readLong();
        this.r = r3.readLong();
        this.t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r3);
        this.v = r3.createTypedArrayList(CustomAction.CREATOR);
        this.w = r3.readLong();
        this.x = r3.readBundle(rr2.class.getClassLoader());
        this.s = r3.readInt();
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

    public PlaybackStateCompat(int r1, long r2, long r4, float r6, long r7, CharSequence r9, long r10, ArrayList r12, long r13, Bundle r15) {
        this.n = r1;
        this.o = r2;
        this.p = r4;
        this.q = r6;
        this.r = r7;
        this.s = 0;
        this.t = r9;
        this.u = r10;
        this.v = new ArrayList(r12);
        this.w = r13;
        this.x = r15;
    }
}
