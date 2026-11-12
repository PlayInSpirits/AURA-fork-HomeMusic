package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.rr2;
import defpackage.v14;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends v14 {
    @Override // defpackage.v14
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = rr2.X(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
