package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sp4 implements Runnable {
    public final /* synthetic */ int n;
    public final tp4 o;

    public /* synthetic */ sp4(tp4 tp4Var, int i) {
        this.n = i;
        this.o = tp4Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005c, B:20:0x0066, B:22:0x006e, B:23:0x0070, B:27:0x007a, B:29:0x0087, B:37:0x0099, B:33:0x008d, B:34:0x008e, B:36:0x0096, B:41:0x009d, B:24:0x0071, B:25:0x0077, B:17:0x005d, B:18:0x0063), top: B:68:0x001b, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0096 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005c, B:20:0x0066, B:22:0x006e, B:23:0x0070, B:27:0x007a, B:29:0x0087, B:37:0x0099, B:33:0x008d, B:34:0x008e, B:36:0x0096, B:41:0x009d, B:24:0x0071, B:25:0x0077, B:17:0x005d, B:18:0x0063), top: B:68:0x001b, inners: #3, #4 }] */
    @Override // java.lang.Runnable
    public final void run() {
        vc5 vc5Var;
        sp4 sp4Var;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.n) {
            case 0:
                synchronized (this.o.t) {
                    tp4 tp4Var = this.o;
                    tp4Var.u = (Intent) tp4Var.t.get(0);
                    break;
                }
                Intent intent = this.o.u;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.o.u.getIntExtra("KEY_START_ID", 0);
                    cx cxVarF = cx.f();
                    String str = tp4.x;
                    cxVarF.b(str, "Processing command " + this.o.u + ", " + intExtra);
                    PowerManager.WakeLock wakeLockA = y85.a(this.o.n, action + " (" + intExtra + ")");
                    int i = 1;
                    try {
                        cx.f().b(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.acquire();
                        tp4 tp4Var2 = this.o;
                        tp4Var2.s.a(tp4Var2.u, intExtra, tp4Var2);
                        cx.f().b(str, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        tp4 tp4Var3 = this.o;
                        vc5Var = (vc5) tp4Var3.o.q;
                        sp4Var = new sp4(tp4Var3, i);
                    } catch (Throwable th) {
                        try {
                            cx cxVarF2 = cx.f();
                            String str2 = tp4.x;
                            cxVarF2.e(str2, "Unexpected error in onHandleIntent", th);
                            cx.f().b(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                            wakeLockA.release();
                            tp4 tp4Var4 = this.o;
                            vc5Var = (vc5) tp4Var4.o.q;
                            sp4Var = new sp4(tp4Var4, i);
                        } catch (Throwable th2) {
                            cx.f().b(tp4.x, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                            wakeLockA.release();
                            tp4 tp4Var5 = this.o;
                            ((vc5) tp4Var5.o.q).execute(new sp4(tp4Var5, i));
                            throw th2;
                        }
                    }
                    vc5Var.execute(sp4Var);
                    return;
                }
                return;
            default:
                tp4 tp4Var6 = this.o;
                cx cxVarF3 = cx.f();
                String str3 = tp4.x;
                cxVarF3.b(str3, "Checking if commands are complete.");
                tp4.c();
                synchronized (tp4Var6.t) {
                    try {
                        if (tp4Var6.u != null) {
                            cx.f().b(str3, "Removing command " + tp4Var6.u);
                            if (!((Intent) tp4Var6.t.remove(0)).equals(tp4Var6.u)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            tp4Var6.u = null;
                        }
                        ia4 ia4Var = (ia4) tp4Var6.o.n;
                        k60 k60Var = tp4Var6.s;
                        synchronized (k60Var.p) {
                            zIsEmpty = k60Var.o.isEmpty();
                            break;
                        }
                        if (zIsEmpty && tp4Var6.t.isEmpty()) {
                            synchronized (ia4Var.r) {
                                zIsEmpty2 = ia4Var.p.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                cx.f().b(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = tp4Var6.v;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            } else if (!tp4Var6.t.isEmpty()) {
                                tp4Var6.d();
                            }
                        } else if (!tp4Var6.t.isEmpty()) {
                            tp4Var6.d();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
