package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class og {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        id0 id0Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                id0Var = new d34(clipData, 3);
            } else {
                jd0 jd0Var = new jd0();
                jd0Var.o = clipData;
                jd0Var.p = 3;
                id0Var = jd0Var;
            }
            j65.j(textView, id0Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        id0 id0Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            id0Var = new d34(clipData, 3);
        } else {
            jd0 jd0Var = new jd0();
            jd0Var.o = clipData;
            jd0Var.p = 3;
            id0Var = jd0Var;
        }
        j65.j(view, id0Var.build());
        return true;
    }
}
