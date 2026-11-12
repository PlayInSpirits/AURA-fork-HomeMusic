package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ng0 extends ContentObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public ng0(co4 r2) {
        this.a = 0;
        this.b = r2;
        super(new Handler());
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return true;
    L5:
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onChange(r2);
        return;
    L6:
        co4 r1 = (co4) this.b;
        if (r1.o == false) goto L14;
        Cursor r3 = r1.p;
        if (r3 != null) goto L11;
        return;
    L11:
        if (r3.isClosed() == true) goto L16;
        r1.n = r1.p.requery();
        return;
    L16:
        return;
    }

    public ng0(aw r2, Handler r3) {
        this.a = 1;
        this.b = r2;
        super(r3);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean r2, Uri r3) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onChange(r2, r3);
        return;
    L6:
        ((aw) this.b).d(j15.a);
    }
}
