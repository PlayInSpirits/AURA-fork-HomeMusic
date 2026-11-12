package defpackage;

import android.media.MediaCodec;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zk extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public zk(vo2 r2) {
        this.a = 4;
        this.b = r2;
        super(Looper.getMainLooper());
    }

    private final void a(Message r6) {
        if (r6.what != 1) goto L24;
        Object r0 = ((ir2) this.b).b;
        monitor-enter(r0);
        kr2 r1 = (kr2) ((WeakReference) ((ir2) this.b).d).get();     // Catch: Throwable -> L21
        ir2 r2 = (ir2) this.b;     // Catch: Throwable -> L21
        zk r3 = (zk) r2.e;     // Catch: Throwable -> L21
        monitor-exit(r0);     // Catch: Throwable -> L21
        if (r1 == null) goto L29;
        Object r4 = r1.d;
        monitor-enter(r4);
        ir2 r5 = r1.l;     // Catch: Throwable -> L18
        monitor-exit(r4);     // Catch: Throwable -> L18
        if (r2 != r5) goto L30;
        if (r3 == null) goto L31;
        r1.c((ms2) r6.obj);
        ((ir2) this.b).b(r1, r3);
        r1.c(null);
        return;
    L31:
        return;
    L30:
        return;
    L18:
        th = move-exception;
        throw th;
    L29:
        return;
    L21:
        th = move-exception;
        throw th;
    }

    public void b(Runnable r3) {
        if (Thread.currentThread() != getLooper().getThread()) goto L6;
        r3.run();
        return;
    L6:
        post(r3);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message r13) {
        boolean r3 = false;
        al r4 = null;
        String r5 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        r4 = null;
        switch(this.a) {
            case 0: goto L177;
            case 1: goto L108;
            case 2: goto L94;
            case 3: goto L68;
            case 4: goto L55;
            case 5: goto L42;
            case 6: goto L38;
            case 7: goto L28;
            case 8: goto L17;
            case 9: goto L15;
            case 10: goto L11;
            default: goto L5;
        };
    L11:
        fr2 r14 = (fr2) r13.obj;
        na4 r12 = (na4) this.b;
        if (r12.F(r14) == false) goto L279;
        er2 r0 = r14.d;
        r0.getClass();
        r0.c();
        r12.N(r14);
        return;
    L279:
        return;
    L15:
        a(r13);
        return;
    L17:
        qq2 r15 = (qq2) this.b;
        int r16 = r13.what;
        if (r16 == 1) goto L22;
        if (r16 != 2) goto L283;
        r15.s = false;
        r15.e(r15.r);
        return;
    L283:
        return;
    L22:
        r15.u = false;
        si1 r17 = r15.q;
        if (r17 == null) goto L281;
        xk0 r1 = r15.t;
        ui1 r18 = (ui1) r17.o;
        vq2 r19 = r18.d(r15);
        if (r19 == null) goto L282;
        r18.m(r19, r1);
        return;
    L282:
        return;
    L281:
        return;
    L28:
        lq2 r110 = (lq2) this.b;
        int r111 = r13.what;
        if (r111 == 1) goto L35;
        if (r111 == 2) goto L33;
        return;
    L33:
        if (r110.K == null) goto L284;
        r110.K = null;
        r110.q();
        return;
    L284:
        return;
    L35:
        r110.p();
        return;
    L42:
        ep2 r112 = (ep2) this.b;
        zk r2 = r112.K;
        int r6 = r13.what;
        if (r6 == 1) goto L53;
        if (r6 == 2) goto L51;
        if (r6 == 3) goto L48;
        return;
    L48:
        if (r112.w.isEmpty() == false) goto L288;
        r112.l(3);
        r2.removeMessages(2);
        r2.removeMessages(3);
        r2.removeMessages(1);
        r112.t.e(r112.u);
        return;
    L288:
        return;
    L51:
        if (r112.w.isEmpty() == false) goto L290;
        r112.l(2);
        r2.removeMessages(2);
        r2.removeMessages(3);
        r2.sendMessageDelayed(r2.obtainMessage(3), 15000);
        return;
    L290:
        return;
    L53:
        r112.i((List) r13.obj);
        return;
    L55:
        int r7 = r13.what;
        int r8 = r13.arg1;
        Object r9 = r13.obj;
        Bundle r113 = r13.peekData();
        SparseArray r114 = ((vo2) this.b).j;
        zx3 r10 = (zx3) r114.get(r8);
        if (r10 != null) goto L58;
        Log.w("MR2Provider", "Pending callback not found for control request.");
        return;
    L58:
        r114.remove(r8);
        if (r7 == 3) goto L66;
        if (r7 != 4) goto L295;
        if (r113 == null) goto L65;
        r5 = r113.getString("error");
    L65:
        zx3.a(r5, (Bundle) r9);
        return;
    L295:
        return;
    L66:
        r10.b((Bundle) r9);
        return;
    L68:
        pn2 r11 = (pn2) this.b;
        if (r11 == null) goto L92;
        pz1 r20 = r11.o;
        Bundle r21 = r13.getData();
        int r22 = 29;
        switch(r13.what) {
            case 3: goto L91;
            case 4: goto L90;
            case 5: goto L85;
            case 6: goto L84;
            case 7: goto L83;
            case 8: goto L78;
            case 9: goto L73;
            default: goto L72;
        };
    L72:
        l93.q0("MBServiceCompat", "Unhandled message: " + r13 + "\n  Service version: 2\n  Client version: " + r13.arg1);
        return;
    L73:
        Bundle r23 = f35.n(r21.getBundle("data_custom_action_extras"));
        String r24 = r21.getString("data_custom_action");
        v14 r25 = (v14) r21.getParcelable("data_result_receiver");
        hg3 r26 = new hg3(r22, r13.replyTo);
        r20.getClass();
        if (TextUtils.isEmpty(r24) == true) goto L297;
        if (r25 == null) goto L307;
        ((pn2) r20.o).t.b(new wj2(r20, r26, r24, r23, r25, 1));
        return;
    L307:
        return;
    L297:
        return;
    L78:
        Bundle r27 = f35.n(r21.getBundle("data_search_extras"));
        String r28 = r21.getString("data_search_query");
        v14 r29 = (v14) r21.getParcelable("data_result_receiver");
        hg3 r30 = new hg3(r22, r13.replyTo);
        r20.getClass();
        if (TextUtils.isEmpty(r28) == true) goto L299;
        if (r29 == null) goto L308;
        ((pn2) r20.o).t.b(new wj2(r20, r30, r28, r27, r29, 0));
        return;
    L308:
        return;
    L299:
        return;
    L83:
        ((pn2) r20.o).t.b(new lg1(r20, new hg3(r22, r13.replyTo), r3, 20));
        return;
    L84:
        Bundle r115 = f35.n(r21.getBundle("data_root_hints"));
        hg3 r31 = new hg3(r22, r13.replyTo);
        String r32 = r21.getString("data_package_name");
        int r33 = r21.getInt("data_calling_pid");
        ((pn2) r20.o).t.b(new vj2(r20, r31, r21.getInt("data_calling_uid"), r32, r33, r115));
        return;
    L85:
        String r34 = r21.getString("data_media_item_id");
        v14 r35 = (v14) r21.getParcelable("data_result_receiver");
        hg3 r36 = new hg3(r22, r13.replyTo);
        r20.getClass();
        if (TextUtils.isEmpty(r34) == true) goto L303;
        if (r35 == null) goto L309;
        ((pn2) r20.o).t.b(new sz(r20, r36, r34, r35, 3));
        return;
    L309:
        return;
    L303:
        return;
    L90:
        String r37 = r21.getString("data_media_item_id");
        IBinder r38 = r21.getBinder("data_callback_token");
        ((pn2) r20.o).t.b(new sz(r20, new hg3(r22, r13.replyTo), r37, r38, 2));
        return;
    L91:
        Bundle r39 = f35.n(r21.getBundle("data_options"));
        String r40 = r21.getString("data_media_item_id");
        IBinder r41 = r21.getBinder("data_callback_token");
        ((pn2) r20.o).t.b(new wj2(r20, new hg3(r22, r13.replyTo), r40, r41, r39));
        return;
    L92:
        removeCallbacksAndMessages(null);
        return;
    L94:
        byte[] r42 = (byte[]) r13.obj;
        if (r42 == null) goto L311;
        ArrayList r116 = ((kk0) this.b).m;
        int r43 = r116.size();
        int r44 = 0;
    L98:
        if (r44 >= r43) goto L313;
        Object r45 = r116.get(r44);
        r44 = r44 + 1;
        ik0 r46 = (ik0) r45;
        r46.o();
        if (Arrays.equals(r46.v, r42) == false) goto L98;
        if (r13.what == 2) goto L105;
        return;
    L105:
        if (r46.p != 4) goto L310;
        String r117 = f35.a;
        r46.i(false);
        return;
    L310:
        return;
    L313:
        return;
    L311:
        return;
    L108:
        Pair r47 = (Pair) r13.obj;
        Object r48 = r47.first;
        Object r49 = r47.second;
        int r118 = r13.what;
        if (r118 == 1) goto L157;
        if (r118 != 2) goto L319;
        ik0 r119 = (ik0) this.b;
        if (r48 == r119.x) goto L115;
        return;
    L115:
        if (r119.j() == false) goto L320;
        r119.x = null;
        Object r120 = r119.o;
        monitor-enter(r120);
        si1 r50 = r119.y;     // Catch: Throwable -> L153
        r50.getClass();     // Catch: Throwable -> L153
        tv1 r51 = new tv1();     // Catch: Throwable -> L153
        ((uw1) r50.o).f();     // Catch: Throwable -> L153
        r119.y = null;     // Catch: Throwable -> L153
        monitor-exit(r120);     // Catch: Throwable -> L153
        if ((r49 instanceof Exception) == false) goto L124;
    L152:
        r119.l((Throwable) r49, false);
        return;
    L124:
        if ((r49 instanceof NoSuchMethodError) == true) goto L152;
        byte[] r121 = ((qm2) r49).a;     // Catch: NoSuchMethodError -> L134 Exception -> L136
        byte[] r122 = r119.b.H(r119.v, r121);     // Catch: NoSuchMethodError -> L134 Exception -> L136
        if (r119.w == null) goto L138;
        if (r122 == null) goto L138;
        if (r122.length == 0) goto L138;
        r119.w = r122;     // Catch: NoSuchMethodError -> L134 Exception -> L136
    L138:
        r119.p = 4;     // Catch: NoSuchMethodError -> L134 Exception -> L136
        ie0 r123 = r119.h;     // Catch: NoSuchMethodError -> L134 Exception -> L136
        Object r52 = r123.n;     // Catch: NoSuchMethodError -> L134 Exception -> L136
        monitor-enter(r52);     // Catch: NoSuchMethodError -> L134 Exception -> L136
        Set r124 = r123.p;     // Catch: Throwable -> L147
        monitor-exit(r52);     // Catch: Throwable -> L147
        Iterator r125 = r124.iterator();     // Catch: NoSuchMethodError -> L134 Exception -> L136
    L144:
        if (r125.hasNext() == false) goto L322;
        ((sw0) r125.next()).a(r51);     // Catch: NoSuchMethodError -> L134 Exception -> L136
        goto L144
    L322:
        return;
    L147:
        th = move-exception;
        throw th;     // Catch: NoSuchMethodError -> L134 Exception -> L136
    L136:
        e = e;
    L151:
        r119.l(e, true);
        return;
    L134:
        e = e;
    L153:
        th = move-exception;
        throw th;
    L320:
        return;
    L319:
        return;
    L157:
        ik0 r126 = (ik0) this.b;
        qr2 r127 = r126.c;
        if (r48 == r126.z) goto L160;
        return;
    L160:
        if (r126.p != 2) goto L162;
    L164:
        r126.z = null;
        if ((r49 instanceof Exception) == false) goto L247;
        r127.q((Exception) r49, false);
        return;
    L247:
        r126.b.N(((qm2) r49).a);     // Catch: Exception -> L174
        r127.p = null;
        HashSet r128 = (HashSet) r127.o;
        yw1 r129 = yw1.k(r128);
        r128.clear();
        vw1 r130 = r129.m(0);
    L170:
        if (r130.hasNext() == false) goto L323;
        ik0 r131 = (ik0) r130.next();
        if (r131.m() == false) goto L170;
        r131.i(true);
        goto L170
    L323:
        return;
    L174:
        e = move-exception;
        r127.q(e, true);
        return;
    L162:
        if (r126.j() == true) goto L164;
        return;
    L177:
        bl r132 = (bl) this.b;
        int r53 = r13.what;
        if (r53 == 1) goto L218;
        if (r53 == 2) goto L201;
        if (r53 == 3) goto L200;
        if (r53 == 4) goto L245;
        AtomicReference r54 = r132.q;
        IllegalStateException r55 = new IllegalStateException(String.valueOf(r53));
    L184:
        if (r54.compareAndSet(null, r55) == true) goto L229;
        if (r54.get() == null) goto L184;
    L229:
        if (r4 == null) goto L239;
        ArrayDeque r133 = bl.t;
        monitor-enter(r133);
        r133.add(r4);     // Catch: Throwable -> L235
        monitor-exit(r133);     // Catch: Throwable -> L235
        return;
    L235:
        th = move-exception;
        throw th;
    L239:
        return;
    L245:
        r132.n.setParameters((Bundle) r13.obj);     // Catch: RuntimeException -> L192
    L192:
        e = move-exception;
        AtomicReference r56 = r132.q;
    L195:
        if (r56.compareAndSet(null, e) == true) goto L229;
        if (r56.get() == null) goto L195;
    L200:
        r132.r.d();
        goto L229
    L201:
        al r57 = (al) r13.obj;
        int r58 = r57.a;
        MediaCodec.CryptoInfo r59 = r57.c;
        long r60 = r57.d;
        int r134 = r57.e;
        Object r135 = bl.u;     // Catch: RuntimeException -> L210
        monitor-enter(r135);     // Catch: RuntimeException -> L210
        r132.n.queueSecureInputBuffer(r58, 0, r59, r60, r134);     // Catch: Throwable -> L207
        monitor-exit(r135);     // Catch: Throwable -> L207
    L217:
        r4 = r57;
    L207:
        th = move-exception;
        throw th;     // Catch: RuntimeException -> L210
    L210:
        e = move-exception;
        AtomicReference r61 = r132.q;
    L213:
        if (r61.compareAndSet(null, e) == true) goto L217;
        if (r61.get() == null) goto L213;
    L218:
        al r136 = (al) r13.obj;
        r132.n.queueInputBuffer(r136.a, 0, r136.b, r136.d, r136.e);     // Catch: RuntimeException -> L221
    L228:
        r4 = r136;
    L221:
        e = move-exception;
        AtomicReference r137 = r132.q;
    L224:
        if (r137.compareAndSet(null, e) == true) goto L228;
        if (r137.get() == null) goto L224;
    L5:
        if (r13.what != 1) goto L278;
        kp3 r138 = (kp3) this.b;
        PreferenceScreen r139 = (PreferenceScreen) r138.m0.g;
        if (r139 == null) goto L277;
        r138.n0.setAdapter(new np3(r139));
        r139.j();
        return;
    L277:
        return;
    L278:
        return;
    L38:
        if (r13.what != 1) goto L287;
        aq2 r140 = (aq2) this.b;
        List r141 = (List) r13.obj;
        r140.D = SystemClock.uptimeMillis();
        r140.x.clear();
        r140.x.addAll(r141);
        r140.y.p();
        return;
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message r4, long r5) {
        switch(this.a) {
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        Bundle r0 = r4.getData();
        ClassLoader r1 = jj2.class.getClassLoader();
        r1.getClass();
        r0.setClassLoader(r1);
        r0.putInt("data_calling_uid", Binder.getCallingUid());
        int r2 = Binder.getCallingPid();
        if (r2 <= 0) goto L10;
        r0.putInt("data_calling_pid", r2);
    L13:
        return super.sendMessageAtTime(r4, r5);
    L10:
        if (r0.containsKey("data_calling_pid") == true) goto L13;
        r0.putInt("data_calling_pid", -1);
        goto L13
    L5:
        return super.sendMessageAtTime(r4, r5);
    }

    public /* synthetic */ zk(Looper r2) {
        this.a = 3;
        super(r2);
    }

    public /* synthetic */ zk(Object r1, Looper r2, int r3) {
        this.a = r3;
        this.b = r1;
        super(r2);
    }

    public /* synthetic */ zk(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public zk(Looper r2, na4 r3) {
        this.a = 10;
        super(r2);
        this.b = r3;
    }
}
