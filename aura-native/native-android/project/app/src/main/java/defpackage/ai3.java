package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ai3 extends pp0 {
    public vj3 B0;

    public static float n0(float f) {
        float f2;
        float f3 = 1.0f;
        if (f <= 1.0f) {
            f2 = ((f - 0.5f) / 0.5f) * 0.75f;
            f3 = 0.25f;
        } else {
            f2 = ((f - 1.0f) / 0.5f) * 1.0f;
        }
        return f2 + f3;
    }

    public static float o0(float f) {
        float fMax = Math.max(0.25f, Math.min(2.0f, f));
        return fMax <= 1.0f ? (((fMax - 0.25f) / 0.75f) * 0.5f) + 0.5f : (((fMax - 1.0f) / 1.0f) * 0.5f) + 1.0f;
    }

    public static float p0(float f) {
        return Math.round(Math.max(0.25f, Math.min(2.0f, f)) / 0.05f) * 0.05f;
    }

    public static float q0(float f) {
        return Math.round(Math.max(0.25f, Math.min(2.0f, f)) / 0.05f) * 0.05f;
    }

    public static void r0(Button button, Button button2, float f) {
        button.setEnabled(f > 0.25f);
        button2.setEnabled(f < 2.0f);
    }

    public static void t0(MaterialSwitch materialSwitch, View view, boolean z, boolean z2) {
        int i = 8;
        materialSwitch.setVisibility(z ? 0 : 8);
        if (z && z2) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public static void v0(Button button, float f, boolean z, boolean z2, float f2) {
        if (button == null) {
            return;
        }
        button.setEnabled(f != 1.0f || z || z2 || f2 != 1.0f);
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        float f;
        View viewInflate = LayoutInflater.from(Z()).inflate(R.layout.dialog_playback_speed, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(R.id.playback_speed_value_text_view);
        final Button button = (Button) viewInflate.findViewById(R.id.playback_speed_decrease_button);
        final Slider slider = (Slider) viewInflate.findViewById(R.id.playback_speed_slider);
        final Button button2 = (Button) viewInflate.findViewById(R.id.playback_speed_increase_button);
        final MaterialSwitch materialSwitch = (MaterialSwitch) viewInflate.findViewById(R.id.playback_speed_pitch_switch);
        final MaterialSwitch materialSwitch2 = (MaterialSwitch) viewInflate.findViewById(R.id.playback_speed_manual_pitch_switch);
        final View viewFindViewById = viewInflate.findViewById(R.id.playback_speed_manual_pitch_container);
        final TextView textView2 = (TextView) viewInflate.findViewById(R.id.playback_speed_manual_pitch_value_text_view);
        final Button button3 = (Button) viewInflate.findViewById(R.id.playback_speed_manual_pitch_decrease_button);
        final Slider slider2 = (Slider) viewInflate.findViewById(R.id.playback_speed_manual_pitch_slider);
        final Button button4 = (Button) viewInflate.findViewById(R.id.playback_speed_manual_pitch_increase_button);
        final boolean[] zArr = {false};
        final Button[] buttonArr = {null};
        if (u52.c().a) {
            f = u52.c().y;
        } else {
            App.b().getClass();
            f = App.c().getFloat("playback_speed", 1.0f);
        }
        float fQ0 = q0(f);
        App.b().getClass();
        float fP0 = p0(App.c().getFloat("playback_speed_manual_pitch_value", 1.0f));
        App.b().getClass();
        final int i = 0;
        materialSwitch.setChecked(App.c().getBoolean("playback_speed_pitch", false));
        App.b().getClass();
        materialSwitch2.setChecked(App.c().getBoolean("playback_speed_manual_pitch", false));
        slider.setValueFrom(0.5f);
        slider.setValueTo(1.5f);
        slider.setStepSize(0.0f);
        slider.setLabelFormatter(new p42(this) { // from class: rh3
            public final /* synthetic */ ai3 b;

            {
                this.b = this;
            }

            @Override // defpackage.p42
            public final String a(float f2) {
                int i2 = i;
                ai3 ai3Var = this.b;
                switch (i2) {
                    case 0:
                        return ai3Var.t(R.string.player_playback_speed, Float.valueOf(ai3.q0(ai3.n0(f2))));
                    default:
                        return ai3Var.t(R.string.playback_speed_manual_pitch_value, Float.valueOf(ai3.p0(ai3.n0(f2)) * 100.0f));
                }
            }
        });
        slider.setValue(o0(fQ0));
        slider2.setValueFrom(0.5f);
        slider2.setValueTo(1.5f);
        slider2.setStepSize(0.0f);
        final int i2 = 1;
        slider2.setLabelFormatter(new p42(this) { // from class: rh3
            public final /* synthetic */ ai3 b;

            {
                this.b = this;
            }

            @Override // defpackage.p42
            public final String a(float f2) {
                int i3 = i2;
                ai3 ai3Var = this.b;
                switch (i3) {
                    case 0:
                        return ai3Var.t(R.string.player_playback_speed, Float.valueOf(ai3.q0(ai3.n0(f2))));
                    default:
                        return ai3Var.t(R.string.playback_speed_manual_pitch_value, Float.valueOf(ai3.p0(ai3.n0(f2)) * 100.0f));
                }
            }
        });
        slider2.setValue(o0(fP0));
        x0(textView, fQ0);
        u0(textView2, fP0);
        r0(button, button2, fQ0);
        r0(button3, button4, fP0);
        t0(materialSwitch2, viewFindViewById, materialSwitch.isChecked(), materialSwitch2.isChecked());
        slider.y.add(new wh3(this, textView, button, button2, buttonArr, materialSwitch, materialSwitch2, slider2, slider));
        final int i3 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: xh3
            public final /* synthetic */ ai3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                switch (i3) {
                    case 0:
                        this.o.w0(slider, textView, button, button2, -0.05f);
                        break;
                    default:
                        this.o.w0(slider, textView, button, button2, 0.05f);
                        break;
                }
            }
        });
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: xh3
            public final /* synthetic */ ai3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                switch (i4) {
                    case 0:
                        this.o.w0(slider, textView, button, button2, -0.05f);
                        break;
                    default:
                        this.o.w0(slider, textView, button, button2, 0.05f);
                        break;
                }
            }
        });
        materialSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yh3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws JSONException {
                vj3 vj3Var;
                App.b().getClass();
                App.c().edit().putBoolean("playback_speed_pitch", z).apply();
                MaterialSwitch materialSwitch3 = materialSwitch2;
                ai3.t0(materialSwitch3, viewFindViewById, z, materialSwitch3.isChecked());
                Button button5 = buttonArr[0];
                Slider slider3 = slider;
                ai3.v0(button5, ai3.q0(ai3.n0(slider3.getValue())), z, materialSwitch3.isChecked(), ai3.p0(ai3.n0(slider2.getValue())));
                if (zArr[0] || (vj3Var = this.a.B0) == null) {
                    return;
                }
                vj3Var.a(ai3.q0(ai3.n0(slider3.getValue())));
            }
        });
        materialSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zh3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws JSONException {
                vj3 vj3Var;
                App.b().getClass();
                App.c().edit().putBoolean("playback_speed_manual_pitch", z).apply();
                MaterialSwitch materialSwitch3 = materialSwitch;
                ai3.t0(materialSwitch2, viewFindViewById, materialSwitch3.isChecked(), z);
                Button button5 = buttonArr[0];
                Slider slider3 = slider;
                ai3.v0(button5, ai3.q0(ai3.n0(slider3.getValue())), materialSwitch3.isChecked(), z, ai3.p0(ai3.n0(slider2.getValue())));
                if (zArr[0] || (vj3Var = this.a.B0) == null) {
                    return;
                }
                vj3Var.a(ai3.q0(ai3.n0(slider3.getValue())));
            }
        });
        slider2.y.add(new wh3(this, textView2, button3, button4, buttonArr, slider, materialSwitch, materialSwitch2, slider2));
        final int i5 = 0;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: sh3
            public final /* synthetic */ ai3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                switch (i5) {
                    case 0:
                        this.o.s0(slider, slider2, textView2, button3, button4, -0.05f);
                        break;
                    default:
                        this.o.s0(slider, slider2, textView2, button3, button4, 0.05f);
                        break;
                }
            }
        });
        final int i6 = 1;
        button4.setOnClickListener(new View.OnClickListener(this) { // from class: sh3
            public final /* synthetic */ ai3 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                switch (i6) {
                    case 0:
                        this.o.s0(slider, slider2, textView2, button3, button4, -0.05f);
                        break;
                    default:
                        this.o.s0(slider, slider2, textView2, button3, button4, 0.05f);
                        break;
                }
            }
        });
        vg2 vg2Var = new vg2(X(), 0);
        vg2Var.p(R.string.playback_speed_dialog_title);
        vg2 vg2VarQ = vg2Var.q(viewInflate);
        vg2VarQ.k(R.string.playback_speed_dialog_reset_button, null);
        final f9 f9VarCreate = vg2VarQ.j(R.string.playback_speed_dialog_negative_button, new wr(5)).create();
        f9VarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vh3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Button button5 = (Button) f9VarCreate.findViewById(android.R.id.button3);
                final Button[] buttonArr2 = buttonArr;
                buttonArr2[0] = button5;
                final Slider slider3 = slider;
                float fQ1 = ai3.q0(ai3.n0(slider3.getValue()));
                final MaterialSwitch materialSwitch3 = materialSwitch;
                boolean zIsChecked = materialSwitch3.isChecked();
                final MaterialSwitch materialSwitch4 = materialSwitch2;
                boolean zIsChecked2 = materialSwitch4.isChecked();
                final Slider slider4 = slider2;
                ai3.v0(button5, fQ1, zIsChecked, zIsChecked2, ai3.p0(ai3.n0(slider4.getValue())));
                final ai3 ai3Var = this.a;
                slider3.y.add(new dg4(ai3Var, buttonArr2, materialSwitch3, materialSwitch4, slider4) { // from class: th3
                    public final /* synthetic */ Button[] a;
                    public final /* synthetic */ MaterialSwitch b;
                    public final /* synthetic */ MaterialSwitch c;
                    public final /* synthetic */ Slider d;

                    {
                        this.a = buttonArr2;
                        this.b = materialSwitch3;
                        this.c = materialSwitch4;
                        this.d = slider4;
                    }

                    @Override // defpackage.dg4
                    public final void a(float f2, boolean z) {
                        ai3.v0(this.a[0], ai3.q0(ai3.n0(f2)), this.b.isChecked(), this.c.isChecked(), ai3.p0(ai3.n0(this.d.getValue())));
                    }
                });
                Button button6 = buttonArr2[0];
                final boolean[] zArr2 = zArr;
                final TextView textView3 = textView;
                final TextView textView4 = textView2;
                final Button button7 = button;
                final Button button8 = button2;
                final Button button9 = button3;
                final Button button10 = button4;
                final View view = viewFindViewById;
                button6.setOnClickListener(new View.OnClickListener() { // from class: uh3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws JSONException {
                        boolean[] zArr3 = zArr2;
                        zArr3[0] = true;
                        slider3.setValue(ai3.o0(1.0f));
                        materialSwitch3.setChecked(false);
                        MaterialSwitch materialSwitch5 = materialSwitch4;
                        materialSwitch5.setChecked(false);
                        slider4.setValue(ai3.o0(1.0f));
                        zArr3[0] = false;
                        ai3 ai3Var2 = ai3Var;
                        ai3Var2.x0(textView3, 1.0f);
                        ai3Var2.u0(textView4, 1.0f);
                        ud3.r0(1.0f);
                        ud3.s0(1.0f);
                        ai3.r0(button7, button8, 1.0f);
                        ai3.r0(button9, button10, 1.0f);
                        ai3.t0(materialSwitch5, view, false, false);
                        ai3.v0(buttonArr2[0], 1.0f, false, false, 1.0f);
                        vj3 vj3Var = ai3Var2.B0;
                        if (vj3Var != null) {
                            vj3Var.a(1.0f);
                        }
                    }
                });
            }
        });
        return f9VarCreate;
    }

    public final void s0(Slider slider, Slider slider2, TextView textView, Button button, Button button2, float f) throws JSONException {
        float fP0 = p0(n0(slider2.getValue()) + f);
        slider2.setValue(o0(fP0));
        u0(textView, fP0);
        r0(button, button2, fP0);
        ud3.s0(fP0);
        vj3 vj3Var = this.B0;
        if (vj3Var != null) {
            vj3Var.a(q0(n0(slider.getValue())));
        }
    }

    public final void u0(TextView textView, float f) {
        textView.setText(t(R.string.playback_speed_manual_pitch_value, Float.valueOf(f * 100.0f)));
    }

    public final void w0(Slider slider, TextView textView, Button button, Button button2, float f) throws JSONException {
        float fQ0 = q0(n0(slider.getValue()) + f);
        slider.setValue(o0(fQ0));
        x0(textView, fQ0);
        r0(button, button2, fQ0);
        ud3.r0(fQ0);
        vj3 vj3Var = this.B0;
        if (vj3Var != null) {
            vj3Var.a(fQ0);
        }
    }

    public final void x0(TextView textView, float f) {
        textView.setText(t(R.string.player_playback_speed, Float.valueOf(f)));
    }
}
