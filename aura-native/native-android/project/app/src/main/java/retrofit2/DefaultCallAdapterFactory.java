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
            final /* synthetic */ Callback val$callback;

            public AnonymousClass1(Callback callback) {
                this.val$callback = callback;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onFailure$1(Callback callback, Throwable th) {
                callback.onFailure(ExecutorCallbackCall.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onResponse$0(Callback callback, Response response) {
                boolean zIsCanceled = ExecutorCallbackCall.this.delegate.isCanceled();
                ExecutorCallbackCall executorCallbackCall = ExecutorCallbackCall.this;
                if (zIsCanceled) {
                    callback.onFailure(executorCallbackCall, new IOException("Canceled"));
                } else {
                    callback.onResponse(executorCallbackCall, response);
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, Throwable th) {
                ExecutorCallbackCall.this.callbackExecutor.execute(new a(this, this.val$callback, th, 1));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, Response<T> response) {
                ExecutorCallbackCall.this.callbackExecutor.execute(new a(this, this.val$callback, response, 0));
            }
        }

        public ExecutorCallbackCall(Executor executor, Call<T> call) {
            this.callbackExecutor = executor;
            this.delegate = call;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.Call
        public Call<T> clone() {
            return new ExecutorCallbackCall(this.callbackExecutor, this.delegate.clone());
        }

        @Override // retrofit2.Call
        public void enqueue(Callback<T> callback) {
            Objects.requireNonNull(callback, "callback == null");
            this.delegate.enqueue(new AnonymousClass1(callback));
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
    }

    public DefaultCallAdapterFactory(@Nullable Executor executor) {
        this.callbackExecutor = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            kf2.n("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
            return null;
        }
        final Type parameterUpperBound = Utils.getParameterUpperBound(0, (ParameterizedType) type);
        final Executor executor = Utils.isAnnotationPresent(annotationArr, SkipCallbackExecutor.class) ? null : this.callbackExecutor;
        return new CallAdapter<Object, Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
            @Override // retrofit2.CallAdapter
            public Call<?> adapt(Call<Object> call) {
                Executor executor2 = executor;
                return executor2 == null ? call : new ExecutorCallbackCall(executor2, call);
            }

            @Override // retrofit2.CallAdapter
            public Type responseType() {
                return parameterUpperBound;
            }
        };
    }
}
