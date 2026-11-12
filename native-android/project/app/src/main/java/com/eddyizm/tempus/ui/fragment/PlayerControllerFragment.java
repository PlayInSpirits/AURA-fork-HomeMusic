package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import defpackage.a52;
import defpackage.a83;
import defpackage.aj2;
import defpackage.aj3;
import defpackage.b11;
import defpackage.b75;
import defpackage.bj2;
import defpackage.bk3;
import defpackage.bl2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.cg4;
import defpackage.d7;
import defpackage.do2;
import defpackage.e03;
import defpackage.e75;
import defpackage.et1;
import defpackage.f35;
import defpackage.fi0;
import defpackage.ft1;
import defpackage.fu;
import defpackage.g12;
import defpackage.gh0;
import defpackage.gq0;
import defpackage.ht1;
import defpackage.i30;
import defpackage.i61;
import defpackage.i8;
import defpackage.if1;
import defpackage.ik;
import defpackage.iw4;
import defpackage.ix4;
import defpackage.j51;
import defpackage.j8;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.kx4;
import defpackage.l93;
import defpackage.le1;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.ot1;
import defpackage.pu3;
import defpackage.q80;
import defpackage.qa1;
import defpackage.qh3;
import defpackage.rj3;
import defpackage.si0;
import defpackage.sk2;
import defpackage.tb1;
import defpackage.tj3;
import defpackage.u52;
import defpackage.ud3;
import defpackage.uo;
import defpackage.v00;
import defpackage.v52;
import defpackage.vw1;
import defpackage.wj3;
import defpackage.x7;
import defpackage.xa3;
import defpackage.xc5;
import defpackage.y11;
import defpackage.yf4;
import defpackage.yj3;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlayerControllerFragment extends kc1 {
    public ImageButton A0;
    public ImageButton B0;
    public ImageButton C0;
    public LinearLayout D0;
    public ImageButton E0;
    public TextView F0;
    public ChipGroup G0;
    public Chip H0;
    public Chip I0;
    public Chip J0;
    public MainActivity K0;
    public aj3 L0;
    public bl2 M0;
    public boolean N0 = false;
    public final y11 O0 = new y11(1, this);
    public i61 l0;
    public a52 m0;
    public boolean n0;
    public ViewPager2 o0;
    public ToggleButton p0;
    public ImageButton q0;
    public pu3 r0;
    public RatingBar s0;
    public TextView t0;
    public TextView u0;
    public Button v0;
    public ToggleButton w0;
    public Chip x0;
    public TextView y0;
    public ConstraintLayout z0;

    public static void j0(Chip chip) {
        if (chip == null) {
            return;
        }
        chip.setVisibility(8);
        chip.setText("");
        chip.setOnClickListener(null);
        chip.setOnLongClickListener(null);
    }

    public static qh3 l0(float f) {
        float f2 = 1.0f;
        if (xa3.u("playback_speed_pitch", false)) {
            if (xa3.u("playback_speed_manual_pitch", false)) {
                App.b().getClass();
                f2 = App.c().getFloat("playback_speed_manual_pitch_value", 1.0f);
            } else {
                f2 = f;
            }
        }
        return new qh3(f, f2);
    }

    public static void s0(TextView textView, String str) {
        if (TextUtils.equals(textView.getText(), str)) {
            return;
        }
        textView.setText(str);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.K0 = (MainActivity) e();
        final int i2 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.inner_fragment_player_controller, viewGroup, false);
        int i3 = R.id.now_playing_media_controller_view;
        PlayerControlView playerControlView = (PlayerControlView) uo.s(viewInflate, R.id.now_playing_media_controller_view);
        if (playerControlView != null) {
            i3 = R.id.player_remote_toggle;
            MaterialButton materialButton = (MaterialButton) uo.s(viewInflate, R.id.player_remote_toggle);
            if (materialButton != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.l0 = new i61(linearLayout, playerControlView, materialButton, false, 6);
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
                this.L0 = (aj3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                nc1 nc1VarX2 = X();
                e75 e75VarD2 = nc1VarX2.d();
                b75 b75VarR2 = gh0.r(nc1VarX2);
                bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                i30 i30VarA2 = kx3.a(pu3.class);
                String strB2 = i30VarA2.b();
                if (strB2 == null) {
                    kf2.n("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                this.r0 = (pu3) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                this.o0 = (ViewPager2) ((LinearLayout) this.l0.o).findViewById(R.id.player_media_cover_view_pager);
                ToggleButton toggleButton = (ToggleButton) ((LinearLayout) this.l0.o).findViewById(R.id.button_favorite);
                this.p0 = toggleButton;
                ot1.f(toggleButton, new wj3(this, i2));
                this.q0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_overflow_button);
                this.t0 = (TextView) ((LinearLayout) this.l0.o).findViewById(R.id.player_media_title_label);
                this.u0 = (TextView) ((LinearLayout) this.l0.o).findViewById(R.id.player_artist_name_label);
                this.v0 = (Button) ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button);
                this.w0 = (ToggleButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_skip_silence_toggle_button);
                this.x0 = (Chip) ((LinearLayout) this.l0.o).findViewById(R.id.player_media_extension);
                this.y0 = (TextView) ((LinearLayout) this.l0.o).findViewById(R.id.player_media_bitrate);
                this.z0 = (ConstraintLayout) ((LinearLayout) this.l0.o).findViewById(R.id.player_quick_action_view);
                this.A0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_open_queue_button);
                this.B0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_open_lyrics_button);
                this.C0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_info_track);
                this.s0 = (RatingBar) ((LinearLayout) this.l0.o).findViewById(R.id.song_rating_bar);
                this.D0 = (LinearLayout) ((LinearLayout) this.l0.o).findViewById(R.id.rating_container);
                this.G0 = (ChipGroup) ((LinearLayout) this.l0.o).findViewById(R.id.asset_link_chip_group);
                this.H0 = (Chip) ((LinearLayout) this.l0.o).findViewById(R.id.asset_link_song_chip);
                this.I0 = (Chip) ((LinearLayout) this.l0.o).findViewById(R.id.asset_link_album_chip);
                this.J0 = (Chip) ((LinearLayout) this.l0.o).findViewById(R.id.asset_link_artist_chip);
                this.E0 = (ImageButton) ((LinearLayout) this.l0.o).findViewById(R.id.player_sleep_timer_button);
                this.F0 = (TextView) ((LinearLayout) this.l0.o).findViewById(R.id.player_sleep_timer_label);
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) ((LinearLayout) this.l0.o).findViewById(R.id.exo_progress);
                defaultTimeBar.getClass();
                int iT = g12.t(defaultTimeBar, R.attr.colorOnPrimaryContainer);
                int iT2 = g12.t(defaultTimeBar, R.attr.colorPrimaryContainer);
                defaultTimeBar.setBufferedColor(j51.k(iT2, iT, 0) | j51.k(iT2, iT, 16) | (-16777216) | j51.k(iT2, iT, 8));
                le1 le1VarV = v();
                LinearLayout linearLayout2 = (LinearLayout) this.l0.o;
                k03 k03Var = this.L0.n;
                d7 d7Var = new d7(5, this);
                wj3 wj3Var = new wj3(this, 1);
                TextView textView = this.u0;
                linearLayout2.getClass();
                k03Var.getClass();
                View viewFindViewById = linearLayout2.findViewById(R.id.player_smart_rec_row);
                TextView textView2 = (TextView) linearLayout2.findViewById(R.id.player_smart_rec_label);
                ImageButton imageButton = (ImageButton) linearLayout2.findViewById(R.id.player_smart_rec_add);
                ImageButton imageButton2 = (ImageButton) linearLayout2.findViewById(R.id.player_smart_rec_hide);
                ImageButton imageButton3 = (ImageButton) linearLayout2.findViewById(R.id.exo_shuffle);
                if (imageButton3 != null) {
                    imageButton3.setOnClickListener(new j8(13, linearLayout2, wj3Var));
                }
                if (imageButton != null) {
                    imageButton.setOnClickListener(new et1(k03Var, d7Var, linearLayout2, i2));
                }
                if (imageButton2 != null) {
                    imageButton2.setOnClickListener(new j8(14, k03Var, linearLayout2));
                }
                final ft1 ft1Var = new ft1(k03Var, linearLayout2, viewFindViewById, textView2, imageButton, textView, wj3Var);
                k03Var.e(le1VarV, new ht1(new if1() { // from class: gt1
                    @Override // defpackage.if1
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        j15 j15Var = j15.a;
                        ft1 ft1Var2 = ft1Var;
                        switch (i4) {
                            case 0:
                                ft1Var2.run();
                                break;
                            default:
                                ft1Var2.run();
                                break;
                        }
                        return j15Var;
                    }
                }, 0));
                final int i4 = 1;
                a.f.e(le1VarV, new ht1(new if1() { // from class: gt1
                    @Override // defpackage.if1
                    public final Object invoke(Object obj) {
                        int i5 = i4;
                        j15 j15Var = j15.a;
                        ft1 ft1Var2 = ft1Var;
                        switch (i5) {
                            case 0:
                                ft1Var2.run();
                                break;
                            default:
                                ft1Var2.run();
                                break;
                        }
                        return j15Var;
                    }
                }, 0));
                if (this.D0 == null) {
                    i = 8;
                } else {
                    boolean zU = xa3.u("song_rating_per_item", false);
                    LinearLayout linearLayout3 = this.D0;
                    if (zU) {
                        linearLayout3.setVisibility(0);
                        i = 8;
                    } else {
                        i = 8;
                        linearLayout3.setVisibility(8);
                    }
                }
                this.m0 = new a52(Looper.getMainLooper());
                final int i5 = 3;
                u52.b.e(v(), new a83(this) { // from class: uj3
                    public final /* synthetic */ PlayerControllerFragment b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
                    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
                    @Override // defpackage.a83
                    public final void b(Object obj) {
                        int i6;
                        int i7 = i5;
                        int i8 = 5;
                        PlayerControllerFragment playerControllerFragment = this.b;
                        switch (i7) {
                            case 0:
                                AlbumID3 albumID3 = (AlbumID3) obj;
                                if (albumID3 != null) {
                                    playerControllerFragment.t0.setOnClickListener(new j8(18, playerControllerFragment, albumID3));
                                    TextView textView3 = playerControllerFragment.t0;
                                    if (textView3 != null) {
                                        textView3.setOnLongClickListener(new i8(i8, playerControllerFragment, textView3));
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                Child child = (Child) obj;
                                if (child != null) {
                                    if (!u52.c().a || Objects.equals(child.getId(), u52.c().x)) {
                                        playerControllerFragment.p0.setEnabled(true);
                                        pu3 pu3Var = playerControllerFragment.r0;
                                        pu3Var.f = child;
                                        ImageButton imageButton4 = null;
                                        pu3Var.g = null;
                                        pu3Var.h = null;
                                        int i9 = 0;
                                        playerControllerFragment.p0.setChecked(n61.f(1, child.getId(), child.getStarred() != null));
                                        playerControllerFragment.p0.setOnClickListener(new j8(17, playerControllerFragment, child));
                                        LinearLayout linearLayout4 = (LinearLayout) playerControllerFragment.l0.o;
                                        ExecutorService executorService = ur1.a;
                                        linearLayout4.getClass();
                                        View viewFindViewById2 = linearLayout4.findViewById(R.id.homemusic_player_dislike);
                                        if (viewFindViewById2 != null) {
                                            if (ur1.b(child)) {
                                                i6 = 0;
                                            } else {
                                                i6 = 8;
                                            }
                                            viewFindViewById2.setVisibility(i6);
                                            viewFindViewById2.setOnClickListener(new tr1(child, i9));
                                        } else {
                                            View viewFindViewById3 = linearLayout4.findViewById(R.id.button_favorite);
                                            if (viewFindViewById3 != null) {
                                                ViewParent parent = viewFindViewById3.getParent();
                                                ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
                                                if (constraintLayout != null) {
                                                    Context context = linearLayout4.getContext();
                                                    ImageButton imageButton5 = new ImageButton(context);
                                                    imageButton5.setId(R.id.homemusic_player_dislike);
                                                    imageButton5.setContentDescription(context.getString(R.string.homemusic_dislike));
                                                    imageButton5.setImageResource(R.drawable.ic_homemusic_dislike);
                                                    imageButton5.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                                    TypedValue typedValue = new TypedValue();
                                                    context.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                                                    imageButton5.setBackgroundResource(typedValue.resourceId);
                                                    imageButton5.setPadding(0, 0, 0, 0);
                                                    int i10 = viewFindViewById3.getLayoutParams().width;
                                                    int i11 = (int) (16.0f * context.getResources().getDisplayMetrics().density);
                                                    mb0 mb0Var = new mb0(i10, viewFindViewById3.getLayoutParams().height);
                                                    mb0Var.i = viewFindViewById3.getId();
                                                    mb0Var.l = viewFindViewById3.getId();
                                                    mb0Var.u = viewFindViewById3.getId();
                                                    mb0Var.setMarginEnd(i11);
                                                    int childCount = constraintLayout.getChildCount();
                                                    for (int i12 = 0; i12 < childCount; i12++) {
                                                        View childAt = constraintLayout.getChildAt(i12);
                                                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                                        mb0 mb0Var2 = layoutParams instanceof mb0 ? (mb0) layoutParams : null;
                                                        if (mb0Var2 != null && mb0Var2.u == viewFindViewById3.getId()) {
                                                            mb0Var2.u = imageButton5.getId();
                                                            childAt.setLayoutParams(mb0Var2);
                                                        }
                                                    }
                                                    constraintLayout.addView(imageButton5, mb0Var);
                                                    imageButton4 = imageButton5;
                                                }
                                            }
                                            if (imageButton4 != null) {
                                                viewFindViewById2 = imageButton4;
                                                if (ur1.b(child)) {
                                                    i6 = 0;
                                                } else {
                                                    i6 = 8;
                                                }
                                                viewFindViewById2.setVisibility(i6);
                                                viewFindViewById2.setOnClickListener(new tr1(child, i9));
                                            }
                                        }
                                        playerControllerFragment.p0.setOnLongClickListener(new i8(4, playerControllerFragment, child));
                                        Integer userRating = child.getUserRating();
                                        RatingBar ratingBar = playerControllerFragment.s0;
                                        if (userRating != null) {
                                            ratingBar.setRating(userRating.intValue());
                                        } else {
                                            ratingBar.setRating(0.0f);
                                        }
                                        playerControllerFragment.s0.setOnRatingBarChangeListener(new ak3(playerControllerFragment, child));
                                        if (playerControllerFragment.e() != null) {
                                            playerControllerFragment.L0.f(playerControllerFragment.X(), child);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ArtistID3 artistID3 = (ArtistID3) obj;
                                if (artistID3 != null) {
                                    playerControllerFragment.u0.setOnClickListener(new j8(16, playerControllerFragment, artistID3));
                                    TextView textView4 = playerControllerFragment.u0;
                                    if (textView4 != null) {
                                        textView4.setOnLongClickListener(new i8(i8, playerControllerFragment, textView4));
                                        break;
                                    }
                                }
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                playerControllerFragment.m0();
                                break;
                            default:
                                playerControllerFragment.m0();
                                break;
                        }
                    }
                });
                final int i6 = 4;
                u52.c.e(v(), new a83(this) { // from class: uj3
                    public final /* synthetic */ PlayerControllerFragment b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
                    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
                    @Override // defpackage.a83
                    public final void b(Object obj) {
                        int i7;
                        int i8 = i6;
                        int i9 = 5;
                        PlayerControllerFragment playerControllerFragment = this.b;
                        switch (i8) {
                            case 0:
                                AlbumID3 albumID3 = (AlbumID3) obj;
                                if (albumID3 != null) {
                                    playerControllerFragment.t0.setOnClickListener(new j8(18, playerControllerFragment, albumID3));
                                    TextView textView3 = playerControllerFragment.t0;
                                    if (textView3 != null) {
                                        textView3.setOnLongClickListener(new i8(i9, playerControllerFragment, textView3));
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                Child child = (Child) obj;
                                if (child != null) {
                                    if (!u52.c().a || Objects.equals(child.getId(), u52.c().x)) {
                                        playerControllerFragment.p0.setEnabled(true);
                                        pu3 pu3Var = playerControllerFragment.r0;
                                        pu3Var.f = child;
                                        ImageButton imageButton4 = null;
                                        pu3Var.g = null;
                                        pu3Var.h = null;
                                        int i10 = 0;
                                        playerControllerFragment.p0.setChecked(n61.f(1, child.getId(), child.getStarred() != null));
                                        playerControllerFragment.p0.setOnClickListener(new j8(17, playerControllerFragment, child));
                                        LinearLayout linearLayout4 = (LinearLayout) playerControllerFragment.l0.o;
                                        ExecutorService executorService = ur1.a;
                                        linearLayout4.getClass();
                                        View viewFindViewById2 = linearLayout4.findViewById(R.id.homemusic_player_dislike);
                                        if (viewFindViewById2 != null) {
                                            if (ur1.b(child)) {
                                                i7 = 0;
                                            } else {
                                                i7 = 8;
                                            }
                                            viewFindViewById2.setVisibility(i7);
                                            viewFindViewById2.setOnClickListener(new tr1(child, i10));
                                        } else {
                                            View viewFindViewById3 = linearLayout4.findViewById(R.id.button_favorite);
                                            if (viewFindViewById3 != null) {
                                                ViewParent parent = viewFindViewById3.getParent();
                                                ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
                                                if (constraintLayout != null) {
                                                    Context context = linearLayout4.getContext();
                                                    ImageButton imageButton5 = new ImageButton(context);
                                                    imageButton5.setId(R.id.homemusic_player_dislike);
                                                    imageButton5.setContentDescription(context.getString(R.string.homemusic_dislike));
                                                    imageButton5.setImageResource(R.drawable.ic_homemusic_dislike);
                                                    imageButton5.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                                    TypedValue typedValue = new TypedValue();
                                                    context.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                                                    imageButton5.setBackgroundResource(typedValue.resourceId);
                                                    imageButton5.setPadding(0, 0, 0, 0);
                                                    int i11 = viewFindViewById3.getLayoutParams().width;
                                                    int i12 = (int) (16.0f * context.getResources().getDisplayMetrics().density);
                                                    mb0 mb0Var = new mb0(i11, viewFindViewById3.getLayoutParams().height);
                                                    mb0Var.i = viewFindViewById3.getId();
                                                    mb0Var.l = viewFindViewById3.getId();
                                                    mb0Var.u = viewFindViewById3.getId();
                                                    mb0Var.setMarginEnd(i12);
                                                    int childCount = constraintLayout.getChildCount();
                                                    for (int i13 = 0; i13 < childCount; i13++) {
                                                        View childAt = constraintLayout.getChildAt(i13);
                                                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                                        mb0 mb0Var2 = layoutParams instanceof mb0 ? (mb0) layoutParams : null;
                                                        if (mb0Var2 != null && mb0Var2.u == viewFindViewById3.getId()) {
                                                            mb0Var2.u = imageButton5.getId();
                                                            childAt.setLayoutParams(mb0Var2);
                                                        }
                                                    }
                                                    constraintLayout.addView(imageButton5, mb0Var);
                                                    imageButton4 = imageButton5;
                                                }
                                            }
                                            if (imageButton4 != null) {
                                                viewFindViewById2 = imageButton4;
                                                if (ur1.b(child)) {
                                                    i7 = 0;
                                                } else {
                                                    i7 = 8;
                                                }
                                                viewFindViewById2.setVisibility(i7);
                                                viewFindViewById2.setOnClickListener(new tr1(child, i10));
                                            }
                                        }
                                        playerControllerFragment.p0.setOnLongClickListener(new i8(4, playerControllerFragment, child));
                                        Integer userRating = child.getUserRating();
                                        RatingBar ratingBar = playerControllerFragment.s0;
                                        if (userRating != null) {
                                            ratingBar.setRating(userRating.intValue());
                                        } else {
                                            ratingBar.setRating(0.0f);
                                        }
                                        playerControllerFragment.s0.setOnRatingBarChangeListener(new ak3(playerControllerFragment, child));
                                        if (playerControllerFragment.e() != null) {
                                            playerControllerFragment.L0.f(playerControllerFragment.X(), child);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ArtistID3 artistID3 = (ArtistID3) obj;
                                if (artistID3 != null) {
                                    playerControllerFragment.u0.setOnClickListener(new j8(16, playerControllerFragment, artistID3));
                                    TextView textView4 = playerControllerFragment.u0;
                                    if (textView4 != null) {
                                        textView4.setOnLongClickListener(new i8(i9, playerControllerFragment, textView4));
                                        break;
                                    }
                                }
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                playerControllerFragment.m0();
                                break;
                            default:
                                playerControllerFragment.m0();
                                break;
                        }
                    }
                });
                ((MaterialButton) this.l0.q).setOnClickListener(new rj3(this, 5));
                ImageButton imageButton4 = this.q0;
                if (imageButton4 != null) {
                    imageButton4.setOnClickListener(new rj3(this, i6));
                }
                ConstraintLayout constraintLayout = this.z0;
                if (xa3.u("quick_action_visible", true)) {
                    i = 0;
                }
                constraintLayout.setVisibility(i);
                final int i7 = 2;
                this.A0.setOnClickListener(new rj3(this, i7));
                this.B0.setOnClickListener(new rj3(this, i5));
                this.o0.setOrientation(0);
                this.o0.setAdapter(new bk3(m(), this.c0));
                this.o0.setUserInputEnabled(false);
                ((ArrayList) this.o0.p.b).add(new q80(i5, this));
                final int i8 = 1;
                this.L0.n.e(v(), new a83(this) { // from class: uj3
                    public final /* synthetic */ PlayerControllerFragment b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
                    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
                    @Override // defpackage.a83
                    public final void b(Object obj) {
                        int i9;
                        int i10 = i8;
                        int i11 = 5;
                        PlayerControllerFragment playerControllerFragment = this.b;
                        switch (i10) {
                            case 0:
                                AlbumID3 albumID3 = (AlbumID3) obj;
                                if (albumID3 != null) {
                                    playerControllerFragment.t0.setOnClickListener(new j8(18, playerControllerFragment, albumID3));
                                    TextView textView3 = playerControllerFragment.t0;
                                    if (textView3 != null) {
                                        textView3.setOnLongClickListener(new i8(i11, playerControllerFragment, textView3));
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                Child child = (Child) obj;
                                if (child != null) {
                                    if (!u52.c().a || Objects.equals(child.getId(), u52.c().x)) {
                                        playerControllerFragment.p0.setEnabled(true);
                                        pu3 pu3Var = playerControllerFragment.r0;
                                        pu3Var.f = child;
                                        ImageButton imageButton5 = null;
                                        pu3Var.g = null;
                                        pu3Var.h = null;
                                        int i12 = 0;
                                        playerControllerFragment.p0.setChecked(n61.f(1, child.getId(), child.getStarred() != null));
                                        playerControllerFragment.p0.setOnClickListener(new j8(17, playerControllerFragment, child));
                                        LinearLayout linearLayout4 = (LinearLayout) playerControllerFragment.l0.o;
                                        ExecutorService executorService = ur1.a;
                                        linearLayout4.getClass();
                                        View viewFindViewById2 = linearLayout4.findViewById(R.id.homemusic_player_dislike);
                                        if (viewFindViewById2 != null) {
                                            if (ur1.b(child)) {
                                                i9 = 0;
                                            } else {
                                                i9 = 8;
                                            }
                                            viewFindViewById2.setVisibility(i9);
                                            viewFindViewById2.setOnClickListener(new tr1(child, i12));
                                        } else {
                                            View viewFindViewById3 = linearLayout4.findViewById(R.id.button_favorite);
                                            if (viewFindViewById3 != null) {
                                                ViewParent parent = viewFindViewById3.getParent();
                                                ConstraintLayout constraintLayout2 = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
                                                if (constraintLayout2 != null) {
                                                    Context context = linearLayout4.getContext();
                                                    ImageButton imageButton6 = new ImageButton(context);
                                                    imageButton6.setId(R.id.homemusic_player_dislike);
                                                    imageButton6.setContentDescription(context.getString(R.string.homemusic_dislike));
                                                    imageButton6.setImageResource(R.drawable.ic_homemusic_dislike);
                                                    imageButton6.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                                    TypedValue typedValue = new TypedValue();
                                                    context.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                                                    imageButton6.setBackgroundResource(typedValue.resourceId);
                                                    imageButton6.setPadding(0, 0, 0, 0);
                                                    int i13 = viewFindViewById3.getLayoutParams().width;
                                                    int i14 = (int) (16.0f * context.getResources().getDisplayMetrics().density);
                                                    mb0 mb0Var = new mb0(i13, viewFindViewById3.getLayoutParams().height);
                                                    mb0Var.i = viewFindViewById3.getId();
                                                    mb0Var.l = viewFindViewById3.getId();
                                                    mb0Var.u = viewFindViewById3.getId();
                                                    mb0Var.setMarginEnd(i14);
                                                    int childCount = constraintLayout2.getChildCount();
                                                    for (int i15 = 0; i15 < childCount; i15++) {
                                                        View childAt = constraintLayout2.getChildAt(i15);
                                                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                                        mb0 mb0Var2 = layoutParams instanceof mb0 ? (mb0) layoutParams : null;
                                                        if (mb0Var2 != null && mb0Var2.u == viewFindViewById3.getId()) {
                                                            mb0Var2.u = imageButton6.getId();
                                                            childAt.setLayoutParams(mb0Var2);
                                                        }
                                                    }
                                                    constraintLayout2.addView(imageButton6, mb0Var);
                                                    imageButton5 = imageButton6;
                                                }
                                            }
                                            if (imageButton5 != null) {
                                                viewFindViewById2 = imageButton5;
                                                if (ur1.b(child)) {
                                                    i9 = 0;
                                                } else {
                                                    i9 = 8;
                                                }
                                                viewFindViewById2.setVisibility(i9);
                                                viewFindViewById2.setOnClickListener(new tr1(child, i12));
                                            }
                                        }
                                        playerControllerFragment.p0.setOnLongClickListener(new i8(4, playerControllerFragment, child));
                                        Integer userRating = child.getUserRating();
                                        RatingBar ratingBar = playerControllerFragment.s0;
                                        if (userRating != null) {
                                            ratingBar.setRating(userRating.intValue());
                                        } else {
                                            ratingBar.setRating(0.0f);
                                        }
                                        playerControllerFragment.s0.setOnRatingBarChangeListener(new ak3(playerControllerFragment, child));
                                        if (playerControllerFragment.e() != null) {
                                            playerControllerFragment.L0.f(playerControllerFragment.X(), child);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ArtistID3 artistID3 = (ArtistID3) obj;
                                if (artistID3 != null) {
                                    playerControllerFragment.u0.setOnClickListener(new j8(16, playerControllerFragment, artistID3));
                                    TextView textView4 = playerControllerFragment.u0;
                                    if (textView4 != null) {
                                        textView4.setOnLongClickListener(new i8(i11, playerControllerFragment, textView4));
                                        break;
                                    }
                                }
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                playerControllerFragment.m0();
                                break;
                            default:
                                playerControllerFragment.m0();
                                break;
                        }
                    }
                });
                this.L0.o.e(v(), new a83(this) { // from class: uj3
                    public final /* synthetic */ PlayerControllerFragment b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
                    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
                    @Override // defpackage.a83
                    public final void b(Object obj) {
                        int i9;
                        int i10 = i2;
                        int i11 = 5;
                        PlayerControllerFragment playerControllerFragment = this.b;
                        switch (i10) {
                            case 0:
                                AlbumID3 albumID3 = (AlbumID3) obj;
                                if (albumID3 != null) {
                                    playerControllerFragment.t0.setOnClickListener(new j8(18, playerControllerFragment, albumID3));
                                    TextView textView3 = playerControllerFragment.t0;
                                    if (textView3 != null) {
                                        textView3.setOnLongClickListener(new i8(i11, playerControllerFragment, textView3));
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                Child child = (Child) obj;
                                if (child != null) {
                                    if (!u52.c().a || Objects.equals(child.getId(), u52.c().x)) {
                                        playerControllerFragment.p0.setEnabled(true);
                                        pu3 pu3Var = playerControllerFragment.r0;
                                        pu3Var.f = child;
                                        ImageButton imageButton5 = null;
                                        pu3Var.g = null;
                                        pu3Var.h = null;
                                        int i12 = 0;
                                        playerControllerFragment.p0.setChecked(n61.f(1, child.getId(), child.getStarred() != null));
                                        playerControllerFragment.p0.setOnClickListener(new j8(17, playerControllerFragment, child));
                                        LinearLayout linearLayout4 = (LinearLayout) playerControllerFragment.l0.o;
                                        ExecutorService executorService = ur1.a;
                                        linearLayout4.getClass();
                                        View viewFindViewById2 = linearLayout4.findViewById(R.id.homemusic_player_dislike);
                                        if (viewFindViewById2 != null) {
                                            if (ur1.b(child)) {
                                                i9 = 0;
                                            } else {
                                                i9 = 8;
                                            }
                                            viewFindViewById2.setVisibility(i9);
                                            viewFindViewById2.setOnClickListener(new tr1(child, i12));
                                        } else {
                                            View viewFindViewById3 = linearLayout4.findViewById(R.id.button_favorite);
                                            if (viewFindViewById3 != null) {
                                                ViewParent parent = viewFindViewById3.getParent();
                                                ConstraintLayout constraintLayout2 = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
                                                if (constraintLayout2 != null) {
                                                    Context context = linearLayout4.getContext();
                                                    ImageButton imageButton6 = new ImageButton(context);
                                                    imageButton6.setId(R.id.homemusic_player_dislike);
                                                    imageButton6.setContentDescription(context.getString(R.string.homemusic_dislike));
                                                    imageButton6.setImageResource(R.drawable.ic_homemusic_dislike);
                                                    imageButton6.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                                    TypedValue typedValue = new TypedValue();
                                                    context.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                                                    imageButton6.setBackgroundResource(typedValue.resourceId);
                                                    imageButton6.setPadding(0, 0, 0, 0);
                                                    int i13 = viewFindViewById3.getLayoutParams().width;
                                                    int i14 = (int) (16.0f * context.getResources().getDisplayMetrics().density);
                                                    mb0 mb0Var = new mb0(i13, viewFindViewById3.getLayoutParams().height);
                                                    mb0Var.i = viewFindViewById3.getId();
                                                    mb0Var.l = viewFindViewById3.getId();
                                                    mb0Var.u = viewFindViewById3.getId();
                                                    mb0Var.setMarginEnd(i14);
                                                    int childCount = constraintLayout2.getChildCount();
                                                    for (int i15 = 0; i15 < childCount; i15++) {
                                                        View childAt = constraintLayout2.getChildAt(i15);
                                                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                                        mb0 mb0Var2 = layoutParams instanceof mb0 ? (mb0) layoutParams : null;
                                                        if (mb0Var2 != null && mb0Var2.u == viewFindViewById3.getId()) {
                                                            mb0Var2.u = imageButton6.getId();
                                                            childAt.setLayoutParams(mb0Var2);
                                                        }
                                                    }
                                                    constraintLayout2.addView(imageButton6, mb0Var);
                                                    imageButton5 = imageButton6;
                                                }
                                            }
                                            if (imageButton5 != null) {
                                                viewFindViewById2 = imageButton5;
                                                if (ur1.b(child)) {
                                                    i9 = 0;
                                                } else {
                                                    i9 = 8;
                                                }
                                                viewFindViewById2.setVisibility(i9);
                                                viewFindViewById2.setOnClickListener(new tr1(child, i12));
                                            }
                                        }
                                        playerControllerFragment.p0.setOnLongClickListener(new i8(4, playerControllerFragment, child));
                                        Integer userRating = child.getUserRating();
                                        RatingBar ratingBar = playerControllerFragment.s0;
                                        if (userRating != null) {
                                            ratingBar.setRating(userRating.intValue());
                                        } else {
                                            ratingBar.setRating(0.0f);
                                        }
                                        playerControllerFragment.s0.setOnRatingBarChangeListener(new ak3(playerControllerFragment, child));
                                        if (playerControllerFragment.e() != null) {
                                            playerControllerFragment.L0.f(playerControllerFragment.X(), child);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ArtistID3 artistID3 = (ArtistID3) obj;
                                if (artistID3 != null) {
                                    playerControllerFragment.u0.setOnClickListener(new j8(16, playerControllerFragment, artistID3));
                                    TextView textView4 = playerControllerFragment.u0;
                                    if (textView4 != null) {
                                        textView4.setOnLongClickListener(new i8(i11, playerControllerFragment, textView4));
                                        break;
                                    }
                                }
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                playerControllerFragment.m0();
                                break;
                            default:
                                playerControllerFragment.m0();
                                break;
                        }
                    }
                });
                this.L0.p.e(v(), new a83(this) { // from class: uj3
                    public final /* synthetic */ PlayerControllerFragment b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
                    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
                    @Override // defpackage.a83
                    public final void b(Object obj) {
                        int i9;
                        int i10 = i7;
                        int i11 = 5;
                        PlayerControllerFragment playerControllerFragment = this.b;
                        switch (i10) {
                            case 0:
                                AlbumID3 albumID3 = (AlbumID3) obj;
                                if (albumID3 != null) {
                                    playerControllerFragment.t0.setOnClickListener(new j8(18, playerControllerFragment, albumID3));
                                    TextView textView3 = playerControllerFragment.t0;
                                    if (textView3 != null) {
                                        textView3.setOnLongClickListener(new i8(i11, playerControllerFragment, textView3));
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                Child child = (Child) obj;
                                if (child != null) {
                                    if (!u52.c().a || Objects.equals(child.getId(), u52.c().x)) {
                                        playerControllerFragment.p0.setEnabled(true);
                                        pu3 pu3Var = playerControllerFragment.r0;
                                        pu3Var.f = child;
                                        ImageButton imageButton5 = null;
                                        pu3Var.g = null;
                                        pu3Var.h = null;
                                        int i12 = 0;
                                        playerControllerFragment.p0.setChecked(n61.f(1, child.getId(), child.getStarred() != null));
                                        playerControllerFragment.p0.setOnClickListener(new j8(17, playerControllerFragment, child));
                                        LinearLayout linearLayout4 = (LinearLayout) playerControllerFragment.l0.o;
                                        ExecutorService executorService = ur1.a;
                                        linearLayout4.getClass();
                                        View viewFindViewById2 = linearLayout4.findViewById(R.id.homemusic_player_dislike);
                                        if (viewFindViewById2 != null) {
                                            if (ur1.b(child)) {
                                                i9 = 0;
                                            } else {
                                                i9 = 8;
                                            }
                                            viewFindViewById2.setVisibility(i9);
                                            viewFindViewById2.setOnClickListener(new tr1(child, i12));
                                        } else {
                                            View viewFindViewById3 = linearLayout4.findViewById(R.id.button_favorite);
                                            if (viewFindViewById3 != null) {
                                                ViewParent parent = viewFindViewById3.getParent();
                                                ConstraintLayout constraintLayout2 = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
                                                if (constraintLayout2 != null) {
                                                    Context context = linearLayout4.getContext();
                                                    ImageButton imageButton6 = new ImageButton(context);
                                                    imageButton6.setId(R.id.homemusic_player_dislike);
                                                    imageButton6.setContentDescription(context.getString(R.string.homemusic_dislike));
                                                    imageButton6.setImageResource(R.drawable.ic_homemusic_dislike);
                                                    imageButton6.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                                    TypedValue typedValue = new TypedValue();
                                                    context.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                                                    imageButton6.setBackgroundResource(typedValue.resourceId);
                                                    imageButton6.setPadding(0, 0, 0, 0);
                                                    int i13 = viewFindViewById3.getLayoutParams().width;
                                                    int i14 = (int) (16.0f * context.getResources().getDisplayMetrics().density);
                                                    mb0 mb0Var = new mb0(i13, viewFindViewById3.getLayoutParams().height);
                                                    mb0Var.i = viewFindViewById3.getId();
                                                    mb0Var.l = viewFindViewById3.getId();
                                                    mb0Var.u = viewFindViewById3.getId();
                                                    mb0Var.setMarginEnd(i14);
                                                    int childCount = constraintLayout2.getChildCount();
                                                    for (int i15 = 0; i15 < childCount; i15++) {
                                                        View childAt = constraintLayout2.getChildAt(i15);
                                                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                                        mb0 mb0Var2 = layoutParams instanceof mb0 ? (mb0) layoutParams : null;
                                                        if (mb0Var2 != null && mb0Var2.u == viewFindViewById3.getId()) {
                                                            mb0Var2.u = imageButton6.getId();
                                                            childAt.setLayoutParams(mb0Var2);
                                                        }
                                                    }
                                                    constraintLayout2.addView(imageButton6, mb0Var);
                                                    imageButton5 = imageButton6;
                                                }
                                            }
                                            if (imageButton5 != null) {
                                                viewFindViewById2 = imageButton5;
                                                if (ur1.b(child)) {
                                                    i9 = 0;
                                                } else {
                                                    i9 = 8;
                                                }
                                                viewFindViewById2.setVisibility(i9);
                                                viewFindViewById2.setOnClickListener(new tr1(child, i12));
                                            }
                                        }
                                        playerControllerFragment.p0.setOnLongClickListener(new i8(4, playerControllerFragment, child));
                                        Integer userRating = child.getUserRating();
                                        RatingBar ratingBar = playerControllerFragment.s0;
                                        if (userRating != null) {
                                            ratingBar.setRating(userRating.intValue());
                                        } else {
                                            ratingBar.setRating(0.0f);
                                        }
                                        playerControllerFragment.s0.setOnRatingBarChangeListener(new ak3(playerControllerFragment, child));
                                        if (playerControllerFragment.e() != null) {
                                            playerControllerFragment.L0.f(playerControllerFragment.X(), child);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ArtistID3 artistID3 = (ArtistID3) obj;
                                if (artistID3 != null) {
                                    playerControllerFragment.u0.setOnClickListener(new j8(16, playerControllerFragment, artistID3));
                                    TextView textView4 = playerControllerFragment.u0;
                                    if (textView4 != null) {
                                        textView4.setOnLongClickListener(new i8(i11, playerControllerFragment, textView4));
                                        break;
                                    }
                                }
                                break;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                playerControllerFragment.m0();
                                break;
                            default:
                                playerControllerFragment.m0();
                                break;
                        }
                    }
                });
                x0();
                return linearLayout;
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        i61 i61Var = this.l0;
        if (i61Var != null) {
            ((PlayerControlView) i61Var.p).setPlayer(null);
        }
        a52 a52Var = this.m0;
        if (a52Var != null) {
            a52Var.A1();
        }
        this.m0 = null;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void O() {
        this.R = true;
        if (this.N0) {
            X().unbindService(this.O0);
            this.N0 = false;
        }
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        Intent intent = new Intent(X(), (Class<?>) MediaService.class);
        intent.setAction("com.eddyizm.tempus.service.BIND_EQUALIZER");
        X().bindService(intent, this.O0, 1);
        this.N0 = true;
    }

    @Override // defpackage.kc1
    public final void R() {
        xc5 xc5Var;
        this.R = true;
        Context contextZ = Z();
        cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        if (cb4Var.a.e()) {
            xc5Var = new xc5(4, new fi0(new x7(contextZ)));
        } else {
            xc5Var = null;
        }
        b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, xc5Var), new Handler(looperX));
        this.M0 = bl2Var;
        bl2Var.f(new qa1(27, this), gq0.n);
    }

    @Override // defpackage.kc1
    public final void S() {
        yf4.c().h = null;
        sk2.Z0(this.M0);
        this.R = true;
    }

    public final ik h0(Chip chip, String str, String str2) {
        int i;
        if (chip == null) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            j0(chip);
            return null;
        }
        int i2 = 1;
        switch (str) {
            case "artist":
                i = R.string.asset_link_label_artist;
                break;
            case "song":
                i = R.string.asset_link_label_song;
                break;
            case "year":
                i = R.string.asset_link_label_year;
                break;
            case "album":
                i = R.string.asset_link_label_album;
                break;
            case "genre":
                i = R.string.asset_link_label_genre;
                break;
            case "playlist":
                i = R.string.asset_link_label_playlist;
                break;
            default:
                i = R.string.asset_link_label_unknown;
                break;
        }
        String strS = s(i);
        ik ikVarH = l93.h(str, str2);
        if (ikVarH == null) {
            j0(chip);
            return null;
        }
        chip.setText(t(R.string.asset_link_chip_text, strS, ikVarH.d));
        chip.setVisibility(0);
        chip.setOnClickListener(new tj3(this, ikVarH, i2));
        chip.setOnLongClickListener(new yj3(this, ikVarH, str2, 0));
        return ikVarH;
    }

    public final void i0(View view, ik ikVar) {
        if (view == null) {
            return;
        }
        int i = 0;
        if (ikVar == null) {
            l93.p(view);
            view.setOnClickListener(null);
            view.setOnLongClickListener(null);
            view.setClickable(false);
            view.setLongClickable(false);
            return;
        }
        view.setClickable(true);
        view.setLongClickable(true);
        l93.g(view);
        view.setOnClickListener(new tj3(this, ikVar, i));
        view.setOnLongClickListener(new i8(3, this, ikVar));
    }

    public final bj2 k0() {
        bl2 bl2Var = this.M0;
        if (bl2Var != null && bl2Var.isDone()) {
            try {
                return (bj2) this.M0.get();
            } catch (Exception e) {
                Log.e("PlayerCoverFragment", "Unable to resolve media browser", e);
            }
        }
        return null;
    }

    public final void m0() {
        if (this.l0 == null || this.m0 == null) {
            return;
        }
        if (!u52.c().a) {
            ((MaterialButton) this.l0.q).setText(R.string.lan_play_on);
            ((MaterialButton) this.l0.q).setContentDescription(s(R.string.lan_play_on));
            ((MaterialButton) this.l0.q).setSelected(false);
            this.p0.setEnabled(true);
            bj2 bj2VarK0 = k0();
            if (bj2VarK0 != null) {
                ((PlayerControlView) this.l0.p).setPlayer(bj2VarK0);
                n0(bj2VarK0);
                q0(bj2VarK0.K0());
                p0(bj2VarK0.K0());
                return;
            }
            return;
        }
        a52 a52Var = this.m0;
        a52Var.F1();
        if (a52Var.f.isEmpty() && !a52Var.i) {
            a52Var.D1(a52Var.i1(), false, false);
        }
        ((PlayerControlView) this.l0.p).setPlayer(this.m0);
        v52 v52VarC = u52.c();
        String str = v52VarC.c;
        ((MaterialButton) this.l0.q).setText(t(R.string.lan_operating_on, str));
        ((MaterialButton) this.l0.q).setContentDescription(t(R.string.lan_controlling, str));
        ((MaterialButton) this.l0.q).setSelected(true);
        ((PlayerControlView) this.l0.p).setShowShuffleButton(true);
        ((PlayerControlView) this.l0.p).setRepeatToggleModes(3);
        ((PlayerControlView) this.l0.p).setShowRewindButton(false);
        ((PlayerControlView) this.l0.p).setShowFastForwardButton(false);
        ((PlayerControlView) this.l0.p).setShowPreviousButton(true);
        ((PlayerControlView) this.l0.p).setShowNextButton(true);
        this.v0.setVisibility(0);
        this.w0.setVisibility(8);
        this.p0.setVisibility(0);
        Child child = (Child) this.L0.n.d();
        this.p0.setEnabled(child != null && Objects.equals(child.getId(), v52VarC.x));
        this.n0 = true;
        try {
            do2 do2VarE = si0.E(u52.d());
            q0(do2VarE);
            p0(do2VarE);
            this.v0.setText(t(R.string.player_playback_speed, Float.valueOf(v52VarC.y)));
            x0();
        } finally {
            this.n0 = false;
        }
    }

    public final void n0(bj2 bj2Var) {
        if (this.l0 == null || u52.c().a) {
            return;
        }
        this.v0.setOnClickListener(new rj3(this, 6));
        this.w0.setOnClickListener(new rj3(this, 7));
        if (bj2Var.K0().I != null) {
            String string = bj2Var.K0().I.getString("type", "music");
            int iHashCode = string.hashCode();
            if (iHashCode != -405568764) {
                if (iHashCode == 104263205) {
                    string.equals("music");
                } else if (iHashCode == 108270587 && string.equals(WaveOrigin.RADIO)) {
                    ((PlayerControlView) this.l0.p).setShowShuffleButton(false);
                    ((PlayerControlView) this.l0.p).setShowRewindButton(false);
                    ((PlayerControlView) this.l0.p).setShowPreviousButton(false);
                    ((PlayerControlView) this.l0.p).setShowNextButton(false);
                    ((PlayerControlView) this.l0.p).setShowFastForwardButton(false);
                    ((PlayerControlView) this.l0.p).setRepeatToggleModes(0);
                    ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button).setVisibility(8);
                    ((LinearLayout) this.l0.o).findViewById(R.id.player_skip_silence_toggle_button).setVisibility(8);
                    ((LinearLayout) this.l0.o).findViewById(R.id.button_favorite).setVisibility(8);
                    r0(bj2Var);
                    return;
                }
            } else if (string.equals("podcast")) {
                ((PlayerControlView) this.l0.p).setShowShuffleButton(false);
                ((PlayerControlView) this.l0.p).setShowRewindButton(true);
                ((PlayerControlView) this.l0.p).setShowPreviousButton(false);
                ((PlayerControlView) this.l0.p).setShowNextButton(false);
                ((PlayerControlView) this.l0.p).setShowFastForwardButton(true);
                ((PlayerControlView) this.l0.p).setRepeatToggleModes(0);
                ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button).setVisibility(0);
                ((LinearLayout) this.l0.o).findViewById(R.id.player_skip_silence_toggle_button).setVisibility(0);
                ((LinearLayout) this.l0.o).findViewById(R.id.button_favorite).setVisibility(8);
                r0(bj2Var);
                return;
            }
            ((PlayerControlView) this.l0.p).setShowShuffleButton(true);
            ((PlayerControlView) this.l0.p).setShowRewindButton(false);
            ((PlayerControlView) this.l0.p).setShowPreviousButton(true);
            ((PlayerControlView) this.l0.p).setShowNextButton(true);
            ((PlayerControlView) this.l0.p).setShowFastForwardButton(false);
            ((PlayerControlView) this.l0.p).setRepeatToggleModes(3);
            ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button).setVisibility(0);
            ((LinearLayout) this.l0.o).findViewById(R.id.player_skip_silence_toggle_button).setVisibility(8);
            ((LinearLayout) this.l0.o).findViewById(R.id.button_favorite).setVisibility(0);
            r0(bj2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7 A[PHI: r13
  0x00d7: PHI (r13v21 java.lang.String) = (r13v10 java.lang.String), (r13v11 java.lang.String) binds: [B:62:0x00d5, B:65:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0118 A[PHI: r14
  0x0118: PHI (r14v1 java.lang.String) = 
  (r14v0 java.lang.String)
  (r14v0 java.lang.String)
  (r14v4 java.lang.String)
  (r14v4 java.lang.String)
  (r14v4 java.lang.String)
 binds: [B:54:0x00be, B:56:0x00c4, B:68:0x00ea, B:70:0x00f2, B:72:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    public final void o0() {
        tb1 tb1VarA;
        String lowerCase;
        if (u52.c().a || this.x0 == null) {
            return;
        }
        bj2 bj2VarK0 = k0();
        if (e03.m(bj2VarK0)) {
            return;
        }
        String string = null;
        boolean z = true;
        if (bj2VarK0 == null) {
            tb1VarA = null;
        } else {
            vw1 vw1VarListIterator = bj2VarK0.e0().a.listIterator(0);
            tb1VarA = null;
            loop0: while (vw1VarListIterator.hasNext()) {
                iw4 iw4Var = (iw4) vw1VarListIterator.next();
                if (iw4Var.b.c == 1) {
                    for (int i = 0; i < iw4Var.a; i++) {
                        if (iw4Var.e[i]) {
                            tb1VarA = iw4Var.a(i);
                            break loop0;
                        } else {
                            if (tb1VarA == null) {
                                tb1VarA = iw4Var.a(i);
                            }
                        }
                    }
                }
            }
        }
        if (tb1VarA == null) {
            return;
        }
        String str = tb1VarA.n;
        int i2 = tb1VarA.j;
        boolean zEquals = "upnp".equals(tb1VarA.a);
        if (zEquals && "audio/x-unknown".equals(str)) {
            return;
        }
        if (str == null) {
            lowerCase = null;
        } else {
            lowerCase = str.toLowerCase();
            if (lowerCase.contains("flac")) {
                lowerCase = "flac";
            } else if (lowerCase.contains("opus")) {
                lowerCase = "opus";
            } else if (lowerCase.contains("vorbis")) {
                lowerCase = "vorbis";
            } else if (lowerCase.contains("mp4a") || lowerCase.contains("aac")) {
                lowerCase = "aac";
            } else {
                String str2 = "mp3";
                if (lowerCase.contains("mpeg") || lowerCase.contains("mp3")) {
                    lowerCase = str2;
                } else if (lowerCase.contains("alac")) {
                    lowerCase = "alac";
                } else {
                    String str3 = "eac3";
                    if (lowerCase.contains("eac3")) {
                        lowerCase = str3;
                    } else {
                        str3 = "ac3";
                        if (lowerCase.contains("ac3")) {
                            lowerCase = str3;
                        } else {
                            str2 = "wav";
                            if (lowerCase.contains("pcm") || lowerCase.contains("raw") || lowerCase.contains("wav")) {
                                lowerCase = str2;
                            } else if (lowerCase.contains("ogg")) {
                                lowerCase = "ogg";
                            } else {
                                int iIndexOf = lowerCase.indexOf(47);
                                if (iIndexOf >= 0 && iIndexOf < lowerCase.length() - 1) {
                                    lowerCase = lowerCase.substring(iIndexOf + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (zEquals) {
            string = e03.p(bj2VarK0.K0().I);
        } else if (bj2VarK0 != null && bj2VarK0.K0().I != null) {
            string = bj2VarK0.K0().I.getString("suffix", null);
        }
        if (lowerCase != null && !lowerCase.isEmpty() && string != null && !string.isEmpty() && !lowerCase.equalsIgnoreCase(string)) {
            String lowerCase2 = string.toLowerCase();
            lowerCase2.getClass();
            switch (lowerCase2) {
                case "m4a":
                case "m4b":
                case "mp4":
                    if (lowerCase.equals("aac") || lowerCase.equals("alac")) {
                        z = false;
                        break;
                    }
                    break;
                case "oga":
                case "ogg":
                    if (lowerCase.equals("vorbis") || lowerCase.equals("opus") || lowerCase.equals("flac")) {
                        z = false;
                        break;
                    }
                    break;
            }
        } else {
            z = false;
        }
        if (lowerCase != null && !lowerCase.isEmpty()) {
            Chip chip = this.x0;
            if (z) {
                StringBuilder sbS = b11.s(lowerCase, " (");
                sbS.append(s(R.string.player_transcoding));
                sbS.append(")");
                lowerCase = sbS.toString();
            }
            chip.setText(lowerCase);
        }
        if (Objects.equals(bj2VarK0.K0().I.getString("type"), WaveOrigin.RADIO)) {
            this.y0.setText((i2 / 1000) + "kbps");
            this.y0.setVisibility(ud3.l() ? 0 : 8);
            return;
        }
        if (i2 != -1 && i2 > 0) {
            if (z) {
                this.y0.setText((i2 / 1000) + "kbps");
                this.y0.setVisibility(ud3.l() ? 0 : 8);
                return;
            }
            return;
        }
        if (z) {
            int iD = e03.d();
            String strB = e03.b(iD, e03.q(iD));
            boolean zEquals2 = strB.equals("0");
            TextView textView = this.y0;
            if (zEquals2) {
                textView.setVisibility(8);
            } else {
                textView.setText(strB.concat("kbps"));
                this.y0.setVisibility(ud3.l() ? 0 : 8);
            }
        }
    }

    public final void p0(do2 do2Var) {
        String str;
        String str2;
        if (this.l0 != null) {
            if (!u52.c().a || this.n0) {
                final int i = 1;
                final int i2 = 0;
                boolean z = !u52.c().a && e03.m(k0());
                Bundle bundle = do2Var.I;
                if (bundle != null) {
                    String string = bundle.getString("suffix", s(R.string.player_unknown_format));
                    int i3 = bundle.getInt("bitrate", 0);
                    if (i3 != 0) {
                        str = i3 + "kbps";
                    } else {
                        str = "Original";
                    }
                    String str3 = "";
                    if (bundle.getInt("samplingRate", 0) != 0) {
                        str2 = new DecimalFormat("0.#").format(((double) bundle.getInt("samplingRate", 0)) / 1000.0d) + "kHz";
                    } else {
                        str2 = "";
                    }
                    if (bundle.getInt("bitDepth", 0) != 0) {
                        str3 = bundle.getInt("bitDepth", 0) + "b";
                    }
                    this.x0.setText(string);
                    if (!str.equals("Original") || z) {
                        ArrayList arrayList = new ArrayList();
                        if (!str.trim().isEmpty()) {
                            arrayList.add(str);
                        }
                        if (!str3.trim().isEmpty()) {
                            arrayList.add(str3);
                        }
                        if (!str2.trim().isEmpty()) {
                            arrayList.add(str2);
                        }
                        String strJoin = TextUtils.join(" • ", arrayList);
                        this.y0.setVisibility(ud3.l() ? 0 : 8);
                        this.y0.setText(strJoin);
                    } else {
                        this.y0.setVisibility(8);
                    }
                }
                if (!z) {
                    o0();
                }
                this.C0.setOnClickListener(new j8(19, this, do2Var));
                this.x0.setOnClickListener(new rj3(this, i2));
                this.x0.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: sj3
                    public final /* synthetic */ PlayerControllerFragment o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        int i4 = i2;
                        PlayerControllerFragment playerControllerFragment = this.o;
                        switch (i4) {
                            case 0:
                                playerControllerFragment.v0();
                                break;
                            default:
                                playerControllerFragment.v0();
                                break;
                        }
                        return true;
                    }
                });
                this.y0.setOnClickListener(new rj3(this, i));
                this.y0.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: sj3
                    public final /* synthetic */ PlayerControllerFragment o;

                    {
                        this.o = this;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        int i4 = i;
                        PlayerControllerFragment playerControllerFragment = this.o;
                        switch (i4) {
                            case 0:
                                playerControllerFragment.v0();
                                break;
                            default:
                                playerControllerFragment.v0();
                                break;
                        }
                        return true;
                    }
                });
            }
        }
    }

    public final void q0(do2 do2Var) {
        String strValueOf;
        String strValueOf2;
        if (this.l0 != null) {
            if (!u52.c().a || this.n0) {
                Bundle bundle = do2Var.I;
                Integer num = do2Var.n;
                CharSequence charSequence = do2Var.a;
                CharSequence charSequence2 = do2Var.b;
                int i = 8;
                if (Objects.equals(bundle != null ? bundle.getString("type") : null, WaveOrigin.RADIO)) {
                    if (bundle != null) {
                        strValueOf2 = bundle.getString("stationName", charSequence2 != null ? String.valueOf(charSequence2) : "");
                    } else {
                        strValueOf2 = charSequence2 != null ? String.valueOf(charSequence2) : "";
                    }
                    String string = bundle != null ? bundle.getString("radioArtist", "") : "";
                    String string2 = bundle != null ? bundle.getString("radioTitle", "") : "";
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        string = b11.o(string, " - ", string2);
                    } else if (!TextUtils.isEmpty(string2)) {
                        string = string2;
                    } else if (TextUtils.isEmpty(string)) {
                        string = strValueOf2;
                    }
                    s0(this.t0, string);
                    s0(this.u0, strValueOf2);
                    this.t0.setSelected(true);
                    this.u0.setSelected(true);
                    this.t0.setVisibility(!TextUtils.isEmpty(string) ? 0 : 8);
                    this.u0.setVisibility(TextUtils.isEmpty(strValueOf2) ? 8 : 0);
                    w0(do2Var);
                    return;
                }
                TextView textView = this.t0;
                if (!xa3.u("track_number_visible", false) || num == null || String.valueOf(num).isEmpty()) {
                    strValueOf = String.valueOf(charSequence);
                } else {
                    strValueOf = String.format("%02d", num) + ". " + String.valueOf(charSequence);
                }
                s0(textView, strValueOf);
                s0(this.u0, charSequence2 != null ? String.valueOf(charSequence2) : "");
                this.t0.setSelected(true);
                this.u0.setSelected(true);
                fu.p(this.u0, bundle != null ? bundle.getString("id") : null);
                this.t0.setVisibility((charSequence == null || charSequence.equals("")) ? 8 : 0);
                TextView textView2 = this.u0;
                if ((charSequence2 != null && !charSequence2.equals("")) || (bundle != null && Objects.equals(bundle.getString("type"), WaveOrigin.RADIO) && bundle.getString("uri") != null)) {
                    i = 0;
                }
                textView2.setVisibility(i);
                w0(do2Var);
            }
        }
    }

    public final void r0(bj2 bj2Var) {
        Button button = (Button) ((LinearLayout) this.l0.o).findViewById(R.id.player_playback_speed_button);
        App.b().getClass();
        float f = App.c().getFloat("playback_speed", 1.0f);
        boolean zU = xa3.u("skip_silence", false);
        bj2Var.d(l0(f));
        button.setText(t(R.string.player_playback_speed, Float.valueOf(f)));
        this.w0.setChecked(zU);
    }

    public final void t0() {
        boolean z;
        if (this.G0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.G0.getChildCount()) {
                z = false;
                break;
            } else {
                if (this.G0.getChildAt(i).getVisibility() == 0) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.G0.setVisibility(z ? 0 : 8);
    }

    public final void u0() {
        ViewGroup viewGroup = (ViewGroup) this.y0.getParent();
        kx4 kx4Var = new kx4();
        kx4Var.F(new cg4(8388611));
        kx4Var.F(new v00());
        kx4Var.x(500L);
        kx4Var.z(new AccelerateDecelerateInterpolator());
        ix4.a(viewGroup, kx4Var);
        this.y0.setVisibility(ud3.l() ? 8 : 0);
        xa3.t("bitrate_visible", !ud3.l());
    }

    public final void v0() {
        ViewGroup viewGroup = (ViewGroup) this.z0.getParent();
        kx4 kx4Var = new kx4();
        kx4Var.F(new cg4(80));
        kx4Var.F(new v00());
        kx4Var.x(500L);
        kx4Var.z(new AccelerateDecelerateInterpolator());
        ix4.a(viewGroup, kx4Var);
        this.z0.setVisibility(xa3.u("quick_action_visible", true) ? 8 : 0);
        App.b().getClass();
        xa3.t("quick_action_visible", !App.c().getBoolean("quick_action_visible", true));
    }

    public final void w0(do2 do2Var) {
        if (this.G0 == null) {
            return;
        }
        Bundle bundle = do2Var.I;
        if (!"music".equals(bundle != null ? bundle.getString("type", "music") : "music")) {
            j0(this.H0);
            j0(this.I0);
            j0(this.J0);
            t0();
            return;
        }
        String string = bundle != null ? bundle.getString("id") : null;
        String string2 = bundle != null ? bundle.getString("albumId") : null;
        String string3 = bundle != null ? bundle.getString("artistId") : null;
        ik ikVarH0 = h0(this.H0, "song", string);
        h0(this.I0, "album", string2);
        ik ikVarH1 = h0(this.J0, "artist", string3);
        i0(this.t0, ikVarH0);
        TextView textView = this.u0;
        if (ikVarH1 == null) {
            ikVarH1 = ikVarH0;
        }
        i0(textView, ikVarH1);
        i0(this.o0, ikVarH0);
        t0();
    }

    public final void x0() {
        String strD;
        if (this.E0 == null || this.F0 == null) {
            return;
        }
        boolean z = u52.c().a;
        v52 v52VarC = u52.c();
        if (!(z ? v52VarC.A : yf4.c().f)) {
            this.F0.setVisibility(8);
            this.F0.setText("");
            this.E0.setImageTintList(ColorStateList.valueOf(g12.t(this.E0, R.attr.colorOnSurface)));
        } else {
            if (z ? v52VarC.B : yf4.c().g) {
                strD = s(R.string.sleep_timer_end_of_track_label);
            } else {
                strD = z ? v52VarC.C : yf4.c().d();
            }
            this.F0.setText(strD);
            this.F0.setVisibility(0);
            this.E0.setImageTintList(ColorStateList.valueOf(g12.t(this.E0, R.attr.colorPrimary)));
        }
    }
}
