package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import app.homemusic.R;
import defpackage.bt3;
import defpackage.i84;
import defpackage.k84;
import defpackage.kq2;
import defpackage.rp3;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public boolean f0;
    public SeekBar g0;
    public TextView h0;
    public final boolean i0;
    public final boolean j0;
    public final boolean k0;
    public final kq2 l0;
    public final i84 m0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, app.homemusic.R.attr.seekBarPreferenceStyle);
        this.l0 = new kq2(1, this);
        this.m0 = new i84(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt3.k, app.homemusic.R.attr.seekBarPreferenceStyle, 0);
        this.c0 = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.c0;
        i = i < i2 ? i2 : i;
        if (i != this.d0) {
            this.d0 = i;
            h();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.e0) {
            this.e0 = Math.min(this.d0 - this.c0, Math.abs(i3));
            h();
        }
        this.i0 = obtainStyledAttributes.getBoolean(2, true);
        this.j0 = obtainStyledAttributes.getBoolean(5, false);
        this.k0 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void E(int i, boolean z) {
        int i2 = this.c0;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.d0;
        if (i > i3) {
            i = i3;
        }
        if (i != this.b0) {
            this.b0 = i;
            TextView textView = this.h0;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (C()) {
                int i4 = ~i;
                if (C()) {
                    i4 = this.o.d().getInt(this.y, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor c = this.o.c();
                    c.putInt(this.y, i);
                    if (!this.o.a) {
                        c.apply();
                    }
                }
            }
            if (z) {
                h();
            }
        }
    }

    public final void F(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.c0;
        if (progress != this.b0) {
            if (a(Integer.valueOf(progress))) {
                E(progress, false);
                return;
            }
            seekBar.setProgress(this.b0 - this.c0);
            int i = this.b0;
            TextView textView = this.h0;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void l(rp3 rp3Var) {
        super.l(rp3Var);
        rp3Var.a.setOnKeyListener(this.m0);
        this.g0 = (SeekBar) rp3Var.s(app.homemusic.R.id.seekbar);
        TextView textView = (TextView) rp3Var.s(app.homemusic.R.id.seekbar_value);
        this.h0 = textView;
        if (this.j0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.h0 = null;
        }
        SeekBar seekBar = this.g0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.l0);
        this.g0.setMax(this.d0 - this.c0);
        int i = this.e0;
        SeekBar seekBar2 = this.g0;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.e0 = seekBar2.getKeyProgressIncrement();
        }
        this.g0.setProgress(this.b0 - this.c0);
        int i2 = this.b0;
        TextView textView2 = this.h0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.g0.setEnabled(g());
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(k84.class)) {
            super.p(parcelable);
            return;
        }
        k84 k84Var = (k84) parcelable;
        super.p(k84Var.getSuperState());
        this.b0 = k84Var.n;
        this.c0 = k84Var.o;
        this.d0 = k84Var.p;
        h();
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.F) {
            return absSavedState;
        }
        k84 k84Var = new k84();
        k84Var.n = this.b0;
        k84Var.o = this.c0;
        k84Var.p = this.d0;
        return k84Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (C()) {
            intValue = this.o.d().getInt(this.y, intValue);
        }
        E(intValue, true);
    }
}
