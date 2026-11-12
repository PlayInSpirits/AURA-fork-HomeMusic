package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatImageButton;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class si3 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi3 b;

    public /* synthetic */ si3(xi3 xi3Var, int i) {
        this.a = i;
        this.b = xi3Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        Object obj2;
        int i = this.a;
        xi3 xi3Var = this.b;
        switch (i) {
            case 0:
                v52 v52Var = (v52) obj;
                ns3 ns3Var = xi3Var.o0;
                if (ns3Var != null) {
                    AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((ae1) ns3Var.q).k;
                    boolean z = v52Var.a;
                    String str = v52Var.g;
                    String strS = v52Var.d;
                    String str2 = v52Var.c;
                    boolean z2 = v52Var.b;
                    appCompatImageButton.setSelected(z);
                    ((AppCompatImageButton) ((ae1) xi3Var.o0.q).k).setContentDescription(z ? xi3Var.t(R.string.lan_controlling, str2) : xi3Var.s(R.string.lan_play_on));
                    AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ((ae1) xi3Var.o0.q).k;
                    e35.S(appCompatImageButton2, appCompatImageButton2.getContentDescription());
                    boolean z3 = xi3Var.l0;
                    xi3Var.l0 = z;
                    if (z) {
                        if (!z3) {
                            ((au) ((MainActivity) xi3Var.X()).V.n).d(true);
                        }
                        Child childD = u52.d();
                        String str3 = childD.getId() + ":" + childD.getAlbumId() + ":" + childD.getArtistId();
                        if (!Objects.equals(xi3Var.n0, str3)) {
                            xi3Var.n0 = str3;
                            String str4 = childD.getId().isEmpty() ? null : "music";
                            xi3Var.p0.i(xi3Var.v(), str4, childD.getId());
                            aj3 aj3Var = xi3Var.p0;
                            le1 le1VarV = xi3Var.v();
                            String str5 = TextUtils.isEmpty(childD.getAlbumId()) ? null : str4;
                            String albumId = childD.getAlbumId();
                            k03 k03Var = aj3Var.o;
                            if (str5 != null) {
                                if (str5.equals("podcast")) {
                                    k03Var.i(null);
                                } else if (str5.equals("music")) {
                                    aj3Var.d.getClass();
                                    k03 k03VarJ = rv2.j(albumId);
                                    Objects.requireNonNull(k03Var);
                                    k03VarJ.e(le1VarV, new g7(k03Var, 1));
                                }
                            }
                            aj3 aj3Var2 = xi3Var.p0;
                            le1 le1VarV2 = xi3Var.v();
                            if (TextUtils.isEmpty(childD.getArtistId())) {
                                str4 = null;
                            }
                            String artistId = childD.getArtistId();
                            k03 k03Var2 = aj3Var2.p;
                            if (str4 == null) {
                                obj2 = null;
                            } else if (str4.equals("podcast")) {
                                obj2 = null;
                                k03Var2.i(null);
                            } else {
                                if (str4.equals("music")) {
                                    aj3Var2.e.getClass();
                                    k03 k03VarV = pa.v(artistId);
                                    Objects.requireNonNull(k03Var2);
                                    k03VarV.e(le1VarV2, new g7(k03Var2, 2));
                                }
                                obj2 = null;
                            }
                            xi3Var.p0.m.i(obj2);
                        }
                        TextView textView = (TextView) ((ae1) xi3Var.o0.q).i;
                        if (strS.isEmpty()) {
                            strS = xi3Var.s(R.string.lan_no_track);
                        }
                        textView.setText(strS);
                        ((TextView) ((ae1) xi3Var.o0.q).i).setVisibility(0);
                        TextView textView2 = ((ae1) xi3Var.o0.q).a;
                        int i2 = v52Var.r;
                        if (i2 == 0) {
                            i2 = z2 ? R.string.lan_remote_active : R.string.lan_connecting;
                        }
                        textView2.setText(xi3Var.t(R.string.lan_device_status, str2, xi3Var.s(i2)));
                        ((ae1) xi3Var.o0.q).a.setVisibility(0);
                        ((ToggleButton) ((ae1) xi3Var.o0.q).f).setChecked(v52Var.k);
                        ((ToggleButton) ((ae1) xi3Var.o0.q).f).setEnabled(z2 && v52Var.p > 0);
                        ((ImageButton) ((ae1) xi3Var.o0.q).j).setVisibility(0);
                        ((ImageButton) ((ae1) xi3Var.o0.q).j).setEnabled(z2 && v52Var.v);
                        ((ImageButton) ((ae1) xi3Var.o0.q).j).setAlpha(z2 ? 1.0f : 0.3f);
                        ((ImageButton) ((ae1) xi3Var.o0.q).l).setVisibility(8);
                        ((ImageButton) ((ae1) xi3Var.o0.q).g).setVisibility(8);
                        ((ImageButton) ((ae1) xi3Var.o0.q).e).setVisibility(8);
                        ((SeekBar) ((ae1) xi3Var.o0.q).m).setMax((int) (v52Var.i / 1000));
                        ((SeekBar) ((ae1) xi3Var.o0.q).m).setProgress((int) (v52Var.h / 1000));
                        if (!Objects.equals(xi3Var.m0, str)) {
                            xi3Var.m0 = str;
                            Context contextZ = xi3Var.Z();
                            String str6 = xi3Var.m0.isEmpty() ? null : xi3Var.m0;
                            vz3 vz3VarT = b11.g(contextZ, str6, 9, a.c(contextZ), str6 != null ? wg0.b(ud3.t(), str6) : null).T(xv0.b());
                            if (ud3.R()) {
                                vz3VarT = (vz3) vz3VarT.l();
                            }
                            vz3VarT.K((ImageView) ((ae1) xi3Var.o0.q).h);
                        }
                        break;
                    } else if (z3) {
                        xi3Var.m0 = null;
                        xi3Var.n0 = null;
                        ((ToggleButton) ((ae1) xi3Var.o0.q).f).setEnabled(true);
                        bl2 bl2Var = xi3Var.q0;
                        if (bl2Var != null && bl2Var.isDone()) {
                            try {
                                bj2 bj2Var = (bj2) xi3Var.q0.get();
                                xi3Var.k0(bj2Var);
                                xi3Var.l0(bj2Var.K0());
                                xi3Var.m0(bj2Var.h0());
                                xi3Var.h0(bj2Var.x());
                                xi3Var.i0(bj2Var.f0());
                                xi3Var.n0(bj2Var);
                                if (bj2Var.Q0() == 0) {
                                    ((au) ((MainActivity) xi3Var.X()).V.n).d(false);
                                }
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                Child child = (Child) xi3Var.p0.n.d();
                ns3 ns3Var2 = xi3Var.o0;
                if (ns3Var2 != null) {
                    fu.p(((ae1) ns3Var2.q).a, child != null ? child.getId() : null);
                }
                break;
        }
    }
}
