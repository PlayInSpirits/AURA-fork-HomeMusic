package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g11 extends LinearLayout {
    public ImageView.ScaleType A;
    public View.OnLongClickListener B;
    public CharSequence C;
    public final mh D;
    public boolean E;
    public EditText F;
    public final AccessibilityManager G;
    public g3 H;
    public final e11 I;
    public final TextInputLayout n;
    public final FrameLayout o;
    public final CheckableImageButton p;
    public ColorStateList q;
    public PorterDuff.Mode r;
    public View.OnLongClickListener s;
    public final CheckableImageButton t;
    public final tu u;
    public int v;
    public final LinkedHashSet w;
    public ColorStateList x;
    public PorterDuff.Mode y;
    public int z;

    public g11(TextInputLayout textInputLayout, jv3 jv3Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.v = 0;
        this.w = new LinkedHashSet();
        this.I = new e11(this);
        f11 f11Var = new f11(this);
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.o = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) this, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (h12.z(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        this.p = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout, false);
        checkableImageButton2.setId(R.id.text_input_end_icon);
        if (h12.z(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        this.t = checkableImageButton2;
        tu tuVar = new tu();
        tuVar.c = new SparseArray();
        tuVar.d = this;
        TypedArray typedArray = (TypedArray) jv3Var.o;
        tuVar.a = typedArray.getResourceId(28, 0);
        tuVar.b = typedArray.getResourceId(52, 0);
        this.u = tuVar;
        mh mhVar = new mh(getContext(), null);
        this.D = mhVar;
        TypedArray typedArray2 = (TypedArray) jv3Var.o;
        if (typedArray2.hasValue(38)) {
            this.q = h12.r(getContext(), jv3Var, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.r = vr1.B(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            h(jv3Var.c(37));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = j65.a;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.x = h12.r(getContext(), jv3Var, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.y = vr1.B(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            f(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButton2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButton2.setContentDescription(text);
            }
            checkableImageButton2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.x = h12.r(getContext(), jv3Var, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.y = vr1.B(typedArray2.getInt(55, -1), null);
            }
            f(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (checkableImageButton2.getContentDescription() != text2) {
                checkableImageButton2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            kf2.n("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.z) {
            this.z = dimensionPixelSize;
            checkableImageButton2.setMinimumWidth(dimensionPixelSize);
            checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeH = au0.h(typedArray2.getInt(31, -1));
            this.A = scaleTypeH;
            checkableImageButton2.setScaleType(scaleTypeH);
            checkableImageButton.setScaleType(scaleTypeH);
        }
        mhVar.setVisibility(8);
        mhVar.setId(R.id.textinput_suffix_text);
        mhVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        mhVar.setAccessibilityLiveRegion(1);
        mhVar.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            mhVar.setTextColor(jv3Var.b(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.C = TextUtils.isEmpty(text3) ? null : text3;
        mhVar.setText(text3);
        m();
        frameLayout.addView(checkableImageButton2);
        addView(mhVar);
        addView(frameLayout);
        addView(checkableImageButton);
        textInputLayout.r0.add(f11Var);
        if (textInputLayout.q != null) {
            f11Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new bc(2, this));
    }

    public final h11 a() {
        h11 vg0Var;
        int i = this.v;
        tu tuVar = this.u;
        SparseArray sparseArray = (SparseArray) tuVar.c;
        h11 h11Var = (h11) sparseArray.get(i);
        if (h11Var != null) {
            return h11Var;
        }
        g11 g11Var = (g11) tuVar.d;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                vg0Var = new vg0(g11Var, i2);
            } else if (i == 1) {
                vg0Var = new ee3(g11Var, tuVar.b);
            } else if (i == 2) {
                vg0Var = new s30(g11Var);
            } else {
                if (i != 3) {
                    kf2.n(f34.f(i, "Invalid end icon mode: "));
                    return null;
                }
                vg0Var = new ix0(g11Var);
            }
        } else {
            vg0Var = new vg0(g11Var, 0);
        }
        sparseArray.append(i, vg0Var);
        return vg0Var;
    }

    public final int b() {
        int marginStart;
        if (c() || d()) {
            CheckableImageButton checkableImageButton = this.t;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = j65.a;
        return this.D.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean c() {
        return this.o.getVisibility() == 0 && this.t.getVisibility() == 0;
    }

    public final boolean d() {
        return this.p.getVisibility() == 0;
    }

    public final void e(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        h11 h11VarA = a();
        boolean zJ = h11VarA.j();
        CheckableImageButton checkableImageButton = this.t;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.q) == h11VarA.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(h11VarA instanceof ix0) || (zIsActivated = checkableImageButton.isActivated()) == ((ix0) h11VarA).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            au0.Q(this.n, checkableImageButton, this.x);
        }
    }

    public final void f(int i) {
        if (this.v == i) {
            return;
        }
        h11 h11VarA = a();
        g3 g3Var = this.H;
        AccessibilityManager accessibilityManager = this.G;
        if (g3Var != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new h3(g3Var));
        }
        this.H = null;
        h11VarA.r();
        this.v = i;
        Iterator it = this.w.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        g(i != 0);
        h11 h11VarA2 = a();
        int iD = this.u.a;
        if (iD == 0) {
            iD = h11VarA2.d();
        }
        Drawable drawableR = iD != 0 ? zz1.r(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.t;
        checkableImageButton.setImageDrawable(drawableR);
        TextInputLayout textInputLayout = this.n;
        if (drawableR != null) {
            au0.b(textInputLayout, checkableImageButton, this.x, this.y);
            au0.Q(textInputLayout, checkableImageButton, this.x);
        }
        int iC = h11VarA2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(h11VarA2.j());
        if (!h11VarA2.i(textInputLayout.getBoxBackgroundMode())) {
            nz2.d(textInputLayout.getBoxBackgroundMode(), i, " is not supported by the end icon mode ", "The current box background mode ");
            return;
        }
        h11VarA2.q();
        g3 g3VarH = h11VarA2.h();
        this.H = g3VarH;
        if (g3VarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = j65.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new h3(this.H));
            }
        }
        View.OnClickListener onClickListenerF = h11VarA2.f();
        View.OnLongClickListener onLongClickListener = this.B;
        checkableImageButton.setOnClickListener(onClickListenerF);
        au0.R(checkableImageButton, onLongClickListener);
        EditText editText = this.F;
        if (editText != null) {
            h11VarA2.l(editText);
            i(h11VarA2);
        }
        au0.b(textInputLayout, checkableImageButton, this.x, this.y);
        e(true);
    }

    public final void g(boolean z) {
        if (c() != z) {
            this.t.setVisibility(z ? 0 : 8);
            j();
            l();
            this.n.q();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.p;
        checkableImageButton.setImageDrawable(drawable);
        k();
        au0.b(this.n, checkableImageButton, this.q, this.r);
    }

    public final void i(h11 h11Var) {
        if (this.F == null) {
            return;
        }
        if (h11Var.e() != null) {
            this.F.setOnFocusChangeListener(h11Var.e());
        }
        if (h11Var.g() != null) {
            this.t.setOnFocusChangeListener(h11Var.g());
        }
    }

    public final void j() {
        this.o.setVisibility((this.t.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || ((this.C == null || this.E) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.p;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.n;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.w.q && textInputLayout.m()) ? 0 : 8);
        j();
        l();
        if (this.v != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void l() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.n;
        if (textInputLayout.q == null) {
            return;
        }
        if (c() || d()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.q;
            WeakHashMap weakHashMap = j65.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.q.getPaddingTop();
        int paddingBottom = textInputLayout.q.getPaddingBottom();
        WeakHashMap weakHashMap2 = j65.a;
        this.D.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void m() {
        mh mhVar = this.D;
        int visibility = mhVar.getVisibility();
        int i = (this.C == null || this.E) ? 8 : 0;
        if (visibility != i) {
            a().o(i == 0);
        }
        j();
        mhVar.setVisibility(i);
        this.n.q();
    }
}
