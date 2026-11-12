package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nj2 extends uj2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ v14 f;

    public /* synthetic */ nj2(Object r1, v14 r2, int r3) {
        this.e = r3;
        this.f = r2;
        super(r1);
    }

    @Override // defpackage.uj2
    public void c() {
        switch(this.e) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        super.c();
        return;
    L6:
        this.f.b(-1, null);
    }

    @Override // defpackage.uj2
    public final void d(Object r4) {
        int r0 = this.e;
        v14 r3 = this.f;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r3.b(0, (Bundle) r4);
        return;
    L6:
        List r5 = (List) r4;
        if (r5 != null) goto L9;
        r3.b(-1, null);
        return;
    L9:
        Bundle r1 = new Bundle();
        r1.putParcelableArray("search_results", (Parcelable[]) uc5.k(r5, MediaBrowserCompat$MediaItem.CREATOR).toArray(new MediaBrowserCompat$MediaItem[0]));
        r3.b(0, r1);
        return;
    L11:
        Bundle r2 = new Bundle();
        r2.putParcelable("media_item", uc5.j((ij2) r4, MediaBrowserCompat$MediaItem.CREATOR));
        r3.b(0, r2);
    }
}
