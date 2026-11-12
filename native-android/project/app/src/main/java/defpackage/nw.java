package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nw implements t04 {
    public final /* synthetic */ int a;
    public final iu0 b;

    public /* synthetic */ nw(iu0 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.t04
    public final boolean a(Object r3, db3 r4) {
        switch(this.a) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        ParcelFileDescriptor r5 = (ParcelFileDescriptor) r3;
        String r2 = Build.MANUFACTURER;
        if ("HUAWEI".equalsIgnoreCase(r2) == true) goto L9;
        if ("HONOR".equalsIgnoreCase(r2) == true) goto L9;
    L11:
        if ("robolectric".equals(Build.FINGERPRINT) == true) goto L13;
        return true;
    L13:
        return false;
    L9:
        if (r5.getStatSize() > 536870912) goto L13;
    L15:
        ByteBuffer r6 = (ByteBuffer) r3;
        return true;
    }

    @Override // defpackage.t04
    public final q04 b(Object r7, int r8, int r9, db3 r10) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        iu0 r0 = this.b;
        return r0.a(new r20((ParcelFileDescriptor) r7, r0.d, r0.c), r8, r9, r10, iu0.j);
    L6:
        iu0 r1 = this.b;
        return r1.a(new z05((ByteBuffer) r7, r1.d, r1.c, 5), r8, r9, r10, iu0.j);
    }
}
