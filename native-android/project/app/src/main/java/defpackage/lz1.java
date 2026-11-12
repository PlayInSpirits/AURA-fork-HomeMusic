package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lz1 extends InputConnectionWrapper {
    public final /* synthetic */ cn a;

    public lz1(InputConnection r1, cn r2) {
        this.a = r2;
        super(r1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String r12, Bundle r13) {
        cn r0 = this.a;
        boolean r2 = false;
        r2 = false;
        r2 = false;
        r2 = false;
        if (r13 != null) goto L6;
    L48:
        if (r2 == false) goto L51;
        return true;
    L51:
        return super.performPrivateCommand(r12, r13);
    L6:
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", r12) == false) goto L9;
        Object[] r3 = false;
    L12:
        if (r3 == false) goto L16;
        String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    L54:
        ResultReceiver r6 = (ResultReceiver) r13.getParcelable(r5);     // Catch: Throwable -> L14
        if (r3 == false) goto L22;
        String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    L52:
        Uri r8 = (Uri) r13.getParcelable(r7);     // Catch: Throwable -> L20
        if (r3 == false) goto L26;
        String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    L27:
        ClipDescription r10 = (ClipDescription) r13.getParcelable(r9);     // Catch: Throwable -> L20
        if (r3 == false) goto L30;
        String r11 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    L31:
        Uri r14 = (Uri) r13.getParcelable(r11);     // Catch: Throwable -> L20
        if (r3 == false) goto L34;
        String r15 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    L35:
        int r16 = r13.getInt(r15);     // Catch: Throwable -> L20
        if (r3 == false) goto L38;
        String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    L39:
        Bundle r17 = (Bundle) r13.getParcelable(r4);     // Catch: Throwable -> L20
        if (r8 == null) goto L43;
        if (r10 == null) goto L43;
        r2 = r0.b(new om1(r8, r10, r14), r16, r17);     // Catch: Throwable -> L20
    L43:
        if (r6 == null) goto L48;
        r6.send(r2 ? 1 : 0, null);
        goto L48
    L38:
        r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
        goto L39
    L34:
        r15 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
        goto L35
    L30:
        r11 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
        goto L31
    L26:
        r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    L20:
        th = th;
    L45:
        if (r6 == null) goto L47;
        r6.send(0, null);
    L47:
        throw th;
    L22:
        r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    L14:
        th = th;
        r6 = null;
        goto L45
    L16:
        r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        goto L54
    L9:
        if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", r12) == false) goto L48;
        r3 = true;
        goto L12
    }
}
