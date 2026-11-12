package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface yf0 {
    boolean isAvailableOnDevice();

    void onGetCredential(Context r1, kh1 r2, CancellationSignal r3, Executor r4, vf0 r5);
}
