package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.common.api.ApiException;
import defpackage.ej1;
import defpackage.gf1;
import defpackage.if1;
import defpackage.j15;
import defpackage.jx3;
import defpackage.ka0;
import defpackage.kf0;
import defpackage.kh1;
import defpackage.n30;
import defpackage.q42;
import defpackage.uh1;
import defpackage.vf0;
import defpackage.wo0;
import defpackage.xf0;
import defpackage.xj0;
import defpackage.yf0;
import defpackage.yp3;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements yf0 {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private ej1 googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = ej1.c;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int i) {
        return this.googleApiAvailability.b(context, i);
    }

    private static final void onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        jx3 jx3Var = new jx3();
        jx3Var.n = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).n.n == 40201) {
            jx3Var.n = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$3$1(executor, vf0Var, jx3Var));
    }

    private static final void onClearCredential$lambda$4(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var, Exception exc) {
        exc.getClass();
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$5$1$1(exc, executor, vf0Var));
    }

    public final ej1 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int i) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i);
        boolean z = iIsGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ka0(iIsGooglePlayServicesAvailable));
        }
        return z;
    }

    public void onClearCredential(n30 n30Var, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
        throw null;
    }

    public void onCreateCredential(Context context, kf0 kf0Var, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
        context.getClass();
        throw null;
    }

    @Override // defpackage.yf0
    public void onGetCredential(Context context, kh1 kh1Var, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
        context.getClass();
        kh1Var.getClass();
        executor.getClass();
        vf0Var.getClass();
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth_release(kh1Var)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(kh1Var, vf0Var, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new C00031(executor, vf0Var));
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth_release(kh1Var)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(kh1Var, vf0Var, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AnonymousClass3(executor, vf0Var));
                return;
            }
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(kh1Var)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(kh1Var, vf0Var, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(kh1Var, vf0Var, executor, cancellationSignal);
        }
    }

    public void onPrepareCredential(kh1 kh1Var, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
        kh1Var.getClass();
        executor.getClass();
        vf0Var.getClass();
    }

    public final void setGoogleApiAvailability(ej1 ej1Var) {
        ej1Var.getClass();
        this.googleApiAvailability = ej1Var;
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, gf1 gf1Var) {
            gf1Var.getClass();
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            gf1Var.invoke();
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth_release(kh1 kh1Var) {
            kh1Var.getClass();
            for (xf0 xf0Var : kh1Var.a) {
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth_release(kh1 kh1Var) {
            kh1Var.getClass();
            for (xf0 xf0Var : kh1Var.a) {
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(kh1 kh1Var) {
            kh1Var.getClass();
            Iterator it = kh1Var.a.iterator();
            while (it.hasNext()) {
                if (((xf0) it.next()) instanceof uh1) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass1 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Executor executor, vf0 vf0Var) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var) {
            ((wo0) vf0Var).F(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            this.$executor.execute(new a(this.$callback, 0));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return j15.a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onCreateCredential$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class C00021 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00021(Executor executor, vf0 vf0Var) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var) {
            ((wo0) vf0Var).F(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m9invoke() {
            this.$executor.execute(new a(this.$callback, 3));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m9invoke();
            return j15.a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onGetCredential$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class C00031 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00031(Executor executor, vf0 vf0Var) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var) {
            ((wo0) vf0Var).F(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m11invoke() {
            this.$executor.execute(new a(this.$callback, 4));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m11invoke();
            return j15.a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onGetCredential$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class C00042 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00042(Executor executor, vf0 vf0Var) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var) {
            ((wo0) vf0Var).F(new GetCredentialProviderConfigurationException("this feature requires the minimum API level to be 23"));
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m13invoke() {
            this.$executor.execute(new a(this.$callback, 5));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m13invoke();
            return j15.a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onGetCredential$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass3 extends q42 implements gf1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Executor executor, vf0 vf0Var) {
            super(0);
            this.$executor = executor;
            this.$callback = vf0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(vf0 vf0Var) {
            ((wo0) vf0Var).F(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m14invoke() {
            this.$executor.execute(new a(this.$callback, 6));
        }

        @Override // defpackage.gf1
        public /* bridge */ /* synthetic */ Object invoke() {
            m14invoke();
            return j15.a;
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass2 extends q42 implements if1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ CancellationSignal $cancellationSignal;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.$executor = executor;
            this.$callback = vf0Var;
        }

        public final void invoke(Boolean bool) {
            CredentialProviderPlayServicesImpl.Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback));
        }

        @Override // defpackage.if1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return j15.a;
        }

        /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
        public static final class AnonymousClass1 extends q42 implements gf1 {
            final /* synthetic */ vf0 $callback;
            final /* synthetic */ Executor $executor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Executor executor, vf0 vf0Var) {
                super(0);
                this.$executor = executor;
                this.$callback = vf0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$0(vf0 vf0Var) {
                ((wo0) vf0Var).G(null);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3invoke() {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "Cleared restore credential successfully!");
                this.$executor.execute(new a(this.$callback, 1));
            }

            @Override // defpackage.gf1
            public /* bridge */ /* synthetic */ Object invoke() {
                m3invoke();
                return j15.a;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class AnonymousClass4 extends q42 implements if1 {
        final /* synthetic */ vf0 $callback;
        final /* synthetic */ CancellationSignal $cancellationSignal;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.$executor = executor;
            this.$callback = vf0Var;
        }

        public final void invoke(Void r4) {
            CredentialProviderPlayServicesImpl.Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback));
        }

        @Override // defpackage.if1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Void) obj);
            return j15.a;
        }

        /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
        public static final class AnonymousClass1 extends q42 implements gf1 {
            final /* synthetic */ vf0 $callback;
            final /* synthetic */ Executor $executor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Executor executor, vf0 vf0Var) {
                super(0);
                this.$executor = executor;
                this.$callback = vf0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$0(vf0 vf0Var) {
                ((wo0) vf0Var).G(null);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m6invoke() {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "During clear credential, signed out successfully!");
                this.$executor.execute(new a(this.$callback, 2));
            }

            @Override // defpackage.gf1
            public /* bridge */ /* synthetic */ Object invoke() {
                m6invoke();
                return j15.a;
            }
        }
    }

    @Override // defpackage.yf0
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(Context context, yp3 yp3Var, CancellationSignal cancellationSignal, Executor executor, vf0 vf0Var) {
        context.getClass();
        throw null;
    }
}
