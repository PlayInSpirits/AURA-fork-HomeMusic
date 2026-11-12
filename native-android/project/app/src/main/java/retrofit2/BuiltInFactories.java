package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
class BuiltInFactories {

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Java8 extends BuiltInFactories {
        public Java8() {
        }

        @Override // retrofit2.BuiltInFactories
        public List<? extends CallAdapter.Factory> createDefaultCallAdapterFactories(@Nullable Executor r3) {
            return Arrays.asList(new CallAdapter.Factory[]{new CompletableFutureCallAdapterFactory(), new DefaultCallAdapterFactory(r3)});
        }

        @Override // retrofit2.BuiltInFactories
        public List<? extends Converter.Factory> createDefaultConverterFactories() {
            return Collections.singletonList(new OptionalConverterFactory());
        }
    }

    public BuiltInFactories() {
    }

    public List<? extends CallAdapter.Factory> createDefaultCallAdapterFactories(@Nullable Executor r1) {
        return Collections.singletonList(new DefaultCallAdapterFactory(r1));
    }

    public List<? extends Converter.Factory> createDefaultConverterFactories() {
        return Collections.EMPTY_LIST;
    }
}
