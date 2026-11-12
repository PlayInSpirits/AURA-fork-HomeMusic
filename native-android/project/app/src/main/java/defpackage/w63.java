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
    public final HashMap p = new HashMap();
    public HashSet q = new HashSet();

    public w63(Context context) {
        this.n = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.o = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(v63 v63Var) {
        boolean z;
        ArrayDeque arrayDeque = v63Var.d;
        ComponentName componentName = v63Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (v63Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.n;
            boolean zBindService = context.bindService(component, this, 33);
            v63Var.b = zBindService;
            if (zBindService) {
                v63Var.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = v63Var.b;
        }
        if (!z || v63Var.c == null) {
            b(v63Var);
            return;
        }
        while (true) {
            t63 t63Var = (t63) arrayDeque.peek();
            if (t63Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + t63Var);
                }
                t63Var.a(v63Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(v63Var);
    }

    public final void b(v63 v63Var) {
        ComponentName componentName = v63Var.a;
        ArrayDeque arrayDeque = v63Var.d;
        Handler handler = this.o;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = v63Var.e;
        int i2 = i + 1;
        v63Var.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + v63Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        yu1 yu1Var = null;
        if (i == 0) {
            t63 t63Var = (t63) message.obj;
            String string = Settings.Secure.getString(this.n.getContentResolver(), "enabled_notification_listeners");
            synchronized (x63.c) {
                if (string != null) {
                    try {
                        if (!string.equals(x63.d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            x63.e = hashSet2;
                            x63.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = x63.e;
            }
            if (!hashSet.equals(this.q)) {
                this.q = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.n.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.p.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.p.put(componentName2, new v63(componentName2));
                    }
                }
                Iterator it = this.p.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        v63 v63Var = (v63) entry.getValue();
                        if (v63Var.b) {
                            this.n.unbindService(this);
                            v63Var.b = false;
                        }
                        v63Var.c = null;
                        it.remove();
                    }
                }
            }
            for (v63 v63Var2 : this.p.values()) {
                v63Var2.d.add(t63Var);
                a(v63Var2);
            }
        } else if (i == 1) {
            u63 u63Var = (u63) message.obj;
            ComponentName componentName3 = u63Var.a;
            IBinder iBinder = u63Var.b;
            v63 v63Var3 = (v63) this.p.get(componentName3);
            if (v63Var3 != null) {
                int i2 = xu1.e;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(yu1.c);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yu1)) {
                        wu1 wu1Var = new wu1();
                        wu1Var.e = iBinder;
                        yu1Var = wu1Var;
                    } else {
                        yu1Var = (yu1) iInterfaceQueryLocalInterface;
                    }
                }
                v63Var3.c = yu1Var;
                v63Var3.e = 0;
                a(v63Var3);
                return true;
            }
        } else if (i == 2) {
            v63 v63Var4 = (v63) this.p.get((ComponentName) message.obj);
            if (v63Var4 != null) {
                if (v63Var4.b) {
                    this.n.unbindService(this);
                    v63Var4.b = false;
                }
                v63Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            v63 v63Var5 = (v63) this.p.get((ComponentName) message.obj);
            if (v63Var5 != null) {
                a(v63Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.o.obtainMessage(1, new u63(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.o.obtainMessage(2, componentName).sendToTarget();
    }
}
