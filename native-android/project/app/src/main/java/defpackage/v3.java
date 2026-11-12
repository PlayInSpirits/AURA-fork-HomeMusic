package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 {
    public static int d;
    public final AccessibilityNodeInfo a;
    public int b;
    public int c;

    public v3(AccessibilityNodeInfo r2) {
        this.b = -1;
        this.c = -1;
        this.a = r2;
    }

    public static String d(int r1) {
        if (r1 != 1) goto L5;
        return "ACTION_FOCUS";
    L5:
        if (r1 == 2) goto L95;
        switch(r1) {
            case 4: goto L93;
            case 8: goto L91;
            case 16: goto L89;
            case 32: goto L87;
            case 64: goto L85;
            case 128: goto L83;
            case 256: goto L81;
            case 512: goto L79;
            case 1024: goto L77;
            case 2048: goto L75;
            case 4096: goto L73;
            case 8192: goto L71;
            case 16384: goto L69;
            case 32768: goto L67;
            case 65536: goto L65;
            case 131072: goto L63;
            case 262144: goto L61;
            case 524288: goto L59;
            case 2097152: goto L57;
            case 16908354: goto L55;
            default: goto L7;
        };
    L7:
        switch(r1) {
            case 16908342: goto L53;
            case 16908343: goto L51;
            case 16908344: goto L49;
            case 16908345: goto L47;
            case 16908346: goto L45;
            case 16908347: goto L43;
            case 16908348: goto L41;
            case 16908349: goto L39;
            default: goto L8;
        };
    L8:
        switch(r1) {
            case 16908356: goto L37;
            case 16908357: goto L35;
            case 16908358: goto L33;
            case 16908359: goto L31;
            case 16908360: goto L29;
            case 16908361: goto L27;
            case 16908362: goto L25;
            default: goto L9;
        };
    L9:
        switch(r1) {
            case 16908372: goto L23;
            case 16908373: goto L21;
            case 16908374: goto L19;
            case 16908375: goto L17;
            default: goto L10;
        };
    L10:
        switch(r1) {
            case 16908382: goto L15;
            case 16908383: goto L13;
            default: goto L11;
        };
    L11:
        return "ACTION_UNKNOWN";
    L13:
        return "ACTION_SET_EXTENDED_SELECTION";
    L15:
        return "ACTION_SCROLL_IN_DIRECTION";
    L17:
        return "ACTION_DRAG_CANCEL";
    L19:
        return "ACTION_DRAG_DROP";
    L21:
        return "ACTION_DRAG_START";
    L23:
        return "ACTION_IME_ENTER";
    L25:
        return "ACTION_PRESS_AND_HOLD";
    L27:
        return "ACTION_PAGE_RIGHT";
    L29:
        return "ACTION_PAGE_LEFT";
    L31:
        return "ACTION_PAGE_DOWN";
    L33:
        return "ACTION_PAGE_UP";
    L35:
        return "ACTION_HIDE_TOOLTIP";
    L37:
        return "ACTION_SHOW_TOOLTIP";
    L39:
        return "ACTION_SET_PROGRESS";
    L41:
        return "ACTION_CONTEXT_CLICK";
    L43:
        return "ACTION_SCROLL_RIGHT";
    L45:
        return "ACTION_SCROLL_DOWN";
    L47:
        return "ACTION_SCROLL_LEFT";
    L49:
        return "ACTION_SCROLL_UP";
    L51:
        return "ACTION_SCROLL_TO_POSITION";
    L53:
        return "ACTION_SHOW_ON_SCREEN";
    L55:
        return "ACTION_MOVE_WINDOW";
    L57:
        return "ACTION_SET_TEXT";
    L59:
        return "ACTION_COLLAPSE";
    L61:
        return "ACTION_EXPAND";
    L63:
        return "ACTION_SET_SELECTION";
    L65:
        return "ACTION_CUT";
    L67:
        return "ACTION_PASTE";
    L69:
        return "ACTION_COPY";
    L71:
        return "ACTION_SCROLL_BACKWARD";
    L73:
        return "ACTION_SCROLL_FORWARD";
    L75:
        return "ACTION_PREVIOUS_HTML_ELEMENT";
    L77:
        return "ACTION_NEXT_HTML_ELEMENT";
    L79:
        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
    L81:
        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
    L83:
        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
    L85:
        return "ACTION_ACCESSIBILITY_FOCUS";
    L87:
        return "ACTION_LONG_CLICK";
    L89:
        return "ACTION_CLICK";
    L91:
        return "ACTION_CLEAR_SELECTION";
    L93:
        return "ACTION_SELECT";
    L95:
        return "ACTION_CLEAR_FOCUS";
    }

    public final void a(int r1) {
        this.a.addAction(r1);
    }

    public final void b(o3 r1) {
        AccessibilityNodeInfo.AccessibilityAction r2 = (AccessibilityNodeInfo.AccessibilityAction) r1.a;
        this.a.addAction(r2);
    }

    public final ArrayList c(String r2) {
        AccessibilityNodeInfo r1 = this.a;
        ArrayList<Integer> r0 = r1.getExtras().getIntegerArrayList(r2);
        if (r0 != null) goto L6;
        ArrayList<Integer> r3 = new ArrayList();
        r1.getExtras().putIntegerArrayList(r2, r3);
        return r3;
    L6:
        return r0;
    }

    public final boolean e(int r3) {
        Bundle r2 = this.a.getExtras();
        if (r2 != null) goto L6;
    L9:
        return false;
    L6:
        if ((r2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & r3) != r3) goto L9;
        return true;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if ((r5 instanceof v3) == true) goto L11;
        return false;
    L11:
        v3 r6 = (v3) r5;
        AccessibilityNodeInfo r2 = r6.a;
        AccessibilityNodeInfo r3 = this.a;
        if (r3 != null) goto L16;
        if (r2 == null) goto L19;
        return false;
    L19:
        if (this.c == r6.c) goto L22;
        return false;
    L22:
        if (this.b == r6.b) goto L24;
        return false;
    L24:
        return true;
    L16:
        if (r3.equals(r2) == true) goto L19;
        return false;
    }

    public final void f(Rect r1) {
        this.a.getBoundsInParent(r1);
    }

    public final CharSequence g() {
        boolean r1 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo r2 = this.a;
        if (r1 == true) goto L10;
        ArrayList r0 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList r3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList r4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList r5 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        int r8 = 0;
        SpannableString r6 = new SpannableString(TextUtils.substring(r2.getText(), 0, r2.getText().length()));
    L6:
        if (r8 >= r0.size()) goto L8;
        r6.setSpan(new x2(((Integer) r5.get(r8)).intValue(), this, r2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) r0.get(r8)).intValue(), ((Integer) r3.get(r8)).intValue(), ((Integer) r4.get(r8)).intValue());
        r8 = r8 + 1;
        goto L6
    L8:
        return r6;
    L10:
        return r2.getText();
    }

    public final void h(int r5, boolean r6) {
        Bundle r4 = this.a.getExtras();
        if (r4 == null) goto L10;
        int r2 = r4.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~r5);
        if (r6 == true) goto L8;
        r5 = 0;
    L8:
        r4.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", r5 | r2);
        return;
    }

    public final int hashCode() {
        AccessibilityNodeInfo r0 = this.a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public final void i(CharSequence r1) {
        this.a.setClassName(r1);
    }

    public final void j(t3 r1) {
        if (r1 != null) goto L4;
        AccessibilityNodeInfo.CollectionInfo r2 = null;
    L5:
        this.a.setCollectionInfo(r2);
        return;
    L4:
        r2 = (AccessibilityNodeInfo.CollectionInfo) r1.a;
        goto L5
    }

    public final void k(u3 r1) {
        AccessibilityNodeInfo.CollectionItemInfo r2 = (AccessibilityNodeInfo.CollectionItemInfo) r1.a;
        this.a.setCollectionItemInfo(r2);
    }

    public final void l(String r3) {
        int r0 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo r2 = this.a;
        if (r0 < 26) goto L6;
        j3.x(r2, r3);
        return;
    L6:
        r2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", r3);
    }

    public final void m(boolean r1) {
        this.a.setScrollable(r1);
    }

    public final void n(CharSequence r1) {
        this.a.setText(r1);
    }

    public final String toString() {
        StringBuilder r1 = new StringBuilder();
        r1.append(super.toString());
        Rect r2 = new Rect();
        f(r2);
        r1.append("; boundsInParent: " + r2);
        AccessibilityNodeInfo r3 = this.a;
        r3.getBoundsInScreen(r2);
        r1.append("; boundsInScreen: " + r2);
        int r4 = Build.VERSION.SDK_INT;
        if (r4 < 34) goto L5;
        a3.e(r3, r2);
    L8:
        r1.append("; boundsInWindow: " + r2);
        r1.append("; packageName: ");
        r1.append(r3.getPackageName());
        r1.append("; className: ");
        r1.append(r3.getClassName());
        r1.append("; text: ");
        r1.append(g());
        r1.append("; error: ");
        r1.append(r3.getError());
        r1.append("; maxTextLength: ");
        r1.append(r3.getMaxTextLength());
        r1.append("; stateDescription: ");
        if (r4 < 30) goto L11;
        CharSequence r5 = p3.c(r3);
    L12:
        r1.append(r5);
        r1.append("; contentDescription: ");
        r1.append(r3.getContentDescription());
        r1.append("; supplementalDescription: ");
        if (r4 < 36) goto L15;
        CharSequence r6 = r3.c(r3);
    L16:
        r1.append(r6);
        r1.append("; tooltipText: ");
        if (r4 < 28) goto L19;
        CharSequence r7 = i3.l(r3);
    L20:
        r1.append(r7);
        r1.append("; viewIdResName: ");
        r1.append(r3.getViewIdResourceName());
        r1.append("; uniqueId: ");
        if (r4 < 33) goto L23;
        String r8 = q3.c(r3);
    L24:
        r1.append(r8);
        r1.append("; checkable: ");
        r1.append(r3.isCheckable());
        r1.append("; checked: ");
        if (r4 < 36) goto L27;
        int r9 = r3.a(r3);
    L28:
        String r10 = "PARTIAL";
        if (r9 != 1) goto L31;
        String r11 = "TRUE";
    L34:
        r1.append(r11);
        r1.append("; fieldRequired: ");
        if (r4 < 36) goto L37;
        boolean r12 = r3.d(r3);
    L38:
        r1.append(r12);
        r1.append("; focusable: ");
        r1.append(r3.isFocusable());
        r1.append("; focused: ");
        r1.append(r3.isFocused());
        r1.append("; selected: ");
        r1.append(r3.isSelected());
        r1.append("; clickable: ");
        r1.append(r3.isClickable());
        r1.append("; longClickable: ");
        r1.append(r3.isLongClickable());
        r1.append("; contextClickable: ");
        r1.append(r3.isContextClickable());
        r1.append("; expandedState: ");
        int r13 = 0;
        if (r4 < 36) goto L41;
        int r14 = r3.b(r3);
    L42:
        if (r14 == 0) goto L50;
        if (r14 == 1) goto L49;
        if (r14 != 2) goto L46;
    L51:
        r1.append(r10);
        r1.append("; enabled: ");
        r1.append(r3.isEnabled());
        r1.append("; password: ");
        r1.append(r3.isPassword());
        r1.append("; scrollable: " + r3.isScrollable());
        r1.append("; containerTitle: ");
        if (r4 < 34) goto L54;
        CharSequence r15 = a3.f(r3);
    L55:
        r1.append(r15);
        r1.append("; granularScrollingSupported: ");
        r1.append(e(67108864));
        r1.append("; importantForAccessibility: ");
        r1.append(r3.isImportantForAccessibility());
        r1.append("; visible: ");
        r1.append(r3.isVisibleToUser());
        r1.append("; isTextSelectable: ");
        if (r4 < 33) goto L58;
        boolean r16 = q3.d(r3);
    L59:
        r1.append(r16);
        r1.append("; accessibilityDataSensitive: ");
        if (r4 < 34) goto L62;
        boolean r0 = a3.k(r3);
    L63:
        r1.append(r0);
        r1.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> r17 = r3.getActionList();
        ArrayList r18 = new ArrayList();
        int r19 = r17.size();
        int r20 = 0;
    L64:
        if (r20 >= r19) goto L67;
        r18.add(new o3(r17.get(r20), 0, null, null, null));
        r20 = r20 + 1;
    L67:
        if (r13 >= r18.size()) goto L77;
        o3 r21 = (o3) r18.get(r13);
        int r22 = r21.a();
        Object r23 = r21.a;
        String r24 = d(r22);
        if (r24.equals("ACTION_UNKNOWN") == true) goto L71;
    L73:
        r1.append(r24);
        if (r13 == (r18.size() - 1)) goto L76;
        r1.append(", ");
    L76:
        r13 = r13 + 1;
        goto L67
    L71:
        if (((AccessibilityNodeInfo.AccessibilityAction) r23).getLabel() == null) goto L73;
        r24 = ((AccessibilityNodeInfo.AccessibilityAction) r23).getLabel().toString();
        goto L73
    L77:
        r1.append("]");
        return r1.toString();
    L62:
        r0 = e(64);
        goto L63
    L58:
        r16 = e(8388608);
        goto L59
    L54:
        r15 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        goto L55
    L46:
        if (r14 == 3) goto L48;
        r10 = "UNKNOWN";
        goto L51
    L48:
        r10 = "FULL";
        goto L51
    L49:
        r10 = "COLLAPSED";
        goto L51
    L50:
        r10 = "UNDEFINED";
        goto L51
    L41:
        r14 = r3.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        goto L42
    L37:
        r12 = r3.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
        goto L38
    L31:
        if (r9 != 2) goto L33;
        r11 = "PARTIAL";
        goto L34
    L33:
        r11 = "FALSE";
        goto L34
    L27:
        r9 = r3.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", r3.isChecked() ? 1 : 0);
        goto L28
    L23:
        r8 = r3.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        goto L24
    L19:
        r7 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        goto L20
    L15:
        r6 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
        goto L16
    L11:
        r5 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        goto L12
    L5:
        Rect r25 = (Rect) r3.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (r25 == null) goto L8;
        r2.set(r25.left, r25.top, r25.right, r25.bottom);
        goto L8
    }
}
