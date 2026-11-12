package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ai3 extends pp0 {
    public vj3 B0;

    public ai3() {
    }

    public static float n0(float r3) {
        float r0 = 1.0f;
        if (r3 > 1.0f) goto L7;
        float r4 = ((r3 - 0.5f) / 0.5f) * 0.75f;
        r0 = 0.25f;
    L6:
        return r4 + r0;
    L7:
        r4 = ((r3 - 1.0f) / 0.5f) * 1.0f;
        goto L6
    }

    public static float o0(float r4) {
        float r5 = Math.max(0.25f, Math.min(2.0f, r4));
        if (r5 > 1.0f) goto L7;
        return (((r5 - 0.25f) / 0.75f) * 0.5f) + 0.5f;
    L7:
        return (((r5 - 1.0f) / 1.0f) * 0.5f) + 1.0f;
    }

    public static float p0(float r1) {
        return Math.round(Math.max(0.25f, Math.min(2.0f, r1)) / 0.05f) * 0.05f;
    }

    public static float q0(float r1) {
        return Math.round(Math.max(0.25f, Math.min(2.0f, r1)) / 0.05f) * 0.05f;
    }

    public static void r0(Button r3, Button r4, float r5) {
        boolean r1 = false;
        if (r5 <= 0.25f) goto L5;
        boolean r0 = true;
    L6:
        r3.setEnabled(r0);
        if (r5 >= 2.0f) goto L9;
        r1 = true;
    L9:
        r4.setEnabled(r1);
        return;
    L5:
        r0 = false;
        goto L6
    }

    public static void t0(MaterialSwitch r3, View r4, boolean r5, boolean r6) {
        int r0 = 8;
        if (r5 == false) goto L5;
        int r2 = 0;
    L6:
        r3.setVisibility(r2);
        if (r5 == false) goto L10;
        if (r6 == false) goto L10;
        r0 = 0;
    L10:
        r4.setVisibility(r0);
        return;
    L5:
        r2 = 8;
        goto L6
    }

    public static void v0(Button r1, float r2, boolean r3, boolean r4, float r5) {
        if (r1 != null) goto L5;
        return;
    L5:
        if (r2 != 1.0f) goto L12;
        if (r3 == true) goto L12;
        if (r4 == true) goto L12;
        if (r5 != 1.0f) goto L12;
        boolean r6 = false;
    L13:
        r1.setEnabled(r6);
        return;
    L12:
        r6 = true;
        goto L13
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r22) {
        View r11 = LayoutInflater.from(Z()).inflate(R.layout.dialog_playback_speed, null);
        final TextView r3 = (TextView) r11.findViewById(R.id.playback_speed_value_text_view);
        final Button r4 = (Button) r11.findViewById(R.id.playback_speed_decrease_button);
        final Slider r2 = (Slider) r11.findViewById(R.id.playback_speed_slider);
        final Button r5 = (Button) r11.findViewById(R.id.playback_speed_increase_button);
        final MaterialSwitch r6 = (MaterialSwitch) r11.findViewById(R.id.playback_speed_pitch_switch);
        final MaterialSwitch r7 = (MaterialSwitch) r11.findViewById(R.id.playback_speed_manual_pitch_switch);
        final View r15 = r11.findViewById(R.id.playback_speed_manual_pitch_container);
        final TextView r12 = (TextView) r11.findViewById(R.id.playback_speed_manual_pitch_value_text_view);
        final Button r13 = (Button) r11.findViewById(R.id.playback_speed_manual_pitch_decrease_button);
        final Slider r8 = (Slider) r11.findViewById(R.id.playback_speed_manual_pitch_slider);
        final Button r14 = (Button) r11.findViewById(R.id.playback_speed_manual_pitch_increase_button);
        final boolean[] r9 = {false};
        final Button[] r16 = {null};
        if (u52.c().a == false) goto L5;
        float r0 = u52.c().y;
    L6:
        float r1 = q0(r0);
        App.b().getClass();
        float r10 = p0(App.c().getFloat("playback_speed_manual_pitch_value", 1.0f));
        App.b().getClass();
        final int r17 = 0;
        r6.setChecked(App.c().getBoolean("playback_speed_pitch", false));
        App.b().getClass();
        r7.setChecked(App.c().getBoolean("playback_speed_manual_pitch", false));
        r2.setValueFrom(0.5f);
        r2.setValueTo(1.5f);
        r2.setStepSize(0.0f);
        r2.setLabelFormatter(new rh3(this, r17));
        r2.setValue(o0(r1));
        r8.setValueFrom(0.5f);
        r8.setValueTo(1.5f);
        r8.setStepSize(0.0f);
        final int r18 = 1;
        r8.setLabelFormatter(new rh3(this, r18));
        r8.setValue(o0(r10));
        x0(r3, r1);
        u0(r12, r10);
        r0(r4, r5, r1);
        r0(r13, r14, r10);
        t0(r7, r15, r6.isChecked(), r7.isChecked());
        r2.y.add(new wh3(this, r3, r4, r5, r16, r6, r7, r8, r2));
        final int r19 = 0;
        r4.setOnClickListener(new xh3(this, r2, r3, r4, r5, r19));
        final int r20 = 1;
        r5.setOnClickListener(new xh3(this, r2, r3, r4, r5, r20));
        r6.setOnCheckedChangeListener(new yh3(this, r7, r15, r16, r2, r8, r9));
        r7.setOnCheckedChangeListener(new zh3(this, r7, r15, r6, r16, r2, r8, r9));
        r8.y.add(new wh3(this, r12, r13, r14, r16, r2, r6, r7, r8));
        final int r21 = 0;
        r13.setOnClickListener(new sh3(this, r2, r8, r12, r13, r14, r21));
        final int r23 = 1;
        r14.setOnClickListener(new sh3(this, r2, r8, r12, r13, r14, r23));
        vg2 r24 = new vg2(X(), 0);
        r24.p(R.string.playback_speed_dialog_title);
        vg2 r25 = r24.q(r11);
        r25.k(R.string.playback_speed_dialog_reset_button, null);
        final f9 r26 = r25.j(R.string.playback_speed_dialog_negative_button, new wr(5)).create();
        r26.setOnShowListener(new vh3(this, r16, r26, r2, r6, r7, r8, r9, r3, r12, r4, r5, r13, r14, r15));
        return r26;
    L5:
        App.b().getClass();
        r0 = App.c().getFloat("playback_speed", 1.0f);
        goto L6
    }

    public final void s0(Slider r2, Slider r3, TextView r4, Button r5, Button r6, float r7) {
        float r8 = p0(n0(r3.getValue()) + r7);
        r3.setValue(o0(r8));
        u0(r4, r8);
        r0(r5, r6, r8);
        ud3.s0(r8);
        vj3 r1 = this.B0;
        if (r1 == null) goto L6;
        r1.a(q0(n0(r2.getValue())));
        return;
    }

    public final void u0(TextView r2, float r3) {
        r2.setText(t(R.string.playback_speed_manual_pitch_value, new Object[]{Float.valueOf(r3 * 100.0f)}));
    }

    public final void w0(Slider r2, TextView r3, Button r4, Button r5, float r6) {
        float r7 = q0(n0(r2.getValue()) + r6);
        r2.setValue(o0(r7));
        x0(r3, r7);
        r0(r4, r5, r7);
        ud3.r0(r7);
        vj3 r1 = this.B0;
        if (r1 == null) goto L6;
        r1.a(r7);
        return;
    }

    public final void x0(TextView r2, float r3) {
        r2.setText(t(R.string.player_playback_speed, new Object[]{Float.valueOf(r3)}));
    }
}
