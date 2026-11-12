package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
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

    public ix0(g11 r4) {
        super(r4);
        this.i = new p6(13, this);
        this.j = new p30(2, this);
        this.k = new cn(8, this);
        this.o = Long.MAX_VALUE;
        this.f = g12.N(r4.getContext(), R.attr.motionDurationShort3, 67);
        this.e = g12.N(r4.getContext(), R.attr.motionDurationShort3, 50);
        this.g = g12.O(r4.getContext(), R.attr.motionEasingLinearInterpolator, yd.a);
    }

    @Override // defpackage.h11
    public final void a() {
        if (this.p.isTouchExplorationEnabled() == true) goto L5;
    L9:
        this.h.post(new a0(26, this));
        return;
    L5:
        if (this.h.getInputType() == 0) goto L9;
        if (this.d.hasFocus() == true) goto L9;
        this.h.dismissDropDown();
        goto L9
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
    public final boolean i(int r1) {
        if (r1 == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // defpackage.h11
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.h11
    public final void l(EditText r4) {
        if ((r4 instanceof AutoCompleteTextView) == false) goto L12;
        AutoCompleteTextView r0 = (AutoCompleteTextView) r4;
        this.h = r0;
        r0.setOnTouchListener(new s7(4, this));
        this.h.setOnDismissListener(new hx0(this));
        this.h.setThreshold(0);
        TextInputLayout r1 = this.a;
        r1.setErrorIconDrawable(null);
        if (r4.getInputType() == 0) goto L8;
    L10:
        r1.setEndIconVisible(true);
        return;
    L8:
        if (this.p.isTouchExplorationEnabled() == false) goto L10;
        WeakHashMap r5 = j65.a;
        this.d.setImportantForAccessibility(2);
        goto L10
    L12:
        tb4.e("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // defpackage.h11
    public final void m(v3 r2) {
        if (this.h.getInputType() != 0) goto L7;
        r2.i(Spinner.class.getName());
    L7:
        if (Build.VERSION.SDK_INT < 26) goto L9;
        boolean r1 = j3.B(r2.a);
    L10:
        if (r1 == false) goto L13;
        r2.l(null);
        return;
    L13:
        return;
    L9:
        r1 = r2.e(4);
        goto L10
    }

    @Override // defpackage.h11
    public final void n(AccessibilityEvent r4) {
        if (this.p.isEnabled() == true) goto L5;
        return;
    L5:
        if (this.h.getInputType() == 0) goto L8;
        return;
    L8:
        if (r4.getEventType() == 32768) goto L10;
    L14:
        boolean r0 = false;
    L16:
        if (r4.getEventType() == 1) goto L18;
        if (r0 == true) goto L18;
        return;
    L18:
        t();
        this.m = true;
        this.o = System.currentTimeMillis();
        return;
    L10:
        if (this.n == false) goto L14;
        if (this.h.isPopupShowing() == true) goto L14;
        r0 = true;
        goto L16
    }

    @Override // defpackage.h11
    public final void q() {
        int r0 = 2;
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator r2 = this.g;
        r1.setInterpolator(r2);
        r1.setDuration(this.f);
        r1.addUpdateListener(new cn0(r0, this));
        this.r = r1;
        ValueAnimator r3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r3.setInterpolator(r2);
        r3.setDuration(this.e);
        r3.addUpdateListener(new cn0(r0, this));
        this.q = r3;
        r3.addListener(new l4(4, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.h11
    public final void r() {
        AutoCompleteTextView r0 = this.h;
        if (r0 == null) goto L6;
        r0.setOnTouchListener(null);
        this.h.setOnDismissListener(null);
        return;
    }

    public final void s(boolean r2) {
        if (this.n == r2) goto L6;
        this.n = r2;
        this.r.cancel();
        this.q.start();
        return;
    }

    public final void t() {
        if (this.h != null) goto L5;
        return;
    L5:
        long r0 = System.currentTimeMillis() - this.o;
        if (r0 >= 0) goto L8;
    L9:
        this.m = false;
    L11:
        if (this.m == true) goto L18;
        s(!this.n);
        boolean r1 = this.n;
        AutoCompleteTextView r2 = this.h;
        if (r1 == false) goto L16;
        r2.requestFocus();
        this.h.showDropDown();
        return;
    L16:
        r2.dismissDropDown();
        return;
    L18:
        this.m = false;
        return;
    L8:
        if (r0 <= 300) goto L11;
        goto L9
    }
}
