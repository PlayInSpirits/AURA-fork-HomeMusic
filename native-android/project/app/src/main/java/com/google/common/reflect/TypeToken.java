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

    public TypeToken(Class<?> cls) {
        boolean zA;
        Type typeCapture = capture();
        if (typeCapture instanceof Class) {
            this.runtimeType = typeCapture;
            return;
        }
        oz4 oz4Var = new oz4(0);
        cls.getClass();
        mz4 mz4Var = new mz4();
        mz4Var.o(cls);
        bx1 bx1VarB = bx1.b((HashMap) mz4Var.c);
        ue1 ue1VarA = bx1.a();
        ue1VarA.y(((ly3) oz4Var.n).entrySet());
        for (Map.Entry entry : bx1VarB.entrySet()) {
            pz4 pz4Var = (pz4) entry.getKey();
            Type type = (Type) entry.getValue();
            if (type instanceof TypeVariable) {
                zA = pz4Var.a((TypeVariable) type);
            } else {
                pz4Var.getClass();
                zA = false;
            }
            rr2.o(!zA, "Type variable %s bound to itself", pz4Var);
            ue1VarA.x(pz4Var, type);
        }
        this.runtimeType = new sz4(new oz4(ue1VarA.d(true))).b(typeCapture);
    }

    private static vz4 any(Type[] typeArr) {
        return new vz4(typeArr, true);
    }

    @CheckForNull
    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    private yw1 boundsAsInterfaces(Type[] typeArr) {
        uw1 uw1VarJ = yw1.j();
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.getRawType().isInterface()) {
                uw1VarJ.c(typeTokenOf);
            }
        }
        return uw1VarJ.f();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
        return type instanceof WildcardType ? canonicalizeWildcardType(typeVariable, (WildcardType) type) : canonicalizeWildcardsInType(type);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).a(type)) {
                arrayList.add(canonicalizeWildcardsInType(type));
            }
        }
        return new c(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]), 1);
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = canonicalizeTypeArg(typeParameters[i], actualTypeArguments[i]);
        }
        return b15.f(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        if (type instanceof ParameterizedType) {
            return canonicalizeWildcardsInParameterizedType((ParameterizedType) type);
        }
        return type instanceof GenericArrayType ? b15.d(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static vz4 every(Type[] typeArr) {
        return new vz4(typeArr, false);
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType == null) {
            tb4.c(cls, " does not appear to be a subtype of ", this);
            return null;
        }
        TypeToken<?> componentType2 = getComponentType();
        Objects.requireNonNull(componentType2);
        return (TypeToken<? extends T>) of(newArrayClassOrGenericArrayType(componentType2.getSubtype(componentType).runtimeType));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType == 0) {
            tb4.c(cls, " isn't a super type of ", this);
            return null;
        }
        Class<?> componentType2 = cls.getComponentType();
        Objects.requireNonNull(componentType2);
        return (TypeToken<? super T>) of(newArrayClassOrGenericArrayType(componentType.getSupertype(componentType2).runtimeType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sz4 getCovariantTypeResolver() {
        boolean zA;
        sz4 sz4Var = this.covariantTypeResolver;
        if (sz4Var != null) {
            return sz4Var;
        }
        Type type = this.runtimeType;
        oz4 oz4Var = new oz4(0);
        type.getClass();
        mz4 mz4Var = new mz4();
        mz4Var.o(type);
        bx1 bx1VarB = bx1.b((HashMap) mz4Var.c);
        ue1 ue1VarA = bx1.a();
        ue1VarA.y(((ly3) oz4Var.n).entrySet());
        for (Map.Entry entry : bx1VarB.entrySet()) {
            pz4 pz4Var = (pz4) entry.getKey();
            Type type2 = (Type) entry.getValue();
            if (type2 instanceof TypeVariable) {
                zA = pz4Var.a((TypeVariable) type2);
            } else {
                pz4Var.getClass();
                zA = false;
            }
            rr2.o(!zA, "Type variable %s bound to itself", pz4Var);
            ue1VarA.x(pz4Var, type2);
        }
        sz4 sz4Var2 = new sz4(new oz4(ue1VarA.d(true)));
        this.covariantTypeResolver = sz4Var2;
        return sz4Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sz4 getInvariantTypeResolver() {
        boolean zA;
        sz4 sz4Var = this.invariantTypeResolver;
        if (sz4Var != null) {
            return sz4Var;
        }
        Type typeA = rz4.b.a(this.runtimeType);
        typeA.getClass();
        mz4 mz4Var = new mz4();
        mz4Var.o(typeA);
        bx1 bx1VarB = bx1.b((HashMap) mz4Var.c);
        ue1 ue1VarA = bx1.a();
        ue1VarA.y(ly3.t.entrySet());
        for (Map.Entry entry : bx1VarB.entrySet()) {
            pz4 pz4Var = (pz4) entry.getKey();
            Type type = (Type) entry.getValue();
            if (type instanceof TypeVariable) {
                zA = pz4Var.a((TypeVariable) type);
            } else {
                pz4Var.getClass();
                zA = false;
            }
            rr2.o(!zA, "Type variable %s bound to itself", pz4Var);
            ue1VarA.x(pz4Var, type);
        }
        sz4 sz4Var2 = new sz4(new oz4(ue1VarA.d(true)));
        this.invariantTypeResolver = sz4Var2;
        return sz4Var2;
    }

    @CheckForNull
    private Type getOwnerTypeIfPresent() {
        Type type = this.runtimeType;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jx1 getRawTypes() {
        int i = jx1.p;
        ix1 ix1Var = new ix1(4);
        new mz4(2, ix1Var).o(this.runtimeType);
        return ix1Var.g();
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        tb4.c(cls, " isn't a subclass of ", this);
        return null;
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) typeTokenOf.getSupertype(cls);
            }
        }
        tb4.c(cls, " isn't a super type of ", this);
        return null;
    }

    private boolean is(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
        }
        WildcardType wildcardTypeCanonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (WildcardType) type);
        vz4 vz4VarEvery = every(wildcardTypeCanonicalizeWildcardType.getUpperBounds());
        Type type2 = this.runtimeType;
        boolean z = vz4VarEvery.b;
        TypeToken<?> typeTokenOf = of(type2);
        Type[] typeArr = vz4VarEvery.a;
        int length = typeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = !z;
                break;
            }
            if (typeTokenOf.isSubtypeOf(typeArr[i]) == z) {
                break;
            }
            i++;
        }
        return z && every(wildcardTypeCanonicalizeWildcardType.getLowerBounds()).a(this.runtimeType);
    }

    private boolean isOwnedBySubtypeOf(Type type) {
        Iterator it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = ((TypeToken) it.next()).getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = of(parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < typeParameters.length; i++) {
            if (!of(getCovariantTypeResolver().b(typeParameters[i])).is(actualTypeArguments[i], typeParameters[i])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType());
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean isWrapper() {
        return dq3.b.keySet().contains(this.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
        return x05.n.a(type);
    }

    public static <T> TypeToken<T> of(Class<T> cls) {
        return new SimpleTypeToken(cls, null);
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> typeTokenOf = of(getCovariantTypeResolver().b(type));
        typeTokenOf.covariantTypeResolver = this.covariantTypeResolver;
        typeTokenOf.invariantTypeResolver = this.invariantTypeResolver;
        return typeTokenOf;
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        boolean zA;
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken genericType = toGenericType(cls);
        Type type = genericType.getSupertype(getRawType()).runtimeType;
        Type type2 = this.runtimeType;
        HashMap map = new HashMap();
        type.getClass();
        type2.getClass();
        sz4.a(map, type, type2);
        ue1 ue1VarA = bx1.a();
        ue1VarA.y(ly3.t.entrySet());
        for (Map.Entry entry : map.entrySet()) {
            pz4 pz4Var = (pz4) entry.getKey();
            Type type3 = (Type) entry.getValue();
            if (type3 instanceof TypeVariable) {
                zA = pz4Var.a((TypeVariable) type3);
            } else {
                pz4Var.getClass();
                zA = false;
            }
            rr2.o(true ^ zA, "Type variable %s bound to itself", pz4Var);
            ue1VarA.x(pz4Var, type3);
        }
        return new sz4(new oz4(ue1VarA.d(true))).b(genericType.runtimeType);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        o15 o15VarH = getRawTypes().iterator();
        while (o15VarH.hasNext()) {
            if (cls.isAssignableFrom((Class) o15VarH.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return (TypeToken<? extends T>) of(b15.d(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (TypeToken<? extends T>) of(b15.f(type, cls, typeParameters)) : of((Class) cls);
    }

    public final t12 constructor(Constructor<?> constructor) {
        rr2.p(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new uz4(this, constructor);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    @CheckForNull
    public final TypeToken<?> getComponentType() {
        Type typeC = b15.c(this.runtimeType);
        if (typeC == null) {
            return null;
        }
        return of(typeC);
    }

    public final yw1 getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        uw1 uw1VarJ = yw1.j();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            uw1VarJ.c(resolveSupertype(type2));
        }
        return uw1VarJ.f();
    }

    @CheckForNull
    public final TypeToken<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (TypeToken<? super T>) resolveSupertype(genericSuperclass);
    }

    public final Class<? super T> getRawType() {
        return (Class) getRawTypes().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        rr2.o(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        rr2.p(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) of(resolveTypeArgsForSubclass(cls));
        rr2.p(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        rr2.p(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds());
        }
        return cls.isArray() ? getArraySupertype(cls) : (TypeToken<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
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
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(Type type) {
        type.getClass();
        if (type instanceof WildcardType) {
            vz4 vz4VarAny = any(((WildcardType) type).getLowerBounds());
            Type type2 = this.runtimeType;
            boolean z = vz4VarAny.b;
            TypeToken<?> typeTokenOf = of(type2);
            for (Type type3 : vz4VarAny.a) {
                if (typeTokenOf.isSubtypeOf(type3) == z) {
                    return z;
                }
            }
            return !z;
        }
        Type type4 = this.runtimeType;
        if (type4 instanceof WildcardType) {
            return any(((WildcardType) type4).getUpperBounds()).a(type);
        }
        if (!(type4 instanceof TypeVariable)) {
            if (type4 instanceof GenericArrayType) {
                return of(type).isSupertypeOfArray((GenericArrayType) this.runtimeType);
            }
            if (type instanceof Class) {
                return someRawTypeIsSubclassOf((Class) type);
            }
            if (type instanceof ParameterizedType) {
                return isSubtypeOfParameterizedType((ParameterizedType) type);
            }
            if (type instanceof GenericArrayType) {
                return isSubtypeOfArrayType((GenericArrayType) type);
            }
        } else if (type4.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).a(type)) {
            return true;
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final t12 method(Method method) {
        rr2.p(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new tz4(this, method);
    }

    public final TypeToken<T> rejectTypeVariables() {
        new mz4(1, this).o(this.runtimeType);
        return this;
    }

    public final TypeToken<?> resolveType(Type type) {
        type.getClass();
        return of(getInvariantTypeResolver().b(type));
    }

    public String toString() {
        Type type = this.runtimeType;
        c32 c32Var = b15.a;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public final TypeToken<T> unwrap() {
        if (!isWrapper()) {
            return this;
        }
        Class cls = (Class) this.runtimeType;
        Map map = dq3.a;
        cls.getClass();
        Class cls2 = (Class) dq3.b.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return of(cls);
    }

    public final <X> TypeToken<T> where(kz4 kz4Var, Class<X> cls) {
        return where(kz4Var, of((Class) cls));
    }

    public final TypeToken<T> wrap() {
        if (!isPrimitive()) {
            return this;
        }
        Class cls = (Class) this.runtimeType;
        Map map = dq3.a;
        cls.getClass();
        Class cls2 = (Class) dq3.a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return of(cls);
    }

    public Object writeReplace() {
        return of(new sz4().b(this.runtimeType));
    }

    public static TypeToken<?> of(Type type) {
        return new SimpleTypeToken(type, null);
    }

    public final <X> TypeToken<T> where(kz4 kz4Var, TypeToken<X> typeToken) {
        throw null;
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public TypeToken() {
        Type typeCapture = capture();
        this.runtimeType = typeCapture;
        if (typeCapture instanceof TypeVariable) {
            kf2.o(gh0.s("Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeCapture));
            throw null;
        }
    }

    private TypeToken(Type type) {
        type.getClass();
        this.runtimeType = type;
    }

    public /* synthetic */ TypeToken(Type type, tz4 tz4Var) {
        this(type);
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }
}
