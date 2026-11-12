package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 implements n51 {
    public static final int[] h = null;
    public static final rm3 i = null;
    public static final rm3 j = null;
    public int b;
    public gy3 c;
    public boolean d;
    public om0 e;
    public int f;
    public int g;

    static {
        h = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
        i = new rm3(new mj0(2));
        j = new rm3(new mj0(3));
    }

    public sk0() {
        this.e = new om0(1);
        this.d = true;
    }

    @Override // defpackage.n51
    public final void a(om0 r1) {
        monitor-enter(this);
        this.e = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.n51
    public final void b() {
        monitor-enter(this);
        monitor-exit(this);
    }

    @Override // defpackage.n51
    public final synchronized k51[] c() {
        monitor-enter(this);
        k51[] r0 = e(Uri.EMPTY, new HashMap());     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.n51
    public final void d(boolean r1) {
        monitor-enter(this);
        this.d = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.n51
    public final synchronized k51[] e(Uri r7, Map r8) {
        monitor-enter(this);
        int[] r1 = h;     // Catch: Throwable -> L13
        ArrayList r0 = new ArrayList(21);     // Catch: Throwable -> L13
        List r9 = (List) r8.get("Content-Type");     // Catch: Throwable -> L13
        if (r9 != null) goto L6;
    L9:
        String r10 = null;
    L10:
        int r11 = h12.x(r10);     // Catch: Throwable -> L13
        if (r11 == (-1)) goto L15;
        f(r11, r0);     // Catch: Throwable -> L13
    L15:
        int r12 = h12.y(r7);     // Catch: Throwable -> L13
        if (r12 == (-1)) goto L19;
        if (r12 == r11) goto L19;
        f(r12, r0);     // Catch: Throwable -> L13
    L19:
        int r4 = 0;
    L20:
        if (r4 >= 21) goto L26;
        int r5 = r1[r4];     // Catch: Throwable -> L13
        if (r5 == r11) goto L25;
        if (r5 == r12) goto L25;
        f(r5, r0);     // Catch: Throwable -> L13
    L25:
        r4 = r4 + 1;     // Catch: Throwable -> L13
        goto L20
    L26:
        k51[] r13 = (k51[]) r0.toArray(new k51[0]);     // Catch: Throwable -> L13
        monitor-exit(this);
        return r13;
    L6:
        if (r9.isEmpty() == true) goto L9;
        r10 = (String) r9.get(0);     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;
    }

    public final void f(int r10, ArrayList r11) {
        int r1 = 0;
        switch(r10) {
            case 0: goto L66;
            case 1: goto L64;
            case 2: goto L62;
            case 3: goto L60;
            case 4: goto L54;
            case 5: goto L52;
            case 6: goto L46;
            case 7: goto L44;
            case 8: goto L34;
            case 9: goto L32;
            case 10: goto L30;
            case 11: goto L26;
            case 12: goto L23;
            case 13: goto L69;
            case 14: goto L21;
            case 15: goto L17;
            case 16: goto L15;
            case 17: goto L13;
            case 18: goto L11;
            case 19: goto L9;
            case 20: goto L7;
            case 21: goto L5;
            default: goto L69;
        };
    L5:
        r11.add(new go(0));
        return;
    L7:
        r11.add(new xl1(this.g));
        return;
    L9:
        r11.add(new kt(0));
        return;
    L11:
        r11.add(new go(1));
        return;
    L13:
        r11.add(new kt(1));
        return;
    L15:
        r11.add(new co(1 ^ (this.d ? 1 : 0), this.e));
        return;
    L17:
        k51 r9 = j.E(new Object[0]);
        if (r9 == null) goto L68;
        r11.add(r9);
        return;
    L68:
        return;
    L21:
        r11.add(new cm0(this.f));
        return;
    L23:
        r11.add(new d95());
        return;
    L30:
        r11.add(new ur3());
        return;
    L32:
        r11.add(new i83());
        return;
    L34:
        om0 r0 = this.e;
        if (this.d == false) goto L37;
        int r2 = 0;
    L38:
        vw1 r3 = yw1.o;
        r11.add(new oe1(r0, r2, null, gy3.r));
        om0 r4 = this.e;
        int r5 = this.b;
        if (this.d == true) goto L42;
        r1 = 16;
    L42:
        r11.add(new sy2(r4, r5 | r1));
        return;
    L37:
        r2 = 32;
        goto L38
    L44:
        r11.add(new ky2(0));
        return;
    L46:
        om0 r6 = this.e;
        if (this.d == true) goto L50;
        r1 = 2;
    L50:
        r11.add(new ni2(r6, r1));
        return;
    L52:
        r11.add(new n91());
        return;
    L54:
        k51 r12 = i.E(new Object[]{0});
        if (r12 == null) goto L58;
        r11.add(r12);
        return;
    L58:
        r11.add(new s71());
        return;
    L60:
        r11.add(new p9());
        return;
    L62:
        r11.add(new h6(0));
        return;
    L64:
        r11.add(new t2());
        return;
    L66:
        r11.add(new r2());
        return;
    L69:
        return;
    L26:
        if (this.c != null) goto L28;
        vw1 r13 = yw1.o;
        this.c = gy3.r;
    L28:
        r11.add(new qy4(1, !this.d ? 1 : 0, this.e, new iu4(0), new qn0(this.c, 0)));
    }
}
