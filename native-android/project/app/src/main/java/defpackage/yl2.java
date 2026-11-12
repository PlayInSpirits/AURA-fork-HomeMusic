package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl2 implements ServiceConnection {
    public final Bundle n;
    public final /* synthetic */ bm2 o;

    public yl2(bm2 bm2Var, Bundle bundle) {
        this.o = bm2Var;
        this.n = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        bm2 bm2Var = this.o;
        sk2 sk2VarF1 = bm2Var.f1();
        sk2 sk2VarF2 = bm2Var.f1();
        Objects.requireNonNull(sk2VarF2);
        sk2VarF1.a1(new qa1(18, sk2VarF2));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        sk2 sk2VarF1;
        qa1 qa1Var;
        bm2 bm2Var = this.o;
        cb4 cb4Var = bm2Var.e;
        int i = 18;
        try {
            try {
                if (cb4Var.a.g().equals(componentName.getPackageName())) {
                    su1 su1VarM = qs2.m(iBinder);
                    if (su1VarM != null) {
                        String packageName = bm2Var.d.getPackageName();
                        int iMyPid = Process.myPid();
                        Bundle bundle = this.n;
                        bm2Var.a.getClass();
                        su1VarM.k0(bm2Var.c, new ja0(packageName, iMyPid, bundle).b());
                        return;
                    }
                    l93.F("MCImplBase", "Service interface is missing.");
                    sk2VarF1 = bm2Var.f1();
                    sk2 sk2VarF2 = bm2Var.f1();
                    Objects.requireNonNull(sk2VarF2);
                    qa1Var = new qa1(i, sk2VarF2);
                } else {
                    l93.F("MCImplBase", "Expected connection to " + cb4Var.a.g() + " but is connected to " + componentName);
                    sk2VarF1 = bm2Var.f1();
                    sk2 sk2VarF3 = bm2Var.f1();
                    Objects.requireNonNull(sk2VarF3);
                    qa1Var = new qa1(i, sk2VarF3);
                }
            } catch (RemoteException unused) {
                l93.q0("MCImplBase", "Service " + componentName + " has died prematurely");
                sk2VarF1 = bm2Var.f1();
                sk2 sk2VarF4 = bm2Var.f1();
                Objects.requireNonNull(sk2VarF4);
                qa1Var = new qa1(i, sk2VarF4);
            }
            sk2VarF1.a1(qa1Var);
        } catch (Throwable th) {
            sk2 sk2VarF5 = bm2Var.f1();
            sk2 sk2VarF6 = bm2Var.f1();
            Objects.requireNonNull(sk2VarF6);
            sk2VarF5.a1(new qa1(i, sk2VarF6));
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        bm2 bm2Var = this.o;
        sk2 sk2VarF1 = bm2Var.f1();
        sk2 sk2VarF2 = bm2Var.f1();
        Objects.requireNonNull(sk2VarF2);
        sk2VarF1.a1(new qa1(18, sk2VarF2));
    }
}
