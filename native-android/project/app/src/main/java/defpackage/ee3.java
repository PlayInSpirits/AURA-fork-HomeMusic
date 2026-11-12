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

    public ee3(g11 r2, int r3) {
        super(r2);
        this.e = R.drawable.design_password_eye;
        this.g = new p6(28, this);
        if (r3 == 0) goto L6;
        this.e = r3;
        return;
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
        EditText r1 = this.f;
        if (r1 != null) goto L5;
    L7:
        boolean r2 = false;
    L9:
        return !r2;
    L5:
        if ((r1.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L7;
        r2 = true;
        goto L9
    }

    @Override // defpackage.h11
    public final void l(EditText r1) {
        this.f = r1;
        p();
    }

    @Override // defpackage.h11
    public final void q() {
        EditText r0 = this.f;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getInputType() != 16) goto L7;
    L12:
        this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        return;
    L7:
        if (r0.getInputType() == 128) goto L12;
        if (r0.getInputType() == 144) goto L12;
        if (r0.getInputType() == 224) goto L12;
    }

    @Override // defpackage.h11
    public final void r() {
        EditText r1 = this.f;
        if (r1 == null) goto L6;
        r1.setTransformationMethod(PasswordTransformationMethod.getInstance());
        return;
    }
}
