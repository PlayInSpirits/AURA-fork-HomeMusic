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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ju4.a(context);
        gt4.a(this, getContext());
        c6 c6Var = new c6(this);
        this.n = c6Var;
        c6Var.n(attributeSet, i);
        ih ihVar = new ih(this);
        this.o = ihVar;
        ihVar.f(attributeSet, i);
        ihVar.b();
        xc5 xc5Var = new xc5(2, false);
        xc5Var.o = this;
        this.p = xc5Var;
        this.q = new et4();
        gp3 gp3Var = new gp3(this);
        this.r = gp3Var;
        gp3Var.p(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerK = gp3Var.k(keyListener);
        if (keyListenerK == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerK);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private gg getSuperCaller() {
        if (this.s == null) {
            this.s = new gg(this);
        }
        return this.s;
    }

    @Override // defpackage.g93
    public final ld0 a(ld0 ld0Var) {
        this.q.getClass();
        return et4.a(this, ld0Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.b();
        }
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ya4.O(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        c6 c6Var = this.n;
        if (c6Var != null) {
            return c6Var.k();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c6 c6Var = this.n;
        if (c6Var != null) {
            return c6Var.l();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.o.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.o.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        xc5 xc5Var;
        if (Build.VERSION.SDK_INT >= 28 || (xc5Var = this.p) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) xc5Var.p;
        return textClassifier == null ? ch.a((TextView) xc5Var.o) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0119 A[PHI: r3
  0x0119: PHI (r3v9 java.lang.String[]) = (r3v4 java.lang.String[]), (r3v10 java.lang.String[]) binds: [B:75:0x012c, B:67:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrG;
        String[] stringArray;
        InputConnection lz1Var;
        int i;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.o.getClass();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 18;
        if (i2 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i2 >= 30) {
                p3.h(editorInfo, text);
            } else {
                text.getClass();
                if (i2 >= 30) {
                    p3.h(editorInfo, text);
                } else {
                    int i4 = editorInfo.initialSelStart;
                    int i5 = editorInfo.initialSelEnd;
                    int i6 = i4 > i5 ? i5 : i4;
                    if (i4 <= i5) {
                        i4 = i5;
                    }
                    int length = text.length();
                    if (i6 < 0 || i4 > length || (i = editorInfo.inputType & 4095) == 129 || i == 225 || i == 18) {
                        uo.S(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        uo.S(editorInfo, text, i6, i4);
                    } else {
                        int i7 = i4 - i6;
                        int i8 = i7 > 1024 ? 0 : i7;
                        int i9 = 2048 - i8;
                        int iMin = Math.min(text.length() - i4, i9 - Math.min(i6, (int) (((double) i9) * 0.8d)));
                        int iMin2 = Math.min(i6, i9 - iMin);
                        int i10 = i6 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i10))) {
                            i10++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i4 + iMin) - 1))) {
                            iMin--;
                        }
                        int i11 = iMin2 + i8;
                        uo.S(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i4, iMin + i4)) : text.subSequence(i10, i10 + i11 + iMin), iMin2, i11);
                    }
                }
            }
        }
        wr1.O(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i2 <= 30 && (strArrG = j65.g(this)) != null) {
            if (i2 >= 25) {
                editorInfo.contentMimeTypes = strArrG;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrG);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrG);
            }
            cn cnVar = new cn(i3, this);
            if (i2 >= 25) {
                lz1Var = new kz1(inputConnectionOnCreateInputConnection, cnVar);
            } else {
                String[] strArr = uo.q;
                if (i2 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    lz1Var = new lz1(inputConnectionOnCreateInputConnection, cnVar);
                }
            }
            inputConnectionOnCreateInputConnection = lz1Var;
        }
        return this.r.r(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && j65.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = og.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        jd0 jd0Var;
        id0 id0Var;
        int i2;
        d34 d34Var;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || j65.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                d34Var = new d34(primaryClip, 1);
            } else {
                jd0Var = new jd0();
                jd0Var.o = primaryClip;
                jd0Var.p = 1;
            }
            if (i == 16908322) {
                id0Var = jd0Var;
                id0Var = d34Var;
                i2 = 0;
            } else {
                id0Var = jd0Var;
                id0Var = d34Var;
                i2 = 1;
            }
            id0Var.i(i2);
            j65.j(this, id0Var.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.p();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.q(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ya4.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.r.v(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.r.k(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.y(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c6 c6Var = this.n;
        if (c6Var != null) {
            c6Var.z(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ih ihVar = this.o;
        ihVar.k(colorStateList);
        ihVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ih ihVar = this.o;
        ihVar.l(mode);
        ihVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ih ihVar = this.o;
        if (ihVar != null) {
            ihVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        xc5 xc5Var;
        if (Build.VERSION.SDK_INT >= 28 || (xc5Var = this.p) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xc5Var.p = textClassifier;
        }
    }
}
