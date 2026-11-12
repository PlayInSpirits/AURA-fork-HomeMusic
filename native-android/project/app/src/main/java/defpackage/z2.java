package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class z2 {
    public static final View.AccessibilityDelegate p = null;
    public final View.AccessibilityDelegate n;
    public final y2 o;

    static {
        p = new View.AccessibilityDelegate();
    }

    public z2(View.AccessibilityDelegate r1) {
        this.n = r1;
        this.o = new y2(this);
    }

    public boolean a(View r1, AccessibilityEvent r2) {
        return this.n.dispatchPopulateAccessibilityEvent(r1, r2);
    }

    public zh0 b(View r2) {
        AccessibilityNodeProvider r1 = this.n.getAccessibilityNodeProvider(r2);
        if (r1 != null) goto L5;
        return null;
    L5:
        return new zh0(2, r1);
    }

    public void c(View r1, AccessibilityEvent r2) {
        this.n.onInitializeAccessibilityEvent(r1, r2);
    }

    public void d(View r1, v3 r2) {
        this.n.onInitializeAccessibilityNodeInfo(r1, r2.a);
    }

    public void e(View r1, AccessibilityEvent r2) {
        this.n.onPopulateAccessibilityEvent(r1, r2);
    }

    public boolean f(ViewGroup r1, View r2, AccessibilityEvent r3) {
        return this.n.onRequestSendAccessibilityEvent(r1, r2, r3);
    }

    public boolean g(View r7, int r8, Bundle r9) {
        List r0 = (List) r7.getTag(R.id.tag_accessibility_actions);
        if (r0 != null) goto L5;
        r0 = Collections.EMPTY_LIST;
    L5:
        boolean r1 = false;
        int r2 = 0;
    L6:
        ClickableSpan[] r4 = null;
        if (r2 >= r0.size()) goto L24;
        o3 r3 = (o3) r0.get(r2);
        if (r3.a() == r8) goto L10;
        r2 = r2 + 1;
        goto L6
    L10:
        Class r5 = r3.c;
        f4 r6 = r3.d;
        if (r6 == null) goto L24;
        if (r5 != null) goto L50;
    L22:
        boolean r10 = r6.h(r7);
    L25:
        if (r10 == true) goto L27;
        r10 = this.n.performAccessibilityAction(r7, r8, r9);
    L27:
        if (r10 == false) goto L29;
        return r10;
    L29:
        if (r8 != R.id.accessibility_action_clickable_span) goto L57;
        if (r9 == null) goto L58;
        int r11 = r9.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray r12 = (SparseArray) r7.getTag(R.id.tag_accessibility_clickable_spans);
        if (r12 == null) goto L49;
        WeakReference r13 = (WeakReference) r12.get(r11);
        if (r13 == null) goto L49;
        ClickableSpan r14 = (ClickableSpan) r13.get();
        if (r14 == null) goto L49;
        CharSequence r15 = r7.createAccessibilityNodeInfo().getText();
        if ((r15 instanceof Spanned) == false) goto L40;
        r4 = (ClickableSpan[]) ((Spanned) r15).getSpans(0, r15.length(), ClickableSpan.class);
    L40:
        int r16 = 0;
    L41:
        if (r4 == null) goto L49;
        if (r16 >= r4.length) goto L49;
        if (r14.equals(r4[r16]) == true) goto L46;
        r16 = r16 + 1;
        goto L41
    L46:
        r14.onClick(r7);
        r1 = true;
    L49:
        return r1;
    L58:
        return r10;
    L57:
        return r10;
    L50:
    L17:
        e = move-exception;
        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(r5.getName()), e);
        goto L22
    L15:
        if (r5.getDeclaredConstructor(null).newInstance(null) != null) goto L20;
        throw null;     // Catch: Exception -> L17
    L20:
        throw new ClassCastException();     // Catch: Exception -> L17
    L24:
        r10 = false;
        goto L25
    }

    public void h(View r1, int r2) {
        this.n.sendAccessibilityEvent(r1, r2);
    }

    public void i(View r1, AccessibilityEvent r2) {
        this.n.sendAccessibilityEventUnchecked(r1, r2);
    }

    public z2() {
        this(p);
    }
}
