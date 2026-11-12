package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b01 extends rz0 implements Runnable {
    public final WeakReference n;
    public final WeakReference o;

    public b01(TextView r2, c01 r3) {
        this.n = new WeakReference(r2);
        this.o = new WeakReference(r3);
    }

    @Override // defpackage.rz0
    public final void b() {
        TextView r0 = (TextView) this.n.get();
        if (r0 == null) goto L10;
        Handler r1 = r0.getHandler();
        if (r1 == null) goto L9;
        r1.post(this);
        return;
    L9:
        return;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView r0 = (TextView) this.n.get();
        InputFilter r5 = (InputFilter) this.o.get();
        if (r5 == null) goto L37;
        if (r0 == null) goto L43;
        InputFilter[] r1 = r0.getFilters();
        if (r1 == null) goto L44;
        int r3 = 0;
    L11:
        if (r3 >= r1.length) goto L46;
        if (r1[r3] == r5) goto L15;
        r3 = r3 + 1;
        goto L11
    L15:
        if (r0.isAttachedToWindow() == false) goto L40;
        CharSequence r6 = r0.getText();
        tz0 r2 = tz0.a();
        if (r6 != null) goto L19;
        int r4 = 0;
    L20:
        CharSequence r7 = r2.f(0, r4, 0, r6);
        if (r6 == r7) goto L45;
        int r8 = Selection.getSelectionStart(r7);
        int r9 = Selection.getSelectionEnd(r7);
        r0.setText(r7);
        if ((r7 instanceof Spannable) == false) goto L41;
        Spannable r10 = (Spannable) r7;
        if (r8 < 0) goto L30;
        if (r9 < 0) goto L30;
        Selection.setSelection(r10, r8, r9);
        return;
    L30:
        if (r8 < 0) goto L33;
        Selection.setSelection(r10, r8);
        return;
    L33:
        if (r9 < 0) goto L42;
        Selection.setSelection(r10, r9);
        return;
    L42:
        return;
    L41:
        return;
    L45:
        return;
    L19:
        r2.getClass();
        r4 = r6.length();
        goto L20
    L40:
        return;
    L46:
        return;
    L44:
        return;
    L43:
        return;
    }
}
