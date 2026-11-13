.class public Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;
.super Landroid/app/Activity;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity$Companion;

.field private static final KEY_AWAITING_RESULT:Ljava/lang/String; = "androidx.credentials.playservices.AWAITING_RESULT"


# instance fields
.field private mWaitingForActivityResult:Z

.field private resultReceiver:Landroid/os/ResultReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity$Companion;-><init>(Ldefpackage/xj0;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;->Companion:Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final restoreState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "androidx.credentials.playservices.AWAITING_RESULT"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput-boolean p1, p0, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;->mWaitingForActivityResult:Z

    .line 11
    .line 12
    :cond_0
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v1, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 9
    .line 10
    invoke-virtual {v1, v0, p1, p2, p3}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->reportResult$credentials_play_services_auth_release(Landroid/os/ResultReceiver;IILandroid/content/Intent;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;->mWaitingForActivityResult:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "RESULT_RECEIVER"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/os/ResultReceiver;

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-direct {p0, p1}, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;->restoreState(Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    iget-boolean p1, p0, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;->mWaitingForActivityResult:Z

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v0, "EXTRA_GET_CREDENTIAL_INTENT"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroid/app/PendingIntent;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object p1, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v3, 0x0

    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x0

    .line 64
    move-object v0, p0

    .line 65
    invoke-virtual/range {v0 .. v7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    move-object v0, p0

    .line 70
    iget-object p0, v0, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    sget-object p1, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 75
    .line 76
    const-string v1, "GET_UNKNOWN"

    .line 77
    .line 78
    const-string v2, "Internal error"

    .line 79
    .line 80
    invoke-virtual {p1, p0, v1, v2}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->reportError$credentials_play_services_auth_release(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.credentials.playservices.AWAITING_RESULT"

    .line 5
    .line 6
    iget-boolean v1, p0, Landroidx/credentials/playservices/IdentityCredentialApiHiddenActivity;->mWaitingForActivityResult:Z

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
