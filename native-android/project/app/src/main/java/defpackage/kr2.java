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
    public final Bundle e;
    public ei3 g;
    public List h;
    public eo2 i;
    public int j;
    public int k;
    public ir2 l;
    public ms2 m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public kr2(Context context, String str, Bundle bundle) {
        MediaSession mediaSessionA = a(context, str, bundle);
        this.a = mediaSessionA;
        jr2 jr2Var = new jr2(this);
        this.b = jr2Var;
        this.c = new pr2(mediaSessionA.getSessionToken(), jr2Var);
        this.e = bundle;
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public ms2 b() {
        ms2 ms2Var;
        synchronized (this.d) {
            ms2Var = this.m;
        }
        return ms2Var;
    }

    public void c(ms2 ms2Var) {
        synchronized (this.d) {
            this.m = ms2Var;
        }
    }
}
