package com.eddyizm.tempus.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Switch;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b11;
import defpackage.h12;
import defpackage.kc1;
import defpackage.q40;
import defpackage.r50;
import defpackage.ud3;
import defpackage.v11;
import defpackage.v9;
import defpackage.w11;
import defpackage.wo0;
import defpackage.x11;
import defpackage.y11;
import defpackage.z11;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class EqualizerFragment extends kc1 {
    public MainActivity l0;
    public View m0;
    public wo0 n0;
    public LinearLayout o0;
    public Switch p0;
    public Button q0;
    public Space r0;
    public final ArrayList s0;
    public boolean t0;
    public final v9 u0;
    public final y11 v0;

    public EqualizerFragment() {
        this.s0 = new ArrayList();
        this.u0 = new v9(5, this);
        this.v0 = new y11(0, this);
    }

    public static final void h0(EqualizerFragment r21) {
        EqualizerFragment r4 = r21;
        wo0 r0 = r4.n0;
        View r1 = r4.T;
        Throwable r6 = null;
        if (r1 == null) goto L5;
        LinearLayout r2 = (LinearLayout) r1.findViewById(R.id.equalizer_managed_externally_container);
    L6:
        View r3 = r4.T;
        if (r3 == null) goto L9;
        View r5 = r3.findViewById(R.id.equalizer_switch_row);
    L10:
        int r9 = 0;
        if (r0 == null) goto L90;
        if (((v11) r0.n).b() == 0) goto L90;
        if (r2 == null) goto L17;
        r2.setVisibility(8);
    L17:
        if (r5 == null) goto L19;
        r5.setVisibility(0);
    L19:
        Button r7 = r4.q0;
        if (r7 == null) goto L87;
        r7.setVisibility(0);
        LinearLayout r8 = r4.o0;
        if (r8 == null) goto L85;
        r8.setVisibility(0);
        Space r10 = r4.r0;
        if (r10 == null) goto L83;
        r10.setVisibility(0);
        Switch r11 = r4.p0;
        if (r11 == null) goto L81;
        r11.setOnCheckedChangeListener(null);
        Switch r12 = r4.p0;
        if (r12 == null) goto L79;
        r4.l0(r12.isChecked());
        Switch r13 = r4.p0;
        if (r13 == null) goto L77;
        r13.setOnCheckedChangeListener(new w11(r9, r0, r4));
        ArrayList r14 = r4.s0;
        wo0 r15 = r4.n0;
        if (r15 != null) goto L34;
    L33:
        Throwable r17 = r6;
        Button r16 = r4.q0;
        if (r16 == null) goto L73;
        r16.setOnClickListener(new x11(r4, 0));
        return;
    L73:
        h12.Q("resetButton");
        throw r17;
    L34:
        v11 r18 = (v11) r15.n;
        LinearLayout r19 = r4.o0;
        if (r19 == null) goto L75;
        r19.removeAllViews();
        r14.clear();
        short r110 = r18.b();
        short[] r20 = r18.d();
        if (r20 != null) goto L39;
        r20 = new short[]{-1500, 1500};
    L39:
        int r22 = r20[0] / 100;
        int r111 = r20[1] / 100;
        short[] r23 = ud3.q(r110);
        int r24 = 0;
    L40:
        if (r24 >= r110) goto L33;
        short r25 = (short) r24;
        Integer r112 = r18.n(r25);
        if (r112 == null) goto L44;
        int r113 = r112.intValue();
    L45:
        LinearLayout r26 = new LinearLayout(r4.Z());
        r26.setOrientation(r9);
        int r114 = r22;
        LinearLayout.LayoutParams r115 = new LinearLayout.LayoutParams(-1, -2);
        Context r27 = r26.getContext();
        r27.getClass();
        r115.topMargin = (int) (r27.getResources().getDisplayMetrics().density * 16.0f);
        Context r28 = r26.getContext();
        r28.getClass();
        r115.bottomMargin = (int) (r28.getResources().getDisplayMetrics().density * 16.0f);
        r26.setLayoutParams(r115);
        r26.setPadding(0, 8, 0, 8);
        wo0 r29 = r15;
        TextView r116 = new TextView(r4.Z(), null, 0, R.style.LabelSmall);
        if (r113 >= 1000) goto L48;
        String r30 = r113 + " Hz";
    L52:
        r116.setText(r30);
        r116.setGravity(8388611);
        r116.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        r26.addView(r116);
        if (r24 >= 0) goto L55;
    L57:
        Short r31 = null;
    L58:
        if (r31 == null) goto L60;
    L59:
        short r32 = r31.shortValue();
    L64:
        int r33 = r32 / 100;
        int r34 = r24;
        TextView r35 = new TextView(r21.Z(), null, 0, R.style.LabelSmall);
        r35.setText(j0(r33));
        r35.setPadding(12, 0, 0, 0);
        r35.setGravity(8388613);
        r35.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        SeekBar r36 = new SeekBar(r21.Z());
        r36.setMax(r111 - r114);
        r36.setProgress(r33 - r114);
        r36.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 6.0f));
        short[] r37 = r23;
        r4 = r21;
        r15 = r29;
        r22 = r114;
        r36.setOnSeekBarChangeListener(new z11(r22, r15, r25, r4, r35));
        r14.add(r36);
        r26.addView(r36);
        r26.addView(r35);
        LinearLayout r38 = r4.o0;
        if (r38 == null) goto L67;
        r38.addView(r26);
        r24 = r34 + 1;
        r23 = r37;
        r6 = null;
        r9 = 0;
        goto L40
    L67:
        h12.Q("eqBandsContainer");
        throw null;
    L60:
        r31 = r18.z(r25);
        if (r31 != null) goto L59;
        r32 = 0;
        goto L64
    L55:
        if (r24 >= r23.length) goto L57;
        r31 = Short.valueOf(r23[r24]);
        goto L58
    L48:
        if ((r113 % 1000) != 0) goto L50;
        r30 = (r113 / 1000) + " kHz";
        goto L52
    L50:
        r30 = String.format("%.1f kHz", Arrays.copyOf(new Object[]{Float.valueOf(r113 / 1000.0f)}, 1));
        goto L52
    L44:
        r113 = r9;
        goto L45
    L75:
        h12.Q("eqBandsContainer");
        throw null;
    L77:
        h12.Q("eqSwitch");
        throw null;
    L79:
        h12.Q("eqSwitch");
        throw null;
    L81:
        h12.Q("eqSwitch");
        throw null;
    L83:
        h12.Q("safeSpace");
        throw null;
    L85:
        h12.Q("eqBandsContainer");
        throw null;
    L87:
        h12.Q("resetButton");
        throw null;
    L90:
        if (r5 == null) goto L92;
        r5.setVisibility(8);
    L92:
        Button r39 = r4.q0;
        if (r39 == null) goto L106;
        r39.setVisibility(8);
        LinearLayout r40 = r4.o0;
        if (r40 == null) goto L104;
        r40.setVisibility(8);
        Space r41 = r4.r0;
        if (r41 == null) goto L102;
        r41.setVisibility(8);
        if (r2 == null) goto L110;
        r2.setVisibility(0);
        return;
    L110:
        return;
    L102:
        h12.Q("safeSpace");
        throw null;
    L104:
        h12.Q("eqBandsContainer");
        throw null;
    L106:
        h12.Q("resetButton");
        throw null;
    L9:
        r5 = null;
        goto L10
    L5:
        r2 = null;
        goto L6
    }

    public static final void i0(EqualizerFragment r8) {
        wo0 r0 = r8.n0;
        if (r0 == null) goto L18;
        v11 r1 = (v11) r0.n;
        Switch r2 = r8.p0;
        if (r2 == null) goto L21;
        App.b().getClass();
        int r6 = 0;
        r2.setChecked(App.c().getBoolean("equalizer_enabled", false));
        Switch r3 = r8.p0;
        if (r3 == null) goto L19;
        r8.l0(r3.isChecked());
        short r4 = r1.b();
        short[] r5 = r1.d();
        if (r5 != null) goto L12;
        r5 = new short[]{-1500, 1500};
    L12:
        int r7 = r5[0] / 100;
        short[] r9 = ud3.q(r4);
    L13:
        if (r6 >= r4) goto L26;
        int r10 = r9[r6] / 100;
        r1.v((short) r6, (short) (r10 * 100));
        SeekBar r11 = (SeekBar) q40.y0(r8.s0, r6);
        if (r11 == null) goto L17;
        r11.setProgress(r10 - r7);
    L17:
        r6 = r6 + 1;
        goto L13
    L26:
        return;
    L19:
        h12.Q("eqSwitch");
        throw null;
    L21:
        h12.Q("eqSwitch");
        throw null;
    }

    public static String j0(int r2) {
        if (r2 <= 0) goto L7;
        return b11.j(r2, "+", " dB");
    L7:
        return r2 + " dB";
    }

    @Override // defpackage.kc1
    public final void E(Context r1) {
        r1.getClass();
        super.E(r1);
        this.l0 = (MainActivity) X();
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r3, ViewGroup r4, Bundle r5) {
        r3.getClass();
        View r6 = r3.inflate(R.layout.fragment_equalizer, r4, false);
        r6.getClass();
        this.m0 = r6;
        View r7 = r6.findViewById(R.id.equalizer_switch);
        r7.getClass();
        Switch r8 = (Switch) r7;
        this.p0 = r8;
        App.b().getClass();
        r8.setChecked(App.c().getBoolean("equalizer_enabled", false));
        Switch r9 = this.p0;
        if (r9 == null) goto L13;
        r9.jumpDrawablesToCurrentState();
        View r10 = this.m0;
        if (r10 == null) goto L11;
        View r11 = r10.findViewById(R.id.equalizer_toolbar);
        r11.getClass();
        ((MaterialToolbar) r11).setNavigationOnClickListener(new x11(this, 1));
        View r2 = this.m0;
        if (r2 == null) goto L9;
        return r2;
    L9:
        h12.Q("root");
        throw null;
    L11:
        h12.Q("root");
        throw null;
    L13:
        h12.Q("eqSwitch");
        throw null;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Intent r1 = new Intent(Z(), MediaService.class);
        r1.setAction("com.eddyizm.tempus.service.BIND_EQUALIZER");
        X().bindService(r1, this.v0, 1);
        if (this.t0 == true) goto L13;
        Context r2 = Z();
        IntentFilter r3 = new IntentFilter("com.eddyizm.tempus.service.EQUALIZER_UPDATED");
        int r4 = Build.VERSION.SDK_INT;
        v9 r5 = this.u0;
        if (r4 < 33) goto L8;
        r50.j(r2, r5, r3, 4);
    L11:
        this.t0 = true;
        return;
    L8:
        if (r4 < 26) goto L10;
        r50.i(r2, r5, r3, 4);
        goto L11
    L10:
        r2.registerReceiver(r5, r3, ud3.d0(r2), null);
        goto L11
    }

    @Override // defpackage.kc1
    public final void S() {
        this.R = true;
        X().unbindService(this.v0);
        this.n0 = null;
        if (this.t0 == true) goto L13;
    L6:
        MainActivity r4 = this.l0;
        if (r4 == null) goto L10;
        r4.I(true);
        return;
    L10:
        h12.Q("activity");
        throw null;
    L13:
        Z().unregisterReceiver(this.u0);     // Catch: Exception -> L12
    L5:
        this.t0 = false;
        goto L6
    }

    @Override // defpackage.kc1
    public final void T(View r1, Bundle r2) {
        r1.getClass();
        View r3 = r1.findViewById(R.id.eq_bands_container);
        r3.getClass();
        this.o0 = (LinearLayout) r3;
        View r4 = r1.findViewById(R.id.equalizer_reset_button);
        r4.getClass();
        this.q0 = (Button) r4;
        View r5 = r1.findViewById(R.id.equalizer_bottom_space);
        r5.getClass();
        this.r0 = (Space) r5;
    }

    public final void k0() {
        wo0 r5 = this.n0;
        if (r5 != null) goto L5;
        return;
    L5:
        v11 r6 = (v11) r5.n;
        int r0 = r6.b();
        short[] r1 = new short[r0];
        int r3 = 0;
    L6:
        if (r3 >= r0) goto L12;
        Short r4 = r6.z((short) r3);
        if (r4 == null) goto L10;
        short r7 = r4.shortValue();
    L11:
        r1[r3] = r7;
        r3 = r3 + 1;
        goto L6
    L10:
        r7 = 0;
        goto L11
    L12:
        ud3.k0(r1);
    }

    public final void l0(boolean r4) {
        Button r0 = this.q0;
        if (r0 == null) goto L8;
        r0.setEnabled(r4);
        ArrayList r3 = this.s0;
        int r1 = r3.size();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        Object r5 = r3.get(r2);
        r2 = r2 + 1;
        ((SeekBar) r5).setEnabled(r4);
        goto L5
    L7:
        return;
    L8:
        h12.Q("resetButton");
        throw null;
    }
}
