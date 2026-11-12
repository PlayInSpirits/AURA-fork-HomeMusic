package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xk2 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final pr2 e;

    public xk2(Context context, pr2 pr2Var) {
        this.e = pr2Var;
        MediaController mediaController = new MediaController(context, pr2Var.o);
        this.a = mediaController;
        if (pr2Var.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new wk2(this));
        }
    }

    public final void a() {
        qu1 qu1VarA = this.e.a();
        if (qu1VarA == null) {
            return;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gm2 gm2Var = (gm2) obj;
            tk2 tk2Var = new tk2(gm2Var);
            this.d.put(gm2Var, tk2Var);
            gm2Var.c = tk2Var;
            try {
                qu1VarA.l0(tk2Var);
                gm2Var.c(13, null);
            } catch (RemoteException | SecurityException e) {
                l93.G("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }

    public final void b(gm2 gm2Var) {
        MediaController mediaController = this.a;
        uk2 uk2Var = gm2Var.a;
        uk2Var.getClass();
        mediaController.unregisterCallback(uk2Var);
        synchronized (this.b) {
            qu1 qu1VarA = this.e.a();
            if (qu1VarA != null) {
                try {
                    tk2 tk2Var = (tk2) this.d.remove(gm2Var);
                    if (tk2Var != null) {
                        gm2Var.c = null;
                        qu1VarA.b0(tk2Var);
                    }
                } catch (RemoteException | SecurityException e) {
                    l93.G("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.c.remove(gm2Var);
            }
        }
    }
}
