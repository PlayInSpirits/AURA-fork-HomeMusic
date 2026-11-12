package com.google.common.reflect;

import defpackage.a05;
import defpackage.b15;
import defpackage.bx1;
import defpackage.c;
import defpackage.c32;
import defpackage.dq3;
import defpackage.gh0;
import defpackage.ix1;
import defpackage.iz4;
import defpackage.jx1;
import defpackage.kf2;
import defpackage.kz4;
import defpackage.ly3;
import defpackage.mz4;
import defpackage.o15;
import defpackage.oz4;
import defpackage.pz4;
import defpackage.rr2;
import defpackage.rz4;
import defpackage.sz4;
import defpackage.t12;
import defpackage.tb4;
import defpackage.tz4;
import defpackage.ue1;
import defpackage.uw1;
import defpackage.uz4;
import defpackage.vz4;
import defpackage.x05;
import defpackage.yw1;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeToken<T> extends iz4 implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    @CheckForNull
    private transient sz4 covariantTypeResolver;

    @CheckForNull
    private transient sz4 invariantTypeResolver;
    private final Type runtimeType;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class SimpleTypeToken<T> extends TypeToken<T> {
    }

    public TypeToken(Class<?> r10) {
        Type r0 = capture();
        if ((r0 instanceof Class) == false) goto L6;
        this.runtimeType = r0;
        return;
    L6:
        oz4 r1 = new oz4(0);
        r10.getClass();
        mz4 r3 = new mz4();
        r3.o(new Type[]{r10});
        bx1 r11 = bx1.b((HashMap) r3.c);
        ue1 r5 = bx1.a();
        r5.y(((ly3) r1.n).entrySet());
        Iterator r12 = r11.entrySet().iterator();
    L8:
        if (r12.hasNext() == false) goto L14;
        Map.Entry r2 = (Map.Entry) r12.next();
        pz4 r6 = (pz4) r2.getKey();
        Type r4 = (Type) r2.getValue();
        if ((r4 instanceof TypeVariable) == false) goto L12;
        boolean r7 = r6.a((TypeVariable) r4);
    L13:
        rr2.o(!r7, "Type variable %s bound to itself", r6);
        r5.x(r6, r4);
        goto L8
    L12:
        r6.getClass();
        r7 = false;
        goto L13
    L14:
        this.runtimeType = new sz4(new oz4(r5.d(true))).b(r0);
    }

    public static /* synthetic */ sz4 access$000(TypeToken r0) {
        return r0.getCovariantTypeResolver();
    }

    public static /* synthetic */ sz4 access$100(TypeToken r0) {
        return r0.getInvariantTypeResolver();
    }

    public static /* synthetic */ jx1 access$300(TypeToken r0) {
        return r0.getRawTypes();
    }

    public static /* synthetic */ Type access$500(TypeToken r0) {
        return r0.runtimeType;
    }

    private static vz4 any(Type[] r2) {
        return new vz4(r2, true);
    }

    @CheckForNull
    private TypeToken<? super T> boundAsSuperclass(Type r1) {
        TypeToken<? super T> r0 = (TypeToken<? super T>) of(r1);
        if (r0.getRawType().isInterface() == false) goto L6;
        return null;
    L6:
        return r0;
    }

    private yw1 boundsAsInterfaces(Type[] r5) {
        uw1 r4 = yw1.j();
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        TypeToken<?> r2 = of(r5[r1]);
        if (r2.getRawType().isInterface() == false) goto L7;
        r4.c(r2);
    L7:
        r1 = r1 + 1;
        goto L3
    L9:
        return r4.f();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> r1, Type r2) {
        if ((r2 instanceof WildcardType) == false) goto L7;
        return canonicalizeWildcardType(r1, (WildcardType) r2);
    L7:
        return canonicalizeWildcardsInType(r2);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> r7, WildcardType r8) {
        Type[] r9 = r7.getBounds();
        ArrayList r0 = new ArrayList();
        Type[] r1 = r8.getUpperBounds();
        int r2 = r1.length;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L9;
        Type r5 = r1[r4];
        if (any(r9).a(r5) == true) goto L7;
        r0.add(canonicalizeWildcardsInType(r5));
    L7:
        r4 = r4 + 1;
        goto L3
    L9:
        return new c(r8.getLowerBounds(), (Type[]) r0.toArray(new Type[0]), 1);
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType r6) {
        Class r0 = (Class) r6.getRawType();
        TypeVariable<Class<T>>[] r1 = r0.getTypeParameters();
        Type[] r2 = r6.getActualTypeArguments();
        int r3 = 0;
    L4:
        if (r3 >= r2.length) goto L7;
        r2[r3] = canonicalizeTypeArg(r1[r3], r2[r3]);
        r3 = r3 + 1;
        goto L4
    L7:
        return b15.f(r6.getOwnerType(), r0, r2);
    }

    private static Type canonicalizeWildcardsInType(Type r1) {
        if ((r1 instanceof ParameterizedType) == false) goto L7;
        return canonicalizeWildcardsInParameterizedType((ParameterizedType) r1);
    L7:
        if ((r1 instanceof GenericArrayType) == true) goto L9;
        return r1;
    L9:
        return b15.d(canonicalizeWildcardsInType(((GenericArrayType) r1).getGenericComponentType()));
    }

    private static vz4 every(Type[] r2) {
        return new vz4(r2, false);
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> r2) {
        Class<?> r0 = r2.getComponentType();
        if (r0 == null) goto L6;
        TypeToken<?> r1 = getComponentType();
        Objects.requireNonNull(r1);
        return (TypeToken<? extends T>) of(newArrayClassOrGenericArrayType(r1.getSubtype(r0).runtimeType));
    L6:
        tb4.c(r2, " does not appear to be a subtype of ", this);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeToken<? super T> getArraySupertype(Class<? super T> r2) {
        TypeToken<?> r0 = getComponentType();
        if (r0 == 0) goto L6;
        Class<?> r1 = r2.getComponentType();
        Objects.requireNonNull(r1);
        return (TypeToken<? super T>) of(newArrayClassOrGenericArrayType(r0.getSupertype(r1).runtimeType));
    L6:
        tb4.c(r2, " isn't a super type of ", this);
        return null;
    }

    private sz4 getCovariantTypeResolver() {
        sz4 r0 = this.covariantTypeResolver;
        if (r0 != null) goto L14;
        Type r1 = this.runtimeType;
        oz4 r2 = new oz4(0);
        r1.getClass();
        mz4 r3 = new mz4();
        r3.o(new Type[]{r1});
        bx1 r4 = bx1.b((HashMap) r3.c);
        ue1 r5 = bx1.a();
        r5.y(((ly3) r2.n).entrySet());
        Iterator r6 = r4.entrySet().iterator();
    L6:
        if (r6.hasNext() == false) goto L12;
        Map.Entry r7 = (Map.Entry) r6.next();
        pz4 r8 = (pz4) r7.getKey();
        Type r9 = (Type) r7.getValue();
        if ((r9 instanceof TypeVariable) == false) goto L10;
        boolean r10 = r8.a((TypeVariable) r9);
    L11:
        rr2.o(!r10, "Type variable %s bound to itself", r8);
        r5.x(r8, r9);
        goto L6
    L10:
        r8.getClass();
        r10 = false;
        goto L11
    L12:
        sz4 r11 = new sz4(new oz4(r5.d(true)));
        this.covariantTypeResolver = r11;
        return r11;
    L14:
        return r0;
    }

    private sz4 getInvariantTypeResolver() {
        sz4 r0 = this.invariantTypeResolver;
        if (r0 != null) goto L14;
        Type r1 = rz4.b.a(this.runtimeType);
        r1.getClass();
        mz4 r2 = new mz4();
        r2.o(new Type[]{r1});
        bx1 r3 = bx1.b((HashMap) r2.c);
        ue1 r4 = bx1.a();
        r4.y(ly3.t.entrySet());
        Iterator r5 = r3.entrySet().iterator();
    L6:
        if (r5.hasNext() == false) goto L12;
        Map.Entry r6 = (Map.Entry) r5.next();
        pz4 r7 = (pz4) r6.getKey();
        Type r8 = (Type) r6.getValue();
        if ((r8 instanceof TypeVariable) == false) goto L10;
        boolean r9 = r7.a((TypeVariable) r8);
    L11:
        rr2.o(!r9, "Type variable %s bound to itself", r7);
        r4.x(r7, r8);
        goto L6
    L10:
        r7.getClass();
        r9 = false;
        goto L11
    L12:
        sz4 r10 = new sz4(new oz4(r4.d(true)));
        this.invariantTypeResolver = r10;
        return r10;
    L14:
        return r0;
    }

    @CheckForNull
    private Type getOwnerTypeIfPresent() {
        Type r1 = this.runtimeType;
        if ((r1 instanceof ParameterizedType) == false) goto L7;
        return ((ParameterizedType) r1).getOwnerType();
    L7:
        if ((r1 instanceof Class) == true) goto L9;
        return null;
    L9:
        return ((Class) r1).getEnclosingClass();
    }

    private jx1 getRawTypes() {
        int r0 = jx1.p;
        ix1 r1 = new ix1(4);
        new mz4(2, r1).o(new Type[]{this.runtimeType});
        return r1.g();
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> r2, Type[] r3) {
        if (r3.length > 0) goto L5;
        tb4.c(r2, " isn't a subclass of ", this);
        return null;
    L5:
        return (TypeToken<? extends T>) of(r3[0]).getSubtype(r2);
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> r5, Type[] r6) {
        int r0 = r6.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        TypeToken<?> r2 = of(r6[r1]);
        if (r2.isSubtypeOf(r5) == true) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        return (TypeToken<? super T>) r2.getSupertype(r5);
    L9:
        tb4.c(r5, " isn't a super type of ", this);
        return null;
    }

    private boolean is(Type r7, TypeVariable<?> r8) {
        if (this.runtimeType.equals(r7) == false) goto L6;
        return true;
    L6:
        if ((r7 instanceof WildcardType) == false) goto L21;
        WildcardType r9 = canonicalizeWildcardType(r8, (WildcardType) r7);
        vz4 r10 = every(r9.getUpperBounds());
        Type r0 = this.runtimeType;
        boolean r1 = r10.b;
        TypeToken<?> r2 = of(r0);
        Type[] r11 = r10.a;
        int r3 = r11.length;
        int r4 = 0;
    L8:
        if (r4 >= r3) goto L13;
        if (r2.isSubtypeOf(r11[r4]) == r1) goto L14;
        r4 = r4 + 1;
    L14:
        if (r1 == true) goto L16;
    L19:
        return false;
    L16:
        if (every(r9.getLowerBounds()).a(this.runtimeType) == false) goto L19;
        return true;
    L13:
        r1 = !r1;
        goto L14
    L21:
        return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(r7));
    }

    private boolean isOwnedBySubtypeOf(Type r2) {
        Iterator r1 = getTypes().iterator();
    L4:
        if (r1.hasNext() == false) goto L11;
        Type r0 = ((TypeToken) r1.next()).getOwnerTypeIfPresent();
        if (r0 == null) goto L4;
        if (of(r0).isSubtypeOf(r2) == false) goto L4;
        return true;
    L11:
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType r3) {
        Type r2 = this.runtimeType;
        if ((r2 instanceof Class) == false) goto L10;
        Class r4 = (Class) r2;
        if (r4.isArray() == true) goto L8;
        return false;
    L8:
        return of(r4.getComponentType()).isSubtypeOf(r3.getGenericComponentType());
    L10:
        if ((r2 instanceof GenericArrayType) == true) goto L12;
        return false;
    L12:
        return of(((GenericArrayType) r2).getGenericComponentType()).isSubtypeOf(r3.getGenericComponentType());
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType r8) {
        Class<? super Object> r0 = of(r8).getRawType();
        if (someRawTypeIsSubclassOf(r0) == true) goto L5;
        return false;
    L5:
        TypeVariable<Class<? super Object>>[] r1 = r0.getTypeParameters();
        Type[] r2 = r8.getActualTypeArguments();
        int r3 = 0;
    L7:
        if (r3 >= r1.length) goto L13;
        if (of(getCovariantTypeResolver().b(r1[r3])).is(r2[r3], r1[r3]) == false) goto L10;
        r3 = r3 + 1;
        goto L7
    L10:
        return false;
    L13:
        if (Modifier.isStatic(((Class) r8.getRawType()).getModifiers()) == false) goto L15;
        return true;
    L15:
        if (r8.getOwnerType() != null) goto L17;
        return true;
    L17:
        if (isOwnedBySubtypeOf(r8.getOwnerType()) == true) goto L25;
        return false;
    L25:
        return true;
    }

    private boolean isSupertypeOfArray(GenericArrayType r3) {
        Type r0 = this.runtimeType;
        if ((r0 instanceof Class) == false) goto L11;
        Class r1 = (Class) r0;
        if (r1.isArray() == true) goto L9;
        return r1.isAssignableFrom(Object[].class);
    L9:
        return of(r3.getGenericComponentType()).isSubtypeOf(r1.getComponentType());
    L11:
        if ((r0 instanceof GenericArrayType) == true) goto L13;
        return false;
    L13:
        return of(r3.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
    }

    private boolean isWrapper() {
        return dq3.b.keySet().contains(this.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type r1) {
        return x05.n.a(r1);
    }

    public static <T> TypeToken<T> of(Class<T> r2) {
        return new SimpleTypeToken(r2, null);
    }

    private TypeToken<?> resolveSupertype(Type r2) {
        TypeToken<?> r3 = of(getCovariantTypeResolver().b(r2));
        r3.covariantTypeResolver = this.covariantTypeResolver;
        r3.invariantTypeResolver = this.invariantTypeResolver;
        return r3;
    }

    private Type resolveTypeArgsForSubclass(Class<?> r7) {
        if ((this.runtimeType instanceof Class) == true) goto L5;
    L9:
        TypeToken r8 = toGenericType(r7);
        Type r0 = r8.getSupertype(getRawType()).runtimeType;
        Type r6 = this.runtimeType;
        HashMap r1 = new HashMap();
        r0.getClass();
        r6.getClass();
        sz4.a(r1, r0, r6);
        ue1 r2 = bx1.a();
        r2.y(ly3.t.entrySet());
        Iterator r3 = r1.entrySet().iterator();
    L11:
        if (r3.hasNext() == false) goto L18;
        Map.Entry r4 = (Map.Entry) r3.next();
        pz4 r5 = (pz4) r4.getKey();
        Type r9 = (Type) r4.getValue();
        if ((r9 instanceof TypeVariable) == false) goto L15;
        boolean r10 = r5.a((TypeVariable) r9);
    L16:
        rr2.o(true ^ r10, "Type variable %s bound to itself", r5);
        r2.x(r5, r9);
        goto L11
    L15:
        r5.getClass();
        r10 = false;
        goto L16
    L18:
        return new sz4(new oz4(r2.d(true))).b(r8.runtimeType);
    L5:
        if (r7.getTypeParameters().length != 0) goto L7;
    L8:
        return r7;
    L7:
        if (getRawType().getTypeParameters().length == 0) goto L9;
        goto L8
    }

    private boolean someRawTypeIsSubclassOf(Class<?> r2) {
        o15 r1 = getRawTypes().h();
    L4:
        if (r1.hasNext() == false) goto L9;
        if (r2.isAssignableFrom((Class) r1.next()) == false) goto L4;
        return true;
    L9:
        return false;
    }

    public static <T> TypeToken<? extends T> toGenericType(Class<T> r3) {
        if (r3.isArray() == true) goto L5;
        TypeVariable<Class<T>>[] r0 = r3.getTypeParameters();
        if (r3.isMemberClass() == true) goto L9;
    L11:
        Type r1 = null;
    L13:
        if (r0.length > 0) goto L21;
        if (r1 == null) goto L19;
        if (r1 != r3.getEnclosingClass()) goto L21;
    L19:
        return of(r3);
    L21:
        return (TypeToken<? extends T>) of(b15.f(r1, r3, r0));
    L9:
        if (Modifier.isStatic(r3.getModifiers()) == true) goto L11;
        r1 = toGenericType(r3.getEnclosingClass()).runtimeType;
        goto L13
    L5:
        return (TypeToken<? extends T>) of(b15.d(toGenericType(r3.getComponentType()).runtimeType));
    }

    public final t12 constructor(Constructor<?> r4) {
        if (r4.getDeclaringClass() != getRawType()) goto L5;
        boolean r0 = true;
    L6:
        rr2.p(r0, "%s not declared by %s", r4, getRawType());
        return new uz4(this, r4);
    L5:
        r0 = false;
        goto L6
    }

    public boolean equals(@CheckForNull Object r2) {
        if ((r2 instanceof TypeToken) == true) goto L5;
        return false;
    L5:
        return this.runtimeType.equals(((TypeToken) r2).runtimeType);
    }

    @CheckForNull
    public final TypeToken<?> getComponentType() {
        Type r0 = b15.c(this.runtimeType);
        if (r0 != null) goto L7;
        return null;
    L7:
        return of(r0);
    }

    public final yw1 getGenericInterfaces() {
        Type r0 = this.runtimeType;
        if ((r0 instanceof TypeVariable) == false) goto L7;
        return boundsAsInterfaces(((TypeVariable) r0).getBounds());
    L7:
        if ((r0 instanceof WildcardType) == true) goto L9;
        uw1 r1 = yw1.j();
        Type[] r2 = getRawType().getGenericInterfaces();
        int r3 = r2.length;
        int r4 = 0;
    L11:
        if (r4 >= r3) goto L14;
        r1.c(resolveSupertype(r2[r4]));
        r4 = r4 + 1;
        goto L11
    L14:
        return r1.f();
    L9:
        return boundsAsInterfaces(((WildcardType) r0).getUpperBounds());
    }

    @CheckForNull
    public final TypeToken<? super T> getGenericSuperclass() {
        Type r0 = this.runtimeType;
        if ((r0 instanceof TypeVariable) == false) goto L7;
        return boundAsSuperclass(((TypeVariable) r0).getBounds()[0]);
    L7:
        if ((r0 instanceof WildcardType) == true) goto L9;
        Type r1 = getRawType().getGenericSuperclass();
        if (r1 != null) goto L15;
        return null;
    L15:
        return (TypeToken<? super T>) resolveSupertype(r1);
    L9:
        return boundAsSuperclass(((WildcardType) r0).getUpperBounds()[0]);
    }

    public final Class<? super T> getRawType() {
        return (Class) getRawTypes().h().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> r3) {
        rr2.o(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type r0 = this.runtimeType;
        if ((r0 instanceof WildcardType) == false) goto L7;
        return getSubtypeFromLowerBounds(r3, ((WildcardType) r0).getLowerBounds());
    L7:
        if (isArray() == true) goto L9;
        rr2.p(getRawType().isAssignableFrom(r3), "%s isn't a subclass of %s", r3, this);
        TypeToken<? extends T> r4 = (TypeToken<? extends T>) of(resolveTypeArgsForSubclass(r3));
        rr2.p(r4.isSubtypeOf(this), "%s does not appear to be a subtype of %s", r4, this);
        return r4;
    L9:
        return getArraySubtype(r3);
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> r3) {
        rr2.p(someRawTypeIsSubclassOf(r3), "%s is not a super class of %s", r3, this);
        Type r0 = this.runtimeType;
        if ((r0 instanceof TypeVariable) == false) goto L7;
        return getSupertypeFromUpperBounds(r3, ((TypeVariable) r0).getBounds());
    L7:
        if ((r0 instanceof WildcardType) == false) goto L11;
        return getSupertypeFromUpperBounds(r3, ((WildcardType) r0).getUpperBounds());
    L11:
        if (r3.isArray() == false) goto L15;
        return getArraySupertype(r3);
    L15:
        return (TypeToken<? super T>) resolveSupertype(toGenericType(r3).runtimeType);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final a05 getTypes() {
        return new a05(this);
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        if (getComponentType() == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isPrimitive() {
        Type r1 = this.runtimeType;
        if ((r1 instanceof Class) == true) goto L5;
        return false;
    L5:
        if (((Class) r1).isPrimitive() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean isSubtypeOf(Type r6) {
        r6.getClass();
        int r2 = 0;
        if ((r6 instanceof WildcardType) == false) goto L12;
        vz4 r7 = any(((WildcardType) r6).getLowerBounds());
        Type r5 = this.runtimeType;
        boolean r0 = r7.b;
        TypeToken<?> r8 = of(r5);
        Type[] r9 = r7.a;
        int r3 = r9.length;
    L5:
        if (r2 >= r3) goto L11;
        if (r8.isSubtypeOf(r9[r2]) == r0) goto L8;
        r2 = r2 + 1;
        goto L5
    L8:
        return r0;
    L11:
        return !r0;
    L12:
        Type r1 = this.runtimeType;
        if ((r1 instanceof WildcardType) == false) goto L17;
        return any(((WildcardType) r1).getUpperBounds()).a(r6);
    L17:
        if ((r1 instanceof TypeVariable) == false) goto L24;
        if (r1.equals(r6) == false) goto L21;
    L22:
        return true;
    L21:
        if (any(((TypeVariable) this.runtimeType).getBounds()).a(r6) == true) goto L22;
    L39:
        return false;
    L24:
        if ((r1 instanceof GenericArrayType) == false) goto L28;
        return of(r6).isSupertypeOfArray((GenericArrayType) this.runtimeType);
    L28:
        if ((r6 instanceof Class) == false) goto L32;
        return someRawTypeIsSubclassOf((Class) r6);
    L32:
        if ((r6 instanceof ParameterizedType) == false) goto L36;
        return isSubtypeOfParameterizedType((ParameterizedType) r6);
    L36:
        if ((r6 instanceof GenericArrayType) == false) goto L39;
        return isSubtypeOfArrayType((GenericArrayType) r6);
    }

    public final boolean isSupertypeOf(Type r1) {
        return of(r1).isSubtypeOf(getType());
    }

    public final t12 method(Method r3) {
        rr2.p(someRawTypeIsSubclassOf(r3.getDeclaringClass()), "%s not declared by %s", r3, this);
        return new tz4(this, r3);
    }

    public final TypeToken<T> rejectTypeVariables() {
        new mz4(1, this).o(new Type[]{this.runtimeType});
        return this;
    }

    public final TypeToken<?> resolveType(Type r1) {
        r1.getClass();
        return of(getInvariantTypeResolver().b(r1));
    }

    public String toString() {
        Type r1 = this.runtimeType;
        c32 r0 = b15.a;
        if ((r1 instanceof Class) == false) goto L7;
        return ((Class) r1).getName();
    L7:
        return r1.toString();
    }

    public final TypeToken<T> unwrap() {
        if (isWrapper() == false) goto L10;
        Class r1 = (Class) this.runtimeType;
        Map r0 = dq3.a;
        r1.getClass();
        Class r2 = (Class) dq3.b.get(r1);
        if (r2 == null) goto L9;
        r1 = r2;
    L9:
        return of(r1);
    L10:
        return this;
    }

    public final <X> TypeToken<T> where(kz4 r1, Class<X> r2) {
        return where(r1, of(r2));
    }

    public final TypeToken<T> wrap() {
        if (isPrimitive() == false) goto L10;
        Class r1 = (Class) this.runtimeType;
        Map r0 = dq3.a;
        r1.getClass();
        Class r2 = (Class) dq3.a.get(r1);
        if (r2 == null) goto L9;
        r1 = r2;
    L9:
        return of(r1);
    L10:
        return this;
    }

    public Object writeReplace() {
        return of(new sz4().b(this.runtimeType));
    }

    public static TypeToken<?> of(Type r2) {
        return new SimpleTypeToken(r2, null);
    }

    public final <X> TypeToken<T> where(kz4 r1, TypeToken<X> r2) {
        throw null;
    }

    public final boolean isSupertypeOf(TypeToken<?> r1) {
        return r1.isSubtypeOf(getType());
    }

    public TypeToken() {
        Type r0 = capture();
        this.runtimeType = r0;
        if ((r0 instanceof TypeVariable) == true) goto L5;
        return;
    L5:
        kf2.o(gh0.s("Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", new Object[]{r0}));
        throw null;
    }

    private TypeToken(Type r1) {
        r1.getClass();
        this.runtimeType = r1;
    }

    public /* synthetic */ TypeToken(Type r1, tz4 r2) {
        this(r1);
    }

    public final boolean isSubtypeOf(TypeToken<?> r1) {
        return isSubtypeOf(r1.getType());
    }
}
