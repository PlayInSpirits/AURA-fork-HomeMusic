package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ig {
    public final TextView a;
    public final zh0 b;

    public ig(TextView r2) {
        this.a = r2;
        this.b = new zh0(r2);
    }

    public final InputFilter[] a(InputFilter[] r1) {
        return ((hw) this.b.o).k(r1);
    }

    public final void b(AttributeSet r4, int r5) {
        TypedArray r6 = this.a.getContext().obtainStyledAttributes(r4, st3.i, r5, 0);
        boolean r1 = true;
        if (r6.hasValue(14) == false) goto L9;
        r1 = r6.getBoolean(14, true);     // Catch: Throwable -> L7
    L9:
        r6.recycle();
        d(r1);
        return;
    L7:
        th = move-exception;
        r6.recycle();
        throw th;
    }

    public final void c(boolean r1) {
        ((hw) this.b.o).J(r1);
    }

    public final void d(boolean r1) {
        ((hw) this.b.o).K(r1);
    }
}
