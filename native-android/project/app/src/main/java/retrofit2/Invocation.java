package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Invocation {
    private final List<?> arguments;

    @Nullable
    private final Object instance;
    private final Method method;
    private final Class<?> service;

    public Invocation(Class<?> r1, @Nullable Object r2, Method r3, List<?> r4) {
        this.service = r1;
        this.instance = r2;
        this.method = r3;
        this.arguments = Collections.unmodifiableList(r4);
    }

    public static <T> Invocation of(Class<T> r2, T r3, Method r4, List<?> r5) {
        Objects.requireNonNull(r2, "service == null");
        Objects.requireNonNull(r3, "instance == null");
        Objects.requireNonNull(r4, "method == null");
        Objects.requireNonNull(r5, "arguments == null");
        return new Invocation(r2, r3, r4, new ArrayList(r5));
    }

    public List<?> arguments() {
        return this.arguments;
    }

    @Nullable
    public Object instance() {
        return this.instance;
    }

    public Method method() {
        return this.method;
    }

    public Class<?> service() {
        return this.service;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.service.getName(), this.method.getName(), this.arguments});
    }

    @Deprecated
    public static Invocation of(Method r3, List<?> r4) {
        Objects.requireNonNull(r3, "method == null");
        Objects.requireNonNull(r4, "arguments == null");
        return new Invocation(r3.getDeclaringClass(), null, r3, new ArrayList(r4));
    }
}
