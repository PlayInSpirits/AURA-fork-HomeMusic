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
    public boolean p = true;

    public l01(EditText editText) {
        this.n = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            tz0 tz0VarA = tz0.a();
            if (editableText == null) {
                length = 0;
            } else {
                tz0VarA.getClass();
                length = editableText.length();
            }
            tz0VarA.f(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.n;
        if (!editText.isInEditMode() && this.p && tz0.c() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iB = tz0.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    tz0.a().f(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            tz0 tz0VarA = tz0.a();
            if (this.o == null) {
                this.o = new k01(editText);
            }
            tz0VarA.g(this.o);
        }
    }
}
