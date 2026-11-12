package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zw2 extends Handler {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw2(Looper looper, int i) {
        super(looper);
        this.a = i;
        switch (i) {
            case 4:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                yw2 yw2Var = (yw2) message.obj;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    qk qkVar = yw2Var.a;
                    return;
                }
                qk qkVar2 = yw2Var.a;
                Object obj = yw2Var.b[0];
                if (qkVar2.q.get()) {
                    CountDownLatch countDownLatch = qkVar2.s;
                    try {
                        og5 og5Var = qkVar2.t;
                        if (og5Var.h == qkVar2) {
                            SystemClock.uptimeMillis();
                            og5Var.h = null;
                            og5Var.b();
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        countDownLatch.countDown();
                        throw th;
                    }
                    break;
                } else {
                    try {
                        og5 og5Var2 = qkVar2.t;
                        if (og5Var2.g != qkVar2) {
                            if (og5Var2.h == qkVar2) {
                                SystemClock.uptimeMillis();
                                og5Var2.h = null;
                                og5Var2.b();
                            }
                        } else if (!og5Var2.c) {
                            SystemClock.uptimeMillis();
                            og5Var2.g = null;
                            ld2 ld2Var = og5Var2.a;
                            if (ld2Var != null) {
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    ld2Var.k(obj);
                                } else {
                                    ld2Var.i(obj);
                                }
                            }
                        }
                        qkVar2.s.countDown();
                    } catch (Throwable th2) {
                        qkVar2.s.countDown();
                        throw th2;
                    }
                }
                qkVar2.p = 3;
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw2(Looper looper, int i, boolean z) {
        super(looper);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw2(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.a = i;
    }

    public /* synthetic */ zw2() {
        this.a = 1;
    }
}
