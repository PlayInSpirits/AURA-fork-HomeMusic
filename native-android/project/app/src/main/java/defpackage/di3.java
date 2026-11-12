package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class di3 implements Parcelable {
    public static final Parcelable.Creator<di3> CREATOR = null;
    public final String n;
    public final CharSequence o;
    public final int p;
    public final Bundle q;
    public PlaybackState.CustomAction r;

    static {
        CREATOR = new b23(13);
    }

    public di3(Parcel r2) {
        String r0 = r2.readString();
        r0.getClass();
        this.n = r0;
        CharSequence r1 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r2);
        r1.getClass();
        this.o = r1;
        this.p = r2.readInt();
        this.q = r2.readBundle(qr2.class.getClassLoader());
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

    public di3(String r1, CharSequence r2, int r3, Bundle r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }
}
