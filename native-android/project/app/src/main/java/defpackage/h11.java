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

    public h11(g11 r2) {
        this.a = r2.n;
        this.b = r2;
        this.c = r2.getContext();
        this.d = r2.t;
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

    public boolean i(int r1) {
        return true;
    }

    public boolean j() {
        return this instanceof ix0;
    }

    public boolean k() {
        return false;
    }

    public void l(EditText r1) {
    }

    public void m(v3 r1) {
    }

    public void n(AccessibilityEvent r1) {
    }

    public void o(boolean r1) {
    }

    public final void p() {
        this.b.e(false);
    }

    public void q() {
    }

    public void r() {
    }
}
