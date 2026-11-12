package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class el4 extends LinearLayout {
    public final TextInputLayout n;
    public final mh o;
    public CharSequence p;
    public final CheckableImageButton q;
    public ColorStateList r;
    public PorterDuff.Mode s;
    public int t;
    public ImageView.ScaleType u;
    public View.OnLongClickListener v;
    public boolean w;

    public el4(TextInputLayout textInputLayout, jv3 jv3Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.q = checkableImageButton;
        mh mhVar = new mh(getContext(), null);
        this.o = mhVar;
        if (h12.z(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.v;
        checkableImageButton.setOnClickListener(null);
        au0.R(checkableImageButton, onLongClickListener);
        this.v = null;
        checkableImageButton.setOnLongClickListener(null);
        au0.R(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) jv3Var.o;
        if (typedArray.hasValue(69)) {
            this.r = h12.r(getContext(), jv3Var, 69);
        }
        if (typedArray.hasValue(70)) {
            this.s = vr1.B(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(jv3Var.c(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            kf2.n("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.t) {
            this.t = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeH = au0.h(typedArray.getInt(68, -1));
            this.u = scaleTypeH;
            checkableImageButton.setScaleType(scaleTypeH);
        }
        mhVar.setVisibility(8);
        mhVar.setId(R.id.textinput_prefix_text);
        mhVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = j65.a;
        mhVar.setAccessibilityLiveRegion(1);
        mhVar.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            mhVar.setTextColor(jv3Var.b(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.p = TextUtils.isEmpty(text2) ? null : text2;
        mhVar.setText(text2);
        e();
        addView(checkableImageButton);
        addView(mhVar);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.q;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = j65.a;
        return this.o.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.q;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.r;
            PorterDuff.Mode mode = this.s;
            TextInputLayout textInputLayout = this.n;
            au0.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            au0.Q(textInputLayout, checkableImageButton, this.r);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.v;
        checkableImageButton.setOnClickListener(null);
        au0.R(checkableImageButton, onLongClickListener);
        this.v = null;
        checkableImageButton.setOnLongClickListener(null);
        au0.R(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.q;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.n.q;
        if (editText == null) {
            return;
        }
        if (this.q.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = j65.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = j65.a;
        this.o.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.p == null || this.w) ? 8 : 0;
        setVisibility((this.q.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.o.setVisibility(i);
        this.n.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
