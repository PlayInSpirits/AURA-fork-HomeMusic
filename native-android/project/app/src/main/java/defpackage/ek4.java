package defpackage;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ek4 extends bz4 {
    public static final ri c = new ri(4);
    public final /* synthetic */ int a;
    public final bz4 b;

    public /* synthetic */ ek4(bz4 bz4Var, int i) {
        this.a = i;
        this.b = bz4Var;
    }

    @Override // defpackage.bz4
    public final Object a(l32 l32Var) throws IOException {
        int i = this.a;
        bz4 bz4Var = this.b;
        switch (i) {
            case 0:
                Date date = (Date) bz4Var.a(l32Var);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) bz4Var.a(l32Var)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                l32Var.b();
                while (l32Var.J()) {
                    arrayList.add(Long.valueOf(((Number) bz4Var.a(l32Var)).longValue()));
                }
                l32Var.q();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                if (l32Var.e0() != 9) {
                    return bz4Var.a(l32Var);
                }
                l32Var.a0();
                return null;
        }
    }

    @Override // defpackage.bz4
    public final void b(q32 q32Var, Object obj) throws IOException {
        int i = this.a;
        bz4 bz4Var = this.b;
        switch (i) {
            case 0:
                bz4Var.b(q32Var, (Timestamp) obj);
                break;
            case 1:
                bz4Var.b(q32Var, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                q32Var.f();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    bz4Var.b(q32Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                q32Var.q();
                break;
            default:
                if (obj == null) {
                    q32Var.F();
                } else {
                    bz4Var.b(q32Var, obj);
                }
                break;
        }
    }
}
