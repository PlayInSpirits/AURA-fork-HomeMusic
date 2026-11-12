package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ok1 {
    public final u21 a = u21.p;
    public final int b = 1;
    public final int c = 1;
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final int g = 2;
    public final int h = 2;
    public final boolean i = true;
    public boolean j = false;
    public final boolean k = true;
    public final int l = 1;
    public final int m = 2;
    public final LinkedList n = new LinkedList();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Class cls, g32 g32Var) {
        TypeToken<?> typeToken = TypeToken.get((Type) cls);
        ux4 ux4Var = new ux4(g32Var, typeToken, typeToken.getType() == typeToken.getRawType());
        ArrayList arrayList = this.e;
        arrayList.add(ux4Var);
        if (g32Var instanceof bz4) {
            dz4 dz4Var = hz4.a;
            arrayList.add(new dz4(TypeToken.get((Type) cls), (bz4) g32Var, 2));
        }
    }
}
