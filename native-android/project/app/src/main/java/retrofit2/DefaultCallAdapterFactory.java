package retrofit2;

import defpackage.fu4;
import defpackage.kf2;
import defpackage.oz3;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class DefaultCallAdapterFactory extends CallAdapter.Factory {

    @Nullable
    private final Executor callbackExecutor;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class ExecutorCallbackCall<T> implements Call<T> {
        final Executor callbackExecutor;
        final Call<T> delegate;

        /* JADX INFO: renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
        public class AnonymousClass1 implements Callback<T> {
            final /* synthetic */ ExecutorCallbackCall this$0;
            final /* synthetic */ Callback val$callback;

            public AnonymousClass1(ExecutorCallbackCall r1, Callback r2) {
                this.this$0 = r1;
                this.val$callback = r2;
            }

            public static /* synthetic */ void a(AnonymousClass1 r0, Callback r1, Throwable r2) {
                r0.lambda$onFailure$1(r1, r2);
            }

            public static /* synthetic */ void b(AnonymousClass1 r0, Callback r1, Response r2) {
                r0.lambda$onResponse$0(r1, r2);
            }

            private /* synthetic */ void lambda$onFailure$1(Callback r1, Throwable r2) {
                r1.onFailure(this.this$0, r2);
            }

            private /* synthetic */ void lambda$onResponse$0(Callback r2, Response r3) {
                boolean r0 = this.this$0.delegate.isCanceled();
                ExecutorCallbackCall r1 = this.this$0;
                if (r0 == false) goto L6;
                r2.onFailure(r1, new IOException("Canceled"));
                return;
            L6:
                r2.onResponse(r1, r3);
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<T> r4, Throwable r5) {
                this.this$0.callbackExecutor.execute(new a(this, this.val$callback, r5, 1));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> r4, Response<T> r5) {
                this.this$0.callbackExecutor.execute(new a(this, this.val$callback, r5, 0));
            }
        }

        public ExecutorCallbackCall(Executor r1, Call<T> r2) {
            this.callbackExecutor = r1;
            this.delegate = r2;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.Call
        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public Call<T> mo76clone() {
            return new ExecutorCallbackCall(this.callbackExecutor, this.delegate.mo76clone());
        }

        @Override // retrofit2.Call
        public void enqueue(Callback<T> r3) {
            Objects.requireNonNull(r3, "callback == null");
            this.delegate.enqueue(new AnonymousClass1(this, r3));
        }

        @Override // retrofit2.Call
        public Response<T> execute() {
            return this.delegate.execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        @Override // retrofit2.Call
        public oz3 request() {
            return this.delegate.request();
        }

        @Override // retrofit2.Call
        public fu4 timeout() {
            return this.delegate.timeout();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return mo76clone();
        }
    }

    public DefaultCallAdapterFactory(@Nullable Executor r1) {
        this.callbackExecutor = r1;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type r3, Annotation[] r4, Retrofit r5) {
        final Executor r1 = null;
        if (CallAdapter.Factory.getRawType(r3) == Call.class) goto L6;
        return null;
    L6:
        if ((r3 instanceof ParameterizedType) == false) goto L13;
        final Type r6 = Utils.getParameterUpperBound(0, (ParameterizedType) r3);
        if (Utils.isAnnotationPresent(r4, SkipCallbackExecutor.class) == true) goto L12;
        r1 = this.callbackExecutor;
    L12:
        return new AnonymousClass1(this, r6, r1);
    L13:
        kf2.n("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
