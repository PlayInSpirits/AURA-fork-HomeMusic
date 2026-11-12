package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eo2 implements Parcelable {
    public static final Parcelable.Creator<eo2> CREATOR = null;
    public static final oi q = null;
    public static final String[] r = null;
    public final Bundle n;
    public MediaMetadata o;
    public byte[] p;

    static {
        oi r0 = new oi(0);
        q = r0;
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
        r = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new hz0(21);
    }

    public eo2(Bundle r2) {
        Bundle r0 = new Bundle(r2);
        this.n = r0;
        ClassLoader r1 = qr2.class.getClassLoader();
        r1.getClass();
        r0.setClassLoader(r1);
    }

    public final long a(String r3) {
        return this.n.getLong(r3, 0);
    }

    public final Bitmap b() {
        String[] r0 = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART"};
        int r1 = 0;
    L4:
        if (r1 >= 3) goto L13;
        String r2 = r0[r1];
        Bundle r4 = this.n;
        if (r4.containsKey(r2) == true) goto L14;
        r1 = r1 + 1;
        goto L4
    L14:
        return (Bitmap) r4.getParcelable(r2);
    L9:
        e = move-exception;
        l93.r0("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
        return null;
    L13:
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeBundle(this.n);
    }

    public eo2(Parcel r2) {
        Bundle r3 = r2.readBundle(qr2.class.getClassLoader());
        r3.getClass();
        this.n = r3;
    }
}
