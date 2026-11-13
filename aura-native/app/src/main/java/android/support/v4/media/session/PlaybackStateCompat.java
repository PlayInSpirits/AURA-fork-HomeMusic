package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.b11;
import defpackage.b23;
import defpackage.rr2;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new b23(12);
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

    public PlaybackStateCompat(Parcel parcel) {
        this.n = parcel.readInt();
        this.o = parcel.readLong();
        this.q = parcel.readFloat();
        this.u = parcel.readLong();
        this.p = parcel.readLong();
        this.r = parcel.readLong();
        this.t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.v = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.w = parcel.readLong();
        this.x = parcel.readBundle(rr2.class.getClassLoader());
        this.s = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.n);
        sb.append(", position=");
        sb.append(this.o);
        sb.append(", buffered position=");
        sb.append(this.p);
        sb.append(", speed=");
        sb.append(this.q);
        sb.append(", updated=");
        sb.append(this.u);
        sb.append(", actions=");
        sb.append(this.r);
        sb.append(", error code=");
        sb.append(this.s);
        sb.append(", error message=");
        sb.append(this.t);
        sb.append(", custom actions=");
        sb.append(this.v);
        sb.append(", active item id=");
        return b11.p(sb, this.w, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeLong(this.o);
        parcel.writeFloat(this.q);
        parcel.writeLong(this.u);
        parcel.writeLong(this.p);
        parcel.writeLong(this.r);
        TextUtils.writeToParcel(this.t, parcel, i);
        parcel.writeTypedList(this.v);
        parcel.writeLong(this.w);
        parcel.writeBundle(this.x);
        parcel.writeInt(this.s);
    }

    /* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new d();
        public final String n;
        public final CharSequence o;
        public final int p;
        public final Bundle q;

        public CustomAction(Parcel parcel) {
            this.n = parcel.readString();
            this.o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.p = parcel.readInt();
            this.q = parcel.readBundle(rr2.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.o) + ", mIcon=" + this.p + ", mExtras=" + this.q;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.n);
            TextUtils.writeToParcel(this.o, parcel, i);
            parcel.writeInt(this.p);
            parcel.writeBundle(this.q);
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.n = str;
            this.o = charSequence;
            this.p = i;
            this.q = bundle;
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.n = i;
        this.o = j;
        this.p = j2;
        this.q = f;
        this.r = j3;
        this.s = 0;
        this.t = charSequence;
        this.u = j4;
        this.v = new ArrayList(arrayList);
        this.w = j5;
        this.x = bundle;
    }
}
