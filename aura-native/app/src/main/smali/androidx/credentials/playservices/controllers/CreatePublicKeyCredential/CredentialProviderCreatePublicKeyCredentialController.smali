.class public final Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;
.super Landroidx/credentials/playservices/controllers/CredentialProviderController;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/credentials/playservices/controllers/CredentialProviderController<",
        "Ldefpackage/of0;",
        "Ldefpackage/xr3;",
        "Ldefpackage/vr3;",
        "Ldefpackage/lf0;",
        "Landroidx/credentials/exceptions/CreateCredentialException;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;

.field private static final TAG:Ljava/lang/String; = "CreatePublicKey"


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

.field private final resultReceiver:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;


# direct methods
.method public static synthetic $r8$lambda$5hlDM94MjJzc7w2nd16ozsS7vqI(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->handleResponse$lambda$0(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;-><init>(Ldefpackage/xj0;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->Companion:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;

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
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->context:Landroid/content/Context;

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
    new-instance v0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;-><init>(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Landroid/os/Handler;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->resultReceiver:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;

    .line 24
    .line 25
    return-void
.end method

.method private final JSONExceptionToPKCError(Lorg/json/JSONException;)Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x4

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    .line 15
    .line 16
    new-instance v1, Ldefpackage/h;

    .line 17
    .line 18
    invoke-direct {v1, p1}, Ldefpackage/h;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, p0}, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;-><init>(Ldefpackage/h;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance p0, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    .line 26
    .line 27
    new-instance v0, Ldefpackage/h;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Ldefpackage/h;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-string p1, "Unknown error"

    .line 33
    .line 34
    invoke-direct {p0, v0, p1}, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;-><init>(Ldefpackage/h;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method

.method public static final synthetic access$JSONExceptionToPKCError(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Lorg/json/JSONException;)Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->JSONExceptionToPKCError(Lorg/json/JSONException;)Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final synthetic access$getCallback$p(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;)Ldefpackage/vf0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->callback:Ldefpackage/vf0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getCancellationSignal$p(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;)Landroid/os/CancellationSignal;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getExecutor$p(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$maybeReportErrorFromResultReceiver(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Landroid/os/Bundle;Ldefpackage/wf1;Ljava/util/concurrent/Executor;Ldefpackage/vf0;Landroid/os/CancellationSignal;)Z
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

.method private static synthetic getExecutor$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getInstance(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;
    .locals 1

    .line 1
    sget-object v0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->Companion:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;->getInstance(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static final handleResponse$lambda$0(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->callback:Ldefpackage/vf0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    .line 6
    .line 7
    new-instance v1, Ldefpackage/h;

    .line 8
    .line 9
    const/16 v2, 0x1a

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ldefpackage/h;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-string v2, "Upon handling create public key credential response, fido module giving null bytes indicating internal error"

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;-><init>(Ldefpackage/h;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p0, Ldefpackage/wo0;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ldefpackage/wo0;->F(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "callback"

    .line 26
    .line 27
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    throw p0
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
    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->convertRequestToPlayServices(Ldefpackage/of0;)Ldefpackage/xr3;

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

.method public convertRequestToPlayServices(Ldefpackage/of0;)Ldefpackage/xr3;
    .locals 0

    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public bridge synthetic convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 232
    check-cast p1, Ldefpackage/vr3;

    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->convertResponseToCredentialManager(Ldefpackage/vr3;)Ldefpackage/lf0;

    move-result-object p0

    return-object p0
.end method

.method public convertResponseToCredentialManager(Ldefpackage/vr3;)Ldefpackage/lf0;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance p0, Ldefpackage/nf0;

    .line 5
    .line 6
    const-string v0, "clientExtensionResults"

    .line 7
    .line 8
    iget-object v1, p1, Ldefpackage/vr3;->s:Ldefpackage/ln;

    .line 9
    .line 10
    iget-object v2, p1, Ldefpackage/vr3;->p:Ldefpackage/rj5;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 15
    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ldefpackage/rj5;->j()[B

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    array-length v4, v4

    .line 24
    if-lez v4, :cond_0

    .line 25
    .line 26
    const-string v4, "rawId"

    .line 27
    .line 28
    invoke-virtual {v2}, Ldefpackage/rj5;->j()[B

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Ldefpackage/ya4;->n([B)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v2, p1, Ldefpackage/vr3;->u:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    const-string v4, "authenticatorAttachment"

    .line 44
    .line 45
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object v2, p1, Ldefpackage/vr3;->o:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    const-string v4, "type"

    .line 55
    .line 56
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v2, p1, Ldefpackage/vr3;->n:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    const-string v4, "id"

    .line 64
    .line 65
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    :cond_3
    const-string v2, "response"

    .line 69
    .line 70
    iget-object v4, p1, Ldefpackage/vr3;->r:Ldefpackage/jn;

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    invoke-virtual {v4}, Ldefpackage/jn;->b()Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    iget-object v4, p1, Ldefpackage/vr3;->q:Ldefpackage/kn;

    .line 81
    .line 82
    if-eqz v4, :cond_5

    .line 83
    .line 84
    invoke-virtual {v4}, Ldefpackage/kn;->b()Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    goto :goto_0

    .line 89
    :cond_5
    const/4 v5, 0x0

    .line 90
    if-eqz v1, :cond_7

    .line 91
    .line 92
    :try_start_2
    new-instance v2, Lorg/json/JSONObject;

    .line 93
    .line 94
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v4, "code"

    .line 98
    .line 99
    iget-object v6, v1, Ldefpackage/ln;->n:Ldefpackage/c21;

    .line 100
    .line 101
    iget v6, v6, Ldefpackage/c21;->n:I

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    iget-object v1, v1, Ldefpackage/ln;->o:Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    const-string v4, "message"

    .line 111
    .line 112
    invoke-virtual {v2, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 113
    .line 114
    .line 115
    :cond_6
    :try_start_3
    const-string v1, "error"

    .line 116
    .line 117
    move-object v7, v2

    .line 118
    move-object v2, v1

    .line 119
    move-object v1, v7

    .line 120
    goto :goto_0

    .line 121
    :catch_0
    move-exception p0

    .line 122
    new-instance p1, Ljava/lang/RuntimeException;

    .line 123
    .line 124
    const-string v0, "Error encoding AuthenticatorErrorResponse to JSON object"

    .line 125
    .line 126
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_7
    const/4 v1, 0x0

    .line 131
    :goto_0
    if-eqz v1, :cond_8

    .line 132
    .line 133
    invoke-virtual {v3, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    .line 135
    .line 136
    :cond_8
    iget-object p1, p1, Ldefpackage/vr3;->t:Ldefpackage/hn;

    .line 137
    .line 138
    if-eqz p1, :cond_9

    .line 139
    .line 140
    invoke-virtual {p1}, Ldefpackage/hn;->b()Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_9
    if-eqz v5, :cond_a

    .line 149
    .line 150
    new-instance p1, Lorg/json/JSONObject;

    .line 151
    .line 152
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 156
    .line 157
    .line 158
    :cond_a
    :goto_1
    :try_start_4
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v0, Landroid/os/Bundle;

    .line 166
    .line 167
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v1, "androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"

    .line 171
    .line 172
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 182
    if-eqz v0, :cond_b

    .line 183
    .line 184
    :try_start_5
    new-instance v0, Lorg/json/JSONObject;

    .line 185
    .line 186
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 187
    .line 188
    .line 189
    return-object p0

    .line 190
    :catch_1
    :cond_b
    :try_start_6
    const-string p0, "registrationResponseJson must not be empty, and must be a valid JSON"

    .line 191
    .line 192
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 193
    .line 194
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :catch_2
    move-exception p0

    .line 199
    new-instance p1, Ljava/lang/RuntimeException;

    .line 200
    .line 201
    const-string v0, "Error encoding PublicKeyCredential to JSON object"

    .line 202
    .line 203
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 207
    :catchall_0
    move-exception p0

    .line 208
    new-instance p1, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    .line 209
    .line 210
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    const-string v1, "The PublicKeyCredential response json had an unexpected exception when parsing: "

    .line 217
    .line 218
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-direct {p1, p0}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw p1
.end method

.method public final handleResponse$credentials_play_services_auth_release(IILandroid/content/Intent;)V
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
    const-string p2, " does not match what was given "

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
    const-string p1, "CreatePublicKey"

    .line 36
    .line 37
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    sget-object p1, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$1;->INSTANCE:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$1;

    .line 42
    .line 43
    new-instance v0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$2;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$2;-><init>(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

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
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_1
    const/4 p1, 0x0

    .line 59
    if-eqz p3, :cond_2

    .line 60
    .line 61
    const-string p2, "FIDO2_CREDENTIAL_EXTRA"

    .line 62
    .line 63
    invoke-virtual {p3, p2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move-object p2, p1

    .line 69
    :goto_0
    if-nez p2, :cond_5

    .line 70
    .line 71
    sget-object p2, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;

    .line 72
    .line 73
    iget-object p3, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 74
    .line 75
    invoke-virtual {p2, p3}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;->cancellationReviewer$credentials_play_services_auth_release(Landroid/os/CancellationSignal;)Z

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_3

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    iget-object p2, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->executor:Ljava/util/concurrent/Executor;

    .line 83
    .line 84
    if-eqz p2, :cond_4

    .line 85
    .line 86
    new-instance p1, Ldefpackage/a0;

    .line 87
    .line 88
    const/16 p3, 0xf

    .line 89
    .line 90
    invoke-direct {p1, p3, p0}, Ldefpackage/a0;-><init>(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    const-string p0, "executor"

    .line 98
    .line 99
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_5
    sget-object p1, Ldefpackage/vr3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 104
    .line 105
    invoke-static {p2, p1}, Ldefpackage/su3;->o([BLandroid/os/Parcelable$Creator;)Ldefpackage/k44;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Ldefpackage/vr3;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    sget-object p2, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;->Companion:Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;

    .line 115
    .line 116
    invoke-virtual {p2, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;->publicKeyCredentialResponseContainsError(Ldefpackage/vr3;)Landroidx/credentials/exceptions/CreateCredentialException;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-eqz p2, :cond_6

    .line 121
    .line 122
    iget-object p1, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 123
    .line 124
    new-instance p3, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$4;

    .line 125
    .line 126
    invoke-direct {p3, p0, p2}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$4;-><init>(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Landroidx/credentials/exceptions/CreateCredentialException;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p1, p3}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_6
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->convertResponseToCredentialManager(Ldefpackage/vr3;)Ldefpackage/lf0;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iget-object p2, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 138
    .line 139
    new-instance p3, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$5;

    .line 140
    .line 141
    invoke-direct {p3, p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$5;-><init>(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Ldefpackage/lf0;)V

    .line 142
    .line 143
    .line 144
    invoke-static {p2, p3}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :catchall_0
    move-exception p1

    .line 149
    goto :goto_1

    .line 150
    :catch_0
    move-exception p1

    .line 151
    goto :goto_2

    .line 152
    :goto_1
    iget-object p2, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 153
    .line 154
    new-instance p3, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$7;

    .line 155
    .line 156
    invoke-direct {p3, p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$7;-><init>(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p2, p3}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :goto_2
    iget-object p2, p0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 164
    .line 165
    new-instance p3, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$6;

    .line 166
    .line 167
    invoke-direct {p3, p0, p1}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$handleResponse$6;-><init>(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;Lorg/json/JSONException;)V

    .line 168
    .line 169
    .line 170
    invoke-static {p2, p3}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 171
    .line 172
    .line 173
    :goto_3
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
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->invokePlayServices(Ldefpackage/of0;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V

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

.method public invokePlayServices(Ldefpackage/of0;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/of0;",
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
