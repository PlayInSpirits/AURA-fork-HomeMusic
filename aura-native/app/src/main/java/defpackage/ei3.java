package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ei3 implements Parcelable {
    public static final Parcelable.Creator<ei3> CREATOR = new b23(11);
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

    public ei3(Parcel parcel) {
        this.n = parcel.readInt();
        this.o = parcel.readLong();
        this.q = parcel.readFloat();
        this.u = parcel.readLong();
        this.p = parcel.readLong();
        this.r = parcel.readLong();
        this.t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        List createTypedArrayList = parcel.createTypedArrayList(di3.CREATOR);
        if (createTypedArrayList == null) {
            vw1 vw1Var = yw1.o;
            createTypedArrayList = gy3.r;
        }
        this.v = createTypedArrayList;
        this.w = parcel.readLong();
        this.x = parcel.readBundle(qr2.class.getClassLoader());
        this.s = parcel.readInt();
    }

    public static ei3 a(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    di3 di3Var = new di3(customAction.getAction(), customAction.getName(), customAction.getIcon(), f35.n(customAction.getExtras()));
                    di3Var.r = customAction;
                    arrayList.add(di3Var);
                }
            }
        }
        ei3 ei3Var = new ei3(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), f35.n(playbackState.getExtras()));
        ei3Var.y = playbackState;
        return ei3Var;
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

    public ei3(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        List arrayList2;
        this.n = i;
        this.o = j;
        this.p = j2;
        this.q = f;
        this.r = j3;
        this.s = i2;
        this.t = charSequence;
        this.u = j4;
        if (arrayList == null) {
            vw1 vw1Var = yw1.o;
            arrayList2 = gy3.r;
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.v = arrayList2;
        this.w = j5;
        this.x = bundle;
    }
}
