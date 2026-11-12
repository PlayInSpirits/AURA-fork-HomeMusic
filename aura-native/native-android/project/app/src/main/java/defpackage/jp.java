package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class jp
implements vd0,
ye0,
Serializable {
    private final vd0<Object> completion;

    public jp(vd0 vd02) {
        this.completion = vd02;
    }

    public vd0<j15> create(Object object, vd0<?> vd02) {
        vd02.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public vd0<j15> create(vd0<?> vd02) {
        vd02.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override
    public ye0 getCallerFrame() {
        vd0<Object> vd02 = this.completion;
        if (vd02 instanceof ye0) {
            return (ye0)((Object)vd02);
        }
        return null;
    }

    public final vd0<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        Method method;
        Object object;
        int n16;
        Object object2;
        int n17;
        Object var5_2;
        ri0 ri02;
        block19: {
            block18: {
                ri02 = this.getClass().getAnnotation(ri0.class);
                var5_2 = null;
                if (ri02 == null || ri02.v() < 1) {
                    return null;
                }
                n17 = -1;
                object2 = this.getClass().getDeclaredField("label");
                ((AccessibleObject)object2).setAccessible(true);
                object2 = ((Field)object2).get(this);
                object2 = object2 instanceof Integer ? (Integer)object2 : null;
                if (object2 == null) break block18;
                try {
                    n16 = (Integer)object2;
                    break block19;
                }
                catch (Exception exception) {
                    n16 = -1;
                }
            }
            n16 = 0;
        }
        --n16;
        n16 = n16 < 0 ? n17 : ri02.l()[n16];
        Object object3 = ya4.b;
        object2 = object = ya4.c;
        if (object == null) {
            try {
                method = Class.class.getDeclaredMethod("getModule", null);
                object = this.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null);
                Method method2 = this.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null);
                ya4.c = object2 = new i61(method, object, method2, false, 8);
            }
            catch (Exception exception) {
                ya4.c = object3;
                object2 = object3;
            }
        }
        if (object2 == object3) {
            object3 = var5_2;
        } else {
            object = (Method)((i61)object2).o;
            object3 = var5_2;
            if (object != null) {
                if ((object = ((Method)object).invoke(this.getClass(), null)) == null) {
                    object3 = var5_2;
                } else {
                    method = (Method)((i61)object2).p;
                    object3 = var5_2;
                    if (method != null) {
                        object3 = method.invoke(object, null);
                        if (object3 == null) {
                            object3 = var5_2;
                        } else {
                            object2 = (Method)((i61)object2).q;
                            object2 = object2 != null ? ((Method)object2).invoke(object3, null) : null;
                            object3 = var5_2;
                            if (object2 instanceof String) {
                                object3 = (String)object2;
                            }
                        }
                    }
                }
            }
        }
        if (object3 == null) {
            object2 = ri02.c();
        } else {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append('/');
            ((StringBuilder)object2).append(ri02.c());
            object2 = ((StringBuilder)object2).toString();
        }
        return new StackTraceElement((String)object2, ri02.m(), ri02.f(), n16);
    }

    public abstract Object invokeSuspend(Object var1);

    public void releaseIntercepted() {
    }

    @Override
    public final void resumeWith(Object object) {
        vd0 vd02 = this;
        do {
            jp jp5 = vd02;
            vd02 = jp5.completion;
            vd02.getClass();
            try {
                Object object2 = jp5.invokeSuspend(object);
                xe0 xe02 = xe0.n;
                object = object2;
                if (object2 == xe02) {
                    return;
                }
            }
            catch (Throwable throwable) {
                object = new s14(throwable);
            }
            jp5.releaseIntercepted();
        } while (vd02 instanceof jp);
        vd02.resumeWith(object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Continuation at ");
        StackTraceElement stackTraceElement = this.getStackTraceElement();
        Object object = stackTraceElement;
        if (stackTraceElement == null) {
            object = this.getClass().getName();
        }
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

