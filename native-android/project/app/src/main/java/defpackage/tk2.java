package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tk2 extends Binder implements lu1 {
    public static final /* synthetic */ int f = 0;
    public final WeakReference e;

    public tk2(gm2 r2) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.e = new WeakReference(r2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.lu1
    public final void c0(int r2) {
        gm2 r1 = (gm2) this.e.get();
        if (r1 == null) goto L6;
        r1.c(12, Integer.valueOf(r2));
        return;
    }

    @Override // defpackage.lu1
    public final void f(int r2) {
        gm2 r1 = (gm2) this.e.get();
        if (r1 == null) goto L6;
        r1.c(9, Integer.valueOf(r2));
        return;
    }

    @Override // defpackage.lu1
    public final void j(ei3 r2) {
        gm2 r1 = (gm2) this.e.get();
        if (r1 == null) goto L6;
        r1.c(2, r2);
        return;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r5, Parcel r6, Parcel r7, int r8) {
        ei3 r1 = null;
        if (r5 != 3) goto L5;
        r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (r6.readInt() == 0) goto L33;
        r1 = ei3.CREATOR.createFromParcel(r6);
    L33:
        j(r1);
        return true;
    L5:
        if (r5 != 9) goto L7;
        r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        f(r6.readInt());
        return true;
    L7:
        if (r5 == 1598968902) goto L26;
        WeakReference r0 = this.e;
        switch(r5) {
            case 11: goto L18;
            case 12: goto L16;
            case 13: goto L12;
            default: goto L11;
        };
    L12:
        r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        gm2 r4 = (gm2) r0.get();
        if (r4 == null) goto L25;
        r4.c(13, null);
        return true;
    L25:
        return true;
    L16:
        r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        c0(r6.readInt());
        return true;
    L18:
        r6.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (r6.readInt() == 0) goto L21;
        boolean r9 = true;
    L22:
        gm2 r10 = (gm2) r0.get();
        if (r10 == null) goto L25;
        r10.c(11, Boolean.valueOf(r9));
        goto L25
    L21:
        r9 = false;
        goto L22
    L11:
        return super.onTransact(r5, r6, r7, r8);
    L26:
        r7.getClass();
        r7.writeString("android.support.v4.media.session.IMediaControllerCallback");
        return true;
    }
}
