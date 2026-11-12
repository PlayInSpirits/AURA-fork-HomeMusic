package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fs4 extends z2 {
    public final TextInputLayout q;

    public fs4(TextInputLayout r1) {
        this.q = r1;
    }

    @Override // defpackage.z2
    public final void d(View r14, v3 r15) {
        AccessibilityNodeInfo r0 = r15.a;
        this.n.onInitializeAccessibilityNodeInfo(r14, r0);
        TextInputLayout r13 = this.q;
        EditText r16 = r13.getEditText();
        if (r16 == null) goto L5;
        CharSequence r17 = r16.getText();
    L6:
        CharSequence r1 = r13.getHint();
        CharSequence r2 = r13.getError();
        CharSequence r3 = r13.getPlaceholderText();
        int r4 = r13.getCounterMaxLength();
        CharSequence r5 = r13.getCounterOverflowDescription();
        boolean r6 = TextUtils.isEmpty(r17);
        boolean r7 = TextUtils.isEmpty(r1);
        boolean r8 = r13.G0;
        boolean r9 = TextUtils.isEmpty(r2);
        if (r9 == true) goto L9;
    L12:
        boolean r10 = true;
    L13:
        if (r7 == true) goto L15;
        String r11 = r1.toString();
    L16:
        el4 r12 = r13.o;
        mh r18 = r12.o;
        if (r18.getVisibility() != 0) goto L19;
        r0.setLabelFor(r18);
        r0.setTraversalAfter(r18);
    L21:
        if (r6 == true) goto L24;
        r15.n(r17);
    L32:
        if (TextUtils.isEmpty(r11) == true) goto L42;
        int r19 = Build.VERSION.SDK_INT;
        if (r19 < 26) goto L36;
        r15.l(r11);
    L39:
        if (r19 < 26) goto L41;
        j3.z(r0, r6);
        goto L42
    L41:
        r15.h(4, r6);
        goto L42
    L36:
        if (r6 == true) goto L38;
        r11 = r17 + ", " + r11;
    L38:
        r15.n(r11);
    L42:
        if (r17 != null) goto L44;
    L46:
        r4 = -1;
    L47:
        r0.setMaxTextLength(r4);
        if (r10 == false) goto L53;
        if (r9 == false) goto L52;
        r2 = r5;
    L52:
        r0.setError(r2);
    L53:
        mh r110 = r13.w.y;
        if (r110 == null) goto L56;
        r0.setLabelFor(r110);
    L56:
        r13.p.a().m(r15);
        return;
    L44:
        if (r17.length() != r4) goto L46;
    L24:
        if (TextUtils.isEmpty(r11) == true) goto L29;
        r15.n(r11);
        if (r8 == true) goto L32;
        if (r3 == null) goto L32;
        r15.n(r11 + ", " + r3);
        goto L32
    L29:
        if (r3 == null) goto L32;
        r15.n(r3);
        goto L32
    L19:
        r0.setTraversalAfter(r12.q);
        goto L21
    L15:
        r11 = "";
        goto L16
    L9:
        if (TextUtils.isEmpty(r5) == false) goto L12;
        r10 = false;
        goto L13
    L5:
        r17 = null;
        goto L6
    }

    @Override // defpackage.z2
    public final void e(View r1, AccessibilityEvent r2) {
        super.e(r1, r2);
        this.q.p.a().n(r2);
    }
}
