.class public final Lbg0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lyf0;


# instance fields
.field public final a:Landroid/credentials/CredentialManager;


# direct methods
.method public constructor <init>(Lnc1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "credential"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lbn;->g(Ljava/lang/Object;)Landroid/credentials/CredentialManager;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lbg0;->a:Landroid/credentials/CredentialManager;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final isAvailableOnDevice()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lbg0;->a:Landroid/credentials/CredentialManager;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final onGetCredential(Landroid/content/Context;Lkh1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lvf0;)V
    .locals 8

    .line 1
    new-instance v0, Lzf0;

    .line 2
    .line 3
    check-cast p5, Lwo0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1, p5}, Lzf0;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lbg0;->a:Landroid/credentials/CredentialManager;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lzf0;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v7, Lag0;

    .line 18
    .line 19
    invoke-direct {v7, p5, p0}, Lag0;-><init>(Lwo0;Lbg0;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lbn;->t()V

    .line 23
    .line 24
    .line 25
    new-instance p0, Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string p5, "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI"

    .line 31
    .line 32
    invoke-virtual {p0, p5, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    const-string p5, "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"

    .line 36
    .line 37
    invoke-virtual {p0, p5, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    const-string p5, "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME"

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, p5, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Lbn;->m(Landroid/os/Bundle;)Landroid/credentials/GetCredentialRequest$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iget-object p2, p2, Lkh1;->a:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result p5

    .line 60
    if-eqz p5, :cond_1

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p5

    .line 66
    check-cast p5, Lxf0;

    .line 67
    .line 68
    invoke-static {}, Lbn;->C()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v0, p5, Lxf0;->a:Landroid/os/Bundle;

    .line 75
    .line 76
    iget-object v1, p5, Lxf0;->b:Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-static {v0, v1}, Lbn;->j(Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/credentials/CredentialOption$Builder;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Lbn;->h(Landroid/credentials/CredentialOption$Builder;)Landroid/credentials/CredentialOption$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object p5, p5, Lxf0;->c:Ljava/util/Set;

    .line 87
    .line 88
    invoke-static {v0, p5}, Lbn;->i(Landroid/credentials/CredentialOption$Builder;Ljava/util/Set;)Landroid/credentials/CredentialOption$Builder;

    .line 89
    .line 90
    .line 91
    move-result-object p5

    .line 92
    invoke-static {p5}, Lbn;->k(Landroid/credentials/CredentialOption$Builder;)Landroid/credentials/CredentialOption;

    .line 93
    .line 94
    .line 95
    move-result-object p5

    .line 96
    invoke-static {p0, p5}, Lbn;->w(Landroid/credentials/GetCredentialRequest$Builder;Landroid/credentials/CredentialOption;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    invoke-static {p0}, Lbn;->n(Landroid/credentials/GetCredentialRequest$Builder;)Landroid/credentials/GetCredentialRequest;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-object v3, p1

    .line 108
    check-cast v3, Lnc1;

    .line 109
    .line 110
    move-object v5, p3

    .line 111
    move-object v6, p4

    .line 112
    invoke-static/range {v2 .. v7}, Lbn;->v(Landroid/credentials/CredentialManager;Lnc1;Landroid/credentials/GetCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method
