package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jp implements vd0, ye0, Serializable {
    private final vd0<Object> completion;

    public jp(vd0 r1) {
        this.completion = r1;
    }

    public vd0<j15> create(vd0<?> r1) {
        r1.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public ye0 getCallerFrame() {
        vd0<Object> r1 = this.completion;
        if ((r1 instanceof ye0) == true) goto L5;
        return null;
    L5:
        return (ye0) r1;
    }

    public final vd0<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        ri0 r0 = (ri0) getClass().getAnnotation(ri0.class);
        String r1 = null;
        if (r0 != null) goto L6;
    L7:
        return null;
    L6:
        if (r0.v() < 1) goto L7;
        int r2 = -1;
        Field r4 = getClass().getDeclaredField("label");     // Catch: Exception -> L18
        r4.setAccessible(true);     // Catch: Exception -> L18
        Object r5 = r4.get(this);     // Catch: Exception -> L18
        if ((r5 instanceof Integer) == false) goto L12;
        Integer r6 = (Integer) r5;     // Catch: Exception -> L18
    L13:
        if (r6 == null) goto L16;
        int r7 = r6.intValue();     // Catch: Exception -> L18
    L17:
        int r8 = r7 - 1;
    L19:
        if (r8 < 0) goto L22;
        r2 = r0.l()[r8];
    L22:
        i61 r3 = ya4.b;
        i61 r9 = ya4.c;
        if (r9 == null) goto L53;
    L27:
        if (r9 == r3) goto L46;
        Method r10 = (Method) r9.o;
        if (r10 == null) goto L46;
        Object r12 = r10.invoke(getClass(), null);
        if (r12 == null) goto L46;
        Method r11 = (Method) r9.p;
        if (r11 == null) goto L46;
        Object r13 = r11.invoke(r12, null);
        if (r13 == null) goto L46;
        Method r14 = (Method) r9.q;
        if (r14 == null) goto L42;
        Object r15 = r14.invoke(r13, null);
    L44:
        if ((r15 instanceof String) == false) goto L46;
        r1 = (String) r15;
        goto L46
    L42:
        r15 = null;
    L46:
        if (r1 != null) goto L48;
        String r16 = r0.c();
    L50:
        return new StackTraceElement(r16, r0.m(), r0.f(), r2);
    L48:
        r16 = r1 + '/' + r0.c();
        goto L50
    L53:
        i61 r17 = new i61(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), false, 8);     // Catch: Exception -> L26
        ya4.c = r17;     // Catch: Exception -> L26
        r9 = r17;
    L26:
        ya4.c = r3;
        r9 = r3;
        goto L27
    L16:
        r7 = 0;
        goto L17
    L12:
        r6 = null;
    L18:
        r8 = -1;
        goto L19
    }

    public abstract Object invokeSuspend(Object r1);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.vd0
    public final void resumeWith(Object r3) {
    L2:
        jp r2 = (jp) r2;
        vd0<Object> r0 = r2.completion;
        r0.getClass();
        r3 = r2.invokeSuspend(r3);     // Catch: Throwable -> L6
        if (r3 == xe0.n) goto L5;
    L8:
        r2.releaseIntercepted();
        if ((r0 instanceof jp) == false) goto L11;
        ?? r4 = r0;
        goto L2
    L11:
        r0.resumeWith(r3);
        return;
    L5:
        return;
    L6:
        th = move-exception;
        r3 = new s14(th);
        goto L8
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("Continuation at ");
        Object r1 = getStackTraceElement();
        if (r1 != null) goto L5;
        r1 = getClass().getName();
    L5:
        r0.append(r1);
        return r0.toString();
    }

    public vd0<j15> create(Object r1, vd0<?> r2) {
        r2.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
