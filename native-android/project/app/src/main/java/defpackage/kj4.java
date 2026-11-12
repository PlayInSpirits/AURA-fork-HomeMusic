package defpackage;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kj4 implements TextWatcher, SpanWatcher {
    public final Object n;
    public final AtomicInteger o;

    public kj4(Object r3) {
        this.o = new AtomicInteger(0);
        this.n = r3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r1) {
        ((TextWatcher) this.n).afterTextChanged(r1);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        ((TextWatcher) this.n).beforeTextChanged(r1, r2, r3, r4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable r2, Object r3, int r4, int r5) {
        if (this.o.get() > 0) goto L5;
    L7:
        ((SpanWatcher) this.n).onSpanAdded(r2, r3, r4, r5);
        return;
    L5:
        if ((r3 instanceof l05) == false) goto L7;
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable r9, Object r10, int r11, int r12, int r13, int r14) {
        if (this.o.get() <= 0) goto L8;
        if ((r10 instanceof l05) == false) goto L8;
        return;
    L8:
        if (Build.VERSION.SDK_INT < 28) goto L10;
    L14:
        int r4 = r11;
        int r6 = r13;
    L15:
        ((SpanWatcher) this.n).onSpanChanged(r9, r10, r4, r12, r6, r14);
        return;
    L10:
        if (r11 <= r12) goto L12;
        r11 = 0;
    L12:
        if (r13 <= r14) goto L14;
        r4 = r11;
        r6 = 0;
        goto L15
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable r2, Object r3, int r4, int r5) {
        if (this.o.get() > 0) goto L5;
    L7:
        ((SpanWatcher) this.n).onSpanRemoved(r2, r3, r4, r5);
        return;
    L5:
        if ((r3 instanceof l05) == false) goto L7;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        ((TextWatcher) this.n).onTextChanged(r1, r2, r3, r4);
    }
}
