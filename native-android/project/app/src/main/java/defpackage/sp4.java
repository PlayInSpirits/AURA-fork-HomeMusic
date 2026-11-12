package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sp4 implements Runnable {
    public final /* synthetic */ int n;
    public final tp4 o;

    public /* synthetic */ sp4(tp4 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L44;
            default: goto L4;
        };
    L4:
        tp4 r8 = this.o;
        cx r2 = cx.f();
        String r3 = tp4.x;
        r2.b(r3, "Checking if commands are complete.");
        tp4.c();
        ArrayList r4 = r8.t;
        monitor-enter(r4);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (r8.u == null) goto L15;
        cx.f().b(r3, "Removing command " + r8.u);     // Catch: Throwable -> L11
        if (((Intent) r8.t.remove(0)).equals(r8.u) == false) goto L14;
        r8.u = null;     // Catch: Throwable -> L11
        goto L15
    L14:
        throw new IllegalStateException("Dequeue-d command is not the first.");     // Catch: Throwable -> L11
    L15:
        ia4 r0 = (ia4) r8.o.n;     // Catch: Throwable -> L11
        k60 r1 = r8.s;     // Catch: Throwable -> L11
        Object r5 = r1.p;     // Catch: Throwable -> L11
        monitor-enter(r5);     // Catch: Throwable -> L11
        boolean r6 = r1.o.isEmpty();     // Catch: Throwable -> L39
        monitor-exit(r5);     // Catch: Throwable -> L39
        if (r6 == false) goto L35;
        if (r8.t.isEmpty() == false) goto L35;
        Object r7 = r0.r;     // Catch: Throwable -> L11
        monitor-enter(r7);     // Catch: Throwable -> L11
        boolean r9 = r0.p.isEmpty();     // Catch: Throwable -> L31
        monitor-exit(r7);     // Catch: Throwable -> L31
        if (r9 == false) goto L35;
        cx.f().b(r3, "No more commands & intents.");     // Catch: Throwable -> L11
        SystemAlarmService r10 = r8.v;     // Catch: Throwable -> L11
        if (r10 == null) goto L37;
        r10.a();     // Catch: Throwable -> L11
    L37:
        monitor-exit(r4);     // Catch: Throwable -> L11
        return;
    L31:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L35:
        if (r8.t.isEmpty() == true) goto L37;
        r8.d();     // Catch: Throwable -> L11
        goto L37
    L39:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L44:
        ArrayList r11 = this.o.t;
        monitor-enter(r11);
        tp4 r12 = this.o;     // Catch: Throwable -> L61
        r12.u = (Intent) r12.t.get(0);     // Catch: Throwable -> L61
        monitor-exit(r11);     // Catch: Throwable -> L61
        Intent r13 = this.o.u;
        if (r13 == null) goto L60;
        String r14 = r13.getAction();
        int r15 = this.o.u.getIntExtra("KEY_START_ID", 0);
        cx r16 = cx.f();
        String r17 = tp4.x;
        r16.b(r17, "Processing command " + this.o.u + ", " + r15);
        PowerManager.WakeLock r18 = y85.a(this.o.n, r14 + " (" + r15 + ")");
        int r19 = 1;
        cx.f().b(r17, "Acquiring operation wake lock (" + r14 + ") " + r18);     // Catch: Throwable -> L54
        r18.acquire();     // Catch: Throwable -> L54
        tp4 r20 = this.o;     // Catch: Throwable -> L54
        r20.s.a(r20.u, r15, r20);     // Catch: Throwable -> L54
        cx.f().b(r17, "Releasing operation wake lock (" + r14 + ") " + r18);
        r18.release();
        tp4 r21 = this.o;
        vc5 r22 = (vc5) r21.o.q;
        sp4 r23 = new sp4(r21, r19);
    L53:
        r22.execute(r23);
        return;
    L54:
        th = move-exception;
        cx r24 = cx.f();     // Catch: Throwable -> L57
        String r25 = tp4.x;     // Catch: Throwable -> L57
        r24.e(r25, "Unexpected error in onHandleIntent", th);     // Catch: Throwable -> L57
        cx.f().b(r25, "Releasing operation wake lock (" + r14 + ") " + r18);
        r18.release();
        tp4 r26 = this.o;
        r22 = (vc5) r26.o.q;
        r23 = new sp4(r26, r19);
    L57:
        th = move-exception;
        cx.f().b(tp4.x, "Releasing operation wake lock (" + r14 + ") " + r18);
        r18.release();
        tp4 r27 = this.o;
        ((vc5) r27.o.q).execute(new sp4(r27, r19));
        throw th;
    L60:
        return;
    L61:
        th = move-exception;
        throw th;
    }
}
