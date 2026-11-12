package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eo2 implements Parcelable {
    public static final Parcelable.Creator<eo2> CREATOR;
    public static final oi q;
    public static final String[] r;
    public final Bundle n;
    public MediaMetadata o;
    public byte[] p;

    static {
        oi oiVar = new oi(0);
        q = oiVar;
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
        r = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new hz0(21);
    }

    public eo2(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.n = bundle2;
        ClassLoader classLoader = qr2.class.getClassLoader();
        classLoader.getClass();
        bundle2.setClassLoader(classLoader);
    }

    public final long a(String str) {
        return this.n.getLong(str, 0L);
    }

    public final Bitmap b() {
        String[] strArr = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            Bundle bundle = this.n;
            if (bundle.containsKey(str)) {
                try {
                    return (Bitmap) bundle.getParcelable(str);
                } catch (Exception e) {
                    l93.r0("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.n);
    }

    public eo2(Parcel parcel) {
        Bundle bundle = parcel.readBundle(qr2.class.getClassLoader());
        bundle.getClass();
        this.n = bundle;
    }
}
