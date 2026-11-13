package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class nw implements t04 {
    public final /* synthetic */ int a;
    public final iu0 b;

    public /* synthetic */ nw(iu0 iu0Var, int i) {
        this.a = i;
        this.b = iu0Var;
    }

    @Override // defpackage.t04
    public final boolean a(Object obj, db3 db3Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // defpackage.t04
    public final q04 b(Object obj, int i, int i2, db3 db3Var) {
        switch (this.a) {
            case 0:
                iu0 iu0Var = this.b;
                return iu0Var.a(new z05((ByteBuffer) obj, iu0Var.d, iu0Var.c, 5), i, i2, db3Var, iu0.j);
            default:
                iu0 iu0Var2 = this.b;
                return iu0Var2.a(new r20((ParcelFileDescriptor) obj, iu0Var2.d, iu0Var2.c), i, i2, db3Var, iu0.j);
        }
    }
}
