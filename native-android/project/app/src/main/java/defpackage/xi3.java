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
    public boolean l0 = false;
    public String m0 = null;
    public String n0 = null;
    public ns3 o0;
    public aj3 p0;
    public bl2 q0;
    public Handler r0;
    public ur2 s0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zg5 zg5Var;
        int i;
        int i2 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_player_bottom_sheet, viewGroup, false);
        int i3 = R.id.player_body_layout;
        View viewS = uo.s(viewInflate, R.id.player_body_layout);
        if (viewS != null) {
            om1 om1Var = new om1(16, (ViewPager2) viewS);
            View viewS2 = uo.s(viewInflate, R.id.player_header_layout);
            if (viewS2 != null) {
                int i4 = R.id.placeholder_left_view;
                View viewS3 = uo.s(viewS2, R.id.placeholder_left_view);
                if (viewS3 != null) {
                    i4 = R.id.placeholder_right_view;
                    View viewS4 = uo.s(viewS2, R.id.placeholder_right_view);
                    if (viewS4 != null) {
                        i4 = R.id.player_header_bookmark_media_button;
                        ImageButton imageButton = (ImageButton) uo.s(viewS2, R.id.player_header_bookmark_media_button);
                        if (imageButton != null) {
                            i4 = R.id.player_header_button;
                            ToggleButton toggleButton = (ToggleButton) uo.s(viewS2, R.id.player_header_button);
                            if (toggleButton != null) {
                                i4 = R.id.player_header_fast_forward_media_button;
                                ImageButton imageButton2 = (ImageButton) uo.s(viewS2, R.id.player_header_fast_forward_media_button);
                                if (imageButton2 != null) {
                                    i4 = R.id.player_header_media_artist_label;
                                    TextView textView = (TextView) uo.s(viewS2, R.id.player_header_media_artist_label);
                                    if (textView != null) {
                                        i4 = R.id.player_header_media_cover_image;
                                        ImageView imageView = (ImageView) uo.s(viewS2, R.id.player_header_media_cover_image);
                                        if (imageView != null) {
                                            i4 = R.id.player_header_media_title_label;
                                            TextView textView2 = (TextView) uo.s(viewS2, R.id.player_header_media_title_label);
                                            if (textView2 != null) {
                                                i4 = R.id.player_header_next_media_button;
                                                ImageButton imageButton3 = (ImageButton) uo.s(viewS2, R.id.player_header_next_media_button);
                                                if (imageButton3 != null) {
                                                    i4 = R.id.player_header_remote_button;
                                                    AppCompatImageButton appCompatImageButton = (AppCompatImageButton) uo.s(viewS2, R.id.player_header_remote_button);
                                                    if (appCompatImageButton != null) {
                                                        i4 = R.id.player_header_rewind_media_button;
                                                        ImageButton imageButton4 = (ImageButton) uo.s(viewS2, R.id.player_header_rewind_media_button);
                                                        if (imageButton4 != null) {
                                                            i4 = R.id.player_header_seek_bar;
                                                            SeekBar seekBar = (SeekBar) uo.s(viewS2, R.id.player_header_seek_bar);
                                                            if (seekBar != null) {
                                                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                int i5 = 4;
                                                                this.o0 = new ns3(frameLayout, om1Var, new ae1((ConstraintLayout) viewS2, viewS3, viewS4, imageButton, toggleButton, imageButton2, textView, imageView, textView2, imageButton3, appCompatImageButton, imageButton4, seekBar), 4);
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
                                                                this.p0 = (aj3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                                                ((AppCompatImageButton) ((ae1) this.o0.q).k).setOnClickListener(new ti3(this, i5));
                                                                ((ConstraintLayout) ((ae1) this.o0.q).b).setOnClickListener(new ti3(this, 5));
                                                                int i6 = 1;
                                                                ((ViewPager2) ((om1) this.o0.p).o).setOrientation(1);
                                                                ((ViewPager2) ((om1) this.o0.p).o).setAdapter(new ck3(this));
                                                                int i7 = 2;
                                                                if (ud3.Y()) {
                                                                    this.p0.c().f(new np0(i7, this));
                                                                    ((ImageButton) ((ae1) this.o0.q).e).setOnLongClickListener(new q6(14, this));
                                                                    Handler handler = new Handler();
                                                                    ri3 ri3Var = new ri3(this, i6);
                                                                    App.b().getClass();
                                                                    String string = App.c().getString("queue_syncing_countdown", "5");
                                                                    string.getClass();
                                                                    handler.postDelayed(ri3Var, ((long) Integer.parseInt(string)) * 1000);
                                                                }
                                                                u52.b.e(v(), new si3(this, i2));
                                                                if ((e() instanceof MainActivity) && (zg5Var = ((MainActivity) e()).V) != null) {
                                                                    au auVar = (au) zg5Var.n;
                                                                    if (auVar.a || (i = ((BottomSheetBehavior) auVar.b).Y) == 3 || i == 2) {
                                                                        ((ConstraintLayout) ((ae1) this.o0.q).b).setAlpha(0.0f);
                                                                        ((ConstraintLayout) ((ae1) this.o0.q).b).setVisibility(8);
                                                                    }
                                                                }
                                                                return frameLayout;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewS2.getResources().getResourceName(i4)));
                return null;
            }
            i3 = R.id.player_header_layout;
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        Handler handler = this.r0;
        if (handler != null) {
            handler.removeCallbacks(this.s0);
        }
        this.l0 = false;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
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
        this.q0 = bl2Var;
        bl2Var.f(new ri3(this, 0), gq0.n);
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.q0);
        this.R = true;
    }

    public final void h0(long j) {
        ns3 ns3Var;
        if (u52.c().a || (ns3Var = this.o0) == null) {
            return;
        }
        ((SeekBar) ((ae1) ns3Var.q).m).setMax((int) (j / 1000));
    }

    public final void i0(boolean z) {
        ns3 ns3Var;
        if (u52.c().a || (ns3Var = this.o0) == null) {
            return;
        }
        ((ImageButton) ((ae1) ns3Var.q).j).setEnabled(z);
        ((ImageButton) ((ae1) this.o0.q).j).setAlpha(z ? 1.0f : 0.3f);
    }

    public final void j0(bj2 bj2Var) {
        this.r0 = new Handler();
        this.s0 = new ur2(8, this, bj2Var);
        k0(bj2Var);
        l0(bj2Var.K0());
        h0(bj2Var.x());
        m0(bj2Var.h0());
        ((ToggleButton) ((ae1) this.o0.q).f).setOnClickListener(new ti3(this, 0));
        ((ImageButton) ((ae1) this.o0.q).j).setOnClickListener(new ti3(this, 1));
        ((ImageButton) ((ae1) this.o0.q).l).setOnClickListener(new ti3(this, 2));
        ((ImageButton) ((ae1) this.o0.q).g).setOnClickListener(new ti3(this, 3));
        i0(bj2Var.f0());
        bj2Var.v(new ui3(this, bj2Var));
    }

    public final void k0(bj2 bj2Var) {
        if (u52.c().a || this.o0 == null || bj2Var.K0().I == null) {
            return;
        }
        String string = bj2Var.K0().I.getString("type", "music");
        int iHashCode = string.hashCode();
        if (iHashCode != -405568764) {
            if (iHashCode == 104263205) {
                string.equals("music");
            }
        } else if (string.equals("podcast")) {
            ((ImageButton) ((ae1) this.o0.q).g).setVisibility(0);
            ((ImageButton) ((ae1) this.o0.q).l).setVisibility(0);
            ((ImageButton) ((ae1) this.o0.q).j).setVisibility(8);
            return;
        }
        ((ImageButton) ((ae1) this.o0.q).g).setVisibility(8);
        ((ImageButton) ((ae1) this.o0.q).l).setVisibility(8);
        ((ImageButton) ((ae1) this.o0.q).j).setVisibility(0);
    }

    public final void l0(do2 do2Var) {
        if (u52.c().a || this.o0 == null) {
            return;
        }
        Bundle bundle = do2Var.I;
        Uri uri = do2Var.m;
        CharSequence charSequence = do2Var.b;
        if (bundle != null) {
            this.p0.i(v(), bundle.getString("type"), bundle.getString("id"));
            aj3 aj3Var = this.p0;
            le1 le1VarV = v();
            String string = bundle.getString("type");
            String string2 = bundle.getString("albumId");
            k03 k03Var = aj3Var.o;
            if (string != null) {
                if (string.equals("podcast")) {
                    k03Var.i(null);
                } else if (string.equals("music")) {
                    aj3Var.d.getClass();
                    k03 k03VarJ = rv2.j(string2);
                    Objects.requireNonNull(k03Var);
                    k03VarJ.e(le1VarV, new g7(k03Var, 1));
                }
            }
            aj3 aj3Var2 = this.p0;
            le1 le1VarV2 = v();
            String string3 = bundle.getString("type");
            String string4 = bundle.getString("artistId");
            k03 k03Var2 = aj3Var2.p;
            if (string3 != null) {
                if (string3.equals("podcast")) {
                    k03Var2.i(null);
                } else if (string3.equals("music")) {
                    aj3Var2.e.getClass();
                    k03 k03VarV = pa.v(string4);
                    Objects.requireNonNull(k03Var2);
                    k03VarV.e(le1VarV2, new g7(k03Var2, 2));
                }
            }
            this.p0.m.i(bundle.getString("description", null));
            if (Objects.equals(bundle.getString("type"), WaveOrigin.RADIO)) {
                String string5 = bundle.getString("stationName", charSequence != null ? String.valueOf(charSequence) : "");
                String string6 = bundle.getString("radioArtist", "");
                String string7 = bundle.getString("radioTitle", "");
                if (!TextUtils.isEmpty(string6) && !TextUtils.isEmpty(string7)) {
                    string6 = b11.o(string6, " - ", string7);
                } else if (!TextUtils.isEmpty(string7)) {
                    string6 = string7;
                } else if (TextUtils.isEmpty(string6)) {
                    string6 = string5;
                }
                ((TextView) ((ae1) this.o0.q).i).setText(string6);
                ((ae1) this.o0.q).a.setText(string5);
                ((TextView) ((ae1) this.o0.q).i).setVisibility(!TextUtils.isEmpty(string6) ? 0 : 8);
                ((ae1) this.o0.q).a.setVisibility(TextUtils.isEmpty(string5) ? 8 : 0);
            } else {
                ((TextView) ((ae1) this.o0.q).i).setText(bundle.getString("title"));
                TextView textView = ((ae1) this.o0.q).a;
                if (charSequence == null) {
                    charSequence = "";
                }
                textView.setText(charSequence);
                fu.p(((ae1) this.o0.q).a, bundle.getString("id"));
                ((TextView) ((ae1) this.o0.q).i).setVisibility((bundle.getString("title") == null || Objects.equals(bundle.getString("title"), "")) ? 8 : 0);
                ((ae1) this.o0.q).a.setVisibility((bundle.getString("artist") == null || Objects.equals(bundle.getString("artist"), "")) ? 8 : 0);
            }
            if (WaveOrigin.RADIO.equals(bundle.getString("type"))) {
                xt3.a(a.c(Z()).r(uri).a(wg0.a(8, Z(), bundle.getString("coverArtId"))), uri).K((ImageView) ((ae1) this.o0.q).h);
                return;
            }
            Context contextZ = Z();
            String string8 = bundle.getString("coverArtId");
            vz3 vz3VarT = b11.g(contextZ, string8, 9, a.c(contextZ), string8 != null ? wg0.b(ud3.t(), string8) : null).T(xv0.b());
            if (ud3.R()) {
                vz3VarT = (vz3) vz3VarT.l();
            }
            vz3VarT.K((ImageView) ((ae1) this.o0.q).h);
        }
    }

    public final void m0(boolean z) {
        ns3 ns3Var;
        if (u52.c().a || (ns3Var = this.o0) == null) {
            return;
        }
        ((ToggleButton) ((ae1) ns3Var.q).f).setChecked(z);
        Handler handler = this.r0;
        ur2 ur2Var = this.s0;
        if (z) {
            handler.postDelayed(ur2Var, 1000L);
        } else {
            handler.removeCallbacks(ur2Var);
        }
    }

    public final void n0(bj2 bj2Var) {
        boolean z = u52.c().a;
        ns3 ns3Var = this.o0;
        if (z) {
            if (ns3Var != null) {
                ((SeekBar) ((ae1) ns3Var.q).m).setProgress((int) (u52.c().b(SystemClock.elapsedRealtime()) / 1000), true);
            }
        } else if (ns3Var != null) {
            ((SeekBar) ((ae1) ns3Var.q).m).setProgress((int) (bj2Var.M0() / 1000), true);
        }
    }
}
