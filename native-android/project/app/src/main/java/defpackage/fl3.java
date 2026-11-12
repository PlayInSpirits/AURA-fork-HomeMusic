package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
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

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        RecyclerView recyclerView = (RecyclerView) this.B0.f;
        Z();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ((RecyclerView) this.B0.f).setHasFixedSize(true);
        zd0 zd0Var = new zd0(this);
        this.D0 = zd0Var;
        ((RecyclerView) this.B0.f).setAdapter(zd0Var);
        mm3 mm3Var = this.C0.c;
        mm3Var.h();
        mm3Var.e(ud3.s()).e(this, new d8(18, this));
        this.C0.e = Y().getParcelableArrayList("TRACKS_OBJECT");
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        ml3.p(o());
        this.B0 = ml3.p(o());
        nc1 nc1VarX = X();
        e75 e75VarD = nc1VarX.d();
        b75 b75VarR = gh0.r(nc1VarX);
        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
        i30 i30VarA = kx3.a(gl3.class);
        String strB = i30VarA.b();
        if (strB == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        gl3 gl3Var = (gl3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        this.C0 = gl3Var;
        gl3Var.d.k(null);
        ((MaterialSwitch) this.B0.e).setOnCheckedChangeListener(new g20(2, this));
        final int i = 0;
        ((Button) this.B0.d).setOnClickListener(new View.OnClickListener(this) { // from class: el3
            public final /* synthetic */ fl3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                fl3 fl3Var = this.o;
                switch (i2) {
                    case 0:
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelableArrayList("TRACKS_OBJECT", fl3Var.C0.e);
                        sl3 sl3Var = new sl3(0, null);
                        sl3Var.c0(bundle2);
                        sl3Var.m0(fl3Var.X().k(), null);
                        fl3Var.i0(false, false);
                        break;
                    default:
                        fl3Var.i0(false, false);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((Button) this.B0.c).setOnClickListener(new View.OnClickListener(this) { // from class: el3
            public final /* synthetic */ fl3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                fl3 fl3Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelableArrayList("TRACKS_OBJECT", fl3Var.C0.e);
                        sl3 sl3Var = new sl3(0, null);
                        sl3Var.c0(bundle2);
                        sl3Var.m0(fl3Var.X().k(), null);
                        fl3Var.i0(false, false);
                        break;
                    default:
                        fl3Var.i0(false, false);
                        break;
                }
            }
        });
        vg2 vg2VarQ = new vg2(Z(), 0).q((LinearLayout) this.B0.a);
        vg2VarQ.p(R.string.playlist_chooser_dialog_title);
        return vg2VarQ.create();
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onPlaylistClick(Bundle bundle) {
        ArrayList arrayList = this.C0.e;
        if (arrayList == null || arrayList.isEmpty()) {
            Toast.makeText(Z(), R.string.playlist_chooser_dialog_toast_add_failure, 0).show();
            return;
        }
        Playlist playlist = (Playlist) bundle.getParcelable("PLAYLIST_OBJECT");
        gl3 gl3Var = this.C0;
        Dialog dialog = this.w0;
        String id = playlist.getId();
        AbstractList abstractListP = hw.P(new nz2(14), gl3Var.e);
        boolean zU = xa3.u("allow_playlist_duplicates", false);
        mm3 mm3Var = gl3Var.c;
        if (!zU) {
            mm3Var.c(id, true, null).e(this, new oq0(gl3Var, abstractListP, id, dialog, 2));
        } else {
            mm3Var.a(id, new ArrayList(abstractListP), (Boolean) gl3Var.d.d());
            dialog.dismiss();
        }
    }
}
