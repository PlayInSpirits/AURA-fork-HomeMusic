package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import app.homemusic.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ix0 extends h11 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final p6 i;
    public final p30 j;
    public final cn k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public ix0(g11 g11Var) {
        super(g11Var);
        this.i = new p6(13, this);
        this.j = new p30(2, this);
        this.k = new cn(8, this);
        this.o = Long.MAX_VALUE;
        this.f = g12.N(g11Var.getContext(), R.attr.motionDurationShort3, 67);
        this.e = g12.N(g11Var.getContext(), R.attr.motionDurationShort3, 50);
        this.g = g12.O(g11Var.getContext(), R.attr.motionEasingLinearInterpolator, yd.a);
    }

    @Override // defpackage.h11
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new a0(26, this));
    }

    @Override // defpackage.h11
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.h11
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.h11
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.h11
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.h11
    public final g3 h() {
        return this.k;
    }

    @Override // defpackage.h11
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.h11
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.h11
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            tb4.e("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new s7(4, this));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: hx0
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                ix0 ix0Var = this.a;
                ix0Var.m = true;
                ix0Var.o = System.currentTimeMillis();
                ix0Var.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = j65.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.h11
    public final void m(v3 v3Var) {
        if (this.h.getInputType() == 0) {
            v3Var.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? v3Var.a.isShowingHintText() : v3Var.e(4)) {
            v3Var.l(null);
        }
    }

    @Override // defpackage.h11
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            boolean z = accessibilityEvent.getEventType() == 32768 && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.m = true;
                this.o = System.currentTimeMillis();
            }
        }
    }

    @Override // defpackage.h11
    public final void q() {
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new cn0(i, this));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new cn0(i, this));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new l4(4, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.h11
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
