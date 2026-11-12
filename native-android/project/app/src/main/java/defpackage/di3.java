package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class di3 implements Parcelable {
    public static final Parcelable.Creator<di3> CREATOR = new b23(13);
    public final String n;
    public final CharSequence o;
    public final int p;
    public final Bundle q;
    public PlaybackState.CustomAction r;

    public di3(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.n = string;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.o = charSequence;
        this.p = parcel.readInt();
        this.q = parcel.readBundle(qr2.class.getClassLoader());
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

    public di3(String str, CharSequence charSequence, int i, Bundle bundle) {
        this.n = str;
        this.o = charSequence;
        this.p = i;
        this.q = bundle;
    }
}
