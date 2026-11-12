package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ef5 extends Binder implements IInterface {
    public final /* synthetic */ int e;

    public ef5(int r1, String r2) {
        this.e = r1;
        switch(r1) {
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        attachInterface(this, r2);
        return;
    L6:
        attachInterface(this, r2);
        return;
    L8:
        attachInterface(this, r2);
    }

    public static void L0(Parcel r2) {
        int r0 = bi5.a;
        int r3 = r2.dataAvail();
        if (r3 > 0) goto L6;
        return;
    L6:
        throw new BadParcelableException(f34.f(r3, "Parcel data not fully consumed, unread size: "));
    }

    public abstract boolean K0(Parcel r1, int r2);

    public abstract boolean M0(int r1, Parcel r2, Parcel r3);

    public abstract boolean N0(int r1, Parcel r2, Parcel r3);

    public boolean O0(int r1, Parcel r2, Parcel r3) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int r0 = this.e;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r5, Parcel r6, Parcel r7, int r8) {
        boolean r1 = false;
        switch(this.e) {
            case 0: goto L51;
            case 1: goto L44;
            case 2: goto L37;
            case 3: goto L30;
            default: goto L4;
        };
    L4:
        if (r5 <= 16777215) goto L6;
        boolean r9 = super.onTransact(r5, r6, r7, r8);
    L7:
        if (r9 == true) goto L29;
        t02 r4 = (t02) this;
        if (r5 != 1) goto L12;
        Status r10 = (Status) bi5.a(r6, Status.CREATOR);
        hf3 r11 = (hf3) bi5.a(r6, hf3.CREATOR);
        L0(r6);
        r10.getClass();
        g12.R(r10, r11, r4.f);
        goto L29
    L12:
        if (r5 != 2) goto L14;
        Status r12 = (Status) bi5.a(r6, Status.CREATOR);
        dy3 r13 = (dy3) bi5.a(r6, dy3.CREATOR);
        L0(r6);
        r12.getClass();
        throw new UnsupportedOperationException();
    L14:
        if (r5 != 3) goto L16;
        Status r14 = (Status) bi5.a(r6, Status.CREATOR);
        o30 r15 = (o30) bi5.a(r6, o30.CREATOR);
        L0(r6);
        r14.getClass();
        throw new UnsupportedOperationException();
    L16:
        if (r5 != 4) goto L18;
        Status r16 = (Status) bi5.a(r6, Status.CREATOR);
        if3 r17 = (if3) bi5.a(r6, if3.CREATOR);
        L0(r6);
        r16.getClass();
        throw new UnsupportedOperationException();
    L18:
        if (r5 != 5) goto L58;
        Status r18 = (Status) bi5.a(r6, Status.CREATOR);
        vx3 r19 = (vx3) bi5.a(r6, vx3.CREATOR);
        L0(r6);
        r18.getClass();
        throw new UnsupportedOperationException();
    L58:
        return false;
    L29:
        return true;
    L6:
        r6.enforceInterface(getInterfaceDescriptor());
        r9 = false;
        goto L7
    L30:
        if (r5 > 16777215) goto L32;
        r6.enforceInterface(getInterfaceDescriptor());
    L36:
        return O0(r5, r6, r7);
    L32:
        if (super.onTransact(r5, r6, r7, r8) == false) goto L36;
        return true;
    L37:
        if (r5 <= 16777215) goto L39;
        r1 = super.onTransact(r5, r6, r7, r8);
    L40:
        if (r1 == false) goto L43;
        return true;
    L43:
        return K0(r6, r5);
    L39:
        r6.enforceInterface(getInterfaceDescriptor());
        goto L40
    L44:
        if (r5 > 16777215) goto L46;
        r6.enforceInterface(getInterfaceDescriptor());
    L50:
        return N0(r5, r6, r7);
    L46:
        if (super.onTransact(r5, r6, r7, r8) == false) goto L50;
        return true;
    L51:
        if (r5 > 16777215) goto L53;
        r6.enforceInterface(getInterfaceDescriptor());
    L57:
        return M0(r5, r6, r7);
    L53:
        if (super.onTransact(r5, r6, r7, r8) == false) goto L57;
        return true;
    }

    public /* synthetic */ ef5(int r1) {
        this.e = r1;
    }
}
