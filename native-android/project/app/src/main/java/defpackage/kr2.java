package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class kr2 {
    public final MediaSession a;
    public final jr2 b;
    public final pr2 c;
    public final Object d;
    public final Bundle e;
    public final RemoteCallbackList f;
    public ei3 g;
    public List h;
    public eo2 i;
    public int j;
    public int k;
    public ir2 l;
    public ms2 m;

    public kr2(Context r3, String r4, Bundle r5) {
        this.d = new Object();
        this.f = new RemoteCallbackList();
        MediaSession r6 = a(r3, r4, r5);
        this.a = r6;
        jr2 r7 = new jr2(this);
        this.b = r7;
        this.c = new pr2(r6.getSessionToken(), r7);
        this.e = r5;
        r6.setFlags(3);
    }

    public MediaSession a(Context r1, String r2, Bundle r3) {
        return new MediaSession(r1, r2);
    }

    public ms2 b() {
        Object r0 = this.d;
        monitor-enter(r0);
        ms2 r1 = this.m;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public void c(ms2 r2) {
        Object r0 = this.d;
        monitor-enter(r0);
        this.m = r2;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
