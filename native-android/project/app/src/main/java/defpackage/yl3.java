package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl3 extends cx3 {
    public final x12 u;
    public final /* synthetic */ ej v;

    public yl3(ej r4, x12 r5) {
        this.v = r4;
        ConstraintLayout r6 = r5.a;
        super(r6);
        this.u = r5;
        final int r1 = 1;
        r5.e.setSelected(true);
        final int r2 = 0;
        r6.setOnClickListener(new xl3(this, r2));
        r6.setOnLongClickListener(new q6(15, this));
        r5.d.setOnClickListener(new xl3(this, r1));
    }

    public final void s() {
        Bundle r0 = new Bundle();
        ej r1 = this.v;
        r0.putParcelable("PLAYLIST_OBJECT", (Parcelable) r1.r.get(c()));
        r1.t.onPlaylistLongClick(r0);
    }
}
