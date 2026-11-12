package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.rr2;
import defpackage.v14;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends v14 {
    @Override // defpackage.v14
    public final void a(int r4, Bundle r5) {
        if (r5 == null) goto L5;
        r5 = rr2.X(r5);
    L5:
        if (r4 != 0) goto L13;
        if (r5 != null) goto L8;
        throw null;
    L8:
        if (r5.containsKey("search_results") == false) goto L16;
        Parcelable[] r6 = r5.getParcelableArray("search_results");
        r6.getClass();
        ArrayList r7 = new ArrayList(r6.length);
        int r0 = r6.length;
        int r1 = 0;
    L10:
        if (r1 >= r0) goto L12;
        r7.add((MediaBrowserCompat$MediaItem) r6[r1]);
        r1 = r1 + 1;
        goto L10
    L12:
        throw null;
    L16:
        throw null;
    L13:
        throw null;
    }
}
