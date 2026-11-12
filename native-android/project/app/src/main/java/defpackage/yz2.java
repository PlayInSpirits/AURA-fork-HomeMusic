package defpackage;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yz2 extends cx3 {
    public final z12 u;
    public final /* synthetic */ zd0 v;

    public yz2(zd0 r4, z12 r5) {
        this.v = r4;
        ConstraintLayout r6 = r5.a;
        super(r6);
        this.u = r5;
        final int r1 = 1;
        r5.e.setSelected(true);
        final int r2 = 0;
        r6.setOnClickListener(new xz2(this, r2));
        r6.setOnLongClickListener(new q6(13, this));
        r5.c.setOnClickListener(new xz2(this, r1));
        final int r0 = 2;
        r5.d.setOnClickListener(new xz2(this, r0));
    }

    public final void s() {
        Bundle r0 = new Bundle();
        zd0 r1 = this.v;
        DirectoryFragment r2 = (DirectoryFragment) r1.s;
        if (((Child) r1.r.get(c())).isDir() == false) goto L6;
        r0.putString("MUSIC_DIRECTORY_ID", ((Child) r1.r.get(c())).getId());
        r2.onMusicDirectoryClick(r0);
        return;
    L6:
        r0.putParcelableArrayList("TRACKS_OBJECT", new ArrayList(r1.r));
        r0.putInt("ITEM_POSITION", c());
        r2.onMediaClick(r0);
    }
}
