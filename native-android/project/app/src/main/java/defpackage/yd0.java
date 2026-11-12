package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yd0 extends cx3 {
    public final z40 u;
    public final /* synthetic */ zd0 v;

    public yd0(zd0 r2, z40 r3) {
        this.v = r2;
        ConstraintLayout r4 = (ConstraintLayout) r3.n;
        super(r4);
        this.u = r3;
        r4.setOnClickListener(new p6(11, this));
    }

    public final void s(sp3 r5) {
        Child r0 = new Child(r5.a);
        r0.setTitle(r5.c);
        r0.setAlbum(r5.d);
        r0.setArtist(r5.e);
        r0.setAlbumId(r5.f);
        r0.setCoverArtId(r5.g);
        r0.setType(r5.h);
        bo2.p((bl2) this.v.s, Collections.singletonList(r0), 0, r5.b);
    }
}
