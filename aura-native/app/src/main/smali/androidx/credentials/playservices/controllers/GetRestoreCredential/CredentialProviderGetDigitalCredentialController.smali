.class public final Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;
.super Landroidx/credentials/playservices/controllers/CredentialProviderController;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/credentials/playservices/controllers/CredentialProviderController<",
        "Ldefpackage/kh1;",
        "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;",
        "Ldefpackage/lh1;",
        "Ldefpackage/mh1;",
        "Landroidx/credentials/exceptions/GetCredentialException;",
        ">;"
    }
.end annotation


# static fields
.field private static final Companion:Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$Companion;

.field private static final TAG:Ljava/lang/String; = "DigitalCredentialClient"


# instance fields
.field public callback:Ldefpackage/vf0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldefpackage/vf0;"
        }
    .end annotation
.end field

.field private cancellationSignal:Landroid/os/CancellationSignal;

.field private final context:Landroid/content/Context;

.field public executor:Ljava/util/concurrent/Executor;

.field private final resultReceiver:Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;


# direct methods
.method public static synthetic $r8$lambda$_IbKyRaIxxXTX1LNwia-hBSJsqc(Ldefpackage/if1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->invokePlayServices$lambda$0(Ldefpackage/if1;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic $r8$lambda$iQQ111WndOqJplgmKt5mtJ5jYgo(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ldefpackage/vf0;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->invokePlayServices$lambda$1(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ldefpackage/vf0;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$Companion;-><init>(Ldefpackage/xj0;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->Companion:Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/credentials/playservices/controllers/CredentialProviderController;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->context:Landroid/content/Context;

    .line 8
    .line 9
    new-instance p1, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;-><init>(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroid/os/Handler;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->resultReceiver:Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic access$cancelOrCallbackExceptionOrResult$s895630660(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getCancellationSignal$p(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;)Landroid/os/CancellationSignal;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getContext$p(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getResultReceiver$p(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;)Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->resultReceiver:Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$maybeReportErrorFromResultReceiver(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroid/os/Bundle;Ldefpackage/wf1;Ljava/util/concurrent/Executor;Ldefpackage/vf0;Landroid/os/CancellationSignal;)Z
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->maybeReportErrorFromResultReceiver(Landroid/os/Bundle;Ldefpackage/wf1;Ljava/util/concurrent/Executor;Ldefpackage/vf0;Landroid/os/CancellationSignal;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final fromGmsException(Ljava/lang/Throwable;)Landroidx/credentials/exceptions/GetCredentialException;
    .locals 2

    .line 1
    instance-of p0, p1, Lcom/google/android/gms/identitycredentials/GetCredentialException;

    .line 2
    .line 3
    if-nez p0, :cond_3

    .line 4
    .line 5
    instance-of p0, p1, Lcom/google/android/gms/common/api/ApiException;

    .line 6
    .line 7
    const-string v0, "Get digital credential failed, failure: "

    .line 8
    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    move-object p0, p1

    .line 12
    check-cast p0, Lcom/google/android/gms/common/api/ApiException;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/google/android/gms/common/api/ApiException;->n:Lcom/google/android/gms/common/api/Status;

    .line 15
    .line 16
    iget p0, p0, Lcom/google/android/gms/common/api/Status;->n:I

    .line 17
    .line 18
    const/16 v1, 0x10

    .line 19
    .line 20
    if-ne p0, v1, :cond_0

    .line 21
    .line 22
    new-instance p0, Landroidx/credentials/exceptions/GetCredentialCancellationException;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Landroidx/credentials/exceptions/GetCredentialCancellationException;-><init>(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object v1, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->getRetryables()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {v1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    new-instance p0, Landroidx/credentials/exceptions/GetCredentialInterruptedException;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p0, p1}, Landroidx/credentials/exceptions/GetCredentialInterruptedException;-><init>(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_1
    new-instance p0, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p0, p1}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_2
    new-instance p0, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    .line 77
    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {p0, p1}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const/4 p1, 0x0

    .line 99
    invoke-static {p0, p1}, Ldefpackage/rr2;->T(Ljava/lang/CharSequence;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method public static synthetic getCallback$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private static synthetic getCancellationSignal$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getExecutor$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private static synthetic getResultReceiver$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private static final invokePlayServices$lambda$0(Ldefpackage/if1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final invokePlayServices$lambda$1(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ldefpackage/vf0;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p4}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->fromGmsException(Ljava/lang/Throwable;)Landroidx/credentials/exceptions/GetCredentialException;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    new-instance p4, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1;

    .line 9
    .line 10
    invoke-direct {p4, p2, p3, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1;-><init>(Ljava/util/concurrent/Executor;Ldefpackage/vf0;Landroidx/credentials/exceptions/GetCredentialException;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p4}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public convertRequestToPlayServices(Ldefpackage/kh1;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/kh1;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ldefpackage/xf0;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 29
    .line 30
    new-instance v0, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI"

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    const-string v1, "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    const-string v1, "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME"

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    .line 51
    .line 52
    new-instance v1, Landroid/os/ResultReceiver;

    .line 53
    .line 54
    invoke-direct {v1, v2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, p0, v0, v2, v1}, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;-><init>(Ljava/util/ArrayList;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 58
    .line 59
    .line 60
    return-object p1
.end method

.method public bridge synthetic convertRequestToPlayServices(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 61
    check-cast p1, Ldefpackage/kh1;

    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->convertRequestToPlayServices(Ldefpackage/kh1;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 20
    check-cast p1, Ldefpackage/lh1;

    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->convertResponseToCredentialManager(Ldefpackage/lh1;)Ldefpackage/mh1;

    move-result-object p0

    return-object p0
.end method

.method public convertResponseToCredentialManager(Ldefpackage/lh1;)Ldefpackage/mh1;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ldefpackage/mh1;

    .line 5
    .line 6
    iget-object p1, p1, Ldefpackage/lh1;->n:Ldefpackage/uf0;

    .line 7
    .line 8
    iget-object p1, p1, Ldefpackage/uf0;->o:Landroid/os/Bundle;

    .line 9
    .line 10
    const-string v0, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL"

    .line 11
    .line 12
    invoke-static {v0, p1}, Ldefpackage/gb;->p(Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/b3;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {p0, p1}, Ldefpackage/mh1;-><init>(Ldefpackage/b3;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public final getCallback()Ldefpackage/vf0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldefpackage/vf0;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->callback:Ldefpackage/vf0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "callback"

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final getExecutor()Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "executor"

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final handleResponse$credentials_play_services_auth_release(IILandroid/content/Intent;)V
    .locals 4

    .line 1
    sget-object v0, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq p1, v1, :cond_0

    .line 8
    .line 9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string p2, "Returned request code "

    .line 12
    .line 13
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p2, " which  does not match what was given "

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "DigitalCredentialClient"

    .line 36
    .line 37
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    sget-object p1, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$1;->INSTANCE:Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$1;

    .line 42
    .line 43
    new-instance v0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$2;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$2;-><init>(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 49
    .line 50
    invoke-static {p2, p1, v0, v1}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->maybeReportErrorResultCodeGet(ILdefpackage/wf1;Ldefpackage/if1;Landroid/os/CancellationSignal;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    if-nez p3, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 60
    .line 61
    new-instance p2, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$3;

    .line 62
    .line 63
    invoke-direct {p2, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$3;-><init>(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 71
    .line 72
    const/4 p2, 0x0

    .line 73
    const/16 v0, 0x22

    .line 74
    .line 75
    if-lt p1, v0, :cond_3

    .line 76
    .line 77
    invoke-static {p3}, Ldefpackage/a3;->b(Landroid/content/Intent;)Ldefpackage/mh1;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const-string v1, "android.service.credentials.extra.GET_CREDENTIAL_RESPONSE"

    .line 83
    .line 84
    invoke-virtual {p3, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    const-string v2, "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE"

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-nez v2, :cond_5

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    const-string v3, "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA"

    .line 101
    .line 102
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-nez v1, :cond_6

    .line 107
    .line 108
    :goto_0
    move-object v1, p2

    .line 109
    goto :goto_1

    .line 110
    :cond_6
    new-instance v3, Ldefpackage/mh1;

    .line 111
    .line 112
    invoke-static {v2, v1}, Ldefpackage/gb;->p(Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/b3;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v3, v1}, Ldefpackage/mh1;-><init>(Ldefpackage/b3;)V

    .line 117
    .line 118
    .line 119
    move-object v1, v3

    .line 120
    :goto_1
    if-eqz v1, :cond_7

    .line 121
    .line 122
    iget-object p1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 123
    .line 124
    new-instance p2, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$4;

    .line 125
    .line 126
    invoke-direct {p2, p0, v1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$4;-><init>(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Ldefpackage/mh1;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p1, p2}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_7
    if-lt p1, v0, :cond_8

    .line 134
    .line 135
    invoke-static {p3}, Ldefpackage/a3;->a(Landroid/content/Intent;)Landroidx/credentials/exceptions/GetCredentialException;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    goto :goto_2

    .line 140
    :cond_8
    sget p1, Landroidx/credentials/exceptions/GetCredentialException;->p:I

    .line 141
    .line 142
    const-string p1, "android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION"

    .line 143
    .line 144
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-nez p1, :cond_9

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_9
    const-string p2, "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE"

    .line 152
    .line 153
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    if-eqz p2, :cond_a

    .line 158
    .line 159
    const-string p3, "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"

    .line 160
    .line 161
    invoke-virtual {p1, p3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p1, p2}, Ldefpackage/rr2;->T(Ljava/lang/CharSequence;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    :goto_2
    iget-object p1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 170
    .line 171
    new-instance p3, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$5;

    .line 172
    .line 173
    invoke-direct {p3, p0, p2}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$handleResponse$5;-><init>(Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;Landroidx/credentials/exceptions/GetCredentialException;)V

    .line 174
    .line 175
    .line 176
    invoke-static {p1, p3}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_a
    const-string p0, "Bundle was missing exception type."

    .line 181
    .line 182
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public bridge synthetic invokePlayServices(Ljava/lang/Object;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
    .locals 0

    .line 116
    check-cast p1, Ldefpackage/kh1;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->invokePlayServices(Ldefpackage/kh1;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V

    return-void
.end method

.method public invokePlayServices(Ldefpackage/kh1;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/kh1;",
            "Ldefpackage/vf0;",
            "Ljava/util/concurrent/Executor;",
            "Landroid/os/CancellationSignal;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p4, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->setCallback(Ldefpackage/vf0;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p3}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->setExecutor(Ljava/util/concurrent/Executor;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;

    .line 19
    .line 20
    invoke-virtual {v0, p4}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;->cancellationReviewer$credentials_play_services_auth_release(Landroid/os/CancellationSignal;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->convertRequestToPlayServices(Ldefpackage/kh1;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->context:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, Ldefpackage/r61;

    .line 37
    .line 38
    sget-object v5, Ldefpackage/cj1;->c:Ldefpackage/cj1;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    sget-object v3, Ldefpackage/v02;->a:Ldefpackage/rf2;

    .line 42
    .line 43
    sget-object v4, Ldefpackage/le;->a:Ldefpackage/ke;

    .line 44
    .line 45
    invoke-direct/range {v0 .. v5}, Ldefpackage/dj1;-><init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Ldefpackage/rf2;Ldefpackage/le;Ldefpackage/cj1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Ldefpackage/bk;->b()Ldefpackage/bk;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v2, Ldefpackage/kb4;->c:Ldefpackage/p61;

    .line 56
    .line 57
    filled-new-array {v2}, [Ldefpackage/p61;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput-object v2, v1, Ldefpackage/bk;->r:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v2, Ldefpackage/si1;

    .line 64
    .line 65
    const/4 v3, 0x2

    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-direct {v2, v3, v4}, Ldefpackage/si1;-><init>(IZ)V

    .line 68
    .line 69
    .line 70
    iput-object p1, v2, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v2, v1, Ldefpackage/bk;->q:Ljava/lang/Object;

    .line 73
    .line 74
    const/16 p1, 0x7fbd

    .line 75
    .line 76
    iput p1, v1, Ldefpackage/bk;->o:I

    .line 77
    .line 78
    invoke-virtual {v1}, Ldefpackage/bk;->a()Ldefpackage/bk;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v0, v4, p1}, Ldefpackage/dj1;->b(ILdefpackage/bk;)Ldefpackage/jw;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$invokePlayServices$1;

    .line 90
    .line 91
    invoke-direct {v0, p4, p0}, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$invokePlayServices$1;-><init>(Landroid/os/CancellationSignal;Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;)V

    .line 92
    .line 93
    .line 94
    new-instance v1, Ldefpackage/cg0;

    .line 95
    .line 96
    invoke-direct {v1, v0, v4}, Ldefpackage/cg0;-><init>(Ldefpackage/if1;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v1}, Ldefpackage/jw;->k(Ldefpackage/cg0;)V

    .line 100
    .line 101
    .line 102
    new-instance v5, Ldefpackage/dg0;

    .line 103
    .line 104
    const/4 v10, 0x0

    .line 105
    move-object v6, p0

    .line 106
    move-object v9, p2

    .line 107
    move-object v8, p3

    .line 108
    move-object v7, p4

    .line 109
    invoke-direct/range {v5 .. v10}, Ldefpackage/dg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v5}, Ldefpackage/jw;->d(Ldefpackage/e93;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final setCallback(Ldefpackage/vf0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/vf0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->callback:Ldefpackage/vf0;

    .line 5
    .line 6
    return-void
.end method

.method public final setExecutor(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;->executor:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    return-void
.end method
