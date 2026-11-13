.class public final Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController;
.super Landroidx/credentials/playservices/controllers/CredentialProviderController;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/credentials/playservices/controllers/CredentialProviderController<",
        "Ldefpackage/qf0;",
        "Ldefpackage/pf0;",
        "Ldefpackage/rf0;",
        "Ldefpackage/lf0;",
        "Landroidx/credentials/exceptions/CreateCredentialException;",
        ">;"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/credentials/playservices/controllers/CredentialProviderController;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController;->context:Landroid/content/Context;

    .line 8
    .line 9
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

.method private static final invokePlayServices$lambda$0(Ldefpackage/if1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final invokePlayServices$lambda$1(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ldefpackage/vf0;Ljava/lang/Exception;)V
    .locals 5

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/jx3;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Create restore credential failed for unknown reason, failure: "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-direct {v1, v2}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 33
    .line 34
    instance-of v1, p3, Lcom/google/android/gms/common/api/ApiException;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    move-object v1, p3

    .line 39
    check-cast v1, Lcom/google/android/gms/common/api/ApiException;

    .line 40
    .line 41
    iget-object v1, v1, Lcom/google/android/gms/common/api/ApiException;->n:Lcom/google/android/gms/common/api/Status;

    .line 42
    .line 43
    iget v2, v1, Lcom/google/android/gms/common/api/Status;->n:I

    .line 44
    .line 45
    packed-switch v2, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    new-instance v2, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    .line 49
    .line 50
    new-instance v3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v4, "The restore credential service failed with unsupported status code, failure: "

    .line 53
    .line 54
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p3, ", status code: "

    .line 65
    .line 66
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget p3, v1, Lcom/google/android/gms/common/api/Status;->n:I

    .line 70
    .line 71
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    invoke-direct {v2, p3}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v2, v0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_0
    new-instance p3, Landroidx/credentials/exceptions/restorecredential/E2eeUnavailableException;

    .line 85
    .line 86
    const-string v1, "E2ee is not available on the device. Check whether the backup and screen lock are enabled."

    .line 87
    .line 88
    const-string v2, "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION"

    .line 89
    .line 90
    invoke-direct {p3, v1, v2}, Landroidx/credentials/exceptions/CreateCredentialException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iput-object p3, v0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :pswitch_1
    new-instance v1, Landroidx/credentials/exceptions/restorecredential/CreateRestoreCredentialDomException;

    .line 97
    .line 98
    new-instance v2, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v3, "The request did not match the fido spec, failure: "

    .line 101
    .line 102
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    const-string v2, "androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR"

    .line 117
    .line 118
    invoke-direct {v1, p3, v2}, Landroidx/credentials/exceptions/CreateCredentialException;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iput-object v1, v0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :pswitch_2
    new-instance v1, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    .line 125
    .line 126
    new-instance v2, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v3, "The restore credential internal service had a failure, failure: "

    .line 129
    .line 130
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    invoke-direct {v1, p3}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iput-object v1, v0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 148
    .line 149
    :cond_0
    :goto_0
    new-instance p3, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1;

    .line 150
    .line 151
    invoke-direct {p3, p1, p2, v0}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1;-><init>(Ljava/util/concurrent/Executor;Ldefpackage/vf0;Ldefpackage/jx3;)V

    .line 152
    .line 153
    .line 154
    invoke-static {p0, p3}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->cancelOrCallbackExceptionOrResult(Landroid/os/CancellationSignal;Ldefpackage/gf1;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x9d09
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController;->convertRequestToPlayServices(Ldefpackage/qf0;)Ldefpackage/pf0;

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

.method public convertRequestToPlayServices(Ldefpackage/qf0;)Ldefpackage/pf0;
    .locals 0

    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public bridge synthetic convertResponseToCredentialManager(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 49
    check-cast p1, Ldefpackage/rf0;

    invoke-virtual {p0, p1}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController;->convertResponseToCredentialManager(Ldefpackage/rf0;)Ldefpackage/lf0;

    move-result-object p0

    return-object p0
.end method

.method public convertResponseToCredentialManager(Ldefpackage/rf0;)Ldefpackage/lf0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Ldefpackage/rf0;->n:Landroid/os/Bundle;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string p1, "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE"

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    new-instance p1, Ldefpackage/nf0;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :catch_0
    :cond_0
    const-string p0, "registrationResponseJson must not be empty, and must be a valid JSON"

    .line 35
    .line 36
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0

    .line 41
    :cond_1
    new-instance p0, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    .line 42
    .line 43
    const-string p1, "The response bundle did not contain the response data. This should not happen."

    .line 44
    .line 45
    invoke-direct {p0, p1}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public synthetic invokePlayServices(Ljava/lang/Object;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController;->invokePlayServices(Ldefpackage/qf0;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V

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

.method public invokePlayServices(Ldefpackage/qf0;Ldefpackage/vf0;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/qf0;",
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
