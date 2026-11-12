package defpackage;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fd2 {
    public final io3 a;
    public final List b;
    public final String c;

    public fd2(Class cls, Class cls2, Class cls3, List list, io3 io3Var) {
        this.a = io3Var;
        if (list.isEmpty()) {
            kf2.n("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final q04 a(int i, int i2, x7 x7Var, yh0 yh0Var, db3 db3Var) {
        io3 io3Var = this.a;
        Object objB = io3Var.b();
        h12.f(objB, "Argument must not be null");
        List list = (List) objB;
        try {
            List list2 = this.b;
            int size = list2.size();
            q04 q04VarA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    q04VarA = ((yi0) list2.get(i3)).a(i, i2, x7Var, yh0Var, db3Var);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (q04VarA != null) {
                    break;
                }
            }
            if (q04VarA == null) {
                throw new GlideException(this.c, new ArrayList(list));
            }
            io3Var.a(list);
            return q04VarA;
        } catch (Throwable th) {
            io3Var.a(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
