package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.service.MediaService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class is3 {
    public static final Handler a = null;
    public static final WeakHashMap b = null;
    public static MediaService c;
    public static boolean d;
    public static final k03 e = null;
    public static final u6 f = null;

    static {
        a = new Handler(Looper.getMainLooper());
        b = new WeakHashMap();
        e = new k03(Boolean.FALSE);
        f = new u6(17);
    }

    public static final void a(qi3 r11, ao2 r12) {
        r11.getClass();
        r12.getClass();
        Handler r0 = a;
        u6 r1 = f;
        r0.removeCallbacks(r1);
        gn2 r2 = r11.a();
        int r3 = e(r11);
        boolean r4 = b.h(r11);
        k03 r5 = e;
        if (r4 == false) goto L5;
    L50:
        if (r3 <= 0) goto L57;
        r5.k(Boolean.FALSE);
        return;
    L57:
        return;
    L5:
        if (a.j(r11) == true) goto L50;
        if (r2 == null) goto L46;
        boolean r6 = xa3.u("continuous_play", true);
        int r7 = r11.h();
        boolean r8 = c(r2);
        if (r6 == false) goto L46;
        if (r8 == false) goto L46;
        if (r7 != 0) goto L46;
        if (r3 >= 7) goto L46;
        if (bo2.c.get() == false) goto L18;
        return;
    L18:
        if (d == false) goto L21;
        r5.k(Boolean.FALSE);
        return;
    L21:
        gn2 r9 = r11.a();
        if (r9 != null) goto L24;
        r9 = null;
    L38:
        if (r9 != null) goto L41;
        return;
    L41:
        if (ud3.T() == true) goto L44;
        r0.postDelayed(r1, 11000);
        return;
    L44:
        Log.d("QueueAhead", r3 + " track(s) ahead: continuous play from " + r9.a);
        bo2.c(r9, r12, null);
        return;
    L24:
        int[] r10 = d(r11);
        int r13 = ti.l0(r10, r11.o0());
        ArrayList r14 = new ArrayList(r10.length);
        int r15 = r10.length;
        int r16 = 0;
    L25:
        if (r16 >= r15) goto L27;
        r14.add(r11.Y(r10[r16]).a);
        r16 = r16 + 1;
        goto L25
    L27:
        int r17 = -1;
        if (r13 >= 0) goto L30;
    L36:
        if (r17 < 0) goto L38;
        r9 = r11.Y(r10[r17]);
        goto L38
    L30:
        if (r13 >= r14.size()) goto L36;
    L31:
        if ((-1) >= r13) goto L36;
        if (ot1.c((String) r14.get(r13)) == false) goto L34;
        r13 = r13 - 1;
        goto L31
    L34:
        r17 = r13;
    L46:
        if (r3 > 0) goto L48;
        if (r2 == null) goto L48;
        return;
    L48:
        r5.k(Boolean.FALSE);
    }

    public static final void b(qi3 r3, int r4, int r5) {
        if (r5 > 0) goto L4;
        boolean r0 = true;
    L5:
        d = r0;
        k03 r1 = e;
        if (r3 == null) goto L16;
        if (r5 <= 0) goto L16;
        if (r4 < 0) goto L16;
        if (r4 >= r3.Q0()) goto L16;
        if (h12.c(r1.d(), Boolean.TRUE) == false) goto L14;
    L15:
        r3.n(r4, 0);
        r3.b();
        r3.m0();
        goto L16
    L14:
        if (r3.g() == 4) goto L15;
    L16:
        r1.k(Boolean.FALSE);
        return;
    L4:
        r0 = false;
        goto L5
    }

    public static boolean c(gn2 r3) {
        Bundle r0 = r3.d.I;
        if (r0 == null) goto L5;
        String r1 = r0.getString("type");
    L7:
        if (h12.c(r1, WaveOrigin.RADIO) == false) goto L9;
    L16:
        return false;
    L9:
        if (h12.c(r1, "podcast") == true) goto L16;
        if (h12.c(r1, "audiobook") == true) goto L16;
        String r4 = r3.a;
        r4.getClass();
        if (xm4.k0(r4, "ir-", false) == true) goto L16;
        return true;
    L5:
        r1 = null;
        goto L7
    }

    public static final int[] d(qi3 r7) {
        r7.getClass();
        cu4 r0 = r7.x0();
        r0.getClass();
        if (r0.p() == true) goto L5;
        boolean r8 = r7.D0();
        int r1 = r0.o();
        int[] r3 = new int[r1];
        int r4 = r0.a(r8);
        int r5 = 0;
    L8:
        if (r4 == (-1)) goto L11;
        if (r5 >= r1) goto L11;
        r3[r5] = r4;
        r4 = r0.e(r4, 0, r8);
        r5 = r5 + 1;
    L11:
        if (r5 != r1) goto L14;
        return r3;
    L14:
        return Arrays.copyOf(r3, r5);
    L5:
        return new int[0];
    }

    public static final int e(qi3 r6) {
        r6.getClass();
        cu4 r0 = r6.x0();
        r0.getClass();
        int r1 = r6.o0();
        if (r0.p() == false) goto L5;
    L16:
        return 0;
    L5:
        if (r1 == (-1)) goto L16;
        if (r1 >= r0.o()) goto L16;
        int r4 = 0;
    L11:
        if (r4 >= 7) goto L15;
        r1 = r0.e(r1, 0, r6.D0());
        if (r1 == (-1)) goto L15;
        r4 = r4 + 1;
    L15:
        return r4;
    }
}
