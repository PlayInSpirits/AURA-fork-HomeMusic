package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t12 implements AnnotatedElement, Member {
    public final AccessibleObject n;
    public final Member o;

    static {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t12(AccessibleObject accessibleObject) {
        this.n = accessibleObject;
        this.o = (Member) accessibleObject;
    }

    public abstract TypeToken a();

    public final boolean equals(Object obj) {
        if (!(obj instanceof t12)) {
            return false;
        }
        t12 t12Var = (t12) obj;
        return a().equals(t12Var.a()) && this.o.equals(t12Var.o);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation getAnnotation(Class cls) {
        return this.n.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.n.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.n.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class getDeclaringClass() {
        return this.o.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.o.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.o.getName();
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class cls) {
        return this.n.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.o.isSynthetic();
    }
}
