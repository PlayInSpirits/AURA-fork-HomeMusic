package retrofit2;

import defpackage.b11;
import defpackage.f34;
import defpackage.j15;
import defpackage.n14;
import defpackage.nz2;
import defpackage.tb4;
import defpackage.tv;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class Utils {
    static final Type[] EMPTY_TYPE_ARRAY = null;
    private static boolean checkForKotlinUnit = true;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class GenericArrayTypeImpl implements GenericArrayType {
        private final Type componentType;

        public GenericArrayTypeImpl(Type r1) {
            this.componentType = r1;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof GenericArrayType) == true) goto L5;
            return false;
        L5:
            if (Utils.equals(this, (GenericArrayType) r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return b11.q(new StringBuilder(), Utils.typeToString(this.componentType), "[]");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class ParameterizedTypeImpl implements ParameterizedType {

        @Nullable
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(@Nullable Type r5, Type r6, Type... r7) {
            int r1 = 0;
            if ((r6 instanceof Class) == false) goto L16;
            boolean r0 = true;
            if (r5 != null) goto L7;
            boolean r2 = true;
        L9:
            if (((Class) r6).getEnclosingClass() == null) goto L12;
            r0 = false;
        L12:
            if (r2 == r0) goto L16;
            nz2.c();
            throw null;
        L7:
            r2 = false;
        L16:
            int r3 = r7.length;
        L17:
            if (r1 >= r3) goto L19;
            Type r4 = r7[r1];
            Objects.requireNonNull(r4, "typeArgument == null");
            Utils.checkNotPrimitive(r4);
            r1 = r1 + 1;
            goto L17
        L19:
            this.ownerType = r5;
            this.rawType = r6;
            this.typeArguments = (Type[]) r7.clone();
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof ParameterizedType) == true) goto L5;
            return false;
        L5:
            if (Utils.equals(this, (ParameterizedType) r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            int r0 = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
            Type r2 = this.ownerType;
            if (r2 == null) goto L5;
            int r3 = r2.hashCode();
        L7:
            return r3 ^ r0;
        L5:
            r3 = 0;
            goto L7
        }

        public String toString() {
            Type[] r0 = this.typeArguments;
            if (r0.length == 0) goto L5;
            int r2 = 1;
            StringBuilder r1 = new StringBuilder((r0.length + 1) * 30);
            r1.append(Utils.typeToString(this.rawType));
            r1.append("<");
            r1.append(Utils.typeToString(this.typeArguments[0]));
        L8:
            if (r2 >= this.typeArguments.length) goto L10;
            r1.append(", ");
            r1.append(Utils.typeToString(this.typeArguments[r2]));
            r2 = r2 + 1;
            goto L8
        L10:
            r1.append(">");
            return r1.toString();
        L5:
            return Utils.typeToString(this.rawType);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class WildcardTypeImpl implements WildcardType {

        @Nullable
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] r5, Type[] r6) {
            if (r6.length <= 1) goto L5;
            nz2.c();
            throw null;
        L5:
            if (r5.length == 1) goto L7;
            nz2.c();
            throw null;
        L7:
            if (r6.length != 1) goto L14;
            r6[0].getClass();
            Utils.checkNotPrimitive(r6[0]);
            if (r5[0] != Object.class) goto L12;
            this.lowerBound = r6[0];
            this.upperBound = Object.class;
            return;
        L12:
            nz2.c();
            throw null;
        L14:
            r5[0].getClass();
            Utils.checkNotPrimitive(r5[0]);
            this.lowerBound = null;
            this.upperBound = r5[0];
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof WildcardType) == true) goto L5;
            return false;
        L5:
            if (Utils.equals(this, (WildcardType) r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type r2 = this.lowerBound;
            if (r2 == null) goto L7;
            return new Type[]{r2};
        L7:
            return Utils.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type r0 = this.lowerBound;
            if (r0 == null) goto L5;
            int r1 = r0.hashCode() + 31;
        L7:
            return (this.upperBound.hashCode() + 31) ^ r1;
        L5:
            r1 = 1;
            goto L7
        }

        public String toString() {
            if (this.lowerBound == null) goto L7;
            return "? super " + Utils.typeToString(this.lowerBound);
        L7:
            if (this.upperBound != Object.class) goto L11;
            return "?";
        L11:
            return "? extends " + Utils.typeToString(this.upperBound);
        }
    }

    static {
        EMPTY_TYPE_ARRAY = new Type[0];
    }

    private Utils() {
    }

    public static n14 buffer(n14 r4) {
        tv r0 = new tv();
        r4.source().N(r0);
        return n14.create(r4.contentType(), r4.contentLength(), r0);
    }

    public static void checkNotPrimitive(Type r1) {
        if ((r1 instanceof Class) == true) goto L5;
        return;
    L5:
        if (((Class) r1).isPrimitive() == false) goto L10;
        nz2.c();
        return;
    }

    @Nullable
    private static Class<?> declaringClassOf(TypeVariable<?> r1) {
        GenericDeclaration r2 = r1.getGenericDeclaration();
        if ((r2 instanceof Class) == true) goto L5;
        return null;
    L5:
        return (Class) r2;
    }

    public static boolean equals(Type r5, Type r6) {
        if (r5 != r6) goto L6;
        return true;
    L6:
        if ((r5 instanceof Class) == false) goto L10;
        return r5.equals(r6);
    L10:
        if ((r5 instanceof ParameterizedType) == false) goto L29;
        if ((r6 instanceof ParameterizedType) == true) goto L14;
        return false;
    L14:
        ParameterizedType r7 = (ParameterizedType) r5;
        ParameterizedType r8 = (ParameterizedType) r6;
        Type r1 = r7.getOwnerType();
        Type r3 = r8.getOwnerType();
        if (r1 == r3) goto L21;
        if (r1 != null) goto L18;
    L20:
        boolean r2 = false;
    L22:
        boolean r4 = r7.getRawType().equals(r8.getRawType());
        boolean r9 = Arrays.equals(r7.getActualTypeArguments(), r8.getActualTypeArguments());
        if (r2 == false) goto L27;
        if (r4 == false) goto L27;
        if (r9 == false) goto L27;
        return true;
    L27:
        return false;
    L18:
        if (r1.equals(r3) == false) goto L20;
    L21:
        r2 = true;
        goto L22
    L29:
        if ((r5 instanceof GenericArrayType) == false) goto L36;
        if ((r6 instanceof GenericArrayType) == true) goto L34;
        return false;
    L34:
        return equals(((GenericArrayType) r5).getGenericComponentType(), ((GenericArrayType) r6).getGenericComponentType());
    L36:
        if ((r5 instanceof WildcardType) == false) goto L47;
        if ((r6 instanceof WildcardType) == true) goto L40;
        return false;
    L40:
        WildcardType r10 = (WildcardType) r5;
        WildcardType r11 = (WildcardType) r6;
        if (Arrays.equals(r10.getUpperBounds(), r11.getUpperBounds()) == true) goto L43;
    L45:
        return false;
    L43:
        if (Arrays.equals(r10.getLowerBounds(), r11.getLowerBounds()) == false) goto L45;
        return true;
    L47:
        if ((r5 instanceof TypeVariable) == true) goto L49;
    L56:
        return false;
    L49:
        if ((r6 instanceof TypeVariable) == true) goto L51;
        return false;
    L51:
        TypeVariable r12 = (TypeVariable) r5;
        TypeVariable r13 = (TypeVariable) r6;
        if (r12.getGenericDeclaration() != r13.getGenericDeclaration()) goto L56;
        if (r12.getName().equals(r13.getName()) == false) goto L56;
        return true;
    }

    public static Type getGenericSupertype(Type r3, Class<?> r4, Class<?> r5) {
        if (r5 != r4) goto L5;
        return r3;
    L5:
        if (r5.isInterface() == false) goto L18;
        Class<?>[] r6 = r4.getInterfaces();
        int r0 = r6.length;
        int r1 = 0;
    L7:
        if (r1 >= r0) goto L18;
        Class<?> r2 = r6[r1];
        if (r2 == r5) goto L11;
        if (r5.isAssignableFrom(r2) == true) goto L15;
        r1 = r1 + 1;
        goto L7
    L15:
        return getGenericSupertype(r4.getGenericInterfaces()[r1], r6[r1], r5);
    L11:
        return r4.getGenericInterfaces()[r1];
    L18:
        if (r4.isInterface() == false) goto L20;
    L30:
        return r5;
    L20:
        if (r4 == Object.class) goto L30;
        Class<? super Object> r7 = r4.getSuperclass();
        if (r7 == r5) goto L24;
        if (r5.isAssignableFrom(r7) == true) goto L28;
        r4 = r7;
        goto L20
    L28:
        return getGenericSupertype(r4.getGenericSuperclass(), r7, r5);
    L24:
        return r4.getGenericSuperclass();
    }

    public static Type getParameterLowerBound(int r0, ParameterizedType r1) {
        Type r2 = r1.getActualTypeArguments()[r0];
        if ((r2 instanceof WildcardType) == true) goto L5;
        return r2;
    L5:
        return ((WildcardType) r2).getLowerBounds()[0];
    }

    public static Type getParameterUpperBound(int r4, ParameterizedType r5) {
        Type[] r0 = r5.getActualTypeArguments();
        if (r4 >= 0) goto L5;
    L10:
        StringBuilder r6 = f34.j(r4, "Index ", " not in range [0,");
        r6.append(r0.length);
        r6.append(") for ");
        r6.append(r5);
        throw new IllegalArgumentException(r6.toString());
    L5:
        if (r4 >= r0.length) goto L10;
        Type r7 = r0[r4];
        if ((r7 instanceof WildcardType) == true) goto L9;
        return r7;
    L9:
        return ((WildcardType) r7).getUpperBounds()[0];
    }

    public static Class<?> getRawType(Type r3) {
        Objects.requireNonNull(r3, "type == null");
        if ((r3 instanceof Class) == false) goto L7;
        return (Class) r3;
    L7:
        if ((r3 instanceof ParameterizedType) == false) goto L15;
        Type r4 = ((ParameterizedType) r3).getRawType();
        if ((r4 instanceof Class) == true) goto L11;
        nz2.c();
        return null;
    L11:
        return (Class) r4;
    L15:
        if ((r3 instanceof GenericArrayType) == false) goto L19;
        return Array.newInstance(getRawType(((GenericArrayType) r3).getGenericComponentType()), 0).getClass();
    L19:
        if ((r3 instanceof TypeVariable) == false) goto L23;
        return Object.class;
    L23:
        if ((r3 instanceof WildcardType) == true) goto L25;
        StringBuilder r1 = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        r1.append(r3);
        String r5 = r3.getClass().getName();
        r1.append("> is of type ");
        r1.append(r5);
        throw new IllegalArgumentException(r1.toString());
    L25:
        return getRawType(((WildcardType) r3).getUpperBounds()[0]);
    }

    public static Type getSupertype(Type r1, Class<?> r2, Class<?> r3) {
        if (r3.isAssignableFrom(r2) == true) goto L5;
        nz2.c();
        return null;
    L5:
        return resolve(r1, r2, getGenericSupertype(r1, r2, r3));
    }

    public static boolean hasUnresolvableType(@Nullable Type r5) {
        if ((r5 instanceof Class) == false) goto L6;
        return false;
    L6:
        if ((r5 instanceof ParameterizedType) == false) goto L15;
        Type[] r6 = ((ParameterizedType) r5).getActualTypeArguments();
        int r0 = r6.length;
        int r3 = 0;
    L8:
        if (r3 >= r0) goto L13;
        if (hasUnresolvableType(r6[r3]) == true) goto L11;
        r3 = r3 + 1;
        goto L8
    L11:
        return true;
    L13:
        return false;
    L15:
        if ((r5 instanceof GenericArrayType) == false) goto L19;
        return hasUnresolvableType(((GenericArrayType) r5).getGenericComponentType());
    L19:
        if ((r5 instanceof TypeVariable) == false) goto L22;
        return true;
    L22:
        if ((r5 instanceof WildcardType) == false) goto L24;
        return true;
    L24:
        if (r5 != null) goto L26;
        String r1 = "null";
    L27:
        tb4.h("Expected a Class, ParameterizedType, or GenericArrayType, but <", r5, "> is of type ", r1);
        return false;
    L26:
        r1 = r5.getClass().getName();
        goto L27
    }

    private static int indexOf(Object[] r3, Object r4) {
        int r1 = 0;
    L4:
        if (r1 >= r3.length) goto L9;
        if (r4.equals(r3[r1]) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return r1;
    L9:
        tb4.k();
        return 0;
    }

    public static boolean isAnnotationPresent(Annotation[] r4, Class<? extends Annotation> r5) {
        int r0 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        if (r5.isInstance(r4[r2]) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static boolean isUnit(Type r2) {
        if (checkForKotlinUnit == true) goto L5;
        return false;
    L5:
        if (r2 != j15.class) goto L8;
        return true;
    L8:
        return false;
    }

    public static RuntimeException methodError(Method r1, @Nullable Throwable r2, String r3, Object... r4) {
        StringBuilder r5 = b11.s(String.format(r3, r4), "\n    for method ");
        r5.append(r1.getDeclaringClass().getSimpleName());
        r5.append(".");
        r5.append(r1.getName());
        return new IllegalArgumentException(r5.toString(), r2);
    }

    public static RuntimeException parameterError(Method r1, Throwable r2, int r3, String r4, Object... r5) {
        return methodError(r1, r2, r4 + " (" + Platform.reflection.describeMethodParameter(r1, r3) + ")", r5);
    }

    public static Type resolve(Type r8, Class<?> r9, Type r10) {
    L3:
        if ((r10 instanceof TypeVariable) == false) goto L9;
        TypeVariable r11 = (TypeVariable) r10;
        Type r0 = resolveTypeVariable(r8, r9, r11);
        if (r0 == r11) goto L6;
        Type r12 = r0;
        goto L3
    L6:
        return r0;
    L9:
        if ((r12 instanceof Class) == false) goto L18;
        Class r1 = (Class) r12;
        if (r1.isArray() == false) goto L18;
        Class<?> r13 = r1.getComponentType();
        Type r14 = resolve(r8, r9, r13);
        if (r13 != r14) goto L16;
        return r1;
    L16:
        return new GenericArrayTypeImpl(r14);
    L18:
        if ((r12 instanceof GenericArrayType) == false) goto L24;
        GenericArrayType r15 = (GenericArrayType) r12;
        Type r2 = r15.getGenericComponentType();
        Type r16 = resolve(r8, r9, r2);
        if (r2 != r16) goto L23;
        return r15;
    L23:
        return new GenericArrayTypeImpl(r16);
    L24:
        int r3 = 0;
        if ((r12 instanceof ParameterizedType) == false) goto L42;
        ParameterizedType r17 = (ParameterizedType) r12;
        Type r4 = r17.getOwnerType();
        Type r5 = resolve(r8, r9, r4);
        if (r5 == r4) goto L29;
        boolean r6 = true;
    L30:
        Type[] r7 = r17.getActualTypeArguments();
        int r18 = r7.length;
    L31:
        if (r3 >= r18) goto L38;
        Type r19 = resolve(r8, r9, r7[r3]);
        if (r19 == r7[r3]) goto L37;
        if (r6 == true) goto L36;
        r7 = (Type[]) r7.clone();
        r6 = true;
    L36:
        r7[r3] = r19;
    L37:
        r3 = r3 + 1;
        goto L31
    L38:
        if (r6 == true) goto L40;
        return r17;
    L40:
        return new ParameterizedTypeImpl(r5, r17.getRawType(), r7);
    L29:
        r6 = false;
        goto L30
    L42:
        boolean r20 = r12 instanceof WildcardType;
        Type r110 = r12;
        if (r20 == false) goto L56;
        WildcardType r111 = (WildcardType) r12;
        Type[] r21 = r111.getLowerBounds();
        Type[] r22 = r111.getUpperBounds();
        if (r21.length != 1) goto L50;
        Type r23 = resolve(r8, r9, r21[0]);
        r110 = r111;
        if (r23 == r21[0]) goto L56;
        return new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{r23});
    L50:
        r110 = r111;
        if (r22.length != 1) goto L56;
        Type r24 = resolve(r8, r9, r22[0]);
        r110 = r111;
        if (r24 == r22[0]) goto L56;
        return new WildcardTypeImpl(new Type[]{r24}, EMPTY_TYPE_ARRAY);
    L56:
        return r110;
    }

    private static Type resolveTypeVariable(Type r1, Class<?> r2, TypeVariable<?> r3) {
        Class<?> r0 = declaringClassOf(r3);
        if (r0 == null) goto L9;
        Type r4 = getGenericSupertype(r1, r2, r0);
        if ((r4 instanceof ParameterizedType) == false) goto L9;
        int r5 = indexOf(r0.getTypeParameters(), r3);
        return ((ParameterizedType) r4).getActualTypeArguments()[r5];
    L9:
        return r3;
    }

    public static void throwIfFatal(Throwable r1) {
        if ((r1 instanceof VirtualMachineError) == true) goto L14;
        if ((r1 instanceof ThreadDeath) == true) goto L12;
        if ((r1 instanceof LinkageError) == true) goto L10;
        return;
    L10:
        throw ((LinkageError) r1);
    L12:
        throw ((ThreadDeath) r1);
    L14:
        throw ((VirtualMachineError) r1);
    }

    public static String typeToString(Type r1) {
        if ((r1 instanceof Class) == false) goto L7;
        return ((Class) r1).getName();
    L7:
        return r1.toString();
    }

    public static RuntimeException parameterError(Method r1, int r2, String r3, Object... r4) {
        return methodError(r1, r3 + " (" + Platform.reflection.describeMethodParameter(r1, r2) + ")", r4);
    }

    public static RuntimeException methodError(Method r1, String r2, Object... r3) {
        return methodError(r1, null, r2, r3);
    }
}
