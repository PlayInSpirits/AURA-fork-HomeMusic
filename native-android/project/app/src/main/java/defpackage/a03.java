package defpackage;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.Artist;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a03 extends cx3 {
    public final z12 u;
    public final /* synthetic */ b03 v;

    public a03(b03 r4, z12 r5) {
        this.v = r4;
        ConstraintLayout r6 = r5.a;
        super(r6);
        this.u = r5;
        final int r1 = 1;
        r5.e.setSelected(true);
        final int r2 = 0;
        r6.setOnClickListener(new zz2(this, r2));
        r5.c.setOnClickListener(new zz2(this, r1));
        final int r0 = 2;
        r5.d.setOnClickListener(new zz2(this, r0));
    }

    public final void s() {
        Bundle r0 = new Bundle();
        b03 r1 = this.v;
        r0.putString("MUSIC_DIRECTORY_ID", ((Artist) r1.r.get(c())).getId());
        r1.q.onMusicIndexClick(r0);
    }
}
