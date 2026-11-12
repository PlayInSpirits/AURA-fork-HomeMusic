package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class AndroidMainExecutor implements Executor {
    private final Handler handler;

    public AndroidMainExecutor() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r1) {
        this.handler.post(r1);
    }
}
