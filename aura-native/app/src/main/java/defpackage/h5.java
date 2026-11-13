package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h5 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ h5(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new g5(0, runnable), "glide-active-resources");
            case 1:
                return new rk(runnable);
            default:
                return new xz3(runnable);
        }
    }
}
