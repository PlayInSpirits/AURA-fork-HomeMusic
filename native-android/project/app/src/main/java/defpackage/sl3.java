package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sl3 extends pp0 {
    public final /* synthetic */ int B0;
    public String C0;
    public Object D0;
    public hd E0;
    public final Object F0;

    public /* synthetic */ sl3(int i, Object obj) {
        this.B0 = i;
        this.F0 = obj;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        switch (this.B0) {
            case 0:
                super.J();
                this.D0 = null;
                break;
            default:
                super.J();
                this.D0 = null;
                break;
        }
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        switch (this.B0) {
            case 0:
                super.R();
                if (Y().getParcelableArrayList("TRACKS_OBJECT") != null) {
                    ((wl3) this.E0).e = Y().getParcelableArrayList("TRACKS_OBJECT");
                    ((wl3) this.E0).c(null);
                } else if (Y().getParcelable("PLAYLIST_OBJECT") != null) {
                    wl3 wl3Var = (wl3) this.E0;
                    wl3Var.e = null;
                    wl3Var.c((Playlist) Y().getParcelable("PLAYLIST_OBJECT"));
                    Playlist playlist = ((wl3) this.E0).f;
                    if (playlist != null) {
                        ((TextInputEditText) ((c12) this.D0).p).setText(playlist.getName());
                    }
                }
                Dialog dialog = this.w0;
                Objects.requireNonNull(dialog);
                f9 f9Var = (f9) dialog;
                final int i = 0;
                f9Var.i(-1).setOnClickListener(new View.OnClickListener(this) { // from class: pl3
                    public final /* synthetic */ sl3 o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = i;
                        sl3 sl3Var = this.o;
                        switch (i2) {
                            case 0:
                                Editable text = ((TextInputEditText) ((c12) sl3Var.D0).p).getText();
                                Objects.requireNonNull(text);
                                String strTrim = text.toString().trim();
                                sl3Var.C0 = strTrim;
                                if (!TextUtils.isEmpty(strTrim)) {
                                    om1 om1Var = new om1(17, sl3Var);
                                    wl3 wl3Var2 = (wl3) sl3Var.E0;
                                    ArrayList arrayList = wl3Var2.e;
                                    mm3 mm3Var = wl3Var2.c;
                                    if (arrayList == null) {
                                        Playlist playlist2 = wl3Var2.f;
                                        if (playlist2 != null) {
                                            String str = sl3Var.C0;
                                            String id = playlist2.getId();
                                            mm3Var.getClass();
                                            new Thread(new mr((Object) mm3Var, id, (Object) str, (Object) null, (Object) om1Var, 10)).start();
                                        }
                                    } else {
                                        String str2 = sl3Var.C0;
                                        ArrayList<String> arrayList2 = new ArrayList<>(hw.P(new nz2(14), wl3Var2.e));
                                        mm3Var.getClass();
                                        rm3 rm3VarG = App.f(false).g();
                                        rm3VarG.getClass();
                                        Log.d("BrowsingClient", "createPlaylist()");
                                        ((qm3) rm3VarG.o).a(((pn4) rm3VarG.n).f(), null, str2, arrayList2).enqueue(new hd5(mm3Var, om1Var, false, 17));
                                    }
                                } else {
                                    ((TextInputEditText) ((c12) sl3Var.D0).p).setError(sl3Var.s(R.string.error_required));
                                }
                                break;
                            case 1:
                                wl3 wl3Var3 = (wl3) sl3Var.E0;
                                pz1 pz1Var = new pz1(12, sl3Var);
                                Playlist playlist3 = wl3Var3.f;
                                if (playlist3 != null) {
                                    wl3Var3.c.b(playlist3.getId(), pz1Var);
                                }
                                break;
                            default:
                                wl3 wl3Var4 = (wl3) sl3Var.E0;
                                hh3 hh3Var = wl3Var4.d;
                                String id2 = wl3Var4.f.getId();
                                String name = wl3Var4.f.getName();
                                hh3Var.getClass();
                                hh3.h(id2, name).e(sl3Var.X(), new d8(19, sl3Var));
                                break;
                        }
                    }
                });
                Button buttonI = f9Var.i(-3);
                if (((wl3) this.E0).f == null) {
                    buttonI.setVisibility(8);
                } else {
                    buttonI.setVisibility(0);
                    final int i2 = 1;
                    buttonI.setOnClickListener(new View.OnClickListener(this) { // from class: pl3
                        public final /* synthetic */ sl3 o;

                        {
                            this.o = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = i2;
                            sl3 sl3Var = this.o;
                            switch (i3) {
                                case 0:
                                    Editable text = ((TextInputEditText) ((c12) sl3Var.D0).p).getText();
                                    Objects.requireNonNull(text);
                                    String strTrim = text.toString().trim();
                                    sl3Var.C0 = strTrim;
                                    if (!TextUtils.isEmpty(strTrim)) {
                                        om1 om1Var = new om1(17, sl3Var);
                                        wl3 wl3Var2 = (wl3) sl3Var.E0;
                                        ArrayList arrayList = wl3Var2.e;
                                        mm3 mm3Var = wl3Var2.c;
                                        if (arrayList == null) {
                                            Playlist playlist2 = wl3Var2.f;
                                            if (playlist2 != null) {
                                                String str = sl3Var.C0;
                                                String id = playlist2.getId();
                                                mm3Var.getClass();
                                                new Thread(new mr((Object) mm3Var, id, (Object) str, (Object) null, (Object) om1Var, 10)).start();
                                            }
                                        } else {
                                            String str2 = sl3Var.C0;
                                            ArrayList<String> arrayList2 = new ArrayList<>(hw.P(new nz2(14), wl3Var2.e));
                                            mm3Var.getClass();
                                            rm3 rm3VarG = App.f(false).g();
                                            rm3VarG.getClass();
                                            Log.d("BrowsingClient", "createPlaylist()");
                                            ((qm3) rm3VarG.o).a(((pn4) rm3VarG.n).f(), null, str2, arrayList2).enqueue(new hd5(mm3Var, om1Var, false, 17));
                                        }
                                    } else {
                                        ((TextInputEditText) ((c12) sl3Var.D0).p).setError(sl3Var.s(R.string.error_required));
                                    }
                                    break;
                                case 1:
                                    wl3 wl3Var3 = (wl3) sl3Var.E0;
                                    pz1 pz1Var = new pz1(12, sl3Var);
                                    Playlist playlist3 = wl3Var3.f;
                                    if (playlist3 != null) {
                                        wl3Var3.c.b(playlist3.getId(), pz1Var);
                                    }
                                    break;
                                default:
                                    wl3 wl3Var4 = (wl3) sl3Var.E0;
                                    hh3 hh3Var = wl3Var4.d;
                                    String id2 = wl3Var4.f.getId();
                                    String name = wl3Var4.f.getName();
                                    hh3Var.getClass();
                                    hh3.h(id2, name).e(sl3Var.X(), new d8(19, sl3Var));
                                    break;
                            }
                        }
                    });
                }
                final int i3 = 2;
                ((FrameLayout) ((c12) this.D0).q).setOnClickListener(new View.OnClickListener(this) { // from class: pl3
                    public final /* synthetic */ sl3 o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i3;
                        sl3 sl3Var = this.o;
                        switch (i4) {
                            case 0:
                                Editable text = ((TextInputEditText) ((c12) sl3Var.D0).p).getText();
                                Objects.requireNonNull(text);
                                String strTrim = text.toString().trim();
                                sl3Var.C0 = strTrim;
                                if (!TextUtils.isEmpty(strTrim)) {
                                    om1 om1Var = new om1(17, sl3Var);
                                    wl3 wl3Var2 = (wl3) sl3Var.E0;
                                    ArrayList arrayList = wl3Var2.e;
                                    mm3 mm3Var = wl3Var2.c;
                                    if (arrayList == null) {
                                        Playlist playlist2 = wl3Var2.f;
                                        if (playlist2 != null) {
                                            String str = sl3Var.C0;
                                            String id = playlist2.getId();
                                            mm3Var.getClass();
                                            new Thread(new mr((Object) mm3Var, id, (Object) str, (Object) null, (Object) om1Var, 10)).start();
                                        }
                                    } else {
                                        String str2 = sl3Var.C0;
                                        ArrayList<String> arrayList2 = new ArrayList<>(hw.P(new nz2(14), wl3Var2.e));
                                        mm3Var.getClass();
                                        rm3 rm3VarG = App.f(false).g();
                                        rm3VarG.getClass();
                                        Log.d("BrowsingClient", "createPlaylist()");
                                        ((qm3) rm3VarG.o).a(((pn4) rm3VarG.n).f(), null, str2, arrayList2).enqueue(new hd5(mm3Var, om1Var, false, 17));
                                    }
                                } else {
                                    ((TextInputEditText) ((c12) sl3Var.D0).p).setError(sl3Var.s(R.string.error_required));
                                }
                                break;
                            case 1:
                                wl3 wl3Var3 = (wl3) sl3Var.E0;
                                pz1 pz1Var = new pz1(12, sl3Var);
                                Playlist playlist3 = wl3Var3.f;
                                if (playlist3 != null) {
                                    wl3Var3.c.b(playlist3.getId(), pz1Var);
                                }
                                break;
                            default:
                                wl3 wl3Var4 = (wl3) sl3Var.E0;
                                hh3 hh3Var = wl3Var4.d;
                                String id2 = wl3Var4.f.getId();
                                String name = wl3Var4.f.getName();
                                hh3Var.getClass();
                                hh3.h(id2, name).e(sl3Var.X(), new d8(19, sl3Var));
                                break;
                        }
                    }
                });
                ((FrameLayout) ((c12) this.D0).q).setVisibility(ud3.V() ? 0 : 8);
                break;
            default:
                super.R();
                f9 f9Var2 = (f9) this.w0;
                if (f9Var2 != null) {
                    f9Var2.i(-1).setOnClickListener(new bj3(12, this));
                }
                break;
        }
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        switch (this.B0) {
            case 0:
                View viewInflate = o().inflate(R.layout.dialog_playlist_editor, (ViewGroup) null, false);
                int i = R.id.playlist_name_text_view;
                TextInputEditText textInputEditText = (TextInputEditText) uo.s(viewInflate, R.id.playlist_name_text_view);
                if (textInputEditText != null) {
                    i = R.id.playlist_share_button;
                    FrameLayout frameLayout = (FrameLayout) uo.s(viewInflate, R.id.playlist_share_button);
                    if (frameLayout != null) {
                        this.D0 = new c12((LinearLayout) viewInflate, textInputEditText, frameLayout, 4);
                        nc1 nc1VarX = X();
                        e75 e75VarD = nc1VarX.d();
                        b75 b75VarR = gh0.r(nc1VarX);
                        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                        i30 i30VarA = kx3.a(wl3.class);
                        String strB = i30VarA.b();
                        if (strB == null) {
                            kf2.n("Local and anonymous classes can not be ViewModels");
                            return null;
                        }
                        this.E0 = (wl3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                        vg2 vg2VarQ = new vg2(e(), 0).q((LinearLayout) ((c12) this.D0).o);
                        vg2VarQ.p(R.string.playlist_details_dialog_title);
                        vg2 vg2VarL = vg2VarQ.l(R.string.playlist_editor_dialog_positive_button, new wr(3));
                        vg2VarL.k(R.string.playlist_editor_dialog_neutral_button, new wr(6));
                        return vg2VarL.j(R.string.playlist_editor_dialog_negative_button, new wr(7)).create();
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            default:
                View viewInflate2 = o().inflate(R.layout.dialog_podcast_channel_editor, (ViewGroup) null, false);
                TextInputEditText textInputEditText2 = (TextInputEditText) uo.s(viewInflate2, R.id.podcast_channel_rss_url_name_text_view);
                if (textInputEditText2 == null) {
                    nz2.n("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.podcast_channel_rss_url_name_text_view)));
                    return null;
                }
                this.D0 = new hd5(6, (LinearLayout) viewInflate2, textInputEditText2);
                nc1 nc1VarX2 = X();
                e75 e75VarD2 = nc1VarX2.d();
                b75 b75VarR2 = gh0.r(nc1VarX2);
                bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                i30 i30VarA2 = kx3.a(xm3.class);
                String strB2 = i30VarA2.b();
                if (strB2 == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                this.E0 = (xm3) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                vg2 vg2VarQ2 = new vg2(e(), 0).q((LinearLayout) ((hd5) this.D0).o);
                vg2VarQ2.p(R.string.podcast_channel_editor_dialog_title);
                return vg2VarQ2.l(R.string.radio_editor_dialog_positive_button, new wr(3)).j(R.string.radio_editor_dialog_negative_button, new wr(8)).create();
        }
    }
}
