package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ai1 implements Handler.Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ai1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.n) {
            case 0:
                bi1 bi1Var = (bi1) this.o;
                int i = message.what;
                if (i == 1) {
                    bi1Var.b((zh1) message.obj);
                    return true;
                }
                if (i == 2) {
                    bi1Var.d.q((zh1) message.obj);
                }
                return false;
            case 1:
                if (message.what != 0) {
                    return false;
                }
                na4 na4Var = (na4) this.o;
                rg4 rg4Var = (rg4) message.obj;
                synchronized (na4Var.n) {
                    if (((rg4) na4Var.p) == rg4Var || ((rg4) na4Var.q) == rg4Var) {
                        na4Var.j(rg4Var, 2);
                    }
                    break;
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    synchronized (((tk5) this.o).a) {
                        try {
                            nk5 nk5Var = (nk5) message.obj;
                            pk5 pk5Var = (pk5) ((tk5) this.o).a.get(nk5Var);
                            if (pk5Var != null && pk5Var.n.isEmpty()) {
                                if (pk5Var.p) {
                                    pk5Var.t.c.removeMessages(1, pk5Var.r);
                                    tk5 tk5Var = pk5Var.t;
                                    tk5Var.d.o(tk5Var.b, pk5Var);
                                    pk5Var.p = false;
                                    pk5Var.o = 2;
                                }
                                ((tk5) this.o).a.remove(nk5Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                synchronized (((tk5) this.o).a) {
                    try {
                        nk5 nk5Var2 = (nk5) message.obj;
                        pk5 pk5Var2 = (pk5) ((tk5) this.o).a.get(nk5Var2);
                        if (pk5Var2 != null && pk5Var2.o == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(nk5Var2)), new Exception());
                            ComponentName componentName = pk5Var2.s;
                            if (componentName == null) {
                                nk5Var2.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = nk5Var2.b;
                                ji2.m(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            pk5Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return true;
        }
    }
}
