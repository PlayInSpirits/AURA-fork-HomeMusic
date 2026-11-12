package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l01 implements TextWatcher {
    public final EditText n;
    public k01 o;
    public boolean p;

    public l01(EditText r1) {
        this.n = r1;
        this.p = true;
    }

    public static void a(EditText r4, int r5) {
        if (r5 != 1) goto L22;
        if (r4 != null) goto L6;
        return;
    L6:
        if (r4.isAttachedToWindow() == false) goto L24;
        Editable r6 = r4.getEditableText();
        int r7 = Selection.getSelectionStart(r6);
        int r0 = Selection.getSelectionEnd(r6);
        tz0 r1 = tz0.a();
        if (r6 != null) goto L10;
        int r3 = 0;
    L11:
        r1.f(0, r3, 0, r6);
        if (r7 < 0) goto L16;
        if (r0 < 0) goto L16;
        Selection.setSelection(r6, r7, r0);
        return;
    L16:
        if (r7 < 0) goto L19;
        Selection.setSelection(r6, r7);
        return;
    L19:
        if (r0 < 0) goto L25;
        Selection.setSelection(r6, r0);
        return;
    L25:
        return;
    L10:
        r1.getClass();
        r3 = r6.length();
        goto L11
    L24:
        return;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r1) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r3, int r4, int r5, int r6) {
        EditText r0 = this.n;
        if (r0.isInEditMode() == false) goto L5;
        return;
    L5:
        if (this.p == true) goto L7;
        return;
    L7:
        if (tz0.c() == false) goto L30;
        if (r5 <= r6) goto L11;
        return;
    L11:
        if ((r3 instanceof Spannable) == false) goto L29;
        int r7 = tz0.a().b();
        if (r7 != 0) goto L15;
    L21:
        tz0 r8 = tz0.a();
        if (this.o != null) goto L24;
        this.o = new k01(r0);
    L24:
        r8.g(this.o);
        return;
    L15:
        if (r7 != 1) goto L17;
        tz0 r2 = tz0.a();
        int r9 = r6 + r4;
        r2.f(r4, r9, 0, (Spannable) r3);
        return;
    L17:
        if (r7 == 3) goto L21;
        return;
    L29:
        return;
    }
}
