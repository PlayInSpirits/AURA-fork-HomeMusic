package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ee3 extends h11 {
    public final int e;
    public EditText f;
    public final p6 g;

    public ee3(g11 g11Var, int i) {
        super(g11Var);
        this.e = R.drawable.design_password_eye;
        this.g = new p6(28, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.h11
    public final void b() {
        p();
    }

    @Override // defpackage.h11
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.h11
    public final int d() {
        return this.e;
    }

    @Override // defpackage.h11
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.h11
    public final boolean j() {
        return true;
    }

    @Override // defpackage.h11
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.h11
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.h11
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.h11
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
