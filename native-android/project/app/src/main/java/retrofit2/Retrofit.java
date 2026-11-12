package retrofit2;

import defpackage.fr1;
import defpackage.fy;
import defpackage.gr1;
import defpackage.kf2;
import defpackage.mj0;
import defpackage.n14;
import defpackage.n83;
import defpackage.o83;
import defpackage.tz3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Retrofit {
    final gr1 baseUrl;
    final List<CallAdapter.Factory> callAdapterFactories;
    final fy callFactory;

    @Nullable
    final Executor callbackExecutor;
    final List<Converter.Factory> converterFactories;
    final int defaultCallAdapterFactoriesSize;
    final int defaultConverterFactoriesSize;
    private final ConcurrentHashMap<Method, Object> serviceMethodCache;
    final boolean validateEagerly;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Builder {

        @Nullable
        private gr1 baseUrl;
        private final List<CallAdapter.Factory> callAdapterFactories;

        @Nullable
        private fy callFactory;

        @Nullable
        private Executor callbackExecutor;
        private final List<Converter.Factory> converterFactories;
        private boolean validateEagerly;

        public Builder(Retrofit r5) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            this.callFactory = r5.callFactory;
            this.baseUrl = r5.baseUrl;
            int r0 = r5.converterFactories.size() - r5.defaultConverterFactoriesSize;
            int r1 = 1;
        L3:
            if (r1 >= r0) goto L5;
            this.converterFactories.add(r5.converterFactories.get(r1));
            r1 = r1 + 1;
            goto L3
        L5:
            int r2 = r5.callAdapterFactories.size() - r5.defaultCallAdapterFactoriesSize;
            int r3 = 0;
        L6:
            if (r3 >= r2) goto L8;
            this.callAdapterFactories.add(r5.callAdapterFactories.get(r3));
            r3 = r3 + 1;
            goto L6
        L8:
            this.callbackExecutor = r5.callbackExecutor;
            this.validateEagerly = r5.validateEagerly;
        }

        public Builder addCallAdapterFactory(CallAdapter.Factory r3) {
            List<CallAdapter.Factory> r0 = this.callAdapterFactories;
            Objects.requireNonNull(r3, "factory == null");
            r0.add(r3);
            return this;
        }

        public Builder addConverterFactory(Converter.Factory r3) {
            List<Converter.Factory> r0 = this.converterFactories;
            Objects.requireNonNull(r3, "factory == null");
            r0.add(r3);
            return this;
        }

        public Builder baseUrl(gr1 r3) {
            Objects.requireNonNull(r3, "baseUrl == null");
            ArrayList r0 = r3.f;
            if ("".equals(r0.get(r0.size() - 1)) == false) goto L6;
            this.baseUrl = r3;
            return this;
        L6:
            mj0.l(r3, "baseUrl must end in /: ");
            return null;
        }

        public Retrofit build() {
            if (this.baseUrl == null) goto L12;
            fy r0 = this.callFactory;
            if (r0 != null) goto L7;
            r0 = new o83(new n83());
        L7:
            fy r3 = r0;
            Executor r1 = this.callbackExecutor;
            if (r1 != null) goto L10;
            r1 = Platform.callbackExecutor;
        L10:
            Executor r9 = r1;
            BuiltInFactories r2 = Platform.builtInFactories;
            ArrayList r4 = new ArrayList(this.callAdapterFactories);
            List<? extends CallAdapter.Factory> r5 = r2.createDefaultCallAdapterFactories(r9);
            r4.addAll(r5);
            List<? extends Converter.Factory> r6 = r2.createDefaultConverterFactories();
            int r7 = r6.size();
            ArrayList r8 = new ArrayList((this.converterFactories.size() + 1) + r7);
            r8.add(new BuiltInConverters());
            r8.addAll(this.converterFactories);
            r8.addAll(r6);
            return new Retrofit(r3, this.baseUrl, Collections.unmodifiableList(r8), r7, Collections.unmodifiableList(r4), r5.size(), r9, this.validateEagerly);
        L12:
            kf2.o("Base URL required.");
            return null;
        }

        public List<CallAdapter.Factory> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public Builder callFactory(fy r2) {
            Objects.requireNonNull(r2, "factory == null");
            this.callFactory = r2;
            return this;
        }

        public Builder callbackExecutor(Executor r2) {
            Objects.requireNonNull(r2, "executor == null");
            this.callbackExecutor = r2;
            return this;
        }

        public Builder client(o83 r2) {
            Objects.requireNonNull(r2, "client == null");
            return callFactory(r2);
        }

        public List<Converter.Factory> converterFactories() {
            return this.converterFactories;
        }

        public Builder validateEagerly(boolean r1) {
            this.validateEagerly = r1;
            return this;
        }

        public Builder baseUrl(String r3) {
            Objects.requireNonNull(r3, "baseUrl == null");
            fr1 r0 = new fr1();
            r0.e(null, r3);
            return baseUrl(r0.b());
        }

        public Builder baseUrl(URL r3) {
            Objects.requireNonNull(r3, "baseUrl == null");
            String r4 = r3.toString();
            r4.getClass();
            fr1 r0 = new fr1();
            r0.e(null, r4);
            return baseUrl(r0.b());
        }

        public Builder() {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
        }
    }

    public Retrofit(fy r2, gr1 r3, List<Converter.Factory> r4, int r5, List<CallAdapter.Factory> r6, int r7, @Nullable Executor r8, boolean r9) {
        this.serviceMethodCache = new ConcurrentHashMap();
        this.callFactory = r2;
        this.baseUrl = r3;
        this.converterFactories = r4;
        this.defaultConverterFactoriesSize = r5;
        this.callAdapterFactories = r6;
        this.defaultCallAdapterFactoriesSize = r7;
        this.callbackExecutor = r8;
        this.validateEagerly = r9;
    }

    private void validateServiceInterface(Class<?> r7) {
        if (r7.isInterface() == false) goto L28;
        ArrayDeque r0 = new ArrayDeque(1);
        r0.add(r7);
    L6:
        if (r0.isEmpty() == true) goto L16;
        Class<?> r1 = (Class) r0.removeFirst();
        if (r1.getTypeParameters().length != 0) goto L9;
        Collections.addAll(r0, r1.getInterfaces());
        goto L6
    L9:
        StringBuilder r6 = new StringBuilder("Type parameters are unsupported on ");
        r6.append(r1.getName());
        if (r1 == r7) goto L13;
        r6.append(" which is an interface of ");
        r6.append(r7.getName());
    L13:
        throw new IllegalArgumentException(r6.toString());
    L16:
        if (this.validateEagerly == false) goto L27;
        Reflection r2 = Platform.reflection;
        Method[] r3 = r7.getDeclaredMethods();
        int r4 = r3.length;
        int r5 = 0;
    L18:
        if (r5 >= r4) goto L37;
        Method r8 = r3[r5];
        if (r2.isDefaultMethod(r8) == true) goto L26;
        if (Modifier.isStatic(r8.getModifiers()) == true) goto L26;
        if (r8.isSynthetic() == true) goto L26;
        loadServiceMethod(r7, r8);
    L26:
        r5 = r5 + 1;
        goto L18
    L37:
        return;
    L27:
        return;
    L28:
        kf2.n("API declarations must be interfaces.");
    }

    public gr1 baseUrl() {
        return this.baseUrl;
    }

    public CallAdapter<?, ?> callAdapter(Type r2, Annotation[] r3) {
        return nextCallAdapter(null, r2, r3);
    }

    public List<CallAdapter.Factory> callAdapterFactories() {
        return this.callAdapterFactories;
    }

    public fy callFactory() {
        return this.callFactory;
    }

    @Nullable
    public Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public List<Converter.Factory> converterFactories() {
        return this.converterFactories;
    }

    public <T> T create(final Class<T> r4) {
        validateServiceInterface(r4);
        return (T) Proxy.newProxyInstance(r4.getClassLoader(), new Class[]{r4}, new AnonymousClass1(this, r4));
    }

    public ServiceMethod<?> loadServiceMethod(Class<?> r3, Method r4) {
    L2:
        Object r0 = this.serviceMethodCache.get(r4);
        if ((r0 instanceof ServiceMethod) == true) goto L5;
        if (r0 != null) goto L24;
        Object r1 = new Object();
        monitor-enter(r1);
        r0 = this.serviceMethodCache.putIfAbsent(r4, r1);     // Catch: Throwable -> L15
        if (r0 == null) goto L39;
        monitor-exit(r1);     // Catch: Throwable -> L15
        goto L24
    L39:
        ServiceMethod<?> r5 = ServiceMethod.parseAnnotations(this, r3, r4);     // Catch: Throwable -> L17
        this.serviceMethodCache.put(r4, r5);     // Catch: Throwable -> L15
        monitor-exit(r1);     // Catch: Throwable -> L15
        return r5;
    L17:
        th = move-exception;
        this.serviceMethodCache.remove(r4);     // Catch: Throwable -> L15
        throw th;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    L24:
        monitor-enter(r0);
        Object r2 = this.serviceMethodCache.get(r4);     // Catch: Throwable -> L29
        if (r2 != null) goto L31;
        monitor-exit(r0);     // Catch: Throwable -> L29
        goto L2
    L31:
        ServiceMethod<?> r6 = (ServiceMethod) r2;     // Catch: Throwable -> L29
        monitor-exit(r0);     // Catch: Throwable -> L29
        return r6;
    L29:
        th = move-exception;
        throw th;
    L5:
        return (ServiceMethod) r0;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public CallAdapter<?, ?> nextCallAdapter(@Nullable CallAdapter.Factory r5, Type r6, Annotation[] r7) {
        Objects.requireNonNull(r6, "returnType == null");
        Objects.requireNonNull(r7, "annotations == null");
        int r0 = this.callAdapterFactories.indexOf(r5) + 1;
        int r1 = this.callAdapterFactories.size();
        int r2 = r0;
    L3:
        if (r2 >= r1) goto L8;
        CallAdapter<?, ?> r3 = this.callAdapterFactories.get(r2).get(r6, r7, this);
        if (r3 != null) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L8:
        StringBuilder r8 = new StringBuilder("Could not locate call adapter for ");
        r8.append(r6);
        r8.append(".\n");
        if (r5 == null) goto L14;
        r8.append("  Skipped:");
        int r9 = 0;
    L11:
        if (r9 >= r0) goto L13;
        r8.append("\n   * ");
        r8.append(this.callAdapterFactories.get(r9).getClass().getName());
        r9 = r9 + 1;
        goto L11
    L13:
        r8.append('\n');
    L14:
        r8.append("  Tried:");
        int r10 = this.callAdapterFactories.size();
    L15:
        if (r0 >= r10) goto L18;
        r8.append("\n   * ");
        r8.append(this.callAdapterFactories.get(r0).getClass().getName());
        r0 = r0 + 1;
        goto L15
    L18:
        throw new IllegalArgumentException(r8.toString());
    }

    public <T> Converter<T, tz3> nextRequestBodyConverter(@Nullable Converter.Factory r5, Type r6, Annotation[] r7, Annotation[] r8) {
        Objects.requireNonNull(r6, "type == null");
        Objects.requireNonNull(r7, "parameterAnnotations == null");
        Objects.requireNonNull(r8, "methodAnnotations == null");
        int r0 = this.converterFactories.indexOf(r5) + 1;
        int r1 = this.converterFactories.size();
        int r2 = r0;
    L3:
        if (r2 >= r1) goto L8;
        Converter<T, tz3> r3 = (Converter<T, tz3>) this.converterFactories.get(r2).requestBodyConverter(r6, r7, r8, this);
        if (r3 != null) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L8:
        StringBuilder r9 = new StringBuilder("Could not locate RequestBody converter for ");
        r9.append(r6);
        r9.append(".\n");
        if (r5 == null) goto L14;
        r9.append("  Skipped:");
        int r10 = 0;
    L11:
        if (r10 >= r0) goto L13;
        r9.append("\n   * ");
        r9.append(this.converterFactories.get(r10).getClass().getName());
        r10 = r10 + 1;
        goto L11
    L13:
        r9.append('\n');
    L14:
        r9.append("  Tried:");
        int r11 = this.converterFactories.size();
    L15:
        if (r0 >= r11) goto L18;
        r9.append("\n   * ");
        r9.append(this.converterFactories.get(r0).getClass().getName());
        r0 = r0 + 1;
        goto L15
    L18:
        throw new IllegalArgumentException(r9.toString());
    }

    public <T> Converter<n14, T> nextResponseBodyConverter(@Nullable Converter.Factory r5, Type r6, Annotation[] r7) {
        Objects.requireNonNull(r6, "type == null");
        Objects.requireNonNull(r7, "annotations == null");
        int r0 = this.converterFactories.indexOf(r5) + 1;
        int r1 = this.converterFactories.size();
        int r2 = r0;
    L3:
        if (r2 >= r1) goto L8;
        Converter<n14, T> r3 = (Converter<n14, T>) this.converterFactories.get(r2).responseBodyConverter(r6, r7, this);
        if (r3 != null) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L8:
        StringBuilder r8 = new StringBuilder("Could not locate ResponseBody converter for ");
        r8.append(r6);
        r8.append(".\n");
        if (r5 == null) goto L14;
        r8.append("  Skipped:");
        int r9 = 0;
    L11:
        if (r9 >= r0) goto L13;
        r8.append("\n   * ");
        r8.append(this.converterFactories.get(r9).getClass().getName());
        r9 = r9 + 1;
        goto L11
    L13:
        r8.append('\n');
    L14:
        r8.append("  Tried:");
        int r10 = this.converterFactories.size();
    L15:
        if (r0 >= r10) goto L18;
        r8.append("\n   * ");
        r8.append(this.converterFactories.get(r0).getClass().getName());
        r0 = r0 + 1;
        goto L15
    L18:
        throw new IllegalArgumentException(r8.toString());
    }

    public <T> Converter<T, tz3> requestBodyConverter(Type r2, Annotation[] r3, Annotation[] r4) {
        return nextRequestBodyConverter(null, r2, r3, r4);
    }

    public <T> Converter<n14, T> responseBodyConverter(Type r2, Annotation[] r3) {
        return nextResponseBodyConverter(null, r2, r3);
    }

    public <T> Converter<T, String> stringConverter(Type r4, Annotation[] r5) {
        Objects.requireNonNull(r4, "type == null");
        Objects.requireNonNull(r5, "annotations == null");
        int r0 = this.converterFactories.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        Converter<T, String> r2 = (Converter<T, String>) this.converterFactories.get(r1).stringConverter(r4, r5, this);
        if (r2 != null) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L9:
        return BuiltInConverters.ToStringConverter.INSTANCE;
    }
}
