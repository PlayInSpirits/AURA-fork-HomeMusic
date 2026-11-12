package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.rr2;
import defpackage.v14;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends v14 {
    @Override // defpackage.v14
    public final void a(int r2, Bundle r3) {
        if (r3 == null) goto L5;
        r3 = rr2.X(r3);
    L5:
        if (r2 != 0) goto L17;
        if (r3 != null) goto L8;
        throw null;
    L8:
        if (r3.containsKey("media_item") == false) goto L19;
        Parcelable r4 = r3.getParcelable("media_item");
        if (r4 != null) goto L12;
    L15:
        MediaBrowserCompat$MediaItem r5 = (MediaBrowserCompat$MediaItem) r4;
        throw null;
    L12:
        if ((r4 instanceof MediaBrowserCompat$MediaItem) == true) goto L15;
        throw null;
    L19:
        throw null;
    L17:
        throw null;
    }
}
