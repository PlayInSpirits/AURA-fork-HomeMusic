package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hz0;
import defpackage.nm2;
import defpackage.om2;
import defpackage.rr2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = null;
    public final String n;
    public final CharSequence o;
    public final CharSequence p;
    public final CharSequence q;
    public final Bitmap r;
    public final Uri s;
    public final Bundle t;
    public final Uri u;
    public MediaDescription v;

    static {
        CREATOR = new hz0(20);
    }

    public MediaDescriptionCompat(String r1, CharSequence r2, CharSequence r3, CharSequence r4, Bitmap r5, Uri r6, Bundle r7, Uri r8) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.t = r7;
        this.u = r8;
    }

    public static MediaDescriptionCompat a(Object r13) {
        if (r13 == null) goto L24;
        MediaDescription r14 = (MediaDescription) r13;
        String r2 = nm2.g(r14);
        CharSequence r3 = nm2.i(r14);
        CharSequence r4 = nm2.h(r14);
        CharSequence r5 = nm2.c(r14);
        Bitmap r6 = nm2.e(r14);
        Uri r7 = nm2.f(r14);
        Bundle r1 = nm2.d(r14);
        if (r1 == null) goto L8;
        r1 = rr2.X(r1);
    L8:
        if (r1 == null) goto L10;
        Uri r9 = (Uri) r1.getParcelable("android.support.v4.media.description.MEDIA_URI");
    L11:
        if (r9 != null) goto L13;
    L18:
        Bundle r8 = r1;
    L19:
        if (r9 != null) goto L22;
        r9 = om2.a(r14);
    L22:
        MediaDescriptionCompat r10 = new MediaDescriptionCompat(r2, r3, r4, r5, r6, r7, r8, r9);
        r10.v = r14;
        return r10;
    L13:
        if (r1.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") == true) goto L15;
    L17:
        r1.remove("android.support.v4.media.description.MEDIA_URI");
        r1.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        goto L18
    L15:
        if (r1.size() != 2) goto L17;
        r8 = null;
        goto L19
    L10:
        r9 = null;
        goto L11
    L24:
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.o + ", " + this.p + ", " + this.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        MediaDescription r0 = this.v;
        if (r0 != null) goto L5;
        MediaDescription.Builder r1 = nm2.b();
        nm2.n(r1, this.n);
        nm2.p(r1, this.o);
        nm2.o(r1, this.p);
        nm2.j(r1, this.q);
        nm2.l(r1, this.r);
        nm2.m(r1, this.s);
        nm2.k(r1, this.t);
        om2.b(r1, this.u);
        r0 = nm2.a(r1);
        this.v = r0;
    L5:
        r0.writeToParcel(r3, r4);
    }
}
