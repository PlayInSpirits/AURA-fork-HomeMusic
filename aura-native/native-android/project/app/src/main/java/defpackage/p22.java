package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p22 implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public p22(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (h12.c(name, "supports") && h12.c(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (h12.c(name, "unsupported") && h12.c(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean zC = h12.c(name, "protocols");
        ArrayList arrayList = this.a;
        if (zC && objArr.length == 0) {
            return arrayList;
        }
        if ((h12.c(name, "selectProtocol") || h12.c(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        obj3.getClass();
                        String str = (String) obj3;
                        if (arrayList.contains(str)) {
                            this.c = str;
                            return str;
                        }
                        if (i != size) {
                            i++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((!h12.c(name, "protocolSelected") && !h12.c(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        this.c = (String) obj4;
        return null;
    }
}
