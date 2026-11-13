package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class nj2 extends uj2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ v14 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj2(Object obj, v14 v14Var, int i) {
        super(obj);
        this.e = i;
        this.f = v14Var;
    }

    @Override // defpackage.uj2
    public void c() {
        switch (this.e) {
            case 2:
                this.f.b(-1, null);
                break;
            default:
                super.c();
                break;
        }
    }

    @Override // defpackage.uj2
    public final void d(Object obj) {
        int i = this.e;
        v14 v14Var = this.f;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", uc5.j((ij2) obj, MediaBrowserCompat$MediaItem.CREATOR));
                v14Var.b(0, bundle);
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray("search_results", (Parcelable[]) uc5.k(list, MediaBrowserCompat$MediaItem.CREATOR).toArray(new MediaBrowserCompat$MediaItem[0]));
                    v14Var.b(0, bundle2);
                    break;
                } else {
                    v14Var.b(-1, null);
                    break;
                }
            default:
                v14Var.b(0, (Bundle) obj);
                break;
        }
    }
}
