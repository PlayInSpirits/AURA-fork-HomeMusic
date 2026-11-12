package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h11 {
    public final TextInputLayout a;
    public final g11 b;
    public final Context c;
    public final CheckableImageButton d;

    public h11(g11 g11Var) {
        this.a = g11Var.n;
        this.b = g11Var;
        this.c = g11Var.getContext();
        this.d = g11Var.t;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public g3 h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof ix0;
    }

    public boolean k() {
        return false;
    }

    public void l(EditText editText) {
    }

    public void m(v3 v3Var) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z) {
    }

    public final void p() {
        this.b.e(false);
    }

    public void q() {
    }

    public void r() {
    }
}
