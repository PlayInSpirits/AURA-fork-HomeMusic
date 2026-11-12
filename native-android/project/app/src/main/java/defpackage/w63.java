package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w63 implements Handler.Callback, ServiceConnection {
    public final Context n;
    public final Handler o;
    public final HashMap p;
    public HashSet q;

    public w63(Context r2) {
        this.p = new HashMap();
        this.q = new HashSet();
        this.n = r2;
        HandlerThread r3 = new HandlerThread("NotificationManagerCompat");
        r3.start();
        this.o = new Handler(r3.getLooper(), this);
    }

    public final void a(v63 r8) {
        ArrayDeque r0 = r8.d;
        ComponentName r1 = r8.a;
        if (Log.isLoggable("NotifManCompat", 3) == false) goto L6;
        Log.d("NotifManCompat", "Processing component " + r1 + ", " + r0.size() + " queued tasks");
    L6:
        if (r0.isEmpty() == false) goto L9;
        return;
    L9:
        if (r8.b == false) goto L11;
        boolean r4 = true;
    L16:
        if (r4 == true) goto L18;
    L38:
        b(r8);
        return;
    L18:
        if (r8.c == null) goto L38;
    L20:
        t63 r5 = (t63) r0.peek();
        if (r5 == null) goto L35;
        if (Log.isLoggable("NotifManCompat", 3) == false) goto L28;
        Log.d("NotifManCompat", "Sending task " + r5);     // Catch: RemoteException -> L26 DeadObjectException -> L31
    L28:
        r5.a(r8.c);     // Catch: RemoteException -> L26 DeadObjectException -> L31
        r0.remove();     // Catch: RemoteException -> L26 DeadObjectException -> L31
        goto L20
    L26:
        e = move-exception;
        Log.w("NotifManCompat", "RemoteException communicating with " + r1, e);
    L32:
        if (Log.isLoggable("NotifManCompat", 3) == false) goto L35;
        Log.d("NotifManCompat", "Remote service has died: " + r1);
    L35:
        if (r0.isEmpty() == true) goto L45;
        b(r8);
        return;
    L45:
        return;
    L11:
        Intent r6 = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(r1);
        Context r7 = this.n;
        boolean r9 = r7.bindService(r6, this, 33);
        r8.b = r9;
        if (r9 == false) goto L14;
        r8.e = 0;
    L15:
        r4 = r8.b;
        goto L16
    L14:
        Log.w("NotifManCompat", "Unable to bind to listener " + r1);
        r7.unbindService(this);
        goto L15
    }

    public final void b(v63 r8) {
        ComponentName r0 = r8.a;
        ArrayDeque r1 = r8.d;
        Handler r7 = this.o;
        if (r7.hasMessages(3, r0) == false) goto L5;
        return;
    L5:
        int r3 = r8.e;
        int r4 = r3 + 1;
        r8.e = r4;
        if (r4 <= 6) goto L9;
        Log.w("NotifManCompat", "Giving up on delivering " + r1.size() + " tasks to " + r0 + " after " + r8.e + " retries");
        r1.clear();
        return;
    L9:
        int r9 = (1 << r3) * 1000;
        if (Log.isLoggable("NotifManCompat", 3) == false) goto L12;
        Log.d("NotifManCompat", "Scheduling retry for " + r9 + " ms");
    L12:
        r7.sendMessageDelayed(r7.obtainMessage(3, r0), r9);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r12) {
        int r0 = r12.what;
        yu1 r1 = null;
        if (r0 == 0) goto L33;
        if (r0 != 1) goto L6;
        u63 r13 = (u63) r12.obj;
        ComponentName r2 = r13.a;
        IBinder r14 = r13.b;
        v63 r3 = (v63) this.p.get(r2);
        if (r3 == null) goto L87;
        int r4 = xu1.e;
        if (r14 == null) goto L31;
        IInterface r5 = r14.queryLocalInterface(yu1.c);
        if (r5 != null) goto L28;
    L30:
        wu1 r6 = new wu1();
        r6.e = r14;
        r1 = r6;
        goto L31
    L28:
        if ((r5 instanceof yu1) == false) goto L30;
        r1 = (yu1) r5;
    L31:
        r3.c = r1;
        r3.e = 0;
        a(r3);
        return true;
    L87:
        return true;
    L6:
        if (r0 == 2) goto L13;
        if (r0 == 3) goto L9;
        return false;
    L9:
        v63 r15 = (v63) this.p.get((ComponentName) r12.obj);
        if (r15 == null) goto L87;
        a(r15);
        return true;
    L13:
        v63 r16 = (v63) this.p.get((ComponentName) r12.obj);
        if (r16 == null) goto L87;
        if (r16.b == false) goto L18;
        this.n.unbindService(this);
        r16.b = false;
    L18:
        r16.c = null;
        return true;
    L33:
        t63 r17 = (t63) r12.obj;
        String r7 = Settings.Secure.getString(this.n.getContentResolver(), "enabled_notification_listeners");
        Object r8 = x63.c;
        monitor-enter(r8);
        if (r7 != null) goto L90;
    L47:
        HashSet r9 = x63.e;     // Catch: Throwable -> L43
        monitor-exit(r8);     // Catch: Throwable -> L43
        if (r9.equals(this.q) == true) goto L83;
        this.q = r9;
        List<ResolveInfo> r10 = this.n.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
        HashSet r11 = new HashSet();
        Iterator<ResolveInfo> r18 = r10.iterator();
    L54:
        if (r18.hasNext() == false) goto L62;
        ResolveInfo r19 = r18.next();
        if (r9.contains(r19.serviceInfo.packageName) == false) goto L54;
        ServiceInfo r20 = r19.serviceInfo;
        ComponentName r21 = new ComponentName(r20.packageName, r20.name);
        if (r19.serviceInfo.permission != null) goto L60;
        r11.add(r21);
        goto L54
    L60:
        Log.w("NotifManCompat", "Permission present on component " + r21 + ", not adding listener record.");
        goto L54
    L62:
        Iterator r22 = r11.iterator();
    L64:
        if (r22.hasNext() == false) goto L71;
        ComponentName r23 = (ComponentName) r22.next();
        if (this.p.containsKey(r23) == true) goto L64;
        if (Log.isLoggable("NotifManCompat", 3) == false) goto L70;
        Log.d("NotifManCompat", "Adding listener record for " + r23);
    L70:
        this.p.put(r23, new v63(r23));
        goto L64
    L71:
        Iterator r24 = this.p.entrySet().iterator();
    L73:
        if (r24.hasNext() == false) goto L83;
        Map.Entry r25 = (Map.Entry) r24.next();
        if (r11.contains(r25.getKey()) == true) goto L73;
        if (Log.isLoggable("NotifManCompat", 3) == false) goto L79;
        Log.d("NotifManCompat", "Removing listener record for " + r25.getKey());
    L79:
        v63 r26 = (v63) r25.getValue();
        if (r26.b == false) goto L82;
        this.n.unbindService(this);
        r26.b = false;
    L82:
        r26.c = null;
        r24.remove();
    L83:
        Iterator r27 = this.p.values().iterator();
    L85:
        if (r27.hasNext() == false) goto L87;
        v63 r28 = (v63) r27.next();
        r28.d.add(r17);
        a(r28);
    L43:
        th = move-exception;
        throw th;
    L90:
        if (r7.equals(x63.d) == true) goto L47;
        String[] r29 = r7.split(":", -1);     // Catch: Throwable -> L43
        HashSet r30 = new HashSet(r29.length);     // Catch: Throwable -> L43
        int r31 = r29.length;     // Catch: Throwable -> L43
        int r32 = 0;
    L39:
        if (r32 >= r31) goto L46;
        ComponentName r110 = ComponentName.unflattenFromString(r29[r32]);     // Catch: Throwable -> L43
        if (r110 == null) goto L45;
        r30.add(r110.getPackageName());     // Catch: Throwable -> L43
    L45:
        r32 = r32 + 1;     // Catch: Throwable -> L43
        goto L39
    L46:
        x63.e = r30;     // Catch: Throwable -> L43
        x63.d = r7;     // Catch: Throwable -> L43
        goto L47
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName r4, IBinder r5) {
        if (Log.isLoggable("NotifManCompat", 3) == false) goto L5;
        Log.d("NotifManCompat", "Connected to service " + r4);
    L5:
        this.o.obtainMessage(1, new u63(r4, r5)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName r4) {
        if (Log.isLoggable("NotifManCompat", 3) == false) goto L5;
        Log.d("NotifManCompat", "Disconnected from service " + r4);
    L5:
        this.o.obtainMessage(2, r4).sendToTarget();
    }
}
