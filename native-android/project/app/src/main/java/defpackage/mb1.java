package defpackage;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mb1 {
    public final int a;
    public final int b;
    public final Notification c;

    public mb1(int r1, Notification r2, int r3) {
        this.a = r1;
        this.c = r2;
        this.b = r3;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (mb1.class != r3.getClass()) goto L19;
        mb1 r4 = (mb1) r3;
        if (this.a == r4.a) goto L13;
        return false;
    L13:
        if (this.b == r4.b) goto L16;
        return false;
    L16:
        return this.c.equals(r4.c);
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = ((this.a * 31) + this.b) * 31;
        return this.c.hashCode() + r0;
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
