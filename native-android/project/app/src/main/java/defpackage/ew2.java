package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ew2 implements Handler.Callback {
    public final dw2 n = new dw2(this);
    public bq o;
    public no2 p;
    public cu4 q;
    public boolean r;
    public final /* synthetic */ fw2 s;

    public ew2(fw2 fw2Var) {
        this.s = fw2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.r) {
            return true;
        }
        int i = message.what;
        if (i == 1) {
            bq bqVarD = this.s.a.d((gn2) message.obj);
            this.o = bqVarD;
            bqVarD.k(this.n, null, ik3.c);
            this.s.c.g(2);
            return true;
        }
        if (i == 2) {
            try {
                no2 no2Var = this.p;
                if (no2Var == null) {
                    bq bqVar = this.o;
                    bqVar.getClass();
                    bqVar.j();
                } else {
                    no2Var.h();
                }
                this.s.c.h(2, 100);
                return true;
            } catch (IOException e) {
                hw2 hw2Var = this.s.e.a;
                synchronized (hw2Var.p) {
                    lb4 lb4Var = hw2Var.r;
                    lb4Var.getClass();
                    lb4Var.m(e);
                    this.s.a();
                    return true;
                }
            }
        }
        if (i == 3) {
            no2 no2Var2 = this.p;
            no2Var2.getClass();
            od2 od2Var = new od2();
            od2Var.a = 0L;
            no2Var2.o(new pd2(od2Var));
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (this.p != null) {
            bq bqVar2 = this.o;
            bqVar2.getClass();
            bqVar2.n(this.p);
        }
        bq bqVar3 = this.o;
        if (bqVar3 != null) {
            bqVar3.o(this.n);
        }
        this.s.c.e();
        gw2 gw2Var = fw2.g;
        synchronized (gw2Var) {
            try {
                int i2 = gw2Var.c - 1;
                gw2Var.c = i2;
                if (i2 == 0) {
                    HandlerThread handlerThread = gw2Var.b;
                    handlerThread.getClass();
                    handlerThread.quit();
                    gw2Var.b = null;
                    gw2Var.a.clear();
                } else {
                    gw2Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.r = true;
        return true;
    }
}
