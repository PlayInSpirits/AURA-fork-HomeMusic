package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eo1 implements TextWatcher {
    public final /* synthetic */ int n;
    public final /* synthetic */ fo1 o;

    public /* synthetic */ eo1(fo1 fo1Var, int i) {
        this.n = i;
        this.o = fo1Var;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.n;
        fo1 fo1Var = this.o;
        switch (i) {
            case 0:
                fo1Var.x();
                fo1Var.e();
                break;
            case 1:
                fo1Var.e();
                if (((String) fo1Var.h) != null && !h12.c(qm4.K0(String.valueOf(editable)).toString(), (String) fo1Var.h)) {
                    fo1Var.h = null;
                    co1 co1Var = (co1) fo1Var.d;
                    co1 co1Var2 = co1.q;
                    if (co1Var == co1Var2) {
                        fo1Var.s(co1Var2);
                    }
                    break;
                }
                break;
            default:
                fo1Var.e();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.n;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.n;
    }
}
