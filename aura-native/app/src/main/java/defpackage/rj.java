package defpackage;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.engine.GlideException;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rj implements zz3 {
    public final /* synthetic */ String n;
    public final /* synthetic */ ArtistPageFragment o;

    public rj(ArtistPageFragment artistPageFragment, String str) {
        this.o = artistPageFragment;
        this.n = str;
    }

    @Override // defpackage.zz3
    public final boolean a(GlideException glideException) {
        String str;
        if (glideException == null) {
            return false;
        }
        glideException.getMessage();
        if (!glideException.getMessage().contains("400") || (str = this.n) == null) {
            return false;
        }
        Log.d("ArtistCover", "Primary ID failed (400), trying fallback: ".concat(str));
        ArtistPageFragment artistPageFragment = this.o;
        Context Z = artistPageFragment.Z();
        vz3 T = b11.g(Z, str, 3, a.c(Z), wg0.b(ud3.t(), str)).T(xv0.b());
        if (ud3.R()) {
            T = (vz3) T.l();
        }
        T.K(artistPageFragment.l0.f);
        return true;
    }

    @Override // defpackage.zz3
    public final /* bridge */ /* synthetic */ void g(Object obj) {
    }
}
