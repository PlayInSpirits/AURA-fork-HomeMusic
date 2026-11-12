package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 extends InputConnectionWrapper {
    public final /* synthetic */ cn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz1(InputConnection inputConnection, cn cnVar) {
        super(inputConnection, false);
        this.a = cnVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        om1 om1Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            om1Var = new om1(2, new mz1(inputContentInfo));
        }
        if (this.a.b(om1Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
