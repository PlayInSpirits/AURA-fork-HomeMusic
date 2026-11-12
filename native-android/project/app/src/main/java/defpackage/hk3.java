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
    public final Handler p0 = new Handler(Looper.getMainLooper());
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
        u01 u01Var = u01.n;
        this.q0 = uc5.B(u01Var);
        this.r0 = u01Var;
        this.s0 = new wd3(0);
        Boolean bool = Boolean.FALSE;
        this.t0 = uc5.B(bool);
        this.u0 = uc5.B(null);
        this.v0 = uc5.B(null);
        this.w0 = new int[0];
        this.x0 = uc5.B(bool);
        this.y0 = uc5.B(bool);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.inner_fragment_player_cover, viewGroup, false);
        int i2 = R.id.horizontal_guideline;
        if (((Guideline) uo.s(viewInflate, R.id.horizontal_guideline)) != null) {
            i2 = R.id.inner_button_bottom_left;
            Button button = (Button) uo.s(viewInflate, R.id.inner_button_bottom_left);
            if (button != null) {
                i2 = R.id.inner_button_bottom_right;
                Button button2 = (Button) uo.s(viewInflate, R.id.inner_button_bottom_right);
                if (button2 != null) {
                    i2 = R.id.inner_button_bottom_right_alternative;
                    Button button3 = (Button) uo.s(viewInflate, R.id.inner_button_bottom_right_alternative);
                    if (button3 != null) {
                        i2 = R.id.inner_button_top_left;
                        Button button4 = (Button) uo.s(viewInflate, R.id.inner_button_top_left);
                        if (button4 != null) {
                            i2 = R.id.inner_button_top_right;
                            Button button5 = (Button) uo.s(viewInflate, R.id.inner_button_top_right);
                            if (button5 != null) {
                                i2 = R.id.now_playing_artwork_pager;
                                ComposeView composeView = (ComposeView) uo.s(viewInflate, R.id.now_playing_artwork_pager);
                                if (composeView != null) {
                                    i2 = R.id.now_playing_song_cover_button_group;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.now_playing_song_cover_button_group);
                                    if (constraintLayout != null) {
                                        i2 = R.id.now_playing_tap_button;
                                        Button button6 = (Button) uo.s(viewInflate, R.id.now_playing_tap_button);
                                        if (button6 != null) {
                                            i2 = R.id.vertical_guideline;
                                            if (((Guideline) uo.s(viewInflate, R.id.vertical_guideline)) != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                this.l0 = new ey(constraintLayout2, button, button2, button3, button4, button5, composeView, constraintLayout, button6);
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
                                                composeView.setViewCompositionStrategy(rv2.K);
                                                int i3 = 1;
                                                composeView.setContent(new r70(1604145647, true, new z(9, this)));
                                                ey eyVar = this.l0;
                                                int i4 = 3;
                                                if (eyVar != null) {
                                                    ((ConstraintLayout) eyVar.g).setOnClickListener(new fk3(this, 2));
                                                    ((Button) eyVar.h).setOnClickListener(new fk3(this, i4));
                                                }
                                                aj3 aj3Var = this.m0;
                                                if (aj3Var == null) {
                                                    h12.Q("playerBottomSheetViewModel");
                                                    throw null;
                                                }
                                                aj3Var.n.e(v(), new ht1(new dk3(this, i4), 1));
                                                aj3 aj3Var2 = this.m0;
                                                if (aj3Var2 == null) {
                                                    h12.Q("playerBottomSheetViewModel");
                                                    throw null;
                                                }
                                                ns3 ns3Var = aj3Var2.f.a;
                                                ((s24) ns3Var.o).i().a(new String[]{"queue"}, new ks3(ns3Var, i3)).e(v(), new ht1(new dk3(this, 4), 1));
                                                is3.e.e(v(), new ht1(new dk3(this, 5), 1));
                                                u52.c.e(v(), new ht1(new dk3(this, 6), 1));
                                                u52.b.e(v(), new ht1(new dk3(this, 7), 1));
                                                aj3 aj3Var3 = this.m0;
                                                if (aj3Var3 == null) {
                                                    h12.Q("playerBottomSheetViewModel");
                                                    throw null;
                                                }
                                                aj3Var3.n.e(v(), new ht1(new dk3(this, i), 1));
                                                constraintLayout2.getClass();
                                                return constraintLayout2;
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
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
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
        this.n0 = bl2Var;
        bl2Var.f(new ur2(9, bl2Var, this), gq0.n);
        l0(false);
    }

    @Override // defpackage.kc1
    public final void S() {
        bl2 bl2Var = this.n0;
        if (bl2Var != null) {
            sk2.Z0(bl2Var);
        }
        this.n0 = null;
        this.o0 = null;
        this.R = true;
    }

    public final List h0() {
        return (List) this.q0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00df  */
    public final void i0(bj2 bj2Var) {
        gn2 gn2VarA;
        if (u52.c().a) {
            return;
        }
        int[] iArrD = is3.d(bj2Var);
        this.w0 = iArrD;
        ArrayList arrayList = new ArrayList(iArrD.length);
        boolean z = false;
        for (int i : iArrD) {
            Child childN = gi1.N(bj2Var.Y(i));
            if (childN == null) {
                String str = bj2Var.Y(i).a;
                str.getClass();
                childN = new Child(str, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
            }
            arrayList.add(childN);
        }
        this.q0.setValue(arrayList);
        int iL0 = ti.l0(iArrD, bj2Var.o0());
        if (iL0 < 0) {
            iL0 = 0;
        }
        k0(iL0);
        if (!((Boolean) this.t0.getValue()).booleanValue() && (gn2VarA = bj2Var.a()) != null) {
            if (b.h(bj2Var)) {
                if (is3.e(bj2Var) == 0) {
                    z = true;
                }
            } else if (!a.j(bj2Var) && is3.e(bj2Var) == 0) {
                boolean zU = xa3.u("continuous_play", true);
                int iH = bj2Var.h();
                boolean zC = is3.c(gn2VarA);
                if (zU && zC && iH == 0 && !is3.d) {
                    z = true;
                }
            }
        }
        this.x0.setValue(Boolean.valueOf(z));
    }

    public final void j0() {
        Object objO;
        int i;
        v52 v52VarC = u52.c();
        this.t0.setValue(Boolean.FALSE);
        if (u52.k()) {
            objO = u52.l();
        } else {
            objO = v52VarC.p > 0 ? gb.O(u52.d()) : u01.n;
        }
        this.q0.setValue(objO);
        int i2 = 0;
        if (u52.k() && (i = v52VarC.o) >= 0) {
            i2 = i;
        }
        k0(i2);
    }

    public final void k0(int i) {
        this.s0.h(i);
    }

    public final void l0(boolean z) {
        ey eyVar;
        ey eyVar2 = this.l0;
        if (eyVar2 == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) eyVar2.g;
        Fade fade = new Fade();
        fade.setDuration(200L);
        fade.addTarget(constraintLayout);
        TransitionManager.beginDelayedTransition((ConstraintLayout) eyVar2.a, fade);
        constraintLayout.setVisibility(z ? 0 : 8);
        ((Button) eyVar2.h).setVisibility(z ? 8 : 0);
        ((Button) eyVar2.c).setVisibility(ud3.Y() ? 0 : 8);
        ((Button) eyVar2.d).setVisibility(ud3.Y() ? 8 : 0);
        if (z || (eyVar = this.l0) == null) {
            return;
        }
        ((Button) eyVar.h).setVisibility(0);
        Handler handler = this.p0;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new qa1(28, this), 10000L);
    }

    public final void m0(do2 do2Var, int i) {
        gn2 gn2VarA;
        String str;
        if (u52.c().a) {
            return;
        }
        Bundle bundle = do2Var.I;
        this.t0.setValue(Boolean.valueOf(bundle != null && WaveOrigin.RADIO.equals(bundle.getString("type"))));
        this.u0.setValue(do2Var.m);
        String string = null;
        this.v0.setValue(bundle != null ? bundle.getString("coverArtId") : null);
        bj2 bj2Var = this.o0;
        if (bj2Var != null && bj2Var.Q0() > 0) {
            i0(bj2Var);
            return;
        }
        bj2 bj2Var2 = this.o0;
        if (bj2Var2 != null && (gn2VarA = bj2Var2.a()) != null && (str = gn2VarA.a) != null) {
            string = str;
        } else if (bundle != null) {
            string = bundle.getString("id");
        }
        if (string != null && !h0().isEmpty()) {
            Iterator it = h0().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (h12.c(((Child) it.next()).getId(), string)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                k0(i2);
                return;
            }
        }
        if (i < 0) {
            i = 0;
        }
        k0(i);
    }
}
