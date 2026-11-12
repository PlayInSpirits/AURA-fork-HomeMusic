package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t63 {
    public final String a;
    public final int b;
    public final Notification c;

    public t63(String r1, int r2, Notification r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final void a(yu1 r5) {
        String r0 = this.a;
        int r1 = this.b;
        Notification r4 = this.c;
        wu1 r6 = (wu1) r5;
        r6.getClass();
        Parcel r2 = Parcel.obtain();
        r2.writeInterfaceToken(yu1.c);     // Catch: Throwable -> L6
        r2.writeString(r0);     // Catch: Throwable -> L6
        r2.writeInt(r1);     // Catch: Throwable -> L6
        r2.writeString(null);     // Catch: Throwable -> L6
        r2.writeTypedObject(r4, 0);     // Catch: Throwable -> L6
        r6.e.transact(1, r2, null, 1);     // Catch: Throwable -> L6
        r2.recycle();
        return;
    L6:
        th = move-exception;
        r2.recycle();
        throw th;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("NotifyTask[packageName:");
        r0.append(this.a);
        r0.append(", id:");
        return f34.i(r0, this.b, ", tag:null]");
    }
}
