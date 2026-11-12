package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zy2 extends Binder implements vu1 {
    public final /* synthetic */ MultiInstanceInvalidationService e;

    public zy2(MultiInstanceInvalidationService r1) {
        this.e = r1;
        attachInterface(this, vu1.b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r7, Parcel r8, Parcel r9, int r10) {
        String r0 = vu1.b;
        if (r7 < 1) goto L8;
        if (r7 > 16777215) goto L8;
        r8.enforceInterface(r0);
    L8:
        if (r7 != 1598968902) goto L11;
        r9.writeString(r0);
        return true;
    L11:
        int r1 = 0;
        uu1 r2 = null;
        uu1 r3 = null;
        if (r7 != 1) goto L14;
        IBinder r11 = r8.readStrongBinder();
        if (r11 == null) goto L77;
        IInterface r12 = r11.queryLocalInterface(uu1.a);
        if (r12 != null) goto L74;
    L76:
        tu1 r4 = new tu1();
        r4.e = r11;
        r2 = r4;
        goto L77
    L74:
        if ((r12 instanceof uu1) == false) goto L76;
        r2 = (uu1) r12;
    L77:
        String r13 = r8.readString();
        r2.getClass();
        if (r13 == null) goto L89;
        MultiInstanceInvalidationService r6 = this.e;
        az2 r14 = r6.p;
        monitor-enter(r14);
        int r15 = r6.n + 1;     // Catch: Throwable -> L85
        r6.n = r15;     // Catch: Throwable -> L85
        if (r6.p.register(r2, Integer.valueOf(r15)) == false) goto L87;
        r6.o.put(Integer.valueOf(r15), r13);     // Catch: Throwable -> L85
        r1 = r15;
    L88:
        monitor-exit(r14);
        goto L89
    L87:
        r6.n--;     // Catch: Throwable -> L85
    L85:
        th = move-exception;
        throw th;
    L89:
        r9.writeNoException();
        r9.writeInt(r1);
        return true;
    L14:
        if (r7 != 2) goto L16;
        IBinder r16 = r8.readStrongBinder();
        if (r16 == null) goto L59;
        IInterface r17 = r16.queryLocalInterface(uu1.a);
        if (r17 != null) goto L56;
    L58:
        tu1 r5 = new tu1();
        r5.e = r16;
        r3 = r5;
        goto L59
    L56:
        if ((r17 instanceof uu1) == false) goto L58;
        r3 = (uu1) r17;
    L59:
        int r18 = r8.readInt();
        r3.getClass();
        MultiInstanceInvalidationService r19 = this.e;
        az2 r20 = r19.p;
        monitor-enter(r20);
        r19.p.unregister(r3);     // Catch: Throwable -> L65
        String r21 = (String) r19.o.remove(Integer.valueOf(r18));     // Catch: Throwable -> L65
        monitor-exit(r20);
        r9.writeNoException();
        return true;
    L65:
        th = move-exception;
        throw th;
    L16:
        if (r7 != 3) goto L18;
        int r22 = r8.readInt();
        String[] r23 = r8.createStringArray();
        r23.getClass();
        MultiInstanceInvalidationService r24 = this.e;
        az2 r25 = r24.p;
        monitor-enter(r25);
        String r110 = (String) r24.o.get(Integer.valueOf(r22));     // Catch: Throwable -> L26
        if (r110 != null) goto L28;
        Log.w("ROOM", "Remote invalidation client ID not registered");     // Catch: Throwable -> L26
        monitor-exit(r25);
    L47:
        return true;
    L28:
        int r26 = r24.p.beginBroadcast();     // Catch: Throwable -> L26
    L29:
        az2 r27 = r24.p;
        if (r1 >= r26) goto L45;
        Object r28 = r27.getBroadcastCookie(r1);     // Catch: Throwable -> L38
        r28.getClass();     // Catch: Throwable -> L38
        Integer r29 = (Integer) r28;     // Catch: Throwable -> L38
        int r30 = r29.intValue();     // Catch: Throwable -> L38
        String r31 = (String) r24.o.get(r29);     // Catch: Throwable -> L38
        if (r22 == r30) goto L42;
        if (r110.equals(r31) == false) goto L42;
        ((uu1) r24.p.getBroadcastItem(r1)).o(r23);     // Catch: Throwable -> L38 RemoteException -> L40
    L40:
        e = move-exception;
        Log.w("ROOM", "Error invoking a remote callback", e);     // Catch: Throwable -> L38
    L42:
        r1 = r1 + 1;
        goto L29
    L38:
        th = move-exception;
        r24.p.finishBroadcast();     // Catch: Throwable -> L26
        throw th;     // Catch: Throwable -> L26
    L45:
        r27.finishBroadcast();     // Catch: Throwable -> L26
        monitor-exit(r25);
    L26:
        th = move-exception;
        throw th;
    L18:
        return super.onTransact(r7, r8, r9, r10);
    }
}
