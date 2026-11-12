package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xf4 extends pp0 {
    public static final int[] C0 = {5, 10, 15, 20, 30, 45, 60, -2, -1};
    public pz1 B0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [wf4] */
    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        String strT;
        String[] stringArray = r().getStringArray(R.array.sleep_timer_duration_labels);
        boolean z = u52.c().a;
        v52 v52VarC = u52.c();
        boolean z2 = z ? v52VarC.A : yf4.c().f;
        final int i = 0;
        vg2 vg2Var = new vg2(X(), 0);
        vg2Var.p(R.string.sleep_timer_dialog_title);
        vg2Var.n(stringArray, new DialogInterface.OnClickListener(this) { // from class: wf4
            public final /* synthetic */ xf4 o;

            {
                this.o = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) throws JSONException {
                int i3 = i;
                xf4 xf4Var = this.o;
                int i4 = 1;
                switch (i3) {
                    case 0:
                        int i5 = xf4.C0[i2];
                        SharedPreferences sharedPreferencesC = null;
                        if (i5 != -1) {
                            pz1 pz1Var = xf4Var.B0;
                            if (i5 != -2) {
                                if (pz1Var != null) {
                                    if (u52.c().a) {
                                        u52.s(i5, "minutes");
                                    } else {
                                        yf4 yf4VarC = yf4.c();
                                        yf4VarC.a(false);
                                        yf4VarC.g = false;
                                        yf4VarC.e = (((long) i5) * 60000) + System.currentTimeMillis();
                                        yf4VarC.f = true;
                                        try {
                                            App.b().getClass();
                                            sharedPreferencesC = App.c();
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        if (sharedPreferencesC != null) {
                                            sharedPreferencesC.edit().putLong("sleep_timer_end_time_ms", yf4VarC.e).putBoolean("sleep_timer_end_of_track", yf4VarC.g).apply();
                                        }
                                        jq3 jq3Var = new jq3(8, yf4VarC);
                                        yf4VarC.b = jq3Var;
                                        yf4VarC.a.postDelayed(jq3Var, 1000L);
                                        PlayerControllerFragment playerControllerFragment = (PlayerControllerFragment) pz1Var.o;
                                        yf4.c().h = new vj3(playerControllerFragment);
                                        playerControllerFragment.x0();
                                    }
                                }
                                dialogInterface.dismiss();
                            } else {
                                if (pz1Var != null) {
                                    if (u52.c().a) {
                                        u52.s(0, "end");
                                    } else {
                                        yf4.c().e();
                                        PlayerControllerFragment playerControllerFragment2 = (PlayerControllerFragment) pz1Var.o;
                                        yf4.c().h = new vj3(playerControllerFragment2);
                                        playerControllerFragment2.x0();
                                    }
                                }
                                dialogInterface.dismiss();
                            }
                        } else {
                            dialogInterface.dismiss();
                            EditText editText = new EditText(xf4Var.Z());
                            editText.setInputType(2);
                            editText.setHint(xf4Var.s(R.string.sleep_timer_custom_hint));
                            int iRound = Math.round(xf4Var.r().getDisplayMetrics().density * 16.0f);
                            editText.setPadding(iRound, iRound, iRound, iRound);
                            vg2 vg2Var2 = new vg2(xf4Var.X(), 0);
                            vg2Var2.p(R.string.sleep_timer_dialog_title);
                            vg2Var2.q(editText).l(R.string.sleep_timer_custom_set, new b62(xf4Var, editText, i4)).j(R.string.sleep_timer_dialog_close, null).h();
                        }
                        break;
                    default:
                        pz1 pz1Var2 = xf4Var.B0;
                        if (pz1Var2 != null) {
                            if (!u52.c().a) {
                                yf4.c().a(true);
                                ((PlayerControllerFragment) pz1Var2.o).x0();
                            } else {
                                u52.s(0, "cancel");
                            }
                        }
                        break;
                }
            }
        });
        vg2 vg2VarJ = vg2Var.j(R.string.sleep_timer_dialog_close, new wr(14));
        if (z2) {
            if (z ? v52VarC.B : yf4.c().g) {
                strT = s(R.string.sleep_timer_dialog_end_of_track_active);
            } else {
                strT = t(R.string.sleep_timer_dialog_active_message, z ? v52VarC.C : yf4.c().d());
            }
            vg2VarJ.a.f = strT;
            final int i2 = 1;
            vg2VarJ.k(R.string.sleep_timer_dialog_cancel_timer, new DialogInterface.OnClickListener(this) { // from class: wf4
                public final /* synthetic */ xf4 o;

                {
                    this.o = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) throws JSONException {
                    int i4 = i2;
                    xf4 xf4Var = this.o;
                    int i5 = 1;
                    switch (i4) {
                        case 0:
                            int i6 = xf4.C0[i3];
                            SharedPreferences sharedPreferencesC = null;
                            if (i6 != -1) {
                                pz1 pz1Var = xf4Var.B0;
                                if (i6 != -2) {
                                    if (pz1Var != null) {
                                        if (u52.c().a) {
                                            u52.s(i6, "minutes");
                                        } else {
                                            yf4 yf4VarC = yf4.c();
                                            yf4VarC.a(false);
                                            yf4VarC.g = false;
                                            yf4VarC.e = (((long) i6) * 60000) + System.currentTimeMillis();
                                            yf4VarC.f = true;
                                            try {
                                                App.b().getClass();
                                                sharedPreferencesC = App.c();
                                                break;
                                            } catch (Exception unused) {
                                            }
                                            if (sharedPreferencesC != null) {
                                                sharedPreferencesC.edit().putLong("sleep_timer_end_time_ms", yf4VarC.e).putBoolean("sleep_timer_end_of_track", yf4VarC.g).apply();
                                            }
                                            jq3 jq3Var = new jq3(8, yf4VarC);
                                            yf4VarC.b = jq3Var;
                                            yf4VarC.a.postDelayed(jq3Var, 1000L);
                                            PlayerControllerFragment playerControllerFragment = (PlayerControllerFragment) pz1Var.o;
                                            yf4.c().h = new vj3(playerControllerFragment);
                                            playerControllerFragment.x0();
                                        }
                                    }
                                    dialogInterface.dismiss();
                                } else {
                                    if (pz1Var != null) {
                                        if (u52.c().a) {
                                            u52.s(0, "end");
                                        } else {
                                            yf4.c().e();
                                            PlayerControllerFragment playerControllerFragment2 = (PlayerControllerFragment) pz1Var.o;
                                            yf4.c().h = new vj3(playerControllerFragment2);
                                            playerControllerFragment2.x0();
                                        }
                                    }
                                    dialogInterface.dismiss();
                                }
                            } else {
                                dialogInterface.dismiss();
                                EditText editText = new EditText(xf4Var.Z());
                                editText.setInputType(2);
                                editText.setHint(xf4Var.s(R.string.sleep_timer_custom_hint));
                                int iRound = Math.round(xf4Var.r().getDisplayMetrics().density * 16.0f);
                                editText.setPadding(iRound, iRound, iRound, iRound);
                                vg2 vg2Var2 = new vg2(xf4Var.X(), 0);
                                vg2Var2.p(R.string.sleep_timer_dialog_title);
                                vg2Var2.q(editText).l(R.string.sleep_timer_custom_set, new b62(xf4Var, editText, i5)).j(R.string.sleep_timer_dialog_close, null).h();
                            }
                            break;
                        default:
                            pz1 pz1Var2 = xf4Var.B0;
                            if (pz1Var2 != null) {
                                if (!u52.c().a) {
                                    yf4.c().a(true);
                                    ((PlayerControllerFragment) pz1Var2.o).x0();
                                } else {
                                    u52.s(0, "cancel");
                                }
                            }
                            break;
                    }
                }
            });
        }
        return vg2VarJ.create();
    }
}
