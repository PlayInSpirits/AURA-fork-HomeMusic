package defpackage;

import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wl {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final il d;
    public final boolean e;
    public final Object f;

    public wl(int r4, AudioManager.OnAudioFocusChangeListener r5, Handler r6, il r7, boolean r8) {
        this.a = r4;
        this.c = r6;
        this.d = r7;
        this.e = r8;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) goto L5;
        this.b = new vl(r5, r6);
    L6:
        if (r0 < 26) goto L9;
        this.f = j3.j(j3.h(j3.i(j3.g(j3.f(r4), r7.c()), r8), r5, r6));
        return;
    L9:
        this.f = null;
        return;
    L5:
        this.b = r5;
        goto L6
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof wl) == true) goto L8;
        return false;
    L8:
        wl r6 = (wl) r5;
        if (this.a == r6.a) goto L11;
    L19:
        return false;
    L11:
        if (this.e != r6.e) goto L19;
        if (Objects.equals(this.b, r6.b) == false) goto L19;
        if (Objects.equals(this.c, r6.c) == false) goto L19;
        if (Objects.equals(this.d, r6.d) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.a);
        Boolean r1 = Boolean.valueOf(this.e);
        return Objects.hash(new Object[]{r0, this.b, this.c, this.d, r1});
    }
}
