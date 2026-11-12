package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hk3 extends kc1 {
    public ey l0;
    public aj3 m0;
    public bl2 n0;
    public bj2 o0;
    public final Handler p0;
    public final zd3 q0;
    public List r0;
    public final wd3 s0;
    public final zd3 t0;
    public final zd3 u0;
    public final zd3 v0;
    public int[] w0;
    public final zd3 x0;
    public final zd3 y0;

    public hk3() {
        this.p0 = new Handler(Looper.getMainLooper());
        u01 r0 = u01.n;
        this.q0 = uc5.B(r0);
        this.r0 = r0;
        this.s0 = new wd3(0);
        Boolean r1 = Boolean.FALSE;
        this.t0 = uc5.B(r1);
        this.u0 = uc5.B(null);
        this.v0 = uc5.B(null);
        this.w0 = new int[0];
        this.x0 = uc5.B(r1);
        this.y0 = uc5.B(r1);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r13, ViewGroup r14, Bundle r15) {
        r13.getClass();
        int r0 = 0;
        View r16 = r13.inflate(R.layout.inner_fragment_player_cover, r14, false);
        int r17 = R.id.horizontal_guideline;
        if (((Guideline) uo.s(r16, R.id.horizontal_guideline)) == null) goto L43;
        r17 = R.id.inner_button_bottom_left;
        Button r4 = (Button) uo.s(r16, R.id.inner_button_bottom_left);
        if (r4 == null) goto L43;
        r17 = R.id.inner_button_bottom_right;
        Button r5 = (Button) uo.s(r16, R.id.inner_button_bottom_right);
        if (r5 == null) goto L43;
        r17 = R.id.inner_button_bottom_right_alternative;
        Button r6 = (Button) uo.s(r16, R.id.inner_button_bottom_right_alternative);
        if (r6 == null) goto L43;
        r17 = R.id.inner_button_top_left;
        Button r7 = (Button) uo.s(r16, R.id.inner_button_top_left);
        if (r7 == null) goto L43;
        r17 = R.id.inner_button_top_right;
        Button r8 = (Button) uo.s(r16, R.id.inner_button_top_right);
        if (r8 == null) goto L43;
        r17 = R.id.now_playing_artwork_pager;
        ComposeView r9 = (ComposeView) uo.s(r16, R.id.now_playing_artwork_pager);
        if (r9 == null) goto L43;
        r17 = R.id.now_playing_song_cover_button_group;
        ConstraintLayout r10 = (ConstraintLayout) uo.s(r16, R.id.now_playing_song_cover_button_group);
        if (r10 == null) goto L43;
        r17 = R.id.now_playing_tap_button;
        Button r11 = (Button) uo.s(r16, R.id.now_playing_tap_button);
        if (r11 == null) goto L43;
        r17 = R.id.vertical_guideline;
        if (((Guideline) uo.s(r16, R.id.vertical_guideline)) == null) goto L43;
        ConstraintLayout r3 = (ConstraintLayout) r16;
        this.l0 = new ey(r3, r4, r5, r6, r7, r8, r9, r10, r11);
        nc1 r18 = X();
        e75 r19 = r18.d();
        b75 r110 = gh0.r(r18);
        bq4 r2 = new bq4(r19, r110, b11.e(r18, r110));
        i30 r111 = kx3.a(aj3.class);
        String r112 = r111.b();
        if (r112 == null) goto L41;
        this.m0 = (aj3) r2.l(r111, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r112));
        r9.setViewCompositionStrategy(rv2.K);
        int r12 = 1;
        r9.setContent(new r70(1604145647, true, new z(9, this)));
        ey r113 = this.l0;
        int r114 = 3;
        if (r113 == null) goto L27;
        ((ConstraintLayout) r113.g).setOnClickListener(new fk3(this, 2));
        ((Button) r113.h).setOnClickListener(new fk3(this, r114));
    L27:
        aj3 r115 = this.m0;
        if (r115 == null) goto L39;
        r115.n.e(v(), new ht1(new dk3(this, r114), 1));
        aj3 r116 = this.m0;
        if (r116 == null) goto L37;
        ns3 r117 = r116.f.a;
        ((s24) r117.o).i().a(new String[]{"queue"}, new ks3(r117, r12)).e(v(), new ht1(new dk3(this, 4), 1));
        is3.e.e(v(), new ht1(new dk3(this, 5), 1));
        u52.c.e(v(), new ht1(new dk3(this, 6), 1));
        u52.b.e(v(), new ht1(new dk3(this, 7), 1));
        aj3 r118 = this.m0;
        if (r118 == null) goto L35;
        r118.n.e(v(), new ht1(new dk3(this, r0), 1));
        r3.getClass();
        return r3;
    L35:
        h12.Q("playerBottomSheetViewModel");
        throw null;
    L37:
        h12.Q("playerBottomSheetViewModel");
        throw null;
    L39:
        h12.Q("playerBottomSheetViewModel");
        throw null;
    L41:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L43:
        nz2.n("Missing required view with ID: ".concat(r16.getResources().getResourceName(r17)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.p0.removeCallbacksAndMessages(null);
        this.l0 = null;
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
        fi0 r8 = new fi0(new x7(r2));
        xc5 r0 = new xc5(4, r8);
    L7:
        b11.w(r7, new bj2(r2, r3, r4, r5, r6, r7, r0), new Handler(r6));
        this.n0 = r7;
        r7.f(new ur2(9, r7, this), gq0.n);
        l0(false);
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        bl2 r0 = this.n0;
        if (r0 == null) goto L5;
        sk2.Z0(r0);
    L5:
        this.n0 = null;
        this.o0 = null;
        this.R = true;
    }

    public final List h0() {
        return (List) this.q0.getValue();
    }

    public final void i0(bj2 r49) {
        if (u52.c().a == false) goto L5;
        return;
    L5:
        int[] r2 = is3.d(r49);
        this.w0 = r2;
        ArrayList r3 = new ArrayList(r2.length);
        int r4 = r2.length;
        boolean r5 = false;
        int r6 = 0;
    L6:
        if (r6 >= r4) goto L11;
        int r7 = r2[r6];
        Child r8 = gi1.N(r49.Y(r7));
        if (r8 != null) goto L10;
        String r10 = r49.Y(r7).a;
        r10.getClass();
        r8 = new Child(r10, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
    L10:
        r3.add(r8);
        r6 = r6 + 1;
        goto L6
    L11:
        this.q0.setValue(r3);
        int r9 = ti.l0(r2, r49.o0());
        if (r9 >= 0) goto L14;
        r9 = 0;
    L14:
        k0(r9);
        if (((Boolean) this.t0.getValue()).booleanValue() == true) goto L36;
        gn2 r11 = r49.a();
        if (r11 == null) goto L36;
        if (b.h(r49) == false) goto L25;
        if (is3.e(r49) != 0) goto L36;
    L35:
        r5 = true;
        goto L36
    L25:
        if (a.j(r49) == true) goto L36;
        if (is3.e(r49) != 0) goto L36;
        boolean r12 = xa3.u("continuous_play", true);
        int r1 = r49.h();
        boolean r13 = is3.c(r11);
        if (r12 == false) goto L36;
        if (r13 == false) goto L36;
        if (r1 != 0) goto L36;
        if (is3.d == false) goto L35;
    L36:
        this.x0.setValue(Boolean.valueOf(r5));
    }

    public final void j0() {
        v52 r0 = u52.c();
        this.t0.setValue(Boolean.FALSE);
        if (u52.k() == false) goto L6;
        Object r1 = u52.l();
    L9:
        this.q0.setValue(r1);
        int r2 = 0;
        if (u52.k() == false) goto L15;
        int r3 = r0.o;
        if (r3 < 0) goto L15;
        r2 = r3;
    L15:
        k0(r2);
        return;
    L6:
        if (r0.p <= 0) goto L8;
        r1 = gb.O(u52.d());
        goto L9
    L8:
        r1 = u01.n;
        goto L9
    }

    public final void k0(int r1) {
        this.s0.h(r1);
    }

    public final void l0(boolean r6) {
        ey r0 = this.l0;
        if (r0 == null) goto L29;
        ConstraintLayout r1 = (ConstraintLayout) r0.g;
        Fade r2 = new Fade();
        r2.setDuration(200);
        r2.addTarget(r1);
        TransitionManager.beginDelayedTransition((ConstraintLayout) r0.a, r2);
        int r3 = 8;
        if (r6 == false) goto L8;
        int r4 = 0;
    L9:
        r1.setVisibility(r4);
        Button r5 = (Button) r0.h;
        if (r6 == false) goto L12;
        int r7 = 8;
    L13:
        r5.setVisibility(r7);
        Button r8 = (Button) r0.c;
        if (ud3.Y() == false) goto L16;
        int r9 = 0;
    L17:
        r8.setVisibility(r9);
        Button r10 = (Button) r0.d;
        if (ud3.Y() == true) goto L21;
        r3 = 0;
    L21:
        r10.setVisibility(r3);
        if (r6 == true) goto L27;
        ey r11 = this.l0;
        if (r11 == null) goto L28;
        ((Button) r11.h).setVisibility(0);
        Handler r12 = this.p0;
        r12.removeCallbacksAndMessages(null);
        r12.postDelayed(new qa1(28, this), 10000);
        return;
    L28:
        return;
    L27:
        return;
    L16:
        r9 = 8;
        goto L17
    L12:
        r7 = 0;
        goto L13
    L8:
        r4 = 8;
        goto L9
    }

    public final void m0(do2 r5, int r6) {
        if (u52.c().a == false) goto L5;
        return;
    L5:
        Bundle r0 = r5.I;
        if (r0 != null) goto L8;
    L10:
        boolean r2 = false;
    L11:
        this.t0.setValue(Boolean.valueOf(r2));
        this.u0.setValue(r5.m);
        String r7 = null;
        if (r0 == null) goto L14;
        String r3 = r0.getString("coverArtId");
    L15:
        this.v0.setValue(r3);
        bj2 r4 = this.o0;
        if (r4 != null) goto L18;
    L21:
        bj2 r8 = this.o0;
        if (r8 == null) goto L29;
        gn2 r9 = r8.a();
        if (r9 == null) goto L29;
        String r10 = r9.a;
        if (r10 == null) goto L29;
        r7 = r10;
    L31:
        if (r7 != null) goto L33;
    L45:
        if (r6 >= 0) goto L47;
        r6 = 0;
    L47:
        k0(r6);
        return;
    L33:
        if (h0().isEmpty() == true) goto L45;
        Iterator r1 = h0().iterator();
        int r11 = 0;
    L36:
        if (r1.hasNext() == false) goto L41;
        if (h12.c(((Child) r1.next()).getId(), r7) == true) goto L42;
        r11 = r11 + 1;
    L42:
        if (r11 < 0) goto L45;
        k0(r11);
        return;
    L41:
        r11 = -1;
    L29:
        if (r0 == null) goto L31;
        r7 = r0.getString("id");
        goto L31
    L18:
        if (r4.Q0() <= 0) goto L21;
        i0(r4);
        return;
    L14:
        r3 = null;
        goto L15
    L8:
        if (WaveOrigin.RADIO.equals(r0.getString("type")) == false) goto L10;
        r2 = true;
        goto L11
    }
}
