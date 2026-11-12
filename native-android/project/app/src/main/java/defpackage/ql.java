package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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

    public ql(Context r2, cn r3, il r4, AudioDeviceInfo r5) {
        Context r6 = r2.getApplicationContext();
        this.a = r6;
        this.b = r3;
        this.i = r4;
        this.h = r5;
        pl r7 = null;
        Handler r8 = f35.q(null);
        this.c = r8;
        this.d = new ol(this);
        this.e = new v9(2, this);
        nl r9 = nl.c;
        String r10 = Build.MANUFACTURER;
        if (r10.equals("Amazon") == false) goto L5;
    L8:
        Uri r11 = Settings.Global.getUriFor("external_surround_sound_enabled");
    L9:
        if (r11 == null) goto L11;
        r7 = new pl(this, r8, r6.getContentResolver(), r11);
    L11:
        this.f = r7;
        return;
    L5:
        if (r10.equals("Xiaomi") == true) goto L8;
        r11 = null;
        goto L9
    }

    public final void a(nl r2) {
        if (this.j == true) goto L5;
        return;
    L5:
        if (r2.equals(this.g) == true) goto L15;
        this.g = r2;
        dn r1 = (dn) this.b.o;
        r1.f();
        nl r0 = r1.g;
        if (r0 != null) goto L9;
        return;
    L9:
        if (r2.equals(r0) == true) goto L17;
        r1.g = r2;
        tc2 r3 = r1.e;
        if (r3 == null) goto L18;
        r3.f(-1, new kf2(9));
        return;
    L18:
        return;
    L17:
        return;
    }
}
