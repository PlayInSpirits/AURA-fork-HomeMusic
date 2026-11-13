package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ig {
    public final TextView a;
    public final zh0 b;

    public ig(TextView textView) {
        this.a = textView;
        this.b = new zh0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((hw) this.b.o).k(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, st3.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((hw) this.b.o).J(z);
    }

    public final void d(boolean z) {
        ((hw) this.b.o).K(z);
    }
}
