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
        Class.forName("java.lang.reflect.AnnotatedType");     // Catch: ClassNotFoundException -> L4
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t12(AccessibleObject r1) {
        this.n = r1;
        this.o = (Member) r1;
    }

    public abstract TypeToken a();

    public final boolean equals(Object r3) {
        if ((r3 instanceof t12) == false) goto L10;
        t12 r4 = (t12) r3;
        if (a().equals(r4.a()) == true) goto L7;
        return false;
    L7:
        if (this.o.equals(r4.o) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation getAnnotation(Class r1) {
        return this.n.getAnnotation(r1);
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
    public final boolean isAnnotationPresent(Class r1) {
        return this.n.isAnnotationPresent(r1);
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.o.isSynthetic();
    }
}
