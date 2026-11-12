package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 {
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public AnimatorSet l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public mh r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public mh y;
    public int z;

    public cy1(TextInputLayout r4) {
        Context r0 = r4.getContext();
        this.g = r0;
        this.h = r4;
        this.m = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.a = g12.N(r0, R.attr.motionDurationShort4, 217);
        this.b = g12.N(r0, R.attr.motionDurationMedium4, 167);
        this.c = g12.N(r0, R.attr.motionDurationShort4, 167);
        this.d = g12.O(r0, R.attr.motionEasingEmphasizedDecelerateInterpolator, yd.d);
        LinearInterpolator r5 = yd.a;
        this.e = g12.O(r0, R.attr.motionEasingEmphasizedDecelerateInterpolator, r5);
        this.f = g12.O(r0, R.attr.motionEasingLinearInterpolator, r5);
    }

    public final void a(mh r7, int r8) {
        if (this.i != null) goto L10;
        if (this.k != null) goto L10;
        Context r3 = this.g;
        LinearLayout r0 = new LinearLayout(r3);
        this.i = r0;
        r0.setOrientation(0);
        LinearLayout r1 = this.i;
        TextInputLayout r5 = this.h;
        r5.addView(r1, -1, -2);
        this.k = new FrameLayout(r3);
        this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (r5.getEditText() == null) goto L10;
        b();
    L10:
        if (r8 == 0) goto L14;
        if (r8 == 1) goto L14;
        this.i.addView(r7, new LinearLayout.LayoutParams(-2, -2));
    L15:
        this.i.setVisibility(0);
        this.j++;
        return;
    L14:
        this.k.setVisibility(0);
        this.k.addView(r7);
        goto L15
    }

    public final void b() {
        if (this.i == null) goto L17;
        TextInputLayout r0 = this.h;
        if (r0.getEditText() == null) goto L18;
        EditText r1 = r0.getEditText();
        Context r2 = this.g;
        boolean r3 = h12.z(r2);
        LinearLayout r7 = this.i;
        WeakHashMap r4 = j65.a;
        int r5 = r1.getPaddingStart();
        if (r3 == false) goto L9;
        r5 = r2.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
    L9:
        int r6 = r2.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
        if (r3 == false) goto L12;
        r6 = r2.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
    L12:
        int r8 = r1.getPaddingEnd();
        if (r3 == false) goto L15;
        r8 = r2.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
    L15:
        r7.setPaddingRelative(r5, r6, r8, 0);
        return;
    L18:
        return;
    }

    public final void c() {
        AnimatorSet r0 = this.l;
        if (r0 == null) goto L6;
        r0.cancel();
        return;
    }

    public final void d(ArrayList r8, boolean r9, mh r10, int r11, int r12, int r13) {
        if (r10 == null) goto L32;
        if (r9 == false) goto L36;
        if (r11 == r13) goto L8;
        if (r11 == r12) goto L8;
        return;
    L8:
        if (r13 != r11) goto L10;
        boolean r1 = true;
    L12:
        if (r1 == false) goto L14;
        float r3 = 1.0f;
    L15:
        ObjectAnimator r4 = ObjectAnimator.ofFloat(r10, View.ALPHA, new float[]{r3});
        int r5 = this.c;
        if (r1 == false) goto L18;
        long r6 = this.b;
    L19:
        r4.setDuration(r6);
        if (r1 == false) goto L22;
        TimeInterpolator r2 = this.e;
    L23:
        r4.setInterpolator(r2);
        if (r11 != r13) goto L27;
        if (r12 == 0) goto L27;
        r4.setStartDelay(r5);
    L27:
        r8.add(r4);
        if (r13 != r11) goto L34;
        if (r12 == 0) goto L35;
        ObjectAnimator r14 = ObjectAnimator.ofFloat(r10, View.TRANSLATION_Y, new float[]{-this.m, 0.0f});
        r14.setDuration(this.a);
        r14.setInterpolator(this.d);
        r14.setStartDelay(r5);
        r8.add(r14);
        return;
    L35:
        return;
    L34:
        return;
    L22:
        r2 = this.f;
        goto L23
    L18:
        r6 = r5;
        goto L19
    L14:
        r3 = 0.0f;
        goto L15
    L10:
        r1 = false;
        goto L12
    L36:
        return;
    }

    public final TextView e(int r2) {
        if (r2 == 1) goto L11;
        if (r2 == 2) goto L9;
        return null;
    L9:
        return this.y;
    L11:
        return this.r;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.n == 1) goto L5;
    L10:
        i(this.n, this.o, h(this.r, ""));
        return;
    L5:
        if (this.x == true) goto L7;
    L9:
        this.o = 0;
        goto L10
    L7:
        if (TextUtils.isEmpty(this.w) == true) goto L9;
        this.o = 2;
        goto L10
    }

    public final void g(mh r3, int r4) {
        LinearLayout r0 = this.i;
        if (r0 != null) goto L6;
        return;
    L6:
        if (r4 == 0) goto L8;
        if (r4 == 1) goto L8;
    L11:
        r0.removeView(r3);
    L12:
        int r5 = this.j - 1;
        this.j = r5;
        LinearLayout r2 = this.i;
        if (r5 != 0) goto L16;
        r2.setVisibility(8);
        return;
    L16:
        return;
    L8:
        FrameLayout r6 = this.k;
        if (r6 == null) goto L11;
        r6.removeView(r3);
        goto L12
    }

    public final boolean h(mh r3, CharSequence r4) {
        WeakHashMap r0 = j65.a;
        TextInputLayout r1 = this.h;
        if (r1.isLaidOut() == true) goto L5;
        return false;
    L5:
        if (r1.isEnabled() == true) goto L7;
        return false;
    L7:
        if (this.o != this.n) goto L11;
        if (r3 != null) goto L10;
        return true;
    L10:
        if (TextUtils.equals(r3.getText(), r4) == true) goto L18;
        return true;
    L18:
        return false;
    L11:
        return true;
    }

    public final void i(int r10, int r11, boolean r12) {
        if (r10 != r11) goto L5;
        return;
    L5:
        if (r12 == false) goto L7;
        AnimatorSet r8 = new AnimatorSet();
        this.l = r8;
        ArrayList r1 = new ArrayList();
        d(r1, this.x, this.y, 2, r10, r11);
        d(r1, this.q, this.r, 1, r10, r11);
        gi1.R(r8, r1);
        r8.addListener(new ay1(this, r11, e(r10), r10, e(r11)));
        r8.start();
    L20:
        TextInputLayout r0 = this.h;
        r0.r();
        r0.u(r12, false);
        r0.x();
        return;
    L7:
        if (r10 == r11) goto L20;
        if (r11 == 0) goto L13;
        TextView r2 = e(r11);
        if (r2 == null) goto L13;
        r2.setVisibility(0);
        r2.setAlpha(1.0f);
    L13:
        if (r10 == 0) goto L19;
        TextView r3 = e(r10);
        if (r3 == null) goto L19;
        r3.setVisibility(4);
        if (r10 != 1) goto L19;
        r3.setText(null);
    L19:
        this.n = r11;
        goto L20
    }
}
