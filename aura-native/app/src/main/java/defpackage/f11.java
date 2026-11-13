package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f11 {
    public final /* synthetic */ g11 a;

    public f11(g11 g11Var) {
        this.a = g11Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        g11 g11Var = this.a;
        e11 e11Var = g11Var.I;
        if (g11Var.F == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = g11Var.F;
        if (editText != null) {
            editText.removeTextChangedListener(e11Var);
            if (g11Var.F.getOnFocusChangeListener() == g11Var.a().e()) {
                g11Var.F.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        g11Var.F = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(e11Var);
        }
        g11Var.a().l(g11Var.F);
        g11Var.i(g11Var.a());
    }
}
