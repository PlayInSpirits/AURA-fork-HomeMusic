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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final String[] p;
    public static final String[] q;
    public static final String[] r;
    public final Bundle n;
    public MediaDescriptionCompat o;

    static {
        oi oiVar = new oi(0);
        oiVar.put("android.media.metadata.TITLE", 1);
        oiVar.put("android.media.metadata.ARTIST", 1);
        oiVar.put("android.media.metadata.DURATION", 0);
        oiVar.put("android.media.metadata.ALBUM", 1);
        oiVar.put("android.media.metadata.AUTHOR", 1);
        oiVar.put("android.media.metadata.WRITER", 1);
        oiVar.put("android.media.metadata.COMPOSER", 1);
        oiVar.put("android.media.metadata.COMPILATION", 1);
        oiVar.put("android.media.metadata.DATE", 1);
        oiVar.put("android.media.metadata.YEAR", 0);
        oiVar.put("android.media.metadata.GENRE", 1);
        oiVar.put("android.media.metadata.TRACK_NUMBER", 0);
        oiVar.put("android.media.metadata.NUM_TRACKS", 0);
        oiVar.put("android.media.metadata.DISC_NUMBER", 0);
        oiVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        oiVar.put("android.media.metadata.ART", 2);
        oiVar.put("android.media.metadata.ART_URI", 1);
        oiVar.put("android.media.metadata.ALBUM_ART", 2);
        oiVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        oiVar.put("android.media.metadata.USER_RATING", 3);
        oiVar.put("android.media.metadata.RATING", 3);
        oiVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        oiVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        oiVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        oiVar.put("android.media.metadata.DISPLAY_ICON", 2);
        oiVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        oiVar.put("android.media.metadata.MEDIA_ID", 1);
        oiVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        oiVar.put("android.media.metadata.MEDIA_URI", 1);
        oiVar.put("android.media.metadata.ADVERTISEMENT", 0);
        oiVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        p = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        q = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        r = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new hz0(22);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.n = parcel.readBundle(rr2.class.getClassLoader());
    }

    public static MediaMetadataCompat a(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.getClass();
        return createFromParcel;
    }

    public final MediaDescriptionCompat b() {
        Bitmap bitmap;
        Uri uri;
        String str;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.o;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = this.n;
        CharSequence charSequence = bundle.getCharSequence("android.media.metadata.MEDIA_ID");
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence3 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence3)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = p;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr[i2]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i] = charSequence4;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = charSequence3;
            charSequenceArr[1] = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = q;
            if (i4 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap = (Bitmap) bundle.getParcelable(strArr2[i4]);
            } catch (Exception e) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
                bitmap = null;
            }
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = r;
            if (i5 >= strArr3.length) {
                uri = null;
                break;
            }
            CharSequence charSequence5 = bundle.getCharSequence(strArr3[i5]);
            String charSequence6 = charSequence5 != null ? charSequence5.toString() : null;
            if (!TextUtils.isEmpty(charSequence6)) {
                uri = Uri.parse(charSequence6);
                break;
            }
            i5++;
        }
        CharSequence charSequence7 = bundle.getCharSequence("android.media.metadata.MEDIA_URI");
        String charSequence8 = charSequence7 != null ? charSequence7.toString() : null;
        Uri parse = !TextUtils.isEmpty(charSequence8) ? Uri.parse(charSequence8) : null;
        CharSequence charSequence9 = charSequenceArr[0];
        CharSequence charSequence10 = charSequenceArr[1];
        CharSequence charSequence11 = charSequenceArr[2];
        Bundle bundle2 = new Bundle();
        if (bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            str = charSequence2;
            uri2 = uri;
            bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", bundle.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        } else {
            str = charSequence2;
            uri2 = uri;
        }
        if (bundle.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", bundle.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(str, charSequence9, charSequence10, charSequence11, bitmap, uri2, !bundle2.isEmpty() ? bundle2 : null, parse);
        this.o = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.n);
    }
}
