package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import app.homemusic.R;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Line;
import com.eddyizm.tempus.subsonic.models.LyricsList;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class qk3 extends kc1 {
    public ml3 l0;
    public aj3 m0;
    public bl2 n0;
    public bj2 o0;
    public Handler p0;
    public nk3 q0;
    public String r0;
    public LyricsList s0;
    public Integer t0;
    public String u0;

    public static boolean h0(LyricsList lyricsList) {
        return (lyricsList == null || lyricsList.getStructuredLyrics() == null || lyricsList.getStructuredLyrics().isEmpty() || lyricsList.getStructuredLyrics().get(0) == null || lyricsList.getStructuredLyrics().get(0).getLine() == null || lyricsList.getStructuredLyrics().get(0).getLine().isEmpty()) ? false : true;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.inner_fragment_player_lyrics, viewGroup, false);
        int i2 = R.id.download_lyrics_button;
        MaterialButton materialButton = (MaterialButton) uo.s(viewInflate, R.id.download_lyrics_button);
        if (materialButton != null) {
            i2 = R.id.empty_description_image_view;
            ImageView imageView = (ImageView) uo.s(viewInflate, R.id.empty_description_image_view);
            if (imageView != null) {
                i2 = R.id.now_playing_song_lyrics_sroll_view;
                NestedScrollView nestedScrollView = (NestedScrollView) uo.s(viewInflate, R.id.now_playing_song_lyrics_sroll_view);
                if (nestedScrollView != null) {
                    i2 = R.id.now_playing_song_lyrics_text_view;
                    TextView textView = (TextView) uo.s(viewInflate, R.id.now_playing_song_lyrics_text_view);
                    if (textView != null) {
                        i2 = R.id.sync_lyrics_tap_button;
                        MaterialButton materialButton2 = (MaterialButton) uo.s(viewInflate, R.id.sync_lyrics_tap_button);
                        if (materialButton2 != null) {
                            i2 = R.id.temp_lyrics_line_text_view;
                            if (((TextView) uo.s(viewInflate, R.id.temp_lyrics_line_text_view)) != null) {
                                i2 = R.id.title_empty_description_label;
                                TextView textView2 = (TextView) uo.s(viewInflate, R.id.title_empty_description_label);
                                if (textView2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.l0 = new ml3(constraintLayout, materialButton, imageView, nestedScrollView, textView, materialButton2, textView2);
                                    nc1 nc1VarX = X();
                                    e75 e75VarD = nc1VarX.d();
                                    b75 b75VarR = gh0.r(nc1VarX);
                                    bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                    i30 i30VarA = kx3.a(aj3.class);
                                    String strB = i30VarA.b();
                                    if (strB == null) {
                                        kf2.n("Local and anonymous classes can not be ViewModels");
                                        return null;
                                    }
                                    this.m0 = (aj3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                    ((MaterialButton) this.l0.e).setOnClickListener(new View.OnClickListener(this) { // from class: ok3
                                        public final /* synthetic */ qk3 o;

                                        {
                                            this.o = this;
                                        }

                                        /* JADX WARN: Code duplicated, block: B:6:0x0015  */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i3 = i;
                                            boolean z = true;
                                            qk3 qk3Var = this.o;
                                            switch (i3) {
                                                case 0:
                                                    aj3 aj3Var = qk3Var.m0;
                                                    aj3Var.s = !aj3Var.s;
                                                    break;
                                                default:
                                                    aj3 aj3Var2 = qk3Var.m0;
                                                    Child child = (Child) aj3Var2.n.d();
                                                    if (child == null) {
                                                        z = false;
                                                    } else {
                                                        LyricsList lyricsList = (LyricsList) aj3Var2.k.d();
                                                        String str = (String) aj3Var2.j.d();
                                                        if ((lyricsList == null || !aj3.d(lyricsList)) && TextUtils.isEmpty(str)) {
                                                            z = false;
                                                        } else {
                                                            aj3Var2.g(child, str, lyricsList);
                                                        }
                                                    }
                                                    if (qk3Var.n() != null) {
                                                        Toast.makeText(qk3Var.Z(), z ? R.string.player_lyrics_download_success : R.string.player_lyrics_download_failure, 0).show();
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    final int i3 = 1;
                                    ((MaterialButton) this.l0.a).setOnClickListener(new View.OnClickListener(this) { // from class: ok3
                                        public final /* synthetic */ qk3 o;

                                        {
                                            this.o = this;
                                        }

                                        /* JADX WARN: Code duplicated, block: B:6:0x0015  */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i4 = i3;
                                            boolean z = true;
                                            qk3 qk3Var = this.o;
                                            switch (i4) {
                                                case 0:
                                                    aj3 aj3Var = qk3Var.m0;
                                                    aj3Var.s = !aj3Var.s;
                                                    break;
                                                default:
                                                    aj3 aj3Var2 = qk3Var.m0;
                                                    Child child = (Child) aj3Var2.n.d();
                                                    if (child == null) {
                                                        z = false;
                                                    } else {
                                                        LyricsList lyricsList = (LyricsList) aj3Var2.k.d();
                                                        String str = (String) aj3Var2.j.d();
                                                        if ((lyricsList == null || !aj3.d(lyricsList)) && TextUtils.isEmpty(str)) {
                                                            z = false;
                                                        } else {
                                                            aj3Var2.g(child, str, lyricsList);
                                                        }
                                                    }
                                                    if (qk3Var.n() != null) {
                                                        Toast.makeText(qk3Var.Z(), z ? R.string.player_lyrics_download_success : R.string.player_lyrics_download_failure, 0).show();
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    return constraintLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
        this.r0 = null;
        this.s0 = null;
        this.u0 = null;
        this.t0 = null;
    }

    @Override // defpackage.kc1
    public final void O() {
        this.R = true;
        Handler handler = this.p0;
        if (handler != null) {
            handler.removeCallbacks(this.q0);
            this.p0 = null;
        }
        if (xa3.u("always_on_display", false)) {
            return;
        }
        X().getWindow().clearFlags(128);
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        this.n0.f(new nk3(this, 0), gq0.n);
        X().getWindow().addFlags(128);
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Context contextZ = Z();
        cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, cb4Var.a.e() ? new xc5(4, new fi0(new x7(contextZ))) : null), new Handler(looperX));
        this.n0 = bl2Var;
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.n0);
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        this.m0.j.e(v(), new mk3(this, 1));
        this.m0.k.e(v(), new mk3(this, 2));
        this.m0.m.e(v(), new mk3(this, 3));
        this.m0.l.e(v(), new mk3(this, 0));
    }

    public final void i0() {
        ml3 ml3Var = this.l0;
        if (ml3Var == null) {
            return;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) ml3Var.c;
        nestedScrollView.u(0 - nestedScrollView.getScrollX(), 0 - nestedScrollView.getScrollY(), false);
        if (h0(this.s0)) {
            LyricsList lyricsList = this.s0;
            if (lyricsList.getStructuredLyrics() != null && !lyricsList.getStructuredLyrics().isEmpty() && lyricsList.getStructuredLyrics().get(0).getLine() != null) {
                StringBuilder sb = new StringBuilder();
                List<Line> line = lyricsList.getStructuredLyrics().get(0).getLine();
                if (line != null) {
                    Iterator<Line> it = line.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next().getValue().trim());
                        sb.append("\n\n");
                    }
                }
                ((TextView) this.l0.d).setText(sb.toString());
            }
            ((TextView) this.l0.d).setVisibility(0);
            ((ImageView) this.l0.b).setVisibility(8);
            ((TextView) this.l0.f).setVisibility(8);
            ((MaterialButton) this.l0.e).setVisibility(0);
            ((MaterialButton) this.l0.a).setVisibility(0);
            ((MaterialButton) this.l0.a).setEnabled(true);
            return;
        }
        String str = this.r0;
        if (str != null && !str.trim().isEmpty()) {
            ((TextView) this.l0.d).setText(e03.i(this.r0));
            ((TextView) this.l0.d).setVisibility(0);
            ((ImageView) this.l0.b).setVisibility(8);
            ((TextView) this.l0.f).setVisibility(8);
            ((MaterialButton) this.l0.e).setVisibility(8);
            ((MaterialButton) this.l0.a).setVisibility(0);
            ((MaterialButton) this.l0.a).setEnabled(true);
            return;
        }
        String str2 = this.u0;
        boolean z = (str2 == null || str2.trim().isEmpty()) ? false : true;
        ml3 ml3Var2 = this.l0;
        if (!z) {
            ((TextView) ml3Var2.d).setVisibility(8);
            ((ImageView) this.l0.b).setVisibility(0);
            ((TextView) this.l0.f).setVisibility(0);
            ((MaterialButton) this.l0.e).setVisibility(8);
            ((MaterialButton) this.l0.a).setVisibility(8);
            ((MaterialButton) this.l0.a).setEnabled(false);
            return;
        }
        ((TextView) ml3Var2.d).setText(e03.i(this.u0));
        ((TextView) this.l0.d).setVisibility(0);
        ((ImageView) this.l0.b).setVisibility(8);
        ((TextView) this.l0.f).setVisibility(8);
        ((MaterialButton) this.l0.e).setVisibility(8);
        ((MaterialButton) this.l0.a).setVisibility(8);
        ((MaterialButton) this.l0.a).setEnabled(false);
    }
}
