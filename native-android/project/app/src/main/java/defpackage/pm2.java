package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pm2 implements Parcelable {
    public static final Parcelable.Creator<pm2> CREATOR = null;
    public final String n;
    public final CharSequence o;
    public final CharSequence p;
    public final CharSequence q;
    public final Bitmap r;
    public byte[] s;
    public final Uri t;
    public final Bundle u;
    public final Uri v;
    public MediaDescription w;

    static {
        CREATOR = new hz0(19);
    }

    public pm2(String r1, CharSequence r2, CharSequence r3, CharSequence r4, Bitmap r5, Uri r6, Bundle r7, Uri r8) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.t = r6;
        this.u = r7;
        this.v = r8;
    }

    public static pm2 a(MediaDescription r13) {
        String r1 = r13.getMediaId();
        CharSequence r2 = r13.getTitle();
        CharSequence r3 = r13.getSubtitle();
        CharSequence r4 = r13.getDescription();
        Bitmap r5 = r13.getIconBitmap();
        Uri r6 = r13.getIconUri();
        Bundle r0 = f35.n(r13.getExtras());
        if (r0 == null) goto L5;
        r0 = new Bundle(r0);
    L5:
        Bundle r7 = null;
        if (r0 == null) goto L16;
        Uri r9 = (Uri) r0.getParcelable("android.support.v4.media.description.MEDIA_URI");
        if (r9 != null) goto L10;
    L15:
        r7 = r0;
    L17:
        if (r9 != null) goto L20;
        r9 = r13.getMediaUri();
    L20:
        pm2 r8 = new pm2(r1, r2, r3, r4, r5, r6, r7, r9);
        r8.w = r13;
        return r8;
    L10:
        if (r0.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") == true) goto L12;
    L14:
        r0.remove("android.support.v4.media.description.MEDIA_URI");
        r0.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        goto L15
    L12:
        if (r0.size() != 2) goto L14;
    L16:
        r9 = null;
        goto L15
    }

    public final MediaDescription b() {
        MediaDescription r0 = this.w;
        if (r0 == null) goto L5;
        return r0;
    L5:
        MediaDescription.Builder r1 = new MediaDescription.Builder();
        r1.setMediaId(this.n);
        r1.setTitle(this.o);
        r1.setSubtitle(this.p);
        r1.setDescription(this.q);
        r1.setIconBitmap(this.r);
        r1.setIconUri(this.t);
        r1.setExtras(this.u);
        r1.setMediaUri(this.v);
        MediaDescription r2 = r1.build();
        this.w = r2;
        return r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.o + ", " + this.p + ", " + this.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        b().writeToParcel(r1, r2);
    }
}
