package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ai1 implements Handler.Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ai1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r8) {
        switch(this.n) {
            case 0: goto L57;
            case 1: goto L43;
            default: goto L4;
        };
    L4:
        int r4 = r8.what;
        if (r4 == 0) goto L26;
        if (r4 != 1) goto L70;
        HashMap r5 = ((tk5) this.o).a;
        monitor-enter(r5);
        nk5 r9 = (nk5) r8.obj;     // Catch: Throwable -> L17
        pk5 r7 = (pk5) ((tk5) this.o).a.get(r9);     // Catch: Throwable -> L17
        if (r7 != null) goto L13;
    L22:
        monitor-exit(r5);     // Catch: Throwable -> L17
        return true;
    L13:
        if (r7.o != 3) goto L22;
        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(r9)), new Exception());     // Catch: Throwable -> L17
        ComponentName r0 = r7.s;     // Catch: Throwable -> L17
        if (r0 != null) goto L19;
        r9.getClass();     // Catch: Throwable -> L17
        r0 = null;
    L19:
        if (r0 != null) goto L21;
        String r10 = r9.b;     // Catch: Throwable -> L17
        ji2.m(r10);     // Catch: Throwable -> L17
        r0 = new ComponentName(r10, "unknown");     // Catch: Throwable -> L17
    L21:
        r7.onServiceDisconnected(r0);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    L70:
        return false;
    L26:
        HashMap r1 = ((tk5) this.o).a;
        monitor-enter(r1);
        nk5 r11 = (nk5) r8.obj;     // Catch: Throwable -> L36
        pk5 r6 = (pk5) ((tk5) this.o).a.get(r11);     // Catch: Throwable -> L36
        if (r6 != null) goto L31;
    L38:
        monitor-exit(r1);     // Catch: Throwable -> L36
        return true;
    L31:
        if (r6.n.isEmpty() == false) goto L38;
        if (r6.p == false) goto L35;
        nk5 r12 = r6.r;     // Catch: Throwable -> L36
        r6.t.c.removeMessages(1, r12);     // Catch: Throwable -> L36
        tk5 r13 = r6.t;     // Catch: Throwable -> L36
        r13.d.o(r13.b, r6);     // Catch: Throwable -> L36
        r6.p = false;     // Catch: Throwable -> L36
        r6.o = 2;     // Catch: Throwable -> L36
    L35:
        ((tk5) this.o).a.remove(r11);     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        throw th;
    L57:
        bi1 r14 = (bi1) this.o;
        int r2 = r8.what;
        if (r2 != 1) goto L60;
        r14.b((zh1) r8.obj);
        return true;
    L60:
        if (r2 != 2) goto L63;
        zh1 r15 = (zh1) r8.obj;
        r14.d.q(r15);
    L63:
        return false;
    L43:
        if (r8.what != 0) goto L72;
        na4 r16 = (na4) this.o;
        rg4 r17 = (rg4) r8.obj;
        Object r3 = r16.n;
        monitor-enter(r3);
    L54:
        th = move-exception;
        throw th;
    L48:
        if (((rg4) r16.p) != r17) goto L50;
    L51:
        r16.j(r17, 2);     // Catch: Throwable -> L54
    L52:
        monitor-exit(r3);     // Catch: Throwable -> L54
        return true;
    L50:
        if (((rg4) r16.q) != r17) goto L52;
    L72:
        return false;
    }
}
