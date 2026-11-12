.class public Landroidx/credentials/playservices/HiddenActivity;
.super Landroid/app/Activity;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/credentials/playservices/HiddenActivity$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/credentials/playservices/HiddenActivity$Companion;

.field private static final DEFAULT_VALUE:I = 0x1

.field private static final KEY_AWAITING_RESULT:Ljava/lang/String; = "androidx.credentials.playservices.AWAITING_RESULT"

.field private static final TAG:Ljava/lang/String; = "HiddenActivity"


# instance fields
.field private mWaitingForActivityResult:Z

.field private resultReceiver:Landroid/os/ResultReceiver;


# direct methods
.method public static synthetic $r8$lambda$6h-9SR8cK3MImADhkyfzalXd_1Y(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/HiddenActivity;->handleBeginSignIn$lambda$10$lambda$9(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic $r8$lambda$8029HvfIkyuQLdhX5BYT4HccZOc(Lif1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/HiddenActivity;->handleCreatePassword$lambda$14$lambda$12(Lif1;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic $r8$lambda$VEpGZ-lRc13jsiB-O5ww6UDWZp4(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/HiddenActivity;->handleGetSignInIntent$lambda$6$lambda$5(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic $r8$lambda$XnByCOhdw6M3NUVrPdK9IYFdcaQ(Lif1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/HiddenActivity;->handleGetSignInIntent$lambda$6$lambda$4(Lif1;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic $r8$lambda$bAsCQGcUULbIQqCqmx80zDQYFhE(Lif1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/HiddenActivity;->handleCreatePublicKeyCredential$lambda$2$lambda$0(Lif1;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic $r8$lambda$piSmIePRzcbBAl0LmfpYTsqgRKc(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/HiddenActivity;->handleCreatePublicKeyCredential$lambda$2$lambda$1(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic $r8$lambda$qMAU_l0G9_KRn-fItO3T9FPPDo4(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/HiddenActivity;->handleCreatePassword$lambda$14$lambda$13(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic $r8$lambda$xk6z1pBgwfylIivjcQlijI8e3RM(Lif1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/credentials/playservices/HiddenActivity;->handleBeginSignIn$lambda$10$lambda$8(Lif1;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/credentials/playservices/HiddenActivity$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/credentials/playservices/HiddenActivity$Companion;-><init>(Lxj0;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/credentials/playservices/HiddenActivity;->Companion:Landroidx/credentials/playservices/HiddenActivity$Companion;

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

.method public static final synthetic access$getResultReceiver$p(Landroidx/credentials/playservices/HiddenActivity;)Landroid/os/ResultReceiver;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/credentials/playservices/HiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setMWaitingForActivityResult$p(Landroidx/credentials/playservices/HiddenActivity;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/credentials/playservices/HiddenActivity;->mWaitingForActivityResult:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setupFailure(Landroidx/credentials/playservices/HiddenActivity;Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/credentials/playservices/HiddenActivity;->setupFailure(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final handleBeginSignIn()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "REQUEST_TYPE"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcs;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "ACTIVITY_REQUEST_CODE"

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    new-instance v3, Lkg5;

    .line 29
    .line 30
    new-instance v4, Ldh5;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v0, v4}, Lkg5;-><init>(Landroidx/credentials/playservices/HiddenActivity;Ldh5;)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Lyr;

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v12, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x1

    .line 46
    const/4 v10, 0x0

    .line 47
    invoke-direct/range {v5 .. v12}, Lyr;-><init>(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Z)V

    .line 48
    .line 49
    .line 50
    iget-object v15, v1, Lcs;->o:Lyr;

    .line 51
    .line 52
    invoke-static {v15}, Lji2;->m(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v14, v1, Lcs;->n:Lbs;

    .line 56
    .line 57
    invoke-static {v14}, Lji2;->m(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v4, v1, Lcs;->s:Las;

    .line 61
    .line 62
    invoke-static {v4}, Lji2;->m(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v5, v1, Lcs;->t:Lzr;

    .line 66
    .line 67
    invoke-static {v5}, Lji2;->m(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-boolean v6, v1, Lcs;->q:Z

    .line 71
    .line 72
    iget v7, v1, Lcs;->r:I

    .line 73
    .line 74
    iget-boolean v1, v1, Lcs;->u:Z

    .line 75
    .line 76
    new-instance v13, Lcs;

    .line 77
    .line 78
    iget-object v8, v3, Lkg5;->k:Ljava/lang/String;

    .line 79
    .line 80
    move/from16 v21, v1

    .line 81
    .line 82
    move-object/from16 v19, v4

    .line 83
    .line 84
    move-object/from16 v20, v5

    .line 85
    .line 86
    move/from16 v17, v6

    .line 87
    .line 88
    move/from16 v18, v7

    .line 89
    .line 90
    move-object/from16 v16, v8

    .line 91
    .line 92
    invoke-direct/range {v13 .. v21}, Lcs;-><init>(Lbs;Lyr;Ljava/lang/String;ZILas;Lzr;Z)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lbk;->b()Lbk;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v4, Lp61;

    .line 100
    .line 101
    const-string v5, "auth_api_credentials_begin_sign_in"

    .line 102
    .line 103
    const-wide/16 v6, 0x8

    .line 104
    .line 105
    invoke-direct {v4, v5, v6, v7}, Lp61;-><init>(Ljava/lang/String;J)V

    .line 106
    .line 107
    .line 108
    filled-new-array {v4}, [Lp61;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    iput-object v4, v1, Lbk;->r:Ljava/lang/Object;

    .line 113
    .line 114
    new-instance v4, Loz4;

    .line 115
    .line 116
    invoke-direct {v4, v3, v13}, Loz4;-><init>(Lkg5;Lcs;)V

    .line 117
    .line 118
    .line 119
    iput-object v4, v1, Lbk;->q:Ljava/lang/Object;

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    iput-boolean v4, v1, Lbk;->p:Z

    .line 123
    .line 124
    const/16 v5, 0x611

    .line 125
    .line 126
    iput v5, v1, Lbk;->o:I

    .line 127
    .line 128
    invoke-virtual {v1}, Lbk;->a()Lbk;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v3, v4, v1}, Ldj1;->b(ILbk;)Ljw;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    new-instance v3, Landroidx/credentials/playservices/HiddenActivity$handleBeginSignIn$1$1;

    .line 137
    .line 138
    invoke-direct {v3, v0, v2}, Landroidx/credentials/playservices/HiddenActivity$handleBeginSignIn$1$1;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    .line 139
    .line 140
    .line 141
    new-instance v2, Lcg0;

    .line 142
    .line 143
    const/4 v4, 0x5

    .line 144
    invoke-direct {v2, v3, v4}, Lcg0;-><init>(Lif1;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v2}, Ljw;->k(Lcg0;)V

    .line 148
    .line 149
    .line 150
    new-instance v2, Lam1;

    .line 151
    .line 152
    const/4 v3, 0x3

    .line 153
    invoke-direct {v2, v0, v3}, Lam1;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljw;->d(Le93;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_0
    const/4 v1, 0x0

    .line 161
    :goto_0
    if-nez v1, :cond_1

    .line 162
    .line 163
    const-string v1, "HiddenActivity"

    .line 164
    .line 165
    const-string v2, "During begin sign in, params is null, nothing to launch for begin sign in"

    .line 166
    .line 167
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 171
    .line 172
    .line 173
    :cond_1
    return-void
.end method

.method private static final handleBeginSignIn$lambda$10$lambda$8(Lif1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final handleBeginSignIn$lambda$10$lambda$9(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiException;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->getRetryables()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v1, p1

    .line 15
    check-cast v1, Lcom/google/android/gms/common/api/ApiException;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/google/android/gms/common/api/ApiException;->n:Lcom/google/android/gms/common/api/Status;

    .line 18
    .line 19
    iget v1, v1, Lcom/google/android/gms/common/api/Status;->n:I

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v0, "GET_INTERRUPTED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "GET_NO_CREDENTIALS"

    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, Landroidx/credentials/playservices/HiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, "During begin sign in, failure response from one tap: "

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p0, v1, v0, p1}, Landroidx/credentials/playservices/HiddenActivity;->setupFailure(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private final handleCreatePassword()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "REQUEST_TYPE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lr44;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "ACTIVITY_REQUEST_CODE"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v2, Lkg5;

    .line 27
    .line 28
    new-instance v4, Lxg5;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, p0, v4}, Lkg5;-><init>(Landroidx/credentials/playservices/HiddenActivity;Lxg5;)V

    .line 34
    .line 35
    .line 36
    iget-object v4, v0, Lr44;->n:Lvd4;

    .line 37
    .line 38
    iget v0, v0, Lr44;->p:I

    .line 39
    .line 40
    new-instance v5, Lr44;

    .line 41
    .line 42
    iget-object v6, v2, Lkg5;->k:Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct {v5, v4, v6, v0}, Lr44;-><init>(Lvd4;Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lbk;->b()Lbk;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v4, Lfh0;->j:Lp61;

    .line 52
    .line 53
    filled-new-array {v4}, [Lp61;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iput-object v4, v0, Lbk;->r:Ljava/lang/Object;

    .line 58
    .line 59
    new-instance v4, Lh45;

    .line 60
    .line 61
    const/4 v6, 0x5

    .line 62
    invoke-direct {v4, v2, v5, v6}, Lh45;-><init>(Ldj1;Lh2;I)V

    .line 63
    .line 64
    .line 65
    iput-object v4, v0, Lbk;->q:Ljava/lang/Object;

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    iput-boolean v4, v0, Lbk;->p:Z

    .line 69
    .line 70
    const/16 v5, 0x600

    .line 71
    .line 72
    iput v5, v0, Lbk;->o:I

    .line 73
    .line 74
    invoke-virtual {v0}, Lbk;->a()Lbk;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v2, v4, v0}, Ldj1;->b(ILbk;)Ljw;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v2, Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;

    .line 83
    .line 84
    invoke-direct {v2, p0, v1}, Landroidx/credentials/playservices/HiddenActivity$handleCreatePassword$1$1;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    .line 85
    .line 86
    .line 87
    new-instance v1, Lcg0;

    .line 88
    .line 89
    const/4 v4, 0x3

    .line 90
    invoke-direct {v1, v2, v4}, Lcg0;-><init>(Lif1;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljw;->k(Lcg0;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Lam1;

    .line 97
    .line 98
    invoke-direct {v1, p0, v3}, Lam1;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljw;->d(Le93;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    const/4 v0, 0x0

    .line 106
    :goto_0
    if-nez v0, :cond_1

    .line 107
    .line 108
    const-string v0, "HiddenActivity"

    .line 109
    .line 110
    const-string v1, "During save password, params is null, nothing to launch for create password"

    .line 111
    .line 112
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 116
    .line 117
    .line 118
    :cond_1
    return-void
.end method

.method private static final handleCreatePassword$lambda$14$lambda$12(Lif1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final handleCreatePassword$lambda$14$lambda$13(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiException;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->getRetryables()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v1, p1

    .line 15
    check-cast v1, Lcom/google/android/gms/common/api/ApiException;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/google/android/gms/common/api/ApiException;->n:Lcom/google/android/gms/common/api/Status;

    .line 18
    .line 19
    iget v1, v1, Lcom/google/android/gms/common/api/Status;->n:I

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v0, "CREATE_INTERRUPTED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "CREATE_UNKNOWN"

    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, Landroidx/credentials/playservices/HiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, "During save password, found password failure response from one tap "

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p0, v1, v0, p1}, Landroidx/credentials/playservices/HiddenActivity;->setupFailure(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private final handleCreatePublicKeyCredential()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "REQUEST_TYPE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lxr3;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "ACTIVITY_REQUEST_CODE"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v2, Lr61;

    .line 27
    .line 28
    sget-object v5, Lr61;->k:Lrf2;

    .line 29
    .line 30
    new-instance v3, Lpa;

    .line 31
    .line 32
    const/4 v4, 0x7

    .line 33
    invoke-direct {v3, v4}, Lpa;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const-string v6, "Looper must not be null."

    .line 41
    .line 42
    invoke-static {v4, v6}, Lji2;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v7, Lcj1;

    .line 46
    .line 47
    invoke-direct {v7, v3, v4}, Lcj1;-><init>(Lpa;Landroid/os/Looper;)V

    .line 48
    .line 49
    .line 50
    sget-object v6, Lle;->a:Lke;

    .line 51
    .line 52
    move-object v4, p0

    .line 53
    move-object v3, p0

    .line 54
    invoke-direct/range {v2 .. v7}, Ldj1;-><init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Lrf2;Lle;Lcj1;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lbk;->b()Lbk;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v4, Lh45;

    .line 62
    .line 63
    const/4 v5, 0x6

    .line 64
    invoke-direct {v4, v2, v0, v5}, Lh45;-><init>(Ldj1;Lh2;I)V

    .line 65
    .line 66
    .line 67
    iput-object v4, p0, Lbk;->q:Ljava/lang/Object;

    .line 68
    .line 69
    const/16 v0, 0x151f

    .line 70
    .line 71
    iput v0, p0, Lbk;->o:I

    .line 72
    .line 73
    invoke-virtual {p0}, Lbk;->a()Lbk;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-virtual {v2, v0, p0}, Ldj1;->b(ILbk;)Ljw;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance v2, Landroidx/credentials/playservices/HiddenActivity$handleCreatePublicKeyCredential$1$1;

    .line 83
    .line 84
    invoke-direct {v2, v3, v1}, Landroidx/credentials/playservices/HiddenActivity$handleCreatePublicKeyCredential$1$1;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    .line 85
    .line 86
    .line 87
    new-instance v1, Lcg0;

    .line 88
    .line 89
    const/4 v4, 0x2

    .line 90
    invoke-direct {v1, v2, v4}, Lcg0;-><init>(Lif1;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v1}, Ljw;->k(Lcg0;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Lam1;

    .line 97
    .line 98
    invoke-direct {v1, v3, v0}, Lam1;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v1}, Ljw;->d(Le93;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    move-object v3, p0

    .line 106
    const/4 p0, 0x0

    .line 107
    :goto_0
    if-nez p0, :cond_1

    .line 108
    .line 109
    const-string p0, "HiddenActivity"

    .line 110
    .line 111
    const-string v0, "During create public key credential, request is null, so nothing to launch for public key credentials"

    .line 112
    .line 113
    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    .line 117
    .line 118
    .line 119
    :cond_1
    return-void
.end method

.method private static final handleCreatePublicKeyCredential$lambda$2$lambda$0(Lif1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final handleCreatePublicKeyCredential$lambda$2$lambda$1(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiException;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->getRetryables()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v1, p1

    .line 15
    check-cast v1, Lcom/google/android/gms/common/api/ApiException;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/google/android/gms/common/api/ApiException;->n:Lcom/google/android/gms/common/api/Status;

    .line 18
    .line 19
    iget v1, v1, Lcom/google/android/gms/common/api/Status;->n:I

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v0, "CREATE_INTERRUPTED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "CREATE_UNKNOWN"

    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, Landroidx/credentials/playservices/HiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, "During create public key credential, fido registration failure: "

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p0, v1, v0, p1}, Landroidx/credentials/playservices/HiddenActivity;->setupFailure(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private final handleGetSignInIntent()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "REQUEST_TYPE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lth1;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "ACTIVITY_REQUEST_CODE"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v2, Lkg5;

    .line 27
    .line 28
    new-instance v3, Ldh5;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, p0, v3}, Lkg5;-><init>(Landroidx/credentials/playservices/HiddenActivity;Ldh5;)V

    .line 34
    .line 35
    .line 36
    iget-object v5, v0, Lth1;->n:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v5}, Lji2;->m(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v8, v0, Lth1;->q:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v6, v0, Lth1;->o:Ljava/lang/String;

    .line 44
    .line 45
    iget-boolean v9, v0, Lth1;->r:Z

    .line 46
    .line 47
    iget v10, v0, Lth1;->s:I

    .line 48
    .line 49
    new-instance v4, Lth1;

    .line 50
    .line 51
    iget-object v7, v2, Lkg5;->k:Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct/range {v4 .. v10}, Lth1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lbk;->b()Lbk;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v3, Lfh0;->k:Lp61;

    .line 61
    .line 62
    filled-new-array {v3}, [Lp61;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iput-object v3, v0, Lbk;->r:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance v3, Lc05;

    .line 69
    .line 70
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v4, v3, Lc05;->n:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v3, v0, Lbk;->q:Ljava/lang/Object;

    .line 76
    .line 77
    const/16 v3, 0x613

    .line 78
    .line 79
    iput v3, v0, Lbk;->o:I

    .line 80
    .line 81
    invoke-virtual {v0}, Lbk;->a()Lbk;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-virtual {v2, v3, v0}, Ldj1;->b(ILbk;)Ljw;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v2, Landroidx/credentials/playservices/HiddenActivity$handleGetSignInIntent$1$1;

    .line 91
    .line 92
    invoke-direct {v2, p0, v1}, Landroidx/credentials/playservices/HiddenActivity$handleGetSignInIntent$1$1;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lcg0;

    .line 96
    .line 97
    const/4 v3, 0x4

    .line 98
    invoke-direct {v1, v2, v3}, Lcg0;-><init>(Lif1;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljw;->k(Lcg0;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lam1;

    .line 105
    .line 106
    const/4 v2, 0x2

    .line 107
    invoke-direct {v1, p0, v2}, Lam1;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljw;->d(Le93;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    const/4 v0, 0x0

    .line 115
    :goto_0
    if-nez v0, :cond_1

    .line 116
    .line 117
    const-string v0, "HiddenActivity"

    .line 118
    .line 119
    const-string v1, "During get sign-in intent, params is null, nothing to launch for get sign-in intent"

    .line 120
    .line 121
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 125
    .line 126
    .line 127
    :cond_1
    return-void
.end method

.method private static final handleGetSignInIntent$lambda$6$lambda$4(Lif1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final handleGetSignInIntent$lambda$6$lambda$5(Landroidx/credentials/playservices/HiddenActivity;Ljava/lang/Exception;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiException;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->getRetryables()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v1, p1

    .line 15
    check-cast v1, Lcom/google/android/gms/common/api/ApiException;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/google/android/gms/common/api/ApiException;->n:Lcom/google/android/gms/common/api/Status;

    .line 18
    .line 19
    iget v1, v1, Lcom/google/android/gms/common/api/Status;->n:I

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v0, "GET_INTERRUPTED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "GET_NO_CREDENTIALS"

    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, Landroidx/credentials/playservices/HiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, "During get sign-in intent, failure response from one tap: "

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p0, v1, v0, p1}, Landroidx/credentials/playservices/HiddenActivity;->setupFailure(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
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
    iput-boolean p1, p0, Landroidx/credentials/playservices/HiddenActivity;->mWaitingForActivityResult:Z

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private final setupFailure(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;->Companion:Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroidx/credentials/playservices/controllers/CredentialProviderBaseController$Companion;->reportError$credentials_play_services_auth_release(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 7
    .line 8
    .line 9
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
    iget-object v0, p0, Landroidx/credentials/playservices/HiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

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
    iput-boolean p1, p0, Landroidx/credentials/playservices/HiddenActivity;->mWaitingForActivityResult:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

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
    const-string v1, "TYPE"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "RESULT_RECEIVER"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroid/os/ResultReceiver;

    .line 29
    .line 30
    iput-object v1, p0, Landroidx/credentials/playservices/HiddenActivity;->resultReceiver:Landroid/os/ResultReceiver;

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-direct {p0, p1}, Landroidx/credentials/playservices/HiddenActivity;->restoreState(Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    iget-boolean p1, p0, Landroidx/credentials/playservices/HiddenActivity;->mWaitingForActivityResult:Z

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    if-eqz v0, :cond_6

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    sparse-switch p1, :sswitch_data_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :sswitch_0
    const-string p1, "SIGN_IN_INTENT"

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-direct {p0}, Landroidx/credentials/playservices/HiddenActivity;->handleGetSignInIntent()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :sswitch_1
    const-string p1, "CREATE_PASSWORD"

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    invoke-direct {p0}, Landroidx/credentials/playservices/HiddenActivity;->handleCreatePassword()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :sswitch_2
    const-string p1, "CREATE_PUBLIC_KEY_CREDENTIAL"

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    invoke-direct {p0}, Landroidx/credentials/playservices/HiddenActivity;->handleCreatePublicKeyCredential()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :sswitch_3
    const-string p1, "BEGIN_SIGN_IN"

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_5

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    invoke-direct {p0}, Landroidx/credentials/playservices/HiddenActivity;->handleBeginSignIn()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_6
    :goto_0
    const-string p1, "HiddenActivity"

    .line 108
    .line 109
    const-string v0, "Activity handed an unsupported type"

    .line 110
    .line 111
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    nop

    .line 119
    :sswitch_data_0
    .sparse-switch
        -0x1a4a0ecf -> :sswitch_3
        0xed33ea -> :sswitch_2
        0x4a4e227e -> :sswitch_1
        0x760d02f4 -> :sswitch_0
    .end sparse-switch
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
    iget-boolean v1, p0, Landroidx/credentials/playservices/HiddenActivity;->mWaitingForActivityResult:Z

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
