package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sp4 implements Runnable {
    public final /* synthetic */ int n;
    public final tp4 o;

    public /* synthetic */ sp4(tp4 tp4Var, int i) {
        this.n = i;
        this.o = tp4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vc5 vc5Var;
        sp4 sp4Var;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.n) {
            case 0:
                synchronized (this.o.t) {
                    tp4 tp4Var = this.o;
                    tp4Var.u = (Intent) tp4Var.t.get(0);
                }
                Intent intent = this.o.u;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.o.u.getIntExtra("KEY_START_ID", 0);
                    cx f = cx.f();
                    String str = tp4.x;
                    f.b(str, "Processing command " + this.o.u + ", " + intExtra);
                    PowerManager.WakeLock a = y85.a(this.o.n, action + " (" + intExtra + ")");
                    int i = 1;
                    try {
                        cx.f().b(str, "Acquiring operation wake lock (" + action + ") " + a);
                        a.acquire();
                        tp4 tp4Var2 = this.o;
                        tp4Var2.s.a(tp4Var2.u, intExtra, tp4Var2);
                        cx.f().b(str, "Releasing operation wake lock (" + action + ") " + a);
                        a.release();
                        tp4 tp4Var3 = this.o;
                        vc5Var = (vc5) tp4Var3.o.q;
                        sp4Var = new sp4(tp4Var3, i);
                    } catch (Throwable th) {
                        try {
                            cx f2 = cx.f();
                            String str2 = tp4.x;
                            f2.e(str2, "Unexpected error in onHandleIntent", th);
                            cx.f().b(str2, "Releasing operation wake lock (" + action + ") " + a);
                            a.release();
                            tp4 tp4Var4 = this.o;
                            vc5Var = (vc5) tp4Var4.o.q;
                            sp4Var = new sp4(tp4Var4, i);
                        } catch (Throwable th2) {
                            cx.f().b(tp4.x, "Releasing operation wake lock (" + action + ") " + a);
                            a.release();
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
                cx f3 = cx.f();
                String str3 = tp4.x;
                f3.b(str3, "Checking if commands are complete.");
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
                            isEmpty = k60Var.o.isEmpty();
                        }
                        if (isEmpty && tp4Var6.t.isEmpty()) {
                            synchronized (ia4Var.r) {
                                isEmpty2 = ia4Var.p.isEmpty();
                            }
                            if (isEmpty2) {
                                cx.f().b(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = tp4Var6.v;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            }
                        }
                        if (!tp4Var6.t.isEmpty()) {
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
