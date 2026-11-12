package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xi3 extends kc1 {
    public boolean l0;
    public String m0;
    public String n0;
    public ns3 o0;
    public aj3 p0;
    public bl2 q0;
    public Handler r0;
    public ur2 s0;

    public xi3() {
        this.l0 = false;
        this.m0 = null;
        this.n0 = null;
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r23, ViewGroup r24, Bundle r25) {
        int r2 = 0;
        View r1 = r23.inflate(R.layout.fragment_player_bottom_sheet, r24, false);
        int r3 = R.id.player_body_layout;
        View r4 = uo.s(r1, R.id.player_body_layout);
        if (r4 == null) goto L51;
        om1 r5 = new om1(16, (ViewPager2) r4);
        View r7 = uo.s(r1, R.id.player_header_layout);
        if (r7 == null) goto L50;
        int r6 = R.id.placeholder_left_view;
        View r10 = uo.s(r7, R.id.placeholder_left_view);
        if (r10 == null) goto L48;
        r6 = R.id.placeholder_right_view;
        View r11 = uo.s(r7, R.id.placeholder_right_view);
        if (r11 == null) goto L48;
        r6 = R.id.player_header_bookmark_media_button;
        ImageButton r12 = (ImageButton) uo.s(r7, R.id.player_header_bookmark_media_button);
        if (r12 == null) goto L48;
        r6 = R.id.player_header_button;
        ToggleButton r13 = (ToggleButton) uo.s(r7, R.id.player_header_button);
        if (r13 == null) goto L48;
        r6 = R.id.player_header_fast_forward_media_button;
        ImageButton r14 = (ImageButton) uo.s(r7, R.id.player_header_fast_forward_media_button);
        if (r14 == null) goto L48;
        r6 = R.id.player_header_media_artist_label;
        TextView r15 = (TextView) uo.s(r7, R.id.player_header_media_artist_label);
        if (r15 == null) goto L48;
        r6 = R.id.player_header_media_cover_image;
        ImageView r16 = (ImageView) uo.s(r7, R.id.player_header_media_cover_image);
        if (r16 == null) goto L48;
        r6 = R.id.player_header_media_title_label;
        TextView r17 = (TextView) uo.s(r7, R.id.player_header_media_title_label);
        if (r17 == null) goto L48;
        r6 = R.id.player_header_next_media_button;
        ImageButton r18 = (ImageButton) uo.s(r7, R.id.player_header_next_media_button);
        if (r18 == null) goto L48;
        r6 = R.id.player_header_remote_button;
        AppCompatImageButton r19 = (AppCompatImageButton) uo.s(r7, R.id.player_header_remote_button);
        if (r19 == null) goto L48;
        r6 = R.id.player_header_rewind_media_button;
        ImageButton r20 = (ImageButton) uo.s(r7, R.id.player_header_rewind_media_button);
        if (r20 == null) goto L48;
        r6 = R.id.player_header_seek_bar;
        SeekBar r21 = (SeekBar) uo.s(r7, R.id.player_header_seek_bar);
        if (r21 == null) goto L48;
        FrameLayout r8 = (FrameLayout) r1;
        int r9 = 4;
        this.o0 = new ns3(r8, r5, new ae1((ConstraintLayout) r7, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21), 4);
        nc1 r22 = X();
        e75 r26 = r22.d();
        b75 r27 = gh0.r(r22);
        bq4 r28 = new bq4(r26, r27, b11.e(r22, r27));
        i30 r29 = kx3.a(aj3.class);
        String r30 = r29.b();
        if (r30 == null) goto L46;
        this.p0 = (aj3) r28.l(r29, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r30));
        ((AppCompatImageButton) ((ae1) this.o0.q).k).setOnClickListener(new ti3(this, r9));
        ((ConstraintLayout) ((ae1) this.o0.q).b).setOnClickListener(new ti3(this, 5));
        int r31 = 1;
        ((ViewPager2) ((om1) this.o0.p).o).setOrientation(1);
        ((ViewPager2) ((om1) this.o0.p).o).setAdapter(new ck3(this));
        int r32 = 2;
        if (ud3.Y() == false) goto L35;
        this.p0.c().f(new np0(r32, this));
        ((ImageButton) ((ae1) this.o0.q).e).setOnLongClickListener(new q6(14, this));
        Handler r33 = new Handler();
        ri3 r34 = new ri3(this, r31);
        App.b().getClass();
        String r35 = App.c().getString("queue_syncing_countdown", "5");
        r35.getClass();
        r33.postDelayed(r34, ((long) Integer.parseInt(r35)) * 1000);
    L35:
        u52.b.e(v(), new si3(this, r2));
        if ((l() instanceof MainActivity) == false) goto L45;
        zg5 r36 = ((MainActivity) l()).V;
        if (r36 == null) goto L45;
        au r37 = (au) r36.n;
        if (r37.a == true) goto L44;
        int r38 = ((BottomSheetBehavior) r37.b).Y;
        if (r38 == 3) goto L44;
        if (r38 != 2) goto L45;
    L44:
        ((ConstraintLayout) ((ae1) this.o0.q).b).setAlpha(0.0f);
        ((ConstraintLayout) ((ae1) this.o0.q).b).setVisibility(8);
    L45:
        return r8;
    L46:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L48:
        nz2.n("Missing required view with ID: ".concat(r7.getResources().getResourceName(r6)));
        return null;
    L50:
        r3 = R.id.player_header_layout;
    L51:
        nz2.n("Missing required view with ID: ".concat(r1.getResources().getResourceName(r3)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        Handler r0 = this.r0;
        if (r0 == null) goto L5;
        r0.removeCallbacks(this.s0);
    L5:
        this.l0 = false;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
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
        this.q0 = r7;
        r7.f(new ri3(this, 0), gq0.n);
        return;
    L6:
        r0 = null;
        goto L7
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.q0);
        this.R = true;
    }

    public final void h0(long r3) {
        if (u52.c().a == true) goto L9;
        ns3 r2 = this.o0;
        if (r2 == null) goto L10;
        ((SeekBar) ((ae1) r2.q).m).setMax((int) (r3 / 1000));
        return;
    L10:
        return;
    }

    public final void i0(boolean r2) {
        if (u52.c().a == true) goto L13;
        ns3 r0 = this.o0;
        if (r0 == null) goto L14;
        ((ImageButton) ((ae1) r0.q).j).setEnabled(r2);
        ImageButton r1 = (ImageButton) ((ae1) this.o0.q).j;
        if (r2 == false) goto L10;
        float r3 = 1.0f;
    L11:
        r1.setAlpha(r3);
        return;
    L10:
        r3 = 0.3f;
        goto L11
    L14:
        return;
    }

    public final void j0(bj2 r4) {
        this.r0 = new Handler();
        this.s0 = new ur2(8, this, r4);
        k0(r4);
        l0(r4.K0());
        h0(r4.x());
        m0(r4.h0());
        ((ToggleButton) ((ae1) this.o0.q).f).setOnClickListener(new ti3(this, 0));
        ((ImageButton) ((ae1) this.o0.q).j).setOnClickListener(new ti3(this, 1));
        ((ImageButton) ((ae1) this.o0.q).l).setOnClickListener(new ti3(this, 2));
        ((ImageButton) ((ae1) this.o0.q).g).setOnClickListener(new ti3(this, 3));
        i0(r4.f0());
        r4.v(new ui3(this, r4));
    }

    public final void k0(bj2 r6) {
        if (u52.c().a == false) goto L5;
        return;
    L5:
        if (this.o0 != null) goto L8;
        return;
    L8:
        if (r6.K0().I == null) goto L22;
        String r7 = r6.K0().I.getString("type", "music");
        int r0 = r7.hashCode();
        if (r0 == (-405568764)) goto L16;
        if (r0 != 104263205) goto L19;
        r7.equals("music");
    L19:
        ((ImageButton) ((ae1) this.o0.q).g).setVisibility(8);
        ((ImageButton) ((ae1) this.o0.q).l).setVisibility(8);
        ((ImageButton) ((ae1) this.o0.q).j).setVisibility(0);
        return;
    L16:
        if (r7.equals("podcast") == false) goto L19;
        ((ImageButton) ((ae1) this.o0.q).g).setVisibility(0);
        ((ImageButton) ((ae1) this.o0.q).l).setVisibility(0);
        ((ImageButton) ((ae1) this.o0.q).j).setVisibility(8);
        return;
    }

    public final void l0(do2 r14) {
        if (u52.c().a == false) goto L5;
        return;
    L5:
        if (this.o0 == null) goto L84;
        Bundle r0 = r14.I;
        Uri r1 = r14.m;
        CharSequence r15 = r14.b;
        if (r0 == null) goto L83;
        this.p0.i(v(), r0.getString("type"), r0.getString("id"));
        aj3 r2 = this.p0;
        le1 r3 = v();
        String r5 = r0.getString("type");
        String r7 = r0.getString("albumId");
        k03 r8 = r2.o;
        String r11 = null;
        if (r5 != null) goto L12;
    L18:
        aj3 r4 = this.p0;
        le1 r6 = v();
        String r9 = r0.getString("type");
        String r10 = r0.getString("artistId");
        k03 r12 = r4.p;
        if (r9 != null) goto L21;
    L27:
        aj3 r13 = this.p0;
        r13.m.i(r0.getString("description", null));
        int r16 = 0;
        if (Objects.equals(r0.getString("type"), WaveOrigin.RADIO) == false) goto L53;
        if (r15 == null) goto L31;
        String r17 = String.valueOf(r15);
    L32:
        String r18 = r0.getString("stationName", r17);
        String r19 = r0.getString("radioArtist", "");
        String r20 = r0.getString("radioTitle", "");
        if (TextUtils.isEmpty(r19) == true) goto L38;
        if (TextUtils.isEmpty(r20) == true) goto L38;
        r19 = b11.o(r19, " - ", r20);
    L44:
        ((TextView) ((ae1) this.o0.q).i).setText(r19);
        ((ae1) this.o0.q).a.setText(r18);
        TextView r21 = (TextView) ((ae1) this.o0.q).i;
        if (TextUtils.isEmpty(r19) == true) goto L47;
        int r22 = 0;
    L48:
        r21.setVisibility(r22);
        TextView r23 = ((ae1) this.o0.q).a;
        if (TextUtils.isEmpty(r18) == false) goto L52;
        r16 = 8;
    L52:
        r23.setVisibility(r16);
    L71:
        if (WaveOrigin.RADIO.equals(r0.getString("type")) == false) goto L74;
        xt3.a(a.c(Z()).r(r1).G(wg0.a(8, Z(), r0.getString("coverArtId"))), r1).K((ImageView) ((ae1) this.o0.q).h);
        return;
    L74:
        Context r110 = Z();
        String r24 = r0.getString("coverArtId");
        c04 r25 = a.c(r110);
        if (r24 == null) goto L77;
        r11 = wg0.b(ud3.t(), r24);
    L77:
        vz3 r111 = b11.g(r110, r24, 9, r25, r11).T(xv0.b());
        if (ud3.R() == false) goto L80;
        r111 = (vz3) r111.l();
    L80:
        r111.K((ImageView) ((ae1) this.o0.q).h);
        return;
    L47:
        r22 = 8;
    L38:
        if (TextUtils.isEmpty(r20) == true) goto L41;
        r19 = r20;
        goto L44
    L41:
        if (TextUtils.isEmpty(r19) == false) goto L44;
        r19 = r18;
        goto L44
    L31:
        r17 = "";
        goto L32
    L53:
        ((TextView) ((ae1) this.o0.q).i).setText(r0.getString("title"));
        TextView r26 = ((ae1) this.o0.q).a;
        if (r15 != null) goto L57;
        r15 = "";
    L57:
        r26.setText(r15);
        fu.p(((ae1) this.o0.q).a, r0.getString("id"));
        TextView r112 = (TextView) ((ae1) this.o0.q).i;
        if (r0.getString("title") != null) goto L60;
    L62:
        int r27 = 8;
    L63:
        r112.setVisibility(r27);
        TextView r113 = ((ae1) this.o0.q).a;
        if (r0.getString("artist") != null) goto L66;
    L68:
        r16 = 8;
    L69:
        r113.setVisibility(r16);
        goto L71
    L66:
        if (Objects.equals(r0.getString("artist"), "") == true) goto L68;
    L60:
        if (Objects.equals(r0.getString("title"), "") == true) goto L62;
        r27 = 0;
        goto L63
    L21:
        if (r9.equals("podcast") == false) goto L23;
        r12.i(null);
        goto L27
    L23:
        if (r9.equals("music") == false) goto L27;
        r4.e.getClass();
        k03 r28 = pa.v(r10);
        Objects.requireNonNull(r12);
        r28.e(r6, new g7(r12, 2));
        goto L27
    L12:
        if (r5.equals("podcast") == false) goto L14;
        r8.i(null);
        goto L18
    L14:
        if (r5.equals("music") == false) goto L18;
        r2.d.getClass();
        k03 r29 = rv2.j(r7);
        Objects.requireNonNull(r8);
        r29.e(r3, new g7(r8, 1));
        goto L18
    L83:
        return;
    }

    public final void m0(boolean r4) {
        if (u52.c().a == true) goto L13;
        ns3 r0 = this.o0;
        if (r0 == null) goto L14;
        ((ToggleButton) ((ae1) r0.q).f).setChecked(r4);
        Handler r1 = this.r0;
        ur2 r3 = this.s0;
        if (r4 == false) goto L11;
        r1.postDelayed(r3, 1000);
        return;
    L11:
        r1.removeCallbacks(r3);
        return;
    L14:
        return;
    }

    public final void n0(bj2 r7) {
        boolean r0 = u52.c().a;
        ns3 r6 = this.o0;
        if (r0 == false) goto L7;
        if (r6 == null) goto L10;
        ((SeekBar) ((ae1) r6.q).m).setProgress((int) (u52.c().b(SystemClock.elapsedRealtime()) / 1000), true);
        return;
    L10:
        return;
    L7:
        if (r6 == null) goto L11;
        ((SeekBar) ((ae1) r6.q).m).setProgress((int) (r7.M0() / 1000), true);
        return;
    }
}
