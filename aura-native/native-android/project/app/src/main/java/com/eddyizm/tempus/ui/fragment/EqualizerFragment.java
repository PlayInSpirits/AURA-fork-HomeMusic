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
    public boolean t0;
    public final ArrayList s0 = new ArrayList();
    public final v9 u0 = new v9(5, this);
    public final y11 v0 = new y11(0, this);

    public static final void h0(EqualizerFragment equalizerFragment) {
        String str;
        EqualizerFragment equalizerFragment2 = equalizerFragment;
        wo0 wo0Var = equalizerFragment2.n0;
        View view = equalizerFragment2.T;
        Throwable th = null;
        LinearLayout linearLayout = view != null ? (LinearLayout) view.findViewById(R.id.equalizer_managed_externally_container) : null;
        View view2 = equalizerFragment2.T;
        View viewFindViewById = view2 != null ? view2.findViewById(R.id.equalizer_switch_row) : null;
        int i = 0;
        if (wo0Var == null || ((v11) wo0Var.n).b() == 0) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            Button button = equalizerFragment2.q0;
            if (button == null) {
                h12.Q("resetButton");
                throw null;
            }
            button.setVisibility(8);
            LinearLayout linearLayout2 = equalizerFragment2.o0;
            if (linearLayout2 == null) {
                h12.Q("eqBandsContainer");
                throw null;
            }
            linearLayout2.setVisibility(8);
            Space space = equalizerFragment2.r0;
            if (space == null) {
                h12.Q("safeSpace");
                throw null;
            }
            space.setVisibility(8);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            }
            return;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        Button button2 = equalizerFragment2.q0;
        if (button2 == null) {
            h12.Q("resetButton");
            throw null;
        }
        button2.setVisibility(0);
        LinearLayout linearLayout3 = equalizerFragment2.o0;
        if (linearLayout3 == null) {
            h12.Q("eqBandsContainer");
            throw null;
        }
        linearLayout3.setVisibility(0);
        Space space2 = equalizerFragment2.r0;
        if (space2 == null) {
            h12.Q("safeSpace");
            throw null;
        }
        space2.setVisibility(0);
        Switch r1 = equalizerFragment2.p0;
        if (r1 == null) {
            h12.Q("eqSwitch");
            throw null;
        }
        r1.setOnCheckedChangeListener(null);
        Switch r2 = equalizerFragment2.p0;
        if (r2 == null) {
            h12.Q("eqSwitch");
            throw null;
        }
        equalizerFragment2.l0(r2.isChecked());
        Switch r3 = equalizerFragment2.p0;
        if (r3 == null) {
            h12.Q("eqSwitch");
            throw null;
        }
        r3.setOnCheckedChangeListener(new w11(i, wo0Var, equalizerFragment2));
        ArrayList arrayList = equalizerFragment2.s0;
        wo0 wo0Var2 = equalizerFragment2.n0;
        if (wo0Var2 != null) {
            v11 v11Var = (v11) wo0Var2.n;
            LinearLayout linearLayout4 = equalizerFragment2.o0;
            if (linearLayout4 == null) {
                h12.Q("eqBandsContainer");
                throw null;
            }
            linearLayout4.removeAllViews();
            arrayList.clear();
            short sB = v11Var.b();
            short[] sArrD = v11Var.d();
            if (sArrD == null) {
                sArrD = new short[]{-1500, 1500};
            }
            int i2 = sArrD[0] / 100;
            int i3 = sArrD[1] / 100;
            short[] sArrQ = ud3.q(sB);
            int i4 = 0;
            while (i4 < sB) {
                short s = (short) i4;
                Integer numN = v11Var.n(s);
                int iIntValue = numN != null ? numN.intValue() : i;
                LinearLayout linearLayout5 = new LinearLayout(equalizerFragment2.Z());
                linearLayout5.setOrientation(i);
                int i5 = i2;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                Context context = linearLayout5.getContext();
                context.getClass();
                layoutParams.topMargin = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
                Context context2 = linearLayout5.getContext();
                context2.getClass();
                layoutParams.bottomMargin = (int) (context2.getResources().getDisplayMetrics().density * 16.0f);
                linearLayout5.setLayoutParams(layoutParams);
                linearLayout5.setPadding(0, 8, 0, 8);
                wo0 wo0Var3 = wo0Var2;
                TextView textView = new TextView(equalizerFragment2.Z(), null, 0, R.style.LabelSmall);
                if (iIntValue < 1000) {
                    str = iIntValue + " Hz";
                } else if (iIntValue % 1000 == 0) {
                    str = (iIntValue / 1000) + " kHz";
                } else {
                    str = String.format("%.1f kHz", Arrays.copyOf(new Object[]{Float.valueOf(iIntValue / 1000.0f)}, 1));
                }
                textView.setText(str);
                textView.setGravity(8388611);
                textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
                linearLayout5.addView(textView);
                Short shValueOf = (i4 < 0 || i4 >= sArrQ.length) ? null : Short.valueOf(sArrQ[i4]);
                int iShortValue = ((shValueOf == null && (shValueOf = v11Var.z(s)) == null) ? (short) 0 : shValueOf.shortValue()) / 100;
                int i6 = i4;
                TextView textView2 = new TextView(equalizerFragment.Z(), null, 0, R.style.LabelSmall);
                textView2.setText(j0(iShortValue));
                textView2.setPadding(12, 0, 0, 0);
                textView2.setGravity(8388613);
                textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
                SeekBar seekBar = new SeekBar(equalizerFragment.Z());
                seekBar.setMax(i3 - i5);
                seekBar.setProgress(iShortValue - i5);
                seekBar.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 6.0f));
                short[] sArr = sArrQ;
                equalizerFragment2 = equalizerFragment;
                wo0Var2 = wo0Var3;
                i2 = i5;
                seekBar.setOnSeekBarChangeListener(new z11(i2, wo0Var2, s, equalizerFragment2, textView2));
                arrayList.add(seekBar);
                linearLayout5.addView(seekBar);
                linearLayout5.addView(textView2);
                LinearLayout linearLayout6 = equalizerFragment2.o0;
                if (linearLayout6 == null) {
                    h12.Q("eqBandsContainer");
                    throw null;
                }
                linearLayout6.addView(linearLayout5);
                i4 = i6 + 1;
                sArrQ = sArr;
                th = null;
                i = 0;
            }
        }
        Throwable th2 = th;
        Button button3 = equalizerFragment2.q0;
        if (button3 != null) {
            button3.setOnClickListener(new x11(equalizerFragment2, 0));
        } else {
            h12.Q("resetButton");
            throw th2;
        }
    }

    public static final void i0(EqualizerFragment equalizerFragment) {
        wo0 wo0Var = equalizerFragment.n0;
        if (wo0Var == null) {
            return;
        }
        v11 v11Var = (v11) wo0Var.n;
        Switch r1 = equalizerFragment.p0;
        if (r1 == null) {
            h12.Q("eqSwitch");
            throw null;
        }
        App.b().getClass();
        r1.setChecked(App.c().getBoolean("equalizer_enabled", false));
        Switch r2 = equalizerFragment.p0;
        if (r2 == null) {
            h12.Q("eqSwitch");
            throw null;
        }
        equalizerFragment.l0(r2.isChecked());
        short sB = v11Var.b();
        short[] sArrD = v11Var.d();
        if (sArrD == null) {
            sArrD = new short[]{-1500, 1500};
        }
        int i = sArrD[0] / 100;
        short[] sArrQ = ud3.q(sB);
        for (int i2 = 0; i2 < sB; i2++) {
            int i3 = sArrQ[i2] / 100;
            v11Var.v((short) i2, (short) (i3 * 100));
            SeekBar seekBar = (SeekBar) q40.y0(equalizerFragment.s0, i2);
            if (seekBar != null) {
                seekBar.setProgress(i3 - i);
            }
        }
    }

    public static String j0(int i) {
        if (i > 0) {
            return b11.j(i, "+", " dB");
        }
        return i + " dB";
    }

    @Override // defpackage.kc1
    public final void E(Context context) {
        context.getClass();
        super.E(context);
        this.l0 = (MainActivity) X();
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_equalizer, viewGroup, false);
        viewInflate.getClass();
        this.m0 = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.equalizer_switch);
        viewFindViewById.getClass();
        Switch r3 = (Switch) viewFindViewById;
        this.p0 = r3;
        App.b().getClass();
        r3.setChecked(App.c().getBoolean("equalizer_enabled", false));
        Switch r4 = this.p0;
        if (r4 == null) {
            h12.Q("eqSwitch");
            throw null;
        }
        r4.jumpDrawablesToCurrentState();
        View view = this.m0;
        if (view == null) {
            h12.Q("root");
            throw null;
        }
        View viewFindViewById2 = view.findViewById(R.id.equalizer_toolbar);
        viewFindViewById2.getClass();
        ((MaterialToolbar) viewFindViewById2).setNavigationOnClickListener(new x11(this, 1));
        View view2 = this.m0;
        if (view2 != null) {
            return view2;
        }
        h12.Q("root");
        throw null;
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Intent intent = new Intent(Z(), (Class<?>) MediaService.class);
        intent.setAction("com.eddyizm.tempus.service.BIND_EQUALIZER");
        X().bindService(intent, this.v0, 1);
        if (this.t0) {
            return;
        }
        Context contextZ = Z();
        IntentFilter intentFilter = new IntentFilter("com.eddyizm.tempus.service.EQUALIZER_UPDATED");
        int i = Build.VERSION.SDK_INT;
        v9 v9Var = this.u0;
        if (i >= 33) {
            r50.j(contextZ, v9Var, intentFilter, 4);
        } else if (i >= 26) {
            r50.i(contextZ, v9Var, intentFilter, 4);
        } else {
            contextZ.registerReceiver(v9Var, intentFilter, ud3.d0(contextZ), null);
        }
        this.t0 = true;
    }

    @Override // defpackage.kc1
    public final void S() {
        this.R = true;
        X().unbindService(this.v0);
        this.n0 = null;
        if (this.t0) {
            try {
                Z().unregisterReceiver(this.u0);
            } catch (Exception unused) {
            }
            this.t0 = false;
        }
        MainActivity mainActivity = this.l0;
        if (mainActivity != null) {
            mainActivity.I(true);
        } else {
            h12.Q("activity");
            throw null;
        }
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.eq_bands_container);
        viewFindViewById.getClass();
        this.o0 = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.equalizer_reset_button);
        viewFindViewById2.getClass();
        this.q0 = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.equalizer_bottom_space);
        viewFindViewById3.getClass();
        this.r0 = (Space) viewFindViewById3;
    }

    public final void k0() {
        wo0 wo0Var = this.n0;
        if (wo0Var == null) {
            return;
        }
        v11 v11Var = (v11) wo0Var.n;
        int iB = v11Var.b();
        short[] sArr = new short[iB];
        for (int i = 0; i < iB; i++) {
            Short shZ = v11Var.z((short) i);
            sArr[i] = shZ != null ? shZ.shortValue() : (short) 0;
        }
        ud3.k0(sArr);
    }

    public final void l0(boolean z) {
        Button button = this.q0;
        if (button == null) {
            h12.Q("resetButton");
            throw null;
        }
        button.setEnabled(z);
        ArrayList arrayList = this.s0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((SeekBar) obj).setEnabled(z);
        }
    }
}
