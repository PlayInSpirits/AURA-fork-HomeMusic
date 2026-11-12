package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wz0 implements Runnable {
    public final /* synthetic */ int n;

    public /* synthetic */ wz0(int i) {
        this.n = i;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                try {
                    Method method = ov4.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (tz0.c()) {
                        tz0.a().d();
                        break;
                    }
                    return;
                } finally {
                    Method method2 = ov4.b;
                    Trace.endSection();
                }
            default:
                return;
        }
    }
}
