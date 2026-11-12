package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jp implements vd0, ye0, Serializable {
    private final vd0<Object> completion;

    public jp(vd0 vd0Var) {
        this.completion = vd0Var;
    }

    public vd0<j15> create(vd0<?> vd0Var) {
        vd0Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public ye0 getCallerFrame() {
        vd0<Object> vd0Var = this.completion;
        if (vd0Var instanceof ye0) {
            return (ye0) vd0Var;
        }
        return null;
    }

    public final vd0<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        ri0 ri0Var = (ri0) getClass().getAnnotation(ri0.class);
        String str = null;
        if (ri0Var == null || ri0Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? ri0Var.l()[iIntValue] : -1;
        i61 i61Var = ya4.b;
        i61 i61Var2 = ya4.c;
        if (i61Var2 == null) {
            try {
                i61 i61Var3 = new i61(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), false, 8);
                ya4.c = i61Var3;
                i61Var2 = i61Var3;
            } catch (Exception unused2) {
                ya4.c = i61Var;
                i61Var2 = i61Var;
            }
        }
        if (i61Var2 != i61Var && (method = (Method) i61Var2.o) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) i61Var2.p) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) i61Var2.q;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = ri0Var.c();
        } else {
            strC = str + '/' + ri0Var.c();
        }
        return new StackTraceElement(strC, ri0Var.m(), ri0Var.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            jp jpVar = (jp) r2;
            vd0<Object> vd0Var = jpVar.completion;
            vd0Var.getClass();
            try {
                obj = jpVar.invokeSuspend(obj);
                if (obj == xe0.n) {
                    return;
                }
            } catch (Throwable th) {
                obj = new s14(th);
            }
            jpVar.releaseIntercepted();
            if (!(vd0Var instanceof jp)) {
                vd0Var.resumeWith(obj);
                return;
            }
            r2 = vd0Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public vd0<j15> create(Object obj, vd0<?> vd0Var) {
        vd0Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
