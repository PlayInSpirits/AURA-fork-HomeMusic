package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.google.android.material.materialswitch.MaterialSwitch;
import java.util.AbstractList;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fl3 extends pp0 implements ClickCallback {
    public ml3 B0;
    public gl3 C0;
    public zd0 D0;

    public fl3() {
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        RecyclerView r0 = (RecyclerView) this.B0.f;
        Z();
        r0.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.B0.f).setHasFixedSize(true);
        zd0 r1 = new zd0(this);
        this.D0 = r1;
        ((RecyclerView) this.B0.f).setAdapter(r1);
        mm3 r2 = this.C0.c;
        r2.h();
        r2.e(ud3.s()).e(this, new d8(18, this));
        gl3 r3 = this.C0;
        r3.e = Y().getParcelableArrayList("TRACKS_OBJECT");
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r5) {
        ml3.p(o());
        this.B0 = ml3.p(o());
        nc1 r6 = X();
        e75 r0 = r6.d();
        b75 r1 = gh0.r(r6);
        bq4 r2 = new bq4(r0, r1, b11.e(r6, r1));
        i30 r7 = kx3.a(gl3.class);
        String r3 = r7.b();
        if (r3 == null) goto L6;
        gl3 r8 = (gl3) r2.l(r7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r3));
        this.C0 = r8;
        r8.d.k(null);
        ((MaterialSwitch) this.B0.e).setOnCheckedChangeListener(new g20(2, this));
        final int r4 = 0;
        ((Button) this.B0.d).setOnClickListener(new el3(this, r4));
        final int r9 = 1;
        ((Button) this.B0.c).setOnClickListener(new el3(this, r9));
        vg2 r10 = new vg2(Z(), 0).q((LinearLayout) this.B0.a);
        r10.p(R.string.playlist_chooser_dialog_title);
        return r10.create();
    L6:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle r9) {
        ArrayList r0 = this.C0.e;
        if (r0 != null) goto L5;
    L12:
        Toast.makeText(Z(), R.string.playlist_chooser_dialog_toast_add_failure, 0).show();
        return;
    L5:
        if (r0.isEmpty() == true) goto L12;
        Playlist r10 = (Playlist) r9.getParcelable("PLAYLIST_OBJECT");
        gl3 r3 = this.C0;
        Dialog r6 = this.w0;
        String r5 = r10.getId();
        ArrayList r11 = r3.e;
        AbstractList r4 = hw.P(new nz2(14), r11);
        boolean r12 = xa3.u("allow_playlist_duplicates", false);
        mm3 r1 = r3.c;
        if (r12 == false) goto L10;
        r1.a(r5, new ArrayList(r4), (Boolean) r3.d.d());
        r6.dismiss();
        return;
    L10:
        r1.c(r5, true, null).e(this, new oq0(r3, r4, r5, r6, 2));
    }
}
