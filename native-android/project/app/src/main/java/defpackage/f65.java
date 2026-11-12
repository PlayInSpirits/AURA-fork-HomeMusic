package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f65 {
    public static View.AccessibilityDelegate a(View r0) {
        return r0.getAccessibilityDelegate();
    }

    public static void b(View r0, Context r1, int[] r2, AttributeSet r3, TypedArray r4, int r5, int r6) {
        r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6);
    }
}
