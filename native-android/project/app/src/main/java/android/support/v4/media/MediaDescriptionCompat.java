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
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new hz0(20);
    public final String n;
    public final CharSequence o;
    public final CharSequence p;
    public final CharSequence q;
    public final Bitmap r;
    public final Uri s;
    public final Bundle t;
    public final Uri u;
    public MediaDescription v;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.n = str;
        this.o = charSequence;
        this.p = charSequence2;
        this.q = charSequence3;
        this.r = bitmap;
        this.s = uri;
        this.t = bundle;
        this.u = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = nm2.g(mediaDescription);
        CharSequence charSequenceI = nm2.i(mediaDescription);
        CharSequence charSequenceH = nm2.h(mediaDescription);
        CharSequence charSequenceC = nm2.c(mediaDescription);
        Bitmap bitmapE = nm2.e(mediaDescription);
        Uri uriF = nm2.f(mediaDescription);
        Bundle bundleD = nm2.d(mediaDescription);
        if (bundleD != null) {
            bundleD = rr2.X(bundleD);
        }
        Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uriA == null) {
            bundle = bundleD;
        } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
            bundle = null;
        } else {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = om2.a(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        mediaDescriptionCompat.v = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.o) + ", " + ((Object) this.p) + ", " + ((Object) this.q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionA = this.v;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = nm2.b();
            nm2.n(builderB, this.n);
            nm2.p(builderB, this.o);
            nm2.o(builderB, this.p);
            nm2.j(builderB, this.q);
            nm2.l(builderB, this.r);
            nm2.m(builderB, this.s);
            nm2.k(builderB, this.t);
            om2.b(builderB, this.u);
            mediaDescriptionA = nm2.a(builderB);
            this.v = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i);
    }
}
