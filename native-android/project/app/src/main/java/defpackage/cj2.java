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
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public cj2(gj2 r2) {
        this.a = 0;
        this.b = new WeakReference(r2);
    }

    @Override // android.os.Handler
    public void handleMessage(Message r8) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.handleMessage(r8);
        return;
    L6:
        WeakReference r3 = (WeakReference) this.c;
        if (r3 == null) goto L36;
        Messenger r4 = (Messenger) r3.get();
        gj2 r7 = (gj2) ((WeakReference) this.b).get();
        if (r4 == null) goto L32;
        if (r7 == null) goto L37;
        Bundle r5 = r8.getData();
        if (r5 == null) goto L31;
        ClassLoader r6 = qr2.class.getClassLoader();
        r6.getClass();
        r5.setClassLoader(r6);
    L31:
    L29:
        l93.F("MediaBrowserCompat", "Could not unparcel the data.");
        return;
    L17:
        if (r8.what == 3) goto L19;
        l93.q0("MediaBrowserCompat", "Unhandled message: " + r8 + "\n  Client version: 1\n  Service version: " + r8.arg1);     // Catch: BadParcelableException -> L29
        return;
    L19:
        f35.n(r5.getBundle("data_options"));     // Catch: BadParcelableException -> L29
        f35.n(r5.getBundle("data_notify_children_changed_options"));     // Catch: BadParcelableException -> L29
        String r9 = r5.getString("data_media_item_id");     // Catch: BadParcelableException -> L29
        uc5.k(r5.getParcelableArrayList("data_media_item_list"), ij2.CREATOR);     // Catch: BadParcelableException -> L29
        if (r7.g != r4) goto L34;
        if (r9 != null) goto L25;
    L26:
        l93.A("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + r9);     // Catch: BadParcelableException -> L29
        return;
    L25:
        if (r7.e.get(r9) == null) goto L26;
        throw new ClassCastException();     // Catch: BadParcelableException -> L29
    L34:
        return;
    L37:
        return;
    L32:
        return;
    }

    public cj2(tn2 r2, Looper r3) {
        this.a = 1;
        this.c = r2;
        super(r3);
    }
}
