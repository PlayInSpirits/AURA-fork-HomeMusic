/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import defpackage.il;
import defpackage.j3;
import defpackage.vl;
import java.util.Objects;

public final class wl {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final il d;
    public final boolean e;
    public final Object f;

    public wl(int n16, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, il il5, boolean bl5) {
        this.a = n16;
        this.c = handler;
        this.d = il5;
        this.e = bl5;
        int n17 = Build.VERSION.SDK_INT;
        this.b = n17 < 26 ? new vl(onAudioFocusChangeListener, handler) : onAudioFocusChangeListener;
        if (n17 >= 26) {
            this.f = j3.j(j3.h(j3.i(j3.g(j3.f(n16), il5.c()), bl5), onAudioFocusChangeListener, handler));
            return;
        }
        this.f = null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof wl)) {
            return false;
        }
        object = (wl)object;
        return this.a == ((wl)object).a && this.e == ((wl)object).e && Objects.equals(this.b, ((wl)object).b) && Objects.equals(this.c, ((wl)object).c) && Objects.equals(this.d, ((wl)object).d);
    }

    public final int hashCode() {
        int n16 = this.a;
        boolean bl5 = this.e;
        return Objects.hash(n16, this.b, this.c, this.d, bl5);
    }
}

