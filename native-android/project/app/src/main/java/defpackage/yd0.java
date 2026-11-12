package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yd0 extends cx3 {
    public final z40 u;
    public final /* synthetic */ zd0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public yd0(zd0 zd0Var, z40 z40Var) {
        this.v = zd0Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) z40Var.n;
        super(constraintLayout);
        this.u = z40Var;
        constraintLayout.setOnClickListener(new p6(11, this));
    }

    public final void s(sp3 sp3Var) {
        Child child = new Child(sp3Var.a);
        child.setTitle(sp3Var.c);
        child.setAlbum(sp3Var.d);
        child.setArtist(sp3Var.e);
        child.setAlbumId(sp3Var.f);
        child.setCoverArtId(sp3Var.g);
        child.setType(sp3Var.h);
        bo2.p((bl2) this.v.s, Collections.singletonList(child), 0, sp3Var.b);
    }
}
