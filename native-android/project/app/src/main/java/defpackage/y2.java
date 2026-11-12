package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends View.AccessibilityDelegate {
    public final z2 a;

    public y2(z2 r1) {
        this.a = r1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View r1, AccessibilityEvent r2) {
        return this.a.a(r1, r2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View r1) {
        zh0 r0 = this.a.b(r1);
        if (r0 != null) goto L5;
        return null;
    L5:
        return (AccessibilityNodeProvider) r0.o;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View r1, AccessibilityEvent r2) {
        this.a.c(r1, r2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View r14, AccessibilityNodeInfo r15) {
        v3 r0 = new v3(r15);
        WeakHashMap r1 = j65.a;
        ClickableSpan[] r2 = null;
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Object r3 = Boolean.valueOf(e65.c(r14));
    L9:
        Boolean r4 = (Boolean) r3;
        int r5 = 0;
        boolean r6 = true;
        if (r4 != null) goto L12;
    L14:
        boolean r7 = false;
    L15:
        int r8 = Build.VERSION.SDK_INT;
        if (r8 < 28) goto L18;
        i3.u(r15, r7);
    L20:
        if (Build.VERSION.SDK_INT < 28) goto L22;
        Object r9 = Boolean.valueOf(e65.b(r14));
    L26:
        Boolean r10 = (Boolean) r9;
        if (r10 != null) goto L29;
    L31:
        r6 = false;
    L32:
        if (r8 < 28) goto L34;
        i3.C(r15, r6);
    L35:
        CharSequence r11 = j65.e(r14);
        if (r8 < 28) goto L38;
        i3.t(r15, r11);
    L40:
        if (Build.VERSION.SDK_INT < 30) goto L42;
        Object r12 = g65.b(r14);
    L46:
        CharSequence r13 = (CharSequence) r12;
        if (r8 < 30) goto L49;
        p3.i(r15, r13);
    L50:
        this.a.d(r14, r0);
        CharSequence r16 = r15.getText();
        if (r8 >= 26) goto L86;
        r15.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        r15.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        r15.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        r15.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SparseArray r17 = (SparseArray) r14.getTag(R.id.tag_accessibility_clickable_spans);
        if (r17 == null) goto L66;
        ArrayList r18 = new ArrayList();
        int r19 = 0;
    L56:
        if (r19 >= r17.size()) goto L61;
        if (((WeakReference) r17.valueAt(r19)).get() != null) goto L60;
        r18.add(Integer.valueOf(r19));
    L60:
        r19 = r19 + 1;
        goto L56
    L61:
        int r110 = 0;
    L63:
        if (r110 >= r18.size()) goto L66;
        r17.remove(((Integer) r18.get(r110)).intValue());
        r110 = r110 + 1;
    L66:
        if ((r16 instanceof Spanned) == false) goto L68;
        r2 = (ClickableSpan[]) ((Spanned) r16).getSpans(0, r16.length(), ClickableSpan.class);
    L68:
        if (r2 == null) goto L86;
        if (r2.length <= 0) goto L86;
        r15.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
        SparseArray r111 = (SparseArray) r14.getTag(R.id.tag_accessibility_clickable_spans);
        if (r111 != null) goto L74;
        r111 = new SparseArray();
        r14.setTag(R.id.tag_accessibility_clickable_spans, r111);
    L74:
        int r20 = 0;
    L76:
        if (r20 >= r2.length) goto L86;
        ClickableSpan r21 = r2[r20];
        int r22 = 0;
    L79:
        if (r22 >= r111.size()) goto L84;
        if (r21.equals((ClickableSpan) ((WeakReference) r111.valueAt(r22)).get()) == true) goto L82;
        r22 = r22 + 1;
        goto L79
    L82:
        int r23 = r111.keyAt(r22);
    L85:
        r111.put(r23, new WeakReference(r2[r20]));
        ClickableSpan r24 = r2[r20];
        Spanned r112 = (Spanned) r16;
        r0.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(r112.getSpanStart(r24)));
        r0.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(r112.getSpanEnd(r24)));
        r0.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(r112.getSpanFlags(r24)));
        r0.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(r23));
        r20 = r20 + 1;
        goto L76
    L84:
        r23 = v3.d;
        v3.d = r23 + 1;
    L86:
        List r113 = (List) r14.getTag(R.id.tag_accessibility_actions);
        if (r113 != null) goto L90;
        r113 = Collections.EMPTY_LIST;
    L90:
        if (r5 >= r113.size()) goto L92;
        r0.b((o3) r113.get(r5));
        r5 = r5 + 1;
        goto L90
    L92:
        return;
    L49:
        r15.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", r13);
        goto L50
    L42:
        r12 = r14.getTag(R.id.tag_state_description);
        if (CharSequence.class.isInstance(r12) == true) goto L46;
        r12 = null;
        goto L46
    L38:
        r15.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", r11);
        goto L40
    L34:
        r0.h(2, r6);
        goto L35
    L29:
        if (r10.booleanValue() == false) goto L31;
    L22:
        r9 = r14.getTag(R.id.tag_accessibility_heading);
        if (Boolean.class.isInstance(r9) == true) goto L26;
        r9 = null;
        goto L26
    L18:
        r0.h(1, r7);
        goto L20
    L12:
        if (r4.booleanValue() == false) goto L14;
        r7 = true;
        goto L15
    L5:
        r3 = r14.getTag(R.id.tag_screen_reader_focusable);
        if (Boolean.class.isInstance(r3) == true) goto L9;
        r3 = null;
        goto L9
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View r1, AccessibilityEvent r2) {
        this.a.e(r1, r2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup r1, View r2, AccessibilityEvent r3) {
        return this.a.f(r1, r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View r1, int r2, Bundle r3) {
        return this.a.g(r1, r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View r1, int r2) {
        this.a.h(r1, r2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View r1, AccessibilityEvent r2) {
        this.a.i(r1, r2);
    }
}
