package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.eddyizm.tempus.service.MediaService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wo2 extends oq2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ wo2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.oq2
    public void e() {
        switch (this.a) {
            case 1:
                hd5 hd5Var = ((s25) this.b).w;
                if (hd5Var != null) {
                    MediaService mediaService = (MediaService) hd5Var.o;
                    g25 g25Var = (g25) this.c;
                    q25 q25Var = mediaService.x;
                    f25 f25Var = (f25) hd5Var.p;
                    Looper mainLooper = mediaService.getMainLooper();
                    mainLooper.getClass();
                    q25 q25Var2 = new q25(f25Var, g25Var, mainLooper, mediaService);
                    mediaService.x = q25Var2;
                    mediaService.q(q25Var2);
                    mediaService.s(mediaService.p().a(), q25Var2);
                    if (q25Var != null) {
                        q25Var.A1();
                    }
                }
                break;
        }
    }

    @Override // defpackage.oq2
    public void f(int i) {
        vo2 vo2Var;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                if (str != null && (vo2Var = (vo2) this.c) != null) {
                    Messenger messenger = vo2Var.h;
                    MediaRouter2.RoutingController routingController = vo2Var.g;
                    if (routingController != null && !routingController.isReleased() && messenger != null) {
                        int andIncrement = vo2Var.l.getAndIncrement();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 7;
                        messageObtain.arg1 = andIncrement;
                        Bundle bundle = new Bundle();
                        bundle.putInt("volume", i);
                        bundle.putString("routeId", str);
                        messageObtain.setData(bundle);
                        messageObtain.replyTo = vo2Var.i;
                        try {
                            messenger.send(messageObtain);
                        } catch (DeadObjectException unused) {
                            return;
                        } catch (RemoteException e) {
                            Log.e("MR2Provider", "Could not send control request to service.", e);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.oq2
    public void h(int i) {
        switch (this.a) {
            case 1:
                hd5 hd5Var = ((s25) this.b).w;
                if (hd5Var != null) {
                    g25 g25Var = (g25) this.c;
                    MediaService mediaService = (MediaService) hd5Var.o;
                    q25 q25Var = mediaService.x;
                    if (q25Var != null && h12.c(q25Var.k, g25Var)) {
                        mediaService.x = null;
                        mediaService.s(q25Var, mediaService.o());
                        q25Var.A1();
                    }
                }
                break;
            default:
                super.h(i);
                break;
        }
    }

    @Override // defpackage.oq2
    public void i(int i) {
        vo2 vo2Var;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                if (str != null && (vo2Var = (vo2) this.c) != null) {
                    Messenger messenger = vo2Var.h;
                    MediaRouter2.RoutingController routingController = vo2Var.g;
                    if (routingController != null && !routingController.isReleased() && messenger != null) {
                        int andIncrement = vo2Var.l.getAndIncrement();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 8;
                        messageObtain.arg1 = andIncrement;
                        Bundle bundle = new Bundle();
                        bundle.putInt("volume", i);
                        bundle.putString("routeId", str);
                        messageObtain.setData(bundle);
                        messageObtain.replyTo = vo2Var.i;
                        try {
                            messenger.send(messageObtain);
                        } catch (DeadObjectException unused) {
                            return;
                        } catch (RemoteException e) {
                            Log.e("MR2Provider", "Could not send control request to service.", e);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }
}
