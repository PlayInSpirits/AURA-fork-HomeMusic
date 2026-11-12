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
    public final g5 L0 = new g5(10, this);
    public long M0 = -1;

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            this.K0 = ((EditTextPreference) n0()).h0;
        } else {
            this.K0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.ip3, defpackage.pp0, defpackage.kc1
    public final void Q(Bundle bundle) {
        super.Q(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.K0);
    }

    @Override // defpackage.ip3
    public final void o0(View view) {
        super.o0(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.J0 = editText;
        if (editText == null) {
            kf2.o("Dialog view must contain an EditText with id @android:id/edit");
            return;
        }
        editText.requestFocus();
        this.J0.setText(this.K0);
        EditText editText2 = this.J0;
        editText2.setSelection(editText2.getText().length());
        if (((EditTextPreference) n0()).i0 != null) {
            ((EditTextPreference) n0()).i0.i(this.J0);
        }
    }

    @Override // defpackage.ip3
    public final void p0(boolean z) {
        if (z) {
            String string = this.J0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) n0();
            if (editTextPreference.a(string)) {
                editTextPreference.E(string);
            }
        }
    }

    public final void r0() {
        long j = this.M0;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.J0;
        if (editText == null || !editText.isFocused()) {
            this.M0 = -1L;
            return;
        }
        if (((InputMethodManager) this.J0.getContext().getSystemService("input_method")).showSoftInput(this.J0, 0)) {
            this.M0 = -1L;
            return;
        }
        EditText editText2 = this.J0;
        g5 g5Var = this.L0;
        editText2.removeCallbacks(g5Var);
        this.J0.postDelayed(g5Var, 50L);
    }
}
