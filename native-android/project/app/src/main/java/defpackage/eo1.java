package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eo1 implements TextWatcher {
    public final /* synthetic */ int n;
    public final /* synthetic */ fo1 o;

    public /* synthetic */ eo1(fo1 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    private final void a(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void b(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void c(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void d(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void e(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void f(int r1, int r2, int r3, CharSequence r4) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r2) {
        int r0 = this.n;
        fo1 r1 = this.o;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r1.e();
        return;
    L6:
        r1.e();
        if (((String) r1.h) != null) goto L9;
        return;
    L9:
        if (h12.c(qm4.K0(String.valueOf(r2)).toString(), (String) r1.h) == true) goto L17;
        r1.h = null;
        co1 r3 = (co1) r1.d;
        co1 r4 = co1.q;
        if (r3 != r4) goto L18;
        r1.s(r4);
        return;
    L18:
        return;
    L17:
        return;
    L14:
        r1.x();
        r1.e();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        int r0 = this.n;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        int r0 = this.n;
    }
}
