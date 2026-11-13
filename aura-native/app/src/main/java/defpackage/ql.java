package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ql {
    public final Context a;
    public final cn b;
    public final Handler c;
    public final ol d;
    public final v9 e;
    public final pl f;
    public nl g;
    public AudioDeviceInfo h;
    public il i;
    public boolean j;

    public ql(Context context, cn cnVar, il ilVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = cnVar;
        this.i = ilVar;
        this.h = audioDeviceInfo;
        Handler q = f35.q(null);
        this.c = q;
        this.d = new ol(this);
        this.e = new v9(2, this);
        nl nlVar = nl.c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new pl(this, q, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(nl nlVar) {
        if (!this.j || nlVar.equals(this.g)) {
            return;
        }
        this.g = nlVar;
        dn dnVar = (dn) this.b.o;
        dnVar.f();
        nl nlVar2 = dnVar.g;
        if (nlVar2 == null || nlVar.equals(nlVar2)) {
            return;
        }
        dnVar.g = nlVar;
        tc2 tc2Var = dnVar.e;
        if (tc2Var != null) {
            tc2Var.f(-1, new kf2(9));
        }
    }
}
