package defpackage;

import android.media.MediaCodec;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.preference.PreferenceScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zk extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(vo2 vo2Var) {
        super(Looper.getMainLooper());
        this.a = 4;
        this.b = vo2Var;
    }

    private final void a(Message message) {
        kr2 kr2Var;
        ir2 ir2Var;
        zk zkVar;
        ir2 ir2Var2;
        if (message.what == 1) {
            synchronized (((ir2) this.b).b) {
                kr2Var = (kr2) ((WeakReference) ((ir2) this.b).d).get();
                ir2Var = (ir2) this.b;
                zkVar = (zk) ir2Var.e;
            }
            if (kr2Var != null) {
                synchronized (kr2Var.d) {
                    ir2Var2 = kr2Var.l;
                }
                if (ir2Var != ir2Var2 || zkVar == null) {
                    return;
                }
                kr2Var.c((ms2) message.obj);
                ((ir2) this.b).b(kr2Var, zkVar);
                kr2Var.c(null);
            }
        }
    }

    public void b(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        tv1 tv1Var;
        Set set;
        boolean z = false;
        al alVar = null;
        alVar = null;
        alVar = null;
        alVar = null;
        alVar = null;
        alVar = null;
        switch (this.a) {
            case 0:
                bl blVar = (bl) this.b;
                int i = message.what;
                if (i == 1) {
                    al alVar2 = (al) message.obj;
                    try {
                        blVar.n.queueInputBuffer(alVar2.a, 0, alVar2.b, alVar2.d, alVar2.e);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = blVar.q;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    alVar = alVar2;
                } else if (i == 2) {
                    al alVar3 = (al) message.obj;
                    int i2 = alVar3.a;
                    MediaCodec.CryptoInfo cryptoInfo = alVar3.c;
                    long j = alVar3.d;
                    int i3 = alVar3.e;
                    try {
                        synchronized (bl.u) {
                            blVar.n.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                            break;
                        }
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = blVar.q;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    alVar = alVar3;
                } else if (i == 3) {
                    blVar.r.d();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = blVar.q;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        blVar.n.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = blVar.q;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (alVar != null) {
                    ArrayDeque arrayDeque = bl.t;
                    synchronized (arrayDeque) {
                        arrayDeque.add(alVar);
                        break;
                    }
                    return;
                }
                return;
            case 1:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i4 = message.what;
                if (i4 == 1) {
                    ik0 ik0Var = (ik0) this.b;
                    qr2 qr2Var = ik0Var.c;
                    if (obj == ik0Var.z) {
                        if (ik0Var.p == 2 || ik0Var.j()) {
                            ik0Var.z = null;
                            if (obj2 instanceof Exception) {
                                qr2Var.q((Exception) obj2, false);
                                return;
                            }
                            try {
                                ik0Var.b.N(((qm2) obj2).a);
                                qr2Var.p = null;
                                HashSet hashSet = (HashSet) qr2Var.o;
                                yw1 yw1VarK = yw1.k(hashSet);
                                hashSet.clear();
                                vw1 vw1VarListIterator = yw1VarK.listIterator(0);
                                while (vw1VarListIterator.hasNext()) {
                                    ik0 ik0Var2 = (ik0) vw1VarListIterator.next();
                                    if (ik0Var2.m()) {
                                        ik0Var2.i(true);
                                    }
                                }
                                return;
                            } catch (Exception e4) {
                                qr2Var.q(e4, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (i4 != 2) {
                    return;
                }
                ik0 ik0Var3 = (ik0) this.b;
                if (obj == ik0Var3.x && ik0Var3.j()) {
                    ik0Var3.x = null;
                    synchronized (ik0Var3.o) {
                        si1 si1Var = ik0Var3.y;
                        si1Var.getClass();
                        tv1Var = new tv1();
                        ((uw1) si1Var.o).f();
                        ik0Var3.y = null;
                        break;
                    }
                    if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                        ik0Var3.l((Throwable) obj2, false);
                        return;
                    }
                    try {
                        byte[] bArrH = ik0Var3.b.H(ik0Var3.v, ((qm2) obj2).a);
                        if (ik0Var3.w != null && bArrH != null && bArrH.length != 0) {
                            ik0Var3.w = bArrH;
                        }
                        ik0Var3.p = 4;
                        ie0 ie0Var = ik0Var3.h;
                        synchronized (ie0Var.n) {
                            set = ie0Var.p;
                            break;
                        }
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((sw0) it.next()).a(tv1Var);
                        }
                        return;
                    } catch (Exception e5) {
                        e = e5;
                        ik0Var3.l(e, true);
                        return;
                    } catch (NoSuchMethodError e6) {
                        e = e6;
                        ik0Var3.l(e, true);
                        return;
                    }
                }
                return;
            case 2:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                ArrayList arrayList = ((kk0) this.b).m;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = arrayList.get(i5);
                    i5++;
                    ik0 ik0Var4 = (ik0) obj3;
                    ik0Var4.o();
                    if (Arrays.equals(ik0Var4.v, bArr)) {
                        if (message.what == 2 && ik0Var4.p == 4) {
                            String str = f35.a;
                            ik0Var4.i(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                pn2 pn2Var = (pn2) this.b;
                if (pn2Var == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                pz1 pz1Var = pn2Var.o;
                Bundle data = message.getData();
                int i6 = 29;
                switch (message.what) {
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        ((pn2) pz1Var.o).t.b(new wj2(pz1Var, new hg3(i6, message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), f35.n(data.getBundle("data_options"))));
                        return;
                    case 4:
                        ((pn2) pz1Var.o).t.b(new sz(pz1Var, new hg3(i6, message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 2));
                        return;
                    case 5:
                        String string = data.getString("data_media_item_id");
                        v14 v14Var = (v14) data.getParcelable("data_result_receiver");
                        hg3 hg3Var = new hg3(i6, message.replyTo);
                        pz1Var.getClass();
                        if (TextUtils.isEmpty(string) || v14Var == null) {
                            return;
                        }
                        ((pn2) pz1Var.o).t.b(new sz(pz1Var, hg3Var, string, v14Var, 3));
                        return;
                    case 6:
                        ((pn2) pz1Var.o).t.b(new vj2(pz1Var, new hg3(i6, message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), f35.n(data.getBundle("data_root_hints"))));
                        return;
                    case 7:
                        ((pn2) pz1Var.o).t.b(new lg1(pz1Var, new hg3(i6, message.replyTo), z, 20));
                        return;
                    case 8:
                        Bundle bundleN = f35.n(data.getBundle("data_search_extras"));
                        String string2 = data.getString("data_search_query");
                        v14 v14Var2 = (v14) data.getParcelable("data_result_receiver");
                        hg3 hg3Var2 = new hg3(i6, message.replyTo);
                        pz1Var.getClass();
                        if (TextUtils.isEmpty(string2) || v14Var2 == null) {
                            return;
                        }
                        ((pn2) pz1Var.o).t.b(new wj2(pz1Var, hg3Var2, string2, bundleN, v14Var2, 0));
                        return;
                    case 9:
                        Bundle bundleN2 = f35.n(data.getBundle("data_custom_action_extras"));
                        String string3 = data.getString("data_custom_action");
                        v14 v14Var3 = (v14) data.getParcelable("data_result_receiver");
                        hg3 hg3Var3 = new hg3(i6, message.replyTo);
                        pz1Var.getClass();
                        if (TextUtils.isEmpty(string3) || v14Var3 == null) {
                            return;
                        }
                        ((pn2) pz1Var.o).t.b(new wj2(pz1Var, hg3Var3, string3, bundleN2, v14Var3, 1));
                        return;
                    default:
                        l93.q0("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
            case 4:
                int i7 = message.what;
                int i8 = message.arg1;
                Object obj4 = message.obj;
                Bundle bundlePeekData = message.peekData();
                SparseArray sparseArray = ((vo2) this.b).j;
                zx3 zx3Var = (zx3) sparseArray.get(i8);
                if (zx3Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i8);
                if (i7 == 3) {
                    zx3Var.b((Bundle) obj4);
                    return;
                } else {
                    if (i7 != 4) {
                        return;
                    }
                    zx3.a(bundlePeekData != null ? bundlePeekData.getString("error") : null, (Bundle) obj4);
                    return;
                }
            case 5:
                ep2 ep2Var = (ep2) this.b;
                zk zkVar = ep2Var.K;
                int i9 = message.what;
                if (i9 == 1) {
                    ep2Var.i((List) message.obj);
                    return;
                }
                if (i9 == 2) {
                    if (ep2Var.w.isEmpty()) {
                        ep2Var.l(2);
                        zkVar.removeMessages(2);
                        zkVar.removeMessages(3);
                        zkVar.sendMessageDelayed(zkVar.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i9 == 3 && ep2Var.w.isEmpty()) {
                    ep2Var.l(3);
                    zkVar.removeMessages(2);
                    zkVar.removeMessages(3);
                    zkVar.removeMessages(1);
                    ep2Var.t.e(ep2Var.u);
                    return;
                }
                return;
            case 6:
                if (message.what != 1) {
                    return;
                }
                aq2 aq2Var = (aq2) this.b;
                List list = (List) message.obj;
                aq2Var.D = SystemClock.uptimeMillis();
                aq2Var.x.clear();
                aq2Var.x.addAll(list);
                aq2Var.y.p();
                return;
            case 7:
                lq2 lq2Var = (lq2) this.b;
                int i10 = message.what;
                if (i10 == 1) {
                    lq2Var.p();
                    return;
                } else {
                    if (i10 == 2 && lq2Var.K != null) {
                        lq2Var.K = null;
                        lq2Var.q();
                        return;
                    }
                    return;
                }
            case 8:
                qq2 qq2Var = (qq2) this.b;
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                    qq2Var.s = false;
                    qq2Var.e(qq2Var.r);
                    return;
                }
                qq2Var.u = false;
                si1 si1Var2 = qq2Var.q;
                if (si1Var2 != null) {
                    xk0 xk0Var = qq2Var.t;
                    ui1 ui1Var = (ui1) si1Var2.o;
                    vq2 vq2VarD = ui1Var.d(qq2Var);
                    if (vq2VarD != null) {
                        ui1Var.m(vq2VarD, xk0Var);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                a(message);
                return;
            case 10:
                fr2 fr2Var = (fr2) message.obj;
                na4 na4Var = (na4) this.b;
                if (na4Var.F(fr2Var)) {
                    er2 er2Var = fr2Var.d;
                    er2Var.getClass();
                    er2Var.c();
                    na4Var.N(fr2Var);
                    return;
                }
                return;
            default:
                if (message.what != 1) {
                    return;
                }
                kp3 kp3Var = (kp3) this.b;
                PreferenceScreen preferenceScreen = (PreferenceScreen) kp3Var.m0.g;
                if (preferenceScreen != null) {
                    kp3Var.n0.setAdapter(new np3(preferenceScreen));
                    preferenceScreen.j();
                    return;
                }
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Bundle data = message.getData();
                ClassLoader classLoader = jj2.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk(Looper looper) {
        super(looper);
        this.a = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ zk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(Looper looper, na4 na4Var) {
        super(looper);
        this.a = 10;
        this.b = na4Var;
    }
}
