package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class hg extends EditText implements g93 {
    public final c6 n;
    public final ih o;
    public final xc5 p;
    public final et4 q;
    public final gp3 r;
    public gg s;

    public hg(Context r4, AttributeSet r5, int r6) {
        ju4.a(r4);
        super(r4, r5, r6);
        gt4.a(this, getContext());
        c6 r7 = new c6(this);
        this.n = r7;
        r7.n(r5, r6);
        ih r8 = new ih(this);
        this.o = r8;
        r8.f(r5, r6);
        r8.b();
        xc5 r9 = new xc5(2, false);
        r9.o = this;
        this.p = r9;
        this.q = new et4();
        gp3 r10 = new gp3(this);
        this.r = r10;
        r10.p(r5, r6);
        KeyListener r11 = getKeyListener();
        if ((r11 instanceof NumberKeyListener) == true) goto L9;
        boolean r12 = super.isFocusable();
        boolean r0 = super.isClickable();
        boolean r1 = super.isLongClickable();
        int r2 = super.getInputType();
        KeyListener r13 = r10.k(r11);
        if (r13 == r11) goto L10;
        super.setKeyListener(r13);
        super.setRawInputType(r2);
        super.setFocusable(r12);
        super.setClickable(r0);
        super.setLongClickable(r1);
        return;
    L10:
        return;
    }

    private gg getSuperCaller() {
        if (this.s != null) goto L6;
        this.s = new gg(this);
    L6:
        return this.s;
    }

    @Override // defpackage.g93
    public final ld0 a(ld0 r2) {
        this.q.getClass();
        return et4.a(this, r2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c6 r0 = this.n;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        ih r1 = this.o;
        if (r1 == null) goto L9;
        r1.b();
        return;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ya4.O(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c6 r0 = this.n;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.k();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c6 r0 = this.n;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.l();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.o.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.o.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return super.getText();
    L7:
        return super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28) goto L12;
        xc5 r0 = this.p;
        if (r0 == null) goto L12;
        TextClassifier r2 = (TextClassifier) r0.p;
        if (r2 == null) goto L10;
        return r2;
    L10:
        return ch.a((TextView) r0.o);
    L12:
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo r19) {
        InputConnection r2 = super.onCreateInputConnection(r19);
        this.o.getClass();
        int r3 = Build.VERSION.SDK_INT;
        int r4 = 18;
        if (r3 >= 30) goto L48;
        if (r2 == null) goto L48;
        CharSequence r6 = getText();
        if (r3 < 30) goto L8;
        p3.h(r19, r6);
        goto L48
    L8:
        r6.getClass();
        if (r3 < 30) goto L11;
        p3.h(r19, r6);
        goto L48
    L11:
        int r7 = r19.initialSelStart;
        int r8 = r19.initialSelEnd;
        if (r7 <= r8) goto L14;
        int r9 = r8;
    L15:
        if (r7 > r8) goto L18;
        r7 = r8;
    L18:
        int r10 = r6.length();
        if (r9 < 0) goto L47;
        if (r7 > r10) goto L47;
        int r12 = r19.inputType & 4095;
        if (r12 != 129) goto L25;
    L46:
        uo.S(r19, null, 0, 0);
        goto L48
    L25:
        if (r12 == 225) goto L46;
        if (r12 == 18) goto L46;
        if (r10 > 2048) goto L31;
        uo.S(r19, r6, r9, r7);
        goto L48
    L31:
        int r11 = r7 - r9;
        if (r11 <= 1024) goto L34;
        int r13 = 0;
    L35:
        int r14 = 2048 - r13;
        int r15 = Math.min(r6.length() - r7, r14 - Math.min(r9, (int) (((double) r14) * 0.8d)));
        int r16 = Math.min(r9, r14 - r15);
        int r17 = r9 - r16;
        if (Character.isLowSurrogate(r6.charAt(r17)) == false) goto L39;
        r17 = r17 + 1;
        r16 = r16 - 1;
    L39:
        if (Character.isHighSurrogate(r6.charAt((r7 + r15) - 1)) == false) goto L41;
        r15 = r15 - 1;
    L41:
        int r18 = r16 + r13;
        int r110 = r18 + r15;
        if (r13 == r11) goto L44;
        CharSequence r20 = TextUtils.concat(new CharSequence[]{r6.subSequence(r17, r17 + r16), r6.subSequence(r7, r15 + r7)});
    L45:
        uo.S(r19, r20, r16, r18);
        goto L48
    L44:
        r20 = r6.subSequence(r17, r17 + r110);
        goto L45
    L34:
        r13 = r11;
    L47:
        uo.S(r19, null, 0, 0);
        goto L48
    L14:
        r9 = r7;
    L48:
        wr1.O(r19, r2, this);
        if (r2 == null) goto L82;
        if (r3 > 30) goto L82;
        String[] r5 = j65.g(this);
        if (r5 == null) goto L82;
        if (r3 < 25) goto L57;
        kz0.i(r19, r5);
    L60:
        cn r21 = new cn(r4, this);
        if (r3 < 25) goto L64;
        InputConnection r22 = new kz1(r2, r21);
    L63:
        r2 = r22;
        goto L82
    L64:
        String[] r23 = uo.q;
        if (r3 < 25) goto L69;
        String[] r24 = kz0.j(r19);
        if (r24 == null) goto L78;
    L68:
        r23 = r24;
    L78:
        if (r23.length == 0) goto L82;
        r22 = new lz1(r2, r21);
        goto L63
    L69:
        Bundle r25 = r19.extras;
        if (r25 == null) goto L78;
        r24 = r25.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (r24 != null) goto L75;
        r24 = r19.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
    L75:
        if (r24 == null) goto L78;
    L57:
        if (r19.extras != null) goto L59;
        r19.extras = new Bundle();
    L59:
        r19.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", r5);
        r19.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", r5);
    L82:
        return this.r.r(r2, r19);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 30) goto L5;
        return;
    L5:
        if (r0 >= 33) goto L9;
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        return;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent r6) {
        boolean r3 = false;
        if (Build.VERSION.SDK_INT < 31) goto L5;
    L25:
        if (r3 == false) goto L28;
        return true;
    L28:
        return super.onDragEvent(r6);
    L5:
        if (r6.getLocalState() != null) goto L25;
        if (j65.g(this) == null) goto L25;
        Context r0 = getContext();
    L11:
        if ((r0 instanceof ContextWrapper) == false) goto L16;
        if ((r0 instanceof Activity) == true) goto L14;
        r0 = ((ContextWrapper) r0).getBaseContext();
        goto L11
    L14:
        Activity r1 = (Activity) r0;
    L17:
        if (r1 != null) goto L20;
        Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
        goto L25
    L20:
        if (r6.getAction() == 1) goto L25;
        if (r6.getAction() != 3) goto L25;
        r3 = og.a(r6, this, r1);
        goto L25
    L16:
        r1 = null;
        goto L17
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int r7) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 31) goto L28;
        if (j65.g(this) == null) goto L28;
        if (r7 != 16908322) goto L9;
    L11:
        ClipboardManager r3 = (ClipboardManager) getContext().getSystemService("clipboard");
        if (r3 != null) goto L14;
        ClipData r4 = null;
    L16:
        if (r4 != null) goto L18;
    L26:
        return true;
    L18:
        if (r4.getItemCount() <= 0) goto L26;
        if (r0 < 31) goto L21;
        id0 r1 = new d34(r4, 1);
    L22:
        if (r7 != 16908322) goto L24;
        int r8 = 0;
    L25:
        r1.i(r8);
        j65.j(this, r1.build());
        goto L26
    L24:
        r8 = 1;
        goto L25
    L21:
        jd0 r2 = new jd0();
        r2.o = r4;
        r2.p = 1;
        r1 = r2;
        goto L22
    L14:
        r4 = r3.getPrimaryClip();
        goto L16
    L9:
        if (r7 == 16908337) goto L11;
    L28:
        return super.onTextContextMenuItem(r7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.p();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
        super.setBackgroundResource(r1);
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.q(r1);
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawables(r1, r2, r3, r4);
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable r1, Drawable r2, Drawable r3, Drawable r4) {
        super.setCompoundDrawablesRelative(r1, r2, r3, r4);
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(ya4.P(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r1) {
        this.r.v(r1);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener r2) {
        super.setKeyListener(this.r.k(r2));
    }

    public void setSupportBackgroundTintList(ColorStateList r1) {
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.y(r1);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r1) {
        c6 r0 = this.n;
        if (r0 == null) goto L6;
        r0.z(r1);
        return;
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList r1) {
        ih r0 = this.o;
        r0.k(r1);
        r0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode r1) {
        ih r0 = this.o;
        r0.l(r1);
        r0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context r1, int r2) {
        super.setTextAppearance(r1, r2);
        ih r0 = this.o;
        if (r0 == null) goto L6;
        r0.g(r1, r2);
        return;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L9;
        xc5 r0 = this.p;
        if (r0 == null) goto L9;
        r0.p = r3;
        return;
    L9:
        super.setTextClassifier(r3);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }
}
