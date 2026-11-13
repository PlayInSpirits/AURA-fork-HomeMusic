.class public final Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;
.super Landroidx/credentials/playservices/controllers/CredentialProviderController;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/credentials/playservices/controllers/CredentialProviderController<",
        "Ldefpackage/mf0;",
        "Ldefpackage/r44;",
        "Ldefpackage/j15;",
        "Ldefpackage/lf0;",
        "Landroidx/credentials/exceptions/CreateCredentialException;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$Companion;

.field private static final TAG:Ljava/lang/String; = "CreatePassword"


# instance fields
.field private callback:Ldefpackage/vf0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldefpackage/vf0;"
        }
    .end annotation
.end field

.field private cancellationSignal:Landroid/os/CancellationSignal;

.field private final context:Landroid/content/Context;

.field private executor:Ljava/util/concurrent/Executor;

.field private final resultReceiver:Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$resultReceiver$1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$Companion;-><init>(Ldefpackage/xj0;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->Companion:Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$Companion;

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
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->context:Landroid/content/Context;

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
    new-instance v0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$resultReceiver$1;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$resultReceiver$1;-><init>(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;Landroid/os/Handler;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->resultReceiver:Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$resultReceiver$1;

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

.method public static final synthetic access$getCallback$p(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;)Ldefpackage/vf0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->callback:Ldefpackage/vf0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getCancellationSignal$p(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;)Landroid/os/CancellationSignal;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getExecutor$p(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$maybeReportErrorFromResultReceiver(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;Landroid/os/Bundle;Ldefpackage/wf1;Ljava/util/concurrent/Executor;Ldefpackage/vf0;Landroid/os/CancellationSignal;)Z
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

.method private static synthetic getCallback$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private static synthetic getCancellationSignal$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getInstance(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;
    .locals 1

    .line 1
    sget-object v0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->Companion:Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$Companion;->getInstance(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public synthetic convertRequestToPlayServices(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->convertRequestToPlayServices(Ldefpackage/mf0;)Ldefpackage/r44;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public convertRequestToPlayServices(Ldefpackage/mf0;)Ldefpackage/r44;
    .locals 0

    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public bridge synthetic convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 15
    check-cast p1, Ldefpackage/j15;

    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->convertResponseToCredentialManager(Ldefpackage/j15;)Ldefpackage/lf0;

    move-result-object p0

    return-object p0
.end method

.method public convertResponseToCredentialManager(Ldefpackage/j15;)Ldefpackage/lf0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ldefpackage/nf0;

    .line 5
    .line 6
    new-instance p1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final handleResponse$credentials_play_services_auth_release(II)V
    .locals 2

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
    const-string p2, " which does not match what was given "

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
    const-string p1, "CreatePassword"

    .line 36
    .line 37
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    sget-object p1, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$handleResponse$1;->INSTANCE:Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$handleResponse$1;

    .line 42
    .line 43
    new-instance v0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$handleResponse$2;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$handleResponse$2;-><init>(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 49
    .line 50
    invoke-static {p2, p1, v0, v1}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->maybeReportErrorResultCodeCreate(ILdefpackage/wf1;Ldefpackage/if1;Landroid/os/CancellationSignal;)Z

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
    sget-object p1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->convertResponseToCredentialManager(Ldefpackage/j15;)Ldefpackage/lf0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p2, p0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 64
    .line 65
    new-instance v0, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$handleResponse$3;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$handleResponse$3;-><init>(Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;Ldefpackage/lf0;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p2, v0}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public synthetic invokePlayServices(Ljava/lang/Object;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;->invokePlayServices(Ldefpackage/mf0;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public invokePlayServices(Ldefpackage/mf0;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/mf0;",
            "Ldefpackage/vf0;",
            "Ljava/util/concurrent/Executor;",
            "Landroid/os/CancellationSignal;",
            ")V"
        }
    .end annotation

    const/4 p0, 0x0

    .line 12
    throw p0
.end method
