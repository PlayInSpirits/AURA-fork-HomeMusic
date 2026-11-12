package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gj2 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final cj2 d;
    public final oi e;
    public xc5 f;
    public Messenger g;
    public pr2 h;

    public gj2(Context r3, ComponentName r4, z05 r5, Bundle r6) {
        this.d = new cj2(this);
        this.e = new oi(0);
        this.a = r3;
        if (r6 == null) goto L5;
        Bundle r0 = new Bundle(r6);
    L6:
        this.c = r0;
        r0.putInt("extra_client_version", 1);
        r0.putInt("extra_calling_pid", Process.myPid());
        r5.p = this;
        dj2 r7 = (dj2) r5.o;
        r7.getClass();
        this.b = new MediaBrowser(r3, r4, r7, r0);
        return;
    L5:
        r0 = new Bundle();
        goto L6
    }
}
