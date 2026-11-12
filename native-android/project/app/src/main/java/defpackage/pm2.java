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
    public static final Parcelable.Creator<pm2> CREATOR = new hz0(19);
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

    public pm2(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.n = str;
        this.o = charSequence;
        this.p = charSequence2;
        this.q = charSequence3;
        this.r = bitmap;
        this.t = uri;
        this.u = bundle;
        this.v = uri2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public static pm2 a(MediaDescription mediaDescription) {
        Uri mediaUri;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle bundleN = f35.n(mediaDescription.getExtras());
        if (bundleN != null) {
            bundleN = new Bundle(bundleN);
        }
        Bundle bundle = null;
        if (bundleN != null) {
            mediaUri = (Uri) bundleN.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (mediaUri != null) {
                if (!bundleN.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleN.size() != 2) {
                    bundleN.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleN.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            if (mediaUri == null) {
                mediaUri = mediaDescription.getMediaUri();
            }
            pm2 pm2Var = new pm2(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
            pm2Var.w = mediaDescription;
            return pm2Var;
        }
        mediaUri = null;
        bundle = bundleN;
        if (mediaUri == null) {
            mediaUri = mediaDescription.getMediaUri();
        }
        pm2 pm2Var2 = new pm2(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
        pm2Var2.w = mediaDescription;
        return pm2Var2;
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.w;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.n);
        builder.setTitle(this.o);
        builder.setSubtitle(this.p);
        builder.setDescription(this.q);
        builder.setIconBitmap(this.r);
        builder.setIconUri(this.t);
        builder.setExtras(this.u);
        builder.setMediaUri(this.v);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.w = mediaDescriptionBuild;
        return mediaDescriptionBuild;
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
        b().writeToParcel(parcel, i);
    }
}
