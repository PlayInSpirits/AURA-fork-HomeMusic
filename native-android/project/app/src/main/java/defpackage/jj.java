package defpackage;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.ArtistID3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jj extends cx3 {
    public final x12 u;
    public final /* synthetic */ b8 v;

    public jj(b8 r4, x12 r5) {
        this.v = r4;
        ConstraintLayout r6 = r5.a;
        super(r6);
        this.u = r5;
        final int r1 = 1;
        r5.e.setSelected(true);
        final int r2 = 0;
        r6.setOnClickListener(new ij(this, r2));
        r6.setOnLongClickListener(new q6(7, this));
        r5.d.setOnClickListener(new ij(this, r1));
    }

    public final boolean s() {
        Bundle r0 = new Bundle();
        b8 r1 = this.v;
        r0.putParcelable("ARTIST_OBJECT", ((ArtistID3) r1.t.get(c())).strippedForNav());
        r1.r.onArtistLongClick(r0);
        return true;
    }
}
