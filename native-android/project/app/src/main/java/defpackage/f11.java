package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f11 {
    public final /* synthetic */ g11 a;

    public f11(g11 r1) {
        this.a = r1;
    }

    public final void a(TextInputLayout r4) {
        g11 r3 = this.a;
        e11 r0 = r3.I;
        if (r3.F != r4.getEditText()) goto L5;
        return;
    L5:
        EditText r1 = r3.F;
        if (r1 == null) goto L10;
        r1.removeTextChangedListener(r0);
        if (r3.F.getOnFocusChangeListener() != r3.a().e()) goto L10;
        r3.F.setOnFocusChangeListener(null);
    L10:
        EditText r5 = r4.getEditText();
        r3.F = r5;
        if (r5 == null) goto L13;
        r5.addTextChangedListener(r0);
    L13:
        r3.a().l(r3.F);
        r3.i(r3.a());
    }
}
