package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface yf0 {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, kh1 kh1Var, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var);
}
