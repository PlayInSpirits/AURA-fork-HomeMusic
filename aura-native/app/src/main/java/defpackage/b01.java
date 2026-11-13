package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class b01 extends rz0 implements Runnable {
    public final WeakReference n;
    public final WeakReference o;

    public b01(TextView textView, c01 c01Var) {
        this.n = new WeakReference(textView);
        this.o = new WeakReference(c01Var);
    }

    @Override // defpackage.rz0
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.n.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.n.get();
        InputFilter inputFilter = (InputFilter) this.o.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    tz0 a = tz0.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a.getClass();
                        length = text.length();
                    }
                    CharSequence f = a.f(0, length, 0, text);
                    if (text == f) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(f);
                    int selectionEnd = Selection.getSelectionEnd(f);
                    textView.setText(f);
                    if (f instanceof Spannable) {
                        Spannable spannable = (Spannable) f;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
