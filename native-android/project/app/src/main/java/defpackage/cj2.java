package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cj2 extends Handler {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public cj2(gj2 gj2Var) {
        this.b = new WeakReference(gj2Var);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                if (weakReference == null) {
                    return;
                }
                Messenger messenger = (Messenger) weakReference.get();
                gj2 gj2Var = (gj2) ((WeakReference) this.b).get();
                if (messenger == null || gj2Var == null) {
                    return;
                }
                Bundle data = message.getData();
                if (data != null) {
                    ClassLoader classLoader = qr2.class.getClassLoader();
                    classLoader.getClass();
                    data.setClassLoader(classLoader);
                }
                try {
                    if (message.what != 3) {
                        l93.q0("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    f35.n(data.getBundle("data_options"));
                    f35.n(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    uc5.k(data.getParcelableArrayList("data_media_item_list"), ij2.CREATOR);
                    if (gj2Var.g != messenger) {
                        return;
                    }
                    if (string != null && gj2Var.e.get(string) != null) {
                        throw new ClassCastException();
                    }
                    l93.A("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                    return;
                } catch (BadParcelableException unused) {
                    l93.F("MediaBrowserCompat", "Could not unparcel the data.");
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj2(tn2 tn2Var, Looper looper) {
        super(looper);
        this.c = tn2Var;
    }
}
