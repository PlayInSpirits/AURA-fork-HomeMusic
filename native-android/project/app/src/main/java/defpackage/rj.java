package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.engine.GlideException;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rj implements zz3 {
    public final /* synthetic */ String n;
    public final /* synthetic */ ArtistPageFragment o;

    public rj(ArtistPageFragment r1, String r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // defpackage.zz3
    public final boolean a(GlideException r5) {
        if (r5 == null) goto L12;
        r5.getMessage();
        if (r5.getMessage().contains("400") == false) goto L14;
        String r6 = this.n;
        if (r6 == null) goto L15;
        Log.d("ArtistCover", "Primary ID failed (400), trying fallback: ".concat(r6));
        ArtistPageFragment r4 = this.o;
        Context r0 = r4.Z();
        vz3 r7 = b11.g(r0, r6, 3, a.c(r0), wg0.b(ud3.t(), r6)).T(xv0.b());
        if (ud3.R() == false) goto L10;
        r7 = (vz3) r7.l();
    L10:
        r7.K(r4.l0.f);
        return true;
    L15:
        return false;
    L14:
        return false;
    L12:
        return false;
    }

    @Override // defpackage.zz3
    public final /* bridge */ /* synthetic */ void g(Object r1) {
        Drawable r2 = (Drawable) r1;
    }
}
