package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jz0 extends ip3 {
    public EditText J0;
    public CharSequence K0;
    public final g5 L0;
    public long M0;

    public jz0() {
        this.L0 = new g5(10, this);
        this.M0 = -1;
    }

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void F(Bundle r2) {
        super.F(r2);
        if (r2 != null) goto L6;
        this.K0 = ((EditTextPreference) n0()).h0;
        return;
    L6:
        this.K0 = r2.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void Q(Bundle r2) {
        super.Q(r2);
        r2.putCharSequence("EditTextPreferenceDialogFragment.text", this.K0);
    }

    @Override // defpackage.ip3
    public final void o0(View r2) {
        super.o0(r2);
        EditText r3 = (EditText) r2.findViewById(R.id.edit);
        this.J0 = r3;
        if (r3 == null) goto L8;
        r3.requestFocus();
        this.J0.setText(this.K0);
        EditText r4 = this.J0;
        r4.setSelection(r4.getText().length());
        if (((EditTextPreference) n0()).i0 == null) goto L10;
        ((EditTextPreference) n0()).i0.i(this.J0);
        return;
    L10:
        return;
    L8:
        kf2.o("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // defpackage.ip3
    public final void p0(boolean r2) {
        if (r2 == false) goto L7;
        String r3 = this.J0.getText().toString();
        EditTextPreference r1 = (EditTextPreference) n0();
        if (r1.a(r3) == false) goto L8;
        r1.E(r3);
        return;
    L8:
        return;
    }

    public final void r0() {
        long r0 = this.M0;
        if (r0 != (-1)) goto L5;
        return;
    L5:
        if ((r0 + 1000) <= SystemClock.currentThreadTimeMillis()) goto L20;
        EditText r1 = this.J0;
        if (r1 != null) goto L9;
    L17:
        this.M0 = -1;
        return;
    L9:
        if (r1.isFocused() == false) goto L17;
        if (((InputMethodManager) this.J0.getContext().getSystemService("input_method")).showSoftInput(this.J0, 0) == false) goto L15;
        this.M0 = -1;
        return;
    L15:
        EditText r2 = this.J0;
        g5 r3 = this.L0;
        r2.removeCallbacks(r3);
        this.J0.postDelayed(r3, 50);
        return;
    }
}
