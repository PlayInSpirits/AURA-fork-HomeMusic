package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import app.homemusic.R;
import com.eddyizm.tempus.service.MediaService;
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

    public qk3() {
    }

    public static boolean h0(LyricsList r2) {
        if (r2 != null) goto L5;
    L16:
        return false;
    L5:
        if (r2.getStructuredLyrics() == null) goto L16;
        if (r2.getStructuredLyrics().isEmpty() == true) goto L16;
        if (r2.getStructuredLyrics().get(0) == null) goto L16;
        if (r2.getStructuredLyrics().get(0).getLine() == null) goto L16;
        if (r2.getStructuredLyrics().get(0).getLine().isEmpty() == true) goto L16;
        return true;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r10, ViewGroup r11, Bundle r12) {
        final int r0 = 0;
        View r13 = r10.inflate(R.layout.inner_fragment_player_lyrics, r11, false);
        int r14 = R.id.download_lyrics_button;
        MaterialButton r3 = (MaterialButton) uo.s(r13, R.id.download_lyrics_button);
        if (r3 == null) goto L22;
        r14 = R.id.empty_description_image_view;
        ImageView r4 = (ImageView) uo.s(r13, R.id.empty_description_image_view);
        if (r4 == null) goto L22;
        r14 = R.id.now_playing_song_lyrics_sroll_view;
        NestedScrollView r5 = (NestedScrollView) uo.s(r13, R.id.now_playing_song_lyrics_sroll_view);
        if (r5 == null) goto L22;
        r14 = R.id.now_playing_song_lyrics_text_view;
        TextView r6 = (TextView) uo.s(r13, R.id.now_playing_song_lyrics_text_view);
        if (r6 == null) goto L22;
        r14 = R.id.sync_lyrics_tap_button;
        MaterialButton r7 = (MaterialButton) uo.s(r13, R.id.sync_lyrics_tap_button);
        if (r7 == null) goto L22;
        r14 = R.id.temp_lyrics_line_text_view;
        if (((TextView) uo.s(r13, R.id.temp_lyrics_line_text_view)) == null) goto L22;
        r14 = R.id.title_empty_description_label;
        TextView r8 = (TextView) uo.s(r13, R.id.title_empty_description_label);
        if (r8 == null) goto L22;
        ConstraintLayout r2 = (ConstraintLayout) r13;
        this.l0 = new ml3(r2, r3, r4, r5, r6, r7, r8);
        nc1 r15 = X();
        e75 r16 = r15.d();
        b75 r1 = gh0.r(r15);
        bq4 r9 = new bq4(r16, r1, b11.e(r15, r1));
        i30 r17 = kx3.a(aj3.class);
        String r18 = r17.b();
        if (r18 == null) goto L20;
        this.m0 = (aj3) r9.l(r17, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r18));
        ((MaterialButton) this.l0.e).setOnClickListener(new ok3(this, r0));
        final int r19 = 1;
        ((MaterialButton) this.l0.a).setOnClickListener(new ok3(this, r19));
        return r2;
    L20:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L22:
        nz2.n("Missing required view with ID: ".concat(r13.getResources().getResourceName(r14)));
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
        Handler r0 = this.p0;
        if (r0 == null) goto L6;
        r0.removeCallbacks(this.q0);
        this.p0 = null;
    L6:
        if (xa3.u("always_on_display", false) == true) goto L9;
        X().getWindow().clearFlags(128);
        return;
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
        Context r2 = Z();
        cb4 r3 = new cb4(Z(), new ComponentName(Z(), MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        aj2 r5 = new aj2();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        if (r3.a.e() == false) goto L6;
        xc5 r0 = new xc5(4, new fi0(new x7(r2)));
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.n0 = r7;
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.n0);
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void T(View r3, Bundle r4) {
        this.m0.j.e(v(), new mk3(this, 1));
        this.m0.k.e(v(), new mk3(this, 2));
        this.m0.m.e(v(), new mk3(this, 3));
        this.m0.l.e(v(), new mk3(this, 0));
    }

    public final void i0() {
        ml3 r0 = this.l0;
        if (r0 != null) goto L5;
        return;
    L5:
        NestedScrollView r1 = (NestedScrollView) r0.c;
        r1.u(0 - r1.getScrollX(), 0 - r1.getScrollY(), false);
        boolean r2 = true;
        if (h0(this.s0) == false) goto L22;
        LyricsList r3 = this.s0;
        if (r3.getStructuredLyrics() != null) goto L10;
    L20:
        ((TextView) this.l0.d).setVisibility(0);
        ((ImageView) this.l0.b).setVisibility(8);
        ((TextView) this.l0.f).setVisibility(8);
        ((MaterialButton) this.l0.e).setVisibility(0);
        ((MaterialButton) this.l0.a).setVisibility(0);
        ((MaterialButton) this.l0.a).setEnabled(true);
        return;
    L10:
        if (r3.getStructuredLyrics().isEmpty() == true) goto L20;
        if (r3.getStructuredLyrics().get(0).getLine() == null) goto L20;
        StringBuilder r4 = new StringBuilder();
        List<Line> r5 = r3.getStructuredLyrics().get(0).getLine();
        if (r5 == null) goto L19;
        Iterator<Line> r6 = r5.iterator();
    L17:
        if (r6.hasNext() == false) goto L19;
        r4.append(r6.next().getValue().trim());
        r4.append("\n\n");
    L19:
        ((TextView) this.l0.d).setText(r4.toString());
        goto L20
    L22:
        String r7 = this.r0;
        if (r7 != null) goto L25;
    L28:
        String r8 = this.u0;
        if (r8 != null) goto L31;
    L33:
        r2 = false;
    L34:
        ml3 r9 = this.l0;
        if (r2 == false) goto L38;
        ((TextView) r9.d).setText(e03.i(this.u0));
        ((TextView) this.l0.d).setVisibility(0);
        ((ImageView) this.l0.b).setVisibility(8);
        ((TextView) this.l0.f).setVisibility(8);
        ((MaterialButton) this.l0.e).setVisibility(8);
        ((MaterialButton) this.l0.a).setVisibility(8);
        ((MaterialButton) this.l0.a).setEnabled(false);
        return;
    L38:
        ((TextView) r9.d).setVisibility(8);
        ((ImageView) this.l0.b).setVisibility(0);
        ((TextView) this.l0.f).setVisibility(0);
        ((MaterialButton) this.l0.e).setVisibility(8);
        ((MaterialButton) this.l0.a).setVisibility(8);
        ((MaterialButton) this.l0.a).setEnabled(false);
        return;
    L31:
        if (r8.trim().isEmpty() == true) goto L33;
    L25:
        if (r7.trim().isEmpty() == true) goto L28;
        ((TextView) this.l0.d).setText(e03.i(this.r0));
        ((TextView) this.l0.d).setVisibility(0);
        ((ImageView) this.l0.b).setVisibility(8);
        ((TextView) this.l0.f).setVisibility(8);
        ((MaterialButton) this.l0.e).setVisibility(8);
        ((MaterialButton) this.l0.a).setVisibility(0);
        ((MaterialButton) this.l0.a).setEnabled(true);
    }
}
