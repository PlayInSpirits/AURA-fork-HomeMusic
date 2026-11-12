package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ch {
    public static TextClassifier a(TextView r1) {
        TextClassificationManager r2 = (TextClassificationManager) r1.getContext().getSystemService(TextClassificationManager.class);
        if (r2 == null) goto L7;
        return r2.getTextClassifier();
    L7:
        return TextClassifier.NO_OP;
    }
}
