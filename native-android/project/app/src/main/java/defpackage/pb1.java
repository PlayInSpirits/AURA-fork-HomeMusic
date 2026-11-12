package defpackage;

import androidx.compose.runtime.internal.PlatformOptimizedCancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 extends PlatformOptimizedCancellationException {
    public pb1(int r1) {
        switch(r1) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        super("rememberCoroutineScope left the composition");
        return;
    L5:
        super("The coroutine scope left the composition");
    }
}
