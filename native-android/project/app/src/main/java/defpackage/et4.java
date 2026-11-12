package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class et4 {
    public static ld0 a(View r9, ld0 r10) {
        if (Log.isLoggable("ReceiveContent", 3) == false) goto L5;
        Log.d("ReceiveContent", "onReceive: " + r10);
    L5:
        kd0 r0 = r10.a;
        if (r0.u() != 2) goto L8;
        return r10;
    L8:
        ClipData r11 = r0.f();
        int r1 = r0.r();
        TextView r12 = (TextView) r9;
        Editable r2 = (Editable) r12.getText();
        Context r13 = r12.getContext();
        int r3 = 0;
        boolean r4 = false;
    L10:
        if (r3 >= r11.getItemCount()) goto L22;
        ClipData.Item r5 = r11.getItemAt(r3);
        if ((r1 & 1) == 0) goto L16;
        CharSequence r6 = r5.coerceToText(r13);
        if ((r6 instanceof Spanned) == false) goto L17;
        r6 = r6.toString();
    L17:
        if (r6 == null) goto L21;
        if (r4 == true) goto L20;
        int r7 = Selection.getSelectionStart(r2);
        int r8 = Selection.getSelectionEnd(r2);
        int r14 = Math.max(0, Math.min(r7, r8));
        int r15 = Math.max(0, Math.max(r7, r8));
        Selection.setSelection(r2, r15);
        r2.replace(r14, r15, r6);
        r4 = true;
        goto L21
    L20:
        r2.insert(Selection.getSelectionEnd(r2), "\n");
        r2.insert(Selection.getSelectionEnd(r2), r6);
    L21:
        r3 = r3 + 1;
        goto L10
    L16:
        r6 = r5.coerceToStyledText(r13);
        goto L17
    L22:
        return null;
    }
}
