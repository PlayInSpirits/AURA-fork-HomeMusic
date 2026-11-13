package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fs4 extends z2 {
    public final TextInputLayout q;

    public fs4(TextInputLayout textInputLayout) {
        this.q = textInputLayout;
    }

    @Override // defpackage.z2
    public final void d(View view, v3 v3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v3Var.a;
        this.n.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.q;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.G0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        el4 el4Var = textInputLayout.o;
        mh mhVar = el4Var.o;
        if (mhVar.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(mhVar);
            accessibilityNodeInfo.setTraversalAfter(mhVar);
        } else {
            accessibilityNodeInfo.setTraversalAfter(el4Var.q);
        }
        if (!isEmpty) {
            v3Var.n(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            v3Var.n(charSequence);
            if (!z && placeholderText != null) {
                v3Var.n(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            v3Var.n(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                v3Var.l(charSequence);
            } else {
                if (!isEmpty) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                v3Var.n(charSequence);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                v3Var.h(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        mh mhVar2 = textInputLayout.w.y;
        if (mhVar2 != null) {
            accessibilityNodeInfo.setLabelFor(mhVar2);
        }
        textInputLayout.p.a().m(v3Var);
    }

    @Override // defpackage.z2
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.q.p.a().n(accessibilityEvent);
    }
}
