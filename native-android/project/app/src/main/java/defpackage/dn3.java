package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dn3 extends cx3 {
    public final w12 u;
    public final /* synthetic */ en3 v;

    public dn3(en3 r3, w12 r4) {
        this.v = r3;
        ConstraintLayout r5 = (ConstraintLayout) r4.b;
        super(r5);
        this.u = r4;
        final int r1 = 0;
        r5.setOnClickListener(new cn3(this, r1));
        r5.setOnLongClickListener(new q6(18, this));
        final int r2 = 1;
        ((Button) r4.j).setOnClickListener(new cn3(this, r2));
        final int r6 = 2;
        ((Button) r4.i).setOnClickListener(new cn3(this, r6));
        final int r0 = 3;
        ((Button) r4.h).setOnClickListener(new cn3(this, r0));
    }

    public final void s() {
        en3 r0 = this.v;
        if (((PodcastEpisode) r0.r.get(c())).getStatus().equals("completed") == false) goto L6;
        Bundle r1 = new Bundle();
        r1.putParcelable("PODCAST_OBJECT", (Parcelable) r0.r.get(c()));
        r0.q.onPodcastEpisodeClick(r1);
        return;
    }

    public final boolean t() {
        en3 r0 = this.v;
        if (((PodcastEpisode) r0.r.get(c())).getStatus().equals("completed") == false) goto L6;
        Bundle r1 = new Bundle();
        r1.putParcelable("PODCAST_OBJECT", (Parcelable) r0.r.get(c()));
        r0.q.onPodcastEpisodeLongClick(r1);
        return true;
    L6:
        return false;
    }
}
