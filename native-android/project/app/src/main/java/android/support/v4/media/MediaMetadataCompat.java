package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import defpackage.hz0;
import defpackage.oi;
import defpackage.rr2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = null;
    public static final String[] p = null;
    public static final String[] q = null;
    public static final String[] r = null;
    public final Bundle n;
    public MediaDescriptionCompat o;

    static {
        oi r0 = new oi(0);
        r0.put("android.media.metadata.TITLE", 1);
        r0.put("android.media.metadata.ARTIST", 1);
        r0.put("android.media.metadata.DURATION", 0);
        r0.put("android.media.metadata.ALBUM", 1);
        r0.put("android.media.metadata.AUTHOR", 1);
        r0.put("android.media.metadata.WRITER", 1);
        r0.put("android.media.metadata.COMPOSER", 1);
        r0.put("android.media.metadata.COMPILATION", 1);
        r0.put("android.media.metadata.DATE", 1);
        r0.put("android.media.metadata.YEAR", 0);
        r0.put("android.media.metadata.GENRE", 1);
        r0.put("android.media.metadata.TRACK_NUMBER", 0);
        r0.put("android.media.metadata.NUM_TRACKS", 0);
        r0.put("android.media.metadata.DISC_NUMBER", 0);
        r0.put("android.media.metadata.ALBUM_ARTIST", 1);
        r0.put("android.media.metadata.ART", 2);
        r0.put("android.media.metadata.ART_URI", 1);
        r0.put("android.media.metadata.ALBUM_ART", 2);
        r0.put("android.media.metadata.ALBUM_ART_URI", 1);
        r0.put("android.media.metadata.USER_RATING", 3);
        r0.put("android.media.metadata.RATING", 3);
        r0.put("android.media.metadata.DISPLAY_TITLE", 1);
        r0.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        r0.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        r0.put("android.media.metadata.DISPLAY_ICON", 2);
        r0.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        r0.put("android.media.metadata.MEDIA_ID", 1);
        r0.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        r0.put("android.media.metadata.MEDIA_URI", 1);
        r0.put("android.media.metadata.ADVERTISEMENT", 0);
        r0.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        p = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        q = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        r = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new hz0(22);
    }

    public MediaMetadataCompat(Parcel r2) {
        this.n = r2.readBundle(rr2.class.getClassLoader());
    }

    public static MediaMetadataCompat a(MediaMetadata r2) {
        if (r2 == null) goto L5;
        Parcel r0 = Parcel.obtain();
        r2.writeToParcel(r0, 0);
        r0.setDataPosition(0);
        MediaMetadataCompat r3 = CREATOR.createFromParcel(r0);
        r0.recycle();
        r3.getClass();
        return r3;
    L5:
        return null;
    }

    public final MediaDescriptionCompat b() {
        MediaDescriptionCompat r0 = this.o;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Bundle r2 = this.n;
        CharSequence r1 = r2.getCharSequence("android.media.metadata.MEDIA_ID");
        if (r1 == null) goto L8;
        String r5 = r1.toString();
    L9:
        CharSequence[] r4 = new CharSequence[3];
        CharSequence r6 = r2.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(r6) == true) goto L12;
        r4[0] = r6;
        r4[1] = r2.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
        r4[2] = r2.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
    L20:
        int r7 = 0;
    L21:
        String[] r3 = q;
        if (r7 >= r3.length) goto L31;
        Bitmap r8 = (Bitmap) r2.getParcelable(r3[r7]);     // Catch: Exception -> L26
    L28:
        if (r8 != null) goto L32;
        r7 = r7 + 1;
    L32:
        int r9 = 0;
    L33:
        String[] r10 = r;
        if (r9 >= r10.length) goto L43;
        CharSequence r11 = r2.getCharSequence(r10[r9]);
        if (r11 == null) goto L38;
        String r12 = r11.toString();
    L40:
        if (TextUtils.isEmpty(r12) == false) goto L41;
        r9 = r9 + 1;
        goto L33
    L41:
        Uri r13 = Uri.parse(r12);
    L44:
        CharSequence r14 = r2.getCharSequence("android.media.metadata.MEDIA_URI");
        if (r14 == null) goto L47;
        String r15 = r14.toString();
    L49:
        if (TextUtils.isEmpty(r15) == true) goto L51;
        Uri r16 = Uri.parse(r15);
    L52:
        CharSequence r17 = r4[0];
        CharSequence r18 = r4[1];
        CharSequence r19 = r4[2];
        Bundle r20 = new Bundle();
        if (r2.containsKey("android.media.metadata.BT_FOLDER_TYPE") == false) goto L57;
        r20.putLong("android.media.extra.BT_FOLDER_TYPE", r2.getLong("android.media.metadata.BT_FOLDER_TYPE", 0));
    L57:
        if (r2.containsKey("android.media.metadata.DOWNLOAD_STATUS") == false) goto L60;
        r20.putLong("android.media.extra.DOWNLOAD_STATUS", r2.getLong("android.media.metadata.DOWNLOAD_STATUS", 0));
    L60:
        if (r20.isEmpty() == true) goto L62;
        Bundle r110 = r20;
    L63:
        MediaDescriptionCompat r21 = new MediaDescriptionCompat(r5, r17, r18, r19, r8, r13, r110, r16);
        this.o = r21;
        return r21;
    L62:
        r110 = null;
        goto L63
    L51:
        r16 = null;
        goto L52
    L47:
        r15 = null;
        goto L49
    L38:
        r12 = null;
        goto L40
    L43:
        r13 = null;
    L26:
        e = move-exception;
        Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
        r8 = null;
        goto L28
    L31:
        r8 = null;
        goto L32
    L12:
        int r22 = 0;
        int r23 = 0;
    L13:
        if (r22 >= 3) goto L20;
        String[] r111 = p;
        if (r23 >= r111.length) goto L20;
        int r112 = r23 + 1;
        CharSequence r24 = r2.getCharSequence(r111[r23]);
        if (TextUtils.isEmpty(r24) == true) goto L19;
        r4[r22] = r24;
        r22 = r22 + 1;
    L19:
        r23 = r112;
        goto L13
    L8:
        r5 = null;
        goto L9
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeBundle(this.n);
    }
}
