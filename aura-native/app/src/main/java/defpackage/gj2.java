package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class gj2 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final cj2 d = new cj2(this);
    public final oi e = new oi(0);
    public xc5 f;
    public Messenger g;
    public pr2 h;

    public gj2(Context context, ComponentName componentName, z05 z05Var, Bundle bundle) {
        this.a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        z05Var.p = this;
        dj2 dj2Var = (dj2) z05Var.o;
        dj2Var.getClass();
        this.b = new MediaBrowser(context, componentName, dj2Var, bundle2);
    }
}
