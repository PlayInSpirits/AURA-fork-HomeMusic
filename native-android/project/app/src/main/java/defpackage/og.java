package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class og {
    public static boolean a(DragEvent r2, TextView r3, Activity r4) {
        r4.requestDragAndDropPermissions(r2);
        int r5 = r3.getOffsetForPosition(r2.getX(), r2.getY());
        r3.beginBatchEdit();
        Selection.setSelection((Spannable) r3.getText(), r5);     // Catch: Throwable -> L10
        ClipData r6 = r2.getClipData();     // Catch: Throwable -> L10
        if (Build.VERSION.SDK_INT < 31) goto L6;
        id0 r7 = new d34(r6, 3);     // Catch: Throwable -> L10
    L7:
        j65.j(r3, r7.build());     // Catch: Throwable -> L10
        r3.endBatchEdit();
        return true;
    L6:
        jd0 r8 = new jd0();     // Catch: Throwable -> L10
        r8.o = r6;     // Catch: Throwable -> L10
        r8.p = 3;     // Catch: Throwable -> L10
        r7 = r8;
    L10:
        th = move-exception;
        r3.endBatchEdit();
        throw th;
    }

    public static boolean b(DragEvent r2, View r3, Activity r4) {
        r4.requestDragAndDropPermissions(r2);
        ClipData r5 = r2.getClipData();
        if (Build.VERSION.SDK_INT < 31) goto L5;
        id0 r6 = new d34(r5, 3);
    L6:
        j65.j(r3, r6.build());
        return true;
    L5:
        jd0 r7 = new jd0();
        r7.o = r5;
        r7.p = 3;
        r6 = r7;
        goto L6
    }
}
