package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn3 {
    public final List a;
    public final gp3 b;
    public int c;

    public kn3(List r12, gp3 r13) {
        this.a = r12;
        this.b = r13;
        int r14 = Build.VERSION.SDK_INT;
        if (r14 < 29) goto L7;
        MotionEvent r0 = a();
        if (r0 == null) goto L7;
        ek2.x(r0);
    L7:
        MotionEvent r1 = a();
        if (r1 == null) goto L10;
        r1.getButtonState();
    L10:
        MotionEvent r2 = a();
        if (r2 == null) goto L13;
        r2.getMetaState();
    L13:
        MotionEvent r3 = a();
        int r4 = 0;
        if (r3 != null) goto L16;
        int r15 = r12.size();
    L68:
        if (r4 >= r15) goto L56;
        on3 r5 = (on3) r12.get(r4);
        if (gi1.i(r5) == true) goto L44;
        if (gi1.g(r5) == true) goto L51;
        r4 = r4 + 1;
    L51:
        r4 = 1;
    L76:
        this.c = r4;
        return;
    L44:
        r4 = 2;
    L56:
        r4 = 3;
        goto L76
    L16:
        if (r14 >= 34) goto L18;
    L20:
        boolean r6 = false;
    L22:
        if (r14 >= 34) goto L24;
    L26:
        boolean r16 = false;
    L27:
        int r17 = r3.getActionMasked();
        if (r17 != 0) goto L30;
        if (r6 == true) goto L46;
        if (r16 == false) goto L51;
        if (r16 == true) goto L51;
    L48:
        r4 = 7;
    L46:
        r4 = 10;
        goto L76
    L30:
        if (r17 != 1) goto L32;
        if (r6 == true) goto L39;
        if (r16 == false) goto L44;
        if (r16 == true) goto L44;
    L41:
        r4 = 9;
    L39:
        r4 = 12;
        goto L76
    L32:
        if (r17 == 2) goto L52;
        switch(r17) {
            case 5: goto L45;
            case 6: goto L38;
            case 7: goto L52;
            case 8: goto L37;
            case 9: goto L36;
            case 10: goto L35;
            default: goto L76;
        };
    L35:
        r4 = 5;
        goto L76
    L36:
        r4 = 4;
        goto L76
    L37:
        r4 = 6;
        goto L76
    L38:
        if (r6 == true) goto L39;
        if (r16 == true) goto L41;
        if (r16 == false) goto L44;
    L43:
        r4 = 8;
        goto L76
    L45:
        if (r6 == true) goto L46;
        if (r16 == true) goto L48;
        if (r16 == false) goto L51;
    L52:
        if (r6 == false) goto L54;
        r4 = 11;
        goto L76
    L54:
        if (r16 == false) goto L56;
    L24:
        if (ek2.x(r3) != 5) goto L26;
        r16 = true;
        goto L27
    L18:
        if (ek2.x(r3) != 3) goto L20;
        r6 = true;
        goto L22
    }

    public final MotionEvent a() {
        gp3 r0 = this.b;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (MotionEvent) ((rf2) r0.p).o;
    }
}
