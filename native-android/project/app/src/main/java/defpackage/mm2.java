package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mm2 extends Binder implements ju1 {
    public final WeakReference e;

    public mm2(bm2 r2) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.e = new WeakReference(r2);
    }

    public static ju1 m(IBinder r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        IInterface r0 = r2.queryLocalInterface("androidx.media3.session.IMediaController");
        if (r0 != null) goto L8;
    L11:
        iu1 r1 = new iu1();
        r1.e = r2;
        return r1;
    L8:
        if ((r0 instanceof ju1) == false) goto L11;
        return (ju1) r0;
    }

    @Override // defpackage.ju1
    public final void C(int r2, Bundle r3) {
        if (r3 != null) goto L10;
        return;
    L10:
        U(new cn(26, za4.b(r3)));
        return;
    L7:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e);
    }

    @Override // defpackage.ju1
    public final void E(int r2, Bundle r3, Bundle r4) {
        if (r3 == null) goto L12;
        if (r4 == null) goto L12;
        U(new q31(r2, va4.a(r3), r4));
        return;
    L9:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
        return;
    L12:
        l93.q0("MediaControllerStub", "Ignoring custom command with null args.");
    }

    @Override // defpackage.ju1
    public final void I(int r5, Bundle r6, Bundle r7) {
        if (r6 == null) goto L23;
        if (r7 == null) goto L25;
        int r0 = X();     // Catch: RuntimeException -> L16
        if (r0 == (-1)) goto L24;
        lk3 r8 = lk3.r(r0, r6);     // Catch: RuntimeException -> L16
        jk3 r1 = new jk3(r7.getBoolean(jk3.d, false), r7.getBoolean(jk3.e, false));     // Catch: RuntimeException -> L13
        U(new ef0(18, r8, r1));
        return;
    L13:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e);
        return;
    L24:
        return;
    L16:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e);
        return;
    L25:
        return;
    }

    @Override // defpackage.ju1
    public final void I0(int r1, Bundle r2) {
        if (r2 != null) goto L10;
        return;
    L10:
        K0(r1, ab4.a(r2));
        return;
    L7:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e);
    }

    public final void K0(int r5, Object r6) {
        long r0 = Binder.clearCallingIdentity();
        bm2 r4 = (bm2) this.e.get();     // Catch: Throwable -> L10
        if (r4 != null) goto L7;
        Binder.restoreCallingIdentity(r0);
        return;
    L7:
        r4.b.y(r5, r6);     // Catch: Throwable -> L10
        r4.f1().a1(new ul(r5, 4, r4));     // Catch: Throwable -> L10
        Binder.restoreCallingIdentity(r0);
        return;
    L10:
        th = move-exception;
        Binder.restoreCallingIdentity(r0);
        throw th;
    }

    @Override // defpackage.ju1
    public final void O(int r1, Bundle r2) {
        if (r2 != null) goto L10;
        return;
    L10:
        K0(r1, m92.a(r2));
        return;
    L7:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e);
    }

    public final void U(lm2 r6) {
        long r0 = Binder.clearCallingIdentity();
        bm2 r5 = (bm2) this.e.get();     // Catch: Throwable -> L10
        if (r5 != null) goto L7;
        Binder.restoreCallingIdentity(r0);
        return;
    L7:
        f35.W(r5.f1().f, new ws1(14, r5, r6));     // Catch: Throwable -> L10
        Binder.restoreCallingIdentity(r0);
        return;
    L10:
        th = move-exception;
        Binder.restoreCallingIdentity(r0);
        throw th;
    }

    public final int X() {
        bm2 r0 = (bm2) this.e.get();
        if (r0 == null) goto L11;
        cb4 r1 = r0.n;
        if (r1 != null) goto L10;
        return -1;
    L10:
        return r1.a.f();
    L11:
        return -1;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.ju1
    public final void c() {
        U(new er1(23));
    }

    @Override // defpackage.ju1
    public final void e(int r2) {
        U(new er1(22));
    }

    @Override // defpackage.ju1
    public final void i(int r2, int r3, int r4) {
        U(new v31(r3, r4, 2));
    }

    @Override // defpackage.ju1
    public final void n(List r5, int r6) {
        if (r5 == null) goto L20;
        int r0 = X();     // Catch: RuntimeException -> L14
        if (r0 != (-1)) goto L7;
        return;
    L7:
        uw1 r1 = yw1.j();     // Catch: RuntimeException -> L14
        int r2 = 0;
    L9:
        if (r2 >= r5.size()) goto L11;
        Bundle r3 = (Bundle) r5.get(r2);     // Catch: RuntimeException -> L14
        r3.getClass();     // Catch: RuntimeException -> L14
        r1.c(j60.i(r0, r3));     // Catch: RuntimeException -> L14
        r2 = r2 + 1;     // Catch: RuntimeException -> L14
        goto L9
    L11:
        gy3 r7 = r1.f();     // Catch: RuntimeException -> L14
        U(new q31(r6, r7, 2));
        return;
    L14:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int r5, Parcel r6, Parcel r7, int r8) {
        if (r5 < 1) goto L8;
        if (r5 > 16777215) goto L8;
        r6.enforceInterface("androidx.media3.session.IMediaController");
    L8:
        if (r5 != 1598968902) goto L12;
        r7.writeString("androidx.media3.session.IMediaController");
        return true;
    L12:
        if (r5 == 4001) goto L92;
        boolean r2 = false;
        Object[] r3 = 0;
        if (r5 == 4002) goto L80;
        switch(r5) {
            case 3001: goto L78;
            case 3002: goto L76;
            case 3003: goto L74;
            case 3004: goto L72;
            case 3005: goto L70;
            case 3006: goto L68;
            case 3007: goto L63;
            case 3008: goto L61;
            case 3009: goto L59;
            case 3010: goto L48;
            case 3011: goto L46;
            case 3012: goto L40;
            case 3013: goto L38;
            case 3014: goto L36;
            case 3015: goto L31;
            case 3016: goto L29;
            case 3017: goto L20;
            case 3018: goto L18;
            default: goto L17;
        };
    L18:
        i(r6.readInt(), r6.readInt(), r6.readInt());
        return true;
    L20:
        int r9 = r6.readInt();
        Parcelable.Creator r10 = Bundle.CREATOR;
        Bundle r11 = (Bundle) gh0.a(r6, r10);
        Bundle r0 = (Bundle) gh0.a(r6, r10);
        Bundle r12 = (Bundle) gh0.a(r6, r10);
        if (r11 == null) goto L28;
        if (r0 == null) goto L28;
        U(new ij0(r9, va4.a(r11), r0, r12));
    L91:
        return true;
    L26:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
    L28:
        l93.q0("MediaControllerStub", "Ignoring custom command progress update with null args.");
        goto L91
    L29:
        n(r6.createTypedArrayList(Bundle.CREATOR), r6.readInt());
        return true;
    L31:
        r6.readInt();
        xa4.a((Bundle) gh0.a(r6, Bundle.CREATOR));     // Catch: RuntimeException -> L34
        U(new er1(21));
    L34:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e);
        goto L91
    L36:
        U(new cn(r6.readInt(), (PendingIntent) gh0.a(r6, PendingIntent.CREATOR)));
        return true;
    L38:
        int r13 = r6.readInt();
        Parcelable.Creator r14 = Bundle.CREATOR;
        I(r13, (Bundle) gh0.a(r6, r14), (Bundle) gh0.a(r6, r14));
        return true;
    L40:
        r6.readInt();
        Bundle r15 = f35.n((Bundle) gh0.a(r6, Bundle.CREATOR));
        if (r15 != null) goto L44;
        l93.q0("MediaControllerStub", "Ignoring null Bundle for extras");
        return true;
    L44:
        U(new cn(28, r15));
        return true;
    L46:
        e(r6.readInt());
        return true;
    L48:
        r6.readInt();
        Parcelable.Creator r16 = Bundle.CREATOR;
        Bundle r17 = (Bundle) gh0.a(r6, r16);
        Bundle r18 = (Bundle) gh0.a(r6, r16);
        if (r17 == null) goto L91;
        if (r18 == null) goto L91;
        U(new ef0(19, wa4.a(r17), mi3.b(r18)));
    L55:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
    L57:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e);
        goto L91
    L59:
        z(r6.readInt(), (Bundle) gh0.a(r6, Bundle.CREATOR));
        return true;
    L61:
        C(r6.readInt(), (Bundle) gh0.a(r6, Bundle.CREATOR));
        return true;
    L63:
        int r19 = r6.readInt();
        Bundle r20 = (Bundle) gh0.a(r6, Bundle.CREATOR);
        if (r6.readInt() == 0) goto L66;
        r2 = true;
    L66:
        u0(r19, r20, r2);
        return true;
    L68:
        r6.readInt();
        c();
        return true;
    L70:
        int r21 = r6.readInt();
        Parcelable.Creator r22 = Bundle.CREATOR;
        E(r21, (Bundle) gh0.a(r6, r22), (Bundle) gh0.a(r6, r22));
        return true;
    L72:
        s0(r6.createTypedArrayList(Bundle.CREATOR), r6.readInt());
        return true;
    L74:
        O(r6.readInt(), (Bundle) gh0.a(r6, Bundle.CREATOR));
        return true;
    L76:
        I0(r6.readInt(), (Bundle) gh0.a(r6, Bundle.CREATOR));
        return true;
    L78:
        r(r6.readInt(), (Bundle) gh0.a(r6, Bundle.CREATOR));
        return true;
    L17:
        return super.onTransact(r5, r6, r7, r8);
    L80:
        r6.readInt();
        String r23 = r6.readString();
        int r24 = r6.readInt();
        Bundle r25 = (Bundle) gh0.a(r6, Bundle.CREATOR);
        if (TextUtils.isEmpty(r23) == false) goto L83;
        l93.q0("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
        goto L91
    L83:
        if (r24 >= 0) goto L85;
        xa3.m(r24, "onSearchResultChanged(): Ignoring negative itemCount: ", "MediaControllerStub");
        goto L91
    L85:
        if (r25 != null) goto L98;
        jn2 r26 = null;
    L88:
        U(new jm2(r23, r24, r26, r3 == true ? 1 : 0));
        goto L91
    L98:
        r26 = jn2.a(r25);     // Catch: RuntimeException -> L89
    L89:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
        goto L91
    L92:
        w0(r6.readInt(), r6.readString(), r6.readInt(), (Bundle) gh0.a(r6, Bundle.CREATOR));
        return true;
    }

    @Override // defpackage.ju1
    public final void r(int r2, Bundle r3) {
        if (r3 != null) goto L10;
        return;
    L10:
        U(new cn(25, oa0.a(r3)));
        return;
    L7:
        e = move-exception;
        l93.r0("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
        c();
    }

    @Override // defpackage.ju1
    public final void s0(List r5, int r6) {
        if (r5 == null) goto L20;
        int r0 = X();     // Catch: RuntimeException -> L14
        if (r0 != (-1)) goto L7;
        return;
    L7:
        uw1 r1 = yw1.j();     // Catch: RuntimeException -> L14
        int r2 = 0;
    L9:
        if (r2 >= r5.size()) goto L11;
        Bundle r3 = (Bundle) r5.get(r2);     // Catch: RuntimeException -> L14
        r3.getClass();     // Catch: RuntimeException -> L14
        r1.c(j60.i(r0, r3));     // Catch: RuntimeException -> L14
        r2 = r2 + 1;     // Catch: RuntimeException -> L14
        goto L9
    L11:
        gy3 r7 = r1.f();     // Catch: RuntimeException -> L14
        U(new q31(r6, r7, 3));
        return;
    L14:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e);
        return;
    }

    @Override // defpackage.ju1
    public final void u0(int r3, Bundle r4, boolean r5) {
        Bundle r0 = new Bundle();
        r0.putBoolean(jk3.d, r5);
        r0.putBoolean(jk3.e, true);
        I(r3, r4, r0);
    }

    @Override // defpackage.ju1
    public final void w0(int r2, String r3, int r4, Bundle r5) {
        if (TextUtils.isEmpty(r3) == false) goto L6;
        l93.q0("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
        return;
    L6:
        if (r4 >= 0) goto L9;
        xa3.m(r4, "onChildrenChanged(): Ignoring negative itemCount: ", "MediaControllerStub");
        return;
    L9:
        if (r5 != null) goto L17;
        jn2 r6 = null;
    L12:
        U(new jm2(r3, r4, r6, 1));
        return;
    L17:
        r6 = jn2.a(r5);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
    }

    @Override // defpackage.ju1
    public final void z(int r1, Bundle r2) {
        if (r2 != null) goto L10;
        return;
    L10:
        U(new km2(mi3.b(r2)));
        return;
    L7:
        e = move-exception;
        l93.r0("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
    }
}
