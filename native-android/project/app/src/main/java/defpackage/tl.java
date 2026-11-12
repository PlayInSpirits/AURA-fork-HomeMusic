package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public final go4 a;
    public final Handler b;
    public q41 c;
    public il d;
    public int e;
    public int f;
    public float g;
    public wl h;

    public tl(Context r3, Looper r4, q41 r5) {
        this.g = 1.0f;
        this.a = au0.L(new sl(0, r3));
        this.c = r5;
        this.b = new Handler(r4);
        this.e = 0;
    }

    public final void a() {
        int r0 = this.e;
        if (r0 == 1) goto L14;
        if (r0 != 0) goto L7;
        return;
    L7:
        if (this.h == null) goto L15;
        AudioManager r1 = (AudioManager) this.a.get();
        wl r3 = this.h;
        if (Build.VERSION.SDK_INT < 26) goto L12;
        Object r4 = r3.f;
        r4.getClass();
        j3.b(r1, j3.k(r4));
        return;
    L12:
        r1.abandonAudioFocus(r3.b);
        return;
    L15:
        return;
    }

    public final void b(int r2) {
        if (this.e == r2) goto L17;
        this.e = r2;
        if (r2 != 4) goto L8;
        float r3 = 0.2f;
    L10:
        if (this.g == r3) goto L18;
        this.g = r3;
        q41 r1 = this.c;
        if (r1 == null) goto L16;
        r1.u.g(34);
        return;
    L16:
        return;
    L18:
        return;
    L8:
        r3 = 1.0f;
        goto L10
    }

    public final int c(int r13, boolean r14) {
        int r0 = 0;
        if (r13 == 1) goto L49;
        int r15 = this.f;
        if (r15 != 1) goto L49;
        int r2 = this.e;
        if (r14 == true) goto L9;
        if (r2 == 1) goto L48;
        if (r2 == 3) goto L47;
    L46:
        return 1;
    L47:
        return 0;
    L48:
        return -1;
    L9:
        if (r2 == 2) goto L46;
        wl r3 = this.h;
        if (r3 != null) goto L24;
        if (r3 != null) goto L16;
        i r4 = new i();
        r4.c = il.i;
        r4.a = r15;
    L17:
        il r16 = this.d;
        if (r16 != null) goto L20;
    L22:
        boolean r5 = false;
    L23:
        r16.getClass();
        r4.c = r16;
        r4.b = r5;
        AudioManager.OnAudioFocusChangeListener r8 = new rl(this);
        Handler r9 = this.b;
        r9.getClass();
        this.h = new wl(r4.a, r8, r9, (il) r4.c, r4.b);
        goto L24
    L20:
        if (r16.a != 1) goto L22;
        r5 = true;
        goto L23
    L16:
        i r17 = new i();
        r17.a = r3.a;
        r17.c = r3.d;
        r17.b = r3.e;
        r4 = r17;
    L24:
        AudioManager r18 = (AudioManager) this.a.get();
        wl r6 = this.h;
        if (Build.VERSION.SDK_INT < 26) goto L27;
        Object r1 = r6.f;
        r1.getClass();
        int r19 = j3.C(r18, j3.k(r1));
    L39:
        if (r19 != 1) goto L42;
        b(2);
        return 1;
    L42:
        b(1);
        return -1;
    L27:
        AudioManager.OnAudioFocusChangeListener r7 = r6.b;
        il r10 = r6.d;
        if ((r10.b & 1) != 1) goto L31;
    L29:
        r0 = 1;
    L38:
        r19 = r18.requestAudioFocus(r7, r0, r6.a);
        goto L39
    L31:
        switch(r10.c) {
            case 2: goto L38;
            case 3: goto L37;
            case 4: goto L36;
            case 5: goto L35;
            case 6: goto L34;
            case 7: goto L35;
            case 8: goto L35;
            case 9: goto L35;
            case 10: goto L35;
            case 11: goto L33;
            case 12: goto L32;
            case 13: goto L29;
            default: goto L32;
        };
    L32:
        r0 = 3;
        goto L38
    L33:
        r0 = 10;
        goto L38
    L34:
        r0 = 2;
        goto L38
    L35:
        r0 = 5;
        goto L38
    L36:
        r0 = 4;
        goto L38
    L37:
        r0 = 8;
    L49:
        a();
        b(0);
        return 1;
    }
}
