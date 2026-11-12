package defpackage;

import android.util.Log;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 {
    public final Class a;
    public final List b;
    public final d14 c;
    public final io3 d;
    public final String e;

    public yi0(Class cls, Class cls2, Class cls3, List list, d14 d14Var, io3 io3Var) {
        this.a = cls;
        this.b = list;
        this.c = d14Var;
        this.d = io3Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    public final q04 a(int i, int i2, x7 x7Var, yh0 yh0Var, db3 db3Var) {
        q04 q04VarA;
        uw4 uw4Var;
        int iL;
        w04 w04VarA;
        boolean z;
        boolean z2;
        boolean z3;
        Object qh0Var;
        String str;
        io3 io3Var = this.d;
        Object objB = io3Var.b();
        h12.f(objB, "Argument must not be null");
        List list = (List) objB;
        try {
            q04 q04VarB = b(yh0Var, i, i2, db3Var, list);
            io3Var.a(list);
            xi0 xi0Var = (xi0) x7Var.p;
            int i3 = x7Var.o;
            wi0 wi0Var = xi0Var.n;
            Class<?> cls = q04VarB.get().getClass();
            if (i3 != 4) {
                uw4 uw4VarE = wi0Var.e(cls);
                uw4Var = uw4VarE;
                q04VarA = uw4VarE.a(xi0Var.u, q04VarB, xi0Var.y, xi0Var.z);
            } else {
                q04VarA = q04VarB;
                uw4Var = null;
            }
            if (!q04VarB.equals(q04VarA)) {
                q04VarB.b();
            }
            if (wi0Var.c.a().d.a(q04VarA.e()) != null) {
                w04VarA = wi0Var.c.a().d.a(q04VarA.e());
                if (w04VarA == null) {
                    final Class clsE = q04VarA.e();
                    throw new Registry$MissingComponentException(clsE) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + clsE + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                iL = w04VarA.l(xi0Var.B);
            } else {
                iL = 3;
                w04VarA = null;
            }
            f42 f42Var = xi0Var.I;
            ArrayList arrayListB = wi0Var.b();
            int size = arrayListB.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                if (((tw2) arrayListB.get(i4)).a.equals(f42Var)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (xi0Var.A.a) {
                case 0:
                    if (i3 == 4 || i3 == 5) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    break;
                case 1:
                case 2:
                    z2 = false;
                    break;
                default:
                    if (((!z && i3 == 3) || i3 == 1) && iL == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    break;
            }
            if (z2) {
                if (w04VarA == null) {
                    final Class<?> cls2 = q04VarA.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                int iW = xa3.w(iL);
                if (iW == 0) {
                    z3 = false;
                    qh0Var = new qh0(xi0Var.I, xi0Var.v);
                } else {
                    if (iW != 1) {
                        if (iL == 1) {
                            str = "SOURCE";
                        } else if (iL != 2) {
                            str = iL != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        kf2.n("Unknown strategy: ".concat(str));
                        return null;
                    }
                    z3 = false;
                    qh0Var = new s04(wi0Var.c.a, xi0Var.I, xi0Var.v, xi0Var.y, xi0Var.z, uw4Var, cls, xi0Var.B);
                }
                de2 de2Var = (de2) de2.r.b();
                de2Var.q = z3;
                de2Var.p = true;
                de2Var.o = q04VarA;
                jv3 jv3Var = xi0Var.s;
                jv3Var.n = qh0Var;
                jv3Var.o = w04VarA;
                jv3Var.p = de2Var;
                q04VarA = de2Var;
            }
            return this.c.q(q04VarA, db3Var);
        } catch (Throwable th) {
            io3Var.a(list);
            throw th;
        }
    }

    public final q04 b(yh0 yh0Var, int i, int i2, db3 db3Var, List list) throws GlideException {
        List list2 = this.b;
        int size = list2.size();
        q04 q04VarB = null;
        for (int i3 = 0; i3 < size; i3++) {
            t04 t04Var = (t04) list2.get(i3);
            try {
                if (t04Var.a(yh0Var.l(), db3Var)) {
                    q04VarB = t04Var.b(yh0Var.l(), i, i2, db3Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + t04Var, e);
                }
                list.add(e);
            }
            if (q04VarB != null) {
                break;
            }
        }
        if (q04VarB != null) {
            return q04VarB;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
