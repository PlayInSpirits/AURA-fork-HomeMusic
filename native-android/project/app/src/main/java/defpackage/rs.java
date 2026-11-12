package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rs implements t04 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public rs(Resources resources, t04 t04Var) {
        this.a = 0;
        this.c = resources;
        this.b = t04Var;
    }

    @Override // defpackage.t04
    public final boolean a(Object obj, db3 db3Var) {
        switch (this.a) {
            case 0:
                return ((t04) this.b).a(obj, db3Var);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    @Override // defpackage.t04
    public final q04 b(Object obj, int i, int i2, db3 db3Var) {
        boolean z;
        aw3 aw3Var;
        n21 n21Var;
        switch (this.a) {
            case 0:
                q04 q04VarB = ((t04) this.b).b(obj, i, i2, db3Var);
                Resources resources = (Resources) this.c;
                if (q04VarB == null) {
                    return null;
                }
                return new at(resources, q04VarB);
            case 1:
                q04 q04VarC = ((v04) this.b).c((Uri) obj, db3Var);
                if (q04VarC == null) {
                    return null;
                }
                return vv0.a((zs) this.c, (Drawable) ((wh1) q04VarC).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof aw3) {
                    aw3Var = (aw3) inputStream;
                    z = false;
                } else {
                    z = true;
                    aw3Var = new aw3(inputStream, (qj0) this.c);
                }
                ArrayDeque arrayDeque = n21.p;
                synchronized (arrayDeque) {
                    n21Var = (n21) arrayDeque.poll();
                    break;
                }
                if (n21Var == null) {
                    n21Var = new n21();
                }
                n21 n21Var2 = n21Var;
                n21Var2.n = aw3Var;
                mg2 mg2Var = new mg2(n21Var2);
                wo0 wo0Var = new wo0(aw3Var, n21Var2);
                try {
                    iu0 iu0Var = (iu0) this.b;
                    ArrayList arrayList = iu0Var.d;
                    qj0 qj0Var = iu0Var.c;
                    yc5 yc5Var = new yc5();
                    h12.f(qj0Var, "Argument must not be null");
                    yc5Var.o = qj0Var;
                    h12.f(arrayList, "Argument must not be null");
                    yc5Var.p = arrayList;
                    yc5Var.n = new hg3(mg2Var, qj0Var);
                    at atVarA = iu0Var.a(yc5Var, i, i2, db3Var, wo0Var);
                    n21Var2.o = null;
                    n21Var2.n = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(n21Var2);
                        break;
                    }
                    return atVarA;
                } finally {
                    n21Var2.o = null;
                    n21Var2.n = null;
                    ArrayDeque arrayDeque2 = n21.p;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(n21Var2);
                        if (z) {
                            aw3Var.f();
                        }
                    }
                }
        }
    }

    public /* synthetic */ rs(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
