package defpackage;

import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i55 {
    public static /* bridge */ /* synthetic */ void a(Choreographer r0, j55 r1) {
        r0.removeVsyncCallback(r1);
    }

    public static /* bridge */ /* synthetic */ void b(Choreographer r0, Choreographer$VsyncCallback r1) {
        r0.postVsyncCallback(r1);
    }
}
